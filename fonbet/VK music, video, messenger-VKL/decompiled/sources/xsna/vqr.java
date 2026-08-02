package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: FloatingActionButton.kt */
@b6l(c = "androidx.compose.material3.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", l = {753}, m = "animateElevation")
/* loaded from: classes11.dex */
public final class vqr extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ xqr this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqr(xqr xqrVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = xqrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
