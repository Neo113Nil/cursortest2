package xsna;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import xsna.x1b;

/* compiled from: ChannelMessageSendReporterImpl.kt */
/* loaded from: classes5.dex */
public final class y1b extends wn6<x1b.b, Object> implements x1b {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.x1b
    public final void e(String str) {
        Set keySet = this.c.keySet();
        if ((keySet instanceof Collection) && keySet.isEmpty()) {
            return;
        }
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            if (epx.f(((x1b.b) ((mdz) it.next()).b).a, str)) {
                f(new mdz(0L, new x1b.b(str), null), null);
                return;
            }
        }
    }

    @Override // xsna.x1b
    public final void l(String str) {
        c(new mdz(0L, new x1b.b(str), null));
    }

    @Override // xsna.wn6
    public final void t(mdz<x1b.b> mdzVar, Object obj) {
        wn6.w(this, mdzVar, new jt(10), null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        this.c.clear();
    }
}
