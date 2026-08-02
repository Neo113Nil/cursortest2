package com.yandex.plus.home.animation;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.yandex.plus.home.animation.PlusLoadingAnimationView;
import defpackage.bb1;
import defpackage.eng0;
import defpackage.ffx;
import defpackage.hxg0;
import defpackage.i3y;
import defpackage.nvg0;
import defpackage.q2d0;
import defpackage.q5d0;
import defpackage.sls;
import defpackage.tpg0;
import defpackage.vng;
import defpackage.yso;
import kotlin.Metadata;
import kotlin.a;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 I2\u00020\u0001:\u0001JB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001b\u0010!\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001b\u0010%\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00100\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.R\u001b\u00104\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0018\u001a\u0004\b2\u00103R\u001b\u00107\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u0018\u001a\u0004\b6\u00103R\u0014\u00108\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010.R\u0014\u00109\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010.R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u0018\u001a\u0004\b<\u0010=R\u001b\u0010A\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u0018\u001a\u0004\b@\u0010=R#\u0010G\u001a\n C*\u0004\u0018\u00010B0B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010\u0018\u001a\u0004\bE\u0010FR\u0016\u0010H\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010.¨\u0006K"}, d2 = {"Lcom/yandex/plus/home/animation/PlusLoadingAnimationView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "changed", "", "left", "top", "right", "bottom", "Lzy11;", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onDetachedFromWindow", "()V", "Landroid/graphics/Bitmap;", "plusIcon$delegate", "Li3y;", "getPlusIcon", "()Landroid/graphics/Bitmap;", "plusIcon", "dropsMask$delegate", "getDropsMask", "dropsMask", "gradientDropsBitmap$delegate", "getGradientDropsBitmap", "gradientDropsBitmap", "gradientDropsCanvas$delegate", "getGradientDropsCanvas", "()Landroid/graphics/Canvas;", "gradientDropsCanvas", "", "colors", "[I", "", "colorsPositions", "[F", "", "radius", "F", "maskSize", "plusIconSize", "viewCenterX$delegate", "getViewCenterX", "()F", "viewCenterX", "viewCenterY$delegate", "getViewCenterY", "viewCenterY", "maskCenter", "plusIconCenter", "Landroid/graphics/Paint;", "gradientPaint$delegate", "getGradientPaint", "()Landroid/graphics/Paint;", "gradientPaint", "maskPaint$delegate", "getMaskPaint", "maskPaint", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "animation$delegate", "getAnimation", "()Landroid/animation/ValueAnimator;", "animation", "angle", "Companion", "q5d0", "plus-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusLoadingAnimationView extends View {
    private static final q5d0 Companion = new q5d0();

    @Deprecated
    public static final long DEFAULT_ANIMATION_DURATION = 1440;

    @Deprecated
    public static final float END_ROTATION_ANIMATION_DEGREE = 359.0f;

    @Deprecated
    public static final float FIRST_GRADIENT_COLOR_POSITION = 0.25f;

    @Deprecated
    public static final float FOURTH_GRADIENT_COLOR_POSITION = 0.75f;

    @Deprecated
    public static final float MASK_SIZE_MULTIPLIER = 2.1f;

    @Deprecated
    public static final float PLUS_ICON_SIZE_MULTIPLIER = 0.48f;

    @Deprecated
    public static final float SECOND_GRADIENT_COLOR_POSITION = 0.42f;

    @Deprecated
    public static final float START_ROTATION_ANIMATION_DEGREE = 0.0f;

    @Deprecated
    public static final float THIRD_GRADIENT_COLOR_POSITION = 0.57f;
    private float angle;

    /* renamed from: animation$delegate, reason: from kotlin metadata */
    private final i3y animation;
    private final int[] colors;
    private final float[] colorsPositions;

    /* renamed from: dropsMask$delegate, reason: from kotlin metadata */
    private final i3y dropsMask;

    /* renamed from: gradientDropsBitmap$delegate, reason: from kotlin metadata */
    private final i3y gradientDropsBitmap;

    /* renamed from: gradientDropsCanvas$delegate, reason: from kotlin metadata */
    private final i3y gradientDropsCanvas;

    /* renamed from: gradientPaint$delegate, reason: from kotlin metadata */
    private final i3y gradientPaint;
    private final float maskCenter;

    /* renamed from: maskPaint$delegate, reason: from kotlin metadata */
    private final i3y maskPaint;
    private final float maskSize;

    /* renamed from: plusIcon$delegate, reason: from kotlin metadata */
    private final i3y plusIcon;
    private final float plusIconCenter;
    private final float plusIconSize;
    private final float radius;

    /* renamed from: viewCenterX$delegate, reason: from kotlin metadata */
    private final i3y viewCenterX;

    /* renamed from: viewCenterY$delegate, reason: from kotlin metadata */
    private final i3y viewCenterY;

    public PlusLoadingAnimationView(final Context context) {
        super(context);
        final int i = 0;
        this.plusIcon = a.a(new sls() { // from class: o5d0
            @Override // defpackage.sls
            public final Object invoke() {
                Bitmap plusIcon_delegate$lambda$0;
                Bitmap dropsMask_delegate$lambda$1;
                int i2 = i;
                PlusLoadingAnimationView plusLoadingAnimationView = this;
                Context context2 = context;
                switch (i2) {
                    case 0:
                        plusIcon_delegate$lambda$0 = PlusLoadingAnimationView.plusIcon_delegate$lambda$0(context2, plusLoadingAnimationView);
                        return plusIcon_delegate$lambda$0;
                    default:
                        dropsMask_delegate$lambda$1 = PlusLoadingAnimationView.dropsMask_delegate$lambda$1(context2, plusLoadingAnimationView);
                        return dropsMask_delegate$lambda$1;
                }
            }
        });
        final int i2 = 1;
        this.dropsMask = a.a(new sls() { // from class: o5d0
            @Override // defpackage.sls
            public final Object invoke() {
                Bitmap plusIcon_delegate$lambda$0;
                Bitmap dropsMask_delegate$lambda$1;
                int i22 = i2;
                PlusLoadingAnimationView plusLoadingAnimationView = this;
                Context context2 = context;
                switch (i22) {
                    case 0:
                        plusIcon_delegate$lambda$0 = PlusLoadingAnimationView.plusIcon_delegate$lambda$0(context2, plusLoadingAnimationView);
                        return plusIcon_delegate$lambda$0;
                    default:
                        dropsMask_delegate$lambda$1 = PlusLoadingAnimationView.dropsMask_delegate$lambda$1(context2, plusLoadingAnimationView);
                        return dropsMask_delegate$lambda$1;
                }
            }
        });
        this.gradientDropsBitmap = a.a(new sls(this) { // from class: p5d0
            public final /* synthetic */ PlusLoadingAnimationView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Bitmap gradientDropsBitmap_delegate$lambda$2;
                Canvas gradientDropsCanvas_delegate$lambda$3;
                float viewCenterX_delegate$lambda$4;
                Paint gradientPaint_delegate$lambda$7;
                ValueAnimator animation_delegate$lambda$13;
                int i3 = i;
                PlusLoadingAnimationView plusLoadingAnimationView = this.b;
                switch (i3) {
                    case 0:
                        gradientDropsBitmap_delegate$lambda$2 = PlusLoadingAnimationView.gradientDropsBitmap_delegate$lambda$2(plusLoadingAnimationView);
                        return gradientDropsBitmap_delegate$lambda$2;
                    case 1:
                        gradientDropsCanvas_delegate$lambda$3 = PlusLoadingAnimationView.gradientDropsCanvas_delegate$lambda$3(plusLoadingAnimationView);
                        return gradientDropsCanvas_delegate$lambda$3;
                    case 2:
                        viewCenterX_delegate$lambda$4 = PlusLoadingAnimationView.viewCenterX_delegate$lambda$4(plusLoadingAnimationView);
                        break;
                    case 3:
                        viewCenterX_delegate$lambda$4 = PlusLoadingAnimationView.viewCenterY_delegate$lambda$5(plusLoadingAnimationView);
                        break;
                    case 4:
                        gradientPaint_delegate$lambda$7 = PlusLoadingAnimationView.gradientPaint_delegate$lambda$7(plusLoadingAnimationView);
                        return gradientPaint_delegate$lambda$7;
                    default:
                        animation_delegate$lambda$13 = PlusLoadingAnimationView.animation_delegate$lambda$13(plusLoadingAnimationView);
                        return animation_delegate$lambda$13;
                }
                return Float.valueOf(viewCenterX_delegate$lambda$4);
            }
        });
        this.gradientDropsCanvas = a.a(new sls(this) { // from class: p5d0
            public final /* synthetic */ PlusLoadingAnimationView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Bitmap gradientDropsBitmap_delegate$lambda$2;
                Canvas gradientDropsCanvas_delegate$lambda$3;
                float viewCenterX_delegate$lambda$4;
                Paint gradientPaint_delegate$lambda$7;
                ValueAnimator animation_delegate$lambda$13;
                int i3 = i2;
                PlusLoadingAnimationView plusLoadingAnimationView = this.b;
                switch (i3) {
                    case 0:
                        gradientDropsBitmap_delegate$lambda$2 = PlusLoadingAnimationView.gradientDropsBitmap_delegate$lambda$2(plusLoadingAnimationView);
                        return gradientDropsBitmap_delegate$lambda$2;
                    case 1:
                        gradientDropsCanvas_delegate$lambda$3 = PlusLoadingAnimationView.gradientDropsCanvas_delegate$lambda$3(plusLoadingAnimationView);
                        return gradientDropsCanvas_delegate$lambda$3;
                    case 2:
                        viewCenterX_delegate$lambda$4 = PlusLoadingAnimationView.viewCenterX_delegate$lambda$4(plusLoadingAnimationView);
                        break;
                    case 3:
                        viewCenterX_delegate$lambda$4 = PlusLoadingAnimationView.viewCenterY_delegate$lambda$5(plusLoadingAnimationView);
                        break;
                    case 4:
                        gradientPaint_delegate$lambda$7 = PlusLoadingAnimationView.gradientPaint_delegate$lambda$7(plusLoadingAnimationView);
                        return gradientPaint_delegate$lambda$7;
                    default:
                        animation_delegate$lambda$13 = PlusLoadingAnimationView.animation_delegate$lambda$13(plusLoadingAnimationView);
                        return animation_delegate$lambda$13;
                }
                return Float.valueOf(viewCenterX_delegate$lambda$4);
            }
        });
        this.colors = new int[]{bb1.n(tpg0.plus_sdk_home_loading_anim_fox, this), bb1.n(tpg0.plus_sdk_home_loading_anim_purple, this), bb1.n(tpg0.plus_sdk_home_loading_anim_violet, this), bb1.n(tpg0.plus_sdk_home_loading_anim_sky_blue, this)};
        final int i3 = 4;
        this.colorsPositions = new float[]{0.25f, 0.42f, 0.57f, 0.75f};
        float q = bb1.q(nvg0.plus_sdk_gradient_radius, this);
        this.radius = q;
        float f = q * 2.1f;
        this.maskSize = f;
        float f2 = 0.48f * f;
        this.plusIconSize = f2;
        final int i4 = 2;
        this.viewCenterX = a.a(new sls(this) { // from class: p5d0
            public final /* synthetic */ PlusLoadingAnimationView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Bitmap gradientDropsBitmap_delegate$lambda$2;
                Canvas gradientDropsCanvas_delegate$lambda$3;
                float viewCenterX_delegate$lambda$4;
                Paint gradientPaint_delegate$lambda$7;
                ValueAnimator animation_delegate$lambda$13;
                int i32 = i4;
                PlusLoadingAnimationView plusLoadingAnimationView = this.b;
                switch (i32) {
                    case 0:
                        gradientDropsBitmap_delegate$lambda$2 = PlusLoadingAnimationView.gradientDropsBitmap_delegate$lambda$2(plusLoadingAnimationView);
                        return gradientDropsBitmap_delegate$lambda$2;
                    case 1:
                        gradientDropsCanvas_delegate$lambda$3 = PlusLoadingAnimationView.gradientDropsCanvas_delegate$lambda$3(plusLoadingAnimationView);
                        return gradientDropsCanvas_delegate$lambda$3;
                    case 2:
                        viewCenterX_delegate$lambda$4 = PlusLoadingAnimationView.viewCenterX_delegate$lambda$4(plusLoadingAnimationView);
                        break;
                    case 3:
                        viewCenterX_delegate$lambda$4 = PlusLoadingAnimationView.viewCenterY_delegate$lambda$5(plusLoadingAnimationView);
                        break;
                    case 4:
                        gradientPaint_delegate$lambda$7 = PlusLoadingAnimationView.gradientPaint_delegate$lambda$7(plusLoadingAnimationView);
                        return gradientPaint_delegate$lambda$7;
                    default:
                        animation_delegate$lambda$13 = PlusLoadingAnimationView.animation_delegate$lambda$13(plusLoadingAnimationView);
                        return animation_delegate$lambda$13;
                }
                return Float.valueOf(viewCenterX_delegate$lambda$4);
            }
        });
        final int i5 = 3;
        this.viewCenterY = a.a(new sls(this) { // from class: p5d0
            public final /* synthetic */ PlusLoadingAnimationView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Bitmap gradientDropsBitmap_delegate$lambda$2;
                Canvas gradientDropsCanvas_delegate$lambda$3;
                float viewCenterX_delegate$lambda$4;
                Paint gradientPaint_delegate$lambda$7;
                ValueAnimator animation_delegate$lambda$13;
                int i32 = i5;
                PlusLoadingAnimationView plusLoadingAnimationView = this.b;
                switch (i32) {
                    case 0:
                        gradientDropsBitmap_delegate$lambda$2 = PlusLoadingAnimationView.gradientDropsBitmap_delegate$lambda$2(plusLoadingAnimationView);
                        return gradientDropsBitmap_delegate$lambda$2;
                    case 1:
                        gradientDropsCanvas_delegate$lambda$3 = PlusLoadingAnimationView.gradientDropsCanvas_delegate$lambda$3(plusLoadingAnimationView);
                        return gradientDropsCanvas_delegate$lambda$3;
                    case 2:
                        viewCenterX_delegate$lambda$4 = PlusLoadingAnimationView.viewCenterX_delegate$lambda$4(plusLoadingAnimationView);
                        break;
                    case 3:
                        viewCenterX_delegate$lambda$4 = PlusLoadingAnimationView.viewCenterY_delegate$lambda$5(plusLoadingAnimationView);
                        break;
                    case 4:
                        gradientPaint_delegate$lambda$7 = PlusLoadingAnimationView.gradientPaint_delegate$lambda$7(plusLoadingAnimationView);
                        return gradientPaint_delegate$lambda$7;
                    default:
                        animation_delegate$lambda$13 = PlusLoadingAnimationView.animation_delegate$lambda$13(plusLoadingAnimationView);
                        return animation_delegate$lambda$13;
                }
                return Float.valueOf(viewCenterX_delegate$lambda$4);
            }
        });
        this.maskCenter = f / 2.0f;
        this.plusIconCenter = f2 / 2.0f;
        this.gradientPaint = a.a(new sls(this) { // from class: p5d0
            public final /* synthetic */ PlusLoadingAnimationView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Bitmap gradientDropsBitmap_delegate$lambda$2;
                Canvas gradientDropsCanvas_delegate$lambda$3;
                float viewCenterX_delegate$lambda$4;
                Paint gradientPaint_delegate$lambda$7;
                ValueAnimator animation_delegate$lambda$13;
                int i32 = i3;
                PlusLoadingAnimationView plusLoadingAnimationView = this.b;
                switch (i32) {
                    case 0:
                        gradientDropsBitmap_delegate$lambda$2 = PlusLoadingAnimationView.gradientDropsBitmap_delegate$lambda$2(plusLoadingAnimationView);
                        return gradientDropsBitmap_delegate$lambda$2;
                    case 1:
                        gradientDropsCanvas_delegate$lambda$3 = PlusLoadingAnimationView.gradientDropsCanvas_delegate$lambda$3(plusLoadingAnimationView);
                        return gradientDropsCanvas_delegate$lambda$3;
                    case 2:
                        viewCenterX_delegate$lambda$4 = PlusLoadingAnimationView.viewCenterX_delegate$lambda$4(plusLoadingAnimationView);
                        break;
                    case 3:
                        viewCenterX_delegate$lambda$4 = PlusLoadingAnimationView.viewCenterY_delegate$lambda$5(plusLoadingAnimationView);
                        break;
                    case 4:
                        gradientPaint_delegate$lambda$7 = PlusLoadingAnimationView.gradientPaint_delegate$lambda$7(plusLoadingAnimationView);
                        return gradientPaint_delegate$lambda$7;
                    default:
                        animation_delegate$lambda$13 = PlusLoadingAnimationView.animation_delegate$lambda$13(plusLoadingAnimationView);
                        return animation_delegate$lambda$13;
                }
                return Float.valueOf(viewCenterX_delegate$lambda$4);
            }
        });
        this.maskPaint = a.a(new q2d0(8));
        final int i6 = 5;
        this.animation = a.a(new sls(this) { // from class: p5d0
            public final /* synthetic */ PlusLoadingAnimationView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Bitmap gradientDropsBitmap_delegate$lambda$2;
                Canvas gradientDropsCanvas_delegate$lambda$3;
                float viewCenterX_delegate$lambda$4;
                Paint gradientPaint_delegate$lambda$7;
                ValueAnimator animation_delegate$lambda$13;
                int i32 = i6;
                PlusLoadingAnimationView plusLoadingAnimationView = this.b;
                switch (i32) {
                    case 0:
                        gradientDropsBitmap_delegate$lambda$2 = PlusLoadingAnimationView.gradientDropsBitmap_delegate$lambda$2(plusLoadingAnimationView);
                        return gradientDropsBitmap_delegate$lambda$2;
                    case 1:
                        gradientDropsCanvas_delegate$lambda$3 = PlusLoadingAnimationView.gradientDropsCanvas_delegate$lambda$3(plusLoadingAnimationView);
                        return gradientDropsCanvas_delegate$lambda$3;
                    case 2:
                        viewCenterX_delegate$lambda$4 = PlusLoadingAnimationView.viewCenterX_delegate$lambda$4(plusLoadingAnimationView);
                        break;
                    case 3:
                        viewCenterX_delegate$lambda$4 = PlusLoadingAnimationView.viewCenterY_delegate$lambda$5(plusLoadingAnimationView);
                        break;
                    case 4:
                        gradientPaint_delegate$lambda$7 = PlusLoadingAnimationView.gradientPaint_delegate$lambda$7(plusLoadingAnimationView);
                        return gradientPaint_delegate$lambda$7;
                    default:
                        animation_delegate$lambda$13 = PlusLoadingAnimationView.animation_delegate$lambda$13(plusLoadingAnimationView);
                        return animation_delegate$lambda$13;
                }
                return Float.valueOf(viewCenterX_delegate$lambda$4);
            }
        });
        setBackgroundColor(vng.p(eng0.backgroundColor, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ValueAnimator animation_delegate$lambda$13(final PlusLoadingAnimationView plusLoadingAnimationView) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 359.0f);
        ofFloat.setDuration(DEFAULT_ANIMATION_DURATION);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new yso(17, plusLoadingAnimationView));
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.yandex.plus.home.animation.PlusLoadingAnimationView$animation_delegate$lambda$13$lambda$12$$inlined$doOnCancel$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                PlusLoadingAnimationView.this.angle = 0.0f;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animation_delegate$lambda$13$lambda$12$lambda$10(PlusLoadingAnimationView plusLoadingAnimationView, ValueAnimator valueAnimator) {
        plusLoadingAnimationView.angle = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        plusLoadingAnimationView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap dropsMask_delegate$lambda$1(Context context, PlusLoadingAnimationView plusLoadingAnimationView) {
        Drawable t = vng.t(hxg0.plus_sdk_plus_loading_anim_mask, context);
        int i = (int) plusLoadingAnimationView.maskSize;
        return ffx.d0(t, i, i, 4);
    }

    private final ValueAnimator getAnimation() {
        return (ValueAnimator) this.animation.getValue();
    }

    private final Bitmap getDropsMask() {
        return (Bitmap) this.dropsMask.getValue();
    }

    private final Bitmap getGradientDropsBitmap() {
        return (Bitmap) this.gradientDropsBitmap.getValue();
    }

    private final Canvas getGradientDropsCanvas() {
        return (Canvas) this.gradientDropsCanvas.getValue();
    }

    private final Paint getGradientPaint() {
        return (Paint) this.gradientPaint.getValue();
    }

    private final Paint getMaskPaint() {
        return (Paint) this.maskPaint.getValue();
    }

    private final Bitmap getPlusIcon() {
        return (Bitmap) this.plusIcon.getValue();
    }

    private final float getViewCenterX() {
        return ((Number) this.viewCenterX.getValue()).floatValue();
    }

    private final float getViewCenterY() {
        return ((Number) this.viewCenterY.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap gradientDropsBitmap_delegate$lambda$2(PlusLoadingAnimationView plusLoadingAnimationView) {
        float f = plusLoadingAnimationView.maskSize;
        return Bitmap.createBitmap((int) f, (int) f, Bitmap.Config.ARGB_8888);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Canvas gradientDropsCanvas_delegate$lambda$3(PlusLoadingAnimationView plusLoadingAnimationView) {
        return new Canvas(plusLoadingAnimationView.getGradientDropsBitmap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint gradientPaint_delegate$lambda$7(PlusLoadingAnimationView plusLoadingAnimationView) {
        Paint paint = new Paint();
        float f = plusLoadingAnimationView.maskSize;
        float f2 = plusLoadingAnimationView.radius;
        paint.setShader(new LinearGradient(0.0f, (f / 2.0f) + f2, (f / 2.0f) + f2, 0.0f, plusLoadingAnimationView.colors, plusLoadingAnimationView.colorsPositions, Shader.TileMode.REPEAT));
        return paint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint maskPaint_delegate$lambda$9() {
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        return paint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap plusIcon_delegate$lambda$0(Context context, PlusLoadingAnimationView plusLoadingAnimationView) {
        Drawable t = vng.t(hxg0.plus_sdk_plus_loading_anim_points, context);
        int i = (int) plusLoadingAnimationView.plusIconSize;
        return ffx.d0(t, i, i, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float viewCenterX_delegate$lambda$4(PlusLoadingAnimationView plusLoadingAnimationView) {
        return plusLoadingAnimationView.getWidth() / 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float viewCenterY_delegate$lambda$5(PlusLoadingAnimationView plusLoadingAnimationView) {
        return plusLoadingAnimationView.getHeight() / 2.0f;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        getAnimation().cancel();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas gradientDropsCanvas = getGradientDropsCanvas();
        float f = this.maskCenter;
        gradientDropsCanvas.drawCircle(f, f, this.radius, getGradientPaint());
        Canvas gradientDropsCanvas2 = getGradientDropsCanvas();
        float f2 = this.angle;
        float f3 = this.maskCenter;
        int save = gradientDropsCanvas2.save();
        gradientDropsCanvas2.rotate(f2, f3, f3);
        try {
            getGradientDropsCanvas().drawBitmap(getDropsMask(), 0.0f, 0.0f, getMaskPaint());
            gradientDropsCanvas2.restoreToCount(save);
            canvas.drawBitmap(getPlusIcon(), getViewCenterX() - this.plusIconCenter, getViewCenterY() - this.plusIconCenter, (Paint) null);
            canvas.drawBitmap(getGradientDropsBitmap(), getViewCenterX() - this.maskCenter, getViewCenterY() - this.maskCenter, (Paint) null);
        } catch (Throwable th) {
            gradientDropsCanvas2.restoreToCount(save);
            throw th;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        getAnimation().start();
    }
}
