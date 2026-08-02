package xsna;

import android.view.View;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vk.profile.user.impl.ui.view.wall_mode.UserProfileSelectorWallModeView;
import com.vkontakte.android.R;

/* compiled from: UserProfileWallSelectorViewHolder.kt */
/* loaded from: classes5.dex */
public final class cxq0 extends aq6<UserProfileAdapterItem.q> {
    public final slq0 n;
    public final UserProfileSelectorWallModeView o;

    public cxq0(View view, hpq0 hpq0Var) {
        super(view);
        this.n = hpq0Var;
        View view2 = this.itemView;
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.h0(R.drawable.profile_card_top_rounded_background, view2);
        UserProfileSelectorWallModeView userProfileSelectorWallModeView = (UserProfileSelectorWallModeView) view.findViewById(R.id.content_view);
        userProfileSelectorWallModeView.setActionSender(hpq0Var);
        this.o = userProfileSelectorWallModeView;
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        this.o.setup((UserProfileAdapterItem.q) obj);
    }
}
