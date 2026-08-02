package defpackage;

import android.view.View;
import androidx.core.view.c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class i6e0 {
    public static final int a = u6h0.pooling_container_listener_holder_tag;
    public static final int b = u6h0.is_pooling_container_tag;

    public static final void a(View view) {
        rrq0 a2 = vrq0.a((wls) c.a(view).b);
        while (a2.hasNext()) {
            ArrayList arrayList = b((View) a2.next()).a;
            for (int f = scc.f(arrayList); -1 < f; f--) {
                ((up31) ((j6e0) arrayList.get(f))).a.disposeComposition();
            }
        }
    }

    public static final k6e0 b(View view) {
        int i = a;
        k6e0 k6e0Var = (k6e0) view.getTag(i);
        if (k6e0Var != null) {
            return k6e0Var;
        }
        k6e0 k6e0Var2 = new k6e0();
        view.setTag(i, k6e0Var2);
        return k6e0Var2;
    }
}
