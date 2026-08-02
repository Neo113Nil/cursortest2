package com.yandex.go.taxi.order.details.v2.ui.view.item.progress_bar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.yandex.div.state.db.StateEntry;
import com.yandex.go.design.view.GoView;
import com.yandex.payment.common.result.ResultType;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.cn91;
import defpackage.gif0;
import defpackage.hif0;
import defpackage.i3y;
import defpackage.kdc;
import defpackage.r0d0;
import defpackage.s8o;
import defpackage.tje;
import defpackage.uc2;
import defpackage.xw31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0017\b\u0007\u0018\u0000 T2\u00020\u0001:\u0001UB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001b\u0010\fJ-\u0010 \u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u001e¢\u0006\u0004\b&\u0010$J\u0017\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010,R\u0016\u00104\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010,R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R$\u0010:\u001a\u0002082\u0006\u00109\u001a\u0002088\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0014\u0010>\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010;R\"\u0010@\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0016\u0010\u001c\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010FR\u0016\u0010\u001d\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010FR.\u0010G\u001a\u0004\u0018\u00010\u00132\b\u00109\u001a\u0004\u0018\u00010\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010\u0016R#\u0010Q\u001a\n L*\u0004\u0018\u000105058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0016\u0010R\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010;R\u0014\u0010S\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u00102¨\u0006V"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/progress_bar/ProgressBarView;", "Lcom/yandex/go/design/view/GoView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "setProgressOnStart", "()V", "setProgressOnFinish", "", "currentTime", "startAnimation", "(J)V", "updateAnimation", "Lkdc;", "color", "setColorInternal", "(Lkdc;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onDetachedFromWindow", "startTime", "finishTime", "", "canUpdate", "start", "(JJZJ)V", ResultType.RESULT_TYPE_LOADING, "setLoading", "(Z)V", "isIncrease", "setIncrease", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "isRtl", "Z", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/graphics/Path;", StateEntry.COLUMN_PATH, "Landroid/graphics/Path;", "isLoading", "shouldIncrease", "Landroid/animation/ValueAnimator;", "animator", "Landroid/animation/ValueAnimator;", "", "value", "progressFraction", "F", "setProgressFraction", "(F)V", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "", "strokeCornerRadius", "[F", "getStrokeCornerRadius", "()[F", "setStrokeCornerRadius", "([F)V", "J", "strokeColorAttr", "Lkdc;", "getStrokeColorAttr", "()Lkdc;", "setStrokeColorAttr", "kotlin.jvm.PlatformType", "loadingAnimator$delegate", "Li3y;", "getLoadingAnimator", "()Landroid/animation/ValueAnimator;", "loadingAnimator", "indeterminatedProgress", "trackPath", "Companion", "hif0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ProgressBarView extends GoView {
    public static final int $stable = 8;
    public static final hif0 Companion = new hif0();
    private static final long LOADING_ANIMATION_DURATION = 1500;
    private static final float LOADING_SEGMENT_MIN_VISIBLE_PERCENT = 0.05f;
    private static final float LOADING_SEGMENT_SIZE = 0.5f;
    private static final long PROGRESS_UPDATE_ANIMATION_DURATION_MS = 500;
    private ValueAnimator animator;
    private final float cornerRadius;
    private long finishTime;
    private float indeterminatedProgress;
    private boolean isLoading;
    private final boolean isRtl;

    /* renamed from: loadingAnimator$delegate, reason: from kotlin metadata */
    private final i3y loadingAnimator;
    private final Paint paint;
    private final Path path;
    private float progressFraction;
    private boolean shouldIncrease;
    private long startTime;
    private kdc strokeColorAttr;
    private float[] strokeCornerRadius;
    private final Path trackPath;

    public ProgressBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        this.isRtl = xw31.n(context);
        this.paint = new Paint(1);
        this.path = new Path();
        this.shouldIncrease = true;
        float u = tje.u(10, getContext());
        this.cornerRadius = u;
        this.strokeCornerRadius = new float[]{0.0f, 0.0f, u, u, u, u, 0.0f, 0.0f};
        this.loadingAnimator = a.a(new r0d0(27, this));
        this.trackPath = new Path();
        setMinimumHeight(tje.u(4, getContext()));
    }

    private final ValueAnimator getLoadingAnimator() {
        return (ValueAnimator) this.loadingAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ValueAnimator loadingAnimator_delegate$lambda$0(ProgressBarView progressBarView) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(1500L);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new gif0(progressBarView, 2));
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadingAnimator_delegate$lambda$0$0$0(ProgressBarView progressBarView, ValueAnimator valueAnimator) {
        progressBarView.indeterminatedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        progressBarView.invalidate();
    }

    private final void setColorInternal(kdc color) {
        if (color != null) {
            this.paint.setColor(s8o.m(color, getContext()));
            invalidate();
        }
    }

    private final void setProgressFraction(float f) {
        this.progressFraction = f;
        invalidate();
    }

    private final void setProgressOnFinish() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        setProgressFraction(1.0f);
    }

    private final void setProgressOnStart() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        setProgressFraction(0.0f);
    }

    private final void startAnimation(long currentTime) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        long j = this.finishTime;
        long j2 = this.startTime;
        ValueAnimator duration = ValueAnimator.ofFloat((currentTime - j2) / (j - j2), 1.0f).setDuration(this.finishTime - currentTime);
        duration.setInterpolator(new LinearInterpolator());
        duration.addUpdateListener(new gif0(this, 0));
        duration.start();
        this.animator = duration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimation$lambda$0$0(ProgressBarView progressBarView, ValueAnimator valueAnimator) {
        progressBarView.setProgressFraction(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private final void updateAnimation(long currentTime) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        long j = this.finishTime;
        long j2 = this.startTime;
        ValueAnimator duration = ValueAnimator.ofFloat(this.progressFraction, (currentTime - j2) / (j - j2)).setDuration(500L);
        duration.setInterpolator(new LinearInterpolator());
        duration.addUpdateListener(new gif0(this, 1));
        cn91.f(duration, new uc2(this, currentTime, 2));
        duration.start();
        this.animator = duration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateAnimation$lambda$0$0(ProgressBarView progressBarView, ValueAnimator valueAnimator) {
        progressBarView.setProgressFraction(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 updateAnimation$lambda$0$1(ProgressBarView progressBarView, long j) {
        progressBarView.startAnimation(j);
        return zy11.a;
    }

    @Override // com.yandex.go.design.view.GoView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        setColorInternal(this.strokeColorAttr);
    }

    public final kdc getStrokeColorAttr() {
        return this.strokeColorAttr;
    }

    public final float[] getStrokeCornerRadius() {
        return this.strokeCornerRadius;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = getPaddingRight();
        float paddingBottom = getPaddingBottom();
        float width = getWidth();
        float height = getHeight();
        float f = (width - paddingLeft) - paddingRight;
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = height - paddingBottom;
        boolean z = this.isLoading;
        boolean z2 = this.isRtl;
        if (!z) {
            if (z2) {
                canvas.scale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
            }
            boolean z3 = this.shouldIncrease;
            float f3 = this.progressFraction;
            float f4 = z3 ? f * f3 : f * (1.0f - f3);
            this.path.reset();
            this.path.addRoundRect(paddingLeft, paddingTop, f4, f2, this.strokeCornerRadius, Path.Direction.CW);
            canvas.drawPath(this.path, this.paint);
            return;
        }
        if (z2) {
            canvas.scale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
        }
        float f5 = paddingLeft + f;
        float f6 = f * 0.5f;
        float f7 = f6 >= 1.0f ? f6 : 1.0f;
        float f8 = paddingLeft - (0.95f * f7);
        float f9 = f8 + (((f5 - (LOADING_SEGMENT_MIN_VISIBLE_PERCENT * f7)) - f8) * this.indeterminatedProgress);
        float f10 = f7 + f9;
        this.trackPath.reset();
        Path path = this.trackPath;
        float[] fArr = this.strokeCornerRadius;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(paddingLeft, paddingTop, f5, f2, fArr, direction);
        Path path2 = this.trackPath;
        int save = canvas.save();
        canvas.clipPath(path2);
        try {
            this.path.reset();
            this.path.addRoundRect(f9, paddingTop, f10, f2, this.strokeCornerRadius, direction);
            canvas.drawPath(this.path, this.paint);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final void setIncrease(boolean isIncrease) {
        if (this.shouldIncrease != isIncrease) {
            this.shouldIncrease = isIncrease;
            invalidate();
        }
    }

    public final void setLoading(boolean loading) {
        if (this.isLoading == loading) {
            return;
        }
        this.isLoading = loading;
        if (loading) {
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            getLoadingAnimator().start();
        } else {
            getLoadingAnimator().cancel();
        }
        invalidate();
    }

    public final void setStrokeColorAttr(kdc kdcVar) {
        this.strokeColorAttr = kdcVar;
        setColorInternal(kdcVar);
    }

    public final void setStrokeCornerRadius(float[] fArr) {
        this.strokeCornerRadius = fArr;
    }

    public final void start(long startTime, long finishTime, boolean canUpdate, long currentTime) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z = (this.startTime == startTime && this.finishTime == finishTime) ? false : true;
        this.startTime = startTime;
        this.finishTime = finishTime;
        setLoading(false);
        if (startTime > currentTime) {
            setProgressOnStart();
            return;
        }
        if (currentTime >= finishTime) {
            setProgressOnFinish();
            return;
        }
        if (z && (valueAnimator2 = this.animator) != null && valueAnimator2.isStarted() && canUpdate) {
            updateAnimation(currentTime);
        } else if (z || (valueAnimator = this.animator) == null || !(valueAnimator == null || valueAnimator.isStarted())) {
            startAnimation(currentTime);
        }
    }

    public ProgressBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ProgressBarView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ProgressBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
