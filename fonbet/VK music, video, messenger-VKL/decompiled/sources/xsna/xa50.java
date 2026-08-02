package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.Thumb;
import com.vk.music.playlist.framework.presentation.track.MusicTrackPlayState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.lab0;
import xsna.q630;
import xsna.wkj;

/* compiled from: MusicTrackComponent.kt */
/* loaded from: classes3.dex */
public final class xa50 {
    public static final float a = 48;
    public static final float b = 6;
    public static final bpn0 c = new bpn0(new ob0(21));

    /* compiled from: MusicTrackComponent.kt */
    public static final class a implements yzs<bi40, androidx.compose.runtime.a, Integer, l5g> {
        public static final a b = new a();

        @Override // xsna.yzs
        public final l5g invoke(bi40 bi40Var, androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            aVar2.K(1613382266);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1613382266, intValue, -1, "com.vk.music.playlist.framework.presentation.track.MusicTrackComponent.<anonymous>.<anonymous> (MusicTrackComponent.kt:115)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return com.vk.movika.sdk.android.defaultplayer.interactive.c.c(j, aVar2);
        }
    }

    public static final void a(final lab0.a aVar, final boolean z, q630 q630Var, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, gzs<s3q0> gzsVar3, androidx.compose.runtime.a aVar2, final int i, final int i2) {
        q630 q630Var2;
        int i3;
        gzs<s3q0> gzsVar4;
        int i4;
        gzs<s3q0> gzsVar5;
        int i5;
        gzs<s3q0> gzsVar6;
        int i6;
        final q630 q630Var3;
        final gzs<s3q0> gzsVar7;
        final gzs<s3q0> gzsVar8;
        final gzs<s3q0> gzsVar9;
        gzs<s3q0> gzsVar10;
        gzs<s3q0> gzsVar11;
        gzs<s3q0> gzsVar12;
        String str;
        androidx.compose.runtime.a M = aVar2.M(57188463);
        int i7 = i | (M.J(aVar) ? 4 : 2);
        if ((i & 48) == 0) {
            i7 |= M.l(z) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 = i7 | 384;
            q630Var2 = q630Var;
        } else {
            q630Var2 = q630Var;
            i3 = i7 | (M.J(q630Var2) ? 256 : 128);
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i4 = i3 | 3072;
            gzsVar4 = gzsVar;
        } else {
            gzsVar4 = gzsVar;
            i4 = i3 | (M.y(gzsVar4) ? 2048 : 1024);
        }
        int i10 = i2 & 16;
        if (i10 != 0) {
            i5 = i4 | 24576;
            gzsVar5 = gzsVar2;
        } else {
            gzsVar5 = gzsVar2;
            i5 = i4 | (M.y(gzsVar5) ? 16384 : 8192);
        }
        int i11 = i2 & 32;
        if (i11 != 0) {
            i6 = i5 | 196608;
            gzsVar6 = gzsVar3;
        } else {
            gzsVar6 = gzsVar3;
            i6 = i5 | (M.y(gzsVar6) ? 131072 : 65536);
        }
        int i12 = i6;
        if (M.t(i12 & 1, (74899 & i12) != 74898)) {
            q630.a aVar3 = q630.a.a;
            q630 q630Var4 = i8 != 0 ? aVar3 : q630Var2;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (i9 != 0) {
                Object x = M.x();
                if (x == c0012a) {
                    x = new ta50(0);
                    M.R(x);
                }
                gzsVar10 = (gzs) x;
            } else {
                gzsVar10 = gzsVar4;
            }
            if (i10 != 0) {
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new ig(20);
                    M.R(x2);
                }
                gzsVar11 = (gzs) x2;
            } else {
                gzsVar11 = gzsVar5;
            }
            if (i11 != 0) {
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = new i21(20);
                    M.R(x3);
                }
                gzsVar12 = (gzs) x3;
            } else {
                gzsVar12 = gzsVar6;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(57188463, i12, -1, "com.vk.music.playlist.framework.presentation.track.MusicTrackComponent (MusicTrackComponent.kt:77)");
            }
            int i13 = i12 & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-819669034, i13, -1, "com.vk.music.playlist.framework.presentation.track.formatContentDescription (MusicTrackComponent.kt:338)");
            }
            if (aVar.f) {
                M.K(-1870961984);
                str = ", " + d370.N(R.string.music_talkback_explicit, 0, M);
                M.j();
            } else {
                M.K(-1870882936);
                M.j();
                str = "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.c);
            sb.append(" - ");
            String a2 = i5s.a(sb, aVar.d, str);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 h = txj0.h(txj0.f(q630Var4, 1.0f), 60);
            MusicTrackPlayState musicTrackPlayState = aVar.h;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(171988052, 0, -1, "com.vk.music.playlist.framework.presentation.track.talkbackActionForState (MusicTrackComponent.kt:348)");
            }
            String a3 = musicTrackPlayState == MusicTrackPlayState.PLAYING ? zq.a(M, -199786874, R.string.music_talkback_pause_track, M, 0) : zq.a(M, -199709529, R.string.music_talkback_play_track, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 e = ojc.e(237, a3, gzsVar12, gzsVar11, h);
            boolean J = M.J(a2);
            Object x4 = M.x();
            if (J || x4 == c0012a) {
                x4 = new det(a2, 1);
                M.R(x4);
            }
            q630 a4 = o19.a(egi0.b(e, true, (izs) x4), aVar.g ? 1.0f : 0.4f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a5 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, a4);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a5, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            if (z) {
                M.K(-1674043245);
                f(aVar, null, M, i13);
                M.j();
            } else {
                M.K(-1673978052);
                b(aVar, null, M, i13);
                M.j();
            }
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            d(aVar, z, new xpy(1.0f, true), M, i12 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            float f = 8;
            q630 q = txj0.q(s200.H(aVar3, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 12);
            bi40 bi40Var = aVar.i;
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-965106562, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ArrowDownCircle12> (VkIcons.kt:304)");
            }
            lg90 a6 = pg90.a(R.drawable.vk_icon_arrow_down_circle_12, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean booleanValue = ((Boolean) c.getValue()).booleanValue();
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new pey(9);
                M.R(x5);
            }
            gzs<s3q0> gzsVar13 = gzsVar12;
            gzs<s3q0> gzsVar14 = gzsVar11;
            ki40.a(bi40Var, a6, a.b, (izs) x5, q, null, booleanValue, M, 27712, 32);
            gzs<s3q0> gzsVar15 = gzsVar10;
            nzu0.e(gzsVar15, ahn.E(txj0.s(s200.H(aVar3, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), 36, 48), "trackMenu"), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, null, null, nii.a, M, ((i12 >> 9) & 14) | 100663344, 252);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            gzsVar8 = gzsVar14;
            gzsVar7 = gzsVar15;
            q630Var3 = q630Var4;
            gzsVar9 = gzsVar13;
        } else {
            M.h();
            q630Var3 = q630Var2;
            gzsVar7 = gzsVar4;
            gzsVar8 = gzsVar5;
            gzsVar9 = gzsVar6;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ua50
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xa50.a(lab0.a.this, z, q630Var3, gzsVar7, gzsVar8, gzsVar9, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(lab0.a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar2.M(2013956705);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2013956705, i3, -1, "com.vk.music.playlist.framework.presentation.track.MusicTrackCover (MusicTrackComponent.kt:144)");
            }
            float f = 16;
            q630Var2 = q630.a.a;
            q630 d = rte0.d(s200.H(q630Var2, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), vog0.b(b));
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, d);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            Object obj = aVar.b;
            MusicTrackPlayState musicTrackPlayState = aVar.h;
            c(obj, null, M, 0);
            if (musicTrackPlayState != MusicTrackPlayState.NONE) {
                M.K(2046125153);
                float f2 = 2;
                float f3 = 18;
                float f4 = 4;
                float f5 = 10;
                o6b0.a(new t5b0(f2, f3, f4, f2, f4, l5g.d, e43.l(new pco(f5), new pco(f), new pco(f3), new pco(f5)), new l5g(l5g.c(14, l5g.b, 0.3f))), musicTrackPlayState == MusicTrackPlayState.PLAYING, ahn.E(txj0.m(q630Var2, a), "playingIndicator"), M, 384);
            } else {
                M.K(2039817211);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new va50(aVar, q630Var2, i, 0);
        }
    }

    public static final void c(Object obj, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1375462775);
        int i2 = (M.J(obj) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1375462775, i2, -1, "com.vk.music.playlist.framework.presentation.track.MusicTrackImage (MusicTrackComponent.kt:223)");
            }
            int i3 = (i2 & 14) | 48;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(131634944, i3, -1, "com.vk.music.playlist.framework.presentation.getForSizeOrEmpty (Util.kt:22)");
            }
            float f = a;
            String d = skd.d((Thumb) obj, f, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int length = d.length();
            q630.a aVar2 = q630.a.a;
            if (length == 0) {
                M.K(1871638862);
                e(txj0.q(ahn.E(aVar2, "trackCover"), f), M, 0);
                M.j();
            } else {
                M.K(1871840083);
                fwu0.c(txj0.q(ahn.E(aVar2, "trackCover"), f), null, d, null, null, null, null, nii.b, M, 100663296, 250);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jn7(obj, q630Var, i, 7);
        }
    }

    public static final void d(final lab0.a aVar, final boolean z, final q630 q630Var, androidx.compose.runtime.a aVar2, final int i) {
        int i2;
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar2.M(-1213704988);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1213704988, i2, -1, "com.vk.music.playlist.framework.presentation.track.MusicTrackInfo (MusicTrackComponent.kt:286)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630.a aVar5 = q630.a.a;
            q630 c3 = qri.c(M, aVar5);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            q630 E = ahn.E(aVar5, "trackName");
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 d = defpackage.j0.d(1.0f, E, false);
            String str = aVar.d;
            String str2 = aVar.e;
            yqv0.d(zs2.a(str, hik0.a(wlb0.l(M).X.a.a, wlb0.h(M).getText().m, 65534)).e(zs2.a(myc0.f(str2) ? " ".concat(str2) : "", hik0.a(wlb0.l(M).X.a.a, wlb0.h(M).getText().p, 65534))), d, 0L, 5, null, 2, false, 1, null, null, null, M, 100663296, 6, 15036);
            if (aVar.f) {
                M.K(-169643270);
                hri.a(ahn.E(aVar5, "explicitIcon").g(new gor0(dt1.a.l)), M, 0);
            } else {
                M.K(-181596808);
            }
            M.j();
            M.G();
            yqv0.c(aVar.c, s200.H(ahn.E(aVar5, "trackArtist"), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.h(M).getText().p, null, null, 0, 5, null, 2, false, 0, 1, null, wlb0.l(M).m0, M, 100663344, 48, 5816);
            aVar3 = M;
            aVar3.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.wa50
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    xa50.d(lab0.a.this, z, q630Var, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        ColorFilter porterDuffColorFilter;
        androidx.compose.runtime.a M = aVar.M(484609628);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(484609628, i2, -1, "com.vk.music.playlist.framework.presentation.track.PlaceHolderImage (MusicTrackComponent.kt:260)");
            }
            long j = wlb0.h(M).getBackground().x;
            float f = b;
            q630 m = hr80.m(q630Var, j, vog0.b(f));
            y18 a2 = aqw.a((float) 0.5d, wlb0.h(M).getImage().a);
            q630 b2 = r18.b(a2.a, a2.b, m, vog0.b(f));
            qzu0.a.getClass();
            lg90 s1 = qzu0.s1(M);
            long j2 = wlb0.h(M).getIcon().l;
            if (Build.VERSION.SDK_INT >= 29) {
                se7.b();
                porterDuffColorFilter = re7.b(f870.H(j2), z42.a(5));
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j2), z42.b(5));
            }
            vjw.a(s1, null, b2, null, wkj.a.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(j2, 5, porterDuffColorFilter), M, 24632, 40);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ubo(q630Var, i, 1);
        }
    }

    public static final void f(lab0.a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        q630 q630Var2;
        char c2;
        boolean z;
        q630.a aVar3;
        int i3;
        String str;
        int i4;
        int i5;
        androidx.compose.runtime.a M = aVar2.M(1548237621);
        if ((i & 6) == 0) {
            i2 = i | (M.J(aVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i6 = i2 | 48;
        if (M.t(i6 & 1, (i6 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1548237621, i6, -1, "com.vk.music.playlist.framework.presentation.track.TrackIndexWithIndication (MusicTrackComponent.kt:176)");
            }
            q630.a aVar4 = q630.a.a;
            q630 v = txj0.v(aVar4, 52);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c3 = qri.c(M, v);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c3, cri.a.d);
            if (aVar.h != MusicTrackPlayState.NONE) {
                M.K(-615553776);
                float f = 2;
                float f2 = 18;
                float f3 = 4;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                float f4 = 10;
                t5b0 t5b0Var = new t5b0(f, f2, f3, f, f, ylu0Var.getIcon().a, e43.l(new pco(f4), new pco(14), new pco(f2), new pco(f4)), null);
                float f5 = 20;
                o6b0.a(t5b0Var, aVar.h == MusicTrackPlayState.PLAYING, txj0.s(ahn.E(aVar4, "playingIndicator"), f5, f5), M, 384);
                M.j();
                aVar3 = aVar4;
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                i3 = 4;
            } else {
                M.K(-614813713);
                q630 E = ahn.E(aVar4, "trackIndex");
                String valueOf = String.valueOf(aVar.l);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.e0;
                if (androidx.compose.runtime.b.d()) {
                    c2 = 41192;
                    z = false;
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                } else {
                    c2 = 41192;
                    z = false;
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3 = aVar4;
                i3 = 4;
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                yqv0.c(valueOf, E, ylu0Var2.getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, 48, 0, 8184);
                M = M;
                M.j();
            }
            if (aVar.k) {
                M.K(-614501977);
                q630Var2 = aVar3;
                q630 H = s200.H(q630Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                if (androidx.compose.runtime.b.d()) {
                    i4 = 0;
                    i5 = -1;
                    androidx.compose.runtime.b.f(1364245404, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Favorite12> (VkSdkIcons.kt:830)");
                } else {
                    i4 = 0;
                    i5 = -1;
                }
                lg90 b2 = or.b(M, -1040521013, R.drawable.vk_icon_favorite_12, M, i4);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i4, i5, str);
                }
                ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                pzu0.b(b2, null, H, ylu0Var3.q().g, M, 440, 0);
            } else {
                q630Var2 = aVar3;
                M.K(-622974525);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zbo(aVar, q630Var2, i, 1);
        }
    }
}
