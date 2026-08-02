package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ncz0 {
    public final ArrayList a;
    public final String b;
    public final v9z0 c;

    public ncz0(ArrayList arrayList, String str, v9z0 v9z0Var) {
        this.a = arrayList;
        this.b = str;
        this.c = v9z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncz0)) {
            return false;
        }
        ncz0 ncz0Var = (ncz0) obj;
        return this.a.equals(ncz0Var.a) && jl40.l(this.b, ncz0Var.b) && jl40.l(this.c, ncz0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        v9z0 v9z0Var = this.c;
        return hashCode2 + (v9z0Var != null ? v9z0Var.hashCode() : 0);
    }

    public final String toString() {
        return "TimelineModel(horizontal=" + this.a + ", currentItemId=" + this.b + ", bubble=" + this.c + Extension.C_BRAKE;
    }
}
