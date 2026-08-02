package xsna;

import android.text.SpannedString;
import androidx.compose.runtime.a;
import com.vk.core.apps.BuildInfo;
import com.vkontakte.android.R;
import kotlin.collections.EmptyList;
import xsna.ken;
import xsna.wzj;

/* compiled from: DisplayAudioBookCardContentView.kt */
/* loaded from: classes3.dex */
public final class fdn {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ken.a.C3177a c3177a, izs<? super gdn, s3q0> izsVar, izs<? super Float, s3q0> izsVar2, wh50<Integer> wh50Var, androidx.compose.runtime.a aVar, int i) {
        wh50 wh50Var2;
        int i2;
        wh50 wh50Var3;
        wh50 wh50Var4;
        int i3;
        a.C0011a.C0012a c0012a;
        Object peb0Var;
        boolean z;
        androidx.compose.runtime.a M = aVar.M(-1744580176);
        int i4 = i | (M.J(c3177a) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(izsVar2) ? 256 : 128) | (M.J(wh50Var) ? 2048 : 1024);
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1744580176, i4, -1, "com.vk.music.playlist.display.audiobook.presentation.DisplayAudioBookCardContentView (DisplayAudioBookCardContentView.kt:33)");
            }
            yzt0<Boolean> yzt0Var = c3177a.a;
            Boolean bool = Boolean.FALSE;
            wh50 d = jk50.d(yzt0Var, bool, M, 48);
            yzt0<n05> yzt0Var2 = c3177a.m;
            EmptyList emptyList = EmptyList.b;
            wh50 d2 = jk50.d(yzt0Var2, new n05(emptyList), M, 48);
            yzt0<h9b0> yzt0Var3 = c3177a.b;
            wzj.b.a aVar2 = wzj.b.a.a;
            wh50 d3 = jk50.d(yzt0Var3, new h9b0(), M, 48);
            wh50 d4 = jk50.d(c3177a.i, new SpannedString(""), M, 0);
            wh50 d5 = jk50.d(c3177a.k, 0, M, 48);
            wh50 d6 = jk50.d(c3177a.l, "", M, 48);
            wh50 d7 = jk50.d(c3177a.o, 0, M, 48);
            wh50 d8 = jk50.d(c3177a.d, emptyList, M, 48);
            wh50 d9 = jk50.d(c3177a.f, emptyList, M, 48);
            yzt0<Boolean> yzt0Var4 = c3177a.t;
            Boolean bool2 = Boolean.TRUE;
            wh50 d10 = jk50.d(yzt0Var4, bool2, M, 48);
            wh50 d11 = jk50.d(c3177a.v, bool, M, 48);
            wh50 d12 = jk50.d(c3177a.x, bool, M, 48);
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = androidx.compose.runtime.k.b((!BuildInfo.u() || ((Boolean) d12.getValue()).booleanValue()) ? null : new i8o(new ddn(izsVar, 0)));
                M.R(x);
            }
            wh50 wh50Var5 = (wh50) x;
            int i5 = i4 & 14;
            int i6 = ((i4 << 3) & 896) | i5;
            if (androidx.compose.runtime.b.d()) {
                wh50Var2 = d3;
                i2 = i4;
                androidx.compose.runtime.b.f(161452222, i6, -1, "com.vk.music.playlist.display.audiobook.presentation.getSubtitle (DisplayAudioBookCardContentView.kt:146)");
            } else {
                wh50Var2 = d3;
                i2 = i4;
            }
            wh50 d13 = jk50.d(c3177a.j, "", M, 48);
            wh50 d14 = jk50.d(c3177a.r, bool, M, 48);
            wh50 d15 = jk50.d(c3177a.s, bool, M, 48);
            boolean z2 = (((i6 & 896) ^ 384) > 256 && M.J(izsVar)) || (i6 & 384) == 256;
            Object x2 = M.x();
            if (z2 || x2 == c0012a2) {
                x2 = new yt7(izsVar, 2);
                M.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            int i7 = i6 & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-715122569, i7, -1, "com.vk.music.playlist.display.audiobook.presentation.rememberAudioBookSubtitles (AudioBookSubtitles.kt:79)");
            }
            boolean J = M.J(c3177a);
            Object x3 = M.x();
            if (J || x3 == c0012a2) {
                x3 = new xj4(d13, d7, d14, d15, gzsVar);
                wh50Var3 = d7;
                M.R(x3);
            } else {
                wh50Var3 = d7;
            }
            xj4 xj4Var = (xj4) x3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            wh50 d16 = jk50.d(c3177a.h, bool, M, 48);
            wh50 d17 = jk50.d(c3177a.g, bool, M, 48);
            wh50 d18 = jk50.d(c3177a.u, bool2, M, 48);
            wh50 d19 = jk50.d(c3177a.w, bool, M, 48);
            int i8 = i2 & 112;
            boolean z3 = i8 == 32;
            Object x4 = M.x();
            if (z3 || x4 == c0012a2) {
                x4 = new s3(izsVar, 2);
                M.R(x4);
            }
            gzs gzsVar2 = (gzs) x4;
            boolean z4 = i8 == 32;
            Object x5 = M.x();
            if (z4 || x5 == c0012a2) {
                x5 = new fgk(izsVar, 1);
                M.R(x5);
            }
            izs izsVar3 = (izs) x5;
            int i9 = 1572864 | i5;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1778790387, i9, -1, "com.vk.music.playlist.display.audiobook.presentation.rememberAudioBookChaptersHeaderButtons (AudioBookChaptersHeaderButtons.kt:71)");
            }
            boolean J2 = M.J(c3177a);
            Object x6 = M.x();
            if (J2 || x6 == c0012a2) {
                x6 = new we4(d16, d17, d, d18, wh50Var5, d19, gzsVar2, izsVar3);
                wh50Var4 = d;
                M.R(x6);
            } else {
                wh50Var4 = d;
            }
            we4 we4Var = (we4) x6;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            wh50 a = jk50.a(c3177a.p, M, 0, 3);
            wh50 d20 = jk50.d(c3177a.n, 0, M, 48);
            if (androidx.compose.runtime.b.d()) {
                i3 = -1;
                androidx.compose.runtime.b.f(687681064, i5, -1, "com.vk.music.playlist.display.audiobook.presentation.rememberAudiobookFooter (AudioBookFooter.kt:65)");
            } else {
                i3 = -1;
            }
            boolean J3 = M.J(c3177a);
            Object x7 = M.x();
            if (J3 || x7 == c0012a2) {
                x7 = new pg4(wh50Var3, a, d20);
                M.R(x7);
            }
            pg4 pg4Var = (pg4) x7;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.music_talkback_audiobook_cover, 0, M);
            boolean z5 = i5 == 4;
            Object x8 = M.x();
            if (z5 || x8 == c0012a2) {
                c0012a = c0012a2;
                i3 = -1;
                z = true;
                peb0Var = new peb0(wh50Var, wh50Var4, d10, wh50Var2, N, xj4Var, we4Var, new wn1(izsVar, 4), new lq0(izsVar, 3), new mnc(izsVar, 2));
                M.R(peb0Var);
            } else {
                peb0Var = x8;
                c0012a = c0012a2;
                z = true;
            }
            peb0 peb0Var2 = (peb0) peb0Var;
            if (i5 != 4) {
                z = false;
            }
            Object x9 = M.x();
            if (z || x9 == c0012a) {
                x9 = new i15(izsVar, izsVar2);
                M.R(x9);
            }
            i15 i15Var = (i15) x9;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1485099965, 0, i3, "com.vk.music.playlist.display.audiobook.presentation.getListContent (DisplayAudioBookCardContentView.kt:161)");
            }
            boolean J4 = M.J(c3177a);
            Object x10 = M.x();
            if (J4 || x10 == c0012a) {
                x10 = new f15(d4, d5, d8, d9, d2, d11, d6, pg4Var, i15Var);
                M.R(x10);
            }
            f15 f15Var = (f15) x10;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            mcb0.a(peb0Var2, f15Var, wh50Var4, i15Var, null, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new edn(i, 0, c3177a, wh50Var, izsVar, izsVar2);
        }
    }
}
