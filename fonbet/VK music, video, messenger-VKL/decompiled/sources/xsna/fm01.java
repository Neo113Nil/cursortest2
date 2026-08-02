package xsna;

import android.os.UserHandle;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class fm01 {

    @Nullable
    public final String a;

    @Nullable
    public final String b;
    public final boolean c;

    @Nullable
    public final UserHandle d;

    public fm01(String str, String str2, boolean z, @Nullable UserHandle userHandle) {
        exc0.f(str);
        this.a = str;
        exc0.f(str2);
        this.b = str2;
        this.c = z;
        this.d = userHandle;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm01)) {
            return false;
        }
        fm01 fm01Var = (fm01) obj;
        return dq70.b(this.a, fm01Var.a) && dq70.b(this.b, fm01Var.b) && dq70.b(null, null) && this.c == fm01Var.c && dq70.b(this.d, fm01Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c), this.d});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        exc0.i(null);
        throw null;
    }
}
