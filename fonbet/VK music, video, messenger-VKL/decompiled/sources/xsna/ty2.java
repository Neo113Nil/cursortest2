package xsna;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class ty2<O extends a.d> {
    public final int a;
    public final com.google.android.gms.common.api.a b;

    @Nullable
    public final a.d c;

    @Nullable
    public final String d;

    public ty2(com.google.android.gms.common.api.a aVar, @Nullable a.d dVar, @Nullable String str) {
        this.b = aVar;
        this.c = dVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{aVar, dVar, str, null});
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ty2)) {
            return false;
        }
        ty2 ty2Var = (ty2) obj;
        return dq70.b(this.b, ty2Var.b) && dq70.b(this.c, ty2Var.c) && dq70.b(this.d, ty2Var.d) && dq70.b(null, null);
    }

    public final int hashCode() {
        return this.a;
    }
}
