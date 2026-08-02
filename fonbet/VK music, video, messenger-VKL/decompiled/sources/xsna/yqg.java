package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.profile.Address;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;

/* compiled from: CommunityAddressRouterImpl.kt */
/* loaded from: classes.dex */
public final class yqg implements xqg {
    @Override // xsna.xqg
    public final void a(Context context, UserId userId, String str, Address address, Integer num, boolean z, Long l) {
        CommunityAddressesFragment.c cVar = new CommunityAddressesFragment.c(userId, str, address);
        cVar.y(z);
        if (num != null) {
            cVar.A(num.intValue());
        }
        if (l != null) {
            cVar.z(l.longValue());
        }
        cVar.k(context);
    }
}
