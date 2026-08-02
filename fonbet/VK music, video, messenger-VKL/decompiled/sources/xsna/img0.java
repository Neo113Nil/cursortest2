package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: Root.kt */
/* loaded from: classes7.dex */
public final class img0 {
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final kdh0 kdh0Var, final izs izsVar, q630 q630Var, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-1341585916);
        if ((i & 6) == 0) {
            i3 = (M.J(kdh0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(izsVar) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= M.y(jaiVar) ? 2048 : 1024;
            }
            if (M.t(i3 & 1, (i3 & 1171) == 1170)) {
                aVar2 = M;
                aVar2.h();
                q630Var3 = q630Var2;
            } else {
                q630.a aVar3 = q630.a.a;
                q630 q630Var4 = i4 != 0 ? aVar3 : q630Var2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1341585916, i3, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.screen.Root (Root.kt:39)");
                }
                Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    HashSet hashSet = iah0.a;
                    x = Boolean.valueOf(fnj.d(context));
                    M.R(x);
                }
                boolean booleanValue = ((Boolean) x).booleanValue();
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.b, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, q630Var4);
                cri.h7.getClass();
                LayoutNode.a aVar4 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar4);
                } else {
                    M.f();
                }
                k9q0.w(M, d, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                q630 F = s200.F(booleanValue ? 16 : 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.d(aVar3, 1.0f));
                jai c2 = kai.c(-780457245, new er3(kdh0Var, izsVar, 6, context), M);
                jai c3 = kai.c(1755150180, new bc1(8, kdh0Var, izsVar), M);
                jai c4 = kai.c(-4209691, new e5l(4, kdh0Var, izsVar), M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 q630Var5 = q630Var4;
                phv0.b(F, c2, c3, c4, null, 0, ylu0Var.getBackground().g, 0L, jaiVar, M, ((i3 << 18) & 1879048192) | X2.b.f, 368);
                aVar2 = M;
                skk0 g = kdh0Var.g();
                if (g != null) {
                    aVar2.K(1243138149);
                    okk0.a(g, izsVar, null, aVar2, i3 & 112);
                } else {
                    aVar2.K(1239918520);
                }
                aVar2.j();
                aVar2.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var3 = q630Var5;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.hmg0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        img0.a(kdh0.this, izsVar, q630Var3, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if ((i & 3072) == 0) {
        }
        if (M.t(i3 & 1, (i3 & 1171) == 1170)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, String str, izs izsVar, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(1970370816);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1970370816, i2, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.screen.Toolbar (Root.kt:94)");
            }
            String N = d370.N(R.string.toolbar_icon_back_talkback, 0, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new pyz(23);
                M.R(x);
            }
            com.vk.core.compose.component.semantics.a a = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
            boolean z = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new s3(izsVar, 4);
                M.R(x2);
            }
            TopBar$Before.e a2 = e.a.a((gzs) x2, N, null, null, a, M, 196608, 12);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new qcw(23);
                M.R(x3);
            }
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(str, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), M, (i2 & 14) | 196608, 14), null, null, null, M, 14);
            M = M;
            muv0.h(a3, q630Var, null, null, a2, null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, (i2 >> 3) & 112, 0, 8172);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mt(i, str, izsVar, q630Var);
        }
    }
}
