package defpackage;

import java.lang.reflect.Constructor;
import java.security.cert.CertPathValidatorException;
import ru.CryptoPro.JCP.tools.Platform;

/* loaded from: classes4.dex */
public class er61 {
    public static boolean a() {
        if (!Platform.isAndroid) {
            return true;
        }
        for (Constructor<?> constructor : CertPathValidatorException.class.getDeclaredConstructors()) {
            if (constructor.getParameterTypes().length == 5) {
                return true;
            }
        }
        return false;
    }
}
