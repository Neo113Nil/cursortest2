package ru.ok.android.webrtc.features;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class CallFeature {
    public static final CallFeature ADD_PARTICIPANT;
    public static final CallFeature ASR_RECORD;
    public static final CallFeature MOVIE_SHARE;
    public static final CallFeature RECORD;
    public static final /* synthetic */ CallFeature[] a;
    public static final /* synthetic */ zrp b;

    static {
        CallFeature callFeature = new CallFeature("ADD_PARTICIPANT", 0);
        ADD_PARTICIPANT = callFeature;
        CallFeature callFeature2 = new CallFeature("RECORD", 1);
        RECORD = callFeature2;
        CallFeature callFeature3 = new CallFeature(SignalingProtocol.KEY_FEATURE_MOVIE_SHARE, 2);
        MOVIE_SHARE = callFeature3;
        CallFeature callFeature4 = new CallFeature("ASR_RECORD", 3);
        ASR_RECORD = callFeature4;
        CallFeature[] callFeatureArr = {callFeature, callFeature2, callFeature3, callFeature4};
        a = callFeatureArr;
        b = new asp(callFeatureArr);
    }

    public CallFeature(String str, int i) {
    }

    public static zrp<CallFeature> getEntries() {
        return b;
    }

    public static CallFeature valueOf(String str) {
        return (CallFeature) Enum.valueOf(CallFeature.class, str);
    }

    public static CallFeature[] values() {
        return (CallFeature[]) a.clone();
    }
}
