package xsna;

import java.util.Set;
import one.video.calls.sdk.experiments.ExperimentsInterface;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.Action;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ActionResult;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.InternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.MappingContext;
import ru.ok.android.externcalls.sdk.stat.warmup.ConversationPreparedStat;
import ru.ok.android.webrtc.RTCLog;

/* compiled from: PrepareBase.kt */
@CallInternalApi
/* loaded from: classes8.dex */
public abstract class y1d0<P> implements Action<P, b> {
    public final InternalIdsResolver a;
    public final ExternalIdsResolver b;
    public final ConversationPreparedStat c;
    public final boolean d;
    public final boolean e;
    public final RTCLog f;
    public final ConversationParticipant g;
    public final ExperimentsInterface h;

    /* compiled from: PrepareBase.kt */
    public static final class a {
    }

    /* compiled from: PrepareBase.kt */
    public static final class b implements ActionResult {
        public final ConversationParams a;
        public final Set<ParticipantId> b;

        public b(ConversationParams conversationParams, Set<ParticipantId> set) {
            this.a = conversationParams;
            this.b = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            ConversationParams conversationParams = this.a;
            return this.b.hashCode() + ((conversationParams == null ? 0 : conversationParams.hashCode()) * 31);
        }

        public final String toString() {
            return "PrepareResult(conversationParams=" + this.a + ", unresolvedParticipantIds=" + this.b + ")";
        }
    }

    public y1d0(InternalIdsResolver internalIdsResolver, ExternalIdsResolver externalIdsResolver, ConversationPreparedStat conversationPreparedStat, boolean z, boolean z2, RTCLog rTCLog, ConversationParticipant conversationParticipant, ExperimentsInterface experimentsInterface) {
        this.a = internalIdsResolver;
        this.b = externalIdsResolver;
        this.c = conversationPreparedStat;
        this.d = z;
        this.e = z2;
        this.f = rTCLog;
        this.g = conversationParticipant;
        this.h = experimentsInterface;
    }

    public final io.reactivex.rxjava3.internal.operators.single.m a(boolean z, gzs gzsVar) {
        io.reactivex.rxjava3.core.x l;
        if (this.e || z) {
            l = ((io.reactivex.rxjava3.core.x) gzsVar.invoke()).l(new d2d0());
        } else {
            ExperimentsInterface experimentsInterface = this.h;
            boolean R = experimentsInterface.R();
            RTCLog rTCLog = this.f;
            MappingContext mappingContext = new MappingContext(rTCLog, R);
            boolean q = experimentsInterface.q();
            boolean z2 = this.d;
            InternalIdsResolver internalIdsResolver = this.a;
            if (q) {
                ConversationParticipant conversationParticipant = this.g;
                if ((conversationParticipant != null ? conversationParticipant.getInternalId() : null) != null) {
                    l = ((io.reactivex.rxjava3.core.x) gzsVar.invoke()).l(new b2d0());
                } else {
                    io.reactivex.rxjava3.core.b0 b0Var = (io.reactivex.rxjava3.core.b0) gzsVar.invoke();
                    io.reactivex.rxjava3.core.x<Set<ParticipantId>> resolveIdsAndGetFailed = internalIdsResolver.resolveIdsAndGetFailed(mappingContext);
                    l = io.reactivex.rxjava3.core.x.B(b0Var, z2 ? RetryKt.retryApiCallForIncoming(resolveIdsAndGetFailed, rTCLog) : RetryKt.retryApiCallForOutgoing(resolveIdsAndGetFailed, rTCLog), c2d0.b);
                }
            } else {
                io.reactivex.rxjava3.core.b0 b0Var2 = (io.reactivex.rxjava3.core.b0) gzsVar.invoke();
                io.reactivex.rxjava3.core.x<Set<ParticipantId>> resolveIdsAndGetFailed2 = internalIdsResolver.resolveIdsAndGetFailed(mappingContext);
                io.reactivex.rxjava3.core.x retryApiCallForIncoming = z2 ? RetryKt.retryApiCallForIncoming(resolveIdsAndGetFailed2, rTCLog) : RetryKt.retryApiCallForOutgoing(resolveIdsAndGetFailed2, rTCLog);
                ExternalIdsResolver externalIdsResolver = this.b;
                io.reactivex.rxjava3.internal.operators.completable.c0 t = externalIdsResolver.resolveIds(externalIdsResolver.collectExternalIdResolutionCandidates(), mappingContext).t(s3q0.a);
                l = io.reactivex.rxjava3.core.x.A(b0Var2, retryApiCallForIncoming, z2 ? RetryKt.retryApiCallForIncoming(t, rTCLog) : RetryKt.retryApiCallForOutgoing(t, rTCLog), a2d0.b);
            }
        }
        return new io.reactivex.rxjava3.internal.operators.single.m(l, new e2d0(this));
    }
}
