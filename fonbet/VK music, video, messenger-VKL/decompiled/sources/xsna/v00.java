package xsna;

import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFollow;
import com.vk.catalog2.common.ui.holders.ActionFollowVh;
import com.vk.dto.group.Group;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class v00 implements izs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ActionFollowVh c;
    public final /* synthetic */ Group d;
    public final /* synthetic */ UIBlockActionFollow e;

    public /* synthetic */ v00(boolean z, ActionFollowVh actionFollowVh, Group group, UIBlockActionFollow uIBlockActionFollow) {
        this.b = z;
        this.c = actionFollowVh;
        this.d = group;
        this.e = uIBlockActionFollow;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z = this.b;
        boolean z2 = !z;
        Group group = this.d;
        group.j = z2;
        group.C = z2 ? 1 : 0;
        ActionFollowVh actionFollowVh = this.c;
        actionFollowVh.a(z2);
        cvk.v(!z ? R.string.video_owner_subscribed : R.string.video_owner_unsubscribed, group.d);
        actionFollowVh.b.b(new ron0(this.e.Fb()), true);
        return s3q0.a;
    }
}
