package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.fullscreenvideo.a;
import java.text.DecimalFormat;
import kotlin.NoWhenBranchMatchedException;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: VideoControlIcon.kt */
/* loaded from: classes16.dex */
public final class ods0 {
    /* JADX WARN: Removed duplicated region for block: B:91:0x029a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final dqj dqjVar, final Integer num, final boolean z, final q630 q630Var, final float f, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        a.d dVar = dqjVar.c;
        androidx.compose.runtime.a M = aVar.M(1359395423);
        if ((i & 6) == 0) {
            i2 = (M.J(dqjVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(num) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.n(f) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(izsVar) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1359395423, i2, -1, "com.vk.fullscreenvideo.icons.VideoControlIcon (VideoControlIcon.kt:35)");
            }
            a.C0011a.C0012a c0012a = a.C0011a.a;
            String str = null;
            if (z && (dVar instanceof a.d.b) && !(dVar instanceof a.d.b.c)) {
                if (((a.d.b) dVar).a > 0) {
                    M.K(502933287);
                    dt1.a.getClass();
                    ty6.b bVar = dt1.a.l;
                    q630 d = rte0.d(q630Var, vog0.b(8));
                    boolean z2 = ((i2 & 458752) == 131072) | ((i2 & 14) == 4);
                    Object x = M.x();
                    if (z2 || x == c0012a) {
                        x = new com.vk.movika.sdk.base.logic.processor.actions.e(24, izsVar, dqjVar);
                        M.R(x);
                    }
                    q630 E = s200.E(ojc.c(d, false, null, null, (gzs) x, 15), 6, f);
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, bVar, M, 48);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, E);
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
                    k9q0.w(M, D, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c, cri.a.d);
                    uog0 uog0Var = vog0.a;
                    q630.a aVar3 = q630.a.a;
                    q630 q = txj0.q(rte0.d(aVar3, uog0Var), 24);
                    int i3 = i2;
                    lg90 lg90Var = dqjVar.a;
                    long j = dqjVar.b;
                    if (num == null) {
                        M.K(2023233840);
                    } else {
                        M.K(2023233841);
                        str = d370.N(num.intValue(), (i3 >> 3) & 14, M);
                    }
                    M.j();
                    pzu0.b(lg90Var, str, q, j, M, 8, 0);
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
            M.K(504149448);
            q630 d2 = rte0.d(q630Var, vog0.a);
            boolean z3 = ((i4 & 458752) == 131072) | ((i4 & 14) == 4);
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new tvu0(1, dqjVar, izsVar);
                M.R(x2);
            }
            q630 q2 = txj0.q(s200.D(ojc.c(d2, false, null, null, (gzs) x2, 15), f), 24);
            lg90 lg90Var2 = dqjVar.a;
            long j2 = dqjVar.b;
            if (num == null) {
                M.K(504517975);
            } else {
                M.K(504517976);
                str = d370.N(num.intValue(), (i4 >> 3) & 14, M);
            }
            M.j();
            pzu0.b(lg90Var2, str, q2, j2, M, 8, 0);
            M.j();
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.nds0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ods0.a(dqj.this, num, z, q630Var, f, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final String b(a.d dVar) {
        if (dVar.equals(a.d.C1074d.a)) {
            return "resize_button";
        }
        if (dVar.equals(a.d.h.a)) {
            return "cast_button";
        }
        if (dVar.equals(a.d.i.a)) {
            return "settings_button";
        }
        if (dVar instanceof a.d.b.C1072a) {
            return "comments_button";
        }
        if (dVar.equals(a.d.c.a)) {
            return "download_button";
        }
        if (dVar instanceof a.d.b.C1073b) {
            return "like_button";
        }
        if (dVar.equals(a.d.f.a)) {
            return "playlist_button";
        }
        if (dVar instanceof a.d.b.c) {
            return "share_button";
        }
        if (dVar.equals(a.d.j.a)) {
            return "watch_later_button";
        }
        if (dVar.equals(a.d.e.a)) {
            return "more_button";
        }
        if (dVar.equals(a.d.g.a)) {
            return "rate_button";
        }
        if (dVar.equals(a.d.C1071a.a)) {
            return "bug_report_button";
        }
        throw new NoWhenBranchMatchedException();
    }
}
