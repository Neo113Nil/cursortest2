package xsna;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class wky0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InetAddress inetAddress = (InetAddress) obj;
        if (inetAddress instanceof Inet6Address) {
            return -1;
        }
        return inetAddress instanceof Inet4Address ? 1 : 0;
    }
}
