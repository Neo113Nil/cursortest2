package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.privacy.ListFriends;
import com.vk.newsfeed.api.friendslists.FriendsListParams;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.newsfeed.impl.posting.profilefriendslists.holders.ProfileFriendsListHeaderVh;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.nx6;

/* compiled from: ProfileFriendsListState.kt */
/* loaded from: classes4.dex */
public final class gxd0 {
    public final List<ListFriends> a;
    public final Set<Integer> b;
    public final Set<Integer> c;
    public final FriendsListParams d;
    public final Set<String> e;
    public final Set<String> f;
    public final Map<UserId, ProfileFriendItem> g;
    public final List<px6> h;
    public final LinkedHashMap<UserId, jqs> i;
    public final Set<UserId> j;
    public final Set<UserId> k;
    public int l;
    public int m;

    /* compiled from: ProfileFriendsListState.kt */
    public static final class a {
        public static gxd0 a(FriendsListParams friendsListParams, Set set, Set set2, UserId userId, kqs kqsVar, int i) {
            ArrayList arrayList;
            boolean z;
            List<ProfileFriendItem> list = kqsVar.a;
            List<ProfileFriendItem> list2 = list;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            for (ProfileFriendItem profileFriendItem : list2) {
                arrayList2.add(new Pair(profileFriendItem.b, profileFriendItem));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(pn00.s(arrayList2));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (list.isEmpty()) {
                List<ProfileFriendItem> list3 = kqsVar.b;
                ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
                for (ProfileFriendItem profileFriendItem2 : list3) {
                    boolean z2 = friendsListParams instanceof FriendsListParams.HiddenFriendsList;
                    if (!z2) {
                        linkedHashMap.put(profileFriendItem2.b, profileFriendItem2);
                        linkedHashSet.add(profileFriendItem2.b);
                    }
                    arrayList3.add(new jqs(profileFriendItem2, !z2, false, true));
                }
                arrayList = arrayList3;
            } else {
                arrayList = new ArrayList(c5g.u(list2, 10));
                for (ProfileFriendItem profileFriendItem3 : list2) {
                    boolean z3 = friendsListParams instanceof FriendsListParams.HiddenFriendsList;
                    if (z3) {
                        linkedHashSet.add(profileFriendItem3.b);
                    }
                    arrayList.add(new jqs(profileFriendItem3, friendsListParams instanceof FriendsListParams.FriendsList ? profileFriendItem3.f.contains(Integer.valueOf(((FriendsListParams.FriendsList) friendsListParams).b)) : z3 || !(friendsListParams instanceof FriendsListParams.FriendListCreation), false, true));
                }
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            List<jsj> list4 = kqsVar.c;
            ArrayList arrayList5 = new ArrayList(c5g.u(list4, 10));
            for (jsj jsjVar : list4) {
                ArrayList arrayList6 = jsjVar.b;
                ArrayList arrayList7 = new ArrayList();
                for (Object obj : arrayList6) {
                    if (!epx.f(((ProfileFriendItem) obj).b, userId)) {
                        arrayList7.add(obj);
                    }
                }
                if (!arrayList7.isEmpty()) {
                    Iterator it = arrayList7.iterator();
                    while (it.hasNext()) {
                        if (!linkedHashMap.containsKey(((ProfileFriendItem) it.next()).b)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                arrayList5.add(new px6(jsjVar.a, z, arrayList7, true));
            }
            ArrayList arrayList8 = new ArrayList(arrayList5);
            ArrayList arrayList9 = new ArrayList(kqsVar.d);
            if (friendsListParams instanceof FriendsListParams.FriendsListsWithFriends) {
                Collections.reverse(arrayList9);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                jqs jqsVar = (jqs) it2.next();
                linkedHashMap2.put(jqsVar.b.b, jqsVar);
            }
            return new gxd0(arrayList9, friendsListParams, set, set2, linkedHashMap, arrayList8, linkedHashMap2, linkedHashSet, i, 3078);
        }
    }

    public gxd0(List<ListFriends> list, Set<Integer> set, Set<Integer> set2, FriendsListParams friendsListParams, Set<String> set3, Set<String> set4, Map<UserId, ProfileFriendItem> map, List<px6> list2, LinkedHashMap<UserId, jqs> linkedHashMap, Set<UserId> set5, Set<UserId> set6, int i, int i2) {
        this.a = list;
        this.b = set;
        this.c = set2;
        this.d = friendsListParams;
        this.e = set3;
        this.f = set4;
        this.g = map;
        this.h = list2;
        this.i = linkedHashMap;
        this.j = set5;
        this.k = set6;
        this.l = i;
        this.m = i2;
    }

    public static void g(gxd0 gxd0Var, List list) {
        gxd0Var.f(list, EmptyList.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0053 A[LOOP:0: B:7:0x004d->B:9:0x0053, LOOP_END] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(List<ProfileFriendItem> list, boolean z) {
        Iterable arrayList;
        boolean z2 = this.d instanceof FriendsListParams.BestFriendsList;
        Map<UserId, ProfileFriendItem> map = this.g;
        if (z2) {
            if (list.size() + map.size() <= 100) {
                arrayList = list;
                Iterable<ProfileFriendItem> iterable = arrayList;
                for (ProfileFriendItem profileFriendItem : iterable) {
                    UserId userId = profileFriendItem.b;
                    UserId userId2 = profileFriendItem.b;
                    map.put(userId, profileFriendItem);
                    this.k.remove(userId2);
                    this.j.add(userId2);
                }
                LinkedHashMap<UserId, jqs> linkedHashMap = this.i;
                if (z) {
                    for (ProfileFriendItem profileFriendItem2 : iterable) {
                        UserId userId3 = profileFriendItem2.b;
                        UserId userId4 = profileFriendItem2.b;
                        jqs jqsVar = linkedHashMap.get(userId3);
                        if (jqsVar == null) {
                            jqsVar = new jqs(profileFriendItem2, true, true, true);
                            linkedHashMap.put(userId4, jqsVar);
                        }
                        jqs jqsVar2 = jqsVar;
                        jqsVar2.c = true;
                        linkedHashMap.put(userId4, jqsVar2);
                    }
                } else {
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) linkedHashMap.clone();
                    linkedHashMap.clear();
                    for (ProfileFriendItem profileFriendItem3 : iterable) {
                        jqs jqsVar3 = new jqs(profileFriendItem3, true, true, true);
                        UserId userId5 = profileFriendItem3.b;
                        linkedHashMap.put(userId5, jqsVar3);
                        linkedHashMap2.remove(userId5);
                    }
                    linkedHashMap.putAll(linkedHashMap2);
                }
                j();
                return arrayList.size() != list.size();
            }
        }
        arrayList = new ArrayList();
        int size = map.size();
        for (ProfileFriendItem profileFriendItem4 : list) {
            if (!map.containsKey(profileFriendItem4.b)) {
                size++;
            }
            if (z2 && size > 100) {
                break;
            }
            arrayList.add(profileFriendItem4);
        }
        Iterable<ProfileFriendItem> iterable2 = arrayList;
        while (r1.hasNext()) {
        }
        LinkedHashMap<UserId, jqs> linkedHashMap3 = this.i;
        if (z) {
        }
        j();
        if (arrayList.size() != list.size()) {
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        FriendsListParams friendsListParams = this.d;
        if (friendsListParams instanceof FriendsListParams.FriendsListsWithFriends) {
            List<ListFriends> list = this.a;
            if (list.size() <= 29) {
                arrayList.add(new rhz());
            }
            if (!list.isEmpty()) {
                arrayList.add(new com.vk.newsfeed.impl.posting.profilefriendslists.holders.a(y8g0.e(R.string.clips_privacy_friends_lists_header), ProfileFriendsListHeaderVh.ClearButtonType.CLEAR_FRIENDS_LISTS));
                ArrayList arrayList2 = new ArrayList();
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    ListFriends listFriends = (ListFriends) obj;
                    int i3 = listFriends.b;
                    boolean contains = this.e.contains(String.valueOf(i3));
                    Integer valueOf = Integer.valueOf(i3);
                    Set<Integer> set = this.b;
                    boolean z = (contains || set.contains(valueOf)) && !this.c.contains(Integer.valueOf(i3));
                    if (z) {
                        set.add(Integer.valueOf(i3));
                    }
                    arrayList2.add(new com.vk.newsfeed.common.posting.listfriends.a(listFriends.b, i, listFriends.c, z, false));
                    i = i2;
                }
                List H0 = j5g.H0(arrayList2, this.m);
                Iterator it = H0.iterator();
                while (it.hasNext()) {
                    arrayList.add((com.vk.newsfeed.common.posting.listfriends.a) it.next());
                }
                if (list.size() > H0.size()) {
                    arrayList.add(new jxd0(Math.min(5, list.size() - H0.size())));
                }
            }
        }
        if (friendsListParams instanceof FriendsListParams.BestFriendsList) {
            List<px6> list2 = this.h;
            if (!list2.isEmpty()) {
                arrayList.add(new com.vk.newsfeed.impl.posting.profilefriendslists.holders.a(y8g0.e(R.string.best_friends_header_conversations), ProfileFriendsListHeaderVh.ClearButtonType.CLEAR_CONVERSATIONS));
            }
            List<px6> H02 = j5g.H0(list2, this.l);
            for (px6 px6Var : H02) {
                arrayList.add(new px6(px6Var.b, px6Var.c, px6Var.d, px6Var.e));
            }
            if (list2.size() > H02.size()) {
                arrayList.add(new jxd0(Math.min(5, list2.size() - H02.size())));
            }
        }
        arrayList.add(new com.vk.newsfeed.impl.posting.profilefriendslists.holders.a(y8g0.e(friendsListParams instanceof FriendsListParams.HiddenFriendsList ? R.string.users_header_title : R.string.best_friends_header_friends), ProfileFriendsListHeaderVh.ClearButtonType.CLEAR_FRIENDS));
        Iterator<T> it2 = this.i.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            jqs jqsVar = (jqs) entry.getValue();
            arrayList.add(new jqs(jqsVar.b, jqsVar.c, jqsVar.d, jqsVar.e));
            ((jqs) entry.getValue()).d = false;
        }
        return arrayList;
    }

    public final ArrayList c() {
        Set<String> set = this.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            String str = (String) obj;
            Set<Integer> set2 = this.c;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    if (epx.f(String.valueOf(((Number) it.next()).intValue()), str)) {
                        break;
                    }
                }
            }
            arrayList.add(obj);
        }
        Set<Integer> set3 = this.b;
        ArrayList arrayList2 = new ArrayList(c5g.u(set3, 10));
        Iterator<T> it2 = set3.iterator();
        while (it2.hasNext()) {
            kq.d((Number) it2.next(), arrayList2);
        }
        return j5g.u0(arrayList2, arrayList);
    }

    public final ArrayList d() {
        Map<UserId, ProfileFriendItem> map = this.g;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<UserId, ProfileFriendItem>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    public final void e(int i) {
        this.c.add(Integer.valueOf(i));
        Integer valueOf = Integer.valueOf(i);
        Set<Integer> set = this.b;
        set.remove(valueOf);
        for (Map.Entry<UserId, jqs> entry : this.i.entrySet()) {
            UserId key = entry.getKey();
            jqs value = entry.getValue();
            boolean contains = value.b.f.contains(Integer.valueOf(i));
            boolean contains2 = this.j.contains(key);
            List<Integer> list = value.b.f;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                kq.d((Number) it.next(), arrayList);
            }
            Set<Integer> set2 = set;
            ArrayList arrayList2 = new ArrayList(c5g.u(set2, 10));
            Iterator<T> it2 = set2.iterator();
            while (it2.hasNext()) {
                kq.d((Number) it2.next(), arrayList2);
            }
            boolean b = p4g.b(arrayList, arrayList2);
            boolean contains3 = this.f.contains(String.valueOf(key.b));
            if (contains && !contains2 && !b && !contains3) {
                value.c = false;
            }
        }
    }

    public final void f(List<ProfileFriendItem> list, List<UserId> list2) {
        FriendsListParams friendsListParams = this.d;
        if ((friendsListParams instanceof FriendsListParams.HiddenFriendsList) || (friendsListParams instanceof FriendsListParams.BestFriendsList)) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                UserId userId = ((ProfileFriendItem) it.next()).b;
                Map<UserId, ProfileFriendItem> map = this.g;
                if (map.get(userId) != null) {
                    map.remove(userId);
                    i(userId);
                }
            }
            j();
            return;
        }
        if (!(friendsListParams instanceof FriendsListParams.FriendsListsWithFriends)) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                i(((ProfileFriendItem) it2.next()).b);
            }
            return;
        }
        this.j.addAll(list2);
        for (ProfileFriendItem profileFriendItem : list) {
            Iterator<T> it3 = profileFriendItem.f.iterator();
            while (it3.hasNext()) {
                int intValue = ((Number) it3.next()).intValue();
                this.c.add(Integer.valueOf(intValue));
                this.b.remove(Integer.valueOf(intValue));
            }
            i(profileFriendItem.b);
        }
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        Set<UserId> set = this.j;
        ArrayList arrayList2 = new ArrayList(c5g.u(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList2.add(new nx6.a.C3421a((UserId) it.next()));
        }
        g5g.y(arrayList2, arrayList);
        Set<UserId> set2 = this.k;
        ArrayList arrayList3 = new ArrayList(c5g.u(set2, 10));
        Iterator<T> it2 = set2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new nx6.a.b((UserId) it2.next(), "delete"));
        }
        g5g.y(arrayList3, arrayList);
        return arrayList;
    }

    public final void i(UserId userId) {
        jqs jqsVar = this.i.get(userId);
        if (jqsVar != null) {
            jqsVar.c = false;
        }
        if (this.j.remove(userId)) {
            return;
        }
        this.k.add(userId);
    }

    public final void j() {
        for (px6 px6Var : this.h) {
            List<ProfileFriendItem> list = px6Var.d;
            boolean z = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!this.g.containsKey(((ProfileFriendItem) it.next()).b)) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            px6Var.c = z;
        }
    }

    public gxd0(ArrayList arrayList, FriendsListParams friendsListParams, Set set, Set set2, LinkedHashMap linkedHashMap, ArrayList arrayList2, LinkedHashMap linkedHashMap2, LinkedHashSet linkedHashSet, int i, int i2) {
        this((i2 & 1) != 0 ? new ArrayList() : arrayList, new LinkedHashSet(), new LinkedHashSet(), friendsListParams, set, (i2 & 32) != 0 ? EmptySet.b : set2, (i2 & 64) != 0 ? new LinkedHashMap() : linkedHashMap, (i2 & 128) != 0 ? new ArrayList() : arrayList2, (i2 & 256) != 0 ? new LinkedHashMap() : linkedHashMap2, (i2 & 512) != 0 ? new LinkedHashSet() : linkedHashSet, new LinkedHashSet(), 2, (i2 & 4096) != 0 ? 2 : i);
    }
}
