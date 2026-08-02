package defpackage;

import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class np91 {
    public final zzou a;
    public final Boolean b;
    public final qnb1 c;

    public /* synthetic */ np91(fp91 fp91Var) {
        this.a = fp91Var.a;
        this.b = fp91Var.b;
        this.c = fp91Var.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof np91)) {
            return false;
        }
        np91 np91Var = (np91) obj;
        return ooc.m(this.a, np91Var.a) && ooc.m(null, null) && ooc.m(this.b, np91Var.b) && ooc.m(null, null) && ooc.m(this.c, np91Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, null, this.b, null, this.c});
    }
}
