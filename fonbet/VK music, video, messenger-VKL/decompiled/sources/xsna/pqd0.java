package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.modal.Mode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ProductManagementConfirmationModal.kt */
/* loaded from: classes18.dex */
public final class pqd0 {

    /* compiled from: ProductManagementConfirmationModal.kt */
    @b6l(c = "com.vk.ecomm.storefront.impl.community.presentation.ui.productmanagement.ProductManagementConfirmationModalKt$ProductsManagementConfirmationModal$1$1", f = "ProductManagementConfirmationModal.kt", l = {45, 47}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ fdj0 $sheetState;
        final /* synthetic */ wh50<vsd0> $showModalContent$delegate;
        final /* synthetic */ vsd0 $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vsd0 vsd0Var, fdj0 fdj0Var, wh50<vsd0> wh50Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$state = vsd0Var;
            this.$sheetState = fdj0Var;
            this.$showModalContent$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$state, this.$sheetState, this.$showModalContent$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        
            if (r5.e(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        
            if (r5.b(r4) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                this.$showModalContent$delegate.setValue(this.$state);
                return s3q0.a;
            }
            kotlin.a.a(obj);
            vsd0 vsd0Var = this.$state;
            if (vsd0Var != null) {
                this.$showModalContent$delegate.setValue(vsd0Var);
                fdj0 fdj0Var = this.$sheetState;
                this.label = 1;
            } else {
                fdj0 fdj0Var2 = this.$sheetState;
                this.label = 2;
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(vsd0 vsd0Var, izs<? super hjl0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1912705752);
        if ((i & 6) == 0) {
            i2 = (M.J(vsd0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1912705752, i2, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.productmanagement.ProductsManagementConfirmationModal (ProductManagementConfirmationModal.kt:37)");
            }
            fdj0 G = nr2.G(0, 3, M, null);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(vsd0Var);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            int i3 = i2 & 14;
            boolean J = (i3 == 4) | M.J(G);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = new a(vsd0Var, G, wh50Var, null);
                M.R(x2);
            }
            bap.g(vsd0Var, (wzs) x2, M, i3);
            vsd0 vsd0Var2 = (vsd0) wh50Var.getValue();
            if (vsd0Var2 == null) {
                M.K(-85364486);
                M.j();
                aVar2 = M;
            } else {
                M.K(-85364485);
                Mode mode = Mode.Card;
                boolean z = (i2 & 112) == 32;
                Object x3 = M.x();
                if (z || x3 == c0012a) {
                    x3 = new ega(izsVar, 7);
                    M.R(x3);
                }
                aVar2 = M;
                a030.b(mode, (gzs) x3, null, G, null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, false, null, false, null, null, false, null, null, kai.c(1146233769, new rd00(1, vsd0Var2, izsVar), M), aVar2, 6, 100663296, 262132);
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new gga(vsd0Var, izsVar, i, 1);
        }
    }
}
