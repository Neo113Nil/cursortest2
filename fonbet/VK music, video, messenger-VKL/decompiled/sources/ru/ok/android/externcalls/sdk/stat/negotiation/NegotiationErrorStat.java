package ru.ok.android.externcalls.sdk.stat.negotiation;

import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import org.webrtc.SessionDescription;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.webrtc.stat.NegotiationError;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import xsna.gzs;
import xsna.zcl;

/* compiled from: NegotiationErrorStat.kt */
/* loaded from: classes9.dex */
public final class NegotiationErrorStat {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String KEY_ERROR = "error";
    private final gzs<CallEventualStatSender> getEventualStatSender;

    /* compiled from: NegotiationErrorStat.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: NegotiationErrorStat.kt */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NegotiationError.Type.values().length];
            try {
                iArr[NegotiationError.Type.CREATE_OFFER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NegotiationError.Type.CREATE_ANSWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NegotiationError.Type.SET_LOCAL_OFFER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NegotiationError.Type.SET_REMOTE_OFFER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NegotiationError.Type.SET_LOCAL_ANSWER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NegotiationError.Type.SET_REMOTE_ANSWER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[NegotiationError.Type.SET_LOCAL_PRANSWER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[NegotiationError.Type.SET_REMOTE_PRANSWER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[NegotiationError.Type.SET_LOCAL_ROLLBACK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[NegotiationError.Type.SET_REMOTE_ROLLBACK.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NegotiationErrorStat(gzs<? extends CallEventualStatSender> gzsVar) {
        this.getEventualStatSender = gzsVar;
    }

    private final JSONObject sdpJson(SessionDescription sessionDescription) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sdp", sessionDescription.description);
        jSONObject.put("type", sessionDescription.type);
        return jSONObject;
    }

    private final String toStatName(NegotiationError.Type type) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return CallEventualStatName.SDP_CREATE_OFFER;
            case 2:
                return CallEventualStatName.SDP_CREATE_ANSWER;
            case 3:
                return CallEventualStatName.SDP_SET_LOCAL_OFFER;
            case 4:
                return CallEventualStatName.SDP_SET_REMOTE_OFFER;
            case 5:
                return CallEventualStatName.SDP_SET_LOCAL_ANSWER;
            case 6:
                return CallEventualStatName.SDP_SET_REMOTE_ANSWER;
            case 7:
                return CallEventualStatName.SDP_SET_LOCAL_PRANSWER;
            case 8:
                return CallEventualStatName.SDP_SET_REMOTE_PRANSWER;
            case 9:
                return CallEventualStatName.SDP_SET_LOCAL_ROLLBACK;
            case 10:
                return CallEventualStatName.SDP_SET_REMOTE_ROLLBACK;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void onError(NegotiationError negotiationError) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error", negotiationError.getMessage());
        SessionDescription localSdp = negotiationError.getLocalSdp();
        if (localSdp != null) {
            jSONObject.put("local", sdpJson(localSdp));
        }
        SessionDescription remoteSdp = negotiationError.getRemoteSdp();
        if (remoteSdp != null) {
            jSONObject.put("remote", sdpJson(remoteSdp));
        }
        CallEventualStatSender invoke = this.getEventualStatSender.invoke();
        if (invoke != null) {
            CallEventualStatSender.send$default(invoke, toStatName(negotiationError.getType()), EventItemValueKt.toEventItemValue(jSONObject.toString()), null, 4, null);
        }
    }
}
