package com.yandex.div.core.expression.storedvalues;

import android.net.Uri;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.StoredValue;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.util.ConvertUtilsKt;
import xsna.air;
import xsna.arm0;
import xsna.drm0;
import xsna.epx;
import xsna.t33;
import xsna.zr;

/* compiled from: StoredValuesActionHandler.kt */
/* loaded from: classes7.dex */
public final class StoredValuesActionHandler {
    public static final StoredValuesActionHandler INSTANCE = new StoredValuesActionHandler();

    /* compiled from: StoredValuesActionHandler.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoredValue.Type.values().length];
            try {
                iArr[StoredValue.Type.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoredValue.Type.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoredValue.Type.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoredValue.Type.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StoredValue.Type.COLOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StoredValue.Type.URL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private StoredValuesActionHandler() {
    }

    public static final boolean canHandle(String str) {
        return epx.f(str, "set_stored_value");
    }

    private final StoredValue createStoredValue(StoredValue.Type type, String str, String str2) throws StoredValueDeclarationException {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return new StoredValue.StringStoredValue(str, str2);
            case 2:
                return new StoredValue.IntegerStoredValue(str, parseAsLong(str2));
            case 3:
                return new StoredValue.BooleanStoredValue(str, parseAsBoolean(str2));
            case 4:
                return new StoredValue.DoubleStoredValue(str, parseAsDouble(str2));
            case 5:
                return new StoredValue.ColorStoredValue(str, m119parseAsColorC4zCDoM(str2), null);
            case 6:
                return new StoredValue.UrlStoredValue(str, m120parseAsUrlVcSV9u8(str2), null);
            default:
                throw new StoredValueDeclarationException("Cannot create stored value of type = '" + type + "'.", null, 2, null);
        }
    }

    private final String getParam(Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            return queryParameter;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("The required parameter " + str + " is missing");
        }
        return null;
    }

    public static final boolean handleAction(Uri uri, DivViewFacade divViewFacade) {
        String param;
        String param2;
        Long n;
        StoredValue.Type fromString;
        Div2View div2View = divViewFacade instanceof Div2View ? (Div2View) divViewFacade : null;
        if (div2View == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Handler view is not instance of Div2View");
            }
            return false;
        }
        StoredValuesActionHandler storedValuesActionHandler = INSTANCE;
        String param3 = storedValuesActionHandler.getParam(uri, "name");
        if (param3 != null && (param = storedValuesActionHandler.getParam(uri, "value")) != null && (param2 = storedValuesActionHandler.getParam(uri, "lifetime")) != null && (n = arm0.n(param2)) != null) {
            long longValue = n.longValue();
            String param4 = storedValuesActionHandler.getParam(uri, "type");
            if (param4 != null && (fromString = StoredValue.Type.Converter.fromString(param4)) != null) {
                try {
                    return storedValuesActionHandler.executeAction(storedValuesActionHandler.createStoredValue(fromString, param3, param), longValue, div2View);
                } catch (StoredValueDeclarationException e) {
                    KAssert kAssert2 = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        StringBuilder a = t33.a("Stored value '", param3, "' declaration failed: ");
                        a.append(e.getMessage());
                        Assert.fail(a.toString());
                    }
                }
            }
        }
        return false;
    }

    private final boolean parseAsBoolean(String str) throws StoredValueDeclarationException {
        Boolean o0 = drm0.o0(str);
        if (o0 != null) {
            return o0.booleanValue();
        }
        Boolean bool = ConvertUtilsKt.toBoolean(parseAsInt(str));
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new StoredValueDeclarationException(zr.a("Unable to convert ", str, " to boolean"), null, 2, null);
    }

    /* renamed from: parseAsColor-C4zCDoM, reason: not valid java name */
    private final int m119parseAsColorC4zCDoM(String str) throws StoredValueDeclarationException {
        Integer invoke = ParsingConvertersKt.STRING_TO_COLOR_INT.invoke(str);
        if (invoke != null) {
            return Color.m185constructorimpl(invoke.intValue());
        }
        throw new StoredValueDeclarationException(air.b('\'', "Wrong value format for color stored value: '", str), null, 2, null);
    }

    private final double parseAsDouble(String str) throws StoredValueDeclarationException {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            throw new StoredValueDeclarationException(null, e, 1, null);
        }
    }

    private final int parseAsInt(String str) throws StoredValueDeclarationException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new StoredValueDeclarationException(null, e, 1, null);
        }
    }

    private final long parseAsLong(String str) throws StoredValueDeclarationException {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            throw new StoredValueDeclarationException(null, e, 1, null);
        }
    }

    /* renamed from: parseAsUrl-VcSV9u8, reason: not valid java name */
    private final String m120parseAsUrlVcSV9u8(String str) throws StoredValueDeclarationException {
        try {
            return Url.Companion.m202fromVcSV9u8(str);
        } catch (IllegalArgumentException e) {
            throw new StoredValueDeclarationException(null, e, 1, null);
        }
    }

    public final boolean executeAction(StoredValue storedValue, long j, Div2View div2View) {
        return div2View.getDiv2Component$div_release().getStoredValuesController().setStoredValue(storedValue, j, div2View.getViewComponent$div_release().getErrorCollectors().getOrCreate(div2View.getDivTag(), div2View.getDivData()));
    }
}
