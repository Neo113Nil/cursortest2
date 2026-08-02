package defpackage;

import androidx.core.app.b;
import androidx.fragment.app.FragmentActivity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class c0b0 implements d0b0 {
    public final String a;

    public c0b0(String str) {
        this.a = str;
    }

    @Override // defpackage.d0b0
    public final boolean a(FragmentActivity fragmentActivity) {
        return b.M(fragmentActivity, this.a);
    }

    @Override // defpackage.d0b0
    public final String b() {
        return this.a;
    }

    @Override // defpackage.d0b0
    public final boolean c(FragmentActivity fragmentActivity) {
        return qke.h(fragmentActivity, this.a) == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0b0) && this.a.equals(((c0b0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Single(permission=", this.a, Extension.C_BRAKE);
    }
}
