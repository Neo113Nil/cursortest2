package xsna;

import android.view.View;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;

/* compiled from: BaseVideoAutoPlayHolder.java */
/* loaded from: classes4.dex */
public final class hq6 implements View.OnClickListener {
    public final /* synthetic */ ol60 b;
    public final /* synthetic */ BaseVideoAutoPlayHolder c;

    public hq6(BaseVideoAutoPlayHolder baseVideoAutoPlayHolder, ol60 ol60Var) {
        this.c = baseVideoAutoPlayHolder;
        this.b = ol60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BaseVideoAutoPlayHolder baseVideoAutoPlayHolder = this.c;
        hi60 hi60Var = baseVideoAutoPlayHolder.D;
        u1c0 J0 = baseVideoAutoPlayHolder.J0();
        hi60Var.sa(new NewsfeedExternalAction.Navigation.OpenMyTargetAds(view.getContext(), ((qr50) this.b).i, new NewsfeedExternalAction.Navigation.OpenMyTargetAds.a(NewsfeedExternalAction.Navigation.OpenMyTargetAds.Element.BANNER, NativeAdContent.ViewTag.CTA, 6, null), J0 != null ? J0.k : -1));
    }
}
