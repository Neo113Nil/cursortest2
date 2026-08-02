package com.yandex.go.due_timetable.presentation.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.nwy0;
import defpackage.qje;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.xng0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ShimmeringPaint;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0017\u0010\u0016J7\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010-\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u0014\u0010.\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010+R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"Lcom/yandex/go/due_timetable/presentation/widget/ShimmeringDueTimetableView;", "Landroid/view/View;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "", "horizontalOffset", "barValue", "Lzy11;", "drawBar", "(Landroid/graphics/Canvas;FF)V", "applyShimmeringColors", "()V", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "dispatchDraw", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "barValues", "Ljava/util/List;", "Lru/yandex/taxi/widget/ShimmeringPaint;", "shimmeringPaint", "Lru/yandex/taxi/widget/ShimmeringPaint;", "barWidth", "F", "barPadding", "barRadius", "barsWidth", "", "barCorners", "[F", "Landroid/graphics/Path;", "barPath", "Landroid/graphics/Path;", "Landroid/graphics/RectF;", "barRect", "Landroid/graphics/RectF;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShimmeringDueTimetableView extends View implements nwy0 {
    private final float[] barCorners;
    private final float barPadding;
    private final Path barPath;
    private final float barRadius;
    private final RectF barRect;
    private final List<Float> barValues;
    private final float barWidth;
    private final float barsWidth;
    private final ShimmeringPaint shimmeringPaint;

    public ShimmeringDueTimetableView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        List g = scc.g(49, 96, 32, 32, 128, 49, 22, 22, Integer.valueOf(HProv.PP_VERSION_TIMESTAMP));
        ArrayList arrayList = new ArrayList(tcc.n(g, 10));
        Iterator it = g.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((Number) it.next()).intValue() / 128.0f));
        }
        this.barValues = arrayList;
        this.shimmeringPaint = new ShimmeringPaint(context);
        float x = tje.x(context, 52.0f);
        this.barWidth = x;
        this.barPadding = tje.x(context, 2.0f);
        float x2 = tje.x(context, 8.0f);
        this.barRadius = x2;
        this.barsWidth = arrayList.size() * x;
        this.barCorners = new float[]{x2, x2, x2, x2, 0.0f, 0.0f, 0.0f, 0.0f};
        this.barPath = new Path();
        this.barRect = new RectF();
        applyShimmeringColors();
    }

    private final void applyShimmeringColors() {
        this.shimmeringPaint.setColors(qje.t(xng0.shimmeringCenterColor, getContext()), qje.t(xng0.bgMinor, getContext()));
    }

    private final void drawBar(Canvas canvas, float f, float f2) {
        this.barRect.set(this.barPadding + f, canvas.getHeight() - (canvas.getHeight() * f2), (f + this.barWidth) - this.barPadding, canvas.getHeight());
        this.barPath.reset();
        this.barPath.addRoundRect(this.barRect, this.barCorners, Path.Direction.CW);
        canvas.drawPath(this.barPath, this.shimmeringPaint);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        applyShimmeringColors();
        invalidate();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.shimmeringPaint.updateShimmering();
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = (getWidth() - this.barsWidth) / 2.0f;
        Iterator<T> it = this.barValues.iterator();
        while (it.hasNext()) {
            drawBar(canvas, width, ((Number) it.next()).floatValue());
            width += this.barWidth;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.shimmeringPaint.updateOffset(this);
    }

    public ShimmeringDueTimetableView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ShimmeringDueTimetableView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ShimmeringDueTimetableView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
