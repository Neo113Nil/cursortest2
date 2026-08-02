package xsna;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Comparator;
import xsna.iy70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class jy70 implements Comparator {
    public final /* synthetic */ int b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                iy70.b bVar = (iy70.b) obj;
                iy70.b bVar2 = (iy70.b) obj2;
                if (bVar == null || bVar2 == null) {
                    return 0;
                }
                return bVar.a.g != bVar2.a.g ? Boolean.compare(bVar.a.g, bVar2.a.g) : epx.f(bVar.a.b.getId(), bVar2.a.b.getId()) ? epx.h(bVar.a.e, bVar2.a.e) : epx.h(bVar2.a.e, bVar.a.e);
            default:
                InetAddress inetAddress = (InetAddress) obj;
                if (inetAddress instanceof Inet4Address) {
                    return -1;
                }
                return inetAddress instanceof Inet6Address ? 1 : 0;
        }
    }
}
