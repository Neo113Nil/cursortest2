package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MediaStoreLoaderImpl.kt */
@b6l(c = "com.vk.mediastore.system.coroutines.MediaStoreLoaderImpl", f = "MediaStoreLoaderImpl.kt", l = {48}, m = "loadEntries-yxL6bBk")
/* loaded from: classes3.dex */
public final class vz10 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ zz10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz10(zz10 zz10Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zz10Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(0, 0, 0, 0, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
