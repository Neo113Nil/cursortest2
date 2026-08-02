package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class gsh {
    public final boolean a;
    public final String b;

    public gsh(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsh)) {
            return false;
        }
        gsh gshVar = (gsh) obj;
        return this.a == gshVar.a && jl40.l(this.b, gshVar.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return xvz.m("DeleteWarningState(showDeleteWarning=", this.a, ", deletingTrustedContactId=", this.b, Extension.C_BRAKE);
    }

    public /* synthetic */ gsh(int i) {
        this(false, null);
    }

    public gsh() {
        this(0);
    }
}
