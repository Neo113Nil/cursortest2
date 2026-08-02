package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class poq0 {
    public final ArrayList a;
    public final Object b;

    public poq0(ArrayList arrayList, Object obj) {
        this.a = arrayList;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof poq0)) {
            return false;
        }
        poq0 poq0Var = (poq0) obj;
        return this.a.equals(poq0Var.a) && jl40.l(this.b, poq0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "SendEventPayload(availableEvents=" + this.a + ", meta=" + this.b + Extension.C_BRAKE;
    }
}
