package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersQrScootersQrSection;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class hqo0 {
    public static ScootersQrScootersQrSection a(String str) {
        Object obj;
        Iterator<E> it = ScootersQrScootersQrSection.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((ScootersQrScootersQrSection) obj).getValue(), str, true)) {
                break;
            }
        }
        return (ScootersQrScootersQrSection) obj;
    }
}
