package defpackage;

import androidx.constraintlayout.motion.widget.MotionLayout;
import com.ybsdk.feature.savings.internal.screens.account.SavingsAccountFragment;

/* loaded from: classes3.dex */
public final class c6m0 extends ffh {
    public final /* synthetic */ SavingsAccountFragment a;

    public c6m0(SavingsAccountFragment savingsAccountFragment) {
        this.a = savingsAccountFragment;
    }

    @Override // defpackage.ffh, defpackage.sa30
    public final void onTransitionCompleted(MotionLayout motionLayout, int i) {
        SavingsAccountFragment savingsAccountFragment = this.a;
        savingsAccountFragment.motionLayoutLastStateId = i;
        savingsAccountFragment.adjustSwipeRefreshEnabledState();
    }
}
