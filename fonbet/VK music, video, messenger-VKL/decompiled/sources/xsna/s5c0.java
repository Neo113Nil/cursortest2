package xsna;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PostMviStoreParams.kt */
/* loaded from: classes4.dex */
public final class s5c0 {
    public final qn60 a;
    public final pn60 b;
    public final eh60 c;
    public final s1v d;
    public final mo60 e;
    public final AtomicReference<wn60> f;
    public final zq70 g;
    public final f0c0 h;
    public final com.vk.channels.impl.channel_screen.send_msg.c i;
    public final g5c0 j;
    public final es60 k;

    public s5c0(qn60 qn60Var, pn60 pn60Var, eh60 eh60Var, s1v s1vVar, mo60 mo60Var, AtomicReference atomicReference, zq70 zq70Var, f0c0 f0c0Var, com.vk.channels.impl.channel_screen.send_msg.c cVar, g5c0 g5c0Var, es60 es60Var) {
        this.a = qn60Var;
        this.b = pn60Var;
        this.c = eh60Var;
        this.d = s1vVar;
        this.e = mo60Var;
        this.f = atomicReference;
        this.g = zq70Var;
        this.h = f0c0Var;
        this.i = cVar;
        this.j = g5c0Var;
        this.k = es60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5c0)) {
            return false;
        }
        s5c0 s5c0Var = (s5c0) obj;
        return this.a.equals(s5c0Var.a) && this.b.equals(s5c0Var.b) && this.c.equals(s5c0Var.c) && this.d.equals(s5c0Var.d) && this.e.equals(s5c0Var.e) && this.f.equals(s5c0Var.f) && this.g.equals(s5c0Var.g) && epx.f(this.h, s5c0Var.h) && this.i.equals(s5c0Var.i) && this.j.equals(s5c0Var.j) && this.k.equals(s5c0Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PostMviStoreParams(dataSet=" + this.a + ", itemsTransformer=" + this.b + ", deduplicator=" + this.c + ", positionSetter=" + this.d + ", listDependencies=" + this.e + ", lifecycleState=" + this.f + ", interactor=" + this.g + ", arguments=" + this.h + ", util=" + this.i + ", mappers=" + this.j + ", taskExecutorsDependencies=" + this.k + ')';
    }
}
