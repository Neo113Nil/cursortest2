package defpackage;

import com.ybsdk.widgets.common.e;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class b5m0 implements d5m0 {
    public final e a;

    public b5m0(e eVar) {
        this.a = eVar;
    }

    public final e a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b5m0) && this.a.equals(((b5m0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Content(statusState=" + this.a + Extension.C_BRAKE;
    }
}
