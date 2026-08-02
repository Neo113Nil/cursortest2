package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GroupsRepository.kt */
@b6l(c = "com.vk.settings.impl.data.groups.GroupsRepository", f = "GroupsRepository.kt", l = {36}, m = "deleteGroup-gIAlu-s")
/* loaded from: classes5.dex */
public final class pqu extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ rqu this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqu(rqu rquVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rquVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(0L, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
