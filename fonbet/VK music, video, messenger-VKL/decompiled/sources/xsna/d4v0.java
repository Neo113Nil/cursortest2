package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixOption;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: VkMixButtonsAdapter.kt */
/* loaded from: classes3.dex */
public final class d4v0 extends o4v0<s2j0> {
    public final aq1 e;

    public d4v0(aq1 aq1Var) {
        this.e = aq1Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new s2j0(tf3.b(viewGroup, R.layout.item_vk_mix_button_settings, viewGroup, false), new n8(1, this, d4v0.class, "selectItem", "selectItem(I)V", 0, 11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List list) {
        s2j0 s2j0Var = (s2j0) e0Var;
        super.onBindViewHolder(s2j0Var, i, list);
        MixOption mixOption = (MixOption) this.c.get(i);
        Object a0 = j5g.a0(list);
        Boolean bool = a0 instanceof Boolean ? (Boolean) a0 : null;
        if (bool != null ? bool.booleanValue() : false) {
            s2j0Var.V5(mixOption.f);
            return;
        }
        String str = mixOption.c;
        boolean z = mixOption.f;
        s2j0Var.n.setText(str);
        s2j0Var.V5(z);
    }
}
