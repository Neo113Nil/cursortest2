package xsna;

import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsDraftCounterCoordinatorProvider.kt */
@b6l(c = "com.vk.camera.clips.drafts.sync.impl.provider.ClipsDraftCounterCoordinatorProvider$getDraftCount$1", f = "ClipsDraftCounterCoordinatorProvider.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class msd extends SuspendLambda implements wzs<yvj, spj<? super Integer>, Object> {
    int label;
    final /* synthetic */ nsd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msd(nsd nsdVar, spj<? super msd> spjVar) {
        super(2, spjVar);
        this.this$0 = nsdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new msd(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Integer> spjVar) {
        return ((msd) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            std stdVar = this.this$0.a;
            this.label = 1;
            obj = stdVar.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return new Integer(((List) obj).size());
    }
}
