package xsna;

import com.vk.friends.impl.friendsandfollowers.tabbedscreen.domain.FriendsAndFollowersTabType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.els;

/* compiled from: FriendsAndFollowersTabDataExt.kt */
/* loaded from: classes15.dex */
public final class fls {
    public static final FriendsAndFollowersTabType a(FriendsAndFollowersTabType friendsAndFollowersTabType, List<els.a> list) {
        FriendsAndFollowersTabType friendsAndFollowersTabType2;
        List<els.a> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((els.a) it.next()).b == friendsAndFollowersTabType) {
                    return friendsAndFollowersTabType;
                }
            }
        }
        els.a aVar = (els.a) j5g.a0(list);
        return (aVar == null || (friendsAndFollowersTabType2 = aVar.b) == null) ? friendsAndFollowersTabType : friendsAndFollowersTabType2;
    }
}
