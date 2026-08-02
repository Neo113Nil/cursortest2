package defpackage;

import java.util.Iterator;
import ru.yandex.taxi.eats_commons.EatsService;

/* loaded from: classes9.dex */
public final class cwq0 {
    public static h1p a(String str) {
        Object obj;
        Iterator<E> it = EatsService.f().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((EatsService) obj).getValue(), str)) {
                break;
            }
        }
        EatsService eatsService = (EatsService) obj;
        return eatsService != null ? eatsService : new f7n(str);
    }
}
