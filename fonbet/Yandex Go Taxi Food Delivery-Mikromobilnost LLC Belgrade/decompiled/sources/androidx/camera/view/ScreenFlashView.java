package androidx.camera.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.camera.view.internal.ScreenFlashUiInfo$ProviderType;
import defpackage.iq7;
import defpackage.ny61;
import defpackage.rdp0;
import defpackage.sdp0;
import defpackage.sgb1;
import defpackage.tob1;
import defpackage.v8v;
import defpackage.yso;

/* loaded from: classes10.dex */
public final class ScreenFlashView extends View {
    private static final long ANIMATION_DURATION_MILLIS = 1000;
    private static final String TAG = "ScreenFlashView";
    private iq7 mCameraController;
    private v8v mScreenFlash;
    private Window mScreenFlashWindow;

    public ScreenFlashView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setBackgroundColor(-1);
        setAlpha(0.0f);
        setElevation(Float.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ValueAnimator animateToFullOpacity(final Runnable runnable) {
        sgb1.g(3, TAG);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(getVisibilityRampUpAnimationDurationMillis());
        ofFloat.addUpdateListener(new yso(29, this));
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: androidx.camera.view.ScreenFlashView.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                sgb1.g(3, ScreenFlashView.TAG);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofFloat.start();
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.mScreenFlashWindow;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        sgb1.d(TAG, "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$animateToFullOpacity$0(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).floatValue();
        sgb1.g(3, TAG);
        setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f) {
        if (this.mScreenFlashWindow == null) {
            sgb1.d(TAG, "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f)) {
            sgb1.d(TAG, "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.mScreenFlashWindow.getAttributes();
        attributes.screenBrightness = f;
        this.mScreenFlashWindow.setAttributes(attributes);
        sgb1.g(3, TAG);
    }

    private void setScreenFlashUiInfo(v8v v8vVar) {
        iq7 iq7Var = this.mCameraController;
        if (iq7Var == null) {
            sgb1.g(3, TAG);
            return;
        }
        ScreenFlashUiInfo$ProviderType screenFlashUiInfo$ProviderType = ScreenFlashUiInfo$ProviderType.SCREEN_FLASH_VIEW;
        rdp0 rdp0Var = new rdp0(screenFlashUiInfo$ProviderType, v8vVar);
        rdp0 h = iq7Var.h();
        iq7Var.L.put(screenFlashUiInfo$ProviderType, rdp0Var);
        rdp0 h2 = iq7Var.h();
        if (h2 == null || h2.equals(h)) {
            return;
        }
        iq7Var.y();
    }

    private void updateScreenFlash(Window window) {
        sgb1.g(3, TAG);
        if (this.mScreenFlashWindow != window) {
            this.mScreenFlash = window == null ? null : new sdp0(this);
        }
    }

    public v8v getScreenFlash() {
        return this.mScreenFlash;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(iq7 iq7Var) {
        tob1.b();
        iq7 iq7Var2 = this.mCameraController;
        if (iq7Var2 != null && iq7Var2 != iq7Var) {
            setScreenFlashUiInfo(null);
        }
        this.mCameraController = iq7Var;
        if (iq7Var == null) {
            return;
        }
        tob1.b();
        if (iq7Var.e.J() == 3 && this.mScreenFlashWindow == null) {
            ny61.r("No window set despite setting FLASH_MODE_SCREEN in CameraController");
        } else {
            setScreenFlashUiInfo(getScreenFlash());
        }
    }

    public void setScreenFlashWindow(Window window) {
        tob1.b();
        updateScreenFlash(window);
        this.mScreenFlashWindow = window;
        setScreenFlashUiInfo(getScreenFlash());
    }

    public ScreenFlashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScreenFlashView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ScreenFlashView(Context context) {
        this(context, null);
    }
}
