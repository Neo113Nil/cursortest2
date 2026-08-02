package androidx.compose.ui.graphics;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.s;
import androidx.compose.ui.semantics.f;
import defpackage.aa10;
import defpackage.e530;
import defpackage.ehr0;
import defpackage.gnq0;
import defpackage.i2t0;
import defpackage.m2k0;
import defpackage.mnq0;
import defpackage.qje;
import defpackage.rzo;
import defpackage.tje;
import defpackage.tls;
import defpackage.v0y;
import defpackage.x910;
import defpackage.zy11;

/* loaded from: classes.dex */
public final class b extends e530 implements v0y, gnq0 {
    public tls a;

    public b(tls tlsVar) {
        this.a = tlsVar;
    }

    @Override // defpackage.gnq0
    public final boolean U() {
        return false;
    }

    @Override // defpackage.v0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        final o l0 = x910Var.l0(j);
        return kVar.w(l0.a, l0.b, kotlin.collections.b.f(), new tls() { // from class: androidx.compose.ui.graphics.BlockGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                o.a.x((o.a) obj, o.this, 0, 0, this.a, 4);
                return zy11.a;
            }
        });
    }

    @Override // defpackage.e530
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.a + ')';
    }

    @Override // defpackage.gnq0
    public final void u(mnq0 mnq0Var) {
        ehr0 ehr0Var;
        boolean z;
        s N = qje.N(this, 2);
        if (N.b0) {
            ehr0Var = N.Z;
            z = N.a0;
        } else {
            m2k0 m2k0Var = d.a;
            if (m2k0Var == null) {
                d.a = new m2k0();
            } else {
                m2k0Var.a();
            }
            m2k0 m2k0Var2 = d.a;
            m2k0Var2.K = N.I.R;
            m2k0Var2.J = rzo.a0(N.c);
            i2t0 D = tje.D();
            tls e = D != null ? D.e() : null;
            i2t0 O = tje.O(D);
            try {
                this.a.invoke(m2k0Var2);
                tje.W(D, O, e);
                ehr0Var = m2k0Var2.G;
                z = m2k0Var2.H;
            } catch (Throwable th) {
                tje.W(D, O, e);
                throw th;
            }
        }
        if (z) {
            f.r(mnq0Var, ehr0Var);
        }
    }
}
