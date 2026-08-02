package ru.ok.android.webrtc.events.destroy;

import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.android.externcalls.sdk.exception.CallTerminatingException;
import ru.ok.android.externcalls.sdk.exception.Domain;
import ru.ok.android.webrtc.signaling.hangup.SignalingHangupReason;

@CallInternalApi
/* loaded from: classes9.dex */
public final class SignalingCallEndMapper {
    public static final SignalingCallEndMapper INSTANCE = new SignalingCallEndMapper();

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SignalingHangupReason.values().length];
            try {
                iArr[SignalingHangupReason.CANCELED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SignalingHangupReason.REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SignalingHangupReason.HUNGUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SignalingHangupReason.MISSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SignalingHangupReason.TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SignalingHangupReason.BUSY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SignalingHangupReason.FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SignalingHangupReason.REMOVED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SignalingHangupReason.ANOTHER_DEVICE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SignalingHangupReason.KILLED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SignalingHangupReason.CALL_TIMEOUT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SignalingHangupReason.BANNED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SignalingHangupReason.KILLED_WITHOUT_DELETE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SignalingHangupReason.SOCKET_CLOSED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SignalingHangupReason.INITIALLY_CLOSED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SignalingHangupReason.OBSOLETE_CLIENT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ConversationEndReason getCallEndReason(SignalingHangupReason signalingHangupReason, String str, String str2) {
        switch (signalingHangupReason == null ? -1 : WhenMappings.$EnumSwitchMapping$0[signalingHangupReason.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return new ConversationEndReason.Canceled(ConversationEndReason.Canceled.Source.PARTICIPANT, null);
            case 2:
                return ConversationEndReason.Rejected.INSTANCE;
            case 3:
                return ConversationEndReason.Hangup.INSTANCE;
            case 4:
                return ConversationEndReason.Missed.INSTANCE;
            case 5:
                return ConversationEndReason.SignalingTimeout.INSTANCE;
            case 6:
                return ConversationEndReason.Busy.INSTANCE;
            case 7:
                return new ConversationEndReason.Error(new CallTerminatingException.Builder(Domain.SERVER, str).build());
            case 8:
                return ConversationEndReason.RemovedFromCall.INSTANCE;
            case 9:
                return ConversationEndReason.AcceptedOnAnotherDevice.INSTANCE;
            case 10:
                return ConversationEndReason.EndedForAll.INSTANCE;
            case 11:
                return ConversationEndReason.CallTimeout.INSTANCE;
            case 12:
                return ConversationEndReason.Banned.INSTANCE;
            case 13:
                return ConversationEndReason.KilledWithoutDelete.INSTANCE;
            case 14:
                return ConversationEndReason.SocketClosed.INSTANCE;
            case 15:
                return ConversationEndReason.InitiallyClosed.INSTANCE;
            case 16:
                return new ConversationEndReason.ObsoleteClient(str2, str);
        }
    }
}
