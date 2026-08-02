package defpackage;

import com.yandex.go.account.api.superapp.CookieInjectionResult$Failure$Reason;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ene implements gne {
    public final CookieInjectionResult$Failure$Reason a;

    public ene(CookieInjectionResult$Failure$Reason cookieInjectionResult$Failure$Reason) {
        this.a = cookieInjectionResult$Failure$Reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ene) && this.a == ((ene) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(reason=" + this.a + Extension.C_BRAKE;
    }
}
