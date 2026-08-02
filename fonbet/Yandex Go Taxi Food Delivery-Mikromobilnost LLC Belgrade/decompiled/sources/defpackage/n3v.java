package defpackage;

import android.view.View;

/* loaded from: classes13.dex */
public interface n3v {
    View getDelayedGoneLayoutReadyView();

    default boolean isReadyForDelayedGone() {
        View delayedGoneLayoutReadyView = getDelayedGoneLayoutReadyView();
        return delayedGoneLayoutReadyView != null && delayedGoneLayoutReadyView.getWidth() > 0 && delayedGoneLayoutReadyView.getHeight() > 0;
    }
}
