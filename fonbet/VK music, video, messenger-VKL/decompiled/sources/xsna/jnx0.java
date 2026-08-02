package xsna;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import xsna.pox0;

/* compiled from: WidgetListView.kt */
/* loaded from: classes17.dex */
public final class jnx0 extends i5i {
    public static final int o = iah0.a(32);
    public final wh50 n;

    public jnx0(Context context) {
        super(context, null, 0);
        this.n = androidx.compose.runtime.k.b(new pox0.c(0));
    }

    public static s3q0 B(jnx0 jnx0Var, androidx.compose.runtime.a aVar, int i) {
        ArrayList arrayList;
        if (aVar.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(851224166, i, -1, "com.vk.community.design.compose.widget.views.WidgetListView.ThemedContent.<anonymous> (WidgetListView.kt:29)");
            }
            List<pox0.b> list = jnx0Var.getWidgetListState().b;
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof pox0.b.C3524b) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            inx0.a(0, aVar, arrayList, jnx0Var.getOnOpenUrl(), null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }

    private final pox0.c getWidgetListState() {
        return (pox0.c) ((zak0) this.n).getValue();
    }

    private final void setWidgetListState(pox0.c cVar) {
        ((zak0) this.n).setValue(cVar);
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1647706709);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1647706709, i2, -1, "com.vk.community.design.compose.widget.views.WidgetListView.ThemedContent (WidgetListView.kt:24)");
            }
            qmx0.a(getWidgetListState().a, null, getOnOpenUrl(), kai.c(851224166, new w5h(this, 12), M), M, 3072, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yd4(this, i, 5);
        }
    }

    @Override // xsna.mmx0
    public final void h(pox0 pox0Var) {
        if (pox0Var instanceof pox0.c) {
            setWidgetListState((pox0.c) pox0Var);
        }
    }
}
