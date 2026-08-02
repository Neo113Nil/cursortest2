package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MusicCatalogRootVh.kt */
@b6l(c = "com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh$hidingToolbarVh$1$1", f = "MusicCatalogRootVh.kt", l = {347}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class id40 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Float $alpha;
    int label;
    final /* synthetic */ MusicCatalogRootVh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id40(MusicCatalogRootVh musicCatalogRootVh, Float f, spj<? super id40> spjVar) {
        super(2, spjVar);
        this.this$0 = musicCatalogRootVh;
        this.$alpha = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new id40(this.this$0, this.$alpha, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((id40) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            utk0 utk0Var = this.this$0.F;
            Boolean valueOf = Boolean.valueOf(epx.d(this.$alpha, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            this.label = 1;
            utk0Var.getClass();
            utk0Var.i(null, valueOf);
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
