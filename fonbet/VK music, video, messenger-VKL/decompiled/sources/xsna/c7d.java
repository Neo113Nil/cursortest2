package xsna;

import android.graphics.drawable.GradientDrawable;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.state.ToggleableState;
import com.unity3d.services.UnityAdsConstants;
import com.vk.video.ui.upload.impl.attachedclips.presentation.compose.clip.ClipSubtitleViewState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.chs;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: Clip.kt */
/* loaded from: classes7.dex */
public final class c7d {

    /* compiled from: Clip.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipSubtitleViewState.values().length];
            try {
                iArr[ClipSubtitleViewState.HAS_COAUTHORS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipSubtitleViewState.ATTACHED_TO_ANOTHER_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0185, code lost:
    
        if (r12 == r11) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final kfd kfdVar, izs izsVar, final jdj0 jdj0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        a.C0011a.C0012a c0012a;
        long j;
        ClipSubtitleViewState clipSubtitleViewState = kfdVar.f;
        androidx.compose.runtime.a M = aVar.M(-25918078);
        int i2 = i | (M.J(kfdVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(jdj0Var) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-25918078, i2, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.clip.Clip (Clip.kt:43)");
            }
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d = ja8.d(ty6Var, false);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z || x == c0012a2) {
                x = new ww(6, izsVar, kfdVar);
                M.R(x);
            }
            q630.a aVar4 = q630.a.a;
            fwu0.c(txj0.d(ojc.c(aVar4, false, null, null, (gzs) x, 15), 1.0f), null, kfdVar.b, null, null, null, null, kai.c(142721561, new a0t() { // from class: xsna.a7d
                @Override // xsna.a0t
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i5;
                    chs chsVar = (chs) obj2;
                    lg90 lg90Var = (lg90) obj3;
                    androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if ((intValue & 48) == 0) {
                        i5 = (aVar5.J(chsVar) ? 32 : 16) | intValue;
                    } else {
                        i5 = intValue;
                    }
                    if ((intValue & 384) == 0) {
                        i5 |= (intValue & 512) == 0 ? aVar5.J(lg90Var) : aVar5.y(lg90Var) ? 256 : 128;
                    }
                    if (aVar5.t(i5 & 1, (i5 & 1169) != 1168)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(142721561, i5, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.clip.Clip.<anonymous>.<anonymous> (Clip.kt:53)");
                        }
                        if ((chsVar instanceof chs.e) || (chsVar instanceof chs.d)) {
                            aVar5.K(-199458826);
                            vjw.a(lg90Var, kfd.this.c, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar5, 8 | ((i5 >> 6) & 14), Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                            aVar5.j();
                        } else {
                            if (!(chsVar instanceof chs.c) && !(chsVar instanceof chs.b) && !(chsVar instanceof chs.a)) {
                                throw alb0.c(-283531758, aVar5);
                            }
                            aVar5.K(-199147679);
                            c7d.b(jdj0Var, null, aVar5, 8, 2);
                            aVar5.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar5.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 100663296, 250);
            if (clipSubtitleViewState != null) {
                M.K(799300293);
                c(clipSubtitleViewState, M, 6);
            } else {
                M.K(796461530);
            }
            M.j();
            q630 b = ra8.a.b(aVar4, dt1.a.d);
            ToggleableState d2 = jgz.d(kfdVar.d);
            plg0 plg0Var = new plg0(1);
            boolean z2 = (i4 == 4) | (i3 == 32);
            Object x2 = M.x();
            if (z2) {
                c0012a = c0012a2;
            } else {
                c0012a = c0012a2;
            }
            x2 = new xg2(1, izsVar, kfdVar);
            M.R(x2);
            a.C0011a.C0012a c0012a3 = c0012a;
            q630 D2 = s200.D(d1p0.b(b, d2, false, plg0Var, (gzs) x2, 10), 8);
            cp10 d3 = ja8.d(ty6Var, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, D2);
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
            k9q0.w(M, d3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            boolean z3 = (i3 == 32) | (i4 == 4);
            Object x3 = M.x();
            if (z3 || x3 == c0012a3) {
                x3 = new com.vk.movika.sdk.base.ui.r(2, izsVar, kfdVar);
                M.R(x3);
            }
            gzs gzsVar = (gzs) x3;
            q630 E = ahn.E(aVar4, "ClipTags.CHECKBOX");
            boolean z4 = kfdVar.d;
            gn20 g = i35.g();
            long j2 = wlb0.h(M).getIcon().c;
            if (kfdVar.e) {
                j = vcl0.a(M, -843129084, M).c;
                M.j();
            } else {
                j = vcl0.a(M, -843043772, M).n;
                M.j();
            }
            uju0.a(gzsVar, E, z4, false, null, g.a(j2, j, M, 28), M, 48, 24);
            aVar2 = M;
            if (kr.f(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new b7d(kfdVar, izsVar, jdj0Var, q630Var, i);
        }
    }

    public static final void b(jdj0 jdj0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i, int i2) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(805717586);
        int i3 = (M.y(jdj0Var) ? 4 : 2) | i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            q630 q630Var3 = i4 != 0 ? q630.a.a : q630Var;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(805717586, i3, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.clip.ClipSkeleton (Clip.kt:125)");
            }
            int i5 = ((i3 >> 3) & 14) | 448 | ((i3 << 3) & 112);
            q630 q630Var4 = q630Var3;
            ckv0.a(q630Var4, jdj0Var, rci.a, M, i5, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var4;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rm7(i, i2, 1, jdj0Var, q630Var2);
        }
    }

    public static final void c(ClipSubtitleViewState clipSubtitleViewState, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        int i2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(1705865166);
        int i4 = (M.o(clipSubtitleViewState.ordinal()) ? 32 : 16) | i;
        if (M.t(i4 & 1, (i4 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1705865166, i4, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.clip.ClipSubtitle (Clip.kt:141)");
            }
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.i;
            ra8 ra8Var = ra8.a;
            q630.a aVar3 = q630.a.a;
            q630 d = sua.d(0.84375f, ra8Var.b(aVar3, ty6Var), false);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            ja8.a(hr80.l(d, dxu0.b(), null, 6), M, 0);
            int i5 = a.$EnumSwitchMapping$0[clipSubtitleViewState.ordinal()];
            if (i5 == 1) {
                i2 = 1376516602;
                i3 = R.string.attached_clips_clip_has_coauthors;
            } else {
                if (i5 != 2) {
                    throw alb0.c(-1341071345, M);
                }
                i2 = 1376670455;
                i3 = R.string.attached_clips_clip_already_attached;
            }
            String a2 = zq.a(M, i2, i3, M, 0);
            float f = 4;
            q630 E = ahn.E(s200.H(ra8Var.b(aVar3, ty6Var), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 8, 2), "ClipTags.SUBTITLE");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(a2, E, j, null, null, 0, 3, null, 0, false, 0, 0, null, wuv0Var.i0, aVar2, 0, 0, 8120);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new qw6(clipSubtitleViewState, i, 2);
        }
    }
}
