package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class kdy0 extends ViewGroup {
    public final TextView b;
    public final x9z0 c;
    public final int d;
    public final int e;

    public kdy0(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.b = textView;
        x9z0 x9z0Var = new x9z0(context);
        this.c = x9z0Var;
        x9z0Var.setLines(1);
        textView.setTextSize(2, 18.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setTextColor(-1);
        this.d = (int) tj0.a(1, 4, context);
        this.e = (int) tj0.a(1, 2, context);
        c1z0.n(textView, "title_text");
        c1z0.n(x9z0Var, "age_bordering");
        addView(textView);
        addView(x9z0Var);
    }

    @NonNull
    public TextView getLeftText() {
        return this.b;
    }

    @NonNull
    public x9z0 getRightBorderedView() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView = this.b;
        int measuredWidth = textView.getMeasuredWidth();
        int measuredHeight = textView.getMeasuredHeight();
        x9z0 x9z0Var = this.c;
        int measuredWidth2 = x9z0Var.getMeasuredWidth();
        int measuredHeight2 = x9z0Var.getMeasuredHeight();
        int measuredHeight3 = getMeasuredHeight();
        int i5 = (measuredHeight3 - measuredHeight) / 2;
        int i6 = (measuredHeight3 - measuredHeight2) / 2;
        int i7 = this.d + measuredWidth;
        textView.layout(0, i5, measuredWidth, measuredHeight + i5);
        x9z0Var.layout(i7, i6, measuredWidth2 + i7, measuredHeight2 + i6);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int i3 = this.e;
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - (i3 * 2), Integer.MIN_VALUE);
        x9z0 x9z0Var = this.c;
        x9z0Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int i4 = size / 2;
        if (x9z0Var.getMeasuredWidth() > i4) {
            x9z0Var.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2 - (i3 * 2), Integer.MIN_VALUE));
        }
        int measuredWidth = size - x9z0Var.getMeasuredWidth();
        int i5 = this.d;
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth - i5, Integer.MIN_VALUE);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2 - (i3 * 2), Integer.MIN_VALUE);
        TextView textView = this.b;
        textView.measure(makeMeasureSpec3, makeMeasureSpec4);
        setMeasuredDimension(x9z0Var.getMeasuredWidth() + textView.getMeasuredWidth() + i5, Math.max(textView.getMeasuredHeight(), x9z0Var.getMeasuredHeight()));
    }
}
