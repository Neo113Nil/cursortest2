package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: TimePicker.kt */
@b6l(c = "androidx.compose.material3.TimePickerKt", f = "TimePicker.kt", l = {920, 923}, m = "onTap-uYHVD98")
/* loaded from: classes11.dex */
public final class quo0 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public quo0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return kuo0.p(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, 0L, null, this);
    }
}
