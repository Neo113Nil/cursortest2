package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.cri;
import xsna.dt1;
import xsna.f8s;
import xsna.g8s;
import xsna.q630;

/* compiled from: CommunityAddDescriptionView.kt */
/* loaded from: classes5.dex */
public final class rqg extends i6v0<sqg, fqg> {
    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        i((sqg) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(final izs<? super fqg, s3q0> izsVar, final String str, final String str2, final boolean z, final qko0 qko0Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        String str3;
        long c;
        androidx.compose.runtime.a M = aVar.M(1411591211);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str3 = str2;
            i2 |= M.J(str3) ? 256 : 128;
        } else {
            str3 = str2;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(qko0Var) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1411591211, i2, -1, "com.vk.profile.community.details.impl.description.CommunityAddDescriptionView.DescriptionViewContent (CommunityAddDescriptionView.kt:74)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                if (qko0Var != null) {
                    c = qko0Var.a;
                } else {
                    int length = str.length();
                    c = jgz.c(length, length);
                }
                x = androidx.compose.runtime.k.b(new tho0(str, c, 4));
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c2 = qri.c(M, aVar2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            tho0 tho0Var = (tho0) wh50Var.getValue();
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new wd3(7, izsVar, wh50Var);
                M.R(x2);
            }
            izs izsVar2 = (izs) x2;
            String N = d370.N(R.string.community_add_description_bs_text_placeholder, 0, M);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new dj1(20);
                M.R(x3);
            }
            int i4 = i2;
            ybo0 a2 = g8s.e.a.a(tho0Var, izsVar2, N, null, 6, 6, false, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), M, 221184, 24576, 8136);
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new fj1(14);
                M.R(x4);
            }
            nvu0.a(a2, null, null, null, f8s.a.a(str3, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), M, ((i4 >> 6) & 14) | 3072, 2), M, 0, 14);
            q630 E = ahn.E(txj0.f(s200.E(aVar2, kqu0.w, kqu0.v), 1.0f), "DescriptionSaveButton");
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            ButtonSize buttonSize = ButtonSize.Large;
            boolean z3 = i3 == 4;
            Object x5 = M.x();
            if (z3 || x5 == c0012a) {
                x5 = new us0(izsVar, 2);
                M.R(x5);
            }
            bhu0.c((gzs) x5, buttonSize, buttonStyle, buttonAppearance, E, null, null, z, null, null, null, false, fdi.b, M, ((i4 << 12) & 29360128) | X2.b.f, 384, 3936);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.qqg
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    rqg.this.h(izsVar, str, str2, z, qko0Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(sqg sqgVar, izs<? super fqg, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> ss0Var;
        androidx.compose.runtime.a M = aVar.M(2010015541);
        int i2 = (M.J(sqgVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2010015541, i2, -1, "com.vk.profile.community.details.impl.description.CommunityAddDescriptionView.ThemedContent (CommunityAddDescriptionView.kt:53)");
            }
            fm50 fm50Var = (fm50) d(ok50.a, new n0u0[]{sqgVar.a}, M, (i2 & 896) | 512).getValue();
            wh50 wh50Var = null;
            w0h w0hVar = fm50Var instanceof w0h ? (w0h) fm50Var : null;
            yzt0<x0h> yzt0Var = w0hVar != null ? w0hVar.a : null;
            if (yzt0Var == null) {
                M.K(-60760029);
            } else {
                M.K(-1110338658);
                wh50Var = jk50.c(yzt0Var, M);
            }
            M.j();
            if (wh50Var == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    ss0Var = new yi1(this, sqgVar, izsVar, i, 3);
                    s.d = ss0Var;
                }
                return;
            }
            h(izsVar, ((x0h) wh50Var.getValue()).a, ((x0h) wh50Var.getValue()).b, ((x0h) wh50Var.getValue()).c, ((x0h) wh50Var.getValue()).d, M, ((i2 >> 3) & 14) | SQLiteDatabase.OPEN_PRIVATECACHE | ((i2 << 9) & 458752));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            ss0Var = new ss0(this, sqgVar, izsVar, i, 1);
            s.d = ss0Var;
        }
    }
}
