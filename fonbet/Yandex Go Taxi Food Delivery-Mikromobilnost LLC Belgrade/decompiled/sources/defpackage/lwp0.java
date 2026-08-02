package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class lwp0 extends nwp0 {
    public final CharSequence a;

    public lwp0(String str) {
        this.a = str;
    }

    @Override // defpackage.nwp0
    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lwp0) && jl40.l(this.a, ((lwp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.h(this.a, "ErrorWithAction(input=", Extension.C_BRAKE);
    }
}
