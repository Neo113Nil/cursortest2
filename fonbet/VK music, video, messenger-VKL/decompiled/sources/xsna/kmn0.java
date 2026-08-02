package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: SwipeToRemoveTrackContainer.kt */
/* loaded from: classes3.dex */
public final class kmn0 {
    public static final float a = 76;
    public static final float b = 100;

    public static final void a(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(-1740618952);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1740618952, i2, -1, "com.vk.music.stickyplayer.presentation.components.RemoveSwipeItemBackground (SwipeToRemoveTrackContainer.kt:111)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(q630Var, ylu0Var.getBackground().t, androidx.compose.ui.graphics.e.a);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new j66(2, gzsVar);
                M.R(x);
            }
            q630 c = ojc.c(m, false, null, null, (gzs) x, 15);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.g, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            q630 H = s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1369856538, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-DeleteOutline28> (VkSdkIcons.kt:630)");
            }
            lg90 b2 = or.b(M, -1382946425, R.drawable.vk_icon_delete_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.music_talkback_player_track_queue_remove, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(b2, N, H, ylu0Var2.getIcon().c, M, 392, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new m510(gzsVar, q630Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v42, types: [xsna.jai] */
    public static final void b(gzs gzsVar, gzs gzsVar2, boolean z, q630 q630Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(1772929527);
        int i2 = i | (M.y(gzsVar) ? 4 : 2) | (M.y(gzsVar2) ? 32 : 16) | (M.l(z) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1772929527, i2, -1, "com.vk.music.stickyplayer.presentation.components.SwipeToRemoveTrackContainer (SwipeToRemoveTrackContainer.kt:50)");
            }
            azl azlVar = (azl) M.r(uvi.h);
            boolean J = M.J(azlVar);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                wgo wgoVar = new wgo();
                rgo rgoVar = rgo.End;
                wgoVar.a(rgoVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                wgoVar.a(rgo.Center, -azlVar.I0(a));
                s3q0 s3q0Var = s3q0.a;
                float[] fArr = wgoVar.b;
                ArrayList arrayList = wgoVar.a;
                int size = arrayList.size();
                jw5.n(size, fArr.length);
                mdl mdlVar = new mdl(Arrays.copyOfRange(fArr, 0, size), arrayList);
                dtp0 d = jq2.d(0, 0, null, 7);
                m7l k = fto0.k();
                k7l0 k7l0Var = new k7l0(azlVar, 7);
                iia0 iia0Var = new iia0(azlVar, 26);
                f12 f12Var = new f12(rgoVar, new a60(1));
                ((zak0) f12Var.n).setValue(mdlVar);
                f12Var.i(rgoVar);
                f12Var.b = k7l0Var;
                f12Var.c = iia0Var;
                f12Var.d = d;
                f12Var.e = k;
                M.R(f12Var);
                x = f12Var;
            }
            f12 f12Var2 = (f12) x;
            Boolean valueOf = Boolean.valueOf(z);
            boolean J2 = ((i2 & 896) == 256) | M.J(f12Var2);
            Object x2 = M.x();
            if (J2 || x2 == c0012a) {
                x2 = new imn0(z, f12Var2, null);
                M.R(x2);
            }
            bap.g(valueOf, (wzs) x2, M, (i2 >> 6) & 14);
            Object value = ((zak0) f12Var2.g).getValue();
            boolean J3 = M.J(f12Var2) | ((i2 & 112) == 32);
            Object x3 = M.x();
            if (J3 || x3 == c0012a) {
                x3 = new jmn0(f12Var2, gzsVar2, null);
                M.R(x3);
            }
            bap.g(value, (wzs) x3, M, 0);
            q630Var2 = q630Var;
            q630 e = lz1.e(q630Var2, f12Var2, Orientation.Horizontal, false, 60);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, e);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            ra8 ra8Var = ra8.a;
            q630.a aVar3 = q630.a.a;
            q630 a2 = ra8Var.a(aVar3);
            boolean J4 = M.J(f12Var2) | ((i2 & 14) == 4);
            Object x4 = M.x();
            if (J4 || x4 == c0012a) {
                x4 = new ks2(25, f12Var2, gzsVar);
                M.R(x4);
            }
            a(0, M, (gzs) x4, a2);
            boolean J5 = M.J(f12Var2);
            Object x5 = M.x();
            if (J5 || x5 == c0012a) {
                x5 = new qzl0(f12Var2, 6);
                M.R(x5);
            }
            q630 d3 = txj0.d(kci.k(aVar3, (izs) x5), 1.0f);
            ?? r7 = jaiVar;
            r7.invoke(ra8Var, d3, M, 390);
            M.G();
            jaiVar2 = r7;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
                jaiVar2 = r7;
            }
        } else {
            q630Var2 = q630Var;
            jaiVar2 = jaiVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new uqc0(gzsVar, gzsVar2, z, q630Var2, jaiVar2, i);
        }
    }
}
