package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import java.util.Objects;

/* compiled from: CameraImageViewSticker.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class si9 extends nxt0 implements dh9 {
    public static final float j = cn70.c(16);
    public final Bitmap f;
    public final AppCompatImageView g;
    public final Path h;
    public Bitmap i;

    public si9(Context context, Bitmap bitmap, Bitmap bitmap2) {
        super(context);
        this.f = bitmap;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        this.g = appCompatImageView;
        this.h = new Path();
        this.i = bitmap2;
        setRemovable(false);
        addView(appCompatImageView);
        setFilteredBitmap(bitmap2);
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov E0(nov novVar) {
        return super.E0(new si9(getContext(), this.f, this.i));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Path path = this.h;
        path.reset();
        int save = canvas.save();
        float originalWidth = getOriginalWidth();
        float originalHeight = getOriginalHeight();
        float f = j;
        path.addRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, originalWidth, originalHeight, f, f, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public final boolean equals(Object obj) {
        si9 si9Var = obj instanceof si9 ? (si9) obj : null;
        return (si9Var != null ? si9Var.f : null) == this.f;
    }

    @Override // xsna.nxt0, xsna.nov
    public boolean getCanStickToSafeZoneGuideLines() {
        return false;
    }

    public final Bitmap getEnhancedBmp() {
        return this.i;
    }

    @Override // xsna.nxt0, xsna.nov
    public float getMaxScaleLimit() {
        return 4.0f;
    }

    @Override // xsna.nxt0, xsna.nov
    public float getMinScaleLimit() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.nxt0, xsna.nov
    public int getMovePointersCount() {
        return 2;
    }

    @Override // xsna.nxt0, xsna.nov
    public float getOriginalHeight() {
        return this.f.getHeight();
    }

    @Override // xsna.nxt0, xsna.nov
    public float getOriginalWidth() {
        return this.f.getWidth();
    }

    public final Bitmap getSrcBmp() {
        return this.f;
    }

    @Override // xsna.nxt0, xsna.nov
    public int getStickerLayerType() {
        return 1;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.g.layout(i, i2, i3, i4);
    }

    public final void setFilteredBitmap(Bitmap bitmap) {
        this.i = bitmap;
        if (bitmap == null) {
            bitmap = this.f;
        }
        this.g.setImageBitmap(bitmap);
        invalidate();
    }
}
