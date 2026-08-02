package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersOrderSection;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class o6o0 {
    public static ScootersOrderSection a(String str) {
        Object obj;
        Iterator<E> it = ScootersOrderSection.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((ScootersOrderSection) obj).getValue(), str, true)) {
                break;
            }
        }
        return (ScootersOrderSection) obj;
    }
}
