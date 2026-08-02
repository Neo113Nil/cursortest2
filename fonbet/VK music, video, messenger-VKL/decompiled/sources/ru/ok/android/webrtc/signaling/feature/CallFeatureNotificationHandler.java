package ru.ok.android.webrtc.signaling.feature;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.collections.EmptySet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.CallEvents;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.features.CallFeature;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.signaling.feature.event.CallFeatureSetChangedEvent;
import ru.ok.android.webrtc.signaling.feature.event.CallFeaturesPerRoleChangedEvent;
import ru.ok.android.webrtc.signaling.roles.CallParticipantRolesParser;
import xsna.bjn0;
import xsna.jgp;
import xsna.s3q0;
import xsna.wzs;

/* loaded from: classes9.dex */
public final class CallFeatureNotificationHandler {
    public final wzs a;
    public final RTCLog b;
    public final CallFeatureParser c;
    public final CallParticipantRolesParser d;

    public CallFeatureNotificationHandler(wzs<? super CallEvents, Object, s3q0> wzsVar, RTCLog rTCLog, CallFeatureParser callFeatureParser, CallParticipantRolesParser callParticipantRolesParser) {
        this.a = wzsVar;
        this.b = rTCLog;
        this.c = callFeatureParser;
        this.d = callParticipantRolesParser;
    }

    public final LinkedHashSet a(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("features");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            CallFeature featureFromValue = this.c.getFeatureFromValue(string);
            if (featureFromValue != null) {
                linkedHashSet.add(featureFromValue);
            } else {
                bjn0.b("warning: unknown feature: ", string, this.b, "CallFeatureNotificationHandler");
            }
        }
        return linkedHashSet;
    }

    public final Map b(JSONObject jSONObject) {
        Collection collection;
        CallParticipant.Role parseRole;
        JSONObject optJSONObject = jSONObject.optJSONObject(SignalingProtocol.KEY_FEATURES_PER_ROLE);
        if (optJSONObject == null) {
            return jgp.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = optJSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            CallFeature featureFromValue = this.c.getFeatureFromValue(next);
            if (featureFromValue == null) {
                bjn0.b("warning: unknown feature: ", next, this.b, "CallFeatureNotificationHandler");
            } else {
                JSONArray optJSONArray = optJSONObject.optJSONArray(next);
                if (optJSONArray == null) {
                    collection = EmptySet.b;
                } else {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String optString = optJSONArray.optString(i);
                        if (optString != null && (parseRole = this.d.parseRole(optString)) != null) {
                            linkedHashSet.add(parseRole);
                        }
                    }
                    collection = linkedHashSet;
                }
                linkedHashMap.put(featureFromValue, collection);
            }
        }
        return linkedHashMap;
    }

    public final void onFeatureSetChanged(JSONObject jSONObject) {
        try {
            this.a.invoke(CallEvents.FEATURE_SET_CHANGED, new CallFeatureSetChangedEvent(a(jSONObject)));
        } catch (JSONException e) {
            this.b.logException("CallFeatureNotificationHandler", "feature set changed notification parsing error", e);
        }
    }

    public final void onFeaturesPerRoleChanged(JSONObject jSONObject) {
        try {
            this.a.invoke(CallEvents.FEATURES_PER_ROLE_CHANGED, new CallFeaturesPerRoleChangedEvent(b(jSONObject)));
        } catch (JSONException e) {
            this.b.logException("CallFeatureNotificationHandler", "features per role changed notification parsing error", e);
        }
    }
}
