package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.design.view.spoiler.SpoilerView;
import com.vkontakte.android.R;

/* compiled from: SpoilerOverlayView.kt */
/* loaded from: classes18.dex */
public final class cmk0 extends FrameLayout {
    public boolean b;
    public final ImageView c;
    public final ImageButton d;
    public final View e;
    public final FrameLayout f;

    public cmk0(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f = frameLayout;
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        this.c = imageView;
        frameLayout.addView(new SpoilerView(context, null, 6), new FrameLayout.LayoutParams(-1, -1));
        ImageButton imageButton = (ImageButton) LayoutInflater.from(context).inflate(R.layout.spoiler_toggle_button, (ViewGroup) this, false);
        imageButton.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        addView(imageButton);
        this.d = imageButton;
        View inflate = LayoutInflater.from(context).inflate(R.layout.spoiler_donate_badge, (ViewGroup) this, false);
        inflate.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        addView(inflate);
        this.e = inflate;
    }

    public final void a(int i, int i2) {
        FrameLayout frameLayout = this.f;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (layoutParams.width == i && layoutParams.height == i2) {
            return;
        }
        if (i > 0 || i2 > 0) {
            layoutParams.width = i;
            layoutParams.height = i2;
            frameLayout.setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.b) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setBlurImageVisibility(boolean z) {
        this.d.setActivated(z);
        float f = z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        FrameLayout frameLayout = this.f;
        frameLayout.animate().cancel();
        frameLayout.animate().alpha(f).setDuration(200L);
    }

    public final void setBlurredBitmap(Bitmap bitmap) {
        this.c.setImageBitmap(bitmap);
    }

    public final void setDonateBadgeVisibility(boolean z) {
        float f = z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        View view = this.e;
        view.animate().cancel();
        view.animate().alpha(f).setDuration(200L);
    }

    public final void setToggleOnClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public final void setToggleVisibility(boolean z) {
        this.d.setAlpha(z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void setTouchesEnabled(boolean z) {
        this.b = z;
    }
}
