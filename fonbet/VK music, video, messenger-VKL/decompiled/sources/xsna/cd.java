package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.o2d0;

/* compiled from: Clickable.kt */
@b6l(c = "androidx.compose.foundation.AbstractClickableNode$onFocusChange$1$1", f = "Clickable.kt", l = {1900}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class cd extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ o2d0.b $it;
    int label;
    final /* synthetic */ zc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd(zc zcVar, o2d0.b bVar, spj<? super cd> spjVar) {
        super(2, spjVar);
        this.this$0 = zcVar;
        this.$it = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new cd(this.this$0, this.$it, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((cd) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            sg50 sg50Var = this.this$0.r;
            if (sg50Var != null) {
                o2d0.a aVar = new o2d0.a(this.$it);
                this.label = 1;
                if (sg50Var.a(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
