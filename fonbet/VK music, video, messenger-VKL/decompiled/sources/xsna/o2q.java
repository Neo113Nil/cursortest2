package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vkontakte.android.R;
import xsna.a2q;
import xsna.m2q;

/* compiled from: ExchangeUserHolder.kt */
/* loaded from: classes15.dex */
public final class o2q extends RecyclerView.e0 {
    public final ViewGroup l;
    public final m2q.a m;
    public final VKReplacerView n;
    public final TextView o;
    public final TextView p;
    public final ImageView q;
    public final com.vk.core.ui.image.a<View> r;
    public final VKImageController.b s;

    public o2q(ViewGroup viewGroup, a2q.b bVar) {
        super(tf3.b(viewGroup, R.layout.vk_auth_exchange_user_item, viewGroup, false));
        this.l = viewGroup;
        this.m = bVar;
        this.n = (VKReplacerView) this.itemView.findViewById(R.id.vk_exchange_user_avatar);
        this.o = (TextView) this.itemView.findViewById(R.id.vk_exchange_user_title);
        this.p = (TextView) this.itemView.findViewById(R.id.vk_exchange_user_subtitle);
        this.q = (ImageView) this.itemView.findViewById(R.id.vk_exchange_user_delete);
        ifx0 ifx0Var = e370.c;
        this.r = (ifx0Var == null ? null : ifx0Var).a().create(viewGroup.getContext());
        this.s = adu0.a(6, viewGroup.getContext());
    }
}
