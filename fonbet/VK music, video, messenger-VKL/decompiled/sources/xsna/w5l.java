package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import com.vk.debug.ui.dev.DebugFileManagerFragment;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: DebugFileManagerScreen.kt */
/* loaded from: classes17.dex */
public final class w5l {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final String str2, final DebugFileManagerFragment.b bVar, final j20 j20Var, final e5l e5lVar, q630 q630Var, final izs izsVar, final izs izsVar2, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        wh50 wh50Var;
        wh50 wh50Var2;
        androidx.compose.runtime.a M = aVar.M(-843566333);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.y(bVar) ? 256 : 128) | (M.y(j20Var) ? 2048 : 1024) | (M.y(e5lVar) ? 16384 : 8192) | 196608 | (M.y(izsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.y(izsVar2) ? 8388608 : 4194304);
        if (M.t(i2 & 1, (4793491 & i2) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-843566333, i2, -1, "com.vk.debug.design.DebugFileManagerScreen (DebugFileManagerScreen.kt:94)");
            }
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = androidx.compose.runtime.k.b(str);
                M.R(x);
            }
            final wh50 wh50Var3 = (wh50) x;
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = androidx.compose.runtime.k.b(EmptyList.b);
                M.R(x2);
            }
            wh50 wh50Var4 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x3);
            }
            wh50 wh50Var5 = (wh50) x3;
            Object x4 = M.x();
            if (x4 == obj) {
                x4 = androidx.compose.runtime.k.b(EmptyList.b);
                M.R(x4);
            }
            final wh50 wh50Var6 = (wh50) x4;
            final boolean f = epx.f((String) wh50Var3.getValue(), str2);
            Boolean valueOf = Boolean.valueOf(f);
            boolean l = ((i2 & 29360128) == 8388608) | M.l(f);
            Object x5 = M.x();
            if (l || x5 == obj) {
                x5 = new p5l(null, izsVar2, f);
                M.R(x5);
            }
            bap.g(valueOf, (wzs) x5, M, 0);
            boolean l2 = M.l(f);
            Object x6 = M.x();
            if (l2 || x6 == obj) {
                x6 = new l5l(f, wh50Var3, wh50Var6);
                M.R(x6);
            }
            wh50 c = androidx.compose.runtime.k.c((gzs) x6, M, 0);
            s3q0 s3q0Var = s3q0.a;
            boolean J = ((3670016 & i2) == 1048576) | M.J(c);
            Object x7 = M.x();
            if (J || x7 == obj) {
                x7 = new q5l(null, izsVar, c);
                M.R(x7);
            }
            bap.g(s3q0Var, (wzs) x7, M, 6);
            String str3 = (String) wh50Var3.getValue();
            boolean z = (57344 & i2) == 16384;
            Object x8 = M.x();
            if (z || x8 == obj) {
                r5l r5lVar = new r5l(e5lVar, wh50Var5, wh50Var3, wh50Var4, null);
                wh50Var = wh50Var5;
                wh50Var2 = wh50Var4;
                M.R(r5lVar);
                x8 = r5lVar;
            } else {
                wh50Var = wh50Var5;
                wh50Var2 = wh50Var4;
            }
            bap.g(str3, (wzs) x8, M, 0);
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            muv0.h(TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.debug_file_manager_title, 0, M), null, null, null, null, M, 196608, 30), null, null, null, M, 14), null, null, null, e.a.a(bVar, null, null, null, null, M, ((i2 >> 6) & 14) | 196608, 30), null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8174);
            yqv0.c((String) wh50Var3.getValue(), s200.E(txj0.f(aVar2, 1.0f), 16, 8), 0L, null, null, 0, 0, null, 2, false, 0, 1, null, null, M, 100663344, 48, 14076);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 f2 = txj0.f(new xpy(1.0f, true), 1.0f);
            boolean l3 = M.l(f) | ((i2 & 7168) == 2048);
            Object x9 = M.x();
            if (l3 || x9 == obj) {
                final wh50 wh50Var7 = wh50Var2;
                final wh50 wh50Var8 = wh50Var;
                izs izsVar3 = new izs() { // from class: xsna.m5l
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        nvy nvyVar = (nvy) obj2;
                        boolean z2 = f;
                        wh50 wh50Var9 = wh50Var3;
                        wh50 wh50Var10 = wh50Var6;
                        if (!z2) {
                            nvy.g(nvyVar, "__parent__", null, new jai(1659341097, new o5l(0, wh50Var9, wh50Var10), true), 2);
                        }
                        boolean booleanValue = ((Boolean) wh50Var8.getValue()).booleanValue();
                        wh50 wh50Var11 = wh50Var7;
                        if (booleanValue && ((List) wh50Var11.getValue()).isEmpty()) {
                            nvy.g(nvyVar, "__loading__", null, uei.a, 2);
                        }
                        List list = (List) wh50Var11.getValue();
                        nvyVar.e(list.size(), new t5l(new i60(4), list), new u5l(list, 0), new jai(2039820996, new v5l(list, j20Var, wh50Var10, wh50Var9), true));
                        return s3q0.a;
                    }
                };
                M.R(izsVar3);
                x9 = izsVar3;
            }
            lqy.a(f2, null, null, null, null, null, false, null, (izs) x9, M, 0, 510);
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
            s.d = new wzs(str, str2, bVar, j20Var, e5lVar, q630Var2, izsVar, izsVar2, i) { // from class: xsna.n5l
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ DebugFileManagerFragment.b d;
                public final /* synthetic */ j20 e;
                public final /* synthetic */ e5l f;
                public final /* synthetic */ q630 g;
                public final /* synthetic */ izs h;
                public final /* synthetic */ izs i;

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(1);
                    w5l.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(s8r s8rVar, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        lg90 b;
        String b2;
        gzs<s3q0> gzsVar2 = gzsVar;
        androidx.compose.runtime.a M = aVar.M(520857555);
        int i2 = i | (M.J(s8rVar) ? 4 : 2) | (M.y(gzsVar2) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(520857555, i2, -1, "com.vk.debug.design.FileRow (DebugFileManagerScreen.kt:223)");
            }
            float f = 12;
            q630 E = s200.E(ojc.c(txj0.f(q630.a.a, 1.0f), false, null, null, gzsVar, 15), 16, f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(f), dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            boolean z = s8rVar.b;
            if (z) {
                M.K(1129856006);
                qzu0.a.getClass();
                b = qzu0.T(M);
            } else {
                M.K(1129856936);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(855673880, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-DocumentOutline24> (VkIcons.kt:1980)");
                }
                b = or.b(M, 749832906, R.drawable.vk_icon_document_outline_24, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            M.j();
            pzu0.b(b, null, null, 0L, M, 56, 12);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, xpyVar);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            yqv0.c(s8rVar.a, null, 0L, null, null, 0, 0, null, 2, false, 0, 1, null, null, M, 100663296, 48, 14078);
            aVar2 = M;
            if (z) {
                aVar2.K(396150005);
            } else {
                aVar2.K(404249344);
                long j = s8rVar.c;
                if (j < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                    b2 = j + " B";
                } else {
                    b2 = j < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED ? efz.b(j / 1024, " KB", new StringBuilder()) : j < 1073741824 ? String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(j / ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES)}, 1)).concat(" MB") : String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(j / 1073741824)}, 1)).concat(" GB");
                }
                yqv0.c(b2, null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar2, 0, 0, 16382);
                aVar2 = aVar2;
            }
            aVar2.j();
            aVar2.G();
            if (z || !s8rVar.e) {
                gzsVar2 = gzsVar;
                aVar2.K(658073643);
            } else {
                aVar2.K(666356998);
                qzu0.a.getClass();
                androidx.compose.runtime.a aVar4 = aVar2;
                gzsVar2 = gzsVar;
                nzu0.c(gzsVar2, qzu0.l1(aVar2), d370.N(R.string.debug_file_manager_share_file, 0, aVar2), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, false, null, false, null, null, aVar4, ((i2 >> 3) & 14) | 64, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                aVar2 = aVar4;
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
            s.d = new yf4(s8rVar, gzsVar2, i, 2);
        }
    }

    public static final void c(gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-2079722530);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2079722530, i, -1, "com.vk.debug.design.ParentDirectoryRow (DebugFileManagerScreen.kt:200)");
            }
            float f = 12;
            q630 E = s200.E(ojc.c(txj0.f(q630.a.a, 1.0f), false, null, null, gzsVar, 15), 16, f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(f), dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            qzu0.a.getClass();
            pzu0.b(qzu0.T(M), null, null, 0L, M, 56, 12);
            aVar2 = M;
            yqv0.c("..", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar2, 6, 0, 16382);
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
            s.d = new com.vk.movika.tools.controls.seekbar.s(gzsVar, i, 6);
        }
    }
}
