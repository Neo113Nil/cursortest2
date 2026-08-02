package ru.ok.tracer.lite.upload;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.webrtc.signaling.api.EndpointParameters;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.tracer.base.builduuid.BuildUuidUtils;
import ru.ok.tracer.base.compat.PackageInfoCompat;
import ru.ok.tracer.base.compat.PackageManagerCompat;
import ru.ok.tracer.base.datetime.DateTimeUtils;
import ru.ok.tracer.base.device.DeviceInfoUtils;
import ru.ok.tracer.base.deviceid.DeviceIdUtils;
import ru.ok.tracer.base.sessionuuuid.SessionUuidUtils;
import ru.ok.tracer.lite.TracerLibraryInfo;
import xsna.ozl;

/* compiled from: UploadBeanUtilsLite.kt */
/* loaded from: classes9.dex */
public final class UploadBeanUtilsLite {
    @ozl
    public static final JSONObject composeLibUploadBean(Context context, TracerLibraryInfo tracerLibraryInfo, Date date, String str, List<String> list) {
        return composeLibUploadBean(context, tracerLibraryInfo, SessionUuidUtils.getCurrentSessionUuid(), date, str, list);
    }

    public static /* synthetic */ JSONObject composeLibUploadBean$default(Context context, TracerLibraryInfo tracerLibraryInfo, Date date, String str, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            date = null;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            list = null;
        }
        return composeLibUploadBean(context, tracerLibraryInfo, date, str, list);
    }

    private static final JSONObject composeLibraryInfoJsonObject(TracerLibraryInfo tracerLibraryInfo) {
        if (tracerLibraryInfo == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("packageName", tracerLibraryInfo.getPackageName());
        jSONObject.put("versionName", tracerLibraryInfo.getVersionName());
        jSONObject.put("buildUuid", tracerLibraryInfo.getBuildUuid());
        jSONObject.put("environment", tracerLibraryInfo.getEnvironment());
        return jSONObject;
    }

    private static final JSONObject composeProperties(Date date, String str) {
        JSONObject jSONObject = new JSONObject();
        if (date != null) {
            jSONObject.put("date", DateTimeUtils.formatISO8601(date));
        }
        jSONObject.put("board", Build.BOARD);
        jSONObject.put("brand", Build.BRAND);
        jSONObject.put("cpuABI", TextUtils.join(", ", Build.SUPPORTED_ABIS));
        jSONObject.put("device", Build.DEVICE);
        jSONObject.put("manufacturer", Build.MANUFACTURER);
        jSONObject.put("model", Build.MODEL);
        jSONObject.put("cpuCount", String.valueOf(Runtime.getRuntime().availableProcessors()));
        jSONObject.put("osVersionSdkInt", String.valueOf(Build.VERSION.SDK_INT));
        jSONObject.put("osVersionRelease", Build.VERSION.RELEASE);
        if (str != null) {
            jSONObject.put("issueKey", str);
        }
        return jSONObject;
    }

    private static final JSONArray composeTags(List<String> list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray;
    }

    public static /* synthetic */ JSONObject composeLibUploadBean$default(Context context, TracerLibraryInfo tracerLibraryInfo, String str, Date date, String str2, List list, int i, Object obj) {
        if ((i & 8) != 0) {
            date = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            list = null;
        }
        return composeLibUploadBean(context, tracerLibraryInfo, str, date, str2, list);
    }

    public static final JSONObject composeLibUploadBean(Context context, TracerLibraryInfo tracerLibraryInfo, String str, Date date, String str2, List<String> list) {
        PackageInfo packageInfoCompat = PackageManagerCompat.getPackageInfoCompat(context.getPackageManager(), context.getPackageName(), 0);
        String hostBuildUuid = BuildUuidUtils.getHostBuildUuid(context);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("packageName", packageInfoCompat.packageName);
        jSONObject.put("versionName", packageInfoCompat.versionName);
        jSONObject.put("versionCode", PackageInfoCompat.getLongVersionCodeCompat(packageInfoCompat));
        jSONObject.put("buildUuid", hostBuildUuid);
        jSONObject.put("sessionUuid", str);
        jSONObject.put("device", Build.MODEL);
        jSONObject.put(ApiProtocol.PARAM_DEVICE_ID, DeviceIdUtils.getDeviceId(context));
        jSONObject.put("vendor", Build.MANUFACTURER);
        jSONObject.put(EndpointParameters.Name.OS_VERSION, String.valueOf(Build.VERSION.SDK_INT));
        jSONObject.put("inBackground", !DeviceInfoUtils.isInForeground(context));
        jSONObject.put(SignalingProtocol.NOTIFY_CONNECTION, DeviceInfoUtils.getConnectionInfo(context));
        jSONObject.put("isRooted", DeviceInfoUtils.isRooted(context));
        jSONObject.put("properties", composeProperties(date, str2));
        jSONObject.put("tags", composeTags(list));
        jSONObject.put("libraryInfo", composeLibraryInfoJsonObject(tracerLibraryInfo));
        return jSONObject;
    }
}
