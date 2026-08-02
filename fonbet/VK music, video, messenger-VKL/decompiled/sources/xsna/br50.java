package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vkontakte.android.R;

/* compiled from: MyTargetInternalNativeAdDisclaimerHolder.kt */
/* loaded from: classes4.dex */
public final class br50 extends rp6<cr50, MyTargetNativeAdEntry> {
    public final TextView E;

    public br50(ViewGroup viewGroup) {
        super(R.layout.news_mytarget_disclaimer, viewGroup);
        this.E = (TextView) this.itemView.findViewById(R.id.mytarget_disclaimer);
    }

    @Override // xsna.rp6
    public final void R6(cr50 cr50Var) {
        this.E.setText(cr50Var.h);
    }

    @Override // xsna.qi6, me.grishka.appkit.views.UsableRecyclerView.e
    public final void onClick() {
        u1c0 J0 = J0();
        ol60 ol60Var = J0 != null ? J0.h : null;
        cr50 cr50Var = ol60Var instanceof cr50 ? (cr50) ol60Var : null;
        if (cr50Var != null) {
            hi60 hi60Var = this.D;
            Context context = this.itemView.getContext();
            MyTargetNativeAdEntry myTargetNativeAdEntry = cr50Var.i;
            NewsfeedExternalAction.Navigation.OpenMyTargetAds.a aVar = new NewsfeedExternalAction.Navigation.OpenMyTargetAds.a(NewsfeedExternalAction.Navigation.OpenMyTargetAds.Element.BANNER, "DEFAULT", 1, null);
            u1c0 J02 = J0();
            hi60Var.sa(new NewsfeedExternalAction.Navigation.OpenMyTargetAds(context, myTargetNativeAdEntry, aVar, J02 != null ? J02.k : -1));
        }
    }
}
