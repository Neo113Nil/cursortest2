package ru.ok.android.externcalls.sdk.chat.internal.command;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.chat.internal.command.ChatCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.chat.message.OutboundMessage;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.cq;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ChatCommandExecutorImpl.kt */
/* loaded from: classes9.dex */
public final class ChatCommandExecutorImpl implements ChatCommandExecutor {
    private final ParticipantStore participantStore;
    private final SignalingProvider signalingProvider;

    public ChatCommandExecutorImpl(SignalingProvider signalingProvider, ParticipantStore participantStore) {
        this.signalingProvider = signalingProvider;
        this.participantStore = participantStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendMessage$lambda$1(gzs gzsVar, JSONObject jSONObject) {
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendMessage$lambda$2(izs izsVar, JSONObject jSONObject) {
        if (izsVar != null) {
            izsVar.invoke(new RuntimeException(cq.c("Send message error ", jSONObject)));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.chat.internal.command.ChatCommandExecutor
    public void sendMessage(OutboundMessage outboundMessage, final gzs<s3q0> gzsVar, final izs<? super Throwable, s3q0> izsVar) {
        ConversationParticipant conversationParticipant;
        Signaling signaling = SignalingProviderKt.get(this.signalingProvider, izsVar);
        if (signaling == null) {
            return;
        }
        ParticipantId participantId = outboundMessage.getParticipantId();
        if (participantId != null) {
            conversationParticipant = this.participantStore.getByExternal(participantId);
            if (conversationParticipant == null) {
                if (izsVar != null) {
                    izsVar.invoke(new NullPointerException("Couldn't find a ConversationParticipant for participantId=" + participantId));
                    return;
                }
                return;
            }
        } else {
            conversationParticipant = null;
        }
        signaling.send(SignalingProtocol.createChatMessage(conversationParticipant != null ? conversationParticipant.getInternalId() : null, outboundMessage.getText()), new Signaling.Listener() { // from class: xsna.opb
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                ChatCommandExecutorImpl.sendMessage$lambda$1(gzs.this, jSONObject);
            }
        }, new Signaling.Listener() { // from class: xsna.ppb
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                ChatCommandExecutorImpl.sendMessage$lambda$2(izs.this, jSONObject);
            }
        });
    }
}
