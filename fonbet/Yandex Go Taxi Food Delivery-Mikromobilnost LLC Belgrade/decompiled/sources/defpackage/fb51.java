package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.pager.DivPagerPageLayout;
import com.yandex.div2.DivPager$ItemAlignment;

/* loaded from: classes11.dex */
public final class fb51 extends RecyclerView.d {
    public final int a;
    public final l2l b;
    public final DivPager$ItemAlignment c;

    public fb51(int i, l2l l2lVar, DivPager$ItemAlignment divPager$ItemAlignment) {
        this.a = i;
        this.b = l2lVar;
        this.c = divPager$ItemAlignment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        View child;
        float f;
        int b;
        int b2;
        int width = recyclerView.getWidth();
        l2l l2lVar = this.b;
        float f2 = l2lVar.c;
        float f3 = l2lVar.g;
        float f4 = l2lVar.h;
        view.measure(View.MeasureSpec.makeMeasureSpec(width - m810.b(f2 + l2lVar.e), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight() - m810.b(l2lVar.d + l2lVar.f), 1073741824));
        DivPagerPageLayout divPagerPageLayout = view instanceof DivPagerPageLayout ? (DivPagerPageLayout) view : null;
        if (divPagerPageLayout == null || (child = divPagerPageLayout.getChild()) == null) {
            return;
        }
        Integer num = l2lVar.i;
        int intValue = num != null ? num.intValue() : f(child);
        Integer num2 = l2lVar.j;
        DivPager$ItemAlignment divPager$ItemAlignment = this.c;
        int i = this.a;
        if (num2 != null) {
            b = num2.intValue();
        } else {
            int i2 = eb51.a[divPager$ItemAlignment.ordinal()];
            if (i2 == 1) {
                f = f3;
            } else if (i2 == 2) {
                f = (i - child.getMeasuredHeight()) / 2.0f;
            } else {
                if (i2 != 3) {
                    w511.b();
                    return;
                }
                f = (i - f4) - child.getMeasuredHeight();
            }
            b = m810.b(f);
        }
        Integer num3 = l2lVar.k;
        int intValue2 = num3 != null ? num3.intValue() : f(child);
        Integer num4 = l2lVar.l;
        if (num4 != null) {
            b2 = num4.intValue();
        } else {
            int i3 = eb51.a[divPager$ItemAlignment.ordinal()];
            if (i3 == 1) {
                f4 = (i - f3) - child.getMeasuredHeight();
            } else if (i3 == 2) {
                f4 = (i - child.getMeasuredHeight()) / 2.0f;
            } else if (i3 != 3) {
                w511.b();
                return;
            }
            b2 = m810.b(f4);
        }
        rect.set(intValue, b, intValue2, b2);
    }

    public final int f(View view) {
        float f;
        int measuredWidth;
        float f2;
        int i = eb51.a[this.c.ordinal()];
        l2l l2lVar = this.b;
        int i2 = this.a;
        if (i == 1) {
            f = i2 - l2lVar.g;
            measuredWidth = view.getMeasuredWidth();
        } else {
            if (i == 2) {
                f2 = (i2 - view.getMeasuredWidth()) / 2.0f;
                return m810.b(f2);
            }
            if (i != 3) {
                w511.b();
                return 0;
            }
            f = i2 - l2lVar.h;
            measuredWidth = view.getMeasuredWidth();
        }
        f2 = f - measuredWidth;
        return m810.b(f2);
    }
}
