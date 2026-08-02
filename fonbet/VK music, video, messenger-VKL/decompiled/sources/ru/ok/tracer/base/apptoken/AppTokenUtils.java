package ru.ok.tracer.base.apptoken;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import ru.ok.tracer.Tracer;
import ru.ok.tracer.base.manifest.TracerManifestUtils;
import ru.ok.tracer.manifest.TracerManifest;

/* compiled from: AppTokenUtils.kt */
/* loaded from: classes11.dex */
public final class AppTokenUtils {
    private static final String NO_APP_TOKEN = "0000000000000000000000000000000000000000000";
    private static final String RESOURCE_NAME_APP_TOKEN = "tracer_app_token";
    private static final String RESOURCE_NAME_IS_DISABLED = "tracer_is_disabled";

    public static final String getAppToken(Context context) {
        String stringOrNull$default = getStringOrNull$default(context, RESOURCE_NAME_APP_TOKEN, null, 2, null);
        if (stringOrNull$default == null) {
            throw new IllegalStateException("Could not find Tracer's appToken. Is Tracer plugin configured properly?");
        }
        if (stringOrNull$default.equals(NO_APP_TOKEN)) {
            return null;
        }
        return stringOrNull$default;
    }

    @SuppressLint({"DiscouragedApi"})
    public static final Boolean getBooleanOrNull(Context context, String str, String str2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "bool", str2);
        if (identifier == 0) {
            return null;
        }
        return Boolean.valueOf(resources.getBoolean(identifier));
    }

    public static /* synthetic */ Boolean getBooleanOrNull$default(Context context, String str, String str2, int i, Object obj) throws Resources.NotFoundException {
        if ((i & 2) != 0) {
            str2 = context.getPackageName();
        }
        return getBooleanOrNull(context, str, str2);
    }

    public static final String getHostAppToken(Context context) {
        try {
            Tracer tracer = Tracer.INSTANCE;
            return (String) Tracer.class.getMethod("getAppToken", null).invoke(Tracer.class.getField("INSTANCE").get(null), null);
        } catch (Exception unused) {
            TracerManifest findTracerManifest = TracerManifestUtils.findTracerManifest(context.getPackageName());
            if (findTracerManifest != null) {
                return findTracerManifest.appToken();
            }
            String stringOrNull$default = getStringOrNull$default(context, RESOURCE_NAME_APP_TOKEN, null, 2, null);
            if (stringOrNull$default == null || stringOrNull$default.equals(NO_APP_TOKEN)) {
                return null;
            }
            return stringOrNull$default;
        }
    }

    @SuppressLint({"DiscouragedApi"})
    public static final String getStringOrNull(Context context, String str, String str2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public static /* synthetic */ String getStringOrNull$default(Context context, String str, String str2, int i, Object obj) throws Resources.NotFoundException {
        if ((i & 2) != 0) {
            str2 = context.getPackageName();
        }
        return getStringOrNull(context, str, str2);
    }

    public static final boolean isTracerBuildDisabled(Context context) {
        Boolean booleanOrNull$default = getBooleanOrNull$default(context, RESOURCE_NAME_IS_DISABLED, null, 2, null);
        if (booleanOrNull$default != null) {
            return booleanOrNull$default.booleanValue();
        }
        return false;
    }
}
