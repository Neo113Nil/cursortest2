package io.appmetrica.analytics.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.OuterStateToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.SavableToggle;
import xsna.e43;

/* loaded from: classes8.dex */
public final class J {
    public final C4937jf a = C5342za.k().y();
    public final SavableToggle b;
    public final OuterStateToggle c;
    public final OuterStateToggle d;
    public final ConjunctiveCompositeThreadSafeToggle e;
    public final ConjunctiveCompositeThreadSafeToggle f;
    public final SavableToggle g;

    public J(C5100pm c5100pm) {
        SavableToggle savableToggle = new SavableToggle("advIdsFromClientApi", new I(this));
        this.b = savableToggle;
        OuterStateToggle outerStateToggle = new OuterStateToggle(false, "GAID-remote-config");
        this.c = outerStateToggle;
        OuterStateToggle outerStateToggle2 = new OuterStateToggle(false, "HOAID-remote-config");
        this.d = outerStateToggle2;
        this.e = new ConjunctiveCompositeThreadSafeToggle(e43.l(savableToggle, outerStateToggle), IronSourceConstants.TYPE_GAID);
        this.f = new ConjunctiveCompositeThreadSafeToggle(e43.l(savableToggle, outerStateToggle2), "HOAID");
        this.g = savableToggle;
        a(c5100pm);
    }

    public final void a(C5100pm c5100pm) {
        boolean z = c5100pm.p;
        boolean z2 = true;
        this.c.update(!z || c5100pm.n.c);
        OuterStateToggle outerStateToggle = this.d;
        if (z && !c5100pm.n.e) {
            z2 = false;
        }
        outerStateToggle.update(z2);
    }

    public final G a() {
        int i;
        int i2 = 3;
        int i3 = 4;
        if (this.e.getActualState()) {
            i = 1;
        } else if (this.b.getActualState()) {
            i = !this.c.getActualState() ? 3 : 4;
        } else {
            i = 2;
        }
        if (this.f.getActualState()) {
            i2 = 1;
        } else if (!this.b.getActualState()) {
            i2 = 2;
        } else if (this.d.getActualState()) {
            i2 = 4;
        }
        if (this.g.getActualState()) {
            i3 = 1;
        } else if (!this.b.getActualState()) {
            i3 = 2;
        }
        return new G(i, i2, i3);
    }
}
