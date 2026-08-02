package defpackage;

import androidx.compose.animation.core.RepeatMode;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.n;
import com.yandex.go.design.compose.shimmer.b;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class ltr0 {
    public final int a;
    public final int b;
    public final r0 c;
    public final tpr d;
    public final tx40 e;
    public final oz40 f;

    public ltr0(int i) {
        this.a = 1500;
        this.b = 1000;
        r0 c = bvf0.c(zy11.a);
        this.c = c;
        this.d = e.t(new b(c.j()));
        tx40 f = f.f(0.0f);
        this.e = f;
        this.f = f.j(f);
    }

    public final void a(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-7660124);
        int i2 = (btsVar.k(this) ? 4 : 2) | i;
        boolean z = true;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            if (((Boolean) f.a(this.d, Boolean.FALSE, null, btsVar, 48, 2).getValue()).booleanValue()) {
                btsVar.e0(-569299514);
            } else {
                btsVar.e0(1228562379);
                z = ((Boolean) btsVar.m(n.a)).booleanValue();
            }
            btsVar.t(false);
            oz40 oz40Var = this.f;
            if (z) {
                btsVar.e0(-569245625);
                int i3 = this.a;
                osv d = z5b1.d(z5b1.g("Shimmer Transition", btsVar, 0), 0.0f, (i3 + r1) / i3, sb2.w(ncb1.d(i3, this.b), RepeatMode.Restart, 0L, 4), "Shimmer progress", btsVar, 28728, 0);
                btsVar = btsVar;
                oz40Var.setValue(d);
                btsVar.t(false);
            } else {
                btsVar.e0(-568694135);
                btsVar.t(false);
                oz40Var.setValue(this.e);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new e3o0(this, i, 17);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ltr0)) {
            return false;
        }
        ltr0 ltr0Var = (ltr0) obj;
        return this.a == ltr0Var.a && this.b == ltr0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "ShimmerAnimationState(slideDuration=", ", delayDuration=", Extension.C_BRAKE);
    }

    public ltr0() {
        this(0);
    }
}
