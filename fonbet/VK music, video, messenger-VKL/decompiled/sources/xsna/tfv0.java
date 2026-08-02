package xsna;

import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkReefWatcherEndpointDevNull.kt */
/* loaded from: classes5.dex */
public final class tfv0 implements sfv0 {
    @Override // xsna.sfv0
    public final void a(ufv0 ufv0Var) {
        SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem;
        l5m l5mVar = new l5m(null, null, 3);
        if (ufv0Var instanceof viv) {
            schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(DevNullEventKey.REEF_WATCHER.h(), null, "http_code", Integer.valueOf(((viv) ufv0Var).a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16, 3, null);
        } else {
            if (!(ufv0Var instanceof g360)) {
                throw new NoWhenBranchMatchedException();
            }
            schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(DevNullEventKey.REEF_WATCHER.h(), null, "net_exception", null, ((g360) ufv0Var).a.getClass().getSimpleName(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, 3, null);
        }
        l5mVar.g = schemeStat$TypeDevNullItem;
        l5mVar.q();
    }
}
