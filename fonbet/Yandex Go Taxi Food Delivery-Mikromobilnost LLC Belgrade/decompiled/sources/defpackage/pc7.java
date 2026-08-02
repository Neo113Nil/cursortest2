package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class pc7 {
    public static final pc7 b = new pc7();
    public final oz50 a;

    public pc7() {
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pc7) {
            return jl40.l(this.a, ((pc7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        oz50 oz50Var = this.a;
        if (oz50Var != null) {
            return oz50Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WriteResult(response=" + this.a + Extension.C_BRAKE;
    }

    public pc7(oz50 oz50Var) {
        this.a = oz50Var;
    }
}
