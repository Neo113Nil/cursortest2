package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import com.vk.core.compose.component.image.badge.BadgeAlignment;
import com.vkontakte.android.R;
import xsna.kpv;
import xsna.oy20;
import xsna.py20;
import xsna.q630;
import xsna.qy20;
import xsna.xpv;

/* compiled from: ClipsTrendingHashtagBottomSheet.kt */
/* loaded from: classes17.dex */
public final class naf extends vpi {
    public static final /* synthetic */ int k1 = 0;
    public final wh50<String> g1 = androidx.compose.runtime.k.b("");
    public final wh50<String> h1 = androidx.compose.runtime.k.b("");
    public final wh50<gzs<s3q0>> i1 = androidx.compose.runtime.k.b(null);
    public final wh50<gzs<s3q0>> j1 = androidx.compose.runtime.k.b(null);

    /* compiled from: ClipsTrendingHashtagBottomSheet.kt */
    public static final class a extends kmu0 {
        public final String h;
        public final String i;
        public final dyc j;

        public a(Context context, String str, String str2, dyc dycVar) {
            super(context, tzp0.a(null, 3));
            this.h = str;
            this.i = str2;
            this.j = dycVar;
            F0(true);
            P0();
            O0();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            naf nafVar = new naf();
            ((zak0) nafVar.g1).setValue(this.h);
            ((zak0) nafVar.h1).setValue(this.i);
            ((zak0) nafVar.i1).setValue(new ks2(6, nafVar, this));
            ((zak0) nafVar.j1).setValue(new m4(nafVar, 24));
            return nafVar;
        }
    }

    @Override // xsna.vpi
    public final void Yn(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-454235430);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-454235430, i, -1, "com.vk.clips.viewer.impl.feed.view.bottomsheet.ClipsTrendingHashtagBottomSheet.BottomContent (ClipsTrendingHashtagBottomSheet.kt:52)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new o4e(this, i, 1);
        }
    }

    @Override // xsna.vpi
    public final void Zn(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1132022193);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1132022193, i2, -1, "com.vk.clips.viewer.impl.feed.view.bottomsheet.ClipsTrendingHashtagBottomSheet.Content (ClipsTrendingHashtagBottomSheet.kt:45)");
            }
            rrv0.e(true, null, null, null, null, null, kai.c(2034446028, new com.vk.movika.tools.controls.seekbar.p(this, 1), M), M, 1572870, 62);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.q(this, i, 3);
        }
    }

    public final void co(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(815896682);
        int i2 = i | (M.y(this) ? 4 : 2);
        boolean z = true;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(815896682, i2, -1, "com.vk.clips.viewer.impl.feed.view.bottomsheet.ClipsTrendingHashtagBottomSheet.ThemedContent (ClipsTrendingHashtagBottomSheet.kt:55)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = (String) ((zak0) this.g1).getValue();
                M.R(x);
            }
            String str = (String) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = (String) ((zak0) this.h1).getValue();
                M.R(x2);
            }
            String str2 = (String) x2;
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
            xy20 a6 = py20.a.a(438, 0, M, str, str2);
            q630 m = hr80.m(q630.a.a, wlb0.h(M).getBackground().r, vog0.b(kqu0.f));
            String N = d370.N(R.string.clip_grid_record_clip_with_trend, 0, M);
            int i3 = i2 & 14;
            boolean z2 = i3 == 4 || M.y(this);
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new il1(this, 28);
                M.R(x3);
            }
            gzs gzsVar = (gzs) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new py(11);
                M.R(x4);
            }
            ty20 a7 = oy20.b.a(oy20.a.C3478a.a(N, gzsVar, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), M, 0, 4092), null, false, M, 6);
            if (i3 != 4 && !M.y(this)) {
                z = false;
            }
            Object x5 = M.x();
            if (z || x5 == c0012a) {
                x5 = new eu1(this, 26);
                M.R(x5);
            }
            M = M;
            e5v0.a((gzs) x5, m, a5, a6, null, a7, false, false, null, M, 0, 464);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new om9(this, i, 1);
        }
    }
}
