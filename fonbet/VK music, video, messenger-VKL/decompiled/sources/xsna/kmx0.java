package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.utils.newtork.NetworkState;
import com.vk.core.utils.newtork.NetworkType;
import com.vk.stat.scheme.MobileOfficialAppsCoreWhitelistStat$HostStatus;
import com.vk.stat.scheme.MobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cmx0;

/* compiled from: WhitelistTrackerStartTaskLogic.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class kmx0 implements amx0, g0t {
    public final /* synthetic */ lmx0 b;

    public kmx0(lmx0 lmx0Var) {
        this.b = lmx0Var;
    }

    @Override // xsna.amx0
    public final void a(cmx0 cmx0Var) {
        if (cmx0Var instanceof cmx0.c) {
            NetworkState c = com.vk.core.utils.newtork.b.c();
            Set<Integer> set = c.b;
            NetworkType.Companion.getClass();
            MobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem.NetworkType networkType = NetworkType.WIFI.n(set) ? MobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem.NetworkType.WIFI : MobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem.NetworkType.CELLULAR;
            String str = c.e.d;
            cmx0.c cVar = (cmx0.c) cmx0Var;
            Boolean valueOf = Boolean.valueOf(cVar.isEnabled());
            Boolean valueOf2 = Boolean.valueOf(NetworkType.VPN.n(set));
            Map<String, Boolean> a = cVar.a();
            ArrayList arrayList = new ArrayList(a.size());
            for (Map.Entry<String, Boolean> entry : a.entrySet()) {
                String key = entry.getKey();
                Boolean value = entry.getValue();
                value.getClass();
                arrayList.add(new MobileOfficialAppsCoreWhitelistStat$HostStatus(key, value));
            }
            MobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem mobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem = new MobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem(networkType, str, valueOf, valueOf2, arrayList);
            UiTracker uiTracker = UiTracker.a;
            new iid0(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, mobileOfficialAppsCoreWhitelistStat$TypeShutdownDetectionActionItem, 3)).q();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof amx0) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.b, lmx0.class, "trackEvent", "trackEvent$app_armUpload(Lcom/vk/network/whitelist/tracker/WhitelistState;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
