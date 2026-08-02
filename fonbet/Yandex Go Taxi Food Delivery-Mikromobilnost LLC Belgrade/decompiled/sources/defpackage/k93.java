package defpackage;

import java.io.IOException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class k93 {
    public final String a;
    public final IOException b;

    public k93(String str, IOException iOException) {
        this.a = str;
        this.b = iOException;
    }

    public final String a() {
        return this.a;
    }

    public final String toString() {
        return this.a + " (caused by " + this.b + Extension.C_BRAKE;
    }
}
