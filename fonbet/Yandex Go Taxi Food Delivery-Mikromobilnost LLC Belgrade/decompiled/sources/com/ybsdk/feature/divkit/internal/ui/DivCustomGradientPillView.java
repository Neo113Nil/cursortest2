package com.ybsdk.feature.divkit.internal.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.m810;
import defpackage.rlk;
import defpackage.tcc;
import defpackage.y6i0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001c\u0010\u0010R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-¨\u0006/"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/ui/DivCustomGradientPillView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "rebuildShaders", "()V", "Landroid/graphics/Canvas;", "canvas", "drawCapsuleGradient", "(Landroid/graphics/Canvas;)V", "", "Lrlk;", "colorStops", "updateBackgroundGradient", "(Ljava/util/List;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "onDraw", "Landroid/graphics/Paint;", "gradientPaint", "Landroid/graphics/Paint;", "Landroid/graphics/Path;", "capsulePath", "Landroid/graphics/Path;", "Ljava/util/List;", "Landroid/graphics/RadialGradient;", "leftCapShader", "Landroid/graphics/RadialGradient;", "rightCapShader", "Landroid/graphics/LinearGradient;", "topMiddleShader", "Landroid/graphics/LinearGradient;", "bottomMiddleShader", "leftBoundaryPx", CA20Status.STATUS_USER_I, "rightBoundaryPx", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DivCustomGradientPillView extends FrameLayout {
    private LinearGradient bottomMiddleShader;
    private final Path capsulePath;
    private List<rlk> colorStops;
    private final Paint gradientPaint;
    private int leftBoundaryPx;
    private RadialGradient leftCapShader;
    private int rightBoundaryPx;
    private RadialGradient rightCapShader;
    private LinearGradient topMiddleShader;

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.valueOf(((rlk) obj).b).compareTo(Float.valueOf(((rlk) obj2).b));
        }
    }

    public DivCustomGradientPillView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setDither(true);
        this.gradientPaint = paint;
        this.capsulePath = new Path();
        this.colorStops = EmptyList.a;
        setWillNotDraw(false);
    }

    private final void drawCapsuleGradient(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int i = this.leftBoundaryPx;
        int i2 = this.rightBoundaryPx;
        float f = height;
        float f2 = f / 2.0f;
        this.gradientPaint.setShader(this.leftCapShader);
        float f3 = i;
        canvas.drawRect(0.0f, 0.0f, f3, f, this.gradientPaint);
        if (i2 > i) {
            this.gradientPaint.setShader(this.topMiddleShader);
            float f4 = i2;
            canvas.drawRect(f3, 0.0f, f4, f2, this.gradientPaint);
            this.gradientPaint.setShader(this.bottomMiddleShader);
            canvas.drawRect(f3, f2, f4, f, this.gradientPaint);
        }
        this.gradientPaint.setShader(this.rightCapShader);
        canvas.drawRect(i2, 0.0f, width, f, this.gradientPaint);
        this.gradientPaint.setShader(null);
    }

    private final void rebuildShaders() {
        List<rlk> list = this.colorStops;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((rlk) it.next()).a.get(getContext())));
        }
        int[] I0 = kotlin.collections.a.I0(arrayList);
        List<rlk> list2 = this.colorStops;
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(((rlk) it2.next()).b));
        }
        float[] G0 = kotlin.collections.a.G0(arrayList2);
        if (getWidth() <= 0 || getHeight() <= 0 || I0.length == 0) {
            return;
        }
        float width = getWidth();
        float height = getHeight();
        float f = height / 2.0f;
        this.leftBoundaryPx = m810.b(f);
        int width2 = getWidth();
        int i = this.leftBoundaryPx;
        int i2 = width2 - i;
        this.rightBoundaryPx = i2;
        float f2 = i;
        float f3 = i2;
        this.capsulePath.reset();
        this.capsulePath.addRoundRect(0.0f, 0.0f, width, height, f, f, Path.Direction.CW);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.leftCapShader = new RadialGradient(f2, f, f2, I0, G0, tileMode);
        this.rightCapShader = new RadialGradient(f3, f, getWidth() - f3, I0, G0, tileMode);
        this.topMiddleShader = new LinearGradient(0.0f, f, 0.0f, 0.0f, I0, G0, tileMode);
        this.bottomMiddleShader = new LinearGradient(0.0f, f, 0.0f, height, I0, G0, tileMode);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.colorStops.isEmpty() || this.leftCapShader == null || this.rightCapShader == null || this.topMiddleShader == null || this.bottomMiddleShader == null) {
            return;
        }
        Path path = this.capsulePath;
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            drawCapsuleGradient(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        rebuildShaders();
    }

    public final void updateBackgroundGradient(List<rlk> colorStops) {
        List<rlk> list = colorStops;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (rlk rlkVar : list) {
            arrayList.add(new rlk(y6i0.c(rlkVar.b, 0.0f, 1.0f), rlkVar.a));
        }
        this.colorStops = kotlin.collections.a.x0(arrayList, new a());
        rebuildShaders();
        invalidate();
    }

    public DivCustomGradientPillView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DivCustomGradientPillView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public DivCustomGradientPillView(Context context) {
        this(context, null, 0, 6, null);
    }
}
