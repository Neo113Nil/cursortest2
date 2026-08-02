package xsna;

import com.vk.log.L;
import java.util.Arrays;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class s6b implements izs {
    public final /* synthetic */ int b;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                L.g("ChannelNewMessagesNotificationsHandler", (Throwable) obj);
                return s3q0.a;
            case 1:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
            default:
                asu0.a.getClass();
                return asu0.i();
        }
    }
}
