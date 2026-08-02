package xsna;

import com.vk.newsfeed.api.posting.listsfriends.ListsFriendsDefaultList;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ListFriendsDefaultListUtils.kt */
/* loaded from: classes4.dex */
public final class oez {

    /* compiled from: ListFriendsDefaultListUtils.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ListsFriendsDefaultList.values().length];
            try {
                iArr[ListsFriendsDefaultList.UNIVERSITY_FRIENDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ListsFriendsDefaultList.SCHOOL_FRIENDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ListsFriendsDefaultList.COLLEAGUES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ListsFriendsDefaultList.BEST_FRIENDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ListsFriendsDefaultList.RELATIVES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int a(ListsFriendsDefaultList listsFriendsDefaultList) {
        int i = a.$EnumSwitchMapping$0[listsFriendsDefaultList.ordinal()];
        if (i == 1) {
            return R.string.lists_friends_university_friends;
        }
        if (i == 2) {
            return R.string.lists_friends_school_friends;
        }
        if (i == 3) {
            return R.string.lists_friends_colleagues;
        }
        if (i == 4) {
            return R.string.lists_friends_best_friends;
        }
        if (i == 5) {
            return R.string.lists_friends_relatives;
        }
        throw new NoWhenBranchMatchedException();
    }
}
