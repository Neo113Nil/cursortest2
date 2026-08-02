package xsna;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: NewsfeedSearchStoreParams.kt */
/* loaded from: classes4.dex */
public final class qy60 {
    public final AtomicBoolean a;
    public final qn60 b;
    public final pn60 c;
    public final eh60 d;
    public final s1v e;
    public final mo60 f;
    public final AtomicReference<wn60> g;
    public final xw60 h;
    public final com.vk.channels.impl.channel_screen.send_msg.c i;
    public final rvu j;
    public final ca90 k;
    public final ca90 l;
    public final es60 m;
    public final c2f0 n;

    public qy60(AtomicBoolean atomicBoolean, qn60 qn60Var, pn60 pn60Var, eh60 eh60Var, s1v s1vVar, mo60 mo60Var, AtomicReference atomicReference, xw60 xw60Var, com.vk.channels.impl.channel_screen.send_msg.c cVar, rvu rvuVar, ca90 ca90Var, ca90 ca90Var2, es60 es60Var, c2f0 c2f0Var) {
        this.a = atomicBoolean;
        this.b = qn60Var;
        this.c = pn60Var;
        this.d = eh60Var;
        this.e = s1vVar;
        this.f = mo60Var;
        this.g = atomicReference;
        this.h = xw60Var;
        this.i = cVar;
        this.j = rvuVar;
        this.k = ca90Var;
        this.l = ca90Var2;
        this.m = es60Var;
        this.n = c2f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy60)) {
            return false;
        }
        qy60 qy60Var = (qy60) obj;
        return epx.f(this.a, qy60Var.a) && this.b.equals(qy60Var.b) && this.c.equals(qy60Var.c) && this.d.equals(qy60Var.d) && this.e.equals(qy60Var.e) && this.f.equals(qy60Var.f) && this.g.equals(qy60Var.g) && epx.f(this.h, qy60Var.h) && this.i.equals(qy60Var.i) && this.j.equals(qy60Var.j) && this.k.equals(qy60Var.k) && this.l.equals(qy60Var.l) && this.m.equals(qy60Var.m) && this.n.equals(qy60Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NewsfeedSearchStoreParams(isPreloadingNewsOnInitEnabled=" + this.a + ", dataSet=" + this.b + ", itemsTransformer=" + this.c + ", deduplicator=" + this.d + ", positionSetter=" + this.e + ", listDependencies=" + this.f + ", lifecycleState=" + this.g + ", arguments=" + this.h + ", util=" + this.i + ", mappers=" + this.j + ", pageSizeConfig=" + this.k + ", storiesPageSizeConfig=" + this.l + ", taskExecutorsDependencies=" + this.m + ", searchInteractor=" + this.n + ')';
    }
}
