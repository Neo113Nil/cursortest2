package com.yandex.go.ultima_mode.ui.progress_bar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import com.yandex.go.design.view.GoView;
import defpackage.qje;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u000b*\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u000b*\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J/\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000b2\b\b\u0001\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\u000b2\b\b\u0001\u0010\u001d\u001a\u00020\u00062\b\b\u0001\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u0010.\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010/R\u0016\u00101\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0014\u00104\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/yandex/go/ultima_mode/ui/progress_bar/SimpleProgressBarView;", "Lcom/yandex/go/design/view/GoView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lzy11;", "updatePaths", "()V", "Landroid/graphics/Path;", "updateBorderPath", "(Landroid/graphics/Path;)V", "updateFilledPath", "updateEmptyPath", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "", "progress", "setProgress", "(F)V", "filledPartColor", "emptyColor", "setColors", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "setAccessibilityDescription", "(Ljava/lang/String;)V", "F", "Landroid/graphics/Paint;", "emptyPaint", "Landroid/graphics/Paint;", "fillPaint", "borderPath", "Landroid/graphics/Path;", "filledPartPath", "emptyPartPath", "getEndRadius", "()F", "endRadius", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SimpleProgressBarView extends GoView {
    private final Path borderPath;
    private final Paint emptyPaint;
    private Path emptyPartPath;
    private final Paint fillPaint;
    private Path filledPartPath;
    private float progress;

    public SimpleProgressBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.progress = 0.5f;
        Paint paint = new Paint();
        paint.setColor(qje.t(xng0.controlMinor, getContext()));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.emptyPaint = paint;
        Paint paint2 = new Paint();
        paint2.setColor(qje.t(xng0.controlMain, getContext()));
        paint2.setStyle(style);
        this.fillPaint = paint2;
        this.borderPath = new Path();
        this.filledPartPath = new Path();
        this.emptyPartPath = new Path();
        setImportantForAccessibility(2);
    }

    private final float getEndRadius() {
        return getHeight() / 2.0f;
    }

    private final void updateBorderPath(Path path) {
        path.reset();
        path.addArc(getWidth() - (getEndRadius() * 2.0f), 0.0f, getWidth(), getHeight(), -90.0f, 180.0f);
        path.addArc(0.0f, 0.0f, 2.0f * getEndRadius(), getHeight(), 90.0f, 180.0f);
        path.addRect(getEndRadius(), 0.0f, getWidth() - getEndRadius(), getHeight(), Path.Direction.CW);
        path.close();
    }

    private final void updateEmptyPath(Path path) {
        path.reset();
        path.addRect(getWidth() * this.progress, 0.0f, getWidth(), getHeight(), Path.Direction.CW);
        path.op(this.borderPath, Path.Op.INTERSECT);
    }

    private final void updateFilledPath(Path path) {
        path.reset();
        path.addRect(0.0f, 0.0f, getWidth() * this.progress, getHeight(), Path.Direction.CW);
        path.op(this.borderPath, Path.Op.INTERSECT);
    }

    private final void updatePaths() {
        updateBorderPath(this.borderPath);
        updateFilledPath(this.filledPartPath);
        updateEmptyPath(this.emptyPartPath);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.filledPartPath, this.fillPaint);
        canvas.drawPath(this.emptyPartPath, this.emptyPaint);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        updatePaths();
    }

    public final void setAccessibilityDescription(String description) {
        setContentDescription(description);
        setImportantForAccessibility(1);
    }

    public final void setColors(int filledPartColor, int emptyColor) {
        this.fillPaint.setColor(filledPartColor);
        this.emptyPaint.setColor(emptyColor);
        invalidate();
    }

    public final void setProgress(float progress) {
        if (this.progress == progress) {
            return;
        }
        this.progress = progress;
        updatePaths();
    }

    public SimpleProgressBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public SimpleProgressBarView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public SimpleProgressBarView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ SimpleProgressBarView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
