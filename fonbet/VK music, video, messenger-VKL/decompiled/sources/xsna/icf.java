package xsna;

import com.vk.dto.clips.ClipsVideoItemLocation;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.mjf;
import xsna.ugf;

/* compiled from: ClipsUploadAsyncLoadExecutor.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.executors.ClipsUploadAsyncLoadExecutor$loadSuggestedGeolocations$1", f = "ClipsUploadAsyncLoadExecutor.kt", l = {ApiInvocationException.ErrorCodes.FRIEND_RESTRICTION}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class icf extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mjf.a.i $task;
    int label;
    final /* synthetic */ wcf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icf(wcf wcfVar, mjf.a.i iVar, spj<? super icf> spjVar) {
        super(2, spjVar);
        this.this$0 = wcfVar;
        this.$task = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new icf(this.this$0, this.$task, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((icf) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            x9e x9eVar = this.this$0.k;
            List<ClipsVideoItemLocation> list = this.$task.b;
            this.label = 1;
            obj = x9eVar.b(list, 5, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        this.this$0.e(new ugf.d.c((List) obj));
        return s3q0.a;
    }
}
