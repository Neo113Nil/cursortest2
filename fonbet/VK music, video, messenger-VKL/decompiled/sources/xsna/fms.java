package xsna;

import android.app.Activity;
import com.vk.catalog2.common.ui.mvp.friend.FriendsCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.friends.FriendsCatalogRootVh;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class fms implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fms(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        String str;
        int m;
        int i = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                FriendsCatalogRootVh friendsCatalogRootVh = (FriendsCatalogRootVh) obj4;
                xsh0 xsh0Var = (xsh0) obj3;
                Activity activity = (Activity) obj2;
                FriendsCatalogFragment friendsCatalogFragment = (FriendsCatalogFragment) obj;
                String str2 = "";
                if (!epx.f(friendsCatalogRootVh.D.r, vyh0.a) ? (str = friendsCatalogRootVh.w.p) != null : (str = friendsCatalogRootVh.u.V()) != null) {
                    str2 = str;
                }
                com.vk.catalog2.common.ui.holders.search.b bVar = com.vk.catalog2.common.ui.holders.search.b.a;
                com.vk.catalog2.common.ui.holders.search.b.b(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_FILTERS, str2);
                friendsCatalogRootVh.B.invoke();
                gms gmsVar = new gms(friendsCatalogRootVh, xsh0Var, activity, friendsCatalogFragment);
                int i2 = ify.a;
                if (ify.e(ify.c)) {
                    ify.a(new lms(gmsVar));
                    VkSearchView vkSearchView = friendsCatalogRootVh.C.h;
                    if (vkSearchView != null) {
                        vkSearchView.d0();
                    }
                } else {
                    gmsVar.invoke();
                }
                return s3q0.a;
            default:
                List list = (List) obj4;
                UserId userId = (UserId) obj3;
                String str3 = (String) obj2;
                qgp0 qgp0Var = (qgp0) obj;
                L.n("OfflineDbConn", new qe20(userId, list, str3, 2));
                Iterator it = j5g.U0(list, 512, 512, true).iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    List list2 = (List) it.next();
                    if (qgp0Var.c()) {
                        Iterator it2 = list2.iterator();
                        m = 0;
                        while (it2.hasNext()) {
                            m += qgp0Var.d(userId, (MusicTrack) it2.next(), str3);
                        }
                    } else {
                        cb50 cb50Var = qgp0Var.b;
                        String valueOf = String.valueOf(userId.b);
                        List list3 = list2;
                        ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                        Iterator it3 = list3.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(((MusicTrack) it3.next()).Fb());
                        }
                        m = cb50Var.m(valueOf, str3 == null ? "-2147483648" : str3, arrayList);
                    }
                    i3 += m;
                }
                return Integer.valueOf(i3);
        }
    }
}
