package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.b;
import com.google.android.material.search.SearchView;
import com.yandex.div.core.view2.divs.tabs.a;
import com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout;
import com.yandex.div2.DivSize;
import java.util.List;

/* loaded from: classes11.dex */
public final /* synthetic */ class iy4 implements aa3, ruy, bx60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iy4(Object obj, int i, int i2) {
        this.c = obj;
        this.a = i;
        this.b = i2;
    }

    public int a(int i) {
        ViewGroup viewGroup;
        int measuredHeight;
        a aVar = ((g5n) this.c).a.a;
        w53 w53Var = aVar.h;
        if (aVar.m == null) {
            return -1;
        }
        ViewPagerFixedSizeLayout viewPagerFixedSizeLayout = aVar.e;
        int i2 = viewPagerFixedSizeLayout != null ? viewPagerFixedSizeLayout.get_collapsiblePaddingBottom() : 0;
        List c = aVar.m.c();
        if (i >= 0) {
            c.size();
        }
        g9l g9lVar = (g9l) c.get(i);
        kdl kdlVar = g9lVar.a;
        rvo rvoVar = g9lVar.c;
        DisplayMetrics displayMetrics = g9lVar.b;
        DivSize height = kdlVar.a.d().getHeight();
        Integer valueOf = height instanceof h9l ? Integer.valueOf(uml.p(height, displayMetrics, rvoVar, null)) : null;
        if (valueOf != null) {
            measuredHeight = valueOf.intValue();
        } else {
            i05 i05Var = (i05) w53Var.get(Integer.valueOf(i));
            if (i05Var == null) {
                ViewGroup viewGroup2 = (ViewGroup) aVar.a.b(aVar.i);
                i05 i05Var2 = new i05(aVar, viewGroup2, g9lVar, i);
                w53Var.put(Integer.valueOf(i), i05Var2);
                viewGroup = viewGroup2;
                i05Var = i05Var2;
            } else {
                viewGroup = i05Var.a;
            }
            i05Var.a();
            viewGroup.forceLayout();
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(this.a, 1073741824), uml.p(g9lVar.a.a.d().getHeight(), displayMetrics, rvoVar, null) == -1 ? this.b : View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight = viewGroup.getMeasuredHeight();
        }
        return measuredHeight + i2;
    }

    @Override // defpackage.aa3
    public euy apply(Object obj) {
        jn7 jn7Var = ((b) this.c).o;
        int i = this.a;
        int i2 = this.b;
        return ni91.f(new wm7(jn7Var.a(i, i2, 1), jn7Var.e, i2));
    }

    @Override // defpackage.ruy
    public void invoke(Object obj) {
        ((j42) obj).onSurfaceSizeChanged((h42) this.c, this.a, this.b);
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        n751 lambda$setUpDividerInsetListener$7;
        lambda$setUpDividerInsetListener$7 = SearchView.lambda$setUpDividerInsetListener$7((ViewGroup.MarginLayoutParams) this.c, this.a, this.b, view, n751Var);
        return lambda$setUpDividerInsetListener$7;
    }
}
