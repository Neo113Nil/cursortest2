package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.superapp.ui.views.NoTrackingGridLayoutManager;
import com.vk.superapp.ui.widgets.SuperAppShowcaseExpandableServiceMenu;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: SuperAppExpandableMenuHolder.kt */
/* loaded from: classes6.dex */
public final class b8n0 extends ucn0<c8n0> {
    public final u7n0 p;
    public final i8q q;

    public b8n0(View view, u7n0 u7n0Var) {
        super(view, null);
        this.p = u7n0Var;
        i8q i8qVar = new i8q(u7n0Var);
        this.q = i8qVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.expanded_recycler_view_v6);
        recyclerView.setAdapter(i8qVar);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new NoTrackingGridLayoutManager(4, 1));
        recyclerView.addItemDecoration(new k8q(recyclerView.getContext()));
    }

    @Override // xsna.hf6
    public final void W5(zif0 zif0Var) {
        List<SuperAppShowcaseExpandableServiceMenu.Payload.MenuItem> list = ((c8n0) zif0Var).c;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new j8q((SuperAppShowcaseExpandableServiceMenu.Payload.MenuItem) it.next()));
        }
        this.q.O0(arrayList, null, null);
    }
}
