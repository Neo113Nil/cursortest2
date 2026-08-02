package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dtj0 {
    public final ArrayList a;
    public final String b;

    public dtj0(ArrayList arrayList, String str) {
        this.a = arrayList;
        this.b = str;
    }

    public final List a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtj0)) {
            return false;
        }
        dtj0 dtj0Var = (dtj0) obj;
        return this.a.equals(dtj0Var.a) && jl40.l(this.b, dtj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ResolvingQrRulesEntity(rules=" + this.a + ", unknownQrDeeplink=" + this.b + Extension.C_BRAKE;
    }
}
