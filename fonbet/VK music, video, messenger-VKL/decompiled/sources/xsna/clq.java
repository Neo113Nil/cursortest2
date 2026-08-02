package xsna;

import one.video.calls.sdk.experiments.ExperimentsInterface;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ActionParams;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.InternalIdsResolver;
import ru.ok.android.externcalls.sdk.stat.warmup.ConversationPreparedStat;
import ru.ok.android.webrtc.ConversationIdProvider;
import ru.ok.android.webrtc.RTCLog;
import xsna.y1d0;

/* compiled from: FastJoinPrepare.kt */
@CallInternalApi
/* loaded from: classes8.dex */
public final class clq extends y1d0<a> {
    public final ConversationIdProvider i;

    /* compiled from: FastJoinPrepare.kt */
    public static final class a implements ActionParams {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public clq(qkx qkxVar, ConversationIdProvider conversationIdProvider, InternalIdsResolver internalIdsResolver, ExternalIdsResolver externalIdsResolver, ConversationPreparedStat conversationPreparedStat, boolean z, boolean z2, RTCLog rTCLog, ConversationParticipant conversationParticipant, ExperimentsInterface experimentsInterface) {
        super(internalIdsResolver, externalIdsResolver, conversationPreparedStat, z, z2, rTCLog, conversationParticipant, experimentsInterface);
        this.i = conversationIdProvider;
    }

    @Override // ru.ok.android.externcalls.sdk.conversation.internal.actions.Action
    public final io.reactivex.rxjava3.core.x<y1d0.b> execute(ActionParams actionParams) {
        return new io.reactivex.rxjava3.internal.operators.single.e0(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.v(new blq(0, (a) actionParams, this)).l(new dlq(this)), new elq(this)), new flq(this)).q(io.reactivex.rxjava3.schedulers.a.b());
    }
}
