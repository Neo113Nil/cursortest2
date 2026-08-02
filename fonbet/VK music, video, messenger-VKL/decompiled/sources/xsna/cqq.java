package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FaveFeedStoreParams.kt */
/* loaded from: classes4.dex */
public final class cqq {
    public final s1c0 a;
    public final MobileOfficialAppsCoreNavStat$EventScreen b;
    public final qn60 c;
    public final pn60 d;
    public final eh60 e;
    public final s1v f;
    public final mo60 g;
    public final AtomicReference<wn60> h;
    public final aqw i;
    public final zqq j;
    public final cpq k;
    public final com.vk.channels.impl.channel_screen.send_msg.c l;
    public final es60 m;

    public cqq(s1c0 s1c0Var, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, qn60 qn60Var, pn60 pn60Var, eh60 eh60Var, s1v s1vVar, mo60 mo60Var, AtomicReference atomicReference, aqw aqwVar, zqq zqqVar, cpq cpqVar, com.vk.channels.impl.channel_screen.send_msg.c cVar, es60 es60Var) {
        this.a = s1c0Var;
        this.b = mobileOfficialAppsCoreNavStat$EventScreen;
        this.c = qn60Var;
        this.d = pn60Var;
        this.e = eh60Var;
        this.f = s1vVar;
        this.g = mo60Var;
        this.h = atomicReference;
        this.i = aqwVar;
        this.j = zqqVar;
        this.k = cpqVar;
        this.l = cVar;
        this.m = es60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqq)) {
            return false;
        }
        cqq cqqVar = (cqq) obj;
        return epx.f(this.a, cqqVar.a) && this.b == cqqVar.b && this.c.equals(cqqVar.c) && this.d.equals(cqqVar.d) && this.e.equals(cqqVar.e) && this.f.equals(cqqVar.f) && this.g.equals(cqqVar.g) && this.h.equals(cqqVar.h) && this.i.equals(cqqVar.i) && epx.f(this.j, cqqVar.j) && this.k.equals(cqqVar.k) && this.l.equals(cqqVar.l) && this.m.equals(cqqVar.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "FaveFeedStoreParams(displayContext=" + this.a + ", screenName=" + this.b + ", dataSet=" + this.c + ", itemsTransformer=" + this.d + ", deduplicator=" + this.e + ", positionSetter=" + this.f + ", listDependencies=" + this.g + ", lifecycleState=" + this.h + ", interactor=" + this.i + ", arguments=" + this.j + ", mappers=" + this.k + ", util=" + this.l + ", taskExecutorsDependencies=" + this.m + ')';
    }
}
