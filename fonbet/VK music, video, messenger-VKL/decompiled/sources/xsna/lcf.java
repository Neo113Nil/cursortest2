package xsna;

import com.vk.clips.upload.model.TrendingHashtagData;
import com.vk.clips.upload.ui.api.entities.TrendingHashtag;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ugf;

/* compiled from: ClipsUploadAsyncLoadExecutor.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.executors.ClipsUploadAsyncLoadExecutor$loadTrendingHashtags$1", f = "ClipsUploadAsyncLoadExecutor.kt", l = {612}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class lcf extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ wcf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lcf(wcf wcfVar, spj<? super lcf> spjVar) {
        super(2, spjVar);
        this.this$0 = wcfVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new lcf(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((lcf) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            com.vk.clips.upload.vk.ui.api.a aVar = this.this$0.p;
            this.label = 1;
            obj = aVar.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        Iterable<TrendingHashtagData> iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
        for (TrendingHashtagData trendingHashtagData : iterable) {
            arrayList.add(new TrendingHashtag(trendingHashtagData.b, trendingHashtagData.c));
        }
        this.this$0.e(new ugf.a.h(arrayList));
        return s3q0.a;
    }
}
