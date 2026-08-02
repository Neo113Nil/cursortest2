package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkSnackbarHost.kt */
@b6l(c = "com.vk.core.compose.snackbar.VkSnackbarHostState", f = "VkSnackbarHost.kt", l = {425, 428}, m = "showSnackbar")
/* loaded from: classes17.dex */
public final class alv0 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ dlv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alv0(dlv0 dlv0Var, spj<? super alv0> spjVar) {
        super(spjVar);
        this.this$0 = dlv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this);
    }
}
