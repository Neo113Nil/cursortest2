package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: StorefrontServicesTopBar.kt */
@b6l(c = "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesTopBarKt$StorefrontServicesTopBar$4$1", f = "StorefrontServicesTopBar.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class qol0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<Boolean> $isFocused$delegate;
    final /* synthetic */ String $query;
    final /* synthetic */ wh50<tho0> $text$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qol0(String str, wh50<tho0> wh50Var, wh50<Boolean> wh50Var2, spj<? super qol0> spjVar) {
        super(2, spjVar);
        this.$query = str;
        this.$text$delegate = wh50Var;
        this.$isFocused$delegate = wh50Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new qol0(this.$query, this.$text$delegate, this.$isFocused$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((qol0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (!epx.f(this.$query, this.$text$delegate.getValue().a.c)) {
            wh50<tho0> wh50Var = this.$text$delegate;
            String str = this.$query;
            int length = str.length();
            wh50Var.setValue(new tho0(str, jgz.c(length, length), 4));
            this.$isFocused$delegate.setValue(Boolean.valueOf(this.$query.length() > 0));
        }
        return s3q0.a;
    }
}
