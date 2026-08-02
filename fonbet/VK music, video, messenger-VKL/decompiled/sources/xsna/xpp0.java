package xsna;

import androidx.compose.runtime.a;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.compose.component.image.badge.BadgeAlignment;
import com.vkontakte.android.R;
import xsna.kpv;
import xsna.oy20;
import xsna.py20;
import xsna.q630;
import xsna.qy20;
import xsna.xpv;

/* compiled from: TrendingHashtagBottomSheet.kt */
/* loaded from: classes17.dex */
public final class xpp0 extends jmu0 {
    public static final /* synthetic */ int l1 = 0;
    public final wh50<String> h1 = androidx.compose.runtime.k.b("");
    public final wh50<String> i1 = androidx.compose.runtime.k.b("");
    public final wh50<gzs<s3q0>> j1 = androidx.compose.runtime.k.b(null);
    public final wh50<gzs<s3q0>> k1 = androidx.compose.runtime.k.b(null);

    /* compiled from: TrendingHashtagBottomSheet.kt */
    public static final class a extends kmu0 {
        public final String h;
        public final String i;
        public final i70 j;

        public a(FragmentActivity fragmentActivity, String str, String str2, i70 i70Var) {
            super(fragmentActivity, tzp0.a(null, 3));
            this.h = str;
            this.i = str2;
            this.j = i70Var;
            F0(true);
            P0();
            O0();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            xpp0 xpp0Var = new xpp0();
            ((zak0) xpp0Var.h1).setValue(this.h);
            ((zak0) xpp0Var.i1).setValue(this.i);
            ((zak0) xpp0Var.j1).setValue(new com.vk.movika.sdk.base.ui.s(19, xpp0Var, this));
            ((zak0) xpp0Var.k1).setValue(new yqd0(xpp0Var, 10));
            return xpp0Var;
        }
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1020784592);
        int i2 = i | (M.y(this) ? 4 : 2);
        boolean z = true;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1020784592, i2, -1, "com.vk.clips.upload.vk.impl.rules.TrendingHashtagBottomSheet.ThemedContent (TrendingHashtagBottomSheet.kt:40)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1574983942, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Flash36> (VkSdkIcons.kt:914)");
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_flash_36, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            xpv a3 = xpv.a.a(a2, wlb0.h(M).getIcon().l, new rek0(wlb0.h(M).getBackground().x), M, 24584, 8);
            float f = 72;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1202858280, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-TrendBadge20H> (VkSdkIcons.kt:3520)");
            }
            lg90 a4 = pg90.a(R.drawable.vk_icon_trend_badge_20h, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ry20 a5 = qy20.a.C3580a.a(a3, f, kpv.a.a(a4, l5g.k, byc0.b(48, 20), BadgeAlignment.BottomRight, false, null, null, M, 100688312, 232), new a28(0.5f, wlb0.h(M).getImage().a), null, M, 16);
            xy20 a6 = py20.a.a(384, 0, M, (String) ((zak0) this.h1).getValue(), (String) ((zak0) this.i1).getValue());
            q630 m = hr80.m(q630.a.a, wlb0.h(M).getBackground().r, vog0.b(kqu0.f));
            String N = d370.N(R.string.clips_trending_hashtag_modal_button, 0, M);
            int i3 = i2 & 14;
            boolean z2 = i3 == 4 || M.y(this);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new orj0(this, 12);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new zsw(27);
                M.R(x2);
            }
            ty20 a7 = oy20.b.a(oy20.a.C3478a.a(N, gzsVar, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, 0, 4092), null, false, M, 6);
            if (i3 != 4 && !M.y(this)) {
                z = false;
            }
            Object x3 = M.x();
            if (z || x3 == c0012a) {
                x3 = new ghn0(this, 2);
                M.R(x3);
            }
            M = M;
            e5v0.a((gzs) x3, m, a5, a6, null, a7, false, false, null, M, 0, 464);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new z76(this, i, 7);
        }
    }
}
