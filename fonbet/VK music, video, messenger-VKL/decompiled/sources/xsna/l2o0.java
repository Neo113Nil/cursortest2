package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.newsfeed.FaveTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.jnq;

/* compiled from: TagsSelectedAdapter.kt */
/* loaded from: classes4.dex */
public final class l2o0 extends zoj0<Object, vif0<?>> {
    public final jnq.b e;
    public final ArrayList f = new ArrayList();

    public l2o0(jnq.b bVar) {
        this.e = bVar;
    }

    public final ArrayList K0() {
        List<Object> y0 = y0();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) y0).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof FaveTag) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final void L0(List<FaveTag> list) {
        if (list.size() < 20) {
            ArrayList arrayList = new ArrayList(list.size() + 1);
            arrayList.add(s3q0.a);
            arrayList.addAll(list);
            list = arrayList;
        }
        setItems(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        Object c = this.c.c(i);
        if (c instanceof s3q0) {
            return 1;
        }
        if (c instanceof FaveTag) {
            return 0;
        }
        throw new IllegalStateException(cqi.c(c, "Can't create viwe type for "));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        vif0 vif0Var = (vif0) e0Var;
        Object c = this.c.c(i);
        if ((vif0Var instanceof spk) && (c instanceof FaveTag)) {
            ((spk) vif0Var).V5(c);
            return;
        }
        if ((vif0Var instanceof h0o0) && (c instanceof s3q0)) {
            ((h0o0) vif0Var).V5(c);
            return;
        }
        throw new IllegalStateException("Can't bind holder: " + vif0Var + " with " + c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new spk(viewGroup, this);
        }
        if (i == 1) {
            return new h0o0(viewGroup, this.e);
        }
        throw new IllegalStateException(lhg.a(i, "Can't create view holder for type: "));
    }
}
