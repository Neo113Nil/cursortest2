package com.yandex.go.shortcuts.impl.view.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import defpackage.nwy0;
import defpackage.qje;
import defpackage.tje;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010#\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R*\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u0010+\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*¨\u0006."}, d2 = {"com/yandex/go/shortcuts/impl/view/adapter/PersonalSliderShortcutViewHolder$PersonalVerticalDotsIndicator", "Landroid/view/View;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lzy11;", "updateColors", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/graphics/Paint;", "defaultCirclePaint", "Landroid/graphics/Paint;", "selectedCirclePaint", "", "circlesIndentation", "F", "defaultCircleDiameter", "selectedCircleDiameter", "value", "count", CA20Status.STATUS_USER_I, "getCount", "()I", "setCount", "(I)V", "selected", "getSelected", "setSelected", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PersonalSliderShortcutViewHolder$PersonalVerticalDotsIndicator extends View implements nwy0 {
    private final float circlesIndentation;
    private int count;
    private final float defaultCircleDiameter;
    private final Paint defaultCirclePaint;
    private int selected;
    private final float selectedCircleDiameter;
    private final Paint selectedCirclePaint;

    public PersonalSliderShortcutViewHolder$PersonalVerticalDotsIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.defaultCirclePaint = new Paint(1);
        this.selectedCirclePaint = new Paint(1);
        this.circlesIndentation = tje.w(6, getContext());
        this.defaultCircleDiameter = tje.w(6, getContext());
        this.selectedCircleDiameter = tje.w(8, getContext());
        updateColors();
    }

    private final void updateColors() {
        this.defaultCirclePaint.setColor(qje.t(xng0.line, getContext()));
        this.selectedCirclePaint.setColor(qje.t(xng0.textMain, getContext()));
        invalidate();
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        updateColors();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getSelected() {
        return this.selected;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.count <= 0) {
            return;
        }
        float width = getWidth() / 2.0f;
        int i = this.count;
        float f = 0.0f;
        int i2 = 0;
        while (i2 < i) {
            boolean z = i2 == this.selected;
            float f2 = (z ? this.selectedCircleDiameter : this.defaultCircleDiameter) / 2.0f;
            Paint paint = z ? this.selectedCirclePaint : this.defaultCirclePaint;
            float f3 = this.circlesIndentation + f2 + f;
            canvas.drawCircle(width, f3, f2, paint);
            f = f3 + f2;
            i2++;
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        float f = this.selectedCircleDiameter;
        float f2 = this.circlesIndentation;
        int i = this.count;
        float f3 = this.defaultCircleDiameter;
        setMeasuredDimension((int) ((2.0f * f2) + f), (int) ((i * f2) + f2 + ((i * f3) - f3) + f));
    }

    public final void setCount(int i) {
        if (this.count != i) {
            this.count = i;
            requestLayout();
        }
    }

    public final void setSelected(int i) {
        if (this.selected != i) {
            this.selected = i;
            invalidate();
        }
    }

    public PersonalSliderShortcutViewHolder$PersonalVerticalDotsIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public PersonalSliderShortcutViewHolder$PersonalVerticalDotsIndicator(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public PersonalSliderShortcutViewHolder$PersonalVerticalDotsIndicator(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ PersonalSliderShortcutViewHolder$PersonalVerticalDotsIndicator(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
