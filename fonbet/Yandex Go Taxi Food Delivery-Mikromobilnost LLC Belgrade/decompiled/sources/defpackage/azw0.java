package defpackage;

import android.view.View;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class azw0 {
    public final View a;
    public final boolean b;

    public azw0(View view, boolean z) {
        this.a = view;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azw0)) {
            return false;
        }
        azw0 azw0Var = (azw0) obj;
        return this.a.equals(azw0Var.a) && this.b == azw0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SwitchDivItem(view=" + this.a + ", wasShownOnScreen=" + this.b + Extension.C_BRAKE;
    }
}
