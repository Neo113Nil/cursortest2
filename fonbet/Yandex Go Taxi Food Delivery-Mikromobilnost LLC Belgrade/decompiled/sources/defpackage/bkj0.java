package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class bkj0 implements dkj0 {
    public final int a;
    public final amj0 b;

    public bkj0(int i, amj0 amj0Var) {
        this.a = i;
        this.b = amj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkj0)) {
            return false;
        }
        bkj0 bkj0Var = (bkj0) obj;
        return this.a == bkj0Var.a && this.b.equals(bkj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "InLazyColumn(requirementIndex=" + this.a + ", requirementUiState=" + this.b + Extension.C_BRAKE;
    }
}
