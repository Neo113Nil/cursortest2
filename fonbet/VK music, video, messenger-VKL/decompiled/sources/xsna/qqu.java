package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GroupsRepository.kt */
@b6l(c = "com.vk.settings.impl.data.groups.GroupsRepository", f = "GroupsRepository.kt", l = {26}, m = "getGroupsWithNotifications-IoAF18A")
/* loaded from: classes5.dex */
public final class qqu extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ rqu this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqu(rqu rquVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rquVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.b(this);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new Result(b);
    }
}
