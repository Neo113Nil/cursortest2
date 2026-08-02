package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ChatOnlineMembersLoaderImpl.kt */
@b6l(c = "com.vk.im.chat.onlines.impl.ChatOnlineMembersLoaderImpl", f = "ChatOnlineMembersLoaderImpl.kt", l = {46}, m = "loadCounters")
/* loaded from: classes2.dex */
public final class ytb extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ aub this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytb(aub aubVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aubVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return aub.b(this.this$0, null, this);
    }
}
