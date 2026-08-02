package defpackage;

import com.yandex.go.splash.data.dto.DynamicSplash;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class g9n implements bst0 {
    public final DynamicSplash a;

    public g9n(DynamicSplash dynamicSplash) {
        this.a = dynamicSplash;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g9n) && this.a.equals(((g9n) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicSplashConfig(splashScreen=" + this.a + Extension.C_BRAKE;
    }
}
