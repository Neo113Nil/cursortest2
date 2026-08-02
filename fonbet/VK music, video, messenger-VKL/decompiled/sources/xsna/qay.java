package xsna;

import com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;
import com.vk.push.core.filedatastore.JsonSerializer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: JsonSerializableFileDataStoreImpl.kt */
@b6l(c = "com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl$extractFromJsonString$4$1", f = "JsonSerializableFileDataStoreImpl.kt", l = {135}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class qay extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ JsonSerializableFileDataStoreImpl<JsonSerializer> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qay(JsonSerializableFileDataStoreImpl<JsonSerializer> jsonSerializableFileDataStoreImpl, spj<? super qay> spjVar) {
        super(2, spjVar);
        this.this$0 = jsonSerializableFileDataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new qay(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((qay) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            JsonSerializableFileDataStoreImpl<JsonSerializer> jsonSerializableFileDataStoreImpl = this.this$0;
            this.label = 1;
            if (jsonSerializableFileDataStoreImpl.clear(this) == coroutineSingletons) {
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
