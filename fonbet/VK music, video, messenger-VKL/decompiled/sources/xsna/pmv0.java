package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.ok.android.api.json.JsonToken;

/* compiled from: VkStepsRepository.kt */
@b6l(c = "com.vk.superapp.vksteps.data.repository.VkStepsRepository", f = "VkStepsRepository.kt", l = {JsonToken.BEGIN_ARRAY, JsonToken.END_ARRAY, 105}, m = "getStepsFromGoogleFit")
/* loaded from: classes6.dex */
public final class pmv0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ umv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmv0(umv0 umv0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = umv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, null, null, this);
    }
}
