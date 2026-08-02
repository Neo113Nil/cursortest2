package defpackage;

import com.yandex.go.notifications.acknowledge.data.model.PushAckStatus;
import com.yandex.go.notifications.acknowledge.domain.a;
import java.util.Map;

/* loaded from: classes6.dex */
public final class n0g0 implements v1g0 {
    public final h3y a;

    public n0g0(h3y h3yVar) {
        this.a = h3yVar;
    }

    @Override // defpackage.v1g0
    public final boolean a(Map map) {
        if (!map.containsKey("id")) {
            return false;
        }
        ((a) this.a.get()).b((String) map.get("id"), PushAckStatus.DELIVERED);
        return false;
    }
}
