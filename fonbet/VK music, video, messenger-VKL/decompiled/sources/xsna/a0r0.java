package xsna;

import com.vk.subscription.api.SubscribeStatus;
import com.vk.subscription.api.di.SubscriptionComponent;
import kotlin.LazyThreadSafetyMode;

/* compiled from: UserSubscribeFromAdInteractorImpl.kt */
/* loaded from: classes14.dex */
public final class a0r0 {
    public final SubscriptionComponent a;
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new wzb0(this, 25));

    /* compiled from: UserSubscribeFromAdInteractorImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubscribeStatus.values().length];
            try {
                iArr[SubscribeStatus.FRIEND_STATUS_FOLLOWNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscribeStatus.FRIEND_STATUS_SENT_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a0r0(SubscriptionComponent subscriptionComponent) {
        this.a = subscriptionComponent;
    }
}
