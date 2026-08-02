package xsna;

import java.util.Objects;

/* compiled from: ParsedTextUiDto.kt */
/* loaded from: classes4.dex */
public final class fj90 {
    public final ej90 a;

    public fj90(ej90 ej90Var) {
        this.a = ej90Var;
    }

    public static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i * 31) + charSequence.charAt(i2);
        }
        return i;
    }

    public static boolean b(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence.length() == charSequence2.length()) {
            int length = charSequence.length();
            for (int i = 0; i < length; i++) {
                if (charSequence.charAt(i) == charSequence2.charAt(i)) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!fj90.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        fj90 fj90Var = (fj90) obj;
        ej90 ej90Var = this.a;
        CharSequence charSequence = ej90Var.a;
        ej90 ej90Var2 = fj90Var.a;
        ej90 ej90Var3 = fj90Var.a;
        return b(charSequence, ej90Var2.a) && b(ej90Var.c, ej90Var3.c) && b(ej90Var.b, ej90Var3.b);
    }

    public final int hashCode() {
        ej90 ej90Var = this.a;
        return Objects.hash(Integer.valueOf(a(ej90Var.a)), Integer.valueOf(a(ej90Var.c)), Integer.valueOf(a(ej90Var.b)));
    }
}
