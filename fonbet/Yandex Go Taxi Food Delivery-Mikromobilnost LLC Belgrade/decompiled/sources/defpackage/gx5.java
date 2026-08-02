package defpackage;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class gx5 {
    public final int a;
    public final CharSequence b;

    public gx5(int i, CharSequence charSequence) {
        this.a = i;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gx5)) {
            return false;
        }
        gx5 gx5Var = (gx5) obj;
        if (this.a != gx5Var.a) {
            return false;
        }
        CharSequence charSequence = gx5Var.b;
        CharSequence charSequence2 = this.b;
        String charSequence3 = charSequence2 != null ? charSequence2.toString() : null;
        String charSequence4 = charSequence != null ? charSequence.toString() : null;
        if (charSequence3 == null && charSequence4 == null) {
            return true;
        }
        return charSequence3 != null && charSequence3.equals(charSequence4);
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.a);
        CharSequence charSequence = this.b;
        return Arrays.hashCode(new Object[]{valueOf, charSequence != null ? charSequence.toString() : null});
    }
}
