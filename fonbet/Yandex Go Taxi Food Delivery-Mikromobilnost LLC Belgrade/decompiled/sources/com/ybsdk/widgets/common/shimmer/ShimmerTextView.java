package com.ybsdk.widgets.common.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.widgets.common.shimmer.ShimmerTextView;
import defpackage.g8e;
import defpackage.gur0;
import defpackage.i3y;
import defpackage.i5z0;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.kok0;
import defpackage.mxp0;
import defpackage.ntr0;
import defpackage.rje;
import defpackage.sls;
import defpackage.t3i0;
import defpackage.ttx;
import defpackage.utx;
import defpackage.vtx;
import defpackage.w511;
import defpackage.ylg0;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.BuildConfig;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\fJ\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010 \u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\nH\u0014¢\u0006\u0004\b&\u0010\fJ\u000f\u0010'\u001a\u00020\nH\u0014¢\u0006\u0004\b'\u0010\fJ\u001f\u0010+\u001a\u00020\n2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0006H\u0014¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010\u0010J\u0019\u0010-\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b-\u00100J\u0017\u00103\u001a\u00020\n2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\nH\u0002¢\u0006\u0004\b5\u0010\fJ\u000f\u00106\u001a\u00020\nH\u0002¢\u0006\u0004\b6\u0010\fJ\u000f\u00107\u001a\u00020\nH\u0002¢\u0006\u0004\b7\u0010\fJ\u000f\u00109\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J'\u0010?\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;2\u0006\u0010>\u001a\u00020;H\u0002¢\u0006\u0004\b?\u0010@J\u001b\u0010B\u001a\u00020\n2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bB\u0010CJ\u0019\u0010E\u001a\u00020D2\b\u0010A\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bE\u0010FJ\u001f\u0010I\u001a\u0002012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bI\u0010JR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010KR\u0018\u0010L\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010KR#\u0010\\\u001a\n W*\u0004\u0018\u00010V0V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0016\u0010]\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010`\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006e"}, d2 = {"Lcom/ybsdk/widgets/common/shimmer/ShimmerTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "startShimmer", "()V", "stopShimmer", "times", "playShimmer", "(I)V", "", "isShimmerStarted", "()Z", "maybeStartShimmer", BackendConfig.Restrictions.ENABLED, "setAutoStart", "(Z)V", "Lcom/ybsdk/core/utils/ColorModel;", "color", "setShimmerColor", "(Lcom/ybsdk/core/utils/ColorModel;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "setTextColor", "Landroid/content/res/ColorStateList;", "colors", "(Landroid/content/res/ColorStateList;)V", "Lntr0;", "shimmerArgs", "setShimmer", "(Lntr0;)V", "updateShader", "updateShaderIfNeeded", "updateTextColor", "Landroid/graphics/Shader;", "getShader", "()Landroid/graphics/Shader;", "", "start", "end", "percent", "offset", "(FFF)F", "animationPlaysAmount", "updateValueAnimator", "(Ljava/lang/Integer;)V", "Lcom/ybsdk/widgets/common/shimmer/AutoRepeatAnimatorListener;", "createAnimatorListener", "(Ljava/lang/Integer;)Lcom/ybsdk/widgets/common/shimmer/AutoRepeatAnimatorListener;", "Landroid/content/res/TypedArray;", "typedArray", "fromAttributes", "(Landroid/content/Context;Landroid/content/res/TypedArray;)Lntr0;", CA20Status.STATUS_USER_I, "shader", "Landroid/graphics/Shader;", "Landroid/graphics/Matrix;", "shaderMatrix", "Landroid/graphics/Matrix;", "Lntr0;", "Landroid/animation/ValueAnimator;", "valueAnimator", "Landroid/animation/ValueAnimator;", "latestTextColor", "Landroid/view/animation/Interpolator;", "kotlin.jvm.PlatformType", "defaultInterpolator$delegate", "Li3y;", "getDefaultInterpolator", "()Landroid/view/animation/Interpolator;", "defaultInterpolator", "isViewVisible", "Z", "Lvtx;", "startedShimmerType", "Lvtx;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "updateListener", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShimmerTextView extends AppCompatTextView {
    private final int defStyleAttr;

    /* renamed from: defaultInterpolator$delegate, reason: from kotlin metadata */
    private final i3y defaultInterpolator;
    private boolean isViewVisible;
    private int latestTextColor;
    private Shader shader;
    private final Matrix shaderMatrix;
    private ntr0 shimmerArgs;
    private vtx startedShimmerType;
    private final ValueAnimator.AnimatorUpdateListener updateListener;
    private ValueAnimator valueAnimator;

    public ShimmerTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.defStyleAttr = i;
        this.shaderMatrix = new Matrix();
        this.shimmerArgs = new ntr0(context, 0.0f, 0, 0L, 0L, false, false, null, null, 4094);
        this.latestTextColor = getCurrentTextColor();
        this.defaultInterpolator = kotlin.a.b(LazyThreadSafetyMode.NONE, new kok0(context, 10));
        this.isViewVisible = true;
        this.updateListener = new mxp0(13, this);
        setWillNotDraw(false);
        getPaint().setAntiAlias(true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t3i0.YbSdkShimmerTextView, i, 0);
            setShimmer(fromAttributes(context, obtainStyledAttributes));
            obtainStyledAttributes.recycle();
            return;
        }
        setShimmer(new ntr0(context, 0.0f, 0, 0L, 0L, false, false, null, null, 4094));
    }

    private final AutoRepeatAnimatorListener createAnimatorListener(Integer animationPlaysAmount) {
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        return new AutoRepeatAnimatorListener(new sls(this) { // from class: fur0
            public final /* synthetic */ ShimmerTextView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 createAnimatorListener$lambda$3;
                zy11 createAnimatorListener$lambda$4;
                ntr0 ntr0Var;
                int i4 = i;
                ShimmerTextView shimmerTextView = this.b;
                switch (i4) {
                    case 0:
                        createAnimatorListener$lambda$3 = ShimmerTextView.createAnimatorListener$lambda$3(shimmerTextView);
                        return createAnimatorListener$lambda$3;
                    case 1:
                        createAnimatorListener$lambda$4 = ShimmerTextView.createAnimatorListener$lambda$4(shimmerTextView);
                        return createAnimatorListener$lambda$4;
                    default:
                        ntr0Var = shimmerTextView.shimmerArgs;
                        return ntr0Var;
                }
            }
        }, new sls(this) { // from class: fur0
            public final /* synthetic */ ShimmerTextView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 createAnimatorListener$lambda$3;
                zy11 createAnimatorListener$lambda$4;
                ntr0 ntr0Var;
                int i4 = i2;
                ShimmerTextView shimmerTextView = this.b;
                switch (i4) {
                    case 0:
                        createAnimatorListener$lambda$3 = ShimmerTextView.createAnimatorListener$lambda$3(shimmerTextView);
                        return createAnimatorListener$lambda$3;
                    case 1:
                        createAnimatorListener$lambda$4 = ShimmerTextView.createAnimatorListener$lambda$4(shimmerTextView);
                        return createAnimatorListener$lambda$4;
                    default:
                        ntr0Var = shimmerTextView.shimmerArgs;
                        return ntr0Var;
                }
            }
        }, new sls(this) { // from class: fur0
            public final /* synthetic */ ShimmerTextView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 createAnimatorListener$lambda$3;
                zy11 createAnimatorListener$lambda$4;
                ntr0 ntr0Var;
                int i4 = i3;
                ShimmerTextView shimmerTextView = this.b;
                switch (i4) {
                    case 0:
                        createAnimatorListener$lambda$3 = ShimmerTextView.createAnimatorListener$lambda$3(shimmerTextView);
                        return createAnimatorListener$lambda$3;
                    case 1:
                        createAnimatorListener$lambda$4 = ShimmerTextView.createAnimatorListener$lambda$4(shimmerTextView);
                        return createAnimatorListener$lambda$4;
                    default:
                        ntr0Var = shimmerTextView.shimmerArgs;
                        return ntr0Var;
                }
            }
        }, animationPlaysAmount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createAnimatorListener$lambda$3(ShimmerTextView shimmerTextView) {
        shimmerTextView.valueAnimator = null;
        updateValueAnimator$default(shimmerTextView, null, 1, null);
        shimmerTextView.invalidate();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createAnimatorListener$lambda$4(ShimmerTextView shimmerTextView) {
        updateValueAnimator$default(shimmerTextView, null, 1, null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Interpolator defaultInterpolator_delegate$lambda$0(Context context) {
        return AnimationUtils.loadInterpolator(context, ylg0.ybsdk_default_interpolator);
    }

    private final ntr0 fromAttributes(Context context, TypedArray typedArray) {
        float f = typedArray.getFloat(t3i0.YbSdkShimmerTextView_ybsdk_shimmer_gradient_highlight_alpha, 0.6f);
        boolean z = typedArray.getBoolean(t3i0.YbSdkShimmerTextView_ybsdk_shimmer_auto_start, true);
        int i = typedArray.getInt(t3i0.YbSdkShimmerTextView_ybsdk_shimmer_duration, 1250);
        int i2 = typedArray.getInt(t3i0.YbSdkShimmerTextView_ybsdk_shimmer_repeat_delay, 75);
        ColorModel e = rje.e(typedArray, t3i0.YbSdkShimmerTextView_ybsdk_shimmer_color_attr, ntr0.n);
        k4o entries = ShimmerArgs$GradientShape.getEntries();
        int i3 = t3i0.YbSdkShimmerTextView_ybsdk_shimmer_gradient_shape;
        ShimmerArgs$GradientShape shimmerArgs$GradientShape = ntr0.o;
        ShimmerArgs$GradientShape shimmerArgs$GradientShape2 = (ShimmerArgs$GradientShape) kotlin.collections.a.S(typedArray.getInt(i3, shimmerArgs$GradientShape.ordinal()), entries);
        return new ntr0(context, f, 0, i, i2, z, false, e, shimmerArgs$GradientShape2 == null ? shimmerArgs$GradientShape : shimmerArgs$GradientShape2, 844);
    }

    private final Interpolator getDefaultInterpolator() {
        return (Interpolator) this.defaultInterpolator.getValue();
    }

    private final Shader getShader() {
        int i = gur0.a[this.shimmerArgs.k.ordinal()];
        if (i == 1) {
            float width = getWidth();
            int i2 = this.latestTextColor;
            return new LinearGradient(0.0f, 0.0f, width, 0.0f, new int[]{i2, this.shimmerArgs.m, i2}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        }
        if (i != 2) {
            w511.b();
            return null;
        }
        int height = getHeight();
        float width2 = getWidth() / 2;
        float f = height / 2;
        return new RadialGradient(width2, f, Math.min(width2, f), new int[]{this.shimmerArgs.m, this.latestTextColor}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
    }

    private final float offset(float start, float end, float percent) {
        return g8e.b(end, start, percent, start);
    }

    private final void setShimmer(ntr0 shimmerArgs) {
        this.shimmerArgs = shimmerArgs;
        updateShader();
        updateValueAnimator$default(this, null, 1, null);
    }

    private final void updateShader() {
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        this.shader = getShader();
    }

    private final void updateShaderIfNeeded() {
        if (this.shader == null) {
            this.shader = getShader();
        }
    }

    private final void updateTextColor() {
        if (this.latestTextColor != getCurrentTextColor()) {
            this.latestTextColor = getCurrentTextColor();
            updateShader();
            invalidate();
        }
    }

    private final void updateValueAnimator(Integer animationPlaysAmount) {
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
        ofFloat.setDuration(this.shimmerArgs.d);
        ofFloat.setRepeatCount(0);
        ofFloat.setInterpolator(getDefaultInterpolator());
        ofFloat.addUpdateListener(this.updateListener);
        ofFloat.addListener(createAnimatorListener(animationPlaysAmount));
        if (isStarted) {
            ofFloat.start();
        }
        this.valueAnimator = ofFloat;
    }

    public static /* synthetic */ void updateValueAnimator$default(ShimmerTextView shimmerTextView, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        shimmerTextView.updateValueAnimator(num);
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

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeStartShimmer();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopShimmer();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (!isShimmerStarted()) {
            getPaint().setShader(null);
        } else if (getPaint().getShader() == null) {
            getPaint().setShader(this.shader);
        }
        Shader shader = getPaint().getShader();
        if (shader != null) {
            this.shaderMatrix.reset();
            float width = getWidth();
            ValueAnimator valueAnimator = this.valueAnimator;
            float offset = offset(-width, getWidth(), valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f);
            if (this.shimmerArgs.k == ShimmerArgs$GradientShape.TILTED_OVAL) {
                float width2 = getWidth() / 2;
                float height = getHeight() / 2;
                this.shaderMatrix.setScale(1.0f, 2.0f, width2, height);
                this.shaderMatrix.postSkew(-0.25f, 0.0f, width2, height);
            }
            this.shaderMatrix.postTranslate(offset, 0.0f);
            shader.setLocalMatrix(this.shaderMatrix);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        updateShader();
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
        boolean isShown = isShown();
        if (isShown == this.isViewVisible) {
            return;
        }
        this.isViewVisible = isShown;
        if (!isShown) {
            if (!isShimmerStarted()) {
                this.startedShimmerType = null;
            }
            stopShimmer();
            return;
        }
        vtx vtxVar = this.startedShimmerType;
        if (vtxVar != null) {
            if (vtxVar instanceof ttx) {
                playShimmer(((ttx) vtxVar).a);
            } else if (vtxVar.equals(utx.a)) {
                startShimmer();
            } else {
                w511.b();
            }
        }
    }

    public final void playShimmer(int times) {
        if (times <= 0) {
            return;
        }
        this.startedShimmerType = new ttx(times);
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        updateShaderIfNeeded();
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

    public final void setAutoStart(boolean enabled) {
        this.shimmerArgs = ntr0.a(this.shimmerArgs, 0.0f, 0, 0L, 0L, enabled, null, null, 3967);
    }

    public final void setShimmerColor(ColorModel color) {
        if (jl40.l(this.shimmerArgs.j, color)) {
            return;
        }
        this.shimmerArgs = ntr0.a(this.shimmerArgs, 0.0f, 0, 0L, 0L, false, null, color, BuildConfig.VERSION_CODE);
        updateShader();
    }

    @Override // android.widget.TextView
    public void setTextColor(int color) {
        super.setTextColor(color);
        updateTextColor();
    }

    public final void startShimmer() {
        this.startedShimmerType = utx.a;
        if (isShimmerStarted()) {
            return;
        }
        updateShaderIfNeeded();
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
        this.startedShimmerType = null;
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        i5z0.a.a("Shimmer cancelled", new Object[0]);
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colors) {
        super.setTextColor(colors);
        updateTextColor();
    }

    public ShimmerTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ShimmerTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ShimmerTextView(Context context) {
        this(context, null, 0, 6, null);
    }
}
