package xsna;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.core.compose.component.defaults.SpinnerSize;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.Set;
import xsna.cri;
import xsna.dt1;
import xsna.mut0;
import xsna.q630;

/* compiled from: VideoBottomSheetRedesign.kt */
/* loaded from: classes2.dex */
public final class w6s0 {
    public static final float d = 16;
    public static final e0a e = new e0a(12);
    public static final Set<Integer> f = rl3.y0(new Integer[]{Integer.valueOf(R.string.report_content), Integer.valueOf(R.string.video_remove_from_playlist), Integer.valueOf(R.string.video_remove_from_added)});
    public final s6s0 a;
    public final y6s0 b;
    public gzs<s3q0> c;

    /* compiled from: VideoBottomSheetRedesign.kt */
    public static final class a {
        public static boolean a(s6s0 s6s0Var) {
            return !w6s0.e.T(s6s0Var).isEmpty();
        }
    }

    public w6s0(s6s0 s6s0Var, y6s0 y6s0Var) {
        this.a = s6s0Var;
        this.b = y6s0Var;
    }

    public final void a(Activity activity, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        List list;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-969105151);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-969105151, i, -1, "com.vk.libvideo.bottomsheet.VideoBottomSheetRedesign.VideoBottomSheetContent (VideoBottomSheetRedesign.kt:137)");
        }
        s6s0 s6s0Var = this.a;
        boolean J = M.J(s6s0Var);
        Object x = M.x();
        if (J || x == a.C0011a.a) {
            x = e.T(s6s0Var);
            M.R(x);
        }
        List list2 = (List) x;
        a.m mVar = androidx.compose.foundation.layout.a.c;
        dt1.a.getClass();
        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
        int hashCode = Long.hashCode(n34.n(M));
        sy90 D = M.D();
        q630.a aVar2 = q630.a.a;
        q630 c = qri.c(M, aVar2);
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
        k9q0.w(M, a2, cri.a.f);
        k9q0.w(M, D, cri.a.e);
        k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
        k9q0.t(M, cri.a.h);
        k9q0.w(M, c, cri.a.d);
        if (hg10.u(s6s0Var)) {
            M.K(-1741972636);
            String N = d370.N(R.string.video_ad_title, 0, M);
            q630 H = s200.H(txj0.f(aVar2, 1.0f), 16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.d0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            i2 = 0;
            list = list2;
            yqv0.c(N, H, ylu0Var.getText().p, null, null, 0, 5, null, 0, false, 0, 0, null, frv0Var, M, 48, 0, 8120);
            M = M;
        } else {
            list = list2;
            i2 = 0;
            M.K(-1747129269);
        }
        M.j();
        M.K(-333271964);
        int i3 = i2;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                e43.t();
                throw null;
            }
            e520 e520Var = (e520) obj;
            androidx.compose.runtime.a aVar4 = M;
            b(e520Var, activity, gzsVar, aVar4, 0);
            M = aVar4;
            e520 e520Var2 = (e520) j5g.b0(i4, list);
            if (e520Var2 == null || epx.f(e520Var2.k, e520Var.k)) {
                M.K(270923183);
            } else {
                M.K(276895922);
                ijv0.c(SeparatorDpi.At1x, SeparatorAppearance.Primary, null, M, 54, 4);
            }
            M.j();
            i3 = i4;
        }
        if (gp.d(M)) {
            androidx.compose.runtime.b.e();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new w2k(i, 10, this, activity, gzsVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x017c, code lost:
    
        if (r12.J(r8) == false) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(e520 e520Var, Activity activity, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        final long j;
        boolean z;
        Cell$Left.Main main;
        Object obj;
        boolean z2;
        boolean z3;
        Object x;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(1278071272);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1278071272, i, -1, "com.vk.libvideo.bottomsheet.VideoBottomSheetRedesign.VideoBottomSheetItem (VideoBottomSheetRedesign.kt:177)");
        }
        Object x2 = M.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (x2 == c0012a) {
            x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
            M.R(x2);
        }
        wh50 wh50Var = (wh50) x2;
        String a2 = e520Var.a(activity);
        String str = e520Var.m;
        com.vk.core.compose.component.cell.content.h1 h1Var = null;
        if (str == null) {
            int i2 = e520Var.l;
            str = i2 != 0 ? activity.getString(i2) : null;
        }
        boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
        int i3 = i & 7294;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(821469701, i3, -1, "com.vk.libvideo.bottomsheet.VideoBottomSheetRedesign.rememberCellLeft (VideoBottomSheetRedesign.kt:226)");
        }
        int i4 = ((i3 >> 3) & 896) | (i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        M.K(1387665158);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1387665158, i4, -1, "com.vk.libvideo.bottomsheet.VideoBottomSheetRedesign.resolveMenuIconTint (VideoBottomSheetRedesign.kt:319)");
        }
        int i5 = e520Var.g;
        if (i5 != 0) {
            j = f870.c(activity.getColor(i5));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
        } else {
            M.K(873053624);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var.getIcon().b;
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
        }
        if (booleanValue) {
            M.K(-319507519);
            Cell$Left.Main a3 = Cell$Left.Main.a.C0731a.a(kai.c(380567636, new zzs() { // from class: xsna.v6s0
                @Override // xsna.zzs
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 129) != 128)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(380567636, intValue, -1, "com.vk.libvideo.bottomsheet.VideoBottomSheetRedesign.rememberCellLeft.<anonymous> (VideoBottomSheetRedesign.kt:230)");
                        }
                        zfr0.e(txj0.q(q630.a.a, 28), j, SpinnerSize.Size24, aVar2, 390, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M);
            M.j();
            main = a3;
            z = false;
        } else {
            M.K(-319252823);
            z = false;
            Cell$Left.Main a4 = com.vk.core.compose.component.cell.content.f.a(pg90.a(e520Var.b, 0, M), Cell$Left.Main.Size.Medium, j, null, null, M, 196664, 24);
            M.j();
            main = a4;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        M.K(137374522);
        com.vk.core.compose.component.cell.content.h1 a5 = Cell$Middle.d.b.a(a2, null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        M.j();
        if (str == null) {
            M.K(137475705);
        } else {
            M.K(137475706);
            h1Var = Cell$Middle.c.b.b(str, 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            M = M;
        }
        M.j();
        androidx.compose.runtime.a aVar2 = M;
        com.vk.core.compose.component.cell.content.k0 a6 = Cell$Middle.a.a(a5, h1Var, null, null, aVar2, 196608, 28);
        boolean z4 = e520Var.o;
        boolean y = aVar2.y(this) | aVar2.y(e520Var) | aVar2.y(activity);
        if (((i & 896) ^ 384) > 256) {
            obj = gzsVar;
        } else {
            obj = gzsVar;
        }
        if ((i & 384) != 256) {
            z2 = z;
            z3 = y | z2;
            x = aVar2.x();
            if (!z3 || x == c0012a) {
                fzf0 fzf0Var = new fzf0(this, e520Var, activity, obj, wh50Var, 1);
                aVar2.R(fzf0Var);
                x = fzf0Var;
            }
            wiu0.b(null, z4, main, a6, null, (gzs) x, null, aVar2, 0, 81);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new f4c(this, e520Var, activity, gzsVar, i, 2);
                return;
            }
            return;
        }
        z2 = true;
        z3 = y | z2;
        x = aVar2.x();
        if (!z3) {
        }
        fzf0 fzf0Var2 = new fzf0(this, e520Var, activity, obj, wh50Var, 1);
        aVar2.R(fzf0Var2);
        x = fzf0Var2;
        wiu0.b(null, z4, main, a6, null, (gzs) x, null, aVar2, 0, 81);
        if (androidx.compose.runtime.b.d()) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    public final void c(boolean z, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        boolean z2;
        jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(753838044);
        int i2 = (M.l(z) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(753838044, i2, -1, "com.vk.libvideo.bottomsheet.VideoBottomSheetRedesign.VkThemeRedesign (VideoBottomSheetRedesign.kt:118)");
            }
            M.K(-794484388);
            z2 = z;
            jaiVar2 = jaiVar;
            rrv0.e(z2, null, null, null, null, null, jaiVar2, M, (i2 & 14) | 1572864, 62);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            z2 = z;
            jaiVar2 = jaiVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hk40(this, z2, jaiVar2, i);
        }
    }

    public final void d(e520 e520Var, Activity activity, gzs<s3q0> gzsVar) {
        f520 f520Var = e520Var.n;
        s6s0 s6s0Var = this.a;
        e0a e0aVar = e;
        if (f520Var != null) {
            h6s0 U = e0aVar.U(e520Var);
            if (U != null) {
                U.b(activity, s6s0Var, gzsVar);
                return;
            }
            return;
        }
        h6s0 U2 = e0aVar.U(e520Var);
        if (U2 != null) {
            U2.c(activity, s6s0Var, this.b);
        }
    }

    public final void e(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        ComposeView composeView = new ComposeView(activity, null, 6);
        composeView.setViewCompositionStrategy(mut0.a.a);
        composeView.setContent(new jai(-316974444, new z3c(viewGroup, composeView, this, activity), true));
        viewGroup.addView(composeView);
        s6s0 s6s0Var = this.a;
        k78 k78Var = s6s0Var.e;
        if (k78Var != null) {
            k78Var.a("video_bottom_sheet_redesign");
        }
        com.vk.libvideo.tracker.c.a(s6s0Var.a);
    }
}
