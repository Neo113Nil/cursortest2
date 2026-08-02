package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: SupportSQLiteConnectionPool.android.kt */
@b6l(c = "androidx.room.driver.SupportSQLitePooledConnection", f = "SupportSQLiteConnectionPool.android.kt", l = {83}, m = "transaction")
/* loaded from: classes.dex */
public final class vin0<R> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ uin0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vin0(uin0 uin0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = uin0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, null, this);
    }
}
