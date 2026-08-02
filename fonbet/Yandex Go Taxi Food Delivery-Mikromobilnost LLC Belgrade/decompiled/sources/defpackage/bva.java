package defpackage;

import com.yandex.go.deeplinks.generated.chargers.ChargersSubscriptionSection;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class bva {
    public static ChargersSubscriptionSection a(String str) {
        Object obj;
        Iterator<E> it = ChargersSubscriptionSection.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((ChargersSubscriptionSection) obj).getValue(), str, true)) {
                break;
            }
        }
        return (ChargersSubscriptionSection) obj;
    }
}
