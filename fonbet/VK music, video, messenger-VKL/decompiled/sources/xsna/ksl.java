package xsna;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.ListDataSet;
import java.util.List;
import xsna.zif0;

/* compiled from: DeferredSubmitAdapter.kt */
/* loaded from: classes6.dex */
public abstract class ksl<Item extends zif0> extends gf6<Item> {
    public final Handler e;
    public final g0 f;
    public boolean g;
    public List<? extends Item> h;
    public rd7 i;

    public ksl() {
        this(new ListDataSet());
    }

    public final void O0(List list, bv3 bv3Var, sts stsVar) {
        rd7 rd7Var = new rd7(bv3Var, stsVar);
        if (this.g) {
            this.g = true;
            this.h = list;
            this.i = rd7Var;
            return;
        }
        this.g = true;
        this.h = list;
        this.i = rd7Var;
        RecyclerView recyclerView = this.d;
        if (recyclerView == null) {
            Q0();
            return;
        }
        RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null && itemAnimator.n()) {
            this.e.removeCallbacks(this.f);
            itemAnimator.o(new RecyclerView.l.a() { // from class: xsna.isl
                @Override // androidx.recyclerview.widget.RecyclerView.l.a
                public final void a() {
                    ksl kslVar = ksl.this;
                    kslVar.e.post(kslVar.f);
                }
            });
            return;
        }
        P0(new jsl(0, this, ksl.class, "submitPendingItems", "submitPendingItems()V", 0, 0));
    }

    public void P0(jsl jslVar) {
        jslVar.invoke();
    }

    public final void Q0() {
        gzs gzsVar;
        gzs gzsVar2;
        if (this.g) {
            this.g = false;
            rd7 rd7Var = this.i;
            if (rd7Var != null && (gzsVar2 = (gzs) rd7Var.a) != null) {
                gzsVar2.invoke();
            }
            setItems(this.h);
            rd7 rd7Var2 = this.i;
            if (rd7Var2 != null && (gzsVar = (gzs) rd7Var2.b) != null) {
                gzsVar.invoke();
            }
        }
        this.h = null;
        this.i = null;
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.d = recyclerView;
        Q0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.zoj0, xsna.uuk
    public void setItems(List<? extends Item> list) {
        this.g = false;
        this.h = null;
        super.setItems(list);
    }

    public ksl(ListDataSet listDataSet) {
        super((hg6) listDataSet, false);
        this.e = new Handler(Looper.getMainLooper());
        this.f = new g0(this, 12);
    }
}
