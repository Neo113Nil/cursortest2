package defpackage;

import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class kkb0 implements lkb0 {
    public final String a = UUID.randomUUID().toString();
    public final String b;
    public final String c;

    public kkb0(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.lkb0
    public final String a() {
        return this.b;
    }

    @Override // defpackage.lkb0
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkb0)) {
            return false;
        }
        kkb0 kkb0Var = (kkb0) obj;
        return jl40.l(this.a, kkb0Var.a) && jl40.l(this.b, kkb0Var.b) && jl40.l(this.c, kkb0Var.c);
    }

    @Override // defpackage.mkb0
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("Remote(id=", this.a, ", uploadedImagePath=", this.b, ", downloadLink="), this.c, Extension.C_BRAKE);
    }
}
