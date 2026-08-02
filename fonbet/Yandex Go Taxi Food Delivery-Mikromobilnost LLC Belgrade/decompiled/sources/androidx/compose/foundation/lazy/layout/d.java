package androidx.compose.foundation.lazy.layout;

import defpackage.fwi;
import defpackage.gl11;
import defpackage.gtq0;
import defpackage.i2t0;
import defpackage.kj2;
import defpackage.pzt0;
import defpackage.sj2;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.uh6;

/* loaded from: classes10.dex */
public final class d {
    public pzt0 a;
    public kj2 b;

    public d() {
        gl11 gl11Var = gtq0.f;
        Float valueOf = Float.valueOf(0.0f);
        this.b = new kj2(gl11Var, valueOf, (sj2) gl11Var.a.invoke(valueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final void a() {
        pzt0 pzt0Var = this.a;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.b = new kj2(gtq0.f, Float.valueOf(0.0f), null, 60);
    }

    public final void b(float f, fwi fwiVar, tse tseVar) {
        if (f <= fwiVar.w0(1.0f)) {
            return;
        }
        i2t0 D = tje.D();
        tls e = D != null ? D.e() : null;
        i2t0 O = tje.O(D);
        try {
            float floatValue = ((Number) this.b.b.getValue()).floatValue();
            pzt0 pzt0Var = this.a;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            kj2 kj2Var = this.b;
            if (kj2Var.y) {
                this.b = uh6.l(kj2Var, floatValue - f, 0.0f, 30);
            } else {
                this.b = new kj2(gtq0.f, Float.valueOf(-f), null, 60);
            }
            this.a = tje.N(tseVar, null, null, new LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1(this, null), 3);
            tje.W(D, O, e);
        } catch (Throwable th) {
            tje.W(D, O, e);
            throw th;
        }
    }
}
