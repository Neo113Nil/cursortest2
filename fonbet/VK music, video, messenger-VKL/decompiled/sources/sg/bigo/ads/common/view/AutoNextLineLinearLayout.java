package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Hashtable;

/* loaded from: classes9.dex */
public class AutoNextLineLinearLayout extends LinearLayout {
    int a;
    int b;
    int c;
    int d;
    Hashtable e;

    public static class a {
        int a;
        int b;
        int c;
        int d;

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public AutoNextLineLinearLayout(Context context) {
        super(context);
        this.e = new Hashtable();
    }

    private int a(int i, int i2) {
        if (i <= 0) {
            return getPaddingLeft();
        }
        int i3 = i2 - 1;
        return getChildAt(i3).getMeasuredWidth() + a(i - 1, i3) + 30;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            a aVar = (a) this.e.get(childAt);
            if (aVar != null) {
                childAt.layout(aVar.a, aVar.b, aVar.c, aVar.d);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        byte b = 0;
        this.a = 0;
        this.b = 0;
        this.c = 5;
        this.d = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            childAt.measure(0, 0);
            int measuredWidth = childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int measuredHeight = childAt.getMeasuredHeight();
            i3 += measuredWidth;
            a aVar = new a(b);
            int a2 = a(i6 - i4, i6);
            this.a = a2;
            this.b = childAt.getMeasuredWidth() + a2;
            if (i3 >= size) {
                this.a = 0;
                this.b = childAt.getMeasuredWidth();
                this.c = i5 + measuredHeight + layoutParams.topMargin;
                i4 = i6;
                i3 = measuredWidth;
            }
            int measuredHeight2 = childAt.getMeasuredHeight() + this.c + layoutParams.bottomMargin;
            this.d = measuredHeight2;
            i5 = this.c;
            aVar.a = this.a;
            aVar.b = i5 + 3;
            aVar.c = this.b;
            aVar.d = measuredHeight2;
            this.e.put(childAt, aVar);
        }
        setMeasuredDimension(size, this.d);
    }

    public AutoNextLineLinearLayout(Context context, int i, int i2) {
        super(context);
        this.e = new Hashtable();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new LinearLayout.LayoutParams(0, 0);
    }

    public AutoNextLineLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new Hashtable();
    }
}
