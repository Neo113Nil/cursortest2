package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ComposeScrollCaptureCallback.android.kt */
@b6l(c = "androidx.compose.ui.scrollcapture.RelativeScroller", f = "ComposeScrollCaptureCallback.android.kt", l = {296}, m = "scrollBy", v = 1)
/* loaded from: classes11.dex */
public final class ctf0 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ dtf0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctf0(dtf0 dtf0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dtf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this);
    }
}
