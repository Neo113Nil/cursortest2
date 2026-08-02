package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.net.http.SslError;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vk.dzenarticle.impl.ui.entity.AdPosition;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.reefton.protocol.ReefProtocol$Event;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.cri;
import xsna.cro;
import xsna.dt1;
import xsna.q630;
import xsna.tso;
import xsna.wkj;
import xsna.wso;
import xsna.y390;

/* compiled from: DzenArticleViewContent.kt */
/* loaded from: classes18.dex */
public final class tso {
    public static final /* synthetic */ qcy<Object>[] a;
    public static final sgi0<Integer> b;

    /* compiled from: DzenArticleViewContent.kt */
    @b6l(c = "com.vk.dzenarticle.impl.ui.view.DzenArticleViewContentKt$ArticleAdItem$1$1", f = "DzenArticleViewContent.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wh50<Boolean> $visible$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wh50<Boolean> wh50Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$visible$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$visible$delegate, spjVar);
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
            wh50<Boolean> wh50Var = this.$visible$delegate;
            qcy<Object>[] qcyVarArr = tso.a;
            wh50Var.setValue(Boolean.TRUE);
            return s3q0.a;
        }
    }

    /* compiled from: DzenArticleViewContent.kt */
    public static final class c extends WebChromeClient {
        public View a;
        public final /* synthetic */ wxs b;

        public c(wxs wxsVar) {
            this.b = wxsVar;
        }

        @Override // android.webkit.WebChromeClient
        public final void onHideCustomView() {
            View view = this.a;
            if (view == null) {
                return;
            }
            this.b.a(view);
            this.a = null;
        }

        @Override // android.webkit.WebChromeClient
        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            this.a = view;
            this.b.b(view, new dgm(customViewCallback, 3));
        }
    }

    /* compiled from: DzenArticleViewContent.kt */
    @b6l(c = "com.vk.dzenarticle.impl.ui.view.DzenArticleViewContentKt$DzenArticleViewContent$1$1", f = "DzenArticleViewContent.kt", l = {ReefProtocol$Event.Type.IMAGES_IMAGE_LOADED_VALUE}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<cro, s3q0> $onAction;
        final /* synthetic */ jgh0 $scrollState;
        int label;

        /* compiled from: DzenArticleViewContent.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ jgh0 b;
            public final /* synthetic */ izs<cro, s3q0> c;

            /* JADX WARN: Multi-variable type inference failed */
            public a(jgh0 jgh0Var, izs<? super cro, s3q0> izsVar) {
                this.b = jgh0Var;
                this.c = izsVar;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                int intValue = ((Number) obj).intValue();
                float f = this.b.f();
                if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.c.invoke(new cro.k((int) ((intValue / f) * 100)));
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(jgh0 jgh0Var, izs<? super cro, s3q0> izsVar, spj<? super d> spjVar) {
            super(2, spjVar);
            this.$scrollState = jgh0Var;
            this.$onAction = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new d(this.$scrollState, this.$onAction, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                ksr e = kci.e(nr2.M(new cfl(this.$scrollState, 5)), 100L);
                a aVar = new a(this.$scrollState, this.$onAction);
                this.label = 1;
                if (e.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: DzenArticleViewContent.kt */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdPosition.values().length];
            try {
                iArr[AdPosition.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdPosition.MIDDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(tso.class, "listItemPosition", "getListItemPosition(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1);
        fpf0.a.getClass();
        a = new qcy[]{mutablePropertyReference1Impl};
        b = new sgi0<>("ListItemPosition");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final mm3 mm3Var, final int i, final izs<? super cro, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(700049726);
        if ((i2 & 6) == 0) {
            i3 = (M.J(mm3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(700049726, i3, -1, "com.vk.dzenarticle.impl.ui.view.ArticleAdItem (DzenArticleViewContent.kt:347)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            s3q0 s3q0Var = s3q0.a;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new a(wh50Var, null);
                M.R(x2);
            }
            bap.g(s3q0Var, (wzs) x2, M, 6);
            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
            rpp e2 = anp.e(jq2.d(350, 0, null, 6), 2);
            dtp0 d2 = jq2.d(350, 0, luo.a, 2);
            dt1.a.getClass();
            mm2.f(booleanValue, null, e2.b(anp.d(d2, dt1.a.k, null, 12)), null, null, kai.c(-508205546, new yzs() { // from class: xsna.gso
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-508205546, intValue, -1, "com.vk.dzenarticle.impl.ui.view.ArticleAdItem.<anonymous> (DzenArticleViewContent.kt:361)");
                    }
                    mm3 mm3Var2 = mm3.this;
                    int i4 = tso.e.$EnumSwitchMapping$0[mm3Var2.l.ordinal()];
                    int i5 = i;
                    izs izsVar2 = izsVar;
                    if (i4 == 1) {
                        aVar2.K(1240744157);
                        tso.k(mm3Var2, i5, izsVar2, aVar2, 0);
                        aVar2.j();
                    } else {
                        if (i4 != 2) {
                            throw alb0.c(1240742538, aVar2);
                        }
                        aVar2.K(1240746496);
                        tso.f(mm3Var2, i5, izsVar2, aVar2, 0);
                        aVar2.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), M, 196608, 26);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.hso
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i2 | 1);
                    tso.a(mm3.this, i, izsVar, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final xn3 xn3Var, final int i, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(861856553);
        if ((i2 & 6) == 0) {
            i3 = (M.J(xn3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(861856553, i3, -1, "com.vk.dzenarticle.impl.ui.view.ArticleEmbedItem (DzenArticleViewContent.kt:209)");
            }
            q630 F = s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630.a.a, 1.0f));
            boolean z = (i3 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new w34(i, 1);
                M.R(x);
            }
            q630 b2 = egi0.b(F, false, (izs) x);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, b2);
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
            us2 us2Var = (us2) xn3Var.b.invoke(M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.X;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.d(us2Var, null, ylu0Var.getText().m, 0, null, 0, false, 0, null, null, frv0Var, aVar2, 0, 0, 8186);
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
            s.d = new wzs() { // from class: xsna.jso
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i2 | 1);
                    tso.b(xn3.this, i, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final po3 po3Var, final int i, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        int i4;
        int i5;
        androidx.compose.runtime.a M = aVar.M(-2019797143);
        if ((i2 & 6) == 0) {
            i3 = (M.J(po3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2019797143, i3, -1, "com.vk.dzenarticle.impl.ui.view.ArticleImageItem (DzenArticleViewContent.kt:234)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            boolean z = (i3 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new eh4(i, 2);
                M.R(x);
            }
            q630 b2 = egi0.b(f, false, (izs) x);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, b2);
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
            r0v0.a(xus.s(po3Var.b, 0L, M, 0, 2), txj0.f(aVar2, 1.0f), null, wkj.a.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, M, 12586040, 116);
            if (po3Var.c != null) {
                M.K(-561840954);
                f9t.e(txj0.h(aVar2, 6), M, 6);
                q630 F = s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2);
                String str = po3Var.c;
                if (androidx.compose.runtime.b.d()) {
                    i4 = -1;
                    i5 = 0;
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                } else {
                    i4 = -1;
                    i5 = 0;
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.s0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i5, i4, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                yqv0.c(str, F, ylu0Var.getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, 48, 0, 8184);
                M = M;
            } else {
                M.K(-570568477);
            }
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
            s.d = new wzs() { // from class: xsna.mso
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i2 | 1);
                    tso.c(po3.this, i, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(final qo3 qo3Var, final int i, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a aVar2;
        frv0 frv0Var;
        androidx.compose.runtime.a M = aVar.M(-1608168209);
        if ((i2 & 6) == 0) {
            i3 = (M.J(qo3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1608168209, i3, -1, "com.vk.dzenarticle.impl.ui.view.ArticleInnerTitleItem (DzenArticleViewContent.kt:172)");
            }
            q630 F = s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630.a.a, 1.0f));
            boolean z = (i3 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new kso(i, 0);
                M.R(x);
            }
            q630 b2 = egi0.b(F, false, (izs) x);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, b2);
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
            int i4 = qo3Var.c;
            if (i4 == 1) {
                M.K(1227118090);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var.b;
                M.j();
            } else if (i4 != 3) {
                M.K(1227121898);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var2.g;
                M.j();
            } else {
                M.K(1227119946);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var3 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var3.l;
                M.j();
            }
            frv0 frv0Var2 = frv0Var;
            String str = qo3Var.b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(str, null, ylu0Var.getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var2, aVar2, 0, 0, 8186);
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
            s.d = new wzs() { // from class: xsna.lso
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i2 | 1);
                    tso.d(qo3.this, i, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final yp3 yp3Var, int i, wxs wxsVar, izs<? super cro, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        izs<? super cro, s3q0> izsVar2;
        final wxs wxsVar2;
        final int i4;
        androidx.compose.runtime.a M = aVar.M(801263159);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? M.J(yp3Var) : M.y(yp3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? M.J(wxsVar) : M.y(wxsVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(801263159, i3, -1, "com.vk.dzenarticle.impl.ui.view.ArticleItemView (DzenArticleViewContent.kt:119)");
            }
            if (yp3Var instanceof wp3) {
                M.K(1214757108);
                j((wp3) yp3Var, i, M, i3 & 112);
                M.j();
            } else if (yp3Var instanceof up3) {
                M.K(1214759287);
                h((up3) yp3Var, i, M, i3 & 112);
                M.j();
            } else if (yp3Var instanceof qo3) {
                M.K(1214761625);
                d((qo3) yp3Var, i, M, i3 & 112);
                M.j();
            } else if (yp3Var instanceof vp3) {
                M.K(1214763827);
                i((vp3) yp3Var, i, M, i3 & 112);
                M.j();
            } else if (yp3Var instanceof xn3) {
                M.K(1214765876);
                b((xn3) yp3Var, i, M, i3 & 112);
                M.j();
            } else if (yp3Var instanceof tp3) {
                M.K(1214767956);
                g((tp3) yp3Var, i, M, i3 & 112);
                M.j();
            } else if (yp3Var instanceof po3) {
                M.K(1214770036);
                c((po3) yp3Var, i, M, i3 & 112);
                M.j();
            } else {
                if (yp3Var instanceof eq3) {
                    M.K(1214772212);
                    izsVar2 = izsVar;
                    l((eq3) yp3Var, i, wxsVar, izsVar2, M, i3 & 8176);
                    i4 = i;
                    wxsVar2 = wxsVar;
                    M.j();
                } else {
                    izsVar2 = izsVar;
                    wxsVar2 = wxsVar;
                    i4 = i;
                    if (yp3Var instanceof mm3) {
                        M.K(1214775195);
                        a((mm3) yp3Var, i4, izsVar2, M, ((i3 >> 3) & 896) | (i3 & 112));
                    } else {
                        M.K(-1002054357);
                    }
                    M.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            izsVar2 = izsVar;
            wxsVar2 = wxsVar;
            i4 = i;
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            izsVar2 = izsVar;
            wxsVar2 = wxsVar;
            i4 = i;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final izs<? super cro, s3q0> izsVar3 = izsVar2;
            s.d = new wzs() { // from class: xsna.oso
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    tso.e(yp3.this, i4, wxsVar2, izsVar3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void f(mm3 mm3Var, int i, izs<? super cro, s3q0> izsVar, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a M = aVar.M(456477747);
        int i3 = (M.J(mm3Var) ? 4 : 2) | i2 | (M.o(i) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(456477747, i3, -1, "com.vk.dzenarticle.impl.ui.view.ArticleMiddleAdItem (DzenArticleViewContent.kt:398)");
            }
            q630 H = s200.H(txj0.f(q630.a.a, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10, 5);
            boolean z = (i3 & 112) == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new rnm(i, 1);
                M.R(x);
            }
            q630 b2 = egi0.b(H, false, (izs) x);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new pe1(23);
                M.R(x2);
            }
            izs izsVar2 = (izs) x2;
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 896) == 256);
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new g6(11, mm3Var, izsVar);
                M.R(x3);
            }
            ae2.a(6, 2, M, izsVar2, (izs) x3, null);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sac(mm3Var, i, izsVar, i2);
        }
    }

    public static final void g(final tp3 tp3Var, final int i, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-172830007);
        if ((i2 & 6) == 0) {
            i3 = (M.J(tp3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-172830007, i3, -1, "com.vk.dzenarticle.impl.ui.view.ArticleSpaceItem (DzenArticleViewContent.kt:225)");
            }
            q630 h = txj0.h(q630.a.a, tp3Var.b ? 16 : 8);
            boolean z = (i3 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new qso(i, 0);
                M.R(x);
            }
            f9t.e(egi0.b(h, false, (izs) x), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.rso
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i2 | 1);
                    tso.g(tp3.this, i, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void h(final up3 up3Var, final int i, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a aVar2;
        tlo0 tlo0Var = up3Var.b;
        androidx.compose.runtime.a M = aVar.M(360431003);
        if ((i2 & 6) == 0) {
            i3 = (M.J(up3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(360431003, i3, -1, "com.vk.dzenarticle.impl.ui.view.ArticleSubtitleItem (DzenArticleViewContent.kt:150)");
            }
            String str = up3Var.a;
            if (tlo0Var != null) {
                M.K(181921407);
                str = str + " · " + ((Object) tlo0Var.b(((Context) M.r(AndroidCompositionLocals_androidKt.b)).getResources()));
                M.j();
            } else {
                M.K(182028202);
                M.j();
            }
            float f = 16;
            q630 G = s200.G(txj0.f(q630.a.a, 1.0f), f, 4, f, 12);
            boolean z = (i3 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new u34(i, 1);
                M.R(x);
            }
            q630 b2 = egi0.b(G, false, (izs) x);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, b2);
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
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.s0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(str, null, ylu0Var.getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 0, 0, 8186);
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
            s.d = new wzs() { // from class: xsna.iso
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i2 | 1);
                    tso.h(up3.this, i, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void i(final vp3 vp3Var, final int i, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1780729531);
        if ((i2 & 6) == 0) {
            i3 = (M.J(vp3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1780729531, i3, -1, "com.vk.dzenarticle.impl.ui.view.ArticleTextItem (DzenArticleViewContent.kt:193)");
            }
            q630 F = s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630.a.a, 1.0f));
            boolean z = (i3 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new sso(i, 0);
                M.R(x);
            }
            q630 b2 = egi0.b(F, false, (izs) x);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, b2);
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
            us2 us2Var = (us2) vp3Var.b.invoke(M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.X;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.d(us2Var, null, ylu0Var.getText().m, 0, null, 0, false, 0, null, null, frv0Var, aVar2, 0, 0, 8186);
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
            s.d = new wzs() { // from class: xsna.fso
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i2 | 1);
                    tso.i(vp3.this, i, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void j(final wp3 wp3Var, final int i, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1695694583);
        if ((i2 & 6) == 0) {
            i3 = (M.J(wp3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1695694583, i3, -1, "com.vk.dzenarticle.impl.ui.view.ArticleTitleItem (DzenArticleViewContent.kt:134)");
            }
            float f = 16;
            q630 H = s200.H(txj0.f(q630.a.a, 1.0f), f, 8, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
            boolean z = (i3 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new u8a(i, 2);
                M.R(x);
            }
            q630 b2 = egi0.b(H, false, (izs) x);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, b2);
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
            String str = wp3Var.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.g;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(str, null, ylu0Var.getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 0, 0, 8186);
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
            s.d = new wzs() { // from class: xsna.nso
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i2 | 1);
                    tso.j(wp3.this, i, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void k(mm3 mm3Var, int i, izs<? super cro, s3q0> izsVar, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a M = aVar.M(1342904227);
        int i3 = (M.J(mm3Var) ? 4 : 2) | i2 | (M.o(i) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1342904227, i3, -1, "com.vk.dzenarticle.impl.ui.view.ArticleTopAdItem (DzenArticleViewContent.kt:369)");
            }
            q630.a aVar2 = q630.a.a;
            float f = 12;
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.h(txj0.f(aVar2, 1.0f), 88));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 D = s200.D(hr80.m(F, ylu0Var.getBackground().a, vog0.b(f)), 4);
            boolean z = (i3 & 112) == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new z2b(i, 2);
                M.R(x);
            }
            q630 b2 = egi0.b(D, false, (izs) x);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, b2);
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
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            q630 d3 = txj0.d(aVar2, 1.0f);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new dh5(23);
                M.R(x2);
            }
            izs izsVar2 = (izs) x2;
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 896) == 256);
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new wd3(11, mm3Var, izsVar);
                M.R(x3);
            }
            ae2.a(54, 0, M, izsVar2, (izs) x3, d3);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nv1(mm3Var, i, izsVar, i2);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled", "ConfigurationScreenWidthHeight"})
    public static final void l(eq3 eq3Var, final int i, wxs wxsVar, izs<? super cro, s3q0> izsVar, androidx.compose.runtime.a aVar, int i2) {
        int i3;
        Float f = eq3Var.c;
        androidx.compose.runtime.a M = aVar.M(1963238686);
        if ((i2 & 6) == 0) {
            i3 = (M.J(eq3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? M.J(wxsVar) : M.y(wxsVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1963238686, i3, -1, "com.vk.dzenarticle.impl.ui.view.ArticleWebviewItem (DzenArticleViewContent.kt:267)");
            }
            float f2 = ((Configuration) M.r(AndroidCompositionLocals_androidKt.a)).screenWidthDp;
            boolean J = M.J(f) | M.n(f2);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new pco(f2 / (f != null ? f.floatValue() : 1.0f));
                M.R(x);
            }
            q630 h = txj0.h(txj0.f(q630.a.a, 1.0f), ((pco) x).b);
            boolean z = (i3 & 112) == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new izs() { // from class: xsna.pso
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        tso.n((tgi0) obj, i);
                        return s3q0.a;
                    }
                };
                M.R(x2);
            }
            q630 b2 = egi0.b(h, false, (izs) x2);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            boolean z2 = ((i3 & 7168) == 2048) | ((i3 & 896) == 256 || ((i3 & 512) != 0 && M.y(wxsVar)));
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new d05(18, izsVar, wxsVar);
                M.R(x3);
            }
            izs izsVar2 = (izs) x3;
            boolean z3 = (i3 & 14) == 4;
            Object x4 = M.x();
            if (z3 || x4 == c0012a) {
                x4 = new cqf(eq3Var, 16);
                M.R(x4);
            }
            ae2.a(0, 2, M, izsVar2, (izs) x4, null);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new om7(eq3Var, i, wxsVar, izsVar, i2);
        }
    }

    public static final void m(wso.a aVar, wxs wxsVar, izs<? super cro, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        izs<? super cro, s3q0> izsVar2 = izsVar;
        wzs<androidx.compose.runtime.a, Integer, us2> wzsVar = aVar.e;
        ArrayList arrayList = aVar.d;
        androidx.compose.runtime.a M = aVar2.M(-577865308);
        wxs wxsVar2 = wxsVar;
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.J(wxsVar2) ? 32 : 16) | (M.y(izsVar2) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-577865308, i2, -1, "com.vk.dzenarticle.impl.ui.view.DzenArticleViewContent (DzenArticleViewContent.kt:74)");
            }
            jgh0 x = p490.x(M);
            s3q0 s3q0Var = s3q0.a;
            int i3 = i2 & 896;
            boolean J = M.J(x) | (i3 == 256);
            Object x2 = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x2 == c0012a) {
                x2 = new d(x, izsVar2, null);
                M.R(x2);
            }
            bap.g(s3q0Var, (wzs) x2, M, 6);
            q630.a aVar3 = q630.a.a;
            q630 E = ahn.E(p490.D(txj0.d(aVar3, 1.0f), x, 14), "dzen_screen_list");
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, E);
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
            M.K(-107271654);
            int i4 = 0;
            for (Object obj : arrayList) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    e43.t();
                    throw null;
                }
                yp3 yp3Var = (yp3) obj;
                M.W(635527645, Integer.valueOf(yp3Var.getId()));
                q630.a aVar5 = aVar3;
                e(yp3Var, i4, wxsVar2, izsVar, M, (i2 << 3) & 8064);
                int i6 = i4;
                if (arrayList.isEmpty() || i6 != arrayList.size() - 1) {
                    M.K(-1777591633);
                    M.j();
                } else {
                    M.K(-1773315586);
                    ck70.b(aVar5, 16, M, 6);
                }
                M.a0();
                wxsVar2 = wxsVar;
                i4 = i5;
                aVar3 = aVar5;
            }
            izsVar2 = izsVar;
            M.j();
            M.G();
            if (wzsVar != null) {
                M.K(-955245897);
                us2 invoke = wzsVar.invoke(M, 0);
                boolean z = i3 == 256;
                Object x3 = M.x();
                if (z || x3 == c0012a) {
                    x3 = new o2h(izsVar2, 2);
                    M.R(x3);
                }
                lro.a(invoke, (gzs) x3, M, 0);
            } else {
                M.K(-959674402);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new q17(i, 1, aVar, wxsVar, izsVar2);
        }
    }

    public static final void n(tgi0 tgi0Var, int i) {
        qcy<Object> qcyVar = a[0];
        Integer valueOf = Integer.valueOf(i);
        sgi0<Integer> sgi0Var = b;
        sgi0Var.getClass();
        tgi0Var.a(sgi0Var, valueOf);
    }

    /* compiled from: DzenArticleViewContent.kt */
    public static final class b extends WebViewClient {
        public final /* synthetic */ izs<cro, s3q0> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(izs<? super cro, s3q0> izsVar) {
            this.a = izsVar;
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            String url;
            String str = null;
            if (sslError != null && (url = sslError.getUrl()) != null && !drm0.N(url)) {
                str = url;
            }
            if (str != null) {
                dsw<UserId, v390> dswVar = y390.a;
                if (y390.a.a().d(str)) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.d, new Object[]{"DzenArticle: skip SSL for ".concat(str)});
                    }
                    if (sslErrorHandler != null) {
                        sslErrorHandler.proceed();
                        return;
                    }
                    return;
                }
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            String uri = (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.toString();
            if (uri == null) {
                return true;
            }
            this.a.invoke(new cro.g(uri));
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str == null) {
                return true;
            }
            this.a.invoke(new cro.g(str));
            return true;
        }
    }
}
