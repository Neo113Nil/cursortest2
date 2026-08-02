package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.upload.ui.impl.compose.state.viewstate.TrendingHashtagUiDto;
import com.vk.core.compose.generated.VkColorToken;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ClipsDescriptionView.kt */
/* loaded from: classes17.dex */
public final class tqd {
    public static final void a(final String str, final us2 us2Var, final wow wowVar, q630 q630Var, final gzs gzsVar, final gzs gzsVar2, final gzs gzsVar3, final izs izsVar, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        jai jaiVar2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1470373952);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(us2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(wowVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(true) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            i3 |= M.y(gzsVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= M.y(gzsVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= M.y(gzsVar3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= M.y(izsVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            jaiVar2 = jaiVar;
            i3 |= M.y(jaiVar2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        } else {
            jaiVar2 = jaiVar;
        }
        if (M.t(i3 & 1, (306783379 & i3) != 306783378)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1470373952, i3, -1, "com.vk.clips.upload.ui.impl.compose.views.description.CoverAndDescription (ClipsDescriptionView.kt:132)");
            }
            float f = 12;
            float f2 = 8;
            q630.a aVar2 = q630.a.a;
            q630 f3 = txj0.f(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 5), 1.0f);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f3);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            float f4 = 150;
            int i4 = i3 >> 9;
            c(str, gzsVar, gzsVar2, rte0.d(txj0.h(txj0.v(aVar2, 88), f4), vog0.b(f2)), M, (i3 & 14) | ((i3 >> 6) & 112) | (i4 & 896) | (i4 & 7168));
            f9t.e(txj0.v(aVar2, f), M, 6);
            ArrayList arrayList = new ArrayList(c5g.u(new wow(wowVar), 10));
            Iterator<T> it = wowVar.iterator();
            while (it.hasNext()) {
                arrayList.add(((TrendingHashtagUiDto) it.next()).b);
            }
            String N = d370.N(R.string.clips_description_hint, 0, M);
            boolean z = ((234881024 & i3) == 67108864) | ((i3 & 896) == 256);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new hn0(5, wowVar, izsVar);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            int i5 = i3;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            dvd.a(us2Var, arrayList, N, gzsVar3, izsVar2, ahn.E(txj0.h(txj0.f(new xpy(1.0f, false), 1.0f), f4), "ClipEditDescriptionClickListener"), jaiVar2, M, ((i5 >> 3) & 14) | ((i5 >> 12) & 7168) | (3670016 & i4), 0);
            M = M;
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
            s.d = new wzs() { // from class: xsna.pqd
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    tqd.a(str, us2Var, wowVar, q630Var2, gzsVar, gzsVar2, gzsVar3, izsVar, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, gzs gzsVar, gzs gzsVar2, q630 q630Var) {
        int i2;
        Object obj;
        int i3;
        int i4;
        float f;
        androidx.compose.runtime.a M = aVar.M(1782827320);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar2) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1782827320, i2, -1, "com.vk.clips.upload.ui.impl.compose.views.description.CoverClickHandler (ClipsDescriptionView.kt:217)");
            }
            a.b bVar = androidx.compose.foundation.layout.a.d;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(bVar, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630.a aVar3 = q630.a.a;
            Object obj2 = a.C0011a.a;
            if (gzsVar2 == null) {
                M.K(1297129935);
                M.j();
                obj = obj2;
                i4 = 0;
                i3 = 3;
            } else {
                M.K(1297129936);
                String N = d370.N(R.string.clip_preview_view_accessibility, 0, M);
                q630 a2 = q9g.a(txj0.f(aVar3, 1.0f), 1.0f);
                Object x = M.x();
                if (x == obj2) {
                    x = ir.h(M);
                }
                obj = obj2;
                i3 = 3;
                q630 E = ahn.E(ojc.b(a2, (sg50) x, null, false, null, gzsVar2, 28), "ClipPreviewClickListener");
                boolean J = M.J(N);
                Object x2 = M.x();
                if (J || x2 == obj) {
                    x2 = new rqd(N, 0);
                    M.R(x2);
                }
                i4 = 0;
                ja8.a(com.vk.core.compose.component.semantics.b.b(E, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3)), M, 0);
                M.j();
            }
            String N2 = d370.N(R.string.clip_choose_cover_accessibility, i4, M);
            q630 f2 = txj0.f(aVar3, 1.0f);
            if (gzsVar2 == null) {
                f2 = f2.g(txj0.c(aVar3, 1.0f));
            }
            if (gzsVar2 != null) {
                f2 = f2.g(txj0.h(aVar3, 40));
            }
            if (gzsVar2 == null) {
                f = 1.0f;
                f2 = f2.g(txj0.c(aVar3, 1.0f));
            } else {
                f = 1.0f;
            }
            if (f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            if (f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            }
            q630 g = f2.g(new xpy(f, true));
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = ir.h(M);
            }
            int i5 = i3;
            int i6 = i4;
            Object obj3 = obj;
            q630 E2 = ahn.E(ojc.b(g, (sg50) x3, null, false, null, gzsVar, 28), "ClipCoverEditorClickListener");
            boolean J2 = M.J(N2);
            Object x4 = M.x();
            if (J2 || x4 == obj3) {
                x4 = new sqd(N2, 0);
                M.R(x4);
            }
            ja8.a(com.vk.core.compose.component.semantics.b.b(E2, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, i5)), M, i6);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new o37(i, 1, gzsVar, q630Var, gzsVar2);
        }
    }

    public static final void c(String str, gzs gzsVar, gzs gzsVar2, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        ra8 ra8Var;
        int i3;
        int i4;
        q630.a aVar2;
        int i5;
        androidx.compose.runtime.a M = aVar.M(-602983156);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        int i6 = i2;
        if (M.t(i6 & 1, (i6 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-602983156, i6, -1, "com.vk.clips.upload.ui.impl.compose.views.description.CoverImage (ClipsDescriptionView.kt:176)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630.a aVar4 = q630.a.a;
            j4d0.b(str, txj0.d(aVar4, 1.0f), M, (i6 & 14) | 48);
            ra8 ra8Var2 = ra8.a;
            if (gzsVar != null) {
                M.K(-1071376865);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-741638904, 6, -1, "com.vk.clips.upload.ui.impl.compose.views.theme.ClipsUploadTheme.<get-icons> (ClipsUploadTheme.kt:34)");
                }
                egf egfVar = (egf) M.r(okf.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                lg90 c2 = egfVar.c(M);
                long j = l5g.d;
                float f = 4;
                q630 D2 = s200.D(txj0.q(ra8Var2.b(hr80.m(s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 9), l5g.c(14, l5g.b, 0.4f), vog0.b(8)), dt1.a.d), 32), 6);
                ra8Var = ra8Var2;
                i3 = i6;
                aVar2 = aVar4;
                i4 = 0;
                i5 = -1;
                pzu0.b(c2, null, D2, j, M, 3128, 0);
            } else {
                ra8Var = ra8Var2;
                i3 = i6;
                i4 = 0;
                aVar2 = aVar4;
                i5 = -1;
                M.K(-1079124292);
            }
            M.j();
            String N = d370.N(R.string.clips_cover_title, i4, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, i4, i5, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(N, s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 1, ra8Var.b(aVar2, dt1.a.i)), l5g.d, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.v0, M, 384, 0, 8184);
            M = M;
            b(((i3 >> 9) & 14) | 48, M, gzsVar2, gzsVar, txj0.d(aVar2, 1.0f));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qqd(str, gzsVar, gzsVar2, q630Var, i, 0);
        }
    }

    public static final void d(final ief iefVar, final gzs gzsVar, final gzs gzsVar2, final gzs gzsVar3, final izs izsVar, final jai jaiVar, final gzs gzsVar4, q630 q630Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        final q630 q630Var2;
        int i3;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1756805580);
        int i4 = (M.J(iefVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= M.y(gzsVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= M.y(gzsVar3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= M.y(izsVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= M.y(jaiVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= M.y(gzsVar4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i5 = i2 & 128;
        if (i5 != 0) {
            i3 = i4 | 12582912;
            q630Var2 = q630Var;
        } else {
            q630Var2 = q630Var;
            i3 = i4 | (M.J(q630Var2) ? 8388608 : 4194304);
        }
        if (M.t(i3 & 1, (i3 & 4793491) != 4793490)) {
            q630.a aVar3 = q630.a.a;
            if (i5 != 0) {
                q630Var2 = aVar3;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1756805580, i3, -1, "com.vk.clips.upload.ui.impl.compose.views.description.UploadDescriptionView (ClipsDescriptionView.kt:73)");
            }
            int i6 = i3;
            q630 F = s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630Var2, 1.0f));
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            a(iefVar.a, iefVar.b, new wow(iefVar.c), null, gzsVar, gzsVar2, gzsVar3, izsVar, jaiVar, M, (i6 << 12) & 2147418112);
            aVar2 = M;
            if (iefVar.f) {
                aVar2.K(1854967051);
                aVar2.K(336933410);
                s8u0 s8u0Var = new s8u0(0);
                s8u0Var.e(d370.N(R.string.clips_trending_hashtags_landing_title, 0, aVar2) + ' ');
                aVar2.K(336937887);
                zqv0 zqv0Var = new zqv0(new klv0(null, VkColorToken.TextLinkThemed), 14);
                boolean z = (i6 & 3670016) == 1048576;
                Object x = aVar2.x();
                if (z || x == a.C0011a.a) {
                    x = new i9z() { // from class: xsna.nqd
                        @Override // xsna.i9z
                        public final void a(q8z q8zVar) {
                            gzs.this.invoke();
                        }
                    };
                    aVar2.R(x);
                }
                int g = s8u0Var.g(new h2v0("trending_hashtags_landing_link", zqv0Var, (i9z) x));
                try {
                    s8u0Var.e(d370.N(R.string.clips_trending_hashtags_landing_link, 0, aVar2));
                    s3q0 s3q0Var = s3q0.a;
                    s8u0Var.f(g);
                    aVar2.j();
                    aVar2.j();
                    us2 j = s8u0Var.j(8, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.i0;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.d(j, ahn.E(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 1, aVar3), "ClipTrendsLink"), ylu0Var.getText().p, 0, null, 0, false, 0, null, null, frv0Var, aVar2, 48, 0, 8184);
                    aVar2 = aVar2;
                } catch (Throwable th) {
                    s8u0Var.f(g);
                    throw th;
                }
            } else {
                aVar2.K(1850612140);
            }
            aVar2.j();
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
            s.d = new wzs() { // from class: xsna.oqd
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    tqd.d(ief.this, gzsVar, gzsVar2, gzsVar3, izsVar, jaiVar, gzsVar4, q630Var2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }
}
