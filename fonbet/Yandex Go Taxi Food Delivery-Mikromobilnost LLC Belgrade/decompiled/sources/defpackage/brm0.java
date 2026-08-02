package defpackage;

import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.scooters.passes.active.ScootersActivePassesModalView;
import java.util.List;

/* loaded from: classes13.dex */
public final class brm0 implements erm0 {
    public final /* synthetic */ ScootersActivePassesModalView a;

    public brm0(ScootersActivePassesModalView scootersActivePassesModalView) {
        this.a = scootersActivePassesModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        crm0 binding;
        bys bysVar;
        List list = ((irm0) obj).a;
        ScootersActivePassesModalView scootersActivePassesModalView = this.a;
        binding = scootersActivePassesModalView.getBinding();
        RecyclerView recyclerView = binding.d;
        OneShotPreDrawListener.add(recyclerView, new ii30(recyclerView, scootersActivePassesModalView));
        bysVar = scootersActivePassesModalView.adapter;
        if (bysVar != null) {
            bysVar.submitList(list, null);
        }
    }
}
