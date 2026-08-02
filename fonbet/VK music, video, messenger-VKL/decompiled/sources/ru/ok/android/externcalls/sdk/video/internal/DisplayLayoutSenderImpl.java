package ru.ok.android.externcalls.sdk.video.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;
import ru.ok.android.externcalls.sdk.video.DisplayLayoutSender;
import ru.ok.android.webrtc.layout.CallDisplayLayoutItem;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;
import ru.ok.android.webrtc.videotracks.VideoTrackType;
import xsna.izs;
import xsna.s3q0;

/* compiled from: DisplayLayoutSenderImpl.kt */
/* loaded from: classes9.dex */
public final class DisplayLayoutSenderImpl implements DisplayLayoutSender {
    private DisplayLayoutSender.SendFilter condition;
    private final izs<List<CallDisplayLayoutItem>, s3q0> sender;
    private final izs<ParticipantId, ConversationParticipant> store;

    /* JADX WARN: Multi-variable type inference failed */
    public DisplayLayoutSenderImpl(izs<? super ParticipantId, ? extends ConversationParticipant> izsVar, izs<? super List<CallDisplayLayoutItem>, s3q0> izsVar2) {
        this.store = izsVar;
        this.sender = izsVar2;
    }

    @Override // ru.ok.android.externcalls.sdk.video.DisplayLayoutSender
    public void applyFilter(DisplayLayoutSender.SendFilter sendFilter) {
        this.condition = sendFilter;
    }

    @Override // ru.ok.android.externcalls.sdk.video.DisplayLayoutSender
    public void sendDisplayLayouts(Collection<ConversationDisplayLayoutItem> collection) {
        CallParticipant.ParticipantId participantId;
        DisplayLayoutSender.SendFilter sendFilter = this.condition;
        if (sendFilter != null && !sendFilter.shouldSend()) {
            this.sender.invoke(EmptyList.b);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ConversationDisplayLayoutItem conversationDisplayLayoutItem : collection) {
            VideoTrackType type = conversationDisplayLayoutItem.getVideoTrackParticipantKey().getType();
            ConversationParticipant invoke = this.store.invoke(conversationDisplayLayoutItem.getVideoTrackParticipantKey().getParticipantId());
            if (invoke != null && invoke.isUseable() && (participantId = invoke.getCallParticipant().getParticipantId()) != null) {
                arrayList.add(new CallDisplayLayoutItem(new CallVideoTrackParticipantKey.Builder().setParticipantId(participantId).setType(type).setMovieId(conversationDisplayLayoutItem.getVideoTrackParticipantKey().getMovieId()).build(), conversationDisplayLayoutItem.getLayout()));
            }
        }
        this.sender.invoke(arrayList);
    }
}
