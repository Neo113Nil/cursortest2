package androidx.fragment.app;

import defpackage.iot0;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d0 extends iot0 {
    public final w l;

    public d0(SpecialEffectsController$Operation$State specialEffectsController$Operation$State, SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact, w wVar) {
        super(specialEffectsController$Operation$State, specialEffectsController$Operation$LifecycleImpact, wVar.c);
        this.l = wVar;
    }

    @Override // defpackage.iot0
    public final void b() {
        this.h = false;
        if (!this.f) {
            if (FragmentManager.O(2)) {
                toString();
            }
            this.f = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.c.mTransitioning = false;
        this.l.i();
    }
}
