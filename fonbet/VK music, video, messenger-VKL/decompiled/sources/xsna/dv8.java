package xsna;

import androidx.annotation.NonNull;

/* compiled from: CLString.java */
/* loaded from: classes11.dex */
public final class dv8 extends yu8 {
    @NonNull
    public static dv8 n(@NonNull String str) {
        dv8 dv8Var = new dv8(str.toCharArray());
        dv8Var.c = 0L;
        dv8Var.m(str.length() - 1);
        return dv8Var;
    }

    @Override // xsna.yu8
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof dv8) && i().equals(((dv8) obj).i())) {
            return true;
        }
        return super.equals(obj);
    }
}
