package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: TabsSheet.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.TabsSheetKt", f = "TabsSheet.kt", l = {229, 231, 233}, m = "sheetOnboardingAnimation")
/* loaded from: classes3.dex */
public final class wzn0 extends ContinuationImpl {
    float F$0;
    float F$1;
    float F$2;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public wzn0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return qzn0.e(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, this);
    }
}
