package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.superapp.multiaccount.impl.ui.relateduser.RelatedUserStackView;
import com.vkontakte.android.R;
import xsna.o340;

/* compiled from: MultiAccountSwitcherRelatedUserViewHolder.kt */
/* loaded from: classes6.dex */
public final class u340 extends RecyclerView.e0 {
    public final ij0 l;
    public final jzq0 m;
    public final o340.b n;
    public final RelatedUserStackView o;

    public u340(ViewGroup viewGroup, pxo pxoVar, jzq0 jzq0Var, o340.b bVar) {
        super(tf3.b(viewGroup, R.layout.vk_auth_multiaccount_switcher_related_user_item, viewGroup, false));
        this.l = pxoVar;
        this.m = jzq0Var;
        this.n = bVar;
        this.o = (RelatedUserStackView) this.itemView.findViewById(R.id.switcher_related_users_stack);
    }
}
