package xsna;

import com.vk.dto.common.Good;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Objects;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class nh8 implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ nh8(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return Objects.nonNull((Good) obj);
            default:
                return ((InetAddress) obj) instanceof Inet4Address;
        }
    }
}
