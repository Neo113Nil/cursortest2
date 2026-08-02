package defpackage;

import android.app.PendingIntent;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class apx implements qas0 {
    public final PendingIntent a;

    public apx(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    public final PendingIntent a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof apx) && this.a.equals(((apx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EnableLocationServices(settingsIntent=" + this.a + Extension.C_BRAKE;
    }
}
