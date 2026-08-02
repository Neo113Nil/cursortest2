package xsna;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SuggestedPostsStoreParams.kt */
/* loaded from: classes4.dex */
public final class i5n0 {
    public final qn60 a;
    public final pn60 b;
    public final eh60 c;
    public final s1v d;
    public final mo60 e;
    public final AtomicReference<wn60> f;
    public final crx0 g;
    public final w3n0 h;
    public final lvc0 i;
    public final com.vk.channels.impl.channel_screen.send_msg.c j;
    public final es60 k;

    public i5n0(qn60 qn60Var, pn60 pn60Var, eh60 eh60Var, s1v s1vVar, mo60 mo60Var, AtomicReference atomicReference, crx0 crx0Var, w3n0 w3n0Var, lvc0 lvc0Var, com.vk.channels.impl.channel_screen.send_msg.c cVar, es60 es60Var) {
        this.a = qn60Var;
        this.b = pn60Var;
        this.c = eh60Var;
        this.d = s1vVar;
        this.e = mo60Var;
        this.f = atomicReference;
        this.g = crx0Var;
        this.h = w3n0Var;
        this.i = lvc0Var;
        this.j = cVar;
        this.k = es60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5n0)) {
            return false;
        }
        i5n0 i5n0Var = (i5n0) obj;
        return this.a.equals(i5n0Var.a) && this.b.equals(i5n0Var.b) && this.c.equals(i5n0Var.c) && this.d.equals(i5n0Var.d) && this.e.equals(i5n0Var.e) && this.f.equals(i5n0Var.f) && this.g.equals(i5n0Var.g) && epx.f(this.h, i5n0Var.h) && this.i.equals(i5n0Var.i) && this.j.equals(i5n0Var.j) && this.k.equals(i5n0Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SuggestedPostsStoreParams(dataSet=" + this.a + ", itemsTransformer=" + this.b + ", deduplicator=" + this.c + ", positionSetter=" + this.d + ", listDependencies=" + this.e + ", lifecycleState=" + this.f + ", interactor=" + this.g + ", arguments=" + this.h + ", mappers=" + this.i + ", util=" + this.j + ", taskExecutorsDependencies=" + this.k + ')';
    }
}
