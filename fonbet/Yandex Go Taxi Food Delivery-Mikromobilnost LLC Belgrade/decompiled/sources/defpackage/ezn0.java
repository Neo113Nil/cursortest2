package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersMosRuAuthorizationSection;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class ezn0 {
    public static ScootersMosRuAuthorizationSection a(String str) {
        Object obj;
        Iterator<E> it = ScootersMosRuAuthorizationSection.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((ScootersMosRuAuthorizationSection) obj).getValue(), str, true)) {
                break;
            }
        }
        return (ScootersMosRuAuthorizationSection) obj;
    }
}
