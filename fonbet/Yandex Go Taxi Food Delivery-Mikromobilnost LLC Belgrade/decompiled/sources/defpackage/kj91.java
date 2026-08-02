package defpackage;

import com.google.android.gms.internal.mlkit_vision_face.zzks;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class kj91 {
    public final zzks a;
    public final Boolean b;
    public final fna1 c;
    public final Integer d;
    public final Integer e;

    public /* synthetic */ kj91(dj91 dj91Var) {
        this.a = dj91Var.a;
        this.b = dj91Var.b;
        this.c = dj91Var.c;
        this.d = dj91Var.d;
        this.e = dj91Var.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kj91)) {
            return false;
        }
        kj91 kj91Var = (kj91) obj;
        return ooc.m(this.a, kj91Var.a) && ooc.m(this.b, kj91Var.b) && ooc.m(null, null) && ooc.m(this.c, kj91Var.c) && ooc.m(this.d, kj91Var.d) && ooc.m(this.e, kj91Var.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c, this.d, this.e});
    }
}
