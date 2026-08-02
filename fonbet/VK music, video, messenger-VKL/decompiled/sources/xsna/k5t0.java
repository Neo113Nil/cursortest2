package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vk.core.compose.component.topbar.k;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;

/* compiled from: VideoPlaylistToolbarView.kt */
/* loaded from: classes16.dex */
public final class k5t0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.vk.core.compose.component.topbar.d$b] */
    public static final void a(q630 q630Var, final String str, final kg50 kg50Var, final Integer num, final gzs gzsVar, final gzs gzsVar2, final gzs gzsVar3, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        q630 q630Var3;
        int i2;
        q630 q630Var4;
        SemanticsConfiguration.Mode mode;
        int i3;
        int i4;
        int i5;
        TopBar$Middle topBar$Middle;
        androidx.compose.runtime.a M = aVar.M(747551919);
        int i6 = i | 6 | (M.J(str) ? 32 : 16) | (M.J(num) ? 2048 : 1024);
        if (M.t(i6 & 1, (599187 & i6) != 599186)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                q630Var3 = q630.a.a;
            } else {
                M.h();
                q630Var3 = q630Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(747551919, i6, -1, "com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.Toolbar (VideoPlaylistToolbarView.kt:106)");
            }
            q630 z = txj0.z(txj0.f(q630Var3, 1.0f), null, 3);
            k.a.C0761a c0761a = k.a.C0761a.a;
            TopBar$Before.e a = e.a.a(gzsVar2, d370.N(R.string.vk_back, 0, M), null, null, null, M, 196614, 28);
            TopBar$Middle.a aVar2 = TopBar$Middle.a.c;
            if (str == null || str.length() == 0) {
                i2 = i6;
                q630Var4 = q630Var3;
                mode = null;
                i3 = 0;
                i4 = -1;
                i5 = 3;
                M.K(914653544);
                M.j();
                topBar$Middle = aVar2;
            } else {
                M.K(914492499);
                i4 = -1;
                i2 = i6;
                q630Var4 = q630Var3;
                i3 = 0;
                i5 = 3;
                mode = null;
                topBar$Middle = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(str, null, null, null, null, M, ((i6 >> 3) & 14) | 196608, 30), null, null, null, M, 14);
                M.j();
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_more_vertical_24, i3, M);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new ltl0(10);
                M.R(x);
            }
            com.vk.core.compose.component.semantics.a a3 = com.vk.core.compose.component.semantics.b.a(mode, (izs) x, i5);
            int i7 = i4;
            int i8 = i3;
            Object obj = mode;
            d.c.C0760d a4 = d.c.C0760d.a.a(a2, null, gzsVar3, null, null, a3, M, 1573256, 26);
            if (num != null) {
                M.K(915116591);
                Object a5 = d.b.a.C0757a.a(pg90.a(num.intValue(), (i2 >> 9) & 14, M), null, gzsVar, null, null, null, M, 12583304, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                M.j();
                obj = a5;
            } else {
                M.K(915312015);
                M.j();
            }
            com.vk.core.compose.component.topbar.a a6 = d.a.a(a4, obj, null, null, M, 24576, 12);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, i8, i7, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.h(topBar$Middle, z, c0761a, aVar2, a, null, a6, null, false, ylu0Var.d().a, kg50Var, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 3456, 6, 6560);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var4;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(str, kg50Var, num, gzsVar, gzsVar2, gzsVar3, i) { // from class: xsna.j5t0
                public final /* synthetic */ String c;
                public final /* synthetic */ kg50 d;
                public final /* synthetic */ Integer e;
                public final /* synthetic */ gzs f;
                public final /* synthetic */ gzs g;
                public final /* synthetic */ gzs h;

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(1794433);
                    k5t0.a(q630.this, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }
}
