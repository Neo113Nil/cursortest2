package xsna;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@Deprecated
/* loaded from: classes12.dex */
public final class tqz0 implements a.d, a.d.InterfaceC0113d {
    public static final tqz0 d;
    public final boolean b;

    @Nullable
    public final String c;

    static {
        sqz0 sqz0Var = new sqz0();
        sqz0Var.a = Boolean.FALSE;
        d = new tqz0(sqz0Var);
    }

    public tqz0(sqz0 sqz0Var) {
        this.b = sqz0Var.a.booleanValue();
        this.c = sqz0Var.b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tqz0)) {
            return false;
        }
        tqz0 tqz0Var = (tqz0) obj;
        tqz0Var.getClass();
        return dq70.b(null, null) && this.b == tqz0Var.b && dq70.b(this.c, tqz0Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.b), this.c});
    }
}
