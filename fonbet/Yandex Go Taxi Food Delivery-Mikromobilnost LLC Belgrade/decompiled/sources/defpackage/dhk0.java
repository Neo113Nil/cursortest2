package defpackage;

import android.view.View;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes14.dex */
public final class dhk0 implements ghk0 {
    public final ComposeView a;
    public final p9y0 b;
    public final oz40 c = f.j(ygk0.m);

    static {
        shd shdVar = ComposeView.Companion;
    }

    public dhk0(ComposeView composeView, p9y0 p9y0Var) {
        this.a = composeView;
        this.b = p9y0Var;
        co91.c(composeView, new a(892619584, new chk0(this), true));
    }

    @Override // defpackage.ghk0
    public final View asView() {
        return this.a;
    }

    @Override // defpackage.ghk0
    public final void c(ygk0 ygk0Var) {
        this.c.setValue(ygk0Var);
    }

    public final void d(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1101516636);
        int i2 = (btsVar.k(this) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            ygk0 ygk0Var = (ygk0) this.c.getValue();
            int i3 = i2 & 14;
            boolean k = (i3 == 4) | btsVar.k(ygk0Var);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = new vxj0(4, this, ygk0Var);
                btsVar.o0(Q);
            }
            tls tlsVar = (tls) Q;
            boolean k2 = btsVar.k(ygk0Var) | (i3 == 4);
            Object Q2 = btsVar.Q();
            if (k2 || Q2 == o430Var) {
                Q2 = new y740(18, this, ygk0Var);
                btsVar.o0(Q2);
            }
            com.yandex.go.taxi.order.details.v2.ui.compose.driver.a.h(ygk0Var, tlsVar, (zls) Q2, btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new chk0(this, i);
        }
    }
}
