package xsna;

import android.text.SpannedString;
import androidx.compose.runtime.a;
import com.vk.music.playlist.display.domain.i;
import com.vk.music.playlist.display.presentation.MusicPlaylistPaginationState;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import kotlin.collections.EmptyList;
import xsna.kbb0;
import xsna.wzj;

/* compiled from: MusicPlaylistContent.kt */
/* loaded from: classes3.dex */
public final class oz40 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(i.a.C1350a c1350a, izs<? super com.vk.music.playlist.display.domain.a, s3q0> izsVar, izs<? super Float, s3q0> izsVar2, wh50<Integer> wh50Var, androidx.compose.runtime.a aVar, int i) {
        wh50 wh50Var2;
        boolean z;
        a.C0011a.C0012a c0012a;
        EmptyList emptyList;
        int i2;
        wh50 wh50Var3;
        b250 b250Var;
        androidx.compose.runtime.a M = aVar.M(-1098669753);
        int i3 = i | (M.J(c1350a) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(izsVar2) ? 256 : 128) | (M.J(wh50Var) ? 2048 : 1024);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1098669753, i3, -1, "com.vk.music.playlist.display.presentation.MusicPlaylistContent (MusicPlaylistContent.kt:27)");
            }
            wh50 d = jk50.d(c1350a.d, kbb0.d.a, M, 48);
            yzt0<Boolean> yzt0Var = c1350a.a;
            Boolean bool = Boolean.FALSE;
            wh50 d2 = jk50.d(yzt0Var, bool, M, 48);
            wh50 d3 = jk50.d(c1350a.b, Boolean.TRUE, M, 48);
            yzt0<h9b0> yzt0Var2 = c1350a.c;
            wzj.b.a aVar2 = wzj.b.a.a;
            wh50 d4 = jk50.d(yzt0Var2, new h9b0(), M, 48);
            wh50 d5 = jk50.d(c1350a.f, new SpannedString(""), M, 0);
            wh50 d6 = jk50.d(c1350a.g, 0, M, 48);
            yzt0<w050> yzt0Var3 = c1350a.h;
            EmptyList emptyList2 = EmptyList.b;
            wh50 d7 = jk50.d(yzt0Var3, new w050(emptyList2), M, 48);
            wh50 a = jk50.a(c1350a.l, M, 0, 3);
            wh50 d8 = jk50.d(c1350a.k, bool, M, 48);
            wh50 d9 = jk50.d(c1350a.j, MusicPlaylistPaginationState.LOADING, M, 48);
            wh50 d10 = jk50.d(c1350a.i, 0L, M, 48);
            wh50 d11 = jk50.d(c1350a.n, bool, M, 48);
            wh50 d12 = jk50.d(c1350a.m, emptyList2, M, 48);
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = Boolean.valueOf(MusicFeatures.AUDIO_ARTIST_ALBUM_BANNER.h());
                M.R(x);
            }
            boolean booleanValue = ((Boolean) x).booleanValue();
            int i4 = i3 & 112;
            boolean z2 = i4 == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a2) {
                x2 = new vpd(izsVar, 4);
                M.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            boolean z3 = i4 == 32;
            Object x3 = M.x();
            if (z3 || x3 == c0012a2) {
                x3 = new m87(izsVar, 4);
                M.R(x3);
            }
            gzs gzsVar2 = (gzs) x3;
            int i5 = i3 & 14;
            if (androidx.compose.runtime.b.d()) {
                wh50Var2 = d2;
                z = booleanValue;
                androidx.compose.runtime.b.f(1556657294, i5, -1, "com.vk.music.playlist.display.presentation.rememberMusicPlaylistHeaderSubtitles (MusicPlaylistHeaderSubtitles.kt:72)");
            } else {
                wh50Var2 = d2;
                z = booleanValue;
            }
            boolean J = M.J(c1350a);
            Object x4 = M.x();
            if (J || x4 == c0012a2) {
                x4 = new u050(d, gzsVar, gzsVar2);
                M.R(x4);
            }
            u050 u050Var = (u050) x4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            wh50 d13 = jk50.d(c1350a.e, new l050(0), M, 48);
            boolean z4 = i4 == 32;
            Object x5 = M.x();
            if (z4 || x5 == c0012a2) {
                x5 = new f3(izsVar, 6);
                M.R(x5);
            }
            gzs gzsVar3 = (gzs) x5;
            boolean z5 = i4 == 32;
            Object x6 = M.x();
            if (z5 || x6 == c0012a2) {
                x6 = new th2(izsVar, 4);
                M.R(x6);
            }
            gzs gzsVar4 = (gzs) x6;
            boolean z6 = i4 == 32;
            Object x7 = M.x();
            if (z6 || x7 == c0012a2) {
                x7 = new ux(izsVar, 4);
                M.R(x7);
            }
            gzs gzsVar5 = (gzs) x7;
            boolean z7 = i4 == 32;
            Object x8 = M.x();
            if (z7 || x8 == c0012a2) {
                x8 = new o87(izsVar, 5);
                M.R(x8);
            }
            gzs gzsVar6 = (gzs) x8;
            boolean z8 = i4 == 32;
            Object x9 = M.x();
            if (z8 || x9 == c0012a2) {
                x9 = new mse(izsVar, 4);
                M.R(x9);
            }
            gzs gzsVar7 = (gzs) x9;
            boolean z9 = i4 == 32;
            Object x10 = M.x();
            if (z9 || x10 == c0012a2) {
                x10 = new nse(izsVar, 4);
                M.R(x10);
            }
            gzs gzsVar8 = (gzs) x10;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-937129315, i5, -1, "com.vk.music.playlist.display.presentation.rememberMusicPlaylistHeaderButtons (MusicPlaylistHeaderButtons.kt:100)");
            }
            boolean J2 = M.J(c1350a);
            Object x11 = M.x();
            if (J2 || x11 == c0012a2) {
                x11 = !((l050) d13.getValue()).l ? new n050(d13, gzsVar3, gzsVar4, gzsVar5, gzsVar6, gzsVar7, gzsVar8) : new a050(d13, gzsVar3, gzsVar4, gzsVar5, gzsVar6, gzsVar7);
                M.R(x11);
            }
            f9b0 f9b0Var = (f9b0) x11;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean z10 = false;
            String N = d370.N(d.getValue() instanceof kbb0.a ? R.string.music_talkback_album_cover : R.string.music_talkback_playlist_cover, 0, M);
            boolean z11 = i5 == 4;
            Object x12 = M.x();
            if (z11 || x12 == c0012a2) {
                c0012a = c0012a2;
                emptyList = emptyList2;
                i2 = i5;
                wh50Var3 = wh50Var2;
                z10 = false;
                peb0 peb0Var = new peb0(wh50Var, wh50Var3, d3, d4, N, u050Var, f9b0Var, new ln7(izsVar, 6), new px(izsVar, 2), null);
                M.R(peb0Var);
                x12 = peb0Var;
            } else {
                i2 = i5;
                c0012a = c0012a2;
                emptyList = emptyList2;
                wh50Var3 = wh50Var2;
            }
            peb0 peb0Var2 = (peb0) x12;
            boolean z12 = i2 == 4 ? true : z10;
            Object x13 = M.x();
            if (z12 || x13 == c0012a) {
                x13 = new b250(izsVar, izsVar2);
                M.R(x13);
            }
            b250 b250Var2 = (b250) x13;
            boolean z13 = i2 != 4 ? z10 : true;
            Object x14 = M.x();
            if (z13 || x14 == c0012a) {
                wh50 b = z ? d12 : androidx.compose.runtime.k.b(emptyList);
                b250Var = b250Var2;
                x14 = new k150(d5, d6, d7, a, b, d9, d8, d, d10, d11, b250Var);
                M.R(x14);
            } else {
                b250Var = b250Var2;
            }
            mcb0.a(peb0Var2, (k150) x14, wh50Var3, b250Var, null, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ehf(c1350a, izsVar, izsVar2, wh50Var, i, 2);
        }
    }
}
