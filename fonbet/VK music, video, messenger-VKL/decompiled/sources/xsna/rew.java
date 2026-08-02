package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import java.util.ArrayList;

/* compiled from: ImVkActionsModal.kt */
/* loaded from: classes2.dex */
public final class rew {
    public static final int d = iah0.a(10);
    public final izs<Integer, s3q0> a;
    public final gzs<s3q0> b;
    public final VkModal c;

    public rew(Context context, ArrayList arrayList, izs izsVar, qe3 qe3Var) {
        this.a = izsVar;
        this.b = qe3Var;
        VkModal.Mode mode = VkModal.Mode.Card;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        int i = d;
        f4m.B(i, i, recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter(new m30(arrayList, recyclerView.getContext(), izsVar));
        s3q0 s3q0Var = s3q0.a;
        this.c = new VkModal(mode, new b.a.C0789a(recyclerView, false), qe3Var, false, 20);
    }
}
