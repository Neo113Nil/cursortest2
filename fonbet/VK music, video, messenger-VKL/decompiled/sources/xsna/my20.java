package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.UUID;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: ModalBottomSheet.android.kt */
/* loaded from: classes11.dex */
public final class my20 {
    public static final void a(final gzs gzsVar, final long j, final yx20 yx20Var, final if2 if2Var, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        long j2;
        yx20 yx20Var2;
        int i3;
        int i4;
        boolean z;
        Object obj;
        androidx.compose.runtime.a M = aVar.M(766784632);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= M.p(j2) ? 32 : 16;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            yx20Var2 = yx20Var;
            i2 |= M.J(yx20Var2) ? 256 : 128;
        } else {
            yx20Var2 = yx20Var;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? M.J(if2Var) : M.y(if2Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(jaiVar) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(766784632, i2, -1, "androidx.compose.material3.ModalBottomSheetDialog (ModalBottomSheet.android.kt:369)");
            }
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            azl azlVar = (azl) M.r(uvi.h);
            final LayoutDirection layoutDirection = (LayoutDirection) M.r(uvi.n);
            cvi z2 = n34.z(M);
            wh50 c = androidx.compose.runtime.k.c(jaiVar, M, (i2 >> 12) & 14);
            Object[] objArr = new Object[0];
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new fn4(23);
                M.R(x);
            }
            UUID uuid = (UUID) crx0.A(objArr, (gzs) x, M, 48);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = bap.j(EmptyCoroutineContext.b, M);
                M.R(x2);
            }
            yvj yvjVar = (yvj) x2;
            boolean J = M.J(view) | M.J(azlVar);
            Object x3 = M.x();
            if (J || x3 == c0012a) {
                i3 = 256;
                i4 = i2;
                vw20 vw20Var = new vw20(gzsVar, yx20Var2, j2, view, layoutDirection, azlVar, uuid, if2Var, yvjVar);
                layoutDirection = layoutDirection;
                z = true;
                jai jaiVar2 = new jai(-1051373467, new ly20(c), true);
                tw20 tw20Var = vw20Var.j;
                tw20Var.setParentCompositionContext(z2);
                ((zak0) tw20Var.m).setValue(jaiVar2);
                tw20Var.n = true;
                tw20Var.r();
                M.R(vw20Var);
                obj = vw20Var;
            } else {
                i4 = i2;
                z = true;
                i3 = 256;
                obj = x3;
            }
            final vw20 vw20Var2 = (vw20) obj;
            boolean y = M.y(vw20Var2);
            Object x4 = M.x();
            if (y || x4 == c0012a) {
                x4 = new kdn(vw20Var2, 23);
                M.R(x4);
            }
            bap.c(vw20Var2, (izs) x4, M, 0);
            int i5 = i4;
            boolean y2 = M.y(vw20Var2) | ((i5 & 14) == 4 ? z : false) | ((i5 & 896) == i3 ? z : false) | ((i5 & 112) == 32 ? z : false) | M.o(layoutDirection.ordinal());
            Object x5 = M.x();
            if (y2 || x5 == c0012a) {
                gzs gzsVar2 = new gzs() { // from class: xsna.jy20
                    @Override // xsna.gzs
                    public final Object invoke() {
                        vw20.this.h(gzsVar, yx20Var, j, layoutDirection);
                        return s3q0.a;
                    }
                };
                M.R(gzsVar2);
                x5 = gzsVar2;
            }
            bap.i((gzs) x5, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ky20
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    my20.a(gzs.this, j, yx20Var, if2Var, jaiVar, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
