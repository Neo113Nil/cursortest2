package xsna;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.reactions.impl.assets.ReactionAssetDrawable;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ReactionItemComposable.kt */
/* loaded from: classes2.dex */
public final class b1f0 {
    public static final void a(final yaw yawVar, final boolean z, final float f, final float f2, final com.vk.im.reactions.impl.assets.a aVar, final boolean z2, final boolean z3, final gzs gzsVar, androidx.compose.runtime.a aVar2, final int i) {
        androidx.compose.runtime.a aVar3;
        int i2;
        int i3;
        Object b;
        int i4 = yawVar.a;
        androidx.compose.runtime.a M = aVar2.M(613131977);
        int i5 = i | (M.J(yawVar) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.n(f) ? 256 : 128) | (M.n(f2) ? 2048 : 1024) | (M.J(aVar) ? 16384 : 8192) | (M.l(z2) ? 131072 : 65536) | (M.l(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.y(gzsVar) ? 8388608 : 4194304);
        if (M.t(i5 & 1, (4793491 & i5) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(613131977, i5, -1, "com.vk.im.design.view.ReactionItem (ReactionItemComposable.kt:44)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            azl azlVar = (azl) M.r(uvi.h);
            int i6 = i5 & 458752;
            boolean o = M.o(i4) | (i6 == 131072);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (o || x == obj) {
                x = new io.reactivex.rxjava3.disposables.b();
                M.R(x);
            }
            io.reactivex.rxjava3.disposables.b bVar = (io.reactivex.rxjava3.disposables.b) x;
            Integer valueOf = Integer.valueOf(i4);
            Boolean valueOf2 = Boolean.valueOf(z2);
            boolean y = M.y(bVar);
            Object x2 = M.x();
            if (y || x2 == obj) {
                x2 = new h440(bVar, 13);
                M.R(x2);
            }
            bap.b(valueOf, valueOf2, (izs) x2, M, (i5 >> 12) & 112);
            float f3 = f - (2 * f2);
            int r0 = azlVar.r0(f3);
            boolean o2 = M.o(i4) | (i6 == 131072) | M.o(r0);
            Object x3 = M.x();
            if (o2 || x3 == obj) {
                if (z2) {
                    b = aVar.a(view, i4, r0, bVar);
                    i2 = i5;
                    i3 = 0;
                } else {
                    i2 = i5;
                    i3 = 0;
                    b = com.vk.im.reactions.impl.assets.a.b(aVar, context, yawVar.a, r0, null, bVar, z3, 8);
                }
                x3 = b;
                M.R(x3);
            } else {
                i2 = i5;
                i3 = 0;
            }
            ReactionAssetDrawable reactionAssetDrawable = (ReactionAssetDrawable) x3;
            boolean J = M.J(reactionAssetDrawable);
            Object x4 = M.x();
            if (J || x4 == obj) {
                x4 = new zjo(reactionAssetDrawable);
                M.R(x4);
            }
            zjo zjoVar = (zjo) x4;
            long a = s7g.a(yawVar.d, M);
            Object O = d370.O(R.string.im_msg_reaction_send_description, new Object[]{d370.N(yawVar.c, i3, M)}, M);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.f;
            q630.a aVar4 = q630.a.a;
            q630 m = hr80.m(rte0.d(txj0.q(aVar4, f), vog0.a), z ? l5g.c(14, a, 0.2f) : l5g.j, androidx.compose.ui.graphics.e.a);
            Object x5 = M.x();
            if (x5 == obj) {
                x5 = ir.h(M);
            }
            q630 b2 = ojc.b(m, (sg50) x5, qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 0L, false), false, null, gzsVar, 28);
            boolean J2 = M.J(O) | ((i2 & 112) == 32);
            Object x6 = M.x();
            if (J2 || x6 == obj) {
                x6 = new x4g(O, z, 2);
                M.R(x6);
            }
            q630 b3 = egi0.b(b2, false, (izs) x6);
            cp10 d = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b3);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            aVar3 = M;
            r0v0.a(zjoVar, txj0.q(aVar4, f3), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, aVar3, 12582912, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
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
            s.d = new wzs(z, f, f2, aVar, z2, z3, gzsVar, i) { // from class: xsna.z0f0
                public final /* synthetic */ boolean c;
                public final /* synthetic */ float d;
                public final /* synthetic */ float e;
                public final /* synthetic */ com.vk.im.reactions.impl.assets.a f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ gzs i;

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(1);
                    b1f0.a(yaw.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final float f, final float f2, final zjo zjoVar, final gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(1011903708);
        int i2 = i | (M.n(f) ? 4 : 2) | (M.n(f2) ? 32 : 16) | (M.J(zjoVar) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1011903708, i2, -1, "com.vk.im.design.view.ShowMoreItem (ReactionItemComposable.kt:96)");
            }
            String N = d370.N(R.string.im_msg_reaction_show_more_description, 0, M);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.f;
            q630.a aVar2 = q630.a.a;
            q630 q = txj0.q(aVar2, f);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            q630 b = ojc.b(q, (sg50) x, qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 0L, false), false, null, gzsVar, 28);
            boolean J = M.J(N);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = new z43(N, 3);
                M.R(x2);
            }
            q630 b2 = egi0.b(b, false, (izs) x2);
            cp10 d = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b2);
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
            r0v0.a(zjoVar, txj0.q(aVar2, f - (2 * f2)), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, M, ((i2 >> 6) & 14) | 12582912, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(f, f2, zjoVar, gzsVar, i) { // from class: xsna.a1f0
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;
                public final /* synthetic */ zjo d;
                public final /* synthetic */ gzs e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    b1f0.b(this.b, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
