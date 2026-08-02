package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AuthPlainTokenDataSource.kt */
@b6l(c = "com.vk.push.authsdk.data.source.AuthPlainTokenDataSource", f = "AuthPlainTokenDataSource.kt", l = {48}, m = "getToken")
/* loaded from: classes5.dex */
public final class w55 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ v55 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w55(v55 v55Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = v55Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
