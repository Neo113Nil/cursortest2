package defpackage;

import android.os.Bundle;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fka0 implements qas0 {
    public final Bundle a;

    public fka0(Bundle bundle) {
        this.a = bundle;
    }

    public final Bundle a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fka0) && this.a.equals(((fka0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SetFragmentResult(bundle=" + this.a + Extension.C_BRAKE;
    }
}
