package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class f451 extends n451 {
    public final tls b;
    public final FrameLayout c;
    public final qg20 d;

    public f451(Context context, imc0 imc0Var, tls tlsVar) {
        this.b = tlsVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        this.d = new qg20(frameLayout, imc0Var, tlsVar, false);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setTransitionName("plaque_group_widget_transition_name");
    }

    public static int f(l151 l151Var, Context context) {
        if (l151Var instanceof i151) {
            return -1;
        }
        if (l151Var instanceof j151) {
            return -2;
        }
        if (l151Var instanceof k151) {
            return ((k151) l151Var).a.b(context.getResources().getDisplayMetrics()).intValue();
        }
        w511.b();
        return 0;
    }

    @Override // defpackage.drd0
    public final View a() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    @Override // defpackage.n451
    public final void c(eg20 eg20Var) {
        ?? r2;
        List list = ((if20) eg20Var).e;
        this.d.c(list);
        FrameLayout frameLayout = this.c;
        if (frameLayout.getChildCount() > 0) {
            View childAt = frameLayout.getChildAt(0);
            if (childAt == null) {
                ny61.s();
                return;
            }
            int i = 1;
            if (1 < frameLayout.getChildCount()) {
                r2 = new ArrayList();
                r2.add(childAt);
                while (i < frameLayout.getChildCount()) {
                    int i2 = i + 1;
                    View childAt2 = frameLayout.getChildAt(i);
                    if (childAt2 == null) {
                        ny61.s();
                        return;
                    } else {
                        r2.add(childAt2);
                        i = i2;
                    }
                }
            } else {
                r2 = Collections.singletonList(childAt);
            }
        } else {
            r2 = EmptyList.a;
        }
        Iterable iterable = (Iterable) r2;
        List list2 = list;
        Iterator it = iterable.iterator();
        Iterator it2 = list2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(tcc.n(iterable, 10), tcc.n(list2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            eg20 eg20Var2 = (eg20) it2.next();
            int f = f(eg20Var2.c().b, frameLayout.getContext());
            eg20Var2.c().getClass();
            ((View) next).setLayoutParams(new FrameLayout.LayoutParams(f, f(j151.a, frameLayout.getContext()), 0));
            arrayList.add(zy11.a);
        }
    }

    @Override // defpackage.n451
    public final tls d() {
        return this.b;
    }

    public final String toString() {
        return "Box";
    }
}
