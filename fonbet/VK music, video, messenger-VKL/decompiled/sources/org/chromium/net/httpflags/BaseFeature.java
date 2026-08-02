package org.chromium.net.httpflags;

import androidx.annotation.Nullable;
import androidx.credentials.provider.CredentialEntry;
import com.google.protobuf.ByteString;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.chromium.net.httpflags.BaseFeatureOverrides;
import org.chromium.net.httpflags.ResolvedFlags;
import xsna.y57;
import xsna.zr;

/* loaded from: classes11.dex */
public final class BaseFeature {
    public static final String FLAG_PREFIX = "ChromiumBaseFeature_";
    public static final String PARAM_DELIMITER = "_PARAM_";

    /* renamed from: org.chromium.net.httpflags.BaseFeature$1, reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$chromium$net$httpflags$ResolvedFlags$Value$Type;

        static {
            int[] iArr = new int[ResolvedFlags.Value.Type.values().length];
            $SwitchMap$org$chromium$net$httpflags$ResolvedFlags$Value$Type = iArr;
            try {
                iArr[ResolvedFlags.Value.Type.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$chromium$net$httpflags$ResolvedFlags$Value$Type[ResolvedFlags.Value.Type.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$chromium$net$httpflags$ResolvedFlags$Value$Type[ResolvedFlags.Value.Type.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$chromium$net$httpflags$ResolvedFlags$Value$Type[ResolvedFlags.Value.Type.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$chromium$net$httpflags$ResolvedFlags$Value$Type[ResolvedFlags.Value.Type.BYTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes8.dex */
    public static final class ParsedFlagName {
        public String featureName;

        @Nullable
        public String paramName;

        public /* synthetic */ ParsedFlagName(int i) {
            this();
        }

        private ParsedFlagName() {
        }
    }

    private BaseFeature() {
    }

    private static void applyOverride(String str, ResolvedFlags.Value value, Map<String, BaseFeatureOverrides.FeatureState.Builder> map) {
        ParsedFlagName parseFlagName = parseFlagName(str);
        if (parseFlagName == null) {
            return;
        }
        BaseFeatureOverrides.FeatureState.Builder builder = map.get(parseFlagName.featureName);
        if (builder == null) {
            builder = BaseFeatureOverrides.FeatureState.newBuilder();
            map.put(parseFlagName.featureName, builder);
        }
        String str2 = parseFlagName.paramName;
        if (str2 == null) {
            applyStateOverride(value, builder);
        } else {
            applyParamOverride(str2, value, builder);
        }
    }

    private static void applyParamOverride(String str, ResolvedFlags.Value value, BaseFeatureOverrides.FeatureState.Builder builder) {
        ByteString copyFrom;
        ResolvedFlags.Value.Type type = value.getType();
        int i = AnonymousClass1.$SwitchMap$org$chromium$net$httpflags$ResolvedFlags$Value$Type[type.ordinal()];
        if (i == 1) {
            copyFrom = ByteString.copyFrom(value.getBoolValue() ? "true" : CredentialEntry.FALSE_STRING, StandardCharsets.UTF_8);
        } else if (i == 2) {
            copyFrom = ByteString.copyFrom(Long.toString(value.getIntValue(), 10), StandardCharsets.UTF_8);
        } else if (i == 3) {
            copyFrom = ByteString.copyFrom(Float.toString(value.getFloatValue()), StandardCharsets.UTF_8);
        } else if (i == 4) {
            copyFrom = ByteString.copyFrom(value.getStringValue(), StandardCharsets.UTF_8);
        } else {
            if (i != 5) {
                throw new UnsupportedOperationException(y57.a("Unsupported HTTP flag value type for base::Feature param `", str, "`: ", String.valueOf(type)));
            }
            copyFrom = value.getBytesValue();
        }
        builder.putParams(str, copyFrom);
    }

    private static void applyStateOverride(ResolvedFlags.Value value, BaseFeatureOverrides.FeatureState.Builder builder) {
        ResolvedFlags.Value.Type type = value.getType();
        if (type != ResolvedFlags.Value.Type.BOOL) {
            throw new IllegalArgumentException(zr.a("HTTP flag has type ", String.valueOf(type), ", but only boolean flags are supported as base::Feature overrides"));
        }
        builder.setEnabled(value.getBoolValue());
    }

    public static BaseFeatureOverrides getOverrides(ResolvedFlags resolvedFlags) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ResolvedFlags.Value> entry : resolvedFlags.flags().entrySet()) {
            try {
                applyOverride(entry.getKey(), entry.getValue(), hashMap);
            } catch (RuntimeException e) {
                throw new IllegalArgumentException(zr.a("Could not parse HTTP flag `", entry.getKey(), "` as a base::Feature override"), e);
            }
        }
        BaseFeatureOverrides.Builder newBuilder = BaseFeatureOverrides.newBuilder();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            newBuilder.putFeatureStates((String) entry2.getKey(), ((BaseFeatureOverrides.FeatureState.Builder) entry2.getValue()).build());
        }
        return newBuilder.build();
    }

    @Nullable
    private static ParsedFlagName parseFlagName(String str) {
        if (!str.startsWith(FLAG_PREFIX)) {
            return null;
        }
        String substring = str.substring(20);
        ParsedFlagName parsedFlagName = new ParsedFlagName(0);
        int indexOf = substring.indexOf(PARAM_DELIMITER);
        if (indexOf < 0) {
            parsedFlagName.featureName = substring;
            return parsedFlagName;
        }
        parsedFlagName.featureName = substring.substring(0, indexOf);
        parsedFlagName.paramName = substring.substring(indexOf + 7);
        return parsedFlagName;
    }
}
