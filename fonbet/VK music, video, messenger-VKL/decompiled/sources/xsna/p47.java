package xsna;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: BiometricErrorData.java */
/* loaded from: classes11.dex */
public final class p47 {
    public final int a;

    @Nullable
    public final CharSequence b;

    public p47(int i, @Nullable CharSequence charSequence) {
        this.a = i;
        this.b = charSequence;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof p47)) {
            return false;
        }
        p47 p47Var = (p47) obj;
        if (this.a != p47Var.a) {
            return false;
        }
        CharSequence charSequence = p47Var.b;
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
