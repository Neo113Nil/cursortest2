package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class p4b0 extends t4b0 {
    public final String a;

    public p4b0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p4b0) && jl40.l(this.a, ((p4b0) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("CloseButtonClickedAction(selectedGoalId=", this.a, Extension.C_BRAKE);
    }
}
