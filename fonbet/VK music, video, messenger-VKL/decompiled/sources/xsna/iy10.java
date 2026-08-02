package xsna;

import android.text.TextUtils;
import java.util.Objects;

/* compiled from: MediaSessionManagerImplBase.java */
/* loaded from: classes12.dex */
public class iy10 {
    public final String a;
    public final int b;
    public final int c;

    public iy10(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy10)) {
            return false;
        }
        iy10 iy10Var = (iy10) obj;
        int i = this.c;
        String str = this.a;
        int i2 = this.b;
        return (i2 < 0 || iy10Var.b < 0) ? TextUtils.equals(str, iy10Var.a) && i == iy10Var.c : TextUtils.equals(str, iy10Var.a) && i2 == iy10Var.b && i == iy10Var.c;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }
}
