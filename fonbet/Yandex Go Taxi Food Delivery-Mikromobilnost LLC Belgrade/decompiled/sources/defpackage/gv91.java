package defpackage;

import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class gv91 {
    public final zzrb a;
    public final Boolean b;
    public final zub1 c;
    public final zzcs d;
    public final zzcs e;

    public /* synthetic */ gv91(wu91 wu91Var) {
        this.a = wu91Var.a;
        this.b = wu91Var.b;
        this.c = wu91Var.c;
        this.d = wu91Var.d;
        this.e = wu91Var.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gv91)) {
            return false;
        }
        gv91 gv91Var = (gv91) obj;
        return ooc.m(this.a, gv91Var.a) && ooc.m(null, null) && ooc.m(this.b, gv91Var.b) && ooc.m(null, null) && ooc.m(this.c, gv91Var.c) && ooc.m(this.d, gv91Var.d) && ooc.m(this.e, gv91Var.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, null, this.b, null, this.c, this.d, this.e});
    }
}
