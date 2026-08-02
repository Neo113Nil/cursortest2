package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: NestedScrollModifier.kt */
@b6l(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 224}, m = "dispatchPostFling-RZ2iAVY", v = 1)
/* loaded from: classes11.dex */
public final class f160 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e160 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f160(e160 e160Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = e160Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(0L, 0L, this);
    }
}
