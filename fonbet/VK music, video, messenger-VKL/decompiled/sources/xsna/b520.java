package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class b520 {

    @NonNull
    public final String a;

    @NonNull
    public final String b;

    @Nullable
    public final String c;
    public final int d;

    public b520(@NonNull String str, int i, @NonNull String str2, @Nullable String str3) {
        this.a = str;
        this.d = i;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b520)) {
            return false;
        }
        b520 b520Var = (b520) obj;
        return this.d == b520Var.d && this.a.equals(b520Var.a) && this.b.equals(b520Var.b) && Objects.equals(this.c, b520Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Integer.valueOf(this.d));
    }
}
