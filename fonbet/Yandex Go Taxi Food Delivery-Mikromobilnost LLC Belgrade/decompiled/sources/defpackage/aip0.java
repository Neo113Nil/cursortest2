package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.f;
import androidx.compose.ui.semantics.g;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public final class aip0 extends e530 implements v0y, gnq0 {
    public oip0 a;
    public boolean b;

    @Override // defpackage.v0y
    public final int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        if (this.b) {
            i = Integer.MAX_VALUE;
        }
        return x910Var.k0(i);
    }

    @Override // defpackage.v0y
    public final int b(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        if (this.b) {
            i = Integer.MAX_VALUE;
        }
        return x910Var.e0(i);
    }

    @Override // defpackage.v0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        alb1.a(j, this.b ? Orientation.Vertical : Orientation.Horizontal);
        o l0 = x910Var.l0(n8e.b(0, j, this.b ? n8e.i(j) : Integer.MAX_VALUE, 0, this.b ? Integer.MAX_VALUE : n8e.h(j), 5));
        int i = l0.a;
        int i2 = n8e.i(j);
        if (i > i2) {
            i = i2;
        }
        int i3 = l0.b;
        int h = n8e.h(j);
        if (i3 > h) {
            i3 = h;
        }
        int i4 = l0.b - i3;
        int i5 = l0.a - i;
        if (!this.b) {
            i4 = i5;
        }
        oip0 oip0Var = this.a;
        yx40 yx40Var = oip0Var.e;
        yx40 yx40Var2 = oip0Var.a;
        yx40Var.setIntValue(i4);
        i2t0 D = tje.D();
        tls e = D != null ? D.e() : null;
        i2t0 O = tje.O(D);
        try {
            if (yx40Var2.getIntValue() > i4) {
                yx40Var2.setIntValue(i4);
            }
            tje.W(D, O, e);
            this.a.b.setIntValue(this.b ? i3 : i);
            this.a.c.setIntValue(this.b ? l0.b : l0.a);
            return kVar.w(i, i3, b.f(), new v45(this, i4, l0, 5));
        } catch (Throwable th) {
            tje.W(D, O, e);
            throw th;
        }
    }

    @Override // defpackage.v0y
    public final int l0(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        if (!this.b) {
            i = Integer.MAX_VALUE;
        }
        return x910Var.V(i);
    }

    @Override // defpackage.gnq0
    public final void u(mnq0 mnq0Var) {
        f.v(mnq0Var);
        final int i = 0;
        final int i2 = 1;
        bhp0 bhp0Var = new bhp0(new sls(this) { // from class: zhp0
            public final /* synthetic */ aip0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int intValue;
                int i3 = i;
                aip0 aip0Var = this.b;
                switch (i3) {
                    case 0:
                        intValue = aip0Var.a.a.getIntValue();
                        break;
                    default:
                        intValue = aip0Var.a.e.getIntValue();
                        break;
                }
                return Float.valueOf(intValue);
            }
        }, new sls(this) { // from class: zhp0
            public final /* synthetic */ aip0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int intValue;
                int i3 = i2;
                aip0 aip0Var = this.b;
                switch (i3) {
                    case 0:
                        intValue = aip0Var.a.a.getIntValue();
                        break;
                    default:
                        intValue = aip0Var.a.e.getIntValue();
                        break;
                }
                return Float.valueOf(intValue);
            }
        });
        if (this.b) {
            g gVar = d.w;
            kgx kgxVar = f.a[13];
            mnq0Var.a(gVar, bhp0Var);
        } else {
            g gVar2 = d.v;
            kgx kgxVar2 = f.a[12];
            mnq0Var.a(gVar2, bhp0Var);
        }
    }

    @Override // defpackage.v0y
    public final int v(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        if (!this.b) {
            i = Integer.MAX_VALUE;
        }
        return x910Var.y(i);
    }
}
