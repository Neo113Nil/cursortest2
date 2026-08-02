package com.yandex.div.core.view2.divs.widgets;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.NinePatch;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.R$dimen;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.ShadowCache;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawer;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawer.BorderParams;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawer.ShadowParams;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.TransientViewKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.n9;
import com.yandex.div2.s3;
import com.yandex.div2.u1;
import com.yandex.div2.va;
import com.yandex.div2.xa;
import com.yandex.div2.y2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import xsna.bpn0;
import xsna.gzs;
import xsna.h5s;
import xsna.izs;
import xsna.jon;
import xsna.rl3;
import xsna.s3q0;
import xsna.tyx;
import xsna.zcl;

/* compiled from: DivBorderDrawer.kt */
/* loaded from: classes7.dex */
public final class DivBorderDrawer implements ExpressionSubscriber {
    public static final Companion Companion = new Companion(null);
    private u1 border;
    private float[] cornerRadii;
    private final Div2View divView;
    private boolean hasBorder;
    private boolean hasCustomShadow;
    private boolean hasDifferentCornerRadii;
    private boolean hasShadow;
    private float strokeWidth;
    private final View view;
    private final ClipParams clipParams = new ClipParams();
    private final Lazy borderParams$delegate = new bpn0(new gzs<BorderParams>() { // from class: com.yandex.div.core.view2.divs.widgets.DivBorderDrawer$borderParams$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xsna.gzs
        public final DivBorderDrawer.BorderParams invoke() {
            return DivBorderDrawer.this.new BorderParams();
        }
    });
    private final Lazy shadowParams$delegate = new bpn0(new gzs<ShadowParams>() { // from class: com.yandex.div.core.view2.divs.widgets.DivBorderDrawer$shadowParams$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xsna.gzs
        public final DivBorderDrawer.ShadowParams invoke() {
            return DivBorderDrawer.this.new ShadowParams();
        }
    });
    private final RoundedRectOutlineProvider outlineProvider = new RoundedRectOutlineProvider(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, null);
    private boolean needClipping = true;
    private final List<Disposable> subscriptions = new ArrayList();

    /* compiled from: DivBorderDrawer.kt */
    public final class BorderParams {
        private final float defaultDashWidth;
        private final float defaultGapWidth;
        private final float halfDp;
        private boolean isDashed;
        private final Paint paint;
        private final Path path;
        private final RectF rect;

        public BorderParams() {
            Paint paint = new Paint();
            this.paint = paint;
            this.path = new Path();
            this.halfDp = BaseDivViewExtensionsKt.dpToPxF(Double.valueOf(0.5d), DivBorderDrawer.this.getDisplayMetrics());
            this.defaultDashWidth = BaseDivViewExtensionsKt.dpToPxF(6, DivBorderDrawer.this.getDisplayMetrics());
            this.defaultGapWidth = BaseDivViewExtensionsKt.dpToPxF(2, DivBorderDrawer.this.getDisplayMetrics());
            this.rect = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
        }

        private final float calculatePerimeter(float f, float f2, float[] fArr) {
            float f3 = 2;
            float f4 = (f3 * f2) + (f * f3);
            if (fArr.length != 8) {
                KLog kLog = KLog.INSTANCE;
                if (kLog.isAtLeast(Severity.ERROR)) {
                    kLog.print(6, "DivBorderDrawer", h5s.c(fArr.length, ". Expected 8", new StringBuilder("Wrong corner radii count ")));
                }
                return f4;
            }
            int i = 0;
            int b = tyx.b(0, fArr.length - 1, 2);
            if (b >= 0) {
                while (true) {
                    float f5 = fArr[i];
                    f4 = ((f4 - f5) - fArr[i + 1]) + ((float) (Math.sqrt(((r2 * r2) + (f5 * f5)) / 8.0d) * 3.141592653589793d));
                    if (i == b) {
                        break;
                    }
                    i += 2;
                }
            }
            return f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f4;
        }

        private final DashPathEffect createDashPathEffect(float f) {
            float f2;
            float f3;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float f4 = this.defaultDashWidth;
                float f5 = this.defaultGapWidth;
                float f6 = f4 + f5;
                float f7 = (int) (f / f6);
                float f8 = f - (f6 * f7);
                f2 = (((f8 * f4) / f6) / f7) + f4;
                f3 = (((f8 * f5) / f6) / f7) + f5;
            } else {
                f2 = this.defaultDashWidth;
                f3 = this.defaultGapWidth;
            }
            return new DashPathEffect(new float[]{f2, f3}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        private final float getStrokeOffset() {
            return Math.min(this.halfDp, Math.max(1.0f, DivBorderDrawer.this.strokeWidth * 0.1f));
        }

        public final Paint getPaint() {
            return this.paint;
        }

        public final Path getPath() {
            return this.path;
        }

        public final void invalidate(float[] fArr) {
            float strokeOffset = (DivBorderDrawer.this.strokeWidth - getStrokeOffset()) / 2.0f;
            this.rect.set(strokeOffset, strokeOffset, DivBorderDrawer.this.view.getWidth() - strokeOffset, DivBorderDrawer.this.view.getHeight() - strokeOffset);
            this.path.reset();
            this.path.addRoundRect(this.rect, fArr, Path.Direction.CW);
            this.path.close();
            this.paint.setPathEffect(this.isDashed ? createDashPathEffect(calculatePerimeter(this.rect.width(), this.rect.height(), fArr)) : null);
        }

        public final void setDashed(boolean z) {
            this.isDashed = z;
        }

        public final void setPaintParams(float f, int i) {
            this.paint.setStrokeWidth(f + getStrokeOffset());
            this.paint.setColor(i);
        }
    }

    /* compiled from: DivBorderDrawer.kt */
    public final class ClipParams {
        private final Path path = new Path();
        private final RectF rect = new RectF();

        public ClipParams() {
        }

        public final Path getPath() {
            return this.path;
        }

        public final void invalidatePath(float[] fArr) {
            this.rect.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, DivBorderDrawer.this.view.getWidth(), DivBorderDrawer.this.view.getHeight());
            this.path.reset();
            if (fArr != null) {
                this.path.addRoundRect(this.rect, (float[]) fArr.clone(), Path.Direction.CW);
                this.path.close();
            }
        }
    }

    /* compiled from: DivBorderDrawer.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float clampCornerRadius(float f, float f2, float f3) {
            if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            float min = Math.min(f3, f2) / 2;
            if (f > min) {
                KLog kLog = KLog.INSTANCE;
                if (kLog.isAtLeast(Severity.WARNING)) {
                    kLog.print(5, "DivBorderDrawer", "Corner radius " + f + " is greater than half of the smallest side " + min);
                }
            }
            return Math.min(f, min);
        }

        private Companion() {
        }
    }

    /* compiled from: DivBorderDrawer.kt */
    public static final class RoundedRectOutlineProvider extends ViewOutlineProvider {
        private float cornerRadius;

        public /* synthetic */ RoundedRectOutlineProvider(float f, int i, zcl zclVar) {
            this((i & 1) != 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f);
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), DivBorderDrawer.Companion.clampCornerRadius(this.cornerRadius, view.getWidth(), view.getHeight()));
        }

        public final void setCornerRadius(float f) {
            this.cornerRadius = f;
        }

        public RoundedRectOutlineProvider(float f) {
            this.cornerRadius = f;
        }
    }

    /* compiled from: DivBorderDrawer.kt */
    public final class ShadowParams {
        private float alpha;
        private NinePatch cachedShadow;
        private int color;
        private final float defaultRadius;
        private float offsetX;
        private float offsetY;
        private final Paint paint;
        private float radius;
        private final Rect rect;

        public ShadowParams() {
            float dimension = DivBorderDrawer.this.view.getContext().getResources().getDimension(R$dimen.div_shadow_elevation);
            this.defaultRadius = dimension;
            this.radius = dimension;
            this.color = -16777216;
            this.alpha = 0.14f;
            this.paint = new Paint();
            this.rect = new Rect();
            this.offsetY = 0.5f;
        }

        public final NinePatch getCachedShadow() {
            return this.cachedShadow;
        }

        public final float getOffsetX() {
            return this.offsetX;
        }

        public final float getOffsetY() {
            return this.offsetY;
        }

        public final Paint getPaint() {
            return this.paint;
        }

        public final Rect getRect() {
            return this.rect;
        }

        public final void invalidateShadow(float[] fArr) {
            float f = 2;
            this.rect.set(0, 0, (int) ((this.radius * f) + DivBorderDrawer.this.view.getWidth()), (int) ((this.radius * f) + DivBorderDrawer.this.view.getHeight()));
            this.paint.setColor(this.color);
            this.paint.setAlpha((int) (DivBorderDrawer.this.view.getAlpha() * this.alpha * 255));
            this.cachedShadow = ShadowCache.INSTANCE.getShadow(fArr, this.radius, DivBorderDrawer.this.divView.getDiv2Component$div_release().getBitmapEffectHelper());
        }

        public final void set(n9 n9Var, ExpressionResolver expressionResolver) {
            jon jonVar;
            s3 s3Var;
            jon jonVar2;
            s3 s3Var2;
            Expression<Double> expression;
            Expression<Integer> expression2;
            Expression<Long> expression3;
            this.radius = (n9Var == null || (expression3 = n9Var.b) == null) ? this.defaultRadius : BaseDivViewExtensionsKt.dpToPxF(Long.valueOf(expression3.evaluate(expressionResolver).longValue()), DivBorderDrawer.this.getDisplayMetrics());
            this.color = (n9Var == null || (expression2 = n9Var.c) == null) ? -16777216 : expression2.evaluate(expressionResolver).intValue();
            this.alpha = (n9Var == null || (expression = n9Var.a) == null) ? 0.14f : (float) expression.evaluate(expressionResolver).doubleValue();
            this.offsetX = ((n9Var == null || (jonVar2 = n9Var.d) == null || (s3Var2 = jonVar2.a) == null) ? BaseDivViewExtensionsKt.dpToPx(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), r0) : BaseDivViewExtensionsKt.toPx(s3Var2, r0, expressionResolver)) - this.radius;
            this.offsetY = ((n9Var == null || (jonVar = n9Var.d) == null || (s3Var = jonVar.b) == null) ? BaseDivViewExtensionsKt.dpToPx(Float.valueOf(0.5f), r0) : BaseDivViewExtensionsKt.toPx(s3Var, r0, expressionResolver)) - this.radius;
        }
    }

    public DivBorderDrawer(Div2View div2View, View view) {
        this.divView = div2View;
        this.view = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c8, code lost:
    
        if ((r10.view.getParent() instanceof com.yandex.div.core.view2.divs.widgets.DivFrameLayout) == false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void applyBorder(u1 u1Var, ExpressionResolver expressionResolver) {
        boolean z;
        View view;
        View view2;
        Expression<Boolean> expression;
        boolean z2;
        va vaVar;
        va vaVar2;
        Expression<Integer> expression2;
        va vaVar3;
        DisplayMetrics displayMetrics = getDisplayMetrics();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float widthPx = (u1Var == null || (vaVar3 = u1Var.e) == null) ? 0.0f : DivBorderDrawerKt.widthPx(vaVar3, expressionResolver, displayMetrics);
        this.strokeWidth = widthPx;
        boolean z3 = true;
        boolean z4 = widthPx > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.hasBorder = z4;
        if (z4) {
            getBorderParams().setPaintParams(this.strokeWidth, (u1Var == null || (vaVar2 = u1Var.e) == null || (expression2 = vaVar2.a) == null) ? 0 : expression2.evaluate(expressionResolver).intValue());
            getBorderParams().setDashed(((u1Var == null || (vaVar = u1Var.e) == null) ? null : vaVar.b) instanceof xa.a);
        }
        float[] cornerRadii = u1Var != null ? DivUtilKt.getCornerRadii(u1Var, BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(this.view.getWidth()), displayMetrics), BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(this.view.getHeight()), displayMetrics), displayMetrics, expressionResolver) : null;
        this.cornerRadii = cornerRadii;
        if (cornerRadii != null) {
            float J = rl3.J(cornerRadii);
            int length = cornerRadii.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z2 = true;
                    break;
                } else {
                    if (!Float.valueOf(cornerRadii[i]).equals(Float.valueOf(J))) {
                        z2 = false;
                        break;
                    }
                    i++;
                }
            }
            z = !z2;
        } else {
            z = false;
        }
        this.hasDifferentCornerRadii = z;
        boolean z5 = this.hasCustomShadow;
        boolean booleanValue = (u1Var == null || (expression = u1Var.c) == null) ? false : expression.evaluate(expressionResolver).booleanValue();
        this.hasShadow = booleanValue;
        if (booleanValue) {
            if ((u1Var != null ? u1Var.d : null) == null) {
            }
            this.hasCustomShadow = z3;
            view = this.view;
            if (this.hasShadow && !z3) {
                f = view.getContext().getResources().getDimension(R$dimen.div_shadow_elevation);
            }
            view.setElevation(f);
            if (this.hasCustomShadow) {
                getShadowParams().set(u1Var != null ? u1Var.d : null, expressionResolver);
            }
            invalidateBorder();
            if (!this.hasCustomShadow || z5) {
                Object parent = this.view.getParent();
                view2 = parent instanceof View ? (View) parent : null;
                if (view2 == null) {
                    view2.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        z3 = false;
        this.hasCustomShadow = z3;
        view = this.view;
        if (this.hasShadow) {
            f = view.getContext().getResources().getDimension(R$dimen.div_shadow_elevation);
        }
        view.setElevation(f);
        if (this.hasCustomShadow) {
        }
        invalidateBorder();
        if (this.hasCustomShadow) {
        }
        Object parent2 = this.view.getParent();
        if (parent2 instanceof View) {
        }
        if (view2 == null) {
        }
    }

    private final void bindBorder(u1 u1Var, ExpressionResolver expressionResolver) {
        applyBorder(u1Var, expressionResolver);
        observeBorder(u1Var, expressionResolver);
    }

    private final BorderParams getBorderParams() {
        return (BorderParams) this.borderParams$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DisplayMetrics getDisplayMetrics() {
        return this.view.getResources().getDisplayMetrics();
    }

    private final ShadowParams getShadowParams() {
        return (ShadowParams) this.shadowParams$delegate.getValue();
    }

    private final void invalidateOutline() {
        if (shouldUseCanvasClipping()) {
            this.view.setClipToOutline(false);
            this.view.setOutlineProvider(shouldUseNinePatchShadows() ? null : ViewOutlineProvider.BACKGROUND);
            return;
        }
        float[] fArr = this.cornerRadii;
        float J = fArr != null ? rl3.J(fArr) : 0.0f;
        if (J == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.view.setClipToOutline(false);
            this.view.setOutlineProvider(shouldUseNinePatchShadows() ? null : ViewOutlineProvider.BACKGROUND);
        } else {
            this.outlineProvider.setCornerRadius(J);
            this.view.setOutlineProvider(this.outlineProvider);
            this.view.setClipToOutline(this.needClipping);
        }
    }

    private final void invalidatePaths() {
        float[] fArr;
        float[] fArr2 = this.cornerRadii;
        if (fArr2 == null || (fArr = (float[]) fArr2.clone()) == null) {
            return;
        }
        this.clipParams.invalidatePath(fArr);
        float f = this.strokeWidth / 2.0f;
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            fArr[i] = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fArr[i] - f);
        }
        if (this.hasBorder) {
            getBorderParams().invalidate(fArr);
        }
        if (this.hasCustomShadow) {
            getShadowParams().invalidateShadow(fArr);
        }
    }

    private final void observeBorder(final u1 u1Var, final ExpressionResolver expressionResolver) {
        jon jonVar;
        s3 s3Var;
        Expression<Double> expression;
        jon jonVar2;
        s3 s3Var2;
        Expression<DivSizeUnit> expression2;
        jon jonVar3;
        s3 s3Var3;
        Expression<Double> expression3;
        jon jonVar4;
        s3 s3Var4;
        Expression<DivSizeUnit> expression4;
        Expression<Integer> expression5;
        Expression<Long> expression6;
        Expression<Double> expression7;
        Expression<DivSizeUnit> expression8;
        Expression<Double> expression9;
        Expression<Integer> expression10;
        Expression<Long> expression11;
        Expression<Long> expression12;
        Expression<Long> expression13;
        Expression<Long> expression14;
        if (u1Var != null) {
            va vaVar = u1Var.e;
            y2 y2Var = u1Var.b;
            n9 n9Var = u1Var.d;
            if (DivDataExtensionsKt.isConstant(u1Var)) {
                return;
            }
            izs<? super Long, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.widgets.DivBorderDrawer$observeBorder$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                    invoke2(obj);
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object obj) {
                    DivBorderDrawer.this.applyBorder(u1Var, expressionResolver);
                    DivBorderDrawer.this.view.invalidate();
                }
            };
            Expression<Long> expression15 = u1Var.a;
            Disposable disposable = null;
            addSubscription(expression15 != null ? expression15.observe(expressionResolver, izsVar) : null);
            addSubscription((y2Var == null || (expression14 = y2Var.c) == null) ? null : expression14.observe(expressionResolver, izsVar));
            addSubscription((y2Var == null || (expression13 = y2Var.d) == null) ? null : expression13.observe(expressionResolver, izsVar));
            addSubscription((y2Var == null || (expression12 = y2Var.b) == null) ? null : expression12.observe(expressionResolver, izsVar));
            addSubscription((y2Var == null || (expression11 = y2Var.a) == null) ? null : expression11.observe(expressionResolver, izsVar));
            addSubscription(u1Var.c.observe(expressionResolver, izsVar));
            addSubscription((vaVar == null || (expression10 = vaVar.a) == null) ? null : expression10.observe(expressionResolver, izsVar));
            addSubscription((vaVar == null || (expression9 = vaVar.d) == null) ? null : expression9.observe(expressionResolver, izsVar));
            addSubscription((vaVar == null || (expression8 = vaVar.c) == null) ? null : expression8.observe(expressionResolver, izsVar));
            addSubscription((n9Var == null || (expression7 = n9Var.a) == null) ? null : expression7.observe(expressionResolver, izsVar));
            addSubscription((n9Var == null || (expression6 = n9Var.b) == null) ? null : expression6.observe(expressionResolver, izsVar));
            addSubscription((n9Var == null || (expression5 = n9Var.c) == null) ? null : expression5.observe(expressionResolver, izsVar));
            addSubscription((n9Var == null || (jonVar4 = n9Var.d) == null || (s3Var4 = jonVar4.a) == null || (expression4 = s3Var4.a) == null) ? null : expression4.observe(expressionResolver, izsVar));
            addSubscription((n9Var == null || (jonVar3 = n9Var.d) == null || (s3Var3 = jonVar3.a) == null || (expression3 = s3Var3.b) == null) ? null : expression3.observe(expressionResolver, izsVar));
            addSubscription((n9Var == null || (jonVar2 = n9Var.d) == null || (s3Var2 = jonVar2.b) == null || (expression2 = s3Var2.a) == null) ? null : expression2.observe(expressionResolver, izsVar));
            if (n9Var != null && (jonVar = n9Var.d) != null && (s3Var = jonVar.b) != null && (expression = s3Var.b) != null) {
                disposable = expression.observe(expressionResolver, izsVar);
            }
            addSubscription(disposable);
        }
    }

    private final boolean shouldUseCanvasClipping() {
        if (!this.needClipping) {
            return false;
        }
        if (this.divView.getForceCanvasClipping() || this.hasCustomShadow) {
            return true;
        }
        return (!this.hasShadow && (this.hasDifferentCornerRadii || this.hasBorder)) || TransientViewKt.isInTransientHierarchy(this.view);
    }

    private final boolean shouldUseNinePatchShadows() {
        return this.hasCustomShadow || TransientViewKt.isInTransientHierarchy(this.view);
    }

    public final void clipCorners(Canvas canvas) {
        if (shouldUseCanvasClipping()) {
            canvas.clipPath(this.clipParams.getPath());
        }
    }

    public final void drawBorder(Canvas canvas) {
        if (this.hasBorder) {
            canvas.drawPath(getBorderParams().getPath(), getBorderParams().getPaint());
        }
    }

    public final void drawShadow(Canvas canvas) {
        if ((!TransientViewKt.isInTransientHierarchy(this.view) || TransientViewKt.isInTransientHierarchy(this.view.getParent())) && this.hasCustomShadow) {
            float offsetX = getShadowParams().getOffsetX();
            float offsetY = getShadowParams().getOffsetY();
            int save = canvas.save();
            canvas.translate(offsetX, offsetY);
            try {
                NinePatch cachedShadow = getShadowParams().getCachedShadow();
                if (cachedShadow != null) {
                    cachedShadow.draw(canvas, getShadowParams().getRect(), getShadowParams().getPaint());
                }
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public List<Disposable> getSubscriptions() {
        return this.subscriptions;
    }

    public final void invalidateBorder() {
        invalidatePaths();
        invalidateOutline();
    }

    public final void onBoundsChanged(int i, int i2) {
        invalidateBorder();
    }

    public final void setBorder(u1 u1Var, ExpressionResolver expressionResolver) {
        if (DivDataExtensionsKt.equalsToConstant(u1Var, this.border)) {
            return;
        }
        release();
        this.border = u1Var;
        bindBorder(u1Var, expressionResolver);
    }

    public final void setNeedClipping(boolean z) {
        if (this.needClipping == z) {
            return;
        }
        this.needClipping = z;
        invalidateOutline();
        this.view.invalidate();
    }
}
