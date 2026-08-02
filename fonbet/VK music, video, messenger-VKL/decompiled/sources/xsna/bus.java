package xsna;

import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.tgv0;

/* compiled from: FriendsViewUtils.kt */
/* loaded from: classes16.dex */
public final class bus {
    public static tgv0.a a(UIBlockProfile uIBlockProfile) {
        List H0;
        List<UserProfile> list = uIBlockProfile.C;
        if (list == null || (H0 = j5g.H0(list, 3)) == null) {
            return null;
        }
        List list2 = H0;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            itj0.d(((UserProfile) it.next()).o(32), arrayList);
        }
        return new tgv0.a(arrayList, null, hq.b(tlo0.Companion, R.plurals.friends_catalog_mutual_friends, uIBlockProfile.D), null, null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
    }
}
