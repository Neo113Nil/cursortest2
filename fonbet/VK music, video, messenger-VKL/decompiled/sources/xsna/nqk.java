package xsna;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class nqk implements Predicate {
    public final /* synthetic */ int a;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((pt50) obj) instanceof one.video.calls.sdk_private.b;
            default:
                return ((InetAddress) obj) instanceof Inet6Address;
        }
    }
}
