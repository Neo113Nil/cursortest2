package xsna;

import com.vk.api.base.VkPaginationList;
import com.vk.dto.privacy.ListFriends;
import com.vk.dto.user.UserProfile;
import com.vk.newsfeed.api.posting.SettingsPostingContract$Mode;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import java.util.Date;
import java.util.List;

/* compiled from: SettingsPostingContract.kt */
/* loaded from: classes3.dex */
public interface b3j0 extends ik6 {
    void G3(List<ProfileFriendItem> list);

    void H0(int i);

    void K5();

    void M3();

    void M5(boolean z);

    void N1(boolean z);

    void P5();

    boolean Q4();

    void R0();

    void R6();

    void S6(List<ListFriends> list);

    void T0();

    void V6(boolean z);

    void Z4(boolean z);

    void e1(Date date);

    void f5(boolean z);

    void i5(boolean z);

    void j2(boolean z);

    void n4();

    void o2();

    void p1(VkPaginationList<ProfileFriendItem> vkPaginationList);

    void r3(VkPaginationList<UserProfile> vkPaginationList);

    void r5();

    void s1();

    void t4(boolean z);

    void u1(boolean z);

    void v1();

    void w4();

    default void hide() {
    }

    default void show() {
    }

    default void L6(boolean z) {
    }

    default void k2(boolean z) {
    }

    default void q1(SettingsPostingContract$Mode settingsPostingContract$Mode) {
    }
}
