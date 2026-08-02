package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.m;
import java.util.List;

/* compiled from: ClipsRecyclerViewDiffScrollHelper.kt */
/* loaded from: classes17.dex */
public final class j0f implements d.b<hfz> {
    public final q8e a;

    /* compiled from: ClipsRecyclerViewDiffScrollHelper.kt */
    public interface a {
    }

    public j0f(q8e q8eVar) {
        this.a = q8eVar;
    }

    @Override // androidx.recyclerview.widget.d.b
    public final void a(List<hfz> list, List<hfz> list2) {
        q8e q8eVar = this.a;
        int s = ((LinearLayoutManager) q8eVar.getLayoutManager()).s();
        if (s != -1 && (((hfz) j5g.b0(s, list)) instanceof a)) {
            if (s == 0 && list.size() == 1) {
                int a2 = androidx.recyclerview.widget.m.a(new k0f(list, list2), true).a(s);
                if (a2 == 0) {
                    q8eVar.scrollToPosition(e43.h(list2));
                    return;
                } else {
                    if (a2 == e43.h(list2)) {
                        q8eVar.scrollToPosition(0);
                        return;
                    }
                    return;
                }
            }
            if (s == 0) {
                m.d a3 = androidx.recyclerview.widget.m.a(new k0f(list, list2), true);
                int a4 = a3.a(s);
                int a5 = a3.a(s + 1);
                if (a4 + 1 != a5) {
                    q8eVar.scrollToPosition(a5 - 1);
                    return;
                }
                return;
            }
            if (s == e43.h(list)) {
                m.d a6 = androidx.recyclerview.widget.m.a(new k0f(list, list2), true);
                int a7 = a6.a(s);
                int a8 = a6.a(s - 1);
                if (a7 - 1 != a8) {
                    q8eVar.scrollToPosition(a8 + 1);
                }
            }
        }
    }
}
