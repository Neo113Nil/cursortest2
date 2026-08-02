package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersPromocodesSection;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class hno0 {
    public static ScootersPromocodesSection a(String str) {
        Object obj;
        Iterator<E> it = ScootersPromocodesSection.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((ScootersPromocodesSection) obj).getValue(), str, true)) {
                break;
            }
        }
        return (ScootersPromocodesSection) obj;
    }
}
