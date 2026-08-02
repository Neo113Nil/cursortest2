package xsna;

import com.vk.api.users.UsersSearch;
import com.vk.dto.user.UserProfile;
import com.vk.friends.api.presentation.FriendsSelectionType;
import com.vk.friends.impl.friends.presentation.fragment.AbsFriendsFragment;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: BaseFriendsSelectionPresenter.kt */
/* loaded from: classes15.dex */
public abstract class md6 extends id6 {
    public final FriendsSelectionType l;
    public final LinkedHashMap m;

    public md6(FriendsSelectionType friendsSelectionType, jd6 jd6Var, AbsFriendsFragment absFriendsFragment, List list, UsersSearch.Entrypoint entrypoint, eqs eqsVar) {
        super(jd6Var, absFriendsFragment, entrypoint, eqsVar);
        this.l = friendsSelectionType;
        List list2 = list;
        int e = on00.e(c5g.u(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (Object obj : list2) {
            linkedHashMap.put(obj, null);
        }
        this.m = new LinkedHashMap(linkedHashMap);
    }

    public abstract void f(UserProfile userProfile, boolean z);

    public abstract void g();

    public abstract void h();
}
