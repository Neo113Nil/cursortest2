package xsna;

import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment$receiver$1;
import java.net.DatagramPacket;
import java.util.function.Predicate;
import one.video.calls.sdk_private.bE;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ojs implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ojs(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                int i2 = FriendRequestsFragment$receiver$1.b;
                return ((Boolean) ((njs) obj2).invoke(obj)).booleanValue();
            case 1:
                return ((Boolean) ((ut30) obj2).invoke(obj)).booleanValue();
            default:
                bE bEVar = (bE) obj2;
                DatagramPacket datagramPacket = (DatagramPacket) obj;
                bEVar.getClass();
                return datagramPacket.getAddress().equals(bEVar.A) && datagramPacket.getPort() == bEVar.x;
        }
    }
}
