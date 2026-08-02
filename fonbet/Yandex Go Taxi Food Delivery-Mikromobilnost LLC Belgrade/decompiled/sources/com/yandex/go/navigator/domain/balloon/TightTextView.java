package com.yandex.go.navigator.domain.balloon;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.t5w;
import defpackage.y6i0;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/go/navigator/domain/balloon/TightTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public class TightTextView extends AppCompatTextView {
    public static final int $stable = 8;

    public TightTextView(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int lineCount;
        Float valueOf;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824 || (lineCount = getLayout().getLineCount()) <= 1) {
            return;
        }
        Iterator it = y6i0.n(0, lineCount).iterator();
        if (it.hasNext()) {
            t5w t5wVar = (t5w) it;
            float lineWidth = getLayout().getLineWidth(t5wVar.nextInt());
            while (it.hasNext()) {
                lineWidth = Math.max(lineWidth, getLayout().getLineWidth(t5wVar.nextInt()));
            }
            valueOf = Float.valueOf(lineWidth);
        } else {
            valueOf = null;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft() + ((int) valueOf.floatValue());
        if (paddingRight < getMeasuredWidth()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight, Integer.MIN_VALUE), heightMeasureSpec);
        }
    }

    public TightTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TightTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
