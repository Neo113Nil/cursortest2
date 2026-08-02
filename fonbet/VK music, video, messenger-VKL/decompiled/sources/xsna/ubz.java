package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: LinkVKBidRepository.kt */
@b6l(c = "com.vk.ecomm.verifiedseller.impl.screens.linkvkbid.presentation.LinkVKBidRepository", f = "LinkVKBidRepository.kt", l = {43}, m = "setBidLink")
/* loaded from: classes18.dex */
public final class ubz extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ vbz this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ubz(vbz vbzVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = vbzVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, 0L, this);
    }
}
