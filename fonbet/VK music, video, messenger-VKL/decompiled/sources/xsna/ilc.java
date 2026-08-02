package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClientAppRepository.kt */
@b6l(c = "com.vk.push.pushsdk.data.repository.ClientAppRepository", f = "ClientAppRepository.kt", l = {68, 37, 38, 39, 40, 42}, m = "deleteAllInfoByPackage")
/* loaded from: classes5.dex */
public final class ilc extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ jlc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilc(jlc jlcVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = jlcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
