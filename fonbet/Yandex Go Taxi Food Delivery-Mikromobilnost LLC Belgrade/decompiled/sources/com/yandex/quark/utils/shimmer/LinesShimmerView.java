package com.yandex.quark.utils.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.yandex.div.state.db.StateEntry;
import com.yandex.quark.utils.shimmer.LinesShimmerView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ojy;
import defpackage.pjy;
import defpackage.yqb1;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 Y2\u00020\u0001:\u0002Z[B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b \u0010\u001fJ\u0015\u0010!\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\u001fJ\u001f\u0010%\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010\u0015R*\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u001fR*\u0010,\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*\"\u0004\b.\u0010\u001fR*\u0010/\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010(\u001a\u0004\b0\u0010*\"\u0004\b1\u0010\u001fR*\u00102\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010(\u001a\u0004\b3\u0010*\"\u0004\b4\u0010\u001fR*\u00105\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010(\u001a\u0004\b6\u0010*\"\u0004\b7\u0010\u001fR0\u00109\u001a\u0002082\u0006\u0010&\u001a\u0002088\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0004\b9\u0010:\u0012\u0004\b?\u0010\u001b\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R*\u0010@\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010\u0019R\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010(R\u0016\u0010L\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010(R\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006\\"}, d2 = {"Lcom/yandex/quark/utils/shimmer/LinesShimmerView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isShimmerEnabled", "()Z", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "onDraw", "(Landroid/graphics/Canvas;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Lojy;", ConfigConstants.CONFIG, "startShimmer", "(Lojy;)V", "stopShimmer", "()V", "onDetachedFromWindow", "dp", "setLineHeightDp", "(I)V", "setLineSpacingDp", "setCornerRadiusDp", "setPatternSpacingDp", "availableWidth", "availableHeight", "rebuildPath", "value", "lineHeight", CA20Status.STATUS_USER_I, "getLineHeight", "()I", "setLineHeight", "lineSpacing", "getLineSpacing", "setLineSpacing", "patternSpacing", "getPatternSpacing", "setPatternSpacing", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "getCornerRadius", "setCornerRadius", "skeletonColor", "getSkeletonColor", "setSkeletonColor", "", "lineWidthRatios", "[F", "getLineWidthRatios", "()[F", "setLineWidthRatios", "([F)V", "getLineWidthRatios$annotations", "linesShimmerConfig", "Lojy;", "getLinesShimmerConfig", "()Lojy;", "setLinesShimmerConfig", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/graphics/Path;", "cachedPath", "Landroid/graphics/Path;", "lastWidth", "lastHeight", "Landroid/animation/ValueAnimator;", "shimmerAnimator", "Landroid/animation/ValueAnimator;", "Lcom/yandex/quark/utils/shimmer/LinesShimmerView$ShimmerDrawable;", "shimmerDrawable", "Lcom/yandex/quark/utils/shimmer/LinesShimmerView$ShimmerDrawable;", "Landroid/view/View$OnAttachStateChangeListener;", "attachStateListener", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "animatorUpdateListener", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Companion", "pjy", "ShimmerDrawable", "quark-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LinesShimmerView extends View {
    private static final int ALPHA_SHIFT = 24;
    private static final float ANIMATION_END_VALUE = 1.5f;
    private static final float ANIMATION_START_VALUE = -1.5f;
    private static final int COLOR_WITHOUT_ALPHA_MASK = 16777215;
    private static final pjy Companion = new pjy();
    private static final int DEFAULT_CORNER_RADIUS_DP = 4;
    private static final int DEFAULT_LINE_HEIGHT_DP = 16;
    private static final int DEFAULT_LINE_SPACING_DP = 8;
    private static final int DEFAULT_PATTERN_SPACING_DP = 24;
    private static final int DEFAULT_SKELETON_COLOR = -2039584;
    private static final float GRADIENT_DIVISOR = 2.0f;
    private static final float GRADIENT_POS_CENTER = 0.5f;
    private static final float GRADIENT_POS_EDGE_1 = 0.25f;
    private static final float GRADIENT_POS_EDGE_2 = 0.75f;
    private static final float GRADIENT_POS_END = 1.0f;
    private static final float GRADIENT_POS_START = 0.0f;
    private static final int MIN_LINES_COUNT = 3;
    private static final int TRANSPARENT_ALPHA = 0;
    private ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
    private View.OnAttachStateChangeListener attachStateListener;
    private final Path cachedPath;
    private int cornerRadius;
    private int lastHeight;
    private int lastWidth;
    private int lineHeight;
    private int lineSpacing;
    private float[] lineWidthRatios;
    private ojy linesShimmerConfig;
    private final Paint paint;
    private int patternSpacing;
    private ValueAnimator shimmerAnimator;
    private ShimmerDrawable shimmerDrawable;
    private int skeletonColor;

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010,R\u0016\u00103\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010,¨\u00064"}, d2 = {"Lcom/yandex/quark/utils/shimmer/LinesShimmerView$ShimmerDrawable;", "Landroid/graphics/drawable/Drawable;", "Lcom/yandex/quark/utils/shimmer/LinesShimmerView;", "target", "Lojy;", ConfigConstants.CONFIG, "<init>", "(Lcom/yandex/quark/utils/shimmer/LinesShimmerView;Lojy;)V", "", "w", "h", "Lzy11;", "createGradient", "(FF)V", "v", "updateProgress", "(F)V", "Landroid/graphics/Path;", StateEntry.COLUMN_PATH, "updateDrawnPath", "(Landroid/graphics/Path;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "", "a", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "cf", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "Lcom/yandex/quark/utils/shimmer/LinesShimmerView;", "Lojy;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/graphics/Matrix;", "matrix", "Landroid/graphics/Matrix;", "progress", "F", "drawPath", "Landroid/graphics/Path;", "Landroid/graphics/LinearGradient;", "gradient", "Landroid/graphics/LinearGradient;", "lastWidth", "lastHeight", "quark-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShimmerDrawable extends Drawable {
        private final ojy config;
        private Path drawPath;
        private LinearGradient gradient;
        private float lastHeight;
        private float lastWidth;
        private float progress;
        private final LinesShimmerView target;
        private final Paint paint = new Paint(1);
        private final Matrix matrix = new Matrix();

        public ShimmerDrawable(LinesShimmerView linesShimmerView, ojy ojyVar) {
            this.target = linesShimmerView;
            this.config = ojyVar;
        }

        private final void createGradient(float w, float h) {
            ojy ojyVar = this.config;
            int i = ojyVar.c;
            int createGradient$withAlpha = createGradient$withAlpha(i, ojyVar.d);
            int createGradient$withAlpha2 = createGradient$withAlpha(i, this.config.e);
            int createGradient$withAlpha3 = createGradient$withAlpha(i, 0);
            float f = w * this.config.b;
            float f2 = h / 2.0f;
            this.gradient = new LinearGradient((-f) / 2.0f, f2, f / 2.0f, f2, new int[]{createGradient$withAlpha3, createGradient$withAlpha2, createGradient$withAlpha, createGradient$withAlpha2, createGradient$withAlpha3}, new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f}, Shader.TileMode.CLAMP);
        }

        private static final int createGradient$withAlpha(int i, int i2) {
            return (i & 16777215) | (i2 << 24);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            float width = this.target.getWidth();
            float height = this.target.getHeight();
            Path path = this.drawPath;
            if (width <= 0.0f || height <= 0.0f || path == null) {
                return;
            }
            if (this.gradient == null || width != this.lastWidth || height != this.lastHeight) {
                createGradient(width, height);
                this.lastWidth = width;
                this.lastHeight = height;
            }
            float f = this.config.b * width;
            float f2 = ((width + f) * this.progress) - (f / 2.0f);
            double radians = Math.toRadians(0.0d);
            double d = f;
            float cos = (float) (Math.cos(radians) * d);
            float sin = (float) (Math.sin(radians) * d);
            this.matrix.reset();
            this.matrix.setTranslate(f2 - (cos / 2.0f), (-sin) / 2.0f);
            Matrix matrix = this.matrix;
            this.config.getClass();
            matrix.postRotate(0.0f, width / 2.0f, height / 2.0f);
            LinearGradient linearGradient = this.gradient;
            if (linearGradient != null) {
                linearGradient.setLocalMatrix(this.matrix);
            }
            this.paint.setShader(this.gradient);
            this.paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
            canvas.drawPath(path, this.paint);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int a) {
            this.paint.setAlpha(a);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter cf) {
            this.paint.setColorFilter(cf);
        }

        public final void updateDrawnPath(Path path) {
            this.drawPath = path;
        }

        public final void updateProgress(float v) {
            this.progress = v;
            invalidateSelf();
        }
    }

    public LinesShimmerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.lineHeight = yqb1.f(16, context);
        this.lineSpacing = yqb1.f(8, context);
        this.patternSpacing = yqb1.f(24, context);
        this.cornerRadius = yqb1.f(4, context);
        this.skeletonColor = DEFAULT_SKELETON_COLOR;
        this.lineWidthRatios = new float[]{1.0f, 0.65f, 0.75f, 0.45f, 0.9f, 0.2f};
        this.linesShimmerConfig = ojy.f;
        Paint paint = new Paint(1);
        paint.setColor(this.skeletonColor);
        this.paint = paint;
        this.cachedPath = new Path();
        setWillNotDraw(false);
    }

    public static /* synthetic */ void getLineWidthRatios$annotations() {
    }

    private final void rebuildPath(int availableWidth, int availableHeight) {
        this.cachedPath.reset();
        float paddingTop = getPaddingTop();
        int length = this.lineWidthRatios.length;
        int i = this.lineHeight + this.lineSpacing;
        float f = this.cornerRadius;
        int i2 = 0;
        float f2 = paddingTop;
        while (this.lineHeight + f2 <= getPaddingTop() + availableHeight) {
            this.cachedPath.addRoundRect(getPaddingLeft(), f2, getPaddingLeft() + (availableWidth * this.lineWidthRatios[i2 % length]), f2 + this.lineHeight, f, f, Path.Direction.CW);
            f2 += i;
            i2++;
            if (i2 % length == 0 && this.lineHeight + f2 + this.patternSpacing <= getPaddingTop() + availableHeight) {
                f2 += this.patternSpacing;
            }
        }
    }

    public static /* synthetic */ void startShimmer$default(LinesShimmerView linesShimmerView, ojy ojyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            ojyVar = linesShimmerView.linesShimmerConfig;
        }
        linesShimmerView.startShimmer(ojyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startShimmer$lambda$1(ShimmerDrawable shimmerDrawable, LinesShimmerView linesShimmerView, ValueAnimator valueAnimator) {
        shimmerDrawable.updateProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
        linesShimmerView.invalidate();
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public final int getLineHeight() {
        return this.lineHeight;
    }

    public final int getLineSpacing() {
        return this.lineSpacing;
    }

    public final float[] getLineWidthRatios() {
        return this.lineWidthRatios;
    }

    public final ojy getLinesShimmerConfig() {
        return this.linesShimmerConfig;
    }

    public final int getPatternSpacing() {
        return this.patternSpacing;
    }

    public final int getSkeletonColor() {
        return this.skeletonColor;
    }

    public final boolean isShimmerEnabled() {
        ValueAnimator valueAnimator = this.shimmerAnimator;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopShimmer();
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.attachStateListener;
        if (onAttachStateChangeListener != null) {
            removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.attachStateListener = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (width <= 0 || height <= 0) {
            return;
        }
        if (getWidth() != this.lastWidth || getHeight() != this.lastHeight) {
            rebuildPath(width, height);
            this.lastWidth = getWidth();
            this.lastHeight = getHeight();
        }
        canvas.drawPath(this.cachedPath, this.paint);
        ShimmerDrawable shimmerDrawable = this.shimmerDrawable;
        if (shimmerDrawable != null) {
            shimmerDrawable.updateDrawnPath(this.cachedPath);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        int paddingBottom = getPaddingBottom() + getPaddingTop() + (2 * this.lineSpacing) + (this.lineHeight * 3);
        if (mode == Integer.MIN_VALUE) {
            int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
            if (paddingBottom > size2) {
                paddingBottom = size2;
            }
        } else if (mode == 1073741824) {
            paddingBottom = View.MeasureSpec.getSize(heightMeasureSpec);
        }
        setMeasuredDimension(size, paddingBottom);
    }

    public final void setCornerRadius(int i) {
        this.cornerRadius = i;
        invalidate();
    }

    public final void setCornerRadiusDp(int dp) {
        setCornerRadius(yqb1.f(dp, getContext()));
    }

    public final void setLineHeight(int i) {
        this.lineHeight = i;
        requestLayout();
    }

    public final void setLineHeightDp(int dp) {
        setLineHeight(yqb1.f(dp, getContext()));
    }

    public final void setLineSpacing(int i) {
        this.lineSpacing = i;
        requestLayout();
    }

    public final void setLineSpacingDp(int dp) {
        setLineSpacing(yqb1.f(dp, getContext()));
    }

    public final void setLineWidthRatios(float[] fArr) {
        this.lineWidthRatios = Arrays.copyOf(fArr, fArr.length);
        requestLayout();
    }

    public final void setLinesShimmerConfig(ojy ojyVar) {
        this.linesShimmerConfig = ojyVar;
        if (isShimmerEnabled()) {
            startShimmer(ojyVar);
        }
    }

    public final void setPatternSpacing(int i) {
        this.patternSpacing = i;
        requestLayout();
    }

    public final void setPatternSpacingDp(int dp) {
        setPatternSpacing(yqb1.f(dp, getContext()));
    }

    public final void setSkeletonColor(int i) {
        this.skeletonColor = i;
        this.paint.setColor(i);
        invalidate();
    }

    public final void startShimmer(ojy config) {
        stopShimmer();
        setLinesShimmerConfig(config);
        final ShimmerDrawable shimmerDrawable = new ShimmerDrawable(this, config);
        this.shimmerDrawable = shimmerDrawable;
        setForeground(shimmerDrawable);
        this.animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.quark.utils.shimmer.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LinesShimmerView.startShimmer$lambda$1(LinesShimmerView.ShimmerDrawable.this, this, valueAnimator);
            }
        };
        ValueAnimator ofFloat = ValueAnimator.ofFloat(ANIMATION_START_VALUE, 1.5f);
        ofFloat.setDuration(config.a);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(this.animatorUpdateListener);
        this.shimmerAnimator = ofFloat;
        ofFloat.start();
        if (this.attachStateListener == null) {
            View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.yandex.quark.utils.shimmer.LinesShimmerView$startShimmer$2
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View v) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View v) {
                    LinesShimmerView.this.stopShimmer();
                }
            };
            this.attachStateListener = onAttachStateChangeListener;
            addOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    public final void stopShimmer() {
        ValueAnimator valueAnimator = this.shimmerAnimator;
        if (valueAnimator != null) {
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.animatorUpdateListener;
            if (animatorUpdateListener != null) {
                valueAnimator.removeUpdateListener(animatorUpdateListener);
            }
            valueAnimator.cancel();
        }
        this.shimmerAnimator = null;
        this.shimmerDrawable = null;
        this.animatorUpdateListener = null;
        setForeground(null);
    }

    public LinesShimmerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ LinesShimmerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public LinesShimmerView(Context context) {
        this(context, null, 0, 6, null);
    }
}
