package xsna;

import com.vk.subscription.api.SubscribeStatus;

/* compiled from: FriendsCleanupExternalEventHandler.kt */
/* loaded from: classes15.dex */
public final class wms {
    public final wj50<vms> a;
    public final ewg0 b;

    /* compiled from: FriendsCleanupExternalEventHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubscribeStatus.values().length];
            try {
                iArr[SubscribeStatus.FRIEND_STATUS_FRIENDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscribeStatus.FRIEND_STATUS_NOT_FRIENDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SubscribeStatus.FRIEND_STATUS_FOLLOWNG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SubscribeStatus.FRIEND_STATUS_INCOME_FRIENDSHIP_REQUEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public wms(wj50<vms> wj50Var, ewg0 ewg0Var) {
        this.a = wj50Var;
        this.b = ewg0Var;
    }
}
