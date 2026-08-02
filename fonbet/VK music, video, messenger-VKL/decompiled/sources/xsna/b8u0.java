package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.network.kbh.state.NetworkState;
import com.vk.stat.scheme.CommonCoreNetworkStat$NetworkBadConnectionAction;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkAnalyticsTracker.kt */
/* loaded from: classes3.dex */
public final class b8u0 implements ny1 {
    public volatile NetworkState a;

    /* compiled from: VkAnalyticsTracker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkState.values().length];
            try {
                iArr[NetworkState.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkState.STABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkState.UNSTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.ny1
    public final void a(boolean z) {
        UiTracker uiTracker = UiTracker.a;
        new iid0(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, new CommonCoreNetworkStat$NetworkBadConnectionAction(z ? CommonCoreNetworkStat$NetworkBadConnectionAction.EventType.NETWORK_UNSTABLE : CommonCoreNetworkStat$NetworkBadConnectionAction.EventType.NETWORK_STABLE), 3)).q();
    }

    @Override // xsna.ny1
    public final void b(boolean z) {
        UiTracker uiTracker = UiTracker.a;
        new iid0(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, new CommonCoreNetworkStat$NetworkBadConnectionAction(z ? CommonCoreNetworkStat$NetworkBadConnectionAction.EventType.TUNNEL_ON : CommonCoreNetworkStat$NetworkBadConnectionAction.EventType.TUNNEL_OFF), 3)).q();
    }

    @Override // xsna.ny1
    public final void c() {
        UiTracker uiTracker = UiTracker.a;
        new iid0(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, new CommonCoreNetworkStat$NetworkBadConnectionAction(CommonCoreNetworkStat$NetworkBadConnectionAction.EventType.BANNER_SHOWN), 3)).q();
    }

    @Override // xsna.ny1
    public final void d() {
        UiTracker uiTracker = UiTracker.a;
        new iid0(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, new CommonCoreNetworkStat$NetworkBadConnectionAction(CommonCoreNetworkStat$NetworkBadConnectionAction.EventType.BANNER_SECONDARY_BUTTON_CLICK), 3)).q();
    }

    @Override // xsna.ny1
    public final void e() {
        UiTracker uiTracker = UiTracker.a;
        new iid0(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, new CommonCoreNetworkStat$NetworkBadConnectionAction(CommonCoreNetworkStat$NetworkBadConnectionAction.EventType.BANNER_PRIMARY_BUTTON_CLICK), 3)).q();
    }

    @Override // xsna.ny1
    public final void f(NetworkState networkState, boolean z) {
        if (this.a == networkState) {
            return;
        }
        int i = a.$EnumSwitchMapping$0[networkState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                CommonCoreNetworkStat$NetworkBadConnectionAction.EventType eventType = z ? CommonCoreNetworkStat$NetworkBadConnectionAction.EventType.BAD_CONNECTION_WIFI : CommonCoreNetworkStat$NetworkBadConnectionAction.EventType.BAD_CONNECTION_CELLULAR;
                UiTracker uiTracker = UiTracker.a;
                new iid0(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, new CommonCoreNetworkStat$NetworkBadConnectionAction(eventType), 3)).q();
            } else if (this.a == NetworkState.UNSTABLE) {
                UiTracker uiTracker2 = UiTracker.a;
                new iid0(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, new CommonCoreNetworkStat$NetworkBadConnectionAction(CommonCoreNetworkStat$NetworkBadConnectionAction.EventType.CONNECTION_RESTORED), 3)).q();
            }
        }
        this.a = networkState;
    }
}
