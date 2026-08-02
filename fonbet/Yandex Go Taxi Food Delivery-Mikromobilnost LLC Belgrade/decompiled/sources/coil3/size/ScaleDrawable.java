package coil3.size;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.jxi;
import defpackage.m810;
import defpackage.xis0;
import defpackage.y5e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0014\u0010\u0010J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u000eH\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000eH\u0016¢\u0006\u0004\b)\u0010\u0010J\u000f\u0010*\u001a\u00020\u000eH\u0016¢\u0006\u0004\b*\u0010\u0010J\u001f\u0010.\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u00012\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u0001H\u0016¢\u0006\u0004\b0\u00101J'\u00104\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u00012\u0006\u0010-\u001a\u00020,2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000eH\u0016¢\u0006\u0004\b7\u0010\u0013J\u0019\u0010:\u001a\u00020\u000b2\b\u00109\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b:\u0010;J\u0019\u0010>\u001a\u00020\u000b2\b\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b>\u0010?J\u0019\u0010B\u001a\u00020\u000b2\b\u0010A\u001a\u0004\u0018\u00010@H\u0017¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u001fH\u0016¢\u0006\u0004\bD\u0010!J\u000f\u0010E\u001a\u00020\u000bH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u000bH\u0016¢\u0006\u0004\bG\u0010FR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010K\u001a\u0004\bL\u0010MR\u0016\u0010O\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010PR\u0016\u0010R\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010P¨\u0006S"}, d2 = {"Lcoil3/size/ScaleDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable$Callback;", "Landroid/graphics/drawable/Animatable;", "child", "Lcoil3/size/Scale;", "scale", "<init>", "(Landroid/graphics/drawable/Drawable;Lcoil3/size/Scale;)V", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "draw", "(Landroid/graphics/Canvas;)V", "", "getAlpha", "()I", CaretView.ALPHA_PROPERTY, "setAlpha", "(I)V", "getOpacity", "Landroid/graphics/ColorFilter;", "getColorFilter", "()Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "", "isStateful", "()Z", "", ClidProvider.STATE, "onStateChange", "([I)Z", "level", "onLevelChange", "(I)Z", "getIntrinsicWidth", "getIntrinsicHeight", "who", "Ljava/lang/Runnable;", "what", "unscheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "", "when", "scheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V", "tintColor", "setTint", "Landroid/content/res/ColorStateList;", "tint", "setTintList", "(Landroid/content/res/ColorStateList;)V", "Landroid/graphics/PorterDuff$Mode;", "tintMode", "setTintMode", "(Landroid/graphics/PorterDuff$Mode;)V", "Landroid/graphics/BlendMode;", "blendMode", "setTintBlendMode", "(Landroid/graphics/BlendMode;)V", "isRunning", "start", "()V", "stop", "Landroid/graphics/drawable/Drawable;", "getChild", "()Landroid/graphics/drawable/Drawable;", "Lcoil3/size/Scale;", "getScale", "()Lcoil3/size/Scale;", "", "childDx", "F", "childDy", "childScale", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ScaleDrawable extends Drawable implements Drawable.Callback, Animatable {
    private final Drawable child;
    private float childDx;
    private float childDy;
    private float childScale;
    private final Scale scale;

    public ScaleDrawable(Drawable drawable, Scale scale) {
        this.child = drawable;
        this.scale = scale;
        this.childScale = 1.0f;
        drawable.setCallback(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int save = canvas.save();
        try {
            canvas.translate(this.childDx, this.childDy);
            float f = this.childScale;
            canvas.scale(f, f);
            this.child.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.child.getAlpha();
    }

    public final Drawable getChild() {
        return this.child;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.child.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.child.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.child.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @jxi
    public int getOpacity() {
        return this.child.getOpacity();
    }

    public final Scale getScale() {
        return this.scale;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable who) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Object obj = this.child;
        return (obj instanceof Animatable) && ((Animatable) obj).isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.child.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        int intrinsicWidth = this.child.getIntrinsicWidth();
        int intrinsicHeight = this.child.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            this.child.setBounds(bounds);
            this.childDx = 0.0f;
            this.childDy = 0.0f;
            this.childScale = 1.0f;
            return;
        }
        int width = bounds.width();
        int height = bounds.height();
        double m = y5e.m(intrinsicWidth, intrinsicHeight, width, height, this.scale, xis0.c);
        int a = m810.a((width - (intrinsicWidth * m)) / 2.0d);
        int a2 = m810.a((height - (intrinsicHeight * m)) / 2.0d);
        this.child.setBounds(a, a2, intrinsicWidth + a, intrinsicHeight + a2);
        this.childDx = bounds.left;
        this.childDy = bounds.top;
        this.childScale = (float) m;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int level) {
        return this.child.setLevel(level);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] state) {
        return this.child.setState(state);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable who, Runnable what, long when) {
        scheduleSelf(what, when);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.child.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.child.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int tintColor) {
        this.child.setTint(tintColor);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(BlendMode blendMode) {
        this.child.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList tint) {
        this.child.setTintList(tint);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode tintMode) {
        this.child.setTintMode(tintMode);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Object obj = this.child;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Object obj = this.child;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable who, Runnable what) {
        unscheduleSelf(what);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScaleDrawable(Drawable drawable) {
        this(drawable, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ScaleDrawable(Drawable drawable, Scale scale, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawable, (i & 2) != 0 ? Scale.FIT : scale);
    }
}
