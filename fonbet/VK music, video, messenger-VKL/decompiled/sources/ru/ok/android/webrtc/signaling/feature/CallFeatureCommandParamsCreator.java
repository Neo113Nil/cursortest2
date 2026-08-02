package ru.ok.android.webrtc.signaling.feature;

import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.features.CallFeature;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.yq;

/* loaded from: classes9.dex */
public final class CallFeatureCommandParamsCreator {

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CallFeature.values().length];
            try {
                iArr[CallFeature.ADD_PARTICIPANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CallFeature.RECORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CallFeature.MOVIE_SHARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CallFeature.ASR_RECORD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CallParticipant.Role.values().length];
            try {
                iArr2[CallParticipant.Role.CREATOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CallParticipant.Role.ADMIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CallParticipant.Role.SPEAKER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public final JSONObject createEnableFeatureParams(CallFeature callFeature, Set<? extends CallParticipant.Role> set) {
        String str;
        String str2;
        JSONObject d = yq.d("command", SignalingProtocol.COMMAND_ENABLE_FEATURE_FOR_ROLES);
        int i = WhenMappings.$EnumSwitchMapping$0[callFeature.ordinal()];
        if (i == 1) {
            str = "ADD_PARTICIPANT";
        } else if (i == 2) {
            str = "RECORD";
        } else if (i == 3) {
            str = SignalingProtocol.KEY_FEATURE_MOVIE_SHARE;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = SignalingProtocol.KEY_FEATURE_ASR_RECORD;
        }
        d.put(SignalingProtocol.KEY_FEATURE, str);
        JSONArray jSONArray = new JSONArray();
        Iterator<? extends CallParticipant.Role> it = set.iterator();
        while (it.hasNext()) {
            int i2 = WhenMappings.$EnumSwitchMapping$1[it.next().ordinal()];
            if (i2 == 1) {
                str2 = SignalingProtocol.KEY_ROLE_CREATOR;
            } else if (i2 == 2) {
                str2 = "ADMIN";
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = SignalingProtocol.KEY_ROLE_SPEAKER;
            }
            jSONArray.put(str2);
        }
        d.put(SignalingProtocol.KEY_ROLES, jSONArray);
        return d;
    }
}
