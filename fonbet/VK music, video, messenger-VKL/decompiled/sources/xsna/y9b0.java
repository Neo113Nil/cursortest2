package xsna;

import android.content.res.Configuration;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.os.Build;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.Thumb;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.chs;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.wkj;
import xsna.wzj;

/* compiled from: PlaylistHeader.kt */
/* loaded from: classes3.dex */
public final class y9b0 {
    public static final float a = 12;
    public static final float b = 180;
    public static final float c = 56;

    public static final void a(final wzj.a aVar, final boolean z, final String str, androidx.compose.runtime.a aVar2, final int i) {
        int i2;
        float f;
        androidx.compose.runtime.a M = aVar2.M(-1632927421);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(str) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1632927421, i2, -1, "com.vk.music.playlist.framework.presentation.screen.ComplexCoverImage (PlaylistHeader.kt:303)");
            }
            M.K(-1580182947);
            List H0 = j5g.H0(aVar.a, 4);
            ArrayList arrayList = new ArrayList(c5g.u(H0, 10));
            Iterator it = H0.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                Uri uri = null;
                f = b;
                if (!hasNext) {
                    break;
                }
                Thumb thumb = (Thumb) it.next();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(224607825, 48, -1, "com.vk.music.playlist.framework.presentation.getForSizeUriOrEmpty (Util.kt:32)");
                }
                azl azlVar = (azl) M.r(uvi.h);
                if (thumb != null) {
                    int I0 = (int) azlVar.I0(f);
                    Serializer.c<Thumb> cVar = Thumb.CREATOR;
                    uri = thumb.Cb(I0, false);
                }
                if (uri == null) {
                    uri = Uri.EMPTY;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                arrayList.add(uri);
            }
            M.j();
            int I02 = (int) ((azl) M.r(uvi.h)).I0(f);
            boolean J = M.J(arrayList);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new qow(new ThumbsImageView.a(arrayList, I02, null));
                M.R(x);
            }
            fwu0.b(((qow) x).a, null, null, null, kai.c(32502030, new a0t() { // from class: xsna.o9b0
                @Override // xsna.a0t
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i3;
                    qa8 qa8Var = (qa8) obj;
                    chs chsVar = (chs) obj2;
                    lg90 lg90Var = (lg90) obj3;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if ((intValue & 6) == 0) {
                        i3 = (aVar3.J(qa8Var) ? 4 : 2) | intValue;
                    } else {
                        i3 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i3 |= aVar3.J(chsVar) ? 32 : 16;
                    }
                    if ((intValue & 384) == 0) {
                        i3 |= (intValue & 512) == 0 ? aVar3.J(lg90Var) : aVar3.y(lg90Var) ? 256 : 128;
                    }
                    if (aVar3.t(i3 & 1, (i3 & 1171) != 1170)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(32502030, i3, -1, "com.vk.music.playlist.framework.presentation.screen.ComplexCoverImage.<anonymous> (PlaylistHeader.kt:318)");
                        }
                        y9b0.b(qa8Var, chsVar, lg90Var, z, str, aVar3, (i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | 512 | (i3 & 896));
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 24576, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.p9b0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    y9b0.a(wzj.a.this, z, str, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final qa8 qa8Var, final chs chsVar, final lg90 lg90Var, final boolean z, final String str, androidx.compose.runtime.a aVar, final int i) {
        qa8 qa8Var2;
        int i2;
        chs chsVar2;
        boolean z2;
        String str2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1007344594);
        if ((i & 6) == 0) {
            qa8Var2 = qa8Var;
            i2 = (M.J(qa8Var2) ? 4 : 2) | i;
        } else {
            qa8Var2 = qa8Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            chsVar2 = chsVar;
            i2 |= M.J(chsVar2) ? 32 : 16;
        } else {
            chsVar2 = chsVar;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= M.l(z2) ? 2048 : 1024;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            str2 = str;
            i2 |= M.J(str2) ? 16384 : 8192;
        } else {
            str2 = str;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1007344594, i2, -1, "com.vk.music.playlist.framework.presentation.screen.Cover (PlaylistHeader.kt:338)");
            }
            uog0 b2 = vog0.b(a);
            float f = 2;
            float f2 = 1;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            y18 a2 = aqw.a(f2, ylu0Var.getImage().a);
            final chs chsVar3 = chsVar2;
            final qa8 qa8Var3 = qa8Var2;
            final boolean z3 = z2;
            final String str3 = str2;
            aVar2 = M;
            shu0.a(null, b2, 0L, 0L, a2, f, kai.c(-234720131, new wzs() { // from class: xsna.q9b0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    float f3;
                    String str4;
                    ColorFilter porterDuffColorFilter;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    float f4 = y9b0.a;
                    float f5 = y9b0.b;
                    if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-234720131, intValue, -1, "com.vk.music.playlist.framework.presentation.screen.Cover.<anonymous> (PlaylistHeader.kt:347)");
                        }
                        chs chsVar4 = chs.this;
                        boolean z4 = chsVar4 instanceof chs.b;
                        q630.a aVar4 = q630.a.a;
                        String str5 = str3;
                        if (z4 || (chsVar4 instanceof chs.a) || (chsVar4 instanceof chs.c)) {
                            f3 = f4;
                            str4 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                            aVar3.K(-340509142);
                            q630 m = hr80.m(txj0.q(aVar4, f5), wlb0.h(aVar3).getBackground().x, vog0.b(f3));
                            y18 a3 = aqw.a(1, wlb0.h(aVar3).getImage().a);
                            q630 E = ahn.E(r18.b(a3.a, a3.b, m, vog0.b(f3)), "playlistImage");
                            qzu0.a.getClass();
                            lg90 g1 = qzu0.g1(aVar3);
                            long j = wlb0.h(aVar3).getIcon().l;
                            if (Build.VERSION.SDK_INT >= 29) {
                                se7.b();
                                porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
                            } else {
                                porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
                            }
                            vjw.a(g1, str5, E, null, wkj.a.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(j, 5, porterDuffColorFilter), aVar3, 24584, 40);
                            aVar3.j();
                        } else {
                            aVar3.K(-339454336);
                            q630 d = rte0.d(txj0.q(aVar4, f5), vog0.b(f4));
                            float f6 = 1;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            y18 a4 = aqw.a(f6, ylu0Var2.getImage().a);
                            q630 E2 = ahn.E(r18.b(a4.a, a4.b, d, vog0.b(f4)), "playlistImage");
                            f3 = f4;
                            str4 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                            vjw.a(lg90Var, str5, E2, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar3, 8, 120);
                            aVar3.j();
                        }
                        if (z3) {
                            aVar3.K(-338682126);
                            dt1.a.getClass();
                            q630 E3 = ahn.E(txj0.h(txj0.v(qa8Var3.b(aVar4, dt1.a.i), f5), 30), "curatorBadge");
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, str4);
                            }
                            ylu0 ylu0Var3 = (ylu0) aVar3.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            q630 m2 = hr80.m(E3, ylu0Var3.q().b, vog0.b(f3));
                            cp10 d2 = ja8.d(dt1.a.f, false);
                            int hashCode = Long.hashCode(n34.n(aVar3));
                            sy90 D = aVar3.D();
                            q630 c2 = qri.c(aVar3, m2);
                            cri.h7.getClass();
                            LayoutNode.a aVar5 = cri.a.b;
                            if (aVar3.N() == null) {
                                n34.r();
                                throw null;
                            }
                            aVar3.H();
                            if (aVar3.L()) {
                                aVar3.I(aVar5);
                            } else {
                                aVar3.f();
                            }
                            k9q0.w(aVar3, d2, cri.a.f);
                            k9q0.w(aVar3, D, cri.a.e);
                            k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                            k9q0.t(aVar3, cri.a.h);
                            k9q0.w(aVar3, c2, cri.a.d);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                            }
                            wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            yqv0.c(d370.N(R.string.music_playlist_curator, 0, aVar3), null, l5g.d, null, null, 0, 3, null, 0, false, 0, 0, null, wuv0Var.v0, aVar3, 384, 0, 8122);
                            aVar3 = aVar3;
                            aVar3.G();
                        } else {
                            aVar3.K(-353457563);
                        }
                        aVar3.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, 1769472, 13);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.s9b0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    y9b0.b(qa8.this, chsVar, lg90Var, z, str, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(boolean z, wzj wzjVar, String str, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-128145520);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(wzjVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(str) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-128145520, i2, -1, "com.vk.music.playlist.framework.presentation.screen.CoverImage (PlaylistHeader.kt:281)");
            }
            if (wzjVar instanceof wzj.a) {
                M.K(642918386);
                a((wzj.a) wzjVar, z, str, M, (i2 & 896) | ((i2 << 3) & 112));
                M.j();
            } else {
                if (!(wzjVar instanceof wzj.b)) {
                    throw alb0.c(1406211517, M);
                }
                M.K(643137587);
                i((wzj.b) wzjVar, z, str, M, (i2 & 896) | ((i2 << 3) & 112));
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new k9b0(z, wzjVar, str, i);
        }
    }

    public static final void d(boolean z, vvw vvwVar, aab0 aab0Var, f9b0 f9b0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        boolean z2;
        q630 G;
        androidx.compose.runtime.a M = aVar.M(1613336954);
        int i2 = i | (M.J(vvwVar) ? 256 : 128) | (M.J(aab0Var) ? 2048 : 1024) | (M.J(f9b0Var) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9361) != 9360)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1613336954, i2, -1, "com.vk.music.playlist.framework.presentation.screen.InfoBlock (PlaylistHeader.kt:428)");
            }
            int i3 = i2 >> 3;
            h(6, M, vvwVar.a, vvwVar.c, null, z, vvwVar.b);
            aVar2 = M;
            z2 = z;
            q630.a aVar3 = q630.a.a;
            if (z2) {
                aVar2.K(-2057470401);
                dt1.a.getClass();
                aab0Var.a(aVar3, dt1.a.n, aVar2, (i3 & 896) | 54);
                aVar2.j();
            } else {
                aVar2.K(-2057327026);
                float f = 24;
                q630 H = s200.H(aVar3, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                dt1.a.getClass();
                aab0Var.a(H, dt1.a.o, aVar2, (i3 & 896) | 54);
                aVar2.j();
            }
            if (z2 && (f9b0Var instanceof n050)) {
                G = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            } else if (z2) {
                G = s200.H(txj0.x(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 380, 1, aVar3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            } else if (f9b0Var instanceof n050) {
                G = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, 5);
            } else {
                float f2 = 16;
                G = s200.G(aVar3, f2, 20, f2, f2);
            }
            f9b0Var.a(((i2 >> 6) & 896) | 48, aVar2, G, z2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            z2 = z;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new dp7(z2, vvwVar, aab0Var, f9b0Var, i);
        }
    }

    public static final void e(final float f, final h9b0 h9b0Var, final aab0 aab0Var, final f9b0 f9b0Var, q630 q630Var, final String str, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1150668106);
        int i2 = i | (M.n(f) ? 4 : 2) | (M.J(h9b0Var) ? 32 : 16) | (M.J(aab0Var) ? 256 : 128) | (M.J(f9b0Var) ? 2048 : 1024) | 24576 | (M.J(str) ? 131072 : 65536) | (M.y(gzsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1150668106, i2, -1, "com.vk.music.playlist.framework.presentation.screen.PlaylistHeader (PlaylistHeader.kt:96)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().g;
            float f2 = 20;
            uog0 d = vog0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f2, 3);
            q630.a aVar2 = q630.a.a;
            ua8.a(hr80.m(aVar2, j, d), null, false, kai.c(993997876, new yzs() { // from class: xsna.j9b0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Thumb image;
                    va8 va8Var = (va8) obj;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    float f3 = y9b0.b;
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.J(va8Var) ? 4 : 2;
                    }
                    boolean z = true;
                    if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(993997876, intValue, -1, "com.vk.music.playlist.framework.presentation.screen.PlaylistHeader.<anonymous> (PlaylistHeader.kt:105)");
                        }
                        Object x = aVar3.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (x == c0012a) {
                            qow qowVar = new qow(new e9b0());
                            aVar3.R(qowVar);
                            x = qowVar;
                        }
                        T t = ((qow) x).a;
                        final y6g y6gVar = new y6g(s7g.a(R.color.vk_black_alpha35, aVar3));
                        final h9b0 h9b0Var2 = h9b0.this;
                        wzj wzjVar = h9b0Var2.a;
                        if (wzjVar instanceof wzj.a) {
                            image = ((wzj.a) wzjVar).a.get(0);
                        } else {
                            if (!(wzjVar instanceof wzj.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            image = ((wzj.b) wzjVar).getImage();
                        }
                        if (pco.a(va8Var.j(), 600) > 0) {
                            aVar3.K(-1608353686);
                            aVar3.j();
                        } else {
                            aVar3.K(1749233633);
                            boolean z2 = ((Configuration) aVar3.r(AndroidCompositionLocals_androidKt.a)).orientation == 2;
                            aVar3.j();
                            z = z2;
                        }
                        final float f4 = f;
                        final aab0 aab0Var2 = aab0Var;
                        final f9b0 f9b0Var2 = f9b0Var;
                        final gzs gzsVar2 = gzsVar;
                        final String str2 = str;
                        if (z) {
                            aVar3.K(-1608183485);
                            String d2 = skd.d(image, f3, aVar3);
                            Object x2 = aVar3.x();
                            if (x2 == c0012a) {
                                x2 = new gvs(22);
                                aVar3.R(x2);
                            }
                            final Thumb thumb = image;
                            fwu0.c(null, null, d2, null, null, (izs) x2, new qow(t), kai.c(167724040, new a0t() { // from class: xsna.t9b0
                                @Override // xsna.a0t
                                public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
                                    int i3;
                                    chs chsVar = (chs) obj5;
                                    lg90 lg90Var = (lg90) obj6;
                                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj7;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    if ((intValue2 & 48) == 0) {
                                        i3 = (aVar4.J(chsVar) ? 32 : 16) | intValue2;
                                    } else {
                                        i3 = intValue2;
                                    }
                                    if ((intValue2 & 384) == 0) {
                                        i3 |= (intValue2 & 512) == 0 ? aVar4.J(lg90Var) : aVar4.y(lg90Var) ? 256 : 128;
                                    }
                                    if (aVar4.t(i3 & 1, (i3 & 1169) != 1168)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(167724040, i3, -1, "com.vk.music.playlist.framework.presentation.screen.PlaylistHeader.<anonymous>.<anonymous> (PlaylistHeader.kt:127)");
                                        }
                                        boolean z3 = (i3 & 112) == 32;
                                        Object x3 = aVar4.x();
                                        if (z3 || x3 == a.C0011a.a) {
                                            x3 = bbk0.b(new qx(chsVar, thumb, y6gVar, lg90Var, 4));
                                            aVar4.R(x3);
                                        }
                                        y9b0.f(new z9b0(f4, (lg90) ((mtk0) x3).getValue()), h9b0Var2, new g9b0(aab0Var2, f9b0Var2), gzsVar2, null, str2, aVar4, 0);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar4.h();
                                    }
                                    return s3q0.a;
                                }
                            }, aVar3), aVar3, 102432768, 155);
                            aVar3.j();
                        } else {
                            aVar3.K(-1606863536);
                            String d3 = skd.d(image, f3, aVar3);
                            Object x3 = aVar3.x();
                            if (x3 == c0012a) {
                                x3 = new wo40(9);
                                aVar3.R(x3);
                            }
                            final Thumb thumb2 = image;
                            fwu0.c(null, null, d3, null, null, (izs) x3, new qow(t), kai.c(-427748897, new a0t() { // from class: xsna.u9b0
                                @Override // xsna.a0t
                                public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
                                    int i3;
                                    chs chsVar = (chs) obj5;
                                    lg90 lg90Var = (lg90) obj6;
                                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj7;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    if ((intValue2 & 48) == 0) {
                                        i3 = (aVar4.J(chsVar) ? 32 : 16) | intValue2;
                                    } else {
                                        i3 = intValue2;
                                    }
                                    if ((intValue2 & 384) == 0) {
                                        i3 |= (intValue2 & 512) == 0 ? aVar4.J(lg90Var) : aVar4.y(lg90Var) ? 256 : 128;
                                    }
                                    if (aVar4.t(i3 & 1, (i3 & 1169) != 1168)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-427748897, i3, -1, "com.vk.music.playlist.framework.presentation.screen.PlaylistHeader.<anonymous>.<anonymous> (PlaylistHeader.kt:159)");
                                        }
                                        boolean z3 = (i3 & 112) == 32;
                                        Object x4 = aVar4.x();
                                        if (z3 || x4 == a.C0011a.a) {
                                            x4 = bbk0.b(new v9b0(chsVar, thumb2, y6gVar, lg90Var, 0));
                                            aVar4.R(x4);
                                        }
                                        y9b0.g(new z9b0(f4, (lg90) ((mtk0) x4).getValue()), h9b0Var2, new g9b0(aab0Var2, f9b0Var2), gzsVar2, null, str2, aVar4, 0);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar4.h();
                                    }
                                    return s3q0.a;
                                }
                            }, aVar3), aVar3, 102432768, 155);
                            aVar3.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(f, h9b0Var, aab0Var, f9b0Var, q630Var2, str, gzsVar, i) { // from class: xsna.r9b0
                public final /* synthetic */ float b;
                public final /* synthetic */ h9b0 c;
                public final /* synthetic */ aab0 d;
                public final /* synthetic */ f9b0 e;
                public final /* synthetic */ q630 f;
                public final /* synthetic */ String g;
                public final /* synthetic */ gzs h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    y9b0.e(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void f(final z9b0 z9b0Var, final h9b0 h9b0Var, final g9b0 g9b0Var, final gzs gzsVar, q630 q630Var, final String str, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-884520043);
        int i2 = i | (M.J(z9b0Var) ? 4 : 2) | (M.J(h9b0Var) ? 32 : 16) | (M.J(g9b0Var) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024) | 24576 | (M.J(str) ? 131072 : 65536);
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-884520043, i2, -1, "com.vk.music.playlist.framework.presentation.screen.PlaylistHeaderLandscape (PlaylistHeader.kt:231)");
            }
            float f = 20;
            uog0 d = vog0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 3);
            q630.a aVar2 = q630.a.a;
            float f2 = 16;
            q630 G = s200.G(ng90.a(txj0.z(txj0.f(rte0.d(aVar2, d), 1.0f), null, 3), z9b0Var.b, null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 54), f2, z9b0Var.a + c, f2, f2);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, G);
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
            c(h9b0Var.c, h9b0Var.a, str, M, (i2 >> 9) & 896);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 H = s200.H(txj0.h(new xpy(1.0f, true), b), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.e, dt1.a.n, M, 54);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, H);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            d(true, new vvw(h9b0Var.b, gzsVar, h9b0Var.d), g9b0Var.a, g9b0Var.b, M, 54);
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(h9b0Var, g9b0Var, gzsVar, q630Var2, str, i) { // from class: xsna.x9b0
                public final /* synthetic */ h9b0 c;
                public final /* synthetic */ g9b0 d;
                public final /* synthetic */ gzs e;
                public final /* synthetic */ q630 f;
                public final /* synthetic */ String g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    y9b0.f(z9b0.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void g(z9b0 z9b0Var, h9b0 h9b0Var, g9b0 g9b0Var, gzs gzsVar, q630 q630Var, String str, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(819461755);
        int i2 = i | (M.J(z9b0Var) ? 4 : 2) | (M.J(h9b0Var) ? 32 : 16) | (M.J(g9b0Var) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024) | 24576 | (M.J(str) ? 131072 : 65536);
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(819461755, i2, -1, "com.vk.music.playlist.framework.presentation.screen.PlaylistHeaderPortrait (PlaylistHeader.kt:193)");
            }
            float f = 20;
            uog0 d = vog0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 3);
            q630.a aVar2 = q630.a.a;
            q630 H = s200.H(txj0.f(ng90.a(rte0.d(aVar2, d), z9b0Var.b, null, wkj.a.a, 0.7f, null, 38), 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z9b0Var.a + c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, H);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            c(h9b0Var.c, h9b0Var.a, str, M, (i2 >> 9) & 896);
            d(false, new vvw(h9b0Var.b, gzsVar, h9b0Var.d), g9b0Var.a, g9b0Var.b, M, 54);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new w9b0(z9b0Var, h9b0Var, g9b0Var, gzsVar, q630Var2, str, i, 0);
        }
    }

    public static final void h(final int i, androidx.compose.runtime.a aVar, final String str, final gzs gzsVar, q630 q630Var, final boolean z, final boolean z2) {
        int i2;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        q630 H;
        int i3;
        androidx.compose.runtime.a M = aVar.M(1811692734);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar) ? 2048 : 1024;
        }
        int i4 = i2 | 24576;
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1811692734, i4, -1, "com.vk.music.playlist.framework.presentation.screen.PlaylistTitle (PlaylistHeader.kt:463)");
            }
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            q630.a aVar3 = q630.a.a;
            if (z) {
                H = aVar3;
            } else {
                float f = 24;
                H = s200.H(aVar3, f, 20, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
            }
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(cVar, bVar, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, H);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            boolean z3 = gzsVar != null;
            boolean z4 = (i4 & 7168) == 2048;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z4 || x == c0012a) {
                x = new yik(1, gzsVar);
                M.R(x);
            }
            q630 c3 = ojc.c(aVar3, z3, null, null, (gzs) x, 14);
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
            boolean z5 = (i4 & 896) == 256;
            Object x2 = M.x();
            if (z5 || x2 == c0012a) {
                x2 = new l74(str, 3);
                M.R(x2);
            }
            q630 b2 = com.vk.core.compose.component.semantics.b.b(c3, com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, 2));
            if (androidx.compose.runtime.b.d()) {
                i3 = 0;
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            } else {
                i3 = 0;
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i5 = i3;
            yqv0.c(str, b2, l5g.d, null, null, 0, 0, null, 2, false, 0, 1, null, wuv0Var.b, M, ((i4 >> 6) & 14) | 100663680, 48, 5880);
            aVar2 = M;
            if (z2) {
                aVar2.K(1432828549);
                hri.b(new gor0(bVar), aVar2, i5);
            } else {
                aVar2.K(1414751488);
            }
            aVar2.j();
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.n9b0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    y9b0.h(ne7.I(i | 1), (androidx.compose.runtime.a) obj, str, gzsVar, q630Var2, z, z2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void i(final wzj.b bVar, final boolean z, final String str, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1749509157);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(str) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1749509157, i2, -1, "com.vk.music.playlist.framework.presentation.screen.SimpleCoverImage (PlaylistHeader.kt:323)");
            }
            fwu0.c(null, null, skd.d(bVar.getImage(), b, M), null, null, null, null, kai.c(2056374634, new a0t() { // from class: xsna.l9b0
                @Override // xsna.a0t
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i3;
                    qa8 qa8Var = (qa8) obj;
                    chs chsVar = (chs) obj2;
                    lg90 lg90Var = (lg90) obj3;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if ((intValue & 6) == 0) {
                        i3 = (aVar2.J(qa8Var) ? 4 : 2) | intValue;
                    } else {
                        i3 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i3 |= aVar2.J(chsVar) ? 32 : 16;
                    }
                    if ((intValue & 384) == 0) {
                        i3 |= (intValue & 512) == 0 ? aVar2.J(lg90Var) : aVar2.y(lg90Var) ? 256 : 128;
                    }
                    if (aVar2.t(i3 & 1, (i3 & 1171) != 1170)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(2056374634, i3, -1, "com.vk.music.playlist.framework.presentation.screen.SimpleCoverImage.<anonymous> (PlaylistHeader.kt:327)");
                        }
                        y9b0.b(qa8Var, chsVar, lg90Var, z, str, aVar2, (i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | 512 | (i3 & 896));
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 100663296, 251);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.m9b0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    y9b0.i(wzj.b.this, z, str, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
