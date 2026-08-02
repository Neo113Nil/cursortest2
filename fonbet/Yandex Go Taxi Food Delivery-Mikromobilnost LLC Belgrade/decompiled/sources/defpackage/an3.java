package defpackage;

import java.util.Objects;

/* loaded from: classes15.dex */
public final class an3 extends cn3 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public an3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.cn3
    public final t4j0 a(t4j0 t4j0Var) {
        t4j0Var.a("X-Upgrade-From", "YAMBAUTH " + this.a);
        t4j0Var.a("Authorization", "OAuth " + this.b);
        return t4j0Var;
    }

    @Override // defpackage.cn3
    public final boolean d(String str, String str2) {
        if (!("YAMBAUTH " + this.a).equals(str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder("OAuth ");
        sb.append(this.b);
        return sb.toString().equals(str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cn3)) {
            return this == obj;
        }
        return ((cn3) obj).d("YAMBAUTH " + this.a, "OAuth " + this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return "Upgrade from YAMBAUTH to OAuth";
    }
}
