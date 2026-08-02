package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.state.b;
import java.util.Collections;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class jjl {
    public final yvf0 a;

    public /* synthetic */ jjl(yvf0 yvf0Var) {
        this.a = yvf0Var;
    }

    public View a(aw5 aw5Var, m3k m3kVar) {
        String id;
        z2k z2kVar = (z2k) this.a.get();
        egk d = m3kVar.d();
        if (d instanceof dbl) {
            dbl dblVar = (dbl) d;
            id = dblVar.p;
            if (id == null) {
                id = dblVar.x;
            }
        } else {
            id = d.getId();
        }
        b bVar = new b(0L, EmptyList.a, Collections.singletonList("0".concat(id != null ? ":".concat(id) : "")), 8);
        View a = z2kVar.a(m3kVar, aw5Var, bVar);
        z2kVar.b.b(aw5Var, a, m3kVar, bVar);
        egk d2 = m3kVar.d();
        rvo rvoVar = aw5Var.b;
        DisplayMetrics displayMetrics = a.getContext().getResources().getDisplayMetrics();
        a.setLayoutParams(new ViewGroup.LayoutParams(uml.p(d2.getWidth(), displayMetrics, rvoVar, null), uml.p(d2.getHeight(), displayMetrics, rvoVar, null)));
        a.setFocusable(true);
        return a;
    }
}
