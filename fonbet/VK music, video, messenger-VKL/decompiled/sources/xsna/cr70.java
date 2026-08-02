package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: InvalidationTracker.kt */
@b6l(c = "androidx.room.ObservedTableVersions", f = "InvalidationTracker.kt", l = {602}, m = "collect")
/* loaded from: classes.dex */
public final class cr70 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ dr70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr70(dr70 dr70Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dr70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
