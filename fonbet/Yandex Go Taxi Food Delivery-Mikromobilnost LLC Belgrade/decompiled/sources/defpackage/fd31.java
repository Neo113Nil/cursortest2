package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ErrorButtonAction;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class fd31 implements ge31 {
    public final ErrorButtonAction a;

    public fd31(ErrorButtonAction errorButtonAction) {
        this.a = errorButtonAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fd31) && this.a == ((fd31) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ButtonAction(action=" + this.a + Extension.C_BRAKE;
    }
}
