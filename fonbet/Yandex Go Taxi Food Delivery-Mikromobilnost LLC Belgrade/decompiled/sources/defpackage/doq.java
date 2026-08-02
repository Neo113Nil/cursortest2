package defpackage;

import android.animation.AnimatorSet;
import android.view.View;
import com.yandex.go.shortcuts.impl.ui.feed.CoordinatorFeedView;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;

/* loaded from: classes13.dex */
public final class doq implements t52 {
    public final CoordinatorFeedView a;
    public AnimatorSet b;

    public doq(CoordinatorFeedView coordinatorFeedView) {
        this.a = coordinatorFeedView;
    }

    @Override // defpackage.t52
    public final void d(int i, boolean z) {
    }

    @Override // defpackage.t52
    public final void i(float f, boolean z, View view) {
        AnimatorSet animatorSet = this.b;
        if (animatorSet != null) {
            animatorSet.setCurrentPlayTime((long) (100.0f * f));
        }
        this.a.setBackgroundColor(lhc.f(ModalContentViewContainer.BASE_SHADOW_COLOR, Math.abs((int) (255.0f * f)) & 255));
    }
}
