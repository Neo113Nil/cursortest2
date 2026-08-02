package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersBiometricAuthorizationSection;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class b1n0 {
    public static ScootersBiometricAuthorizationSection a(String str) {
        Object obj;
        Iterator<E> it = ScootersBiometricAuthorizationSection.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((ScootersBiometricAuthorizationSection) obj).getValue(), str, true)) {
                break;
            }
        }
        return (ScootersBiometricAuthorizationSection) obj;
    }
}
