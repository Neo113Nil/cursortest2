package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Pair;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.tf.Tensorflow;
import xsna.c8d;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;
import xsna.tlo0;
import xsna.ty6;
import xsna.us2;
import xsna.wkj;

/* compiled from: ClipMetaView.kt */
/* loaded from: classes2.dex */
public final class b8d {
    public static final void a(c8d.a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar2.M(-1658307330);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1658307330, i2, -1, "com.vk.libvideo.design.compose.base.datacontent.presets.ChannelNameView (ClipMetaView.kt:92)");
            }
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, bVar, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            M.K(-1887505523);
            q630.a aVar5 = q630.a.a;
            ldu0.b(phw.a.a(fwu0.l("https://sun9-67.userapi.com/s/v1/ig2/bcTDi8CsBgqeT6nxTPRVQVwYh7TfWAoDYhaWx8IJIR1uSixIBwKEG61c68HXyOBMs_-gnFA_zTRz0bRdj8qe7Vcb.jpg?quality=95&crop=0,0,1280,1280&as=32x32,48x48,72x72,108x108,160x160,240x240,360x360,480x480,540x540,640x640,720x720,1080x1080,1280x1280&ava=1&u=o2zz14OYgEKwsgo6T4jjUw70LnRkzM3wE9VVg8N8naQ&cs=100x100", null, null, null, M, 0, 62), null, wkj.a.a, null, null, M, 197000, 26), 16, s200.H(aVar5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), null, null, false, null, null, null, M, Tensorflow.FRAME_WIDTH, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
            M.j();
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            aVar3 = M;
            yqv0.c(tlo0.b.a(aVar.a, (Context) M.r(AndroidCompositionLocals_androidKt.b)).toString(), new xpy(1.0f, false), wlb0.h(M).getText().d, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).s0, aVar3, 100663296, 48, 5880);
            aVar3.K(-1886827677);
            qzu0.a.getClass();
            pzu0.b(qzu0.C1(aVar3), null, s200.H(aVar5, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14).g(new gor0(bVar)), wlb0.h(aVar3).getIcon().c, aVar3, 56, 0);
            if (gp.d(aVar3)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new a8d(aVar, q630Var, i, 0);
        }
    }

    public static final void b(c8d c8dVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        c8d.c cVar = c8dVar.c;
        c8d.a aVar2 = c8dVar.b;
        androidx.compose.runtime.a M = aVar.M(327415122);
        int i2 = (M.J(c8dVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(327415122, i2, -1, "com.vk.libvideo.design.compose.base.datacontent.presets.ClipMetaView (ClipMetaView.kt:43)");
            }
            q630 x = txj0.x(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 380, 1, q630Var);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, x);
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
            M.K(-1843293760);
            d(aVar2, null, M, 0);
            M.j();
            c(c8dVar.a, s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, 1, q630.a.a), M, 48);
            M.K(-1843120129);
            d(cVar, null, M, 0);
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jn7(c8dVar, q630Var, i, 2);
        }
    }

    public static final void c(tlo0.h hVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-379453429);
        int i2 = (M.J(hVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-379453429, i2, -1, "com.vk.libvideo.design.compose.base.datacontent.presets.ClipNameView (ClipMetaView.kt:64)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            String obj = tlo0.b.a(hVar, (Context) M.r(AndroidCompositionLocals_androidKt.b)).toString();
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
            yqv0.c(obj, null, j, null, null, 0, 0, null, 0, false, 0, 2, null, wuv0Var.h0, aVar2, 0, 48, 6138);
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
            s.d = new ta8(hVar, q630Var, i, 1);
        }
    }

    public static final void d(c8d.b bVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1094003082);
        int i2 = (M.J(bVar) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1094003082, i2, -1, "com.vk.libvideo.design.compose.base.datacontent.presets.SubtitleSubheadView (ClipMetaView.kt:80)");
            }
            boolean z = bVar instanceof c8d.a;
            q630.a aVar2 = q630.a.a;
            if (z) {
                M.K(-930019478);
                a((c8d.a) bVar, aVar2, M, 48);
                M.j();
            } else {
                if (!(bVar instanceof c8d.c)) {
                    throw alb0.c(-930021222, M);
                }
                M.K(-930016981);
                e((c8d.c) bVar, aVar2, M, 48);
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
            s.d = new x7d(bVar, q630Var, i, 0);
        }
    }

    public static final void e(final c8d.c cVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        tlo0.h hVar = cVar.a;
        androidx.compose.runtime.a M = aVar.M(2132217876);
        if ((i & 6) == 0) {
            i2 = (M.J(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2132217876, i2, -1, "com.vk.libvideo.design.compose.base.datacontent.presets.ViewsAndDateView (ClipMetaView.kt:133)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
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
            final Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            boolean J = M.J(hVar);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                us2.b bVar = new us2.b();
                s0x.a(bVar, "View16", "�");
                bVar.g(" ");
                bVar.f(tlo0.b.a(hVar, context));
                x = bVar.n();
                M.R(x);
            }
            final us2 us2Var = (us2) x;
            jzj0.a(o19.a(q630.a.a, 0.72f), 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(474168577, new yzs() { // from class: xsna.y7d
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    lzj0 lzj0Var = (lzj0) obj;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= (intValue & 8) == 0 ? aVar3.J(lzj0Var) : aVar3.y(lzj0Var) ? 4 : 2;
                    }
                    if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(474168577, intValue, -1, "com.vk.libvideo.design.compose.base.datacontent.presets.ViewsAndDateView.<anonymous>.<anonymous> (ClipMetaView.kt:148)");
                        }
                        yqv0.d(us2.this, null, wlb0.h(aVar3).getText().d, 0, null, 0, false, 0, null, on00.f(new Pair("View16", new r0x(new esa0(l2l0.l(16), l2l0.l(16), 7), fz5.b))), wlb0.l(aVar3).s0, aVar3, 0, 0, 4090);
                        aVar3.K(-190436203);
                        yqv0.c(" · ", lzj0Var.a(), wlb0.h(aVar3).getText().d, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar3).s0, aVar3, 6, 0, 8184);
                        yqv0.c(tlo0.b.a(cVar.b, context).toString(), null, wlb0.h(aVar3).getText().d, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar3).s0, aVar3, 0, 0, 8186);
                        aVar3.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 3078, 6);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new z7d(cVar, q630Var, i, 0);
        }
    }
}
