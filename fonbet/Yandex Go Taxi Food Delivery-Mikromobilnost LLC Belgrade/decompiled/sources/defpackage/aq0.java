package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.div.core.Div2Context;
import core.divkit.view.DivViewLayout;
import core.flex.ui.contentaware.ContentAwareFrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class aq0 {
    public final Object a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public aq0(Context context, Div2Context div2Context, l3k l3kVar) {
        ku2 ku2Var = new ku2(context, 6);
        ku2 ku2Var2 = new ku2(context, 7);
        xyi xyiVar = new xyi(29);
        this.a = div2Context;
        this.b = l3kVar;
        this.c = ku2Var;
        this.i = a(pch0.flexsdk_divkit_scaffold_background_view_id, true, false, 17, -1);
        this.f = b(this, pch0.flexsdk_divkit_scaffold_top_view_id, 49, 28);
        this.g = b(this, pch0.flexsdk_divkit_scaffold_bottom_view_id, 81, 28);
        this.h = b(this, pch0.flexsdk_divkit_scaffold_overlay_view_id, 17, 24);
        this.j = b(this, pch0.flexsdk_divkit_scaffold_left_landscape_view_id, 8388611, 8);
        this.k = b(this, pch0.flexsdk_divkit_scaffold_right_landscape_view_id, 8388613, 8);
        ContentAwareFrameLayout contentAwareFrameLayout = (ContentAwareFrameLayout) ku2Var2.invoke();
        contentAwareFrameLayout.setId(((Number) xyiVar.invoke()).intValue());
        contentAwareFrameLayout.setImportantForAccessibility(2);
        contentAwareFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.e = contentAwareFrameLayout;
        List A = j73.A(new ViewGroup[]{(DivViewLayout) this.h, (DivViewLayout) this.f, contentAwareFrameLayout, (DivViewLayout) this.g});
        ArrayList arrayList = new ArrayList();
        for (Object obj : A) {
            if (((ViewGroup) obj).getId() != -1) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ArrayList arrayList2 = new ArrayList();
            Object next = it.next();
            while (it.hasNext()) {
                Object next2 = it.next();
                View view = (View) next2;
                View view2 = (View) next;
                view2.setAccessibilityTraversalBefore(view.getId());
                view.setAccessibilityTraversalAfter(view2.getId());
                arrayList2.add(zy11.a);
                next = next2;
            }
        }
        ViewGroup viewGroup = (ViewGroup) ((ku2) this.c).invoke();
        viewGroup.setId(pch0.flexsdk_divkit_scaffold_container_id);
        viewGroup.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        DivViewLayout divViewLayout = (DivViewLayout) this.j;
        if (divViewLayout != null) {
            viewGroup.addView(divViewLayout);
        }
        DivViewLayout divViewLayout2 = (DivViewLayout) this.k;
        if (divViewLayout2 != null) {
            viewGroup.addView(divViewLayout2);
        }
        DivViewLayout divViewLayout3 = (DivViewLayout) this.i;
        if (divViewLayout3 != null) {
            viewGroup.addView(divViewLayout3);
        }
        ContentAwareFrameLayout contentAwareFrameLayout2 = (ContentAwareFrameLayout) this.e;
        if (contentAwareFrameLayout2 != null) {
            viewGroup.addView(contentAwareFrameLayout2);
        }
        DivViewLayout divViewLayout4 = (DivViewLayout) this.f;
        if (divViewLayout4 != null) {
            viewGroup.addView(divViewLayout4);
        }
        DivViewLayout divViewLayout5 = (DivViewLayout) this.g;
        if (divViewLayout5 != null) {
            viewGroup.addView(divViewLayout5);
        }
        DivViewLayout divViewLayout6 = (DivViewLayout) this.h;
        if (divViewLayout6 != null) {
            viewGroup.addView(divViewLayout6);
        }
        this.d = viewGroup;
    }

    public static /* synthetic */ DivViewLayout b(aq0 aq0Var, int i, int i2, int i3) {
        return aq0Var.a(i, false, (i3 & 16) != 0, i2, (i3 & 4) != 0 ? -2 : -1);
    }

    public DivViewLayout a(int i, boolean z, boolean z2, int i2, int i3) {
        DivViewLayout b = l3k.b((l3k) this.b, (Div2Context) this.a, new FrameLayout.LayoutParams(-1, i3, i2));
        b.getDivView().setId(i);
        if (!z2) {
            b.setImportantForAccessibility(2);
        }
        if (z) {
            b.setOnTouchListener(new avl());
        }
        return b;
    }

    public DivViewLayout c() {
        DivViewLayout divViewLayout = (DivViewLayout) this.i;
        if (divViewLayout != null) {
            return divViewLayout;
        }
        ny61.g("Required value was null.");
        return null;
    }

    public DivViewLayout d() {
        DivViewLayout divViewLayout = (DivViewLayout) this.g;
        if (divViewLayout != null) {
            return divViewLayout;
        }
        ny61.g("Required value was null.");
        return null;
    }

    public DivViewLayout e() {
        DivViewLayout divViewLayout = (DivViewLayout) this.j;
        if (divViewLayout != null) {
            return divViewLayout;
        }
        ny61.g("Required value was null.");
        return null;
    }

    public DivViewLayout f() {
        DivViewLayout divViewLayout = (DivViewLayout) this.h;
        if (divViewLayout != null) {
            return divViewLayout;
        }
        ny61.g("Required value was null.");
        return null;
    }

    public DivViewLayout g() {
        DivViewLayout divViewLayout = (DivViewLayout) this.k;
        if (divViewLayout != null) {
            return divViewLayout;
        }
        ny61.g("Required value was null.");
        return null;
    }

    public DivViewLayout h() {
        DivViewLayout divViewLayout = (DivViewLayout) this.f;
        if (divViewLayout != null) {
            return divViewLayout;
        }
        ny61.g("Required value was null.");
        return null;
    }

    public aq0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, eqh eqhVar, swo0 swo0Var, xvf0 xvf0Var4, xvf0 xvf0Var5, i020 i020Var, swo0 swo0Var2, xvf0 xvf0Var6, upj upjVar) {
        this.a = xvf0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
        this.d = eqhVar;
        this.h = swo0Var;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.i = i020Var;
        this.j = swo0Var2;
        this.g = xvf0Var6;
        this.k = upjVar;
    }

    public aq0(xvf0 xvf0Var, xvf0 xvf0Var2, qzb qzbVar, nma nmaVar, ove oveVar, npe0 npe0Var, swo0 swo0Var, zlf0 zlf0Var, sxn0 sxn0Var, rxm0 rxm0Var, xsi xsiVar) {
        this.a = xvf0Var;
        this.b = xvf0Var2;
        this.g = qzbVar;
        this.h = nmaVar;
        this.c = oveVar;
        this.d = npe0Var;
        this.e = swo0Var;
        this.i = zlf0Var;
        this.j = sxn0Var;
        this.f = rxm0Var;
        this.k = xsiVar;
    }

    public aq0(xvf0 xvf0Var, xvf0 xvf0Var2, x xVar, eqh eqhVar, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, aj0 aj0Var, xvf0 xvf0Var6, k220 k220Var, xvf0 xvf0Var7) {
        this.a = xvf0Var;
        this.b = xvf0Var2;
        this.c = xVar;
        this.d = eqhVar;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = xvf0Var5;
        this.h = aj0Var;
        this.i = xvf0Var6;
        this.j = k220Var;
        this.k = xvf0Var7;
    }
}
