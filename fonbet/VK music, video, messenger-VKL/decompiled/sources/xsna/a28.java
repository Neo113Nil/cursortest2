package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.q630;

/* compiled from: BorderStrokeBorder.kt */
/* loaded from: classes17.dex */
public final class a28 implements k18 {
    public final y18 a;

    public a28(float f, long j) {
        this.a = aqw.a(f, j);
    }

    @Override // xsna.k18
    public final void a(final long j, final r5j0 r5j0Var, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-2038561332);
        if ((i & 6) == 0) {
            i2 = (M.p(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(r5j0Var) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & IronSourceError.ERROR_IS_ALL_SMASHES_SESSION_CAPPED) != 1042)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2038561332, i2, -1, "com.vk.core.compose.component.image.border.BorderStrokeBorder.invoke (BorderStrokeBorder.kt:19)");
            }
            q630 r = txj0.r(j, q630.a.a);
            y18 y18Var = this.a;
            ja8.a(r18.b(y18Var.a, y18Var.b, r, r5j0Var), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.z18
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    a28.this.a(j, r5j0Var, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    @Override // xsna.k18
    public final float b(int i, long j, androidx.compose.runtime.a aVar) {
        aVar.K(714398732);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(714398732, i, -1, "com.vk.core.compose.component.image.border.BorderStrokeBorder.calculateWidth (BorderStrokeBorder.kt:28)");
        }
        float f = this.a.a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return f;
    }
}
