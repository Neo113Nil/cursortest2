package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.fullscreenvideo.a;
import java.text.DecimalFormat;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: LikeButton.kt */
/* loaded from: classes16.dex */
public final class k6z {
    /* JADX WARN: Removed duplicated region for block: B:116:0x0387  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final dqj dqjVar, final boolean z, final boolean z2, final Integer num, final izs izsVar, final q630 q630Var, final float f, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        boolean z3;
        Boolean bool;
        Object i6zVar;
        wh50 wh50Var;
        if2 if2Var;
        String str;
        String str2;
        a.d dVar = dqjVar.c;
        androidx.compose.runtime.a M = aVar.M(-22026841);
        if ((i & 6) == 0) {
            i2 = (M.J(dqjVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z;
            i2 |= M.l(z3) ? 32 : 16;
        } else {
            z3 = z;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(num) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(izsVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(q630Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.n(f) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-22026841, i2, -1, "com.vk.fullscreenvideo.icons.LikeButton (LikeButton.kt:45)");
            }
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = bap.j(EmptyCoroutineContext.b, M);
                M.R(x);
            }
            yvj yvjVar = (yvj) x;
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = qf2.a(1.0f);
                M.R(x2);
            }
            if2 if2Var2 = (if2) x2;
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x3);
            }
            wh50 wh50Var2 = (wh50) x3;
            Boolean valueOf = Boolean.valueOf(z3);
            boolean y = M.y(yvjVar) | ((i2 & 112) == 32) | M.y(if2Var2);
            Object x4 = M.x();
            if (y || x4 == obj) {
                bool = valueOf;
                i6zVar = new i6z(yvjVar, wh50Var2, z3, if2Var2, null);
                wh50Var = wh50Var2;
                if2Var = if2Var2;
                M.R(i6zVar);
            } else {
                bool = valueOf;
                i6zVar = x4;
                if2Var = if2Var2;
                wh50Var = wh50Var2;
            }
            bap.g(bool, (wzs) i6zVar, M, (i2 >> 3) & 14);
            s3q0 s3q0Var = s3q0.a;
            Object x5 = M.x();
            if (x5 == obj) {
                x5 = new j6z(wh50Var, null);
                M.R(x5);
            }
            bap.g(s3q0Var, (wzs) x5, M, 6);
            if (z2 && (dVar instanceof a.d.b)) {
                if (((a.d.b) dVar).a > 0) {
                    M.K(929724156);
                    dt1.a.getClass();
                    ty6.b bVar = dt1.a.l;
                    q630 d = rte0.d(q630Var, vog0.b(8));
                    boolean z4 = ((i2 & 57344) == 16384) | ((i2 & 14) == 4);
                    Object x6 = M.x();
                    if (z4 || x6 == obj) {
                        x6 = new ss3(11, izsVar, dqjVar);
                        M.R(x6);
                    }
                    q630 D = s200.D(ojc.c(d, false, null, null, (gzs) x6, 15), f);
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, bVar, M, 48);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D2 = M.D();
                    q630 c = qri.c(M, D);
                    cri.h7.getClass();
                    LayoutNode.a aVar2 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar2);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, a, cri.a.f);
                    k9q0.w(M, D2, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c, cri.a.d);
                    q630.a aVar3 = q630.a.a;
                    q630 d2 = rte0.d(txj0.q(aVar3, 24), vog0.a);
                    boolean y2 = M.y(if2Var);
                    Object x7 = M.x();
                    if (y2 || x7 == obj) {
                        x7 = new l6u(if2Var, 7);
                        M.R(x7);
                    }
                    q630 a2 = rdu.a(d2, (izs) x7);
                    int i3 = i2;
                    lg90 lg90Var = dqjVar.a;
                    long j = dqjVar.b;
                    if (num == null) {
                        M.K(1706910408);
                        M.j();
                        str2 = null;
                    } else {
                        M.K(1706910409);
                        String N = d370.N(num.intValue(), (i3 >> 9) & 14, M);
                        M.j();
                        str2 = N;
                    }
                    pzu0.b(lg90Var, str2, a2, j, M, 8, 0);
                    f9t.e(txj0.v(aVar3, 4), M, 6);
                    DecimalFormat decimalFormat = uqm0.a;
                    String l = uqm0.l(r0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.l0;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(l, aVar3, ylu0Var.getText().c, null, null, 0, 5, null, 2, false, 0, 1, null, frv0Var, M, 100663344, 48, 5816);
                    M = M;
                    M.G();
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            int i4 = i2;
            M.K(931007928);
            q630 d3 = rte0.d(q630Var, vog0.a);
            boolean y3 = M.y(if2Var);
            Object x8 = M.x();
            if (y3 || x8 == obj) {
                x8 = new pwk(if2Var, 27);
                M.R(x8);
            }
            q630 a3 = rdu.a(d3, (izs) x8);
            boolean z5 = ((i4 & 57344) == 16384) | ((i4 & 14) == 4);
            Object x9 = M.x();
            if (z5 || x9 == obj) {
                x9 = new eg1(8, izsVar, dqjVar);
                M.R(x9);
            }
            q630 D3 = s200.D(ojc.c(a3, false, null, null, (gzs) x9, 15), f);
            lg90 lg90Var2 = dqjVar.a;
            long j2 = dqjVar.b;
            if (num == null) {
                M.K(931476399);
                M.j();
                str = null;
            } else {
                M.K(931476400);
                String N2 = d370.N(num.intValue(), (i4 >> 9) & 14, M);
                M.j();
                str = N2;
            }
            pzu0.b(lg90Var2, str, D3, j2, M, 8, 0);
            M.j();
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.h6z
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    k6z.a(dqj.this, z, z2, num, izsVar, q630Var, f, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
