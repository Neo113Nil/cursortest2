package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class apf0 implements fpf0 {
    public final dpf0 a;

    public apf0(dpf0 dpf0Var) {
        this.a = dpf0Var;
    }

    @Override // defpackage.fpf0
    public final dpf0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof apf0) && this.a.equals(((apf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActionArrowButtonClicked(actionInfo=" + this.a + Extension.C_BRAKE;
    }
}
