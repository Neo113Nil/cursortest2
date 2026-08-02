package xsna;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CheckoutContent.kt */
@b6l(c = "com.vk.ecomm.cart.impl.checkout.ui.compose.CheckoutContentKt$CheckoutContent$2$1", f = "CheckoutContent.kt", l = {Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class s3c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ l5c $formScope;
    final /* synthetic */ gzs<s3q0> $onContent;
    final /* synthetic */ mtk0<v8s> $state$delegate;
    final /* synthetic */ View $view;
    int label;

    /* compiled from: CheckoutContent.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ l5c b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ View d;
        public final /* synthetic */ mtk0<v8s> e;

        public a(l5c l5cVar, Context context, View view, mtk0<v8s> mtk0Var) {
            this.b = l5cVar;
            this.c = context;
            this.d = view;
            this.e = mtk0Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            InputMethodManager inputMethodManager;
            this.b.a((v8s) obj);
            if (this.e.getValue().d && (inputMethodManager = (InputMethodManager) this.c.getSystemService("input_method")) != null) {
                inputMethodManager.hideSoftInputFromWindow(this.d.getWindowToken(), 0);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3c(gzs<s3q0> gzsVar, mtk0<v8s> mtk0Var, l5c l5cVar, Context context, View view, spj<? super s3c> spjVar) {
        super(2, spjVar);
        this.$onContent = gzsVar;
        this.$state$delegate = mtk0Var;
        this.$formScope = l5cVar;
        this.$context = context;
        this.$view = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new s3c(this.$onContent, this.$state$delegate, this.$formScope, this.$context, this.$view, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((s3c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            this.$onContent.invoke();
            izg0 M = nr2.M(new kd(this.$state$delegate, 18));
            a aVar = new a(this.$formScope, this.$context, this.$view, this.$state$delegate);
            this.label = 1;
            if (M.collect(aVar, this) == coroutineSingletons) {
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
