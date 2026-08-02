package xsna;

import androidx.compose.runtime.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.q630;

/* compiled from: DonutTeaserContentView.kt */
/* loaded from: classes4.dex */
public final class m3o extends i6v0<y3o, i3o> {

    /* compiled from: DonutTeaserContentView.kt */
    @b6l(c = "com.vk.newsfeed.posting.donut_teaser.presentation.DonutTeaserContentView$ThemedContent$3$1", f = "DonutTeaserContentView.kt", l = {125}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ rwr $teaserTextFieldFocusRequester;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rwr rwrVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$teaserTextFieldFocusRequester = rwrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$teaserTextFieldFocusRequester, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                this.label = 1;
                if (qsl.b(500L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            rwr.b(this.$teaserTextFieldFocusRequester);
            return s3q0.a;
        }
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((y3o) ao50Var, izsVar, aVar, 512);
    }

    public final void h(y3o y3oVar, izs<? super i3o, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> k3oVar;
        wh50 c;
        androidx.compose.runtime.a M = aVar.M(-1250586407);
        int i2 = i | (M.J(y3oVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1250586407, i2, -1, "com.vk.newsfeed.posting.donut_teaser.presentation.DonutTeaserContentView.ThemedContent (DonutTeaserContentView.kt:55)");
            }
            fm50 fm50Var = (fm50) d(ok50.a, new n0u0[]{y3oVar.a}, M, (i2 & 896) | 512).getValue();
            s3o s3oVar = fm50Var instanceof s3o ? (s3o) fm50Var : null;
            yzt0<x3o> yzt0Var = s3oVar != null ? s3oVar.a : null;
            if (yzt0Var == null) {
                M.K(-1673059297);
                M.j();
                c = null;
            } else {
                M.K(777314338);
                c = jk50.c(yzt0Var, M);
                M.j();
            }
            if (c == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    k3oVar = new k71(i, 5, this, y3oVar, izsVar);
                    s.d = k3oVar;
                }
                return;
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new rwr();
                M.R(x);
            }
            rwr rwrVar = (rwr) x;
            q630 B = txj0.B(q630.a.a, null, 3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            phv0.b(B, kai.c(-1684319182, new a73(this, izsVar, c), M), null, null, null, 0, ylu0Var.getBackground().g, 0L, kai.c(913460221, new j3o(this, rwrVar, izsVar, c, 0), M), M, 805306422, 380);
            s3q0 s3q0Var = s3q0.a;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new a(rwrVar, null);
                M.R(x2);
            }
            bap.g(s3q0Var, (wzs) x2, M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            k3oVar = new k3o(i, 0, this, y3oVar, izsVar);
            s.d = k3oVar;
        }
    }
}
