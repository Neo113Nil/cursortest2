package xsna;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: LottieResult.java */
/* loaded from: classes12.dex */
public final class u800<V> {

    @Nullable
    public final i700 a;

    @Nullable
    public final Throwable b;

    public u800(i700 i700Var) {
        this.a = i700Var;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u800)) {
            return false;
        }
        u800 u800Var = (u800) obj;
        i700 i700Var = this.a;
        if (i700Var != null && i700Var.equals(u800Var.a)) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || u800Var.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public u800(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
