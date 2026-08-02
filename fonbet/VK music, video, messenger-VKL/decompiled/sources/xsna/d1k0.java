package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import org.webrtc.PeerConnectionFactory;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: SliderScreenContent.kt */
/* loaded from: classes18.dex */
public final class d1k0 implements yah0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar3;
        int i2;
        androidx.compose.runtime.a aVar2;
        float f;
        float f2;
        Float valueOf = Float.valueOf(0.5f);
        androidx.compose.runtime.a M = aVar.M(-36754711);
        if ((i & 6) == 0) {
            gzsVar3 = gzsVar;
            i2 = (M.y(gzsVar3) ? 4 : 2) | i;
        } else {
            gzsVar3 = gzsVar;
            i2 = i;
        }
        int i3 = i & 24576;
        q630.a aVar3 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar3) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 8195) != 8194)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-36754711, i2, -1, "com.vk.design.demo.presentation.screens.SliderScreenContent.Content (SliderScreenContent.kt:34)");
            }
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            q630 f3 = txj0.f(aVar3, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar4 = dt1.a.n;
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, aVar4, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f3);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf2 = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf2, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            int i4 = i2;
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Slider", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.h(a2, null, null, null, null, TopBar$Before.e.a.a(b, null, gzsVar3, null, null, null, M, 1572872 | ((i4 << 6) & 896), 58), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            djn0.a(true, false, M, 54, 2);
            q630 F = s200.F(8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, aVar4, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, F);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            float f4 = 12;
            float f5 = 4;
            rzo0.a(54, 0, M, "VkSlider:", s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5, 5));
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = androidx.compose.runtime.k.b(valueOf);
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = androidx.compose.runtime.k.b(valueOf);
                M.R(x3);
            }
            wh50 wh50Var3 = (wh50) x3;
            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
            String str = "Default - " + ((Number) wh50Var2.getValue()).floatValue();
            float floatValue = ((Number) wh50Var2.getValue()).floatValue();
            Object x4 = M.x();
            if (x4 == obj) {
                x4 = new p010(wh50Var2, 28);
                M.R(x4);
            }
            hkv0.d(floatValue, (izs) x4, aVar3, str, booleanValue, null, null, 0, null, M, Tensorflow.FRAME_WIDTH, 992);
            String str2 = "5 step - " + ((Number) wh50Var3.getValue()).floatValue();
            float floatValue2 = ((Number) wh50Var3.getValue()).floatValue();
            Object x5 = M.x();
            if (x5 == obj) {
                x5 = new mjl(1, wh50Var3);
                M.R(x5);
            }
            hkv0.d(floatValue2, (izs) x5, aVar3, str2, false, null, null, 5, null, M, 12583344, 880);
            rzo0.a(54, 0, M, "VkRangeSlider:", s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5, 5));
            Object x6 = M.x();
            if (x6 == obj) {
                f = 0.5f;
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                x6 = androidx.compose.runtime.k.b(new awf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f));
                M.R(x6);
            } else {
                f = 0.5f;
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            wh50 wh50Var4 = (wh50) x6;
            Object x7 = M.x();
            if (x7 == obj) {
                x7 = androidx.compose.runtime.k.b(new awf(f2, f));
                M.R(x7);
            }
            wh50 wh50Var5 = (wh50) x7;
            boolean booleanValue2 = ((Boolean) wh50Var.getValue()).booleanValue();
            String str3 = "Default - " + ((bwf) wh50Var4.getValue());
            bwf bwfVar = (bwf) wh50Var4.getValue();
            Object x8 = M.x();
            if (x8 == obj) {
                x8 = new w620(wh50Var4, 26);
                M.R(x8);
            }
            hkv0.b(bwfVar, (izs) x8, aVar3, str3, booleanValue2, null, null, 0, null, M, Tensorflow.FRAME_WIDTH, 992);
            String str4 = "5 step - " + ((bwf) wh50Var5.getValue());
            bwf bwfVar2 = (bwf) wh50Var5.getValue();
            Object x9 = M.x();
            if (x9 == obj) {
                x9 = new pd00(2, wh50Var5);
                M.R(x9);
            }
            hkv0.b(bwfVar2, (izs) x9, aVar3, str4, false, null, null, 5, null, M, 12583344, 880);
            M.G();
            boolean booleanValue3 = ((Boolean) wh50Var.getValue()).booleanValue();
            Object x10 = M.x();
            if (x10 == obj) {
                x10 = new qd00(4, wh50Var);
                M.R(x10);
            }
            eku0.d(PeerConnectionFactory.TRIAL_ENABLED, (gzs) x10, aVar3, booleanValue3, null, false, false, M, 438, 112);
            aVar2 = M;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ru10(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }
}
