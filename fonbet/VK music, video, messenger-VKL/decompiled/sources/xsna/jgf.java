package xsna;

import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkNavigator;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.api.json.JsonToken;
import xsna.mjf;

/* compiled from: ClipsUploadInitCompactExecutor.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.executors.ClipsUploadInitCompactExecutor$execute$2", f = "ClipsUploadInitCompactExecutor.kt", l = {JsonToken.BEGIN_ARRAY}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class jgf extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mjf.c $task;
    int label;
    final /* synthetic */ lgf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgf(lgf lgfVar, mjf.c cVar, spj<? super jgf> spjVar) {
        super(2, spjVar);
        this.this$0 = lgfVar;
        this.$task = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new jgf(this.this$0, this.$task, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((jgf) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            lgf lgfVar = this.this$0;
            mjf.c cVar = this.$task;
            ClipsUploadUiVkNavigator.ClipUploadDataCompact clipUploadDataCompact = cVar.b;
            Set<Object> set = cVar.c;
            this.label = 1;
            obj = lgf.t(lgfVar, clipUploadDataCompact, set, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        this.this$0.a(new mjf.a.o((ClipsUploadDataInternal) obj, this.$task.b.e));
        return s3q0.a;
    }
}
