package xsna;

import com.vk.push.common.messaging.RemoteMessage;
import java.util.List;
import ru.rustore.sdk.pushclient.messaging.exception.RuStorePushClientException;

/* loaded from: classes9.dex */
public abstract class l1z0 {

    public static final class a extends l1z0 {
        public final RemoteMessage a;

        public a(RemoteMessage remoteMessage) {
            this.a = remoteMessage;
        }
    }

    public static final class b extends l1z0 {
        public final String a;

        public b(String str) {
            this.a = str;
        }
    }

    public static final class c extends l1z0 {
        public static final c a = new c();
    }

    public static final class d extends l1z0 {
        public final List<RuStorePushClientException> a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends RuStorePushClientException> list) {
            this.a = list;
        }
    }
}
