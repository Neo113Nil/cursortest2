package com.yandex.go.feed.global.div.custom.time_slot_histogram;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import defpackage.eja1;
import defpackage.gtk;
import defpackage.hxy;
import defpackage.jl40;
import defpackage.mrg0;
import defpackage.n7z0;
import defpackage.o7z0;
import defpackage.qje;
import defpackage.tje;
import defpackage.u7z0;
import defpackage.up11;
import defpackage.usg0;
import defpackage.v7z0;
import defpackage.w511;
import defpackage.w7z0;
import defpackage.wuj0;
import defpackage.x7z0;
import defpackage.xng0;
import defpackage.zsk;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.widget.SingleShimmeringPaint;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u0013\u0010\u0010\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u0019J!\u0010\"\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u001a2\u0006\u0010!\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\tH\u0002¢\u0006\u0004\b$\u0010\u000eJ\u001f\u0010%\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u001a2\u0006\u0010!\u001a\u00020\u001a¢\u0006\u0004\b%\u0010#J\u0015\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020&¢\u0006\u0004\b+\u0010)J\u001d\u0010-\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\t2\b\u00103\u001a\u0004\u0018\u00010&¢\u0006\u0004\b4\u0010)J\u0017\u00106\u001a\u00020\t2\u0006\u00105\u001a\u00020\bH\u0014¢\u0006\u0004\b6\u0010\u000bJ/\u0010<\u001a\u00020\t2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u0002072\u0006\u0010;\u001a\u000207H\u0014¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\tH\u0014¢\u0006\u0004\b>\u0010\u000eJ\u0017\u0010?\u001a\u00020\t2\u0006\u00105\u001a\u00020\bH\u0014¢\u0006\u0004\b?\u0010\u000bJ7\u0010E\u001a\u00020\t2\u0006\u0010@\u001a\u00020\u00162\u0006\u0010A\u001a\u0002072\u0006\u0010B\u001a\u0002072\u0006\u0010C\u001a\u0002072\u0006\u0010D\u001a\u000207H\u0014¢\u0006\u0004\bE\u0010FR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010GR\u0014\u0010H\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010IR\u0014\u0010K\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010IR\u0014\u0010L\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010IR\u0014\u0010M\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010IR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010RR\u0014\u0010T\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010RR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010WR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010i\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010jR\u0016\u0010l\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010n\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010IR\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010oR\u0016\u0010*\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010oR\u0018\u0010q\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010sR\u0018\u0010u\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010w\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010vR\u0018\u0010x\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010vR\u0018\u0010y\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010vR\u0018\u0010z\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010oR\u0018\u0010|\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0019\u0010\u007f\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0017\u0010\u0083\u0001\u001a\u00020\u00118BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001¨\u0006\u0084\u0001"}, d2 = {"Lcom/yandex/go/feed/global/div/custom/time_slot_histogram/TimeSlotHistogramSlotView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Lgtk;", "divImageLoader", "<init>", "(Landroid/content/Context;Lgtk;)V", "Landroid/graphics/Canvas;", "Lzy11;", "drawAvailableBar", "(Landroid/graphics/Canvas;)V", "drawTopText", "updateTopTextLayout", "()V", "drawImageTag", "drawLabel", "", "oldValue", "newValue", "animateBarValue", "(FF)V", "", "selected", "animateBarSelection", "(Z)V", "Lw7z0;", ClidProvider.STATE, "updateBarColor", "(Lw7z0;)V", "updateLabelColor", "updateTopLabelColor", "oldState", "newState", "updateBarValue", "(Lw7z0;Lw7z0;)V", "applyShimmeringColors", "setSlotState", "", "label", "setLabel", "(Ljava/lang/String;)V", "topText", "setTopText", "animate", "setSelected", "(ZZ)V", "Ln7z0;", "configuration", "setDesignConfiguration", "(Ln7z0;)V", "url", "setImageUrl", "canvas", "onDraw", "", "width", "height", "oldWidth", "oldHeight", "onSizeChanged", "(IIII)V", "onDetachedFromWindow", "dispatchDraw", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Lgtk;", "barBottomOffset", "F", "barCornerRadius", "topTextBottomOffset", "imageTagBottomOffset", "imageTagSize", CA20Status.STATUS_USER_I, "defaultBarHeightFraction", "Landroid/graphics/Paint;", "focusedBarPaint", "Landroid/graphics/Paint;", "unfocusedBarPaint", "animatingBarPaint", "Landroid/text/TextPaint;", "labelPaint", "Landroid/text/TextPaint;", "topTextPaint", "Lru/yandex/taxi/widget/SingleShimmeringPaint;", "shimmeringPaint", "Lru/yandex/taxi/widget/SingleShimmeringPaint;", "", "barCorners", "[F", "Landroid/graphics/Path;", "barPath", "Landroid/graphics/Path;", "Landroid/graphics/RectF;", "barRect", "Landroid/graphics/RectF;", "Landroid/graphics/Rect;", "labelBoundsRect", "Landroid/graphics/Rect;", "Landroid/animation/ValueAnimator;", "barSelectionAnimator", "Landroid/animation/ValueAnimator;", "barValueAnimator", "slotState", "Lw7z0;", "barValue", "Ljava/lang/String;", "Landroid/text/StaticLayout;", "topTextLayout", "Landroid/text/StaticLayout;", "Z", "Lo7z0;", "foregroundColor", "Lo7z0;", "labelColor", "topLabelColor", "imageTintColor", "currentImageUrl", "Landroid/graphics/drawable/Drawable;", "imageUrlDrawable", "Landroid/graphics/drawable/Drawable;", "Lhxy;", "imageLoadRequest", "Lhxy;", "getMaxBarHeight", "()F", "maxBarHeight", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimeSlotHistogramSlotView extends View {
    private final Paint animatingBarPaint;
    private final float barBottomOffset;
    private final float barCornerRadius;
    private final float[] barCorners;
    private final Path barPath;
    private final RectF barRect;
    private ValueAnimator barSelectionAnimator;
    private float barValue;
    private ValueAnimator barValueAnimator;
    private String currentImageUrl;
    private final float defaultBarHeightFraction;
    private final gtk divImageLoader;
    private final Paint focusedBarPaint;
    private o7z0 foregroundColor;
    private hxy imageLoadRequest;
    private final float imageTagBottomOffset;
    private final int imageTagSize;
    private o7z0 imageTintColor;
    private Drawable imageUrlDrawable;
    private String label;
    private final Rect labelBoundsRect;
    private o7z0 labelColor;
    private final TextPaint labelPaint;
    private boolean selected;
    private final SingleShimmeringPaint shimmeringPaint;
    private w7z0 slotState;
    private o7z0 topLabelColor;
    private String topText;
    private final float topTextBottomOffset;
    private StaticLayout topTextLayout;
    private final TextPaint topTextPaint;
    private final Paint unfocusedBarPaint;

    public TimeSlotHistogramSlotView(Context context, gtk gtkVar) {
        super(context);
        this.divImageLoader = gtkVar;
        this.barBottomOffset = tje.x(context, 32.0f);
        float x = tje.x(context, 8.0f);
        this.barCornerRadius = x;
        this.topTextBottomOffset = tje.x(context, 12.0f);
        this.imageTagBottomOffset = tje.x(context, 14.0f);
        this.imageTagSize = (int) tje.x(context, 20.0f);
        Resources resources = context.getResources();
        int i = usg0.default_bar_height_fraction;
        ThreadLocal threadLocal = wuj0.a;
        this.defaultBarHeightFraction = resources.getFloat(i);
        this.focusedBarPaint = new Paint(1);
        this.unfocusedBarPaint = new Paint(1);
        this.animatingBarPaint = new Paint(1);
        TextPaint textPaint = new TextPaint();
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        textPaint.setTextSize(tje.r(mrg0.component_text_size_caption, getContext()));
        int[] iArr = up11.a;
        textPaint.setTypeface(eja1.w(3, 0));
        this.labelPaint = textPaint;
        TextPaint textPaint2 = new TextPaint();
        textPaint2.setTextAlign(align);
        textPaint2.setTextSize(tje.r(mrg0.component_text_size_caption, getContext()));
        textPaint2.setTypeface(eja1.w(3, 0));
        this.topTextPaint = textPaint2;
        SingleShimmeringPaint singleShimmeringPaint = new SingleShimmeringPaint(context);
        singleShimmeringPaint.setCenterOffset(0.5f);
        singleShimmeringPaint.setGradientWidth((int) tje.x(getContext(), 48.0f));
        singleShimmeringPaint.setDuration(1000L);
        this.shimmeringPaint = singleShimmeringPaint;
        this.barCorners = new float[]{x, x, x, x, 0.0f, 0.0f, 0.0f, 0.0f};
        this.barPath = new Path();
        this.barRect = new RectF();
        this.labelBoundsRect = new Rect();
        this.slotState = v7z0.a;
        this.label = "";
        this.topText = "";
        applyShimmeringColors();
        updateTopLabelColor(false);
    }

    private final void animateBarSelection(boolean selected) {
        this.animatingBarPaint.setColor(this.focusedBarPaint.getColor());
        float alpha = this.focusedBarPaint.getAlpha();
        float f = selected ? 0.0f : alpha;
        if (!selected) {
            alpha = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, alpha);
        ofFloat.setDuration(300L);
        ofFloat.setStartDelay(0L);
        ofFloat.addUpdateListener(new x7z0(this, 1));
        ofFloat.start();
        this.barSelectionAnimator = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateBarSelection$lambda$0$0(TimeSlotHistogramSlotView timeSlotHistogramSlotView, ValueAnimator valueAnimator) {
        timeSlotHistogramSlotView.animatingBarPaint.setAlpha((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
        timeSlotHistogramSlotView.invalidate();
    }

    private final void animateBarValue(float oldValue, float newValue) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(oldValue, newValue);
        ofFloat.setDuration(300L);
        ofFloat.setStartDelay(0L);
        ofFloat.addUpdateListener(new x7z0(this, 0));
        ofFloat.start();
        this.barValueAnimator = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateBarValue$lambda$0$0(TimeSlotHistogramSlotView timeSlotHistogramSlotView, ValueAnimator valueAnimator) {
        timeSlotHistogramSlotView.barValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        timeSlotHistogramSlotView.invalidate();
    }

    private final void applyShimmeringColors() {
        this.shimmeringPaint.setColors(qje.t(xng0.shimmeringCenterColor, getContext()), 0);
    }

    private final void drawAvailableBar(Canvas canvas) {
        float f;
        float maxBarHeight;
        w7z0 w7z0Var = this.slotState;
        if (w7z0Var instanceof v7z0) {
            f = this.defaultBarHeightFraction;
            maxBarHeight = getMaxBarHeight();
        } else if (!(w7z0Var instanceof u7z0)) {
            w511.b();
            return;
        } else {
            f = this.barValue;
            maxBarHeight = getMaxBarHeight();
        }
        this.barRect.set(getPaddingStart(), getMaxBarHeight() - (f * maxBarHeight), canvas.getWidth() - getPaddingEnd(), getMaxBarHeight());
        this.barPath.reset();
        this.barPath.addRoundRect(this.barRect, this.barCorners, Path.Direction.CW);
        canvas.drawPath(this.barPath, this.unfocusedBarPaint);
        ValueAnimator valueAnimator = this.barSelectionAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            canvas.drawPath(this.barPath, this.animatingBarPaint);
        } else if (this.selected) {
            canvas.drawPath(this.barPath, this.focusedBarPaint);
        }
        if (this.slotState instanceof v7z0) {
            canvas.drawPath(this.barPath, this.shimmeringPaint);
        }
    }

    private final void drawImageTag(Canvas canvas) {
        Drawable drawable = this.imageUrlDrawable;
        if (drawable == null) {
            return;
        }
        boolean z = this.selected;
        o7z0 o7z0Var = this.imageTintColor;
        Integer num = null;
        if (z) {
            if (o7z0Var != null) {
                num = o7z0Var.a;
            }
        } else if (o7z0Var != null) {
            num = o7z0Var.b;
        }
        if (num != null) {
            drawable.setTint(num.intValue());
        }
        int width = (canvas.getWidth() - this.imageTagSize) / 2;
        float height = (canvas.getHeight() - this.barBottomOffset) - this.imageTagBottomOffset;
        int i = this.imageTagSize;
        int i2 = (int) (height - i);
        drawable.setBounds(width, i2, width + i, i + i2);
        drawable.draw(canvas);
    }

    private final void drawLabel(Canvas canvas) {
        TextPaint textPaint = this.labelPaint;
        String str = this.label;
        textPaint.getTextBounds(str, 0, str.length(), this.labelBoundsRect);
        canvas.drawText(this.label, (canvas.getWidth() / 2.0f) - this.labelBoundsRect.left, (canvas.getHeight() - (this.barBottomOffset / 2.0f)) + (((this.labelPaint.descent() - this.labelPaint.ascent()) / 2.0f) - this.labelPaint.descent()), this.labelPaint);
    }

    private final void drawTopText(Canvas canvas) {
        StaticLayout staticLayout = this.topTextLayout;
        if (staticLayout == null) {
            return;
        }
        float height = ((canvas.getHeight() - this.barBottomOffset) - this.topTextBottomOffset) - staticLayout.getHeight();
        int save = canvas.save();
        canvas.translate(canvas.getWidth() / 2.0f, height);
        try {
            staticLayout.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    private final float getMaxBarHeight() {
        return getHeight() - this.barBottomOffset;
    }

    private final void updateBarColor(w7z0 state) {
        if (state instanceof v7z0) {
            Paint paint = this.focusedBarPaint;
            int t = qje.t(xng0.bgInvert, getContext());
            paint.setColor(Color.argb((int) (Color.alpha(t) * 0.6f), Color.red(t), Color.green(t), Color.blue(t)));
            this.unfocusedBarPaint.setColor(qje.t(xng0.controlMinor, getContext()));
            return;
        }
        if (!(state instanceof u7z0)) {
            w511.b();
            return;
        }
        o7z0 o7z0Var = this.foregroundColor;
        Integer num = o7z0Var != null ? o7z0Var.a : null;
        Integer num2 = o7z0Var != null ? o7z0Var.b : null;
        this.focusedBarPaint.setColor(num != null ? num.intValue() : qje.t(xng0.controlMain, getContext()));
        this.unfocusedBarPaint.setColor(num2 != null ? num2.intValue() : qje.t(xng0.controlMinor, getContext()));
    }

    private final void updateBarValue(w7z0 oldState, w7z0 newState) {
        ValueAnimator valueAnimator = this.barValueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z = newState instanceof u7z0;
        if (z && (oldState instanceof v7z0)) {
            animateBarValue(this.defaultBarHeightFraction, ((u7z0) newState).a);
            return;
        }
        if (z && (oldState instanceof u7z0)) {
            animateBarValue(((u7z0) oldState).a, ((u7z0) newState).a);
            return;
        }
        if (z) {
            this.barValue = ((u7z0) newState).a;
        } else if (newState instanceof v7z0) {
            this.barValue = 0.0f;
        } else {
            w511.b();
        }
    }

    private final void updateLabelColor(boolean selected) {
        Integer num;
        Integer num2;
        o7z0 o7z0Var = this.labelColor;
        this.labelPaint.setColor(selected ? (o7z0Var == null || (num2 = o7z0Var.a) == null) ? qje.t(xng0.textMain, getContext()) : num2.intValue() : (o7z0Var == null || (num = o7z0Var.b) == null) ? qje.t(xng0.textMinor, getContext()) : num.intValue());
    }

    private final void updateTopLabelColor(boolean selected) {
        Integer num;
        Integer num2;
        o7z0 o7z0Var = this.topLabelColor;
        this.topTextPaint.setColor(selected ? (o7z0Var == null || (num2 = o7z0Var.a) == null) ? qje.t(xng0.textMinor, getContext()) : num2.intValue() : (o7z0Var == null || (num = o7z0Var.b) == null) ? qje.t(xng0.textMinor, getContext()) : num.intValue());
    }

    private final void updateTopTextLayout() {
        StaticLayout staticLayout;
        if (this.topText.length() <= 0 || getWidth() == 0) {
            staticLayout = null;
        } else {
            String str = this.topText;
            staticLayout = StaticLayout.Builder.obtain(str, 0, str.length(), this.topTextPaint, getWidth()).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(true).build();
        }
        this.topTextLayout = staticLayout;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.slotState instanceof v7z0) {
            this.shimmeringPaint.updateShimmering();
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.barSelectionAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.barValueAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        hxy hxyVar = this.imageLoadRequest;
        if (hxyVar != null) {
            hxyVar.cancel();
        }
        this.imageLoadRequest = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawAvailableBar(canvas);
        drawTopText(canvas);
        drawImageTag(canvas);
        drawLabel(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (this.slotState instanceof v7z0) {
            this.shimmeringPaint.updateOffset(this);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
        super.onSizeChanged(width, height, oldWidth, oldHeight);
        updateTopTextLayout();
    }

    public final void setDesignConfiguration(n7z0 configuration) {
        this.foregroundColor = configuration != null ? configuration.a : null;
        this.labelColor = configuration != null ? configuration.b : null;
        this.topLabelColor = configuration != null ? configuration.c : null;
        this.imageTintColor = configuration != null ? configuration.d : null;
        updateBarColor(this.slotState);
        updateLabelColor(this.selected);
        updateTopLabelColor(this.selected);
        invalidate();
    }

    public final void setImageUrl(String url) {
        if (jl40.l(url, this.currentImageUrl)) {
            return;
        }
        this.currentImageUrl = url;
        hxy hxyVar = this.imageLoadRequest;
        if (hxyVar != null) {
            hxyVar.cancel();
        }
        this.imageLoadRequest = null;
        this.imageUrlDrawable = null;
        invalidate();
        if (url == null || url.length() == 0) {
            return;
        }
        this.imageLoadRequest = this.divImageLoader.loadImage(url, new zsk(2, this));
    }

    public final void setLabel(String label) {
        if (jl40.l(this.label, label)) {
            return;
        }
        this.label = label;
        invalidate();
    }

    public final void setSelected(boolean selected, boolean animate) {
        if (this.selected == selected) {
            return;
        }
        this.selected = selected;
        setSelected(selected);
        updateLabelColor(selected);
        updateTopLabelColor(selected);
        ValueAnimator valueAnimator = this.barSelectionAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (animate) {
            animateBarSelection(selected);
        }
        invalidate();
    }

    public final void setSlotState(w7z0 oldState, w7z0 newState) {
        this.slotState = newState;
        updateBarColor(newState);
        updateBarValue(oldState, newState);
        invalidate();
    }

    public final void setTopText(String topText) {
        if (jl40.l(this.topText, topText)) {
            return;
        }
        this.topText = topText;
        updateTopTextLayout();
        invalidate();
    }
}
