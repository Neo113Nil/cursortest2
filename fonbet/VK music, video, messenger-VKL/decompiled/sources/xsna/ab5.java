package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AuthorHeaderPicturePager.kt */
@b6l(c = "com.vk.profile.design.compose.header.header.AuthorHeaderPicturePagerKt$onPagerPictureClickEvent$1", f = "AuthorHeaderPicturePager.kt", l = {537}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ab5 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wb90 $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab5(wb90 wb90Var, spj<? super ab5> spjVar) {
        super(2, spjVar);
        this.$context = wb90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ab5(this.$context, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ab5) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            wb90 wb90Var = this.$context;
            mc90 mc90Var = wb90Var.a;
            bc90 bc90Var = wb90Var.b;
            ka5 ka5Var = wb90Var.c;
            this.label = 1;
            if (xa5.i(mc90Var, bc90Var, ka5Var, -1, this) == coroutineSingletons) {
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
