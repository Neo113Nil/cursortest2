package xsna;

import com.vk.catalog2.feature.music.holders.MusicRecommendedPlaylistVh;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.VoipCallActivity;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection;

/* compiled from: MusicRecommendedPlaylistVh.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class r350 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b = 0;

    public /* synthetic */ r350(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((MusicRecommendedPlaylistVh) this.receiver).e());
            default:
                VoipCallActivity voipCallActivity = (VoipCallActivity) this.receiver;
                int i = VoipCallActivity.P;
                voipCallActivity.getClass();
                if (!OKVoipEngine.b.H()) {
                    Conversation conversation = OKVoipEngine.E.getConversation();
                    if (conversation != null) {
                        ParticipantCollection participants = conversation.getParticipants();
                        ParticipantId externalId = conversation.getMe().getExternalId();
                        if (participants == null || !participants.isEmpty()) {
                            for (ConversationParticipant conversationParticipant : participants) {
                                if (epx.f(conversationParticipant.getExternalId(), externalId) || (!conversationParticipant.isAdmin() && !conversationParticipant.isCreator())) {
                                }
                            }
                        }
                    }
                    z = true;
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
        }
    }

    public r350(Object obj) {
        super(0, obj, VoipCallActivity.class, "checkIfShouldShowGrantAdminDialogWhenEndForAll", "checkIfShouldShowGrantAdminDialogWhenEndForAll()Z", 0);
    }
}
