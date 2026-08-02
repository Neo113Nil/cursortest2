package defpackage;

import com.google.android.datatransport.Priority;

/* loaded from: classes.dex */
public final class g64 extends jeo {
    public final Object a;
    public final Priority b;
    public final p7f0 c;

    public g64(Object obj, Priority priority, y74 y74Var) {
        if (obj == null) {
            ny61.t("Null payload");
            throw null;
        }
        this.a = obj;
        if (priority == null) {
            ny61.t("Null priority");
            throw null;
        }
        this.b = priority;
        this.c = y74Var;
    }

    @Override // defpackage.jeo
    public final Integer a() {
        return null;
    }

    @Override // defpackage.jeo
    public final bfo b() {
        return null;
    }

    @Override // defpackage.jeo
    public final Object c() {
        return this.a;
    }

    @Override // defpackage.jeo
    public final Priority d() {
        return this.b;
    }

    @Override // defpackage.jeo
    public final p7f0 e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jeo)) {
            return false;
        }
        jeo jeoVar = (jeo) obj;
        if (jeoVar.a() != null || !this.a.equals(jeoVar.c()) || !this.b.equals(jeoVar.d())) {
            return false;
        }
        p7f0 p7f0Var = this.c;
        if (p7f0Var == null) {
            if (jeoVar.e() != null) {
                return false;
            }
        } else if (!p7f0Var.equals(jeoVar.e())) {
            return false;
        }
        return jeoVar.b() == null;
    }

    public final int hashCode() {
        int hashCode = ((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
        p7f0 p7f0Var = this.c;
        return ((p7f0Var == null ? 0 : p7f0Var.hashCode()) ^ hashCode) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + this.b + ", productData=" + this.c + ", eventContext=null}";
    }
}
