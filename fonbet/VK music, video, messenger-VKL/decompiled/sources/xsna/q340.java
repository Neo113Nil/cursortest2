package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: MultiAccountSwitcherAddUserViewHolder.kt */
/* loaded from: classes6.dex */
public final class q340 extends RecyclerView.e0 {
    public final ij0 l;
    public final View m;
    public final View n;

    public q340(ViewGroup viewGroup, pxo pxoVar) {
        super(tf3.b(viewGroup, R.layout.vk_auth_multiaccount_switcher_add_user_item, viewGroup, false));
        this.l = pxoVar;
        this.m = this.itemView.findViewById(R.id.add_user_layout);
        this.n = this.itemView.findViewById(R.id.plus_button);
    }
}
