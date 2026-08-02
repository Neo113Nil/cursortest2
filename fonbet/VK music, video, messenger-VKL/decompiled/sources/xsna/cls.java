package xsna;

import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.dto.common.id.UserId;
import com.vk.friends.api.FollowersInitialTab;
import com.vk.friends.impl.friendsandfollowers.tabbedscreen.domain.FriendsAndFollowersTabType;
import com.vk.toggle.features.ComFeatures;
import kotlin.collections.builders.ListBuilder;
import xsna.els;

/* compiled from: FriendsAndFollowersTabBuilderExt.kt */
/* loaded from: classes15.dex */
public final class cls {

    /* compiled from: FriendsAndFollowersTabBuilderExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FollowersInitialTab.values().length];
            try {
                iArr[FollowersInitialTab.FOLLOWERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FollowersInitialTab.MUTUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FollowersInitialTab.FRIENDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FollowersInitialTab.ONLINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final els a(UserId userId, boolean z, String str, int i, int i2, int i3, int i4) {
        ComFeatures comFeatures = ComFeatures.COM_FOLLOWERS_ONLINE_TAB;
        comFeatures.getClass();
        boolean a2 = com.vk.toggle.b.A.a(comFeatures);
        if (!a2) {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        int i5 = y1z.a;
        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        ListBuilder e = e43.e();
        if (a2) {
            e.add(new els.a(i2, FriendsAndFollowersTabType.ALL_FRIENDS));
            if (i3 > 0) {
                e.add(new els.a(i3, FriendsAndFollowersTabType.ONLINE_FRIENDS));
            }
            if (i4 > 0) {
                e.add(new els.a(i4, FriendsAndFollowersTabType.MUTUAL));
            }
            e.add(new els.a(i, FriendsAndFollowersTabType.FOLLOWERS));
        } else {
            e.add(new els.a(i, FriendsAndFollowersTabType.FOLLOWERS));
            e.add(new els.a(i2, FriendsAndFollowersTabType.ALL_FRIENDS));
            if (i4 > 0) {
                e.add(new els.a(i4, FriendsAndFollowersTabType.MUTUAL));
            }
        }
        return new els(userId, e.g(), str, z);
    }
}
