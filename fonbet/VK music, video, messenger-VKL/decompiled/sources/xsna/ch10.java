package xsna;

import com.vk.api.base.VkPaginationList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.masks.Mask;
import com.vk.log.L;
import com.vk.masks.MasksController;
import com.vk.newsfeed.api.friendslists.FriendsListParams;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.newsfeed.posting.mediapicker.photovk.VkPhotoPickerFragment;
import com.vk.newsfeed.posting.mediapicker.videovk.presentation.PickerRecyclerPaginatedView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import ru.ok.android.webrtc.SharedPeerConnectionFactory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ch10 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ch10(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i;
        int i2;
        int i3;
        switch (this.b) {
            case 0:
                ((MasksController) this.c).d.add((Mask) this.d);
                return;
            case 1:
                VkPhotoPickerFragment vkPhotoPickerFragment = (VkPhotoPickerFragment) this.c;
                mha0 mha0Var = (mha0) this.d;
                Throwable th = (Throwable) obj;
                L.i(th);
                PickerRecyclerPaginatedView pickerRecyclerPaginatedView = vkPhotoPickerFragment.a0;
                if (pickerRecyclerPaginatedView == null) {
                    pickerRecyclerPaginatedView = null;
                }
                pickerRecyclerPaginatedView.Mk();
                if (mha0Var.l) {
                    vkPhotoPickerFragment.de(th);
                    return;
                } else {
                    PickerRecyclerPaginatedView pickerRecyclerPaginatedView2 = vkPhotoPickerFragment.a0;
                    (pickerRecyclerPaginatedView2 != null ? pickerRecyclerPaginatedView2 : null).g0();
                    return;
                }
            case 2:
                exd0 exd0Var = (exd0) this.c;
                com.vk.lists.c cVar = (com.vk.lists.c) this.d;
                if (obj instanceof kqs) {
                    exd0Var.x7();
                    return;
                }
                if (obj instanceof VkPaginationList) {
                    VkPaginationList vkPaginationList = (VkPaginationList) obj;
                    Iterable iterable = vkPaginationList.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : iterable) {
                        if (obj2 instanceof ProfileFriendItem) {
                            arrayList.add(obj2);
                        }
                    }
                    if (cVar != null) {
                        cVar.l(vkPaginationList.c);
                    }
                    gxd0 gxd0Var = exd0Var.l;
                    FriendsListParams friendsListParams = exd0Var.d;
                    FriendsListParams.FriendsList friendsList = friendsListParams instanceof FriendsListParams.FriendsList ? (FriendsListParams.FriendsList) friendsListParams : null;
                    Integer valueOf = friendsList != null ? Integer.valueOf(friendsList.b) : null;
                    LinkedHashMap<UserId, jqs> linkedHashMap = gxd0Var.i;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ProfileFriendItem profileFriendItem = (ProfileFriendItem) it.next();
                        Set<UserId> set = gxd0Var.k;
                        UserId userId = profileFriendItem.b;
                        List<Integer> list = profileFriendItem.f;
                        boolean contains = set.contains(userId);
                        List<Integer> list2 = list;
                        boolean P = j5g.P(list2, valueOf);
                        boolean containsKey = gxd0Var.g.containsKey(userId);
                        Set<String> set2 = gxd0Var.e;
                        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            kq.d((Number) it2.next(), arrayList2);
                        }
                        if ((set2 instanceof Collection) && set2.isEmpty()) {
                            i = 0;
                        } else {
                            Iterator<T> it3 = set2.iterator();
                            i = 0;
                            while (it3.hasNext()) {
                                if (arrayList2.contains((String) it3.next()) && (i = i + 1) < 0) {
                                    e43.s();
                                    throw null;
                                }
                            }
                        }
                        Set<Integer> set3 = gxd0Var.b;
                        if ((set3 instanceof Collection) && set3.isEmpty()) {
                            i2 = 0;
                        } else {
                            Iterator<T> it4 = set3.iterator();
                            i2 = 0;
                            while (it4.hasNext()) {
                                if (list.contains(Integer.valueOf(((Number) it4.next()).intValue())) && (i2 = i2 + 1) < 0) {
                                    e43.s();
                                    throw null;
                                }
                            }
                        }
                        int i4 = i + i2;
                        Set<Integer> set4 = gxd0Var.c;
                        if ((set4 instanceof Collection) && set4.isEmpty()) {
                            i3 = 0;
                        } else {
                            Iterator<T> it5 = set4.iterator();
                            i3 = 0;
                            while (it5.hasNext()) {
                                if (list.contains(Integer.valueOf(((Number) it5.next()).intValue())) && (i3 = i3 + 1) < 0) {
                                    e43.s();
                                    throw null;
                                }
                            }
                        }
                        exd0 exd0Var2 = exd0Var;
                        Integer num = valueOf;
                        boolean contains2 = gxd0Var.f.contains(String.valueOf(userId.b));
                        if (!linkedHashMap.containsKey(userId)) {
                            linkedHashMap.put(userId, new jqs(profileFriendItem, (P || containsKey || ((gxd0Var.d instanceof FriendsListParams.FriendsListsWithFriends) && i4 > i3) || contains2) && !contains, false, true));
                        }
                        exd0Var = exd0Var2;
                        valueOf = num;
                    }
                    exd0Var.x7();
                    return;
                }
                return;
            default:
                ((SharedPeerConnectionFactory) this.c).a((String) this.d, (Long) obj);
                return;
        }
    }
}
