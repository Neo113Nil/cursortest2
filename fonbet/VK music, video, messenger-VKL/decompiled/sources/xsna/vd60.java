package xsna;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: NewsfeedCompositeRecyclerObserver.kt */
/* loaded from: classes4.dex */
public final class vd60 implements zjf0<ol60> {
    public final ArrayList b = new ArrayList();

    @Override // xsna.zjf0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void d(RecyclerView.e0 e0Var, ol60 ol60Var) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((zjf0) it.next()).d(e0Var, ol60Var);
        }
    }

    @Override // xsna.zjf0
    public final void b(RecyclerView.e0 e0Var) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((zjf0) it.next()).b(e0Var);
        }
    }

    @Override // xsna.zjf0
    public final void e(RecyclerView.e0 e0Var) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((zjf0) it.next()).e(e0Var);
        }
    }
}
