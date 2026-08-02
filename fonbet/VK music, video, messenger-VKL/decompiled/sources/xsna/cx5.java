package xsna;

import android.graphics.RuntimeShader;
import android.os.Build;
import androidx.compose.runtime.a;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;

/* compiled from: BackgroundMeshGradient.kt */
/* loaded from: classes3.dex */
public final class cx5 {
    public static final void a(int i, androidx.compose.runtime.a aVar, List list, q630 q630Var) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> q2Var;
        androidx.compose.runtime.a M = aVar.M(-234184180);
        int i2 = (M.J(list != null ? new sfl0(list) : null) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-234184180, i2, -1, "com.vk.music.stickyplayer.presentation.components.background.BackgroundMeshGradient (BackgroundMeshGradient.kt:28)");
            }
            if (list == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    q2Var = new zw5(list, q630Var, i, 0);
                    s.d = q2Var;
                }
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                M.K(-1553808393);
                c(i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, M, list, q630Var);
                M.j();
            } else {
                M.K(-1553739945);
                b(i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, M, list, q630Var);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            q2Var = new q2(list, q630Var, i, 1);
            s.d = q2Var;
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, List list, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-642337826);
        if ((i & 6) == 0) {
            i2 = (M.J(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-642337826, i3, -1, "com.vk.music.stickyplayer.presentation.components.background.BackgroundMeshGradientApi28 (BackgroundMeshGradient.kt:88)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(new mxj0(0L));
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = bbk0.b(new no(wh50Var, 6));
                M.R(x2);
            }
            mtk0 mtk0Var = (mtk0) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = bbk0.b(new com.vk.voip.a(4, wh50Var, mtk0Var));
                M.R(x3);
            }
            mtk0 mtk0Var2 = (mtk0) x3;
            List list2 = sfl0.b;
            boolean p = M.p(f870.c(((Number) list.get(0)).intValue()));
            Object x4 = M.x();
            if (p || x4 == c0012a) {
                x4 = bbk0.b(new ax5(list, mtk0Var2, mtk0Var, 0));
                M.R(x4);
            }
            mtk0 mtk0Var3 = (mtk0) x4;
            boolean p2 = M.p(f870.c(((Number) list.get(1)).intValue()));
            Object x5 = M.x();
            if (p2 || x5 == c0012a) {
                x5 = bbk0.b(new bx5(list, wh50Var, mtk0Var2, mtk0Var, 0));
                M.R(x5);
            }
            mtk0 mtk0Var4 = (mtk0) x5;
            boolean p3 = M.p(f870.c(((Number) list.get(2)).intValue()));
            Object x6 = M.x();
            if (p3 || x6 == c0012a) {
                x6 = bbk0.b(new uw5(list, mtk0Var2, wh50Var, mtk0Var));
                M.R(x6);
            }
            mtk0 mtk0Var5 = (mtk0) x6;
            boolean p4 = M.p(f870.c(((Number) list.get(3)).intValue()));
            Object x7 = M.x();
            if (p4 || x7 == c0012a) {
                x7 = bbk0.b(new vw5(list, wh50Var, mtk0Var2, mtk0Var, 0));
                M.R(x7);
            }
            mtk0 mtk0Var6 = (mtk0) x7;
            boolean J = M.J(mtk0Var5) | M.J(mtk0Var4) | M.J(mtk0Var6) | M.J(mtk0Var3);
            Object x8 = M.x();
            if (J || x8 == c0012a) {
                ww5 ww5Var = new ww5(wh50Var, mtk0Var5, mtk0Var4, mtk0Var6, mtk0Var3, 0);
                M.R(ww5Var);
                x8 = ww5Var;
            }
            xa4.i((i3 >> 3) & 14, M, (izs) x8, q630Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xw5(list, q630Var, i, 0);
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, List list, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-455190780);
        if ((i & 6) == 0) {
            i2 = (M.J(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-455190780, i2, -1, "com.vk.music.stickyplayer.presentation.components.background.BackgroundMeshGradientApi33 (BackgroundMeshGradient.kt:42)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                bi4.d();
                x = oh4.a();
                M.R(x);
            }
            RuntimeShader a = efa.a(x);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new bl8(a);
                M.R(x2);
            }
            n4j0 n4j0Var = (n4j0) x2;
            boolean y = M.y(a) | ((i2 & 14) == 4);
            Object x3 = M.x();
            if (y || x3 == c0012a) {
                x3 = new yw5(a, list, n4j0Var, 0);
                M.R(x3);
            }
            xa4.i((i2 >> 3) & 14, M, (izs) x3, q630Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new me4(list, q630Var, i, 1);
        }
    }

    public static final List<l5g> d(long j) {
        return e43.l(new l5g(l5g.c(14, j, 0.6f)), new l5g(l5g.c(14, j, 0.5f)), new l5g(l5g.j));
    }
}
