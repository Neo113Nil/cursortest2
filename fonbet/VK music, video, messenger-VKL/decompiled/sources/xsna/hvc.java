package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.ListDataSet;
import java.util.List;

/* compiled from: ClipEditorSwapDelegate.kt */
/* loaded from: classes18.dex */
public final class hvc implements gvc {
    public final z6d a;
    public final RecyclerView b;
    public ListDataSet c;
    public final eyl0 d;
    public final androidx.recyclerview.widget.r e;

    public hvc(List list, z6d z6dVar, RecyclerView recyclerView, tm0 tm0Var) {
        this.a = z6dVar;
        this.b = recyclerView;
        ListDataSet listDataSet = new ListDataSet();
        this.c = listDataSet;
        listDataSet.n0(list);
        this.d = new eyl0(this.c, tm0Var);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setItemAnimator(new androidx.recyclerview.widget.g());
        recyclerView.setClipToPadding(false);
        recyclerView.setAdapter(this.d);
        eyl0 eyl0Var = this.d;
        if (eyl0Var != null) {
            this.e = new androidx.recyclerview.widget.r(new lln0(eyl0Var, z6dVar));
        }
    }

    @Override // xsna.gvc
    public final void a() {
        androidx.recyclerview.widget.r rVar = this.e;
        if (rVar != null) {
            rVar.l(null);
        }
    }

    @Override // xsna.gvc
    public final void b(List<zcd> list) {
        if (this.c == null) {
            this.c = new ListDataSet();
        }
        if (this.a.b()) {
            return;
        }
        this.c.setItems(list);
        this.c.a();
    }

    @Override // xsna.gvc
    public final void c() {
        androidx.recyclerview.widget.r rVar = this.e;
        if (rVar != null) {
            rVar.l(this.b);
        }
    }
}
