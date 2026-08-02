package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class o6i implements f6i {
    public final ArrayList a;
    public final doe b;
    public final Object c;
    public final String d;
    public final String e;

    public o6i(ArrayList arrayList, doe doeVar, Object obj, String str, String str2) {
        this.a = arrayList;
        this.b = doeVar;
        this.c = obj;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.f6i
    public final List a() {
        return this.a;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final Object d() {
        return this.c;
    }

    public final doe e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6i)) {
            return false;
        }
        o6i o6iVar = (o6i) obj;
        return this.a.equals(o6iVar.a) && this.b.equals(o6iVar.b) && this.c.equals(o6iVar.c) && jl40.l(this.d, o6iVar.d) && jl40.l(this.e, o6iVar.e);
    }

    public final int hashCode() {
        int b = unr0.b(smw0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryDraftV2(offers=");
        sb.append(this.a);
        sb.append(", userCurrentLocation=");
        sb.append(this.b);
        sb.append(", state=");
        sb.append(this.c);
        sb.append(", mode=");
        sb.append(this.d);
        sb.append(", scenario=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
