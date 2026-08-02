package xsna;

import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ldi0;

/* compiled from: SelectionPreviewVh.kt */
/* loaded from: classes2.dex */
public final class iei0 extends vfz<hei0> {
    public final RecyclerView l;
    public final VkPlaceholder m;
    public final tbi0 n;

    static {
        iah0.a(Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE);
    }

    public iei0(View view, LayoutInflater layoutInflater, RecyclerView.u uVar, int i, gei0 gei0Var) {
        super(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.vkim_selection_list);
        this.l = recyclerView;
        getContext();
        this.m = (VkPlaceholder) view.findViewById(R.id.vkim_empty_selection);
        tbi0 tbi0Var = new tbi0(layoutInflater, i, gei0Var);
        this.n = tbi0Var;
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        linearLayoutManager.l = true;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setRecycledViewPool(uVar);
        recyclerView.setAdapter(tbi0Var);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hei0 hei0Var) {
        hei0 hei0Var2 = hei0Var;
        List<qtd0> list = hei0Var2.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ldi0.b((qtd0) it.next()));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (hei0Var2.d) {
            arrayList2.add(0, ldi0.a.a);
        }
        int size = arrayList2.size();
        tbi0 tbi0Var = this.n;
        boolean z = size > tbi0Var.f.size();
        tbi0Var.f = arrayList2;
        tbi0Var.notifyDataSetChanged();
        VkPlaceholder.b bVar = new VkPlaceholder.b(null, new VkPlaceholder.b.C0859b(14, oq.d(tlo0.Companion, hei0Var2.c)), 1);
        VkPlaceholder vkPlaceholder = this.m;
        vkPlaceholder.setMiddle(bVar);
        if (arrayList2.isEmpty()) {
            vkPlaceholder.setVisibility(0);
        } else {
            vkPlaceholder.setVisibility(4);
        }
        if (hei0Var2.e || !z) {
            return;
        }
        this.l.smoothScrollToPosition(tbi0Var.f.size());
    }
}
