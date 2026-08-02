package xsna;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: UserProfileWallStoreParams.kt */
/* loaded from: classes4.dex */
public final class fxq0 {
    public final qn60 a;
    public final pn60 b;
    public final eh60 c;
    public final s1v d;
    public final mo60 e;
    public final AtomicReference<wn60> f;
    public final h0b g;
    public final com.vk.channels.impl.channel_screen.send_msg.c h;
    public final es60 i;
    public final a5i j;
    public final jvq0 k;
    public final sxy l;

    public fxq0(qn60 qn60Var, pn60 pn60Var, eh60 eh60Var, s1v s1vVar, mo60 mo60Var, AtomicReference atomicReference, h0b h0bVar, com.vk.channels.impl.channel_screen.send_msg.c cVar, es60 es60Var, a5i a5iVar, jvq0 jvq0Var, sxy sxyVar) {
        this.a = qn60Var;
        this.b = pn60Var;
        this.c = eh60Var;
        this.d = s1vVar;
        this.e = mo60Var;
        this.f = atomicReference;
        this.g = h0bVar;
        this.h = cVar;
        this.i = es60Var;
        this.j = a5iVar;
        this.k = jvq0Var;
        this.l = sxyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxq0)) {
            return false;
        }
        fxq0 fxq0Var = (fxq0) obj;
        return this.a.equals(fxq0Var.a) && this.b.equals(fxq0Var.b) && this.c.equals(fxq0Var.c) && this.d.equals(fxq0Var.d) && this.e.equals(fxq0Var.e) && this.f.equals(fxq0Var.f) && this.g.equals(fxq0Var.g) && this.h.equals(fxq0Var.h) && this.i.equals(fxq0Var.i) && epx.f(this.j, fxq0Var.j) && this.k.equals(fxq0Var.k) && this.l.equals(fxq0Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "UserProfileWallStoreParams(dataSet=" + this.a + ", itemsTransformer=" + this.b + ", deduplicator=" + this.c + ", positionSetter=" + this.d + ", listDependencies=" + this.e + ", lifecycleState=" + this.f + ", mappers=" + this.g + ", util=" + this.h + ", taskExecutorsDependencies=" + this.i + ", communityWallBus=" + this.j + ", arguments=" + this.k + ", interactor=" + this.l + ')';
    }
}
