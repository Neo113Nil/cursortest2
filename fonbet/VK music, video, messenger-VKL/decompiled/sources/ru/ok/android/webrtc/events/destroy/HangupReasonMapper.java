package ru.ok.android.webrtc.events.destroy;

import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import one.video.calls.sdk.error.ParticipantLimitExceededException;
import one.video.calls.sdk.error.ServiceUnavailableException;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.android.webrtc.HangupReason;
import ru.ok.android.webrtc.utils.HangupInfo;

/* loaded from: classes9.dex */
public final class HangupReasonMapper {
    public static final HangupReasonMapper INSTANCE = new HangupReasonMapper();

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HangupReason.values().length];
            try {
                iArr[HangupReason.TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HangupReason.BUSY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HangupReason.MISSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HangupReason.REJECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HangupReason.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HangupReason.HUNGUP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HangupReason.CANCELED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HangupReason.CALL_TIMEOUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HangupReason.REMOVED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HangupReason.OBSOLETE_CLIENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[HangupReason.SERVICE_UNAVAILABLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[HangupReason.PARTICIPANT_LIMIT_EXCEEDED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[HangupReason.BANNED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[HangupReason.ANOTHER_DEVICE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[HangupReason.KILLED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[HangupReason.KILLED_WITHOUT_DELETE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[HangupReason.SOCKET_CLOSED.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[HangupReason.INITIALLY_CLOSED.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ConversationEndReason getCallEndReason(HangupReason hangupReason, HangupInfo hangupInfo) {
        String str;
        Set<HangupInfo.HangupError> set;
        Set<HangupInfo.HangupError> set2;
        switch (hangupReason == null ? -1 : WhenMappings.$EnumSwitchMapping$0[hangupReason.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return ConversationEndReason.SignalingTimeout.INSTANCE;
            case 2:
                return ConversationEndReason.Busy.INSTANCE;
            case 3:
                return ConversationEndReason.Missed.INSTANCE;
            case 4:
                return ConversationEndReason.Rejected.INSTANCE;
            case 5:
                if (hangupInfo == null || (str = hangupInfo.errorCode) == null) {
                    str = "Unknown call error";
                }
                return new ConversationEndReason.Error(new RuntimeException(str));
            case 6:
                return ConversationEndReason.Hangup.INSTANCE;
            case 7:
                ConversationEndReason.Canceled.Source source = (hangupInfo == null || (set2 = hangupInfo.errorSet) == null || !set2.contains(HangupInfo.HangupError.RINGING_TIMEOUT)) ? ConversationEndReason.Canceled.Source.PARTICIPANT : ConversationEndReason.Canceled.Source.RINGING_TIMEOUT;
                if (hangupInfo != null && (set = hangupInfo.errorSet) != null && set.contains(HangupInfo.HangupError.RINGING_TIMEOUT)) {
                    r0 = hangupInfo.errorCode;
                }
                return new ConversationEndReason.Canceled(source, r0);
            case 8:
                return ConversationEndReason.CallTimeout.INSTANCE;
            case 9:
                return ConversationEndReason.RemovedFromCall.INSTANCE;
            case 10:
                return new ConversationEndReason.ObsoleteClient(hangupInfo != null ? hangupInfo.explanationHtml : null, hangupInfo != null ? hangupInfo.errorCode : null);
            case 11:
                return new ConversationEndReason.Error(new ServiceUnavailableException());
            case 12:
                return new ConversationEndReason.Error(new ParticipantLimitExceededException());
            case 13:
                return ConversationEndReason.Banned.INSTANCE;
            case 14:
                return ConversationEndReason.AcceptedOnAnotherDevice.INSTANCE;
            case 15:
                return ConversationEndReason.EndedForAll.INSTANCE;
            case 16:
                return ConversationEndReason.KilledWithoutDelete.INSTANCE;
            case 17:
                return ConversationEndReason.SocketClosed.INSTANCE;
            case 18:
                return ConversationEndReason.InitiallyClosed.INSTANCE;
        }
    }
}
