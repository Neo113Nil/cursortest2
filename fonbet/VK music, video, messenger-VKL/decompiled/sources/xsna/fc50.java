package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.music.impl.entity.PlayingState;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.dai;
import xsna.q630;
import xsna.wkj;

/* compiled from: MusicTrack.kt */
/* loaded from: classes16.dex */
public final class fc50 {
    public static final float a = 6;

    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, kotlin.Lazy] */
    public static final void a(ee50 ee50Var, q630 q630Var, androidx.compose.runtime.a aVar, int i, int i2) {
        q630 q630Var2;
        int i3;
        String str;
        com.vk.core.compose.component.cell.content.x xVar;
        PlayingState playingState = ee50Var.h;
        String str2 = ee50Var.d;
        boolean z = ee50Var.f;
        androidx.compose.runtime.a M = aVar.M(513175032);
        int i4 = (M.J(ee50Var) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            q630Var2 = q630Var;
        } else {
            q630Var2 = q630Var;
            i3 = i4 | (M.J(q630Var2) ? 32 : 16);
        }
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            q630.a aVar2 = q630.a.a;
            q630 q630Var3 = i5 != 0 ? aVar2 : q630Var2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(513175032, i3, -1, "com.vk.catalog.mvi.block.music.impl.ui.musictrack.MusicTrack (MusicTrack.kt:76)");
            }
            int i6 = i3 & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1831096608, i6, -1, "com.vk.catalog.mvi.block.music.impl.ui.musictrack.formatContentDescription (MusicTrack.kt:257)");
            }
            if (z) {
                M.K(180711862);
                str = ", " + d370.N(R.string.music_talkback_explicit, 0, M);
                M.j();
            } else {
                M.K(180790910);
                M.j();
                str = "";
            }
            String d = h5s.d(new StringBuilder(), ee50Var.c, " - ", str2, str);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 h = txj0.h(aVar2, 60);
            kbe kbeVar = ((dai.c) ee50Var.l.getValue()).c;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(739566502, 0, -1, "com.vk.catalog.mvi.block.music.impl.ui.musictrack.talkbackActionForState (MusicTrack.kt:267)");
            }
            String a2 = playingState == PlayingState.PLAYING ? zq.a(M, -756441164, R.string.music_talkback_pause_track, M, 0) : zq.a(M, -756363819, R.string.music_talkback_play_track, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 e = ojc.e(237, a2, ((dai.c) ee50Var.m.getValue()).c, kbeVar, h);
            boolean J = M.J(d);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new ykb(d, 3);
                M.R(x);
            }
            q630 g = o19.a(egi0.b(e, true, (izs) x), ee50Var.g ? 1.0f : 0.4f).g(q630Var3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1008267089, i6, -1, "com.vk.catalog.mvi.block.music.impl.ui.musictrack.buildLeftContent (MusicTrack.kt:97)");
            }
            float f = ya50.b;
            String str3 = ee50Var.b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-29723868, 48, -1, "com.vk.catalog.mvi.block.music.impl.ui.musictrack.MusicTrackCover.Companion.invoke (MusicTrack.kt:147)");
            }
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new ya50(str3);
                M.R(x2);
            }
            ya50 ya50Var = (ya50) x2;
            ((zak0) ya50Var.a).setValue(str3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2020397572, 48, -1, "com.vk.catalog.mvi.block.music.impl.ui.musictrack.MusicTrackCoverOverlay.Companion.invoke (MusicTrack.kt:186)");
            }
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new ab50(playingState);
                M.R(x3);
            }
            ab50 ab50Var = (ab50) x3;
            ((zak0) ab50Var.a).setValue(playingState);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 q630Var4 = q630Var3;
            com.vk.core.compose.component.cell.content.z a3 = com.vk.core.compose.component.cell.content.g.a(ya50Var, Cell$Left.Main.Size.Medium, ab50Var, PictureRadius.Large, null, M, 12607536, 100);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-379349608, i6, -1, "com.vk.catalog.mvi.block.music.impl.ui.musictrack.buildMiddleContent (MusicTrack.kt:195)");
            }
            String str4 = ee50Var.e;
            us2 e2 = zs2.a(str2, hik0.a(wlb0.l(M).X.a.a, wlb0.h(M).getText().m, 65534)).e(zs2.a(myc0.f(str4) ? " ".concat(str4) : "", hik0.a(wlb0.l(M).X.a.a, wlb0.h(M).getText().p, 65534)));
            if (z) {
                M.K(-1144546860);
                qzu0.a.getClass();
                lg90 O = qzu0.O(M);
                Object x4 = M.x();
                if (x4 == c0012a) {
                    x4 = new oi40(4);
                    M.R(x4);
                }
                com.vk.core.compose.component.cell.content.x a4 = Cell$Middle.d.a.InterfaceC0732a.C0733a.a(O, 0L, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), M, 24584, 6);
                M.j();
                xVar = a4;
            } else {
                M.K(-1144272882);
                M.j();
                xVar = null;
            }
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new per(17);
                M.R(x5);
            }
            com.vk.core.compose.component.cell.content.h1 b = Cell$Middle.d.b.b(e2, null, null, xVar, 1, 2, com.vk.core.compose.component.semantics.b.a(null, (izs) x5, 3), null, null, M, 221184, 6, 902);
            String str5 = ee50Var.c;
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = new viu(9);
                M.R(x6);
            }
            com.vk.core.compose.component.cell.content.k0 a5 = Cell$Middle.a.a(b, Cell$Middle.c.b.b(str5, 1, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x6, 3), M, 12583344, 88), null, null, M, 196608, 28);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            wiu0.b(g, false, a3, a5, null, null, null, M, 0, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var4;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tq8(ee50Var, q630Var2, i, i2);
        }
    }

    public static final void b(final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        ColorFilter porterDuffColorFilter;
        androidx.compose.runtime.a M = aVar.M(-1725926480);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1725926480, i2, -1, "com.vk.catalog.mvi.block.music.impl.ui.musictrack.PlaceHolderImage (MusicTrack.kt:235)");
            }
            long j = wlb0.h(M).getBackground().x;
            float f = a;
            q630 m = hr80.m(q630Var, j, vog0.b(f));
            y18 a2 = aqw.a((float) 0.5d, wlb0.h(M).getImage().a);
            q630 b = r18.b(a2.a, a2.b, m, vog0.b(f));
            qzu0.a.getClass();
            lg90 s1 = qzu0.s1(M);
            long j2 = wlb0.h(M).getIcon().l;
            if (Build.VERSION.SDK_INT >= 29) {
                se7.b();
                porterDuffColorFilter = re7.b(f870.H(j2), z42.a(5));
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j2), z42.b(5));
            }
            vjw.a(s1, null, b, null, wkj.a.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(j2, 5, porterDuffColorFilter), M, 24632, 40);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ec50
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    fc50.b(q630.this, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
