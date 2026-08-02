package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.superapp.ui.views.NoTrackingGridLayoutManager;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: SuperAppExpandableMenuStubHolder.kt */
/* loaded from: classes6.dex */
public final class e8n0 extends ucn0<f8n0> {
    public final View p;
    public final i8q q;

    public e8n0(View view) {
        super(view, null);
        this.p = view;
        i8q i8qVar = new i8q(new fnl());
        this.q = i8qVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.expanded_recycler_view_v6);
        recyclerView.setAdapter(i8qVar);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new NoTrackingGridLayoutManager(4, 1));
        recyclerView.addItemDecoration(new k8q(recyclerView.getContext()));
    }

    @Override // xsna.hf6
    public final void W5(zif0 zif0Var) {
        f8n0 f8n0Var = (f8n0) zif0Var;
        ArrayList arrayList = new ArrayList(12);
        for (int i = 0; i < 12; i++) {
            arrayList.add(new m8q(f8n0Var.b));
        }
        this.q.O0(arrayList, null, null);
    }
}
