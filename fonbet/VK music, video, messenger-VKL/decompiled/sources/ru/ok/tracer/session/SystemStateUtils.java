package ru.ok.tracer.session;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Result;
import ru.ok.tracer.HostedTracerLibraryInfo;
import ru.ok.tracer.SystemState;
import ru.ok.tracer.Tracer;
import ru.ok.tracer.base.device.DeviceInfoUtils;
import ru.ok.tracer.base.deviceid.DeviceIdUtils;
import ru.ok.tracer.base.manifest.TracerLiteManifestUtils;
import ru.ok.tracer.base.sessionuuuid.SessionUuidUtils;
import ru.ok.tracer.manifest.TracerLiteManifest;
import ru.ok.tracer.upload.SystemInfoKt;
import xsna.c5g;
import xsna.j5g;

/* compiled from: SystemStateUtils.kt */
/* loaded from: classes11.dex */
public final class SystemStateUtils {
    private static final Set<HostedTracerLibraryInfo> collectLibrariesInfo() {
        Object failure;
        Set<TracerLiteManifest> findTracerLiteManifests = TracerLiteManifestUtils.findTracerLiteManifests();
        ArrayList arrayList = new ArrayList(c5g.u(findTracerLiteManifests, 10));
        for (TracerLiteManifest tracerLiteManifest : findTracerLiteManifests) {
            String namespace = tracerLiteManifest.namespace();
            String versionName = tracerLiteManifest.versionName();
            String buildUuid = tracerLiteManifest.buildUuid();
            try {
                failure = tracerLiteManifest.environment();
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            arrayList.add(new HostedTracerLibraryInfo(namespace, versionName, buildUuid, (String) failure));
        }
        return j5g.S0(arrayList);
    }

    public static final SystemState createSystemState(Context context) {
        Tracer tracer = Tracer.INSTANCE;
        return new SystemState(tracer.getApplicationInfo().getVersionName(), tracer.getApplicationInfo().getLongVersionCode(), tracer.getApplicationInfo().getPackageName(), tracer.getApplicationInfo().getEnvironment(), tracer.getApplicationInfo().getBuildUuid(), SessionUuidUtils.getCurrentSessionUuid(), Build.MODEL, DeviceIdUtils.getDeviceId(context), Build.MANUFACTURER, String.valueOf(Build.VERSION.SDK_INT), !DeviceInfoUtils.isInForeground(context), DeviceInfoUtils.getConnectionInfo(context), DeviceInfoUtils.isRooted(context), SystemInfoKt.getSystemProperties(context), collectLibrariesInfo());
    }
}
