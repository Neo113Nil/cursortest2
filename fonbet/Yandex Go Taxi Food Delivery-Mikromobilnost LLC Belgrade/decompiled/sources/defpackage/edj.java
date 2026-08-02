package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.b;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public final class edj extends AccessibilityDelegateCompat {
    public static final /* synthetic */ int x = 0;
    public final ViewGroup a;
    public final List b;
    public final ArrayList c = new ArrayList();
    public final WeakHashMap w = new WeakHashMap();

    public edj(ViewGroup viewGroup, List list) {
        this.a = viewGroup;
        this.b = list;
        b.p(viewGroup, this);
        viewGroup.setImportantForAccessibility(1);
    }

    public final View a(View view) {
        while (view != null && !jl40.l(view.getParent(), this.a) && !this.c.contains(view)) {
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View] */
    public final boolean b(boolean z) {
        ViewGroup viewGroup = this.a;
        edj edjVar = null;
        while (true) {
            Object parent = viewGroup.getParent();
            ViewGroup viewGroup2 = parent instanceof View ? (View) parent : null;
            if (viewGroup2 != null) {
                Object tag = viewGroup2.getTag(ndh0.dialog_container_accessibility_delegate);
                edjVar = tag instanceof edj ? (edj) tag : null;
                if (!(viewGroup2.getParent() instanceof View) || edjVar != null) {
                    break;
                }
                viewGroup = viewGroup2;
            } else {
                break;
            }
        }
        if (edjVar == null) {
            return false;
        }
        if (z) {
            edjVar.d(viewGroup);
            return true;
        }
        edjVar.c(viewGroup);
        return true;
    }

    public final void c(View view) {
        View a = a(view);
        if (a != null) {
            ArrayList arrayList = this.c;
            if (arrayList.contains(a)) {
                arrayList.remove(view);
                e();
                if (b(false)) {
                    return;
                }
                ViewGroup viewGroup = this.a;
                if (!viewGroup.hasWindowFocus() || viewGroup.getRootView() == null) {
                    return;
                }
                viewGroup.getRootView().sendAccessibilityEvent(32);
            }
        }
    }

    public final void d(View view) {
        View a = a(view);
        if (a != null) {
            ArrayList arrayList = this.c;
            if (arrayList.contains(a)) {
                return;
            }
            arrayList.add(a);
            e();
            b(true);
            ViewGroup viewGroup = this.a;
            if (viewGroup.hasWindowFocus()) {
                viewGroup.sendAccessibilityEvent(32);
            }
        }
    }

    public final void e() {
        oe7 oe7Var = new oe7(3, new tbb(27, this));
        ArrayList arrayList = this.c;
        xcc.q(arrayList, oe7Var);
        ViewGroup viewGroup = this.a;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (!this.b.contains(Integer.valueOf(childAt.getId()))) {
                boolean isEmpty = arrayList.isEmpty();
                WeakHashMap weakHashMap = this.w;
                if (isEmpty || jl40.l(arrayList.get(arrayList.size() - 1), childAt)) {
                    Integer num = (Integer) weakHashMap.remove(childAt);
                    if (num != null) {
                        childAt.setImportantForAccessibility(num.intValue());
                    }
                } else {
                    if (!weakHashMap.containsKey(childAt)) {
                        weakHashMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                    childAt.setImportantForAccessibility(4);
                }
            }
        }
    }
}
