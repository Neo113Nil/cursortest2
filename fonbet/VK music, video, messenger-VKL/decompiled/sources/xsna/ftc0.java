package xsna;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PostponedPostsStoreParams.kt */
/* loaded from: classes4.dex */
public final class ftc0 {
    public final qn60 a;
    public final pn60 b;
    public final eh60 c;
    public final s1v d;
    public final mo60 e;
    public final AtomicReference<wn60> f;
    public final s1v g;
    public final drc0 h;
    public final esc0 i;
    public final com.vk.channels.impl.channel_screen.send_msg.c j;
    public final es60 k;

    public ftc0(qn60 qn60Var, pn60 pn60Var, eh60 eh60Var, s1v s1vVar, mo60 mo60Var, AtomicReference atomicReference, s1v s1vVar2, drc0 drc0Var, esc0 esc0Var, com.vk.channels.impl.channel_screen.send_msg.c cVar, es60 es60Var) {
        this.a = qn60Var;
        this.b = pn60Var;
        this.c = eh60Var;
        this.d = s1vVar;
        this.e = mo60Var;
        this.f = atomicReference;
        this.g = s1vVar2;
        this.h = drc0Var;
        this.i = esc0Var;
        this.j = cVar;
        this.k = es60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftc0)) {
            return false;
        }
        ftc0 ftc0Var = (ftc0) obj;
        return this.a.equals(ftc0Var.a) && this.b.equals(ftc0Var.b) && this.c.equals(ftc0Var.c) && this.d.equals(ftc0Var.d) && this.e.equals(ftc0Var.e) && this.f.equals(ftc0Var.f) && this.g.equals(ftc0Var.g) && epx.f(this.h, ftc0Var.h) && this.i.equals(ftc0Var.i) && this.j.equals(ftc0Var.j) && this.k.equals(ftc0Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PostponedPostsStoreParams(dataSet=" + this.a + ", itemsTransformer=" + this.b + ", deduplicator=" + this.c + ", positionSetter=" + this.d + ", listDependencies=" + this.e + ", lifecycleState=" + this.f + ", interactor=" + this.g + ", arguments=" + this.h + ", mappers=" + this.i + ", util=" + this.j + ", taskExecutorsDependencies=" + this.k + ')';
    }
}
