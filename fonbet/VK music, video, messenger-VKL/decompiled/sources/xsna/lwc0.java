package xsna;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PostsFromNotificationsStoreParams.kt */
/* loaded from: classes4.dex */
public final class lwc0 {
    public final qn60 a;
    public final pn60 b;
    public final eh60 c;
    public final s1v d;
    public final mo60 e;
    public final AtomicReference<wn60> f;
    public final f870 g;
    public final muc0 h;
    public final com.vk.channels.impl.channel_screen.send_msg.c i;
    public final lvc0 j;
    public final es60 k;

    public lwc0(qn60 qn60Var, pn60 pn60Var, eh60 eh60Var, s1v s1vVar, mo60 mo60Var, AtomicReference atomicReference, f870 f870Var, muc0 muc0Var, com.vk.channels.impl.channel_screen.send_msg.c cVar, lvc0 lvc0Var, es60 es60Var) {
        this.a = qn60Var;
        this.b = pn60Var;
        this.c = eh60Var;
        this.d = s1vVar;
        this.e = mo60Var;
        this.f = atomicReference;
        this.g = f870Var;
        this.h = muc0Var;
        this.i = cVar;
        this.j = lvc0Var;
        this.k = es60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwc0)) {
            return false;
        }
        lwc0 lwc0Var = (lwc0) obj;
        return this.a.equals(lwc0Var.a) && this.b.equals(lwc0Var.b) && this.c.equals(lwc0Var.c) && this.d.equals(lwc0Var.d) && this.e.equals(lwc0Var.e) && this.f.equals(lwc0Var.f) && this.g.equals(lwc0Var.g) && epx.f(this.h, lwc0Var.h) && this.i.equals(lwc0Var.i) && this.j.equals(lwc0Var.j) && this.k.equals(lwc0Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PostsFromNotificationsStoreParams(dataSet=" + this.a + ", itemsTransformer=" + this.b + ", deduplicator=" + this.c + ", positionSetter=" + this.d + ", listDependencies=" + this.e + ", lifecycleState=" + this.f + ", interactor=" + this.g + ", arguments=" + this.h + ", util=" + this.i + ", mappers=" + this.j + ", taskExecutorsDependencies=" + this.k + ')';
    }
}
