package xsna;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: DiscoverSimilarFeedStoreParams.kt */
/* loaded from: classes4.dex */
public final class e9n {
    public final qn60 a;
    public final pn60 b;
    public final eh60 c;
    public final lu0 d;
    public final s1v e;
    public final mo60 f;
    public final AtomicReference<wn60> g;
    public final uv60 h;
    public final w6n i;
    public final com.vk.channels.impl.channel_screen.send_msg.c j;
    public final hap k;
    public final es60 l;

    public e9n(qn60 qn60Var, pn60 pn60Var, eh60 eh60Var, lu0 lu0Var, s1v s1vVar, mo60 mo60Var, AtomicReference atomicReference, uv60 uv60Var, w6n w6nVar, com.vk.channels.impl.channel_screen.send_msg.c cVar, hap hapVar, es60 es60Var) {
        this.a = qn60Var;
        this.b = pn60Var;
        this.c = eh60Var;
        this.d = lu0Var;
        this.e = s1vVar;
        this.f = mo60Var;
        this.g = atomicReference;
        this.h = uv60Var;
        this.i = w6nVar;
        this.j = cVar;
        this.k = hapVar;
        this.l = es60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9n)) {
            return false;
        }
        e9n e9nVar = (e9n) obj;
        return this.a.equals(e9nVar.a) && this.b.equals(e9nVar.b) && this.c.equals(e9nVar.c) && this.d.equals(e9nVar.d) && this.e.equals(e9nVar.e) && this.f.equals(e9nVar.f) && this.g.equals(e9nVar.g) && this.h.equals(e9nVar.h) && epx.f(this.i, e9nVar.i) && this.j.equals(e9nVar.j) && this.k.equals(e9nVar.k) && this.l.equals(e9nVar.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DiscoverSimilarFeedStoreParams(dataSet=" + this.a + ", itemsTransformer=" + this.b + ", deduplicator=" + this.c + ", adsAnomalyDetector=" + this.d + ", positionSetter=" + this.e + ", listDependencies=" + this.f + ", lifecycleState=" + this.g + ", interactor=" + this.h + ", arguments=" + this.i + ", util=" + this.j + ", mappers=" + this.k + ", taskExecutorsDependencies=" + this.l + ')';
    }
}
