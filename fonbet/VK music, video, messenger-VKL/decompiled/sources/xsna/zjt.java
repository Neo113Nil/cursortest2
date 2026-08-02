package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import xsna.p0v0;

/* compiled from: GenericVkImageView.kt */
/* loaded from: classes.dex */
public abstract class zjt<Backend extends p0v0> extends nsx0 implements kgw, h5u0 {
    public Backend b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public boolean i;
    public final Rect j;

    public zjt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = -1;
        this.d = -1;
        this.i = true;
        this.j = new Rect();
        l0(context);
        getBackend().z(attributeSet);
        ColorStateList imageTintList = getImageTintList();
        if (imageTintList != null) {
            setColorFilter(imageTintList.getDefaultColor());
        }
    }

    public static s3q0 U(zjt zjtVar, Drawable drawable) {
        super.setImageDrawable(drawable);
        return s3q0.a;
    }

    public static s3q0 V(zjt zjtVar, Canvas canvas) {
        super.onDraw(canvas);
        return s3q0.a;
    }

    public final void A0(int i, ImageView.ScaleType scaleType) {
        getBackend().L(i, scaleType);
    }

    public void F0(Drawable drawable, ImageView.ScaleType scaleType) {
        getBackend().k(drawable, scaleType);
    }

    public void H0(int i, int i2) {
        this.c = i;
        this.d = i2;
        requestLayout();
    }

    public final void J0(Drawable drawable, ImageView.ScaleType scaleType) {
        getBackend().O(drawable, scaleType);
    }

    public final void W() {
        getBackend().N();
    }

    public abstract Backend b0();

    public final boolean c0() {
        return getImageWidth() > 0 && getImageHeight() > 0;
    }

    public void clear() {
        getBackend().clear();
    }

    public final float getAspectRatio() {
        return getBackend().q();
    }

    public final Backend getBackend() {
        Backend backend = this.b;
        if (backend != null) {
            return backend;
        }
        return null;
    }

    public final int getFixedHeight() {
        return this.d;
    }

    public final int getFixedWidth() {
        return this.c;
    }

    public final float getImageAspectRatio() {
        return c0() ? getImageWidth() / getImageHeight() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final int getImageHeight() {
        if (getBackend().s()) {
            return getBackend().m();
        }
        if (getDrawable() != null) {
            return getDrawable().getIntrinsicHeight();
        }
        return 0;
    }

    public final int getImageWidth() {
        if (getBackend().s()) {
            return getBackend().H();
        }
        if (getDrawable() != null) {
            return getDrawable().getIntrinsicWidth();
        }
        return 0;
    }

    public final float getMaxAspectRatio() {
        return getBackend().I();
    }

    public final float getMinAspectRatio() {
        return getBackend().h();
    }

    @Override // xsna.h5u0
    public int getVisibleArea() {
        Rect rect = this.j;
        if (getGlobalVisibleRect(rect)) {
            return o19.b(rect);
        }
        return -1;
    }

    public final qhv0 getVkScaleType() {
        return getBackend().w();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.i;
    }

    public final boolean isImageLoaded() {
        return getBackend().n();
    }

    public final void l0(Context context) {
        this.f = context.getApplicationInfo().targetSdkVersion >= 24;
        if (this.e) {
            return;
        }
        this.e = true;
        Backend b0 = b0();
        b0.o(new cir(this, 1));
        this.b = b0;
    }

    public void load(String str) {
        o0(str, null);
    }

    public final void m0(Uri uri, Size size) {
        sa30.K(this, uri);
        getBackend().K(uri, size);
    }

    public final void o0(String str, Size size) {
        sa30.L(this, str);
        getBackend().y(str, size);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        w0();
        x0();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        w0();
        getBackend().c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        getBackend().l(canvas, new dxh(this, 17));
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        w0();
        x0();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.c;
        if (i3 >= 0 && this.d >= 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(this.d, 1073741824));
            return;
        }
        if (getAspectRatio() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            super.onMeasure(i, i2);
            return;
        }
        float u = getBackend().u();
        int size = View.MeasureSpec.getSize(i);
        float f = size;
        int ceil = (int) Math.ceil(f / u);
        int i4 = this.g;
        if (1 <= i4 && i4 < ceil && ceil > 0) {
            float f2 = ceil;
            float f3 = i4 / f2;
            ceil = (int) (f2 * f3);
            size = (int) (f * f3);
        }
        int i5 = this.h;
        if (1 <= i5 && i5 < size && size > 0) {
            float f4 = size;
            float f5 = i5 / f4;
            ceil = (int) (ceil * f5);
            size = (int) (f4 * f5);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(ceil, 1073741824));
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        w0();
        getBackend().c();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getBackend().d(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        w0();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        w0();
    }

    public final void p0(rlw rlwVar) {
        if (rlwVar instanceof slw) {
            setImageDrawable(((slw) rlwVar).a());
        } else if (rlwVar instanceof ulw) {
            q0(((ulw) rlwVar).a());
        } else {
            if (!(rlwVar instanceof vlw)) {
                throw new NoWhenBranchMatchedException();
            }
            load(((vlw) rlwVar).b());
        }
    }

    public final void q0(int i) {
        getBackend().P(i);
    }

    public final void s0(String str) {
        sa30.L(this, str);
        getBackend().i(str);
    }

    public final void setActualColorFilter(ColorFilter colorFilter) {
        getBackend().setColorFilter(colorFilter);
    }

    public final void setAspectRatio(float f) {
        getBackend().setAspectRatio(f);
    }

    public final void setBackgroundImage(Drawable drawable) {
        getBackend().setBackgroundImage(drawable);
    }

    public final void setCornerRadius(float f) {
        z0(f, f, f, f);
    }

    public final void setCutout(Path path) {
        getBackend().g(path);
    }

    public final void setDontLoadAgainIfSameResource(boolean z) {
        getBackend().j(z);
    }

    public void setEmptyImagePlaceholder(int i) {
        A0(i, null);
    }

    public final void setFixedSize(int i) {
        H0(i, i);
    }

    public final void setHasOverlappingRendering(boolean z) {
        this.i = z;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        l0(getContext());
        getBackend().F();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        l0(getContext());
        getBackend().F();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        l0(getContext());
        getBackend().F();
        super.setImageResource(i);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        l0(getContext());
        getBackend().F();
        super.setImageURI(uri);
    }

    public final void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.f = z;
    }

    public final void setMaxAspectRatio(float f) {
        getBackend().Q(f);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i) {
        super.setMaxHeight(i);
        this.g = i;
        requestLayout();
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        this.h = i;
        requestLayout();
    }

    public final void setMinAspectRatio(float f) {
        getBackend().f(f);
    }

    @Override // xsna.kgw
    public void setOnLoadCallback(b780 b780Var) {
        getBackend().setOnLoadCallback(b780Var);
    }

    public final void setOverlayImage(Drawable drawable) {
        getBackend().A(drawable);
    }

    public final void setPaintFilterBitmap(boolean z) {
        getBackend().e(z);
    }

    public final void setPlaceholderColor(int i) {
        getBackend().setPlaceholderColor(i);
    }

    public void setPlaceholderImage(Drawable drawable) {
        getBackend().B(drawable);
    }

    public final void setRound(boolean z) {
        getBackend().v(z);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(scaleType);
        l0(getContext());
        getBackend().setScaleType(scaleType);
    }

    public final void setThumbHash(String str) {
        getBackend().E(str);
    }

    public final void setVkPostprocessor(jtc0 jtc0Var) {
        getBackend().r(jtc0Var);
    }

    public final void setVkScaleType(qhv0 qhv0Var) {
        getBackend().M(qhv0Var);
    }

    @Override // android.view.View
    public final String toString() {
        return String.format("%s{backend=%s}", Arrays.copyOf(new Object[]{getClass().getSimpleName(), getBackend().toString()}, 2));
    }

    public final void v0(String str) {
        sa30.L(this, str);
        getBackend().J(str);
    }

    public final void w0() {
        Drawable drawable;
        if (!this.f || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public void x0() {
        getBackend().b();
    }

    public final void y0(float f, int i) {
        getBackend().a(f, i);
    }

    public final void z0(float f, float f2, float f3, float f4) {
        getBackend().x(f, f2, f3, f4);
    }

    public final void setActualColorFilter(int i) {
        setActualColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
    }

    public final void setEmptyImagePlaceholder(Drawable drawable) {
        F0(drawable, null);
    }

    public void setPlaceholderImage(int i) {
        getBackend().D(i);
    }

    public zjt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
