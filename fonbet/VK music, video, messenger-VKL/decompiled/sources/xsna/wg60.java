package xsna;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: NewsfeedCustomStoreParams.kt */
/* loaded from: classes4.dex */
public final class wg60 {
    public final AtomicBoolean a;
    public final qn60 b;
    public final pn60 c;
    public final eh60 d;
    public final s1v e;
    public final mo60 f;
    public final AtomicReference<wn60> g;
    public final ue60 h;
    public final com.vk.channels.impl.channel_screen.send_msg.c i;
    public final tf60 j;
    public final o1n k;
    public final lu0 l;
    public final es60 m;

    public wg60(AtomicBoolean atomicBoolean, qn60 qn60Var, pn60 pn60Var, eh60 eh60Var, s1v s1vVar, mo60 mo60Var, AtomicReference atomicReference, ue60 ue60Var, com.vk.channels.impl.channel_screen.send_msg.c cVar, tf60 tf60Var, o1n o1nVar, lu0 lu0Var, es60 es60Var) {
        this.a = atomicBoolean;
        this.b = qn60Var;
        this.c = pn60Var;
        this.d = eh60Var;
        this.e = s1vVar;
        this.f = mo60Var;
        this.g = atomicReference;
        this.h = ue60Var;
        this.i = cVar;
        this.j = tf60Var;
        this.k = o1nVar;
        this.l = lu0Var;
        this.m = es60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg60)) {
            return false;
        }
        wg60 wg60Var = (wg60) obj;
        return epx.f(this.a, wg60Var.a) && this.b.equals(wg60Var.b) && this.c.equals(wg60Var.c) && this.d.equals(wg60Var.d) && this.e.equals(wg60Var.e) && this.f.equals(wg60Var.f) && this.g.equals(wg60Var.g) && epx.f(this.h, wg60Var.h) && this.i.equals(wg60Var.i) && this.j.equals(wg60Var.j) && this.k.equals(wg60Var.k) && this.l.equals(wg60Var.l) && this.m.equals(wg60Var.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NewsfeedCustomStoreParams(isPreloadingNewsOnInitEnabled=" + this.a + ", dataSet=" + this.b + ", itemsTransformer=" + this.c + ", deduplicator=" + this.d + ", positionSetter=" + this.e + ", listDependencies=" + this.f + ", lifecycleState=" + this.g + ", arguments=" + this.h + ", util=" + this.i + ", mappers=" + this.j + ", cache=" + this.k + ", adsAnomalyDetector=" + this.l + ", taskExecutorsDependencies=" + this.m + ')';
    }
}
