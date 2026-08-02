package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AndroidFontLoader.android.kt */
@b6l(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", l = {55, 57}, m = "awaitLoad", v = 1)
/* loaded from: classes11.dex */
public final class u82 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ v82 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u82(v82 v82Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = v82Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
