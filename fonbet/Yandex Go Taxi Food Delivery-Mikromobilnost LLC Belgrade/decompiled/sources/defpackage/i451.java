package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final class i451 extends n451 {
    public final tls b;
    public final LinearLayoutCompat c;
    public final qg20 d;

    public i451(Context context, imc0 imc0Var, tls tlsVar) {
        this.b = tlsVar;
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(context);
        this.c = linearLayoutCompat;
        this.d = new qg20(linearLayoutCompat, imc0Var, tlsVar, false);
        linearLayoutCompat.setClipChildren(false);
        linearLayoutCompat.setClipToPadding(false);
        linearLayoutCompat.setTransitionName("plaque_group_widget_transition_name");
    }

    public static int f(l151 l151Var, Context context) {
        if (l151Var instanceof i151) {
            return -1;
        }
        if (l151Var instanceof j151) {
            return -2;
        }
        if (!(l151Var instanceof k151)) {
            w511.b();
            return 0;
        }
        return ((rkj) ((k151) l151Var).a()).b(context.getResources().getDisplayMetrics()).intValue();
    }

    public static int g(l151 l151Var, Context context) {
        if (l151Var instanceof i151) {
            return 0;
        }
        if (l151Var instanceof j151) {
            return -2;
        }
        if (!(l151Var instanceof k151)) {
            w511.b();
            return 0;
        }
        return ((rkj) ((k151) l151Var).a()).b(context.getResources().getDisplayMetrics()).intValue();
    }

    @Override // defpackage.drd0
    public final View a() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList] */
    @Override // defpackage.n451
    public final void c(eg20 eg20Var) {
        ?? r3;
        ViewGroup.LayoutParams layoutParams;
        rf20 rf20Var = (rf20) eg20Var;
        int i = rf20Var.d.c;
        LinearLayoutCompat linearLayoutCompat = this.c;
        linearLayoutCompat.setGravity(i);
        int i2 = rf20Var.f;
        linearLayoutCompat.setOrientation(i2);
        List list = rf20Var.e;
        this.d.c(list);
        if (linearLayoutCompat.getChildCount() > 0) {
            View childAt = linearLayoutCompat.getChildAt(0);
            if (childAt == null) {
                ny61.s();
                return;
            }
            if (1 < linearLayoutCompat.getChildCount()) {
                r3 = new ArrayList();
                r3.add(childAt);
                int i3 = 1;
                while (i3 < linearLayoutCompat.getChildCount()) {
                    int i4 = i3 + 1;
                    View childAt2 = linearLayoutCompat.getChildAt(i3);
                    if (childAt2 == null) {
                        ny61.s();
                        return;
                    } else {
                        r3.add(childAt2);
                        i3 = i4;
                    }
                }
            } else {
                r3 = Collections.singletonList(childAt);
            }
        } else {
            r3 = EmptyList.a;
        }
        Iterable iterable = (Iterable) r3;
        List list2 = list;
        Iterator it = iterable.iterator();
        Iterator it2 = list2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(tcc.n(iterable, 10), tcc.n(list2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            eg20 eg20Var2 = (eg20) it2.next();
            View view = (View) next;
            float f = 1.0f;
            j151 j151Var = j151.a;
            if (i2 == 0) {
                int g = g(eg20Var2.c().b, linearLayoutCompat.getContext());
                eg20Var2.c().getClass();
                int f2 = f(j151Var, linearLayoutCompat.getContext());
                l151 l151Var = eg20Var2.c().b;
                if (!(l151Var instanceof i151)) {
                    if (!(l151Var instanceof j151) && !(l151Var instanceof k151)) {
                        w511.b();
                        return;
                    }
                    f = 0.0f;
                }
                layoutParams = new LinearLayoutCompat.LayoutParams(g, f2, f);
            } else if (i2 != 1) {
                layoutParams = view.getLayoutParams();
            } else {
                int f3 = f(eg20Var2.c().b, linearLayoutCompat.getContext());
                eg20Var2.c().getClass();
                int g2 = g(j151Var, linearLayoutCompat.getContext());
                eg20Var2.c().getClass();
                layoutParams = new LinearLayoutCompat.LayoutParams(f3, g2, 0.0f);
            }
            view.setLayoutParams(layoutParams);
            arrayList.add(zy11.a);
        }
    }

    @Override // defpackage.n451
    public final tls d() {
        return this.b;
    }

    public final String toString() {
        return "Line";
    }
}
