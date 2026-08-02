package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vkontakte.android.R;

/* compiled from: UserProfilePostponedViewHolder.kt */
/* loaded from: classes5.dex */
public final class ntq0 extends aq6<UserProfileAdapterItem.n> {
    public final slq0 n;
    public final TextView o;

    public ntq0(View view, hpq0 hpq0Var) {
        super(view);
        this.n = hpq0Var;
        this.o = (TextView) this.itemView.findViewById(R.id.counter);
        bwt0.i0(this.itemView, new mdk0(this, 8));
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        View view = this.itemView;
        int h = ((UserProfileAdapterItem.n) obj).b.h();
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.h0(h, view);
        this.o.setText(String.valueOf(0));
    }
}
