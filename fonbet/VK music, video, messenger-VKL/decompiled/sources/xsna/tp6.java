package xsna;

import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: BaseUrl.java */
/* loaded from: classes12.dex */
public final class tp6 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public tp6(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp6)) {
            return false;
        }
        tp6 tp6Var = (tp6) obj;
        return this.c == tp6Var.c && this.d == tp6Var.d && Objects.equals(this.a, tp6Var.a) && Objects.equals(this.b, tp6Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }
}
