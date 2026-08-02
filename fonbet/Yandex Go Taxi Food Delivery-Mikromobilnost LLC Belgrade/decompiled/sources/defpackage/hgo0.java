package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersPassesSection;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class hgo0 {
    public static ScootersPassesSection a(String str) {
        Object obj;
        Iterator<E> it = ScootersPassesSection.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((ScootersPassesSection) obj).getValue(), str, true)) {
                break;
            }
        }
        return (ScootersPassesSection) obj;
    }
}
