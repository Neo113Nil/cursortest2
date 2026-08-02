package defpackage;

import com.google.android.gms.internal.mlkit_vision_text_common.zzob;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class o8b1 {
    public final zzob a;
    public final Integer b;

    public /* synthetic */ o8b1(f8b1 f8b1Var) {
        this.a = f8b1Var.a;
        this.b = f8b1Var.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o8b1)) {
            return false;
        }
        o8b1 o8b1Var = (o8b1) obj;
        return ooc.m(this.a, o8b1Var.a) && ooc.m(this.b, o8b1Var.b) && ooc.m(null, null) && ooc.m(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
