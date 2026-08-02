package com.ybsdk.widgets.common.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.widgets.common.shimmer.ShimmerDrawable;
import defpackage.bur0;
import defpackage.g8e;
import defpackage.i3y;
import defpackage.i5z0;
import defpackage.kok0;
import defpackage.mxp0;
import defpackage.ntr0;
import defpackage.sls;
import defpackage.unr0;
import defpackage.w511;
import defpackage.ylg0;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.video.m3.BuildConfig;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u0012J\r\u0010\u001e\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u0012J\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u000e¢\u0006\u0004\b%\u0010\u0012J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\fH\u0016¢\u0006\u0004\b/\u0010!J\u000f\u00100\u001a\u00020\fH\u0016¢\u0006\u0004\b0\u00101J\u0019\u00104\u001a\u00020\u000e2\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\"¢\u0006\u0004\b7\u00108J\u0015\u0010;\u001a\u00020\u000e2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010HR#\u0010O\u001a\n J*\u0004\u0018\u00010I0I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006S"}, d2 = {"Lcom/ybsdk/widgets/common/shimmer/ShimmerDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "start", "end", "percent", "offset", "(FFF)F", "", "animationPlaysAmount", "Lzy11;", "updateValueAnimator", "(Ljava/lang/Integer;)V", "updateShader", "()V", "Landroid/graphics/Shader;", "getShader", "()Landroid/graphics/Shader;", "Lcom/ybsdk/widgets/common/shimmer/AutoRepeatAnimatorListener;", "createAnimatorListener", "(Ljava/lang/Integer;)Lcom/ybsdk/widgets/common/shimmer/AutoRepeatAnimatorListener;", "Lntr0;", "shimmerArgs", "setShimmer", "(Lntr0;)V", "startShimmer", "stopShimmer", "times", "playShimmer", "(I)V", "", "isShimmerStarted", "()Z", "maybeStartShimmer", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", CaretView.ALPHA_PROPERTY, "setAlpha", "getOpacity", "()I", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", BackendConfig.Restrictions.ENABLED, "setAutoStart", "(Z)V", "Lcom/ybsdk/core/utils/ColorModel;", "color", "setColor", "(Lcom/ybsdk/core/utils/ColorModel;)V", "Landroid/graphics/Paint;", "shimmerPaint", "Landroid/graphics/Paint;", "drawRect", "Landroid/graphics/Rect;", "Landroid/graphics/Matrix;", "shaderMatrix", "Landroid/graphics/Matrix;", "Landroid/animation/ValueAnimator;", "valueAnimator", "Landroid/animation/ValueAnimator;", "Lntr0;", "Landroid/view/animation/Interpolator;", "kotlin.jvm.PlatformType", "defaultInterpolator$delegate", "Li3y;", "getDefaultInterpolator", "()Landroid/view/animation/Interpolator;", "defaultInterpolator", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "updateListener", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShimmerDrawable extends Drawable {

    /* renamed from: defaultInterpolator$delegate, reason: from kotlin metadata */
    private final i3y defaultInterpolator;
    private ntr0 shimmerArgs;
    private ValueAnimator valueAnimator;
    private final Paint shimmerPaint = unr0.f(true);
    private final Rect drawRect = new Rect();
    private final Matrix shaderMatrix = new Matrix();
    private final ValueAnimator.AnimatorUpdateListener updateListener = new mxp0(11, this);

    public ShimmerDrawable(Context context) {
        this.shimmerArgs = new ntr0(context, 0.0f, 0, 0L, 0L, false, false, null, null, 4094);
        this.defaultInterpolator = kotlin.a.b(LazyThreadSafetyMode.NONE, new kok0(context, 9));
    }

    private final AutoRepeatAnimatorListener createAnimatorListener(Integer animationPlaysAmount) {
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        return new AutoRepeatAnimatorListener(new sls(this) { // from class: wtr0
            public final /* synthetic */ ShimmerDrawable b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 createAnimatorListener$lambda$3;
                zy11 createAnimatorListener$lambda$4;
                ntr0 ntr0Var;
                int i4 = i;
                ShimmerDrawable shimmerDrawable = this.b;
                switch (i4) {
                    case 0:
                        createAnimatorListener$lambda$3 = ShimmerDrawable.createAnimatorListener$lambda$3(shimmerDrawable);
                        return createAnimatorListener$lambda$3;
                    case 1:
                        createAnimatorListener$lambda$4 = ShimmerDrawable.createAnimatorListener$lambda$4(shimmerDrawable);
                        return createAnimatorListener$lambda$4;
                    default:
                        ntr0Var = shimmerDrawable.shimmerArgs;
                        return ntr0Var;
                }
            }
        }, new sls(this) { // from class: wtr0
            public final /* synthetic */ ShimmerDrawable b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 createAnimatorListener$lambda$3;
                zy11 createAnimatorListener$lambda$4;
                ntr0 ntr0Var;
                int i4 = i2;
                ShimmerDrawable shimmerDrawable = this.b;
                switch (i4) {
                    case 0:
                        createAnimatorListener$lambda$3 = ShimmerDrawable.createAnimatorListener$lambda$3(shimmerDrawable);
                        return createAnimatorListener$lambda$3;
                    case 1:
                        createAnimatorListener$lambda$4 = ShimmerDrawable.createAnimatorListener$lambda$4(shimmerDrawable);
                        return createAnimatorListener$lambda$4;
                    default:
                        ntr0Var = shimmerDrawable.shimmerArgs;
                        return ntr0Var;
                }
            }
        }, new sls(this) { // from class: wtr0
            public final /* synthetic */ ShimmerDrawable b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 createAnimatorListener$lambda$3;
                zy11 createAnimatorListener$lambda$4;
                ntr0 ntr0Var;
                int i4 = i3;
                ShimmerDrawable shimmerDrawable = this.b;
                switch (i4) {
                    case 0:
                        createAnimatorListener$lambda$3 = ShimmerDrawable.createAnimatorListener$lambda$3(shimmerDrawable);
                        return createAnimatorListener$lambda$3;
                    case 1:
                        createAnimatorListener$lambda$4 = ShimmerDrawable.createAnimatorListener$lambda$4(shimmerDrawable);
                        return createAnimatorListener$lambda$4;
                    default:
                        ntr0Var = shimmerDrawable.shimmerArgs;
                        return ntr0Var;
                }
            }
        }, animationPlaysAmount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createAnimatorListener$lambda$3(ShimmerDrawable shimmerDrawable) {
        shimmerDrawable.valueAnimator = null;
        updateValueAnimator$default(shimmerDrawable, null, 1, null);
        shimmerDrawable.invalidateSelf();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createAnimatorListener$lambda$4(ShimmerDrawable shimmerDrawable) {
        updateValueAnimator$default(shimmerDrawable, null, 1, null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Interpolator defaultInterpolator_delegate$lambda$1(Context context) {
        return AnimationUtils.loadInterpolator(context, ylg0.ybsdk_default_interpolator);
    }

    private final Interpolator getDefaultInterpolator() {
        return (Interpolator) this.defaultInterpolator.getValue();
    }

    private final Shader getShader() {
        ntr0 ntr0Var = this.shimmerArgs;
        int width = this.drawRect.width();
        int i = ntr0Var.c;
        if (i > 0) {
            width = i;
        }
        int i2 = bur0.b[this.shimmerArgs.k.ordinal()];
        if (i2 == 1) {
            ntr0 ntr0Var2 = this.shimmerArgs;
            int i3 = ntr0Var2.l;
            return new LinearGradient(0.0f, 0.0f, width, 0.0f, new int[]{i3, ntr0Var2.m, i3}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        }
        if (i2 != 2) {
            w511.b();
            return null;
        }
        ntr0 ntr0Var3 = this.shimmerArgs;
        float f = width / 2;
        float height = this.drawRect.height() / 2;
        return new RadialGradient(f, height, Math.min(f, height), new int[]{ntr0Var3.m, ntr0Var3.l}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
    }

    private final float offset(float start, float end, float percent) {
        return g8e.b(end, start, percent, start);
    }

    private final void updateShader() {
        if (getBounds().isEmpty()) {
            return;
        }
        this.shimmerPaint.setShader(getShader());
    }

    private final void updateValueAnimator(Integer animationPlaysAmount) {
        ntr0 ntr0Var = this.shimmerArgs;
        ValueAnimator valueAnimator = this.valueAnimator;
        boolean isStarted = valueAnimator != null ? valueAnimator.isStarted() : false;
        ValueAnimator valueAnimator2 = this.valueAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.valueAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator4 = this.valueAnimator;
        if (valueAnimator4 != null) {
            valueAnimator4.removeAllListeners();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setRepeatCount(0);
        ofFloat.setDuration(ntr0Var.d);
        ofFloat.addUpdateListener(this.updateListener);
        ofFloat.setInterpolator(getDefaultInterpolator());
        ofFloat.addListener(createAnimatorListener(animationPlaysAmount));
        if (isStarted) {
            ofFloat.start();
        }
        this.valueAnimator = ofFloat;
    }

    public static /* synthetic */ void updateValueAnimator$default(ShimmerDrawable shimmerDrawable, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        shimmerDrawable.updateValueAnimator(num);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Shader shader = this.shimmerPaint.getShader();
        if (shader == null) {
            return;
        }
        float width = this.drawRect.width();
        ValueAnimator valueAnimator = this.valueAnimator;
        float offset = offset(-width, getBounds().width(), valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f);
        this.shaderMatrix.reset();
        ntr0 ntr0Var = this.shimmerArgs;
        if (ntr0Var.k == ShimmerArgs$GradientShape.TILTED_OVAL) {
            int width2 = this.drawRect.width();
            int i = ntr0Var.c;
            if (i > 0) {
                width2 = i;
            }
            float f = width2 / 2;
            float height = this.drawRect.height() / 2;
            this.shaderMatrix.setScale(1.0f, 2.0f, f, height);
            this.shaderMatrix.postSkew(-0.25f, 0.0f, f, height);
        }
        this.shaderMatrix.postTranslate(offset, 0.0f);
        shader.setLocalMatrix(this.shaderMatrix);
        canvas.drawRect(this.drawRect, this.shimmerPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final boolean isShimmerStarted() {
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            return valueAnimator.isStarted();
        }
        return false;
    }

    public final void maybeStartShimmer() {
        if (this.shimmerArgs.g) {
            startShimmer();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        this.drawRect.set(0, 0, bounds.width() * 2, bounds.height());
        updateShader();
        maybeStartShimmer();
    }

    public final void playShimmer(int times) {
        if (times <= 0) {
            return;
        }
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        updateValueAnimator(Integer.valueOf(times));
        ValueAnimator valueAnimator2 = this.valueAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.setStartDelay(0L);
        }
        ValueAnimator valueAnimator3 = this.valueAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    public final void setAutoStart(boolean enabled) {
        this.shimmerArgs = ntr0.a(this.shimmerArgs, 0.0f, 0, 0L, 0L, enabled, null, null, 3967);
    }

    public final void setColor(ColorModel color) {
        this.shimmerArgs = ntr0.a(this.shimmerArgs, 0.0f, 0, 0L, 0L, false, null, color, BuildConfig.VERSION_CODE);
        updateShader();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setShimmer(ntr0 shimmerArgs) {
        PorterDuffXfermode porterDuffXfermode;
        this.shimmerArgs = shimmerArgs;
        Paint paint = this.shimmerPaint;
        int i = bur0.a[shimmerArgs.h.ordinal()];
        if (i == 1) {
            porterDuffXfermode = null;
        } else if (i == 2) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        }
        paint.setXfermode(porterDuffXfermode);
        updateShader();
        updateValueAnimator$default(this, null, 1, null);
        invalidateSelf();
    }

    public final void startShimmer() {
        if (isShimmerStarted() || getCallback() == null) {
            return;
        }
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.setStartDelay(0L);
        }
        ValueAnimator valueAnimator2 = this.valueAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
        i5z0.a.a("Shimmer started", new Object[0]);
    }

    public final void stopShimmer() {
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        i5z0.a.a("Shimmer cancelled", new Object[0]);
    }
}
