package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersIgnitionSection;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class lsn0 {
    public static ScootersIgnitionSection a(String str) {
        Object obj;
        Iterator<E> it = ScootersIgnitionSection.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((ScootersIgnitionSection) obj).getValue(), str, true)) {
                break;
            }
        }
        return (ScootersIgnitionSection) obj;
    }
}
