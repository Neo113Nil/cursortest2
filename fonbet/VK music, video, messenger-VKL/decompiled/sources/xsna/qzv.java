package xsna;

import com.vk.core.fragments.FragmentEntry;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ImContactMigrationListener.kt */
/* loaded from: classes.dex */
public final class qzv implements io.reactivex.rxjava3.functions.f<sxp> {
    public final a1w b;
    public final com.vk.core.fragments.a c;
    public final io.reactivex.rxjava3.disposables.b d;

    public qzv(a1w a1wVar, com.vk.core.fragments.a aVar, io.reactivex.rxjava3.disposables.b bVar) {
        this.b = a1wVar;
        this.c = aVar;
        this.d = bVar;
    }

    public final void a(Set<Long> set) {
        if (set.isEmpty()) {
            return;
        }
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        this.c.C(new dda(this, ref$IntRef, set, 3), false);
        int i = ref$IntRef.element;
        if (i > 0) {
            com.vk.metrics.eventtracking.b.a.m(Integer.valueOf(i), "UI.IM.CONTACT_UI_MIGRATION", "count");
        }
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(sxp sxpVar) {
        sxp sxpVar2 = sxpVar;
        if (!(sxpVar2 instanceof g480)) {
            if ((sxpVar2 instanceof OnCacheInvalidateEvent) && ((OnCacheInvalidateEvent) sxpVar2).c() == OnCacheInvalidateEvent.Reason.SPACE) {
                io.reactivex.rxjava3.internal.operators.single.b0 E = this.b.E("ContactMigrationListener", new jst());
                k5 k5Var = new k5(this, 24);
                int i = kwg0.a;
                this.d.b(E.subscribe(k5Var, new jwg0("ContactMigrationListener")));
                return;
            }
            return;
        }
        g480 g480Var = (g480) sxpVar2;
        long d = g480Var.d();
        long c = g480Var.c();
        com.vk.core.fragments.a aVar = this.c;
        androidx.lifecycle.f m = aVar.m();
        FragmentEntry fragmentEntry = ((m instanceof au90) && ((au90) m).v8(d)) ? new FragmentEntry(m.getClass(), ((au90) m).ok(d, c)) : null;
        a(Collections.singleton(Long.valueOf(d)));
        if (fragmentEntry != null) {
            aVar.q(fragmentEntry);
        }
    }
}
