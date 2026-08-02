package xsna;

import com.vk.push.common.HostInfoProvider;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: FailOverNotifierDns.kt */
/* loaded from: classes5.dex */
public final class bjq implements tsn {
    public final HostInfoProvider b;
    public final ArrayList c;

    public bjq() {
        throw null;
    }

    public bjq(HostInfoProvider hostInfoProvider) {
        ArrayList arrayList = new ArrayList();
        this.b = hostInfoProvider;
        this.c = arrayList;
    }

    public static List b(String str) {
        try {
            try {
                return rl3.u0(InetAddress.getAllByName(str));
            } catch (NullPointerException e) {
                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                unknownHostException.initCause(e);
                throw unknownHostException;
            }
        } catch (UnknownHostException unused) {
            return EmptyList.b;
        }
    }

    @Override // xsna.tsn
    public final List<InetAddress> a(String str) {
        if (!str.equals(this.b.getHost())) {
            return b(str);
        }
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            arrayList.addAll(b(str));
        }
        return arrayList;
    }
}
