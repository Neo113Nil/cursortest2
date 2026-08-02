package xsna;

import com.vk.voip.OKVoipEngine;
import com.vk.voip.dto.call_member.CallMember;
import com.vk.voip.dto.call_member.CallMemberId;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.participant.NetworkStatus;

/* compiled from: ParticipantMapper.kt */
/* loaded from: classes11.dex */
public final class tk90 {
    public final OKVoipEngine.i a;
    public final OKVoipEngine.j b;

    /* compiled from: ParticipantMapper.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkStatus.values().length];
            try {
                iArr[NetworkStatus.GOOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkStatus.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkStatus.BAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public tk90(OKVoipEngine.i iVar, OKVoipEngine.j jVar) {
        this.a = iVar;
        this.b = jVar;
    }

    public static CallMember a(tk90 tk90Var, ConversationParticipant conversationParticipant) {
        CallMember.NetworkStatus networkStatus;
        CallMemberId callMemberId = (CallMemberId) tk90Var.b.get();
        Conversation conversation = (Conversation) tk90Var.a.get();
        if (conversation == null || conversationParticipant == null || !conversationParticipant.isUseable() || conversationParticipant.getExternalId() == null) {
            return null;
        }
        CallMemberId E = mnh0.E(conversationParticipant.getExternalId());
        MediaOptionState audioOptionState = conversationParticipant.getAudioOptionState();
        MediaOptionState videoOptionState = conversationParticipant.getVideoOptionState();
        MediaOptionState watchTogetherOptionState = conversationParticipant.getWatchTogetherOptionState();
        MediaOptionState screenshareOptionState = conversationParticipant.getScreenshareOptionState();
        boolean isAudioEnabled = conversationParticipant.isAudioEnabled();
        boolean isVideoEnabled = conversationParticipant.isVideoEnabled();
        boolean isAnimojiEnabled = conversationParticipant.isAnimojiEnabled();
        boolean isCallAccepted = conversationParticipant.isCallAccepted();
        boolean isConnected = conversationParticipant.isConnected();
        boolean isPrimarySpeaker = conversationParticipant.isPrimarySpeaker();
        boolean isTalking = conversationParticipant.isTalking();
        boolean isScreenCaptureEnabled = conversationParticipant.isScreenCaptureEnabled();
        boolean equals = E.equals(callMemberId);
        boolean C = f9t.C(conversationParticipant);
        boolean isCreator = conversationParticipant.isCreator();
        boolean isAdmin = conversationParticipant.isAdmin();
        int i = a.$EnumSwitchMapping$0[conversationParticipant.getNetworkStatus().ordinal()];
        if (i == 1) {
            networkStatus = CallMember.NetworkStatus.GOOD;
        } else if (i == 2) {
            networkStatus = CallMember.NetworkStatus.MEDIUM;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            networkStatus = CallMember.NetworkStatus.BAD;
        }
        return new CallMember(E, audioOptionState, videoOptionState, watchTogetherOptionState, screenshareOptionState, isAudioEnabled, isVideoEnabled, isAnimojiEnabled, isScreenCaptureEnabled, isCallAccepted, isConnected, isPrimarySpeaker, isTalking, equals, C, isCreator, isAdmin, networkStatus, conversationParticipant.getMovies(), E.equals(callMemberId) && conversation.isMeInWaitingRoom());
    }
}
