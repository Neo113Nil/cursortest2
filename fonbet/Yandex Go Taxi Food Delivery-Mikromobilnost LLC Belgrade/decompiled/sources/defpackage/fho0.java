package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersPersonalGoalsSection;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class fho0 {
    public static ScootersPersonalGoalsSection a(String str) {
        Object obj;
        Iterator<E> it = ScootersPersonalGoalsSection.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((ScootersPersonalGoalsSection) obj).getValue(), str, true)) {
                break;
            }
        }
        return (ScootersPersonalGoalsSection) obj;
    }
}
