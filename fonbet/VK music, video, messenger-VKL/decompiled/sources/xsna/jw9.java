package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.ecomm.cart.impl.cart.a;
import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;
import com.vk.ecomm.cart.impl.cart.ui.items.IslandPart;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CartContent.kt */
/* loaded from: classes18.dex */
public final class jw9 {

    /* compiled from: CartContent.kt */
    @b6l(c = "com.vk.ecomm.cart.impl.cart.ui.compose.CartContentKt$CartContent$5$1", f = "CartContent.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ egz $content;
        final /* synthetic */ gzs<s3q0> $onContent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(egz egzVar, gzs<s3q0> gzsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$content = egzVar;
            this.$onContent = gzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$content, this.$onContent, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (this.$content.d) {
                this.$onContent.invoke();
            }
            return s3q0.a;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class b implements izs<Integer, Object> {
        public final /* synthetic */ List b;

        public b(rf rfVar, List list) {
            this.b = list;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            return ((CartItem) this.b.get(num.intValue())).b();
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class c implements izs<Integer, Object> {
        public final /* synthetic */ List b;

        public c(gv3 gv3Var, List list) {
            this.b = list;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            return qjg.a((CartItem) this.b.get(num.intValue()));
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class d implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ List b;
        public final /* synthetic */ izs c;

        public d(List list, izs izsVar) {
            this.b = list;
            this.c = izsVar;
        }

        @Override // xsna.zzs
        public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            u890 u890Var;
            r5j0 d;
            ksy ksyVar2 = ksyVar;
            int intValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue2 = num2.intValue();
            if ((intValue2 & 6) == 0) {
                i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
            } else {
                i = intValue2;
            }
            if ((intValue2 & 48) == 0) {
                i |= aVar2.o(intValue) ? 32 : 16;
            }
            if (aVar2.t(i & 1, (i & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                CartItem cartItem = (CartItem) this.b.get(intValue);
                aVar2.K(1774752367);
                q630 f = txj0.f(q630.a.a, 1.0f);
                IslandPart a = cartItem.a();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getBackground().g;
                if (a != IslandPart.None) {
                    int[] iArr = zw9.$EnumSwitchMapping$0;
                    if (iArr[a.ordinal()] == 1) {
                        u890Var = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    } else {
                        float f2 = 0;
                        u890Var = new u890(f2, f2, f2, f2);
                    }
                    q630 C = s200.C(f, u890Var);
                    int i2 = iArr[a.ordinal()];
                    e.a aVar3 = androidx.compose.ui.graphics.e.a;
                    if (i2 == 1) {
                        float f3 = 20;
                        d = vog0.d(f3, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
                    } else if (i2 == 2 || i2 != 3) {
                        d = aVar3;
                    } else {
                        float f4 = 20;
                        d = vog0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, f4, 3);
                    }
                    f = f.g(hr80.m(rte0.d(C, d), j, aVar3));
                }
                ex9.a(this.c, cartItem, ksy.c(ksyVar2, f, 2), aVar2, 0);
                aVar2.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(2027969583);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2027969583, i2, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.CartBlockingProgress (CartContent.kt:134)");
            }
            q630Var2 = q630.a.a;
            q630 d2 = txj0.d(q630Var2, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d2, l5g.c(14, ylu0Var.getBackground().g, 0.6f), androidx.compose.ui.graphics.e.a);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new e20(4);
                M.R(x2);
            }
            q630 b2 = ojc.b(m, sg50Var, null, false, null, (gzs) x2, 28);
            dt1.a.getClass();
            cp10 d3 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, b2);
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
            k9q0.w(M, d3, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            zfr0.f(SpinnerState.Loading, null, null, 0L, null, null, M, 6, 62);
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
            s.d = new fw9(q630Var2, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(izs izsVar, gzs gzsVar, a.C0918a c0918a, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-98637202);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(c0918a) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-98637202, i3, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.CartContent (CartContent.kt:47)");
            }
            wh50 c2 = jk50.c(c0918a.a, M);
            wh50 c3 = jk50.c(c0918a.b, M);
            egz egzVar = (egz) c2.getValue();
            boolean booleanValue = ((Boolean) c3.getValue()).booleanValue();
            int i4 = (i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i3 << 3) & 57344);
            q630.a aVar2 = q630.a.a;
            c(izsVar, gzsVar, egzVar, booleanValue, aVar2, null, M, i4, 32);
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
            s.d = new gw9(i, 0, izsVar, gzsVar, c0918a, q630Var2);
        }
    }

    public static final void c(final izs<? super rv9, s3q0> izsVar, final gzs<s3q0> gzsVar, final egz egzVar, final boolean z, final q630 q630Var, xvy xvyVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        xvy xvyVar2;
        final xvy xvyVar3;
        a.C0011a.C0012a c0012a;
        int i4;
        int i5;
        boolean z2;
        int i6;
        androidx.compose.runtime.a M = aVar.M(109241579);
        if ((i & 6) == 0) {
            i3 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(egzVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.l(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                xvyVar2 = xvyVar;
                if (M.J(xvyVar2)) {
                    i6 = 131072;
                    i3 |= i6;
                }
            } else {
                xvyVar2 = xvyVar;
            }
            i6 = 65536;
            i3 |= i6;
        } else {
            xvyVar2 = xvyVar;
        }
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            M.V();
            int i7 = i & 1;
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (i7 == 0 || M.i()) {
                if ((i2 & 32) != 0) {
                    boolean z3 = egzVar.b;
                    boolean z4 = (i3 & 14) == 4;
                    Object x = M.x();
                    if (z4 || x == c0012a2) {
                        x = new th2(izsVar, 1);
                        M.R(x);
                    }
                    c0012a = c0012a2;
                    xvyVar2 = crx0.z(z3, (gzs) x, 0, M, 0, 60);
                    i3 &= -458753;
                } else {
                    c0012a = c0012a2;
                }
                xvy xvyVar4 = xvyVar2;
                i4 = i3;
                xvyVar3 = xvyVar4;
            } else {
                M.h();
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
                xvy xvyVar5 = xvyVar2;
                i4 = i3;
                xvyVar3 = xvyVar5;
                c0012a = c0012a2;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(109241579, i4, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.CartContent (CartContent.kt:73)");
            }
            int i8 = i4;
            boolean z5 = egzVar.c;
            boolean z6 = (i8 & 14) == 4;
            Object x2 = M.x();
            if (z6 || x2 == c0012a) {
                x2 = new ux(izsVar, 2);
                M.R(x2);
            }
            gzs gzsVar2 = (gzs) x2;
            q630 d2 = txj0.d(q630Var, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                i5 = i8;
                z2 = false;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                i5 = i8;
                z2 = false;
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            a.C0011a.C0012a c0012a3 = c0012a;
            boolean z7 = z2;
            int i9 = i5;
            dge0.a(z5, gzsVar2, hr80.m(d2, ylu0Var.getBackground().a, androidx.compose.ui.graphics.e.a), null, null, kai.c(-935692483, new yzs() { // from class: xsna.hw9
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-935692483, intValue, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.CartContent.<anonymous> (CartContent.kt:83)");
                        }
                        q630 d3 = txj0.d(ahn.E(q630.a.a, "cart_content_list"), 1.0f);
                        egz egzVar2 = egzVar;
                        boolean J = aVar2.J(egzVar2);
                        izs izsVar2 = izsVar;
                        boolean J2 = J | aVar2.J(izsVar2);
                        Object x3 = aVar2.x();
                        if (J2 || x3 == a.C0011a.a) {
                            x3 = new com.vk.im.engine.commands.messages.a(4, egzVar2, izsVar2);
                            aVar2.R(x3);
                        }
                        lqy.a(d3, xvy.this, null, null, null, null, false, null, (izs) x3, aVar2, 6, IronSourceError.ERROR_CODE_INIT_FAILED);
                        mm2.f(z, null, anp.e(null, 3), anp.f(null, 3), "BlockingProgressVisibility", zbi.b, aVar2, 224640, 2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 196608, 24);
            M = M;
            s3q0 s3q0Var = s3q0.a;
            boolean z8 = ((i9 & 896) == 256 ? true : z7) | ((i9 & 112) != 32 ? z7 : true);
            Object x3 = M.x();
            if (z8 || x3 == c0012a3) {
                x3 = new a(egzVar, gzsVar, null);
                M.R(x3);
            }
            bap.g(s3q0Var, (wzs) x3, M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            xvyVar3 = xvyVar2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.iw9
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jw9.c(izs.this, gzsVar, egzVar, z, q630Var, xvyVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }
}
