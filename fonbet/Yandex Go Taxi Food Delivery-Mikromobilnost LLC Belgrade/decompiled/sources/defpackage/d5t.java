package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class d5t {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final String d;

    public d5t(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5t)) {
            return false;
        }
        d5t d5tVar = (d5t) obj;
        return jl40.l(this.a, d5tVar.a) && this.b.equals(d5tVar.b) && jl40.l(this.c, d5tVar.c) && jl40.l(this.d, d5tVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(ly3.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(x4e.m("GetCodeEntity(deeplink=", this.a, ", analytics=", ", title=", this.b), this.c, ", body=", this.d, Extension.C_BRAKE);
    }
}
