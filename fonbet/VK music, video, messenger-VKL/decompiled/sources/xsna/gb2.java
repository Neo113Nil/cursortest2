package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AndroidPlatformTextInputSession.android.kt */
@b6l(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession", f = "AndroidPlatformTextInputSession.android.kt", l = {71}, m = "startInputMethod", v = 1)
/* loaded from: classes11.dex */
public final class gb2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ kb2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb2(kb2 kb2Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = kb2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
