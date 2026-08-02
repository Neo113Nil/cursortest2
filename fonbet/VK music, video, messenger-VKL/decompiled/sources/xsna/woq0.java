package xsna;

import android.view.View;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vkontakte.android.R;

/* compiled from: UserProfileDraftPostingViewHolder.kt */
/* loaded from: classes5.dex */
public final class woq0 extends aq6<UserProfileAdapterItem.d> {
    public final slq0 n;

    public woq0(View view, hpq0 hpq0Var) {
        super(view);
        this.n = hpq0Var;
        bwt0.i0(this.itemView, new z8l0(this, 8));
        bwt0.i0(this.itemView.findViewById(R.id.draft_remove), new jan0(this, 4));
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        View view = this.itemView;
        int h = ((UserProfileAdapterItem.d) obj).b.h();
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.h0(h, view);
    }
}
