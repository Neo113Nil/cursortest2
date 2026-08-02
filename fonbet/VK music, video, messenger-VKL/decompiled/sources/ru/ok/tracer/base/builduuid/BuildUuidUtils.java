package ru.ok.tracer.base.builduuid;

import android.content.Context;
import ru.ok.tracer.base.apptoken.AppTokenUtils;
import ru.ok.tracer.base.deviceid.DeviceIdUtils;
import ru.ok.tracer.base.manifest.TracerManifestUtils;
import ru.ok.tracer.manifest.TracerManifest;
import xsna.ozl;

/* compiled from: BuildUuidUtils.kt */
/* loaded from: classes11.dex */
public final class BuildUuidUtils {
    private static final String RESOURCE_NAME_ENVIRONMENT = "tracer_environment";
    private static final String RESOURCE_NAME_MAPPING_UUID = "tracer_mapping_uuid";

    public static final String getBuildEnvironment(Context context) {
        return AppTokenUtils.getStringOrNull$default(context, RESOURCE_NAME_ENVIRONMENT, null, 2, null);
    }

    @ozl
    public static final String getBuildUuid(Context context) {
        String stringOrNull$default = AppTokenUtils.getStringOrNull$default(context, RESOURCE_NAME_MAPPING_UUID, null, 2, null);
        if (stringOrNull$default == null) {
            throw new IllegalStateException("Could not find build UUID. Is Tracer plugin configured properly?");
        }
        if (stringOrNull$default.equals(DeviceIdUtils.NULL_UUID)) {
            return null;
        }
        return stringOrNull$default;
    }

    public static final String getHostBuildUuid(Context context) {
        TracerManifest findTracerManifest = TracerManifestUtils.findTracerManifest(context.getPackageName());
        if (findTracerManifest != null) {
            return findTracerManifest.buildUuid();
        }
        String stringOrNull$default = AppTokenUtils.getStringOrNull$default(context, RESOURCE_NAME_MAPPING_UUID, null, 2, null);
        if (stringOrNull$default == null || stringOrNull$default.equals(DeviceIdUtils.NULL_UUID)) {
            return null;
        }
        return stringOrNull$default;
    }
}
