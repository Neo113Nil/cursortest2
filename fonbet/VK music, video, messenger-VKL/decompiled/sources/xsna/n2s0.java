package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.q630;

/* compiled from: VideoAttachesRow.kt */
/* loaded from: classes18.dex */
public final class n2s0 {

    /* compiled from: VideoAttachesRow.kt */
    @b6l(c = "com.vk.ecomm.design.compose.productattaches.VideoAttachesRowKt$TrackItemsView$2$1$1", f = "VideoAttachesRow.kt", l = {TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ mtk0<List<Integer>> $fullyVisibleItems;
        final /* synthetic */ izs<List<Integer>, s3q0> $onShowItems;
        int label;

        /* compiled from: VideoAttachesRow.kt */
        /* renamed from: xsna.n2s0$a$a, reason: collision with other inner class name */
        public static final class C3384a<T> implements lsr {
            public final /* synthetic */ izs<List<Integer>, s3q0> b;

            /* JADX WARN: Multi-variable type inference failed */
            public C3384a(izs<? super List<Integer>, s3q0> izsVar) {
                this.b = izsVar;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                this.b.invoke((List) obj);
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(spj spjVar, izs izsVar, mtk0 mtk0Var) {
            super(2, spjVar);
            this.$fullyVisibleItems = mtk0Var;
            this.$onShowItems = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(spjVar, this.$onShowItems, this.$fullyVisibleItems);
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
                izg0 M = nr2.M(new gkc0(this.$fullyVisibleItems, 19));
                C3384a c3384a = new C3384a(this.$onShowItems);
                this.label = 1;
                if (M.collect(c3384a, this) == coroutineSingletons) {
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

    public static final void a(xvy xvyVar, izs<? super List<Integer>, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1753948231);
        int i2 = (M.J(xvyVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1753948231, i2, -1, "com.vk.ecomm.design.compose.productattaches.TrackItemsView (VideoAttachesRow.kt:67)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = bbk0.b(new l6n0(xvyVar, 10));
                M.R(x);
            }
            mtk0 mtk0Var = (mtk0) x;
            boolean J = M.J(mtk0Var) | ((i2 & 112) == 32);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = new a(null, izsVar, mtk0Var);
                M.R(x2);
            }
            bap.g(mtk0Var, (wzs) x2, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yku(xvyVar, izsVar, i, 8);
        }
    }

    public static final void b(List list, izs izsVar, izs izsVar2, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(627886276);
        int i2 = i | (M.J(list) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(izsVar2) ? 256 : 128) | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(627886276, i2, -1, "com.vk.ecomm.design.compose.productattaches.VideoAttachesRow (VideoAttachesRow.kt:34)");
            }
            xvy a2 = zvy.a(0, 3, M);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new iyh(izsVar, 3);
                M.R(x);
            }
            a(a2, (izs) x, M, 0);
            float f = 12;
            a.j g = androidx.compose.foundation.layout.a.g(f);
            q630.a aVar2 = q630.a.a;
            float f2 = 16;
            q630 E = ahn.E(s200.H(txj0.h(txj0.f(aVar2, 1.0f), 68), f2, f, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), "videoAttachRow");
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new lfa(25, list, izsVar2);
                M.R(x2);
            }
            lqy.b(E, a2, null, g, null, null, false, null, (izs) x2, M, 24576, 492);
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
            s.d = new m2s0(list, izsVar, izsVar2, q630Var2, i);
        }
    }
}
