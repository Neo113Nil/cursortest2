package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.EcosystemProfileView;
import com.vkontakte.android.R;

/* compiled from: MultiAccountEcoplateViewHolder.kt */
/* loaded from: classes6.dex */
public final class e240 extends RecyclerView.e0 {
    public final EcosystemProfileView l;

    public e240(ViewGroup viewGroup) {
        super(tf3.b(viewGroup, R.layout.vk_auth_ecoplate_item, viewGroup, false));
        this.l = (EcosystemProfileView) this.itemView.findViewById(R.id.profile_view);
    }
}
