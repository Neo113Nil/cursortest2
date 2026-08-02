package defpackage;

import android.content.Intent;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class n7z extends t7z {
    public final Intent a;

    public n7z(Intent intent) {
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n7z) && jl40.l(this.a, ((n7z) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AppShortcut(intent=" + this.a + Extension.C_BRAKE;
    }
}
