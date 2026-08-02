package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.yandex.go.pin.api.v1.Pin$State;

/* loaded from: classes13.dex */
public interface otb0 {
    g18 addListener(ktb0 ktb0Var);

    long getAnimationDuration();

    Rect getPinFullVisibleBounds();

    CharSequence getPinText();

    Rect getPinVisibleBounds();

    Pin$State getState();

    void invalidatePinOverlay();

    boolean isTextState();

    void setAnchored(boolean z, boolean z2);

    void setAnimationCallback(itb0 itb0Var);

    void setAnimationCurrentPlayTime(long j);

    void setIdleStateDrawable(Drawable drawable);

    void setParentTranslationY(float f);

    void setPinCircleOverlayView(View view);

    void setPinText(CharSequence charSequence);

    void setState(Pin$State pin$State, boolean z);

    void setStyle(z0c0 z0c0Var);

    void stopAnimation();
}
