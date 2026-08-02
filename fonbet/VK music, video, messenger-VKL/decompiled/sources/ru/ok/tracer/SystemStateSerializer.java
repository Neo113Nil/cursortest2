package ru.ok.tracer;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.SetBuilder;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.webrtc.signaling.api.EndpointParameters;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.tracer.base.sessionuuuid.SessionUuidUtils;

/* compiled from: SystemStateSerializer.kt */
/* loaded from: classes11.dex */
public final class SystemStateSerializer {
    public static final SystemStateSerializer INSTANCE = new SystemStateSerializer();

    private SystemStateSerializer() {
    }

    private final Set<HostedTracerLibraryInfo> librariesInfoFromJsonArray(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return EmptySet.b;
        }
        SetBuilder setBuilder = new SetBuilder();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            setBuilder.add(INSTANCE.libraryInfoFromJsonObject(jSONArray.getJSONObject(i)));
        }
        return setBuilder.d();
    }

    private final JSONArray librariesInfoToJsonArray(Set<HostedTracerLibraryInfo> set) {
        Set<HostedTracerLibraryInfo> set2 = set;
        if (set2 == null || set2.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<HostedTracerLibraryInfo> it = set.iterator();
        while (it.hasNext()) {
            jSONArray.put(INSTANCE.libraryInfoToJsonObject(it.next()));
        }
        return jSONArray;
    }

    private final HostedTracerLibraryInfo libraryInfoFromJsonObject(JSONObject jSONObject) {
        String string = jSONObject.getString("packageName");
        String string2 = jSONObject.getString("versionName");
        String optString = jSONObject.optString("buildUuid");
        if (optString.length() <= 0) {
            optString = null;
        }
        String optString2 = jSONObject.optString("environment");
        return new HostedTracerLibraryInfo(string, string2, optString, optString2.length() > 0 ? optString2 : null);
    }

    private final JSONObject libraryInfoToJsonObject(HostedTracerLibraryInfo hostedTracerLibraryInfo) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("packageName", hostedTracerLibraryInfo.getPackageName());
        jSONObject.put("versionName", hostedTracerLibraryInfo.getVersionName());
        jSONObject.put("buildUuid", hostedTracerLibraryInfo.getBuildUuid());
        jSONObject.put("environment", hostedTracerLibraryInfo.getEnvironment());
        return jSONObject;
    }

    public final SystemState fromJson(String str) {
        String string;
        JSONObject jSONObject = new JSONObject(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject2 = jSONObject.getJSONObject("properties");
        JSONArray names = jSONObject2.names();
        int length = names != null ? names.length() : 0;
        for (int i = 0; i < length; i++) {
            if (names != null && (string = names.getString(i)) != null) {
                linkedHashMap.put(string, jSONObject2.getString(string));
            }
        }
        String string2 = jSONObject.getString("versionName");
        long j = jSONObject.getLong("versionCode");
        String optString = jSONObject.optString("packageName");
        if (optString.length() <= 0) {
            optString = null;
        }
        if (optString == null) {
            optString = SystemStateSerializerKt.getImpliedPackageName();
        }
        String optString2 = jSONObject.optString("environment");
        if (optString2.length() <= 0) {
            optString2 = null;
        }
        String optString3 = jSONObject.optString("buildUuid");
        if (optString3.length() <= 0) {
            optString3 = null;
        }
        String optString4 = jSONObject.optString("sessionUuid");
        if (optString4.length() <= 0) {
            optString4 = null;
        }
        if (optString4 == null) {
            optString4 = SessionUuidUtils.createSessionUuid();
        }
        String string3 = jSONObject.getString("device");
        String string4 = jSONObject.getString(ApiProtocol.PARAM_DEVICE_ID);
        String string5 = jSONObject.getString("vendor");
        String string6 = jSONObject.getString(EndpointParameters.Name.OS_VERSION);
        boolean z = jSONObject.getBoolean("inBackground");
        String optString5 = jSONObject.optString(SignalingProtocol.NOTIFY_CONNECTION);
        return new SystemState(string2, j, optString, optString2, optString3, optString4, string3, string4, string5, string6, z, optString5.length() > 0 ? optString5 : null, jSONObject.getBoolean("isRooted"), linkedHashMap, librariesInfoFromJsonArray(jSONObject.optJSONArray("hostedLibrariesInfo")));
    }

    public final String toJson(SystemState systemState) {
        return toJsonObject(systemState).toString();
    }

    public final JSONObject toJsonObject(SystemState systemState) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("versionName", systemState.getVersionName());
        jSONObject.put("versionCode", systemState.getVersionCode());
        jSONObject.put("packageName", systemState.getPackageName());
        jSONObject.put("environment", systemState.getEnvironment());
        jSONObject.put("buildUuid", systemState.getBuildUuid());
        jSONObject.put("sessionUuid", systemState.getSessionUuid());
        jSONObject.put("device", systemState.getDevice());
        jSONObject.put(ApiProtocol.PARAM_DEVICE_ID, systemState.getDeviceId());
        jSONObject.put("vendor", systemState.getVendor());
        jSONObject.put(EndpointParameters.Name.OS_VERSION, systemState.getOsVersion());
        jSONObject.put("inBackground", systemState.isInBackground());
        jSONObject.put(SignalingProtocol.NOTIFY_CONNECTION, systemState.getConnection());
        jSONObject.put("isRooted", systemState.isRooted());
        jSONObject.put("properties", new JSONObject(systemState.getProperties()));
        jSONObject.put("hostedLibrariesInfo", INSTANCE.librariesInfoToJsonArray(systemState.getHostedLibrariesInfo()));
        return jSONObject;
    }
}
