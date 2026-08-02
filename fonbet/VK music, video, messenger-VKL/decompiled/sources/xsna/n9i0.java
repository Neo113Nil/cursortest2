package xsna;

import android.animation.Animator;
import com.vk.stories.design.view.editor.SelectRangeWaveFormView;

/* compiled from: SelectRangeWaveFormView.kt */
/* loaded from: classes6.dex */
public final class n9i0 implements Animator.AnimatorListener {
    public final /* synthetic */ SelectRangeWaveFormView b;

    public n9i0(SelectRangeWaveFormView selectRangeWaveFormView) {
        this.b = selectRangeWaveFormView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b.K = 0;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        double leftOffsetPercent;
        double leftPercent;
        double rightPercent;
        SelectRangeWaveFormView selectRangeWaveFormView = this.b;
        double d = selectRangeWaveFormView.h * 1000;
        leftOffsetPercent = selectRangeWaveFormView.getLeftOffsetPercent();
        int a = an10.a(leftOffsetPercent * d);
        double d2 = selectRangeWaveFormView.h * 1000;
        leftPercent = selectRangeWaveFormView.getLeftPercent();
        int a2 = an10.a(leftPercent * d2);
        int i = selectRangeWaveFormView.i + a2;
        double d3 = selectRangeWaveFormView.h * 1000;
        rightPercent = selectRangeWaveFormView.getRightPercent();
        int min = Math.min(i, an10.a(rightPercent * d3));
        int i2 = selectRangeWaveFormView.f ? a2 - a : 0;
        m9i0 m9i0Var = selectRangeWaveFormView.b;
        if (m9i0Var != null) {
            m9i0Var.i1(i2, a2, min, selectRangeWaveFormView.K == 3);
        }
        selectRangeWaveFormView.K = 0;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
