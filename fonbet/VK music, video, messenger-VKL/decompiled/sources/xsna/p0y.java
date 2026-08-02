package xsna;

import one.video.calls.sdk.experiments.ExperimentsInterface;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ActionParams;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.InternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.peer.PeerIdGenerator;
import ru.ok.android.externcalls.sdk.stat.warmup.ConversationPreparedStat;
import ru.ok.android.webrtc.ConversationIdProvider;
import ru.ok.android.webrtc.RTCLog;
import xsna.y1d0;

/* compiled from: JoinPrepare.kt */
@CallInternalApi
/* loaded from: classes8.dex */
public final class p0y extends y1d0<a> {
    public final OkApiServiceInternal i;
    public final ConversationIdProvider j;
    public final StartCallApiParams k;
    public final PeerIdGenerator l;

    /* compiled from: JoinPrepare.kt */
    public static final class a implements ActionParams {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return ss9.a("Params(initialJoinLink=", this.a, ", anonToken=", this.b, ")");
        }
    }

    public p0y(OkApiServiceInternal okApiServiceInternal, ConversationIdProvider conversationIdProvider, InternalIdsResolver internalIdsResolver, ExternalIdsResolver externalIdsResolver, StartCallApiParams startCallApiParams, PeerIdGenerator peerIdGenerator, ConversationPreparedStat conversationPreparedStat, boolean z, boolean z2, RTCLog rTCLog, ConversationParticipant conversationParticipant, ExperimentsInterface experimentsInterface) {
        super(internalIdsResolver, externalIdsResolver, conversationPreparedStat, z, z2, rTCLog, conversationParticipant, experimentsInterface);
        this.i = okApiServiceInternal;
        this.j = conversationIdProvider;
        this.k = startCallApiParams;
        this.l = peerIdGenerator;
    }

    @Override // ru.ok.android.externcalls.sdk.conversation.internal.actions.Action
    public final io.reactivex.rxjava3.core.x<y1d0.b> execute(ActionParams actionParams) {
        return a(true, new uk(11, this, (a) actionParams));
    }
}
