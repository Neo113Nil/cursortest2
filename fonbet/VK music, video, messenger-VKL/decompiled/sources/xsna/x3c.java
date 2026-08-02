package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.X2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.ecomm.cart.impl.checkout.ui.items.IslandPart;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.cri;
import xsna.dt1;
import xsna.o9c;
import xsna.q630;

/* compiled from: CheckoutContent.kt */
/* loaded from: classes18.dex */
public final class x3c {

    /* compiled from: CheckoutContent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IslandPart.values().length];
            try {
                iArr[IslandPart.Top.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IslandPart.Middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IslandPart.Bottom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IslandPart.Single.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-86660471);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-86660471, i, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.CheckoutBlockingProgress (CheckoutContent.kt:237)");
            }
            q630 d = txj0.d(q630Var, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, l5g.c(14, ylu0Var.getBackground().g, 0.6f), androidx.compose.ui.graphics.e.a);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new d1(8);
                M.R(x2);
            }
            q630 b = ojc.b(m, sg50Var, null, false, null, (gzs) x2, 28);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            zfr0.f(SpinnerState.Loading, null, null, 0L, null, null, M, 6, 62);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new p3c(q630Var, i, 0);
        }
    }

    public static final void b(x7i x7iVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(632399119);
        int i2 = i | (M.J(x7iVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(632399119, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.CheckoutCompleteAction (CheckoutContent.kt:215)");
            }
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 E = s200.E(hr80.m(q630Var, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), kqu0.b, kqu0.v);
            String str = x7iVar.b;
            boolean z = !x7iVar.c;
            boolean z2 = (i2 & 112) == 32;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new me1(izsVar, 1);
                M.R(x);
            }
            aVar2 = M;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, null, null, null, str, null, null, null, null, z, null, null, null, aVar2, X2.b.f, 0, 0, 4059104);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ez7(x7iVar, izsVar, q630Var, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final o9c.a aVar, final izs izsVar, final gzs gzsVar, final Object obj, final q630 q630Var, androidx.compose.runtime.a aVar2, final int i) {
        androidx.compose.runtime.a M = aVar2.M(1229616402);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.J(obj) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1229616402, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.CheckoutContent (CheckoutContent.kt:78)");
            }
            wh50 c = jk50.c(aVar.a, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new l5c((v8s) c.getValue());
                M.R(x);
            }
            l5c l5cVar = (l5c) x;
            q630 d = txj0.d(q630Var, 1.0f);
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
            v8s v8sVar = (v8s) c.getValue();
            q630.a aVar4 = q630.a.a;
            q630 f = txj0.f(aVar4, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            d(l5cVar, v8sVar, izsVar, obj, hr80.m(f, ylu0Var.getBackground().a, androidx.compose.ui.graphics.e.a), M, ((i2 << 3) & 896) | 6 | (i2 & 7168));
            mm2.f(((v8s) c.getValue()).d, txj0.d(aVar4, 1.0f), null, null, null, mci.a, M, 196656, 28);
            M = M;
            M.G();
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            s3q0 s3q0Var = s3q0.a;
            boolean J = M.J(c) | ((i2 & 896) == 256) | M.y(context) | M.y(view);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                s3c s3cVar = new s3c(gzsVar, c, l5cVar, context, view, null);
                M.R(s3cVar);
                x2 = s3cVar;
            }
            bap.g(s3q0Var, (wzs) x2, M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(izsVar, gzsVar, obj, q630Var, i) { // from class: xsna.m3c
                public final /* synthetic */ izs c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ Object e;
                public final /* synthetic */ q630 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(24577);
                    x3c.c(o9c.a.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(final l5c l5cVar, final v8s v8sVar, final izs izsVar, final Object obj, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        final l5c l5cVar2;
        int i2;
        final q630 q630Var2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(465325842);
        if ((i & 6) == 0) {
            l5cVar2 = l5cVar;
            i2 = (M.J(l5cVar2) ? 4 : 2) | i;
        } else {
            l5cVar2 = l5cVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(v8sVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(obj) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            q630Var2 = q630Var;
            i2 |= M.J(q630Var2) ? 16384 : 8192;
        } else {
            q630Var2 = q630Var;
        }
        int i4 = i2;
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(465325842, i4, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.CheckoutFormContent (CheckoutContent.kt:129)");
            }
            final xvy a2 = zvy.a(0, 3, M);
            boolean z = v8sVar.c;
            boolean z2 = (i4 & 896) == 256;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new ee1(izsVar, 1);
                M.R(x);
            }
            xvy xvyVar = a2;
            dge0.a(z, (gzs) x, null, null, null, kai.c(-1979272988, new yzs() { // from class: xsna.n3c
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.yzs
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1979272988, intValue, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.CheckoutFormContent.<anonymous> (CheckoutContent.kt:138)");
                        }
                        a.m mVar = androidx.compose.foundation.layout.a.c;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar2, 0);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D = aVar2.D();
                        q630 c = qri.c(aVar2, q630Var2);
                        cri.h7.getClass();
                        LayoutNode.a aVar3 = cri.a.b;
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar3);
                        } else {
                            aVar2.f();
                        }
                        k9q0.w(aVar2, a3, cri.a.f);
                        k9q0.w(aVar2, D, cri.a.e);
                        k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar2, cri.a.h);
                        k9q0.w(aVar2, c, cri.a.d);
                        q630 a4 = q9g.a(ahn.E(q630.a.a, "checkout_content_list"), 1.0f);
                        Object obj5 = v8sVar;
                        boolean J = aVar2.J(obj5);
                        Object obj6 = l5cVar2;
                        boolean J2 = J | aVar2.J(obj6);
                        izs izsVar2 = izsVar;
                        boolean J3 = J2 | aVar2.J(izsVar2);
                        Object x2 = aVar2.x();
                        if (J3 || x2 == a.C0011a.a) {
                            x2 = new fd5(obj5, obj6, izsVar2, 1);
                            aVar2.R(x2);
                        }
                        lqy.a(a4, a2, null, null, null, null, false, null, (izs) x2, aVar2, 0, IronSourceError.ERROR_CODE_INIT_FAILED);
                        mm2.b(r9g.a, !((Boolean) x3c.f(aVar2).getValue()).booleanValue(), null, null, null, null, kai.c(-1996715854, new q3c(0, obj5, izsVar2), aVar2), aVar2, 1572870, 30);
                        aVar2.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 196608, 28);
            f5z f5zVar = (f5z) M.r(bvz.a);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = bap.j(EmptyCoroutineContext.b, M);
                M.R(x2);
            }
            yvj yvjVar = (yvj) x2;
            qow qowVar = new qow(obj);
            int i5 = i4 & 112;
            boolean y = M.y(f5zVar) | ((i4 & 7168) == 2048) | (i5 == 32) | M.y(yvjVar) | M.J(xvyVar) | ((i4 & 14) == 4);
            Object x3 = M.x();
            if (y || x3 == c0012a) {
                i3 = i4;
                t3c t3cVar = new t3c(obj, f5zVar, v8sVar, yvjVar, xvyVar, l5cVar, null);
                xvyVar = xvyVar;
                M.R(t3cVar);
                x3 = t3cVar;
            } else {
                i3 = i4;
            }
            bap.e(qowVar, v8sVar, xvyVar, (wzs) x3, M, ((i3 >> 9) & 14) | i5);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.o3c
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    x3c.d(l5c.this, v8sVar, izsVar, obj, q630Var, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final boolean e(xvy xvyVar, int i) {
        List<xuy> f = xvyVar.j().f();
        if (!f.isEmpty()) {
            xuy xuyVar = (xuy) j5g.i0(f);
            boolean z = xuyVar.getSize() + xuyVar.getOffset() > xvyVar.j().g() + xvyVar.j().h();
            xuy xuyVar2 = (xuy) j5g.Y(f);
            boolean z2 = xuyVar2.getIndex() != xuyVar.getIndex() && xuyVar2.getOffset() < xvyVar.j().g();
            int size = f.size();
            for (int i2 = 0; i2 < size; i2++) {
                xuy xuyVar3 = f.get(i2);
                if (!(z2 && xuyVar3.getIndex() == xuyVar2.getIndex()) && (!(z && xuyVar3.getIndex() == xuyVar.getIndex()) && xuyVar3.getIndex() == i)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, xsna.wh50] */
    public static final wh50 f(androidx.compose.runtime.a aVar) {
        aVar.K(1099762740);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1099762740, 0, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.isKeyboardOpenedAsState (CheckoutContent.kt:367)");
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = androidx.compose.runtime.k.b(Boolean.FALSE);
            aVar.R(x);
        }
        ref$ObjectRef.element = (wh50) x;
        Activity b = enj.b((View) aVar.r(AndroidCompositionLocals_androidKt.f));
        if (b == null) {
            wh50 wh50Var = (wh50) ref$ObjectRef.element;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            return wh50Var;
        }
        bap.c(b, new g22(6, b, ref$ObjectRef), aVar, 0);
        wh50 wh50Var2 = (wh50) ref$ObjectRef.element;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return wh50Var2;
    }

    public static final q630 g(q630 q630Var, IslandPart islandPart, long j) {
        r5j0 d;
        IslandPart islandPart2 = IslandPart.Bottom;
        q630 H = s200.H(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (islandPart == islandPart2 || islandPart == IslandPart.Single) ? kqu0.t : 0, 7);
        int i = a.$EnumSwitchMapping$0[islandPart.ordinal()];
        e.a aVar = androidx.compose.ui.graphics.e.a;
        if (i == 1) {
            float f = 20;
            d = vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
        } else if (i == 2) {
            d = aVar;
        } else if (i == 3) {
            float f2 = 20;
            d = vog0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f2, 3);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            d = vog0.b(20);
        }
        return s200.H(hr80.m(rte0.d(H, d), j, aVar), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, islandPart == islandPart2 ? kqu0.s : 0, 7);
    }
}
