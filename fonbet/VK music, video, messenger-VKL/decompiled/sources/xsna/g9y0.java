package xsna;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class g9y0 {
    public static final g9y0 g = new g9y0("empty", "empty", null, null, null, null);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final List f;

    public g9y0(String str, String str2, String str3, String str4, Integer num, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = num;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != null && g9y0.class == obj.getClass()) {
            g9y0 g9y0Var = (g9y0) obj;
            if (Objects.equals(this.a, g9y0Var.a) && Objects.equals(this.b, g9y0Var.b) && Objects.equals(this.c, g9y0Var.c) && Objects.equals(this.d, g9y0Var.d) && Objects.equals(this.e, g9y0Var.e) && Objects.equals(this.f, g9y0Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
