package com.yandex.div.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.mer;
import defpackage.ner;
import defpackage.ooc;
import defpackage.q5z;
import defpackage.qoi0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR*\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f\"\u0004\b \u0010!R\u0015\u0010#\u001a\u00020\u00078Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0016R+\u0010*\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00078V@VX\u0096\u008e\u0002¢\u0006\u0012\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010'*\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/yandex/div/internal/widget/SuperLineHeightTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lner;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "unit", "", "size", "Lzy11;", "setTextSize", "(IF)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "getCompoundPaddingTop", "()I", "getCompoundPaddingBottom", "Lmer;", "fixedLineHeightHelper", "Lmer;", "", "value", "isTightenWidth", "Z", "()Z", "setTightenWidth", "(Z)V", "getVisibleLineCount", "visibleLineCount", "<set-?>", "getFixedLineHeight", "setFixedLineHeight", "(I)V", "getFixedLineHeight$delegate", "(Lcom/yandex/div/internal/widget/SuperLineHeightTextView;)Ljava/lang/Object;", "fixedLineHeight", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class SuperLineHeightTextView extends AppCompatTextView implements ner {
    private final mer fixedLineHeightHelper;
    private boolean isTightenWidth;

    public /* synthetic */ SuperLineHeightTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private static Object getFixedLineHeight$delegate(SuperLineHeightTextView superLineHeightTextView) {
        MutablePropertyReference0Impl mutablePropertyReference0Impl = new MutablePropertyReference0Impl(superLineHeightTextView.fixedLineHeightHelper, mer.class, "lineHeight", "getLineHeight()I", 0);
        qoi0.a.getClass();
        return mutablePropertyReference0Impl;
    }

    private final int getVisibleLineCount() {
        return Math.min(getLineCount(), getMaxLines());
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        return super.getCompoundPaddingBottom() + this.fixedLineHeightHelper.c;
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        return super.getCompoundPaddingTop() + this.fixedLineHeightHelper.b;
    }

    public int getFixedLineHeight() {
        return this.fixedLineHeightHelper.d;
    }

    /* renamed from: isTightenWidth, reason: from getter */
    public final boolean getIsTightenWidth() {
        return this.isTightenWidth;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        mer merVar = this.fixedLineHeightHelper;
        int min = Math.min(getLineCount(), getMaxLines());
        int i = merVar.d;
        TextView textView = merVar.a;
        if (i != -1 && !q5z.I(heightMeasureSpec)) {
            int paddingBottom = textView.getPaddingBottom() + textView.getPaddingTop() + ooc.C(textView, min) + (min >= textView.getLineCount() ? merVar.b + merVar.c : 0);
            int minimumHeight = textView.getMinimumHeight();
            if (paddingBottom < minimumHeight) {
                paddingBottom = minimumHeight;
            }
            super.setMeasuredDimension(getMeasuredWidthAndState(), View.MeasureSpec.getMode(heightMeasureSpec) == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(Math.min(paddingBottom, View.MeasureSpec.getSize(heightMeasureSpec)), Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams != null && this.isTightenWidth && ((ViewGroup.MarginLayoutParams) divLayoutParams).width == -3 && divLayoutParams.getMaxWidth() != Integer.MAX_VALUE) {
            int lineCount = getLayout().getLineCount();
            float f = 0.0f;
            for (int i2 = 0; i2 < lineCount; i2++) {
                f = Math.max(f, getLayout().getLineWidth(i2));
            }
            int ceil = (int) Math.ceil(f + getCompoundPaddingRight() + getCompoundPaddingLeft());
            if (ceil < getMeasuredWidth()) {
                super.setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(ceil, View.MeasureSpec.getMode(getMeasuredWidthAndState())), getMeasuredHeightAndState());
            }
        }
    }

    @Override // defpackage.ner
    public void setFixedLineHeight(int i) {
        mer merVar = this.fixedLineHeightHelper;
        if (merVar.d == i) {
            return;
        }
        merVar.d = i;
        merVar.a(i);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextSize(int unit, float size) {
        super.setTextSize(unit, size);
        mer merVar = this.fixedLineHeightHelper;
        merVar.a(merVar.d);
    }

    public final void setTightenWidth(boolean z) {
        boolean z2 = this.isTightenWidth;
        this.isTightenWidth = z;
        if (z2 != z) {
            requestLayout();
        }
    }

    public SuperLineHeightTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SuperLineHeightTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public SuperLineHeightTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.fixedLineHeightHelper = new mer(this);
    }
}
