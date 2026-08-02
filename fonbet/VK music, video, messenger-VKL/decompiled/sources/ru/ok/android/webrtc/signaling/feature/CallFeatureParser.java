package ru.ok.android.webrtc.signaling.feature;

import ru.ok.android.webrtc.features.CallFeature;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* loaded from: classes9.dex */
public final class CallFeatureParser {
    public final CallFeature getFeatureFromValue(String str) {
        int hashCode = str.hashCode();
        if (hashCode == -2105248304) {
            if (str.equals(SignalingProtocol.KEY_FEATURE_MOVIE_SHARE)) {
                return CallFeature.MOVIE_SHARE;
            }
            return null;
        }
        if (hashCode == -1881579439) {
            if (str.equals("RECORD")) {
                return CallFeature.RECORD;
            }
            return null;
        }
        if (hashCode == -1284823979) {
            if (str.equals("ADD_PARTICIPANT")) {
                return CallFeature.ADD_PARTICIPANT;
            }
            return null;
        }
        if (hashCode == 65120 && str.equals(SignalingProtocol.KEY_FEATURE_ASR_RECORD)) {
            return CallFeature.ASR_RECORD;
        }
        return null;
    }
}
