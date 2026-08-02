package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: rememberLottieComposition.kt */
@b6l(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt", f = "rememberLottieComposition.kt", l = {150, 151, 152}, m = "lottieComposition")
/* loaded from: classes12.dex */
public final class duf0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public duf0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return guf0.a(null, null, null, null, null, null, this);
    }
}
