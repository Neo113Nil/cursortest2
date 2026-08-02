package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AndroidOverscroll.android.kt */
@b6l(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.android.kt", l = {693, 725}, m = "applyToFling-BMRW4eQ", v = 1)
/* loaded from: classes11.dex */
public final class c82 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d82 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c82(d82 d82Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = d82Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(0L, null, this);
    }
}
