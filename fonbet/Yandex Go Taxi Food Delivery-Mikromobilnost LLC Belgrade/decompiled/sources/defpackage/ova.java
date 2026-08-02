package defpackage;

import com.yandex.go.deeplinks.generated.chargers.ChargersSuperpassSection;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class ova {
    public static ChargersSuperpassSection a(String str) {
        Object obj;
        Iterator<E> it = ChargersSuperpassSection.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((ChargersSuperpassSection) obj).getValue(), str, true)) {
                break;
            }
        }
        return (ChargersSuperpassSection) obj;
    }
}
