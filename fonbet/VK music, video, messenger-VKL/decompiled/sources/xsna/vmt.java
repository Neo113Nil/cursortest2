package xsna;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: GeoPostsStoreParams.kt */
/* loaded from: classes4.dex */
public final class vmt {
    public final String a;
    public final qn60 b;
    public final pn60 c;
    public final eh60 d;
    public final s1v e;
    public final mo60 f;
    public final AtomicReference<wn60> g;
    public final nl h;
    public final elt i;
    public final com.vk.channels.impl.channel_screen.send_msg.c j;
    public final zlt k;
    public final es60 l;

    public vmt(String str, qn60 qn60Var, pn60 pn60Var, eh60 eh60Var, s1v s1vVar, mo60 mo60Var, AtomicReference atomicReference, nl nlVar, elt eltVar, com.vk.channels.impl.channel_screen.send_msg.c cVar, zlt zltVar, es60 es60Var) {
        this.a = str;
        this.b = qn60Var;
        this.c = pn60Var;
        this.d = eh60Var;
        this.e = s1vVar;
        this.f = mo60Var;
        this.g = atomicReference;
        this.h = nlVar;
        this.i = eltVar;
        this.j = cVar;
        this.k = zltVar;
        this.l = es60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vmt)) {
            return false;
        }
        vmt vmtVar = (vmt) obj;
        return epx.f(this.a, vmtVar.a) && this.b.equals(vmtVar.b) && this.c.equals(vmtVar.c) && this.d.equals(vmtVar.d) && this.e.equals(vmtVar.e) && this.f.equals(vmtVar.f) && this.g.equals(vmtVar.g) && this.h.equals(vmtVar.h) && epx.f(this.i, vmtVar.i) && this.j.equals(vmtVar.j) && this.k.equals(vmtVar.k) && this.l.equals(vmtVar.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GeoPostsStoreParams(title=" + this.a + ", dataSet=" + this.b + ", itemsTransformer=" + this.c + ", deduplicator=" + this.d + ", positionSetter=" + this.e + ", listDependencies=" + this.f + ", lifecycleState=" + this.g + ", interactor=" + this.h + ", arguments=" + this.i + ", util=" + this.j + ", mappers=" + this.k + ", taskExecutorsDependencies=" + this.l + ')';
    }
}
