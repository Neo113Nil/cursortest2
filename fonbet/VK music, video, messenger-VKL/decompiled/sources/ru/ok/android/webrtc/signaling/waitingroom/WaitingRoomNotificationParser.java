package ru.ok.android.webrtc.signaling.waitingroom;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import okcalls.h2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.chatroom.CallWaitingRoomEvent;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.signaling.feedback.FeedbackParser;
import ru.ok.android.webrtc.signaling.participant.ParticipantsParser;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class WaitingRoomNotificationParser {
    public static final Companion Companion = new Companion(null);
    public final RTCLog a;
    public final FeedbackParser b;
    public final ParticipantsParser c;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[h2.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public WaitingRoomNotificationParser(RTCLog rTCLog, FeedbackParser feedbackParser, ParticipantsParser participantsParser) {
        this.a = rTCLog;
        this.b = feedbackParser;
        this.c = participantsParser;
    }

    public final CallWaitingRoomEvent parseChatRoomUpdated(JSONObject jSONObject) {
        List<CallParticipant.ParticipantId> list;
        List<CallParticipant.ParticipantId> list2;
        List<CallParticipant.ParticipantId> list3;
        List<CallParticipant.ParticipantId> list4;
        try {
            int ordinal = h2.valueOf(jSONObject.getString(SignalingProtocol.KEY_EVENT_TYPE)).ordinal();
            if (ordinal == 0) {
                int optInt = jSONObject.optInt(SignalingProtocol.KEY_TOTAL_COUNT);
                JSONArray optJSONArray = jSONObject.optJSONArray(SignalingProtocol.KEY_ADDED_PARTICIPANT_IDS);
                if (optJSONArray == null || (list = this.c.parseParticipantIds(optJSONArray)) == null) {
                    list = EmptyList.b;
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray(SignalingProtocol.KEY_REMOVED_PARTICIPANT_IDS);
                if (optJSONArray2 == null || (list2 = this.c.parseParticipantIds(optJSONArray2)) == null) {
                    list2 = EmptyList.b;
                }
                return new CallWaitingRoomEvent.Attendee(optInt, list, list2);
            }
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (jSONObject.has("feedback")) {
                    return new CallWaitingRoomEvent.Feedback(this.b.parseFeedback(jSONObject.getJSONObject("feedback")));
                }
                return null;
            }
            int i = jSONObject.getInt(SignalingProtocol.KEY_TOTAL_COUNT);
            JSONArray optJSONArray3 = jSONObject.optJSONArray(SignalingProtocol.KEY_ADDED_PARTICIPANT_IDS);
            if (optJSONArray3 == null || (list3 = this.c.parseParticipantIds(optJSONArray3)) == null) {
                list3 = EmptyList.b;
            }
            JSONArray optJSONArray4 = jSONObject.optJSONArray(SignalingProtocol.KEY_REMOVED_PARTICIPANT_IDS);
            if (optJSONArray4 == null || (list4 = this.c.parseParticipantIds(optJSONArray4)) == null) {
                list4 = EmptyList.b;
            }
            return new CallWaitingRoomEvent.HandUp(i, list3, list4);
        } catch (JSONException e) {
            this.a.logException("WaitingRoomNotificationParser", "Can't parse chat room notification", e);
            return null;
        }
    }

    public final CallWaitingRoomEvent.PromotionApproved parsePromotionApproved(JSONObject jSONObject) {
        try {
            return new CallWaitingRoomEvent.PromotionApproved(!jSONObject.optBoolean(SignalingProtocol.KEY_DISPROVE, false));
        } catch (JSONException e) {
            this.a.logException("WaitingRoomNotificationParser", "Can't parse promotion approved", e);
            return null;
        }
    }
}
