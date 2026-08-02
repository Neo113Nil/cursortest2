package ru.ok.tracer.session;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.tracer.Severity;
import ru.ok.tracer.SeverityKt;
import ru.ok.tracer.SystemState;
import ru.ok.tracer.base.sessionuuuid.SessionUuidUtils;
import ru.ok.tracer.session.SessionState;

/* compiled from: SessionStatesSerializer.kt */
/* loaded from: classes11.dex */
public final class SessionStatesSerializer {
    public static final SessionStatesSerializer INSTANCE = new SessionStatesSerializer();

    private SessionStatesSerializer() {
    }

    public final List<SessionState> fromJson(String str) {
        JSONArray jSONArray = new JSONArray(str);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("versionName");
            long j = jSONObject.getLong("versionCode");
            String optString = jSONObject.optString("environment", "");
            Severity severity = null;
            String str2 = optString.length() > 0 ? optString : null;
            String optString2 = jSONObject.optString("sessionUuid", "");
            if (optString2.length() <= 0) {
                optString2 = null;
            }
            if (optString2 == null) {
                optString2 = SessionUuidUtils.createSessionUuid();
            }
            String optString3 = jSONObject.optString(SystemState.PROPERTY_KEY_PROCESS_NAME, "");
            if (optString3.length() <= 0) {
                optString3 = null;
            }
            SessionState.Status valueOf = SessionState.Status.valueOf(jSONObject.getString("status"));
            String optString4 = jSONObject.optString("maxSeverity", "");
            if (optString4.length() <= 0) {
                optString4 = null;
            }
            if (optString4 != null) {
                severity = SeverityKt.fromApiString(Severity.Companion, optString4);
            }
            arrayList.add(new SessionState(j, string, str2, optString2, optString3, valueOf, severity));
        }
        return arrayList;
    }

    public final String toJson(Iterable<SessionState> iterable) {
        return toJsonArray(iterable).toString();
    }

    public final JSONArray toJsonArray(Iterable<SessionState> iterable) {
        JSONArray jSONArray = new JSONArray();
        for (SessionState sessionState : iterable) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("versionName", sessionState.getVersionName());
            jSONObject.put("versionCode", sessionState.getVersionCode());
            jSONObject.put("environment", sessionState.getEnvironment());
            jSONObject.put("sessionUuid", sessionState.getSessionUuid());
            jSONObject.put(SystemState.PROPERTY_KEY_PROCESS_NAME, sessionState.getProcessName());
            jSONObject.put("status", sessionState.getStatus().toString());
            Severity maxSeverity = sessionState.getMaxSeverity();
            jSONObject.put("maxSeverity", maxSeverity != null ? SeverityKt.toApiString(maxSeverity) : null);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }
}
