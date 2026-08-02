package ru.ok.android.externcalls.sdk;

import java.util.Collection;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationAdaptersKt;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.add.AddParticipantsResult;
import ru.ok.android.webrtc.utils.Consumer;
import xsna.erj;
import xsna.m67;

/* compiled from: ConversationAdapters.kt */
/* loaded from: classes9.dex */
public final class ConversationAdaptersKt {
    public static final io.reactivex.rxjava3.core.a addParticipantByLinkCompletable(Conversation conversation, String str) {
        return new io.reactivex.rxjava3.internal.operators.completable.e(new erj(conversation, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addParticipantByLinkCompletable$lambda$0(Conversation conversation, String str, final io.reactivex.rxjava3.core.b bVar) {
        conversation.addParticipantByLink(str, new m67(bVar, 3), new Consumer() { // from class: xsna.frj
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                io.reactivex.rxjava3.core.b.this.onError((Throwable) obj);
            }
        });
    }

    public static final io.reactivex.rxjava3.core.x<AddParticipantsResult> addParticipants(final Conversation conversation, final Collection<ParticipantId> collection, final Boolean bool, final boolean z) {
        return new io.reactivex.rxjava3.internal.operators.single.b(new io.reactivex.rxjava3.core.a0() { // from class: xsna.drj
            @Override // io.reactivex.rxjava3.core.a0
            public final void subscribe(io.reactivex.rxjava3.core.y yVar) {
                ConversationAdaptersKt.addParticipants$lambda$0(Conversation.this, collection, bool, z, yVar);
            }
        });
    }

    public static /* synthetic */ io.reactivex.rxjava3.core.x addParticipants$default(Conversation conversation, Collection collection, Boolean bool, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return addParticipants(conversation, collection, bool, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addParticipants$lambda$0(Conversation conversation, Collection collection, Boolean bool, boolean z, io.reactivex.rxjava3.core.y yVar) {
        conversation.addParticipants(collection, bool, z, new ConversationAdaptersKt$addParticipants$1$1(yVar), new ConversationAdaptersKt$addParticipants$1$2(yVar));
    }
}
