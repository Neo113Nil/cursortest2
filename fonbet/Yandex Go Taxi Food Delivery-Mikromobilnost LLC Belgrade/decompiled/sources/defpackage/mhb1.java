package defpackage;

import com.google.android.gms.internal.mlkit_vision_barcode.zzqi;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class mhb1 {
    public final zzqi a;
    public final Integer b;

    public /* synthetic */ mhb1(dhb1 dhb1Var) {
        this.a = dhb1Var.a;
        this.b = dhb1Var.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mhb1)) {
            return false;
        }
        mhb1 mhb1Var = (mhb1) obj;
        return ooc.m(this.a, mhb1Var.a) && ooc.m(this.b, mhb1Var.b) && ooc.m(null, null) && ooc.m(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
