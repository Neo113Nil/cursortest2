package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ViewUtils.kt */
@b6l(c = "com.vk.catalog.mvi.section.ui.utils.NearEndTriggerFlingBehaviour", f = "ViewUtils.kt", l = {160}, m = "performFling")
/* loaded from: classes16.dex */
public final class sz50 extends ContinuationImpl {
    float F$0;
    float F$1;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ tz50 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz50(tz50 tz50Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = tz50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this);
    }
}
