package xsna;

import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import org.chromium.net.NetError;

/* compiled from: ApiRequestReporterImpl.kt */
/* loaded from: classes5.dex */
public final class zz2 implements yz2 {
    @Override // xsna.yz2
    public final void a(int i, int i2, int i3, String str) {
        l5m l5mVar = new l5m(null, null, 3);
        l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.IM_GET_CONVERSATIONS_STAT.h(), str, null, Integer.valueOf(i), null, Integer.valueOf(i2), null, Integer.valueOf(i3), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, NetError.ERR_SSL_OBSOLETE_CIPHER, 3, null);
        l5mVar.q();
    }
}
