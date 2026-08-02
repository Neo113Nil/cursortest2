package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.edu.ui.compose.item.OrganizationItemView;
import com.vkontakte.android.R;
import xsna.nwb;
import xsna.p6p;

/* compiled from: EduRoleItemHolder.kt */
/* loaded from: classes2.dex */
public final class q6p extends vfz<nwb.f> {
    public final com.vk.im.ui.components.chat_profile.a l;

    public q6p(ViewGroup viewGroup, com.vk.im.ui.components.chat_profile.a aVar) {
        super(R.layout.vkim_chat_profile_adapter_edu_roles_list_item, viewGroup);
        this.l = aVar;
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(nwb.f fVar) {
        nwb.f fVar2 = fVar;
        View view = this.itemView;
        OrganizationItemView organizationItemView = (OrganizationItemView) view;
        p6p.a aVar = fVar2.b;
        String string = view.getContext().getString(R.string.vkim_chat_profile_add_learning_organization);
        String string2 = this.itemView.getContext().getString(R.string.vkim_chat_profile_add_learning_organization_description);
        boolean z = fVar2.c;
        if (!z) {
            throw null;
        }
        boolean z2 = fVar2.d;
        organizationItemView.A(new OrganizationItemView.a(string, string2, z, z2, z2 ? new g84(fVar2, this, aVar, 13) : null, 9));
        organizationItemView.setClipToOutline(true);
        boolean z3 = fVar2.e;
        boolean z4 = fVar2.f;
        organizationItemView.setOutlineProvider((z3 && z4) ? new t0w0(6, cn70.c(20), false, false) : z3 ? new t0w0(4, cn70.c(20), false, false) : z4 ? new t0w0(2, cn70.c(20), false, false) : new t0w0(6, cn70.c(0), false, false));
        organizationItemView.setBackground(xus.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dhr0.t.c(R.attr.im_background_primary_additional), 0, 254));
    }
}
