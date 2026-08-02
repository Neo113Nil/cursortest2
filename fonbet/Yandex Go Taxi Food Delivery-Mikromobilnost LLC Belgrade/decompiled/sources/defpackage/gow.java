package defpackage;

import com.yandex.go.deeplinks.generated.city_mode.IntercityMode;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class gow {
    public static IntercityMode a(String str) {
        Object obj;
        Iterator<E> it = IntercityMode.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((IntercityMode) obj).getValue(), str, true)) {
                break;
            }
        }
        return (IntercityMode) obj;
    }
}
