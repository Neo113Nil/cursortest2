package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vkontakte.android.R;
import java.util.List;
import xsna.q630;

/* compiled from: VkMusicEqualizer.kt */
/* loaded from: classes3.dex */
public final class t5v0 {
    public static final void a(final ytp ytpVar, final List list, final boolean z, final wzs wzsVar, final gzs gzsVar, q630 q630Var, final boolean z2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        q630 q630Var2;
        int i3;
        final q630 q630Var3;
        int i4;
        rtp a;
        androidx.compose.runtime.a M = aVar.M(1108519091);
        int i5 = i | (M.J(ytpVar) ? 4 : 2) | (M.J(list) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.y(wzsVar) ? 2048 : 1024) | (M.y(gzsVar) ? 16384 : 8192);
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 = i5 | 196608;
            q630Var2 = q630Var;
        } else {
            q630Var2 = q630Var;
            i3 = i5 | (M.J(q630Var2) ? 131072 : 65536);
        }
        int i7 = i3 | (M.l(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i7 & 1, (599187 & i7) != 599186)) {
            q630 q630Var4 = q630.a.a;
            q630 q630Var5 = i6 != 0 ? q630Var4 : q630Var2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1108519091, i7, -1, "com.vk.music.design.compose.equalizer.EqualizerGraphRow (VkMusicEqualizer.kt:31)");
            }
            iyk0 iyk0Var = AndroidCompositionLocals_androidKt.b;
            Context context = (Context) M.r(iyk0Var);
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z) {
                M.K(-110851817);
                M.j();
            } else {
                M.K(-110817221);
                String N = d370.N(R.string.equalizer_enable_message_accessibility, 0, M);
                boolean J = M.J(N);
                Object x = M.x();
                if (J || x == c0012a) {
                    x = new vjb(N, 1);
                    M.R(x);
                }
                q630Var4 = egi0.b(q630Var4, false, (izs) x);
                M.j();
            }
            q630 g = q630Var5.g(q630Var4);
            int i8 = (i7 >> 18) & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1671681017, i8, -1, "com.vk.music.design.compose.equalizer.equalizerColors (VkMusicEqualizer.kt:76)");
            }
            if (dhr0.a.c((Context) M.r(iyk0Var)) || z2) {
                i4 = i7;
                M.K(-903195658);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1611138365, 0, -1, "com.vk.music.design.compose.equalizer.darkEqualizerColors (VkMusicEqualizer.kt:103)");
                }
                a = stp.a(s7g.a(R.color.vk_gray_600, M), s7g.a(R.color.vk_gray_750, M), wlb0.h(M).m().a, s7g.a(R.color.vk_blue_overlight_1_alpha32, M), s7g.a(R.color.vk_gray_750, M), wlb0.h(M).m().c, wlb0.h(M).m().a, s7g.a(R.color.vk_gray_600, M), s7g.a(R.color.vk_gray_750, M), s7g.a(R.color.vk_gray_500, M), s7g.a(R.color.vk_gray_600, M), s7g.a(R.color.vk_gray_750, M), s7g.a(R.color.vk_gray_300, M), s7g.a(R.color.vk_gray_500, M), 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(-903152971);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1139323265, 0, -1, "com.vk.music.design.compose.equalizer.lightEqualizerColors (VkMusicEqualizer.kt:85)");
                }
                i4 = i7;
                a = stp.a(s7g.a(R.color.vk_gray_400, M), s7g.a(R.color.vk_gray_400, M), wlb0.h(M).m().a, s7g.a(R.color.vk_gray_450, M), s7g.a(R.color.vk_gray_400, M), wlb0.h(M).getIcon().j, wlb0.h(M).m().a, l5g.c(14, s7g.a(R.color.vk_gray_400, M), 0.5f), l5g.c(14, s7g.a(R.color.vk_gray_400, M), 0.5f), l5g.c(14, s7g.a(R.color.vk_gray_400, M), 0.5f), l5g.c(14, s7g.a(R.color.vk_gray_450, M), 0.5f), l5g.c(14, s7g.a(R.color.vk_gray_400, M), 0.5f), l5g.c(14, s7g.a(R.color.vk_gray_300, M), 0.5f), l5g.c(14, s7g.a(R.color.vk_gray_300, M), 0.5f), 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean y = ((i4 & 112) == 32) | M.y(context);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new hto0(5, list, context);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            boolean z3 = (i4 & 7168) == 2048;
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new mfe(1, wzsVar);
                M.R(x3);
            }
            wzs wzsVar2 = (wzs) x3;
            jai c = kai.c(-498904322, new v9a(5, list, context), M);
            boolean z4 = (57344 & i4) == 16384;
            Object x4 = M.x();
            if (z4 || x4 == c0012a) {
                x4 = new utp(1, gzsVar);
                M.R(x4);
            }
            q630 q630Var6 = q630Var5;
            wtp.a(ytpVar, z, izsVar, wzsVar2, g, c, vni.a, (gzs) x4, a, null, M, (i4 & 14) | 1769472 | ((i4 >> 3) & 112));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var3 = q630Var6;
        } else {
            M.h();
            q630Var3 = q630Var2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(list, z, wzsVar, gzsVar, q630Var3, z2, i, i2) { // from class: xsna.s5v0
                public final /* synthetic */ List c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ wzs e;
                public final /* synthetic */ gzs f;
                public final /* synthetic */ q630 g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ int i;

                {
                    this.i = i2;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    t5v0.a(ytp.this, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I, this.i);
                    return s3q0.a;
                }
            };
        }
    }

    public static final String b(int i, Context context) {
        return i > 1000 ? context.getString(R.string.equalizer_center_freq_label_kHz, Integer.valueOf(an10.b(i / 1000))) : context.getString(R.string.equalizer_center_freq_label_Hz, Integer.valueOf(i));
    }
}
