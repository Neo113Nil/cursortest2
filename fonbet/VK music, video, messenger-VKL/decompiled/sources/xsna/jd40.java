package xsna;

import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MusicCatalogRootVh.kt */
@b6l(c = "com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh$hidingToolbarVh$1$2", f = "MusicCatalogRootVh.kt", l = {350}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class jd40 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ MusicCatalogRootVh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd40(MusicCatalogRootVh musicCatalogRootVh, spj<? super jd40> spjVar) {
        super(2, spjVar);
        this.this$0 = musicCatalogRootVh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new jd40(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((jd40) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            utk0 utk0Var = this.this$0.F;
            Boolean bool = Boolean.FALSE;
            this.label = 1;
            utk0Var.getClass();
            utk0Var.i(null, bool);
            if (s3q0.a == coroutineSingletons) {
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
