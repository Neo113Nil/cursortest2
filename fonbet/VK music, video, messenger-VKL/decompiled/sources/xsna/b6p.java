package xsna;

import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.edu.ui.compose.item.ThreeButtonsItemView;
import com.vkontakte.android.R;
import xsna.nwb;

/* compiled from: EduInviteItemHolder.kt */
/* loaded from: classes2.dex */
public final class b6p extends vfz<nwb.d> {
    public final com.vk.im.ui.components.chat_profile.a l;

    public b6p(ViewGroup viewGroup, com.vk.im.ui.components.chat_profile.a aVar) {
        super(R.layout.vkim_chat_profile_adapter_edu_invite_item, viewGroup);
        this.l = aVar;
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(nwb.d dVar) {
        ThreeButtonsItemView threeButtonsItemView = (ThreeButtonsItemView) this.itemView;
        dVar.getClass();
        threeButtonsItemView.A(new ThreeButtonsItemView.a(new sfg(this, 15), new m2j(this, 7)));
        threeButtonsItemView.setClipToOutline(true);
        threeButtonsItemView.setOutlineProvider(new t0w0(6, cn70.c(0), false, false));
        threeButtonsItemView.setBackground(xus.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dhr0.t.c(R.attr.im_background_primary_additional), 0, 254));
    }
}
