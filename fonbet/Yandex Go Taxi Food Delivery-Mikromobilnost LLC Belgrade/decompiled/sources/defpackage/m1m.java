package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class m1m implements kq90 {
    public final u1m a;

    public m1m(u1m u1mVar) {
        this.a = u1mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return m1m.class.equals(obj != null ? obj.getClass() : null) && jl40.l(this.a, ((m1m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DocumentModifyPatchParams(query=" + this.a + Extension.C_BRAKE;
    }
}
