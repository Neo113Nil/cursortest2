package xsna;

import com.vk.dto.posting.FriendsListPrivacyType;
import com.vk.lists.c;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import java.util.List;

/* compiled from: ProfileFriendsListContract.kt */
/* loaded from: classes3.dex */
public interface zwd0 extends c.l<Object>, shz, gm6 {
    void L1(ox6 ox6Var);

    void Qa();

    void S0(List<ProfileFriendItem> list);

    void Tm(String str);

    void U0();

    void U8(List<ProfileFriendItem> list, boolean z);

    void Yh();

    void Z6(int i);

    void Z7();

    void b1();

    void dn();

    void fl();

    void g5(int i);

    FriendsListPrivacyType getType();

    void rm(io.reactivex.rxjava3.internal.operators.observable.j1 j1Var);
}
