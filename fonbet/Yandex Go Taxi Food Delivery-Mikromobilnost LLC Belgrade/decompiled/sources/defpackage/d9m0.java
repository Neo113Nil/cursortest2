package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class d9m0 extends e9m0 {
    public final String c;
    public final Text.Constant d;
    public final Text.Constant e;
    public final Text.Constant f;
    public final String g;
    public final ArrayList h;

    public d9m0(String str, Text.Constant constant, Text.Constant constant2, Text.Constant constant3, String str2, ArrayList arrayList) {
        super(str, 2);
        this.c = str;
        this.d = constant;
        this.e = constant2;
        this.f = constant3;
        this.g = str2;
        this.h = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9m0)) {
            return false;
        }
        d9m0 d9m0Var = (d9m0) obj;
        return jl40.l(this.c, d9m0Var.c) && this.d.equals(d9m0Var.d) && this.e.equals(d9m0Var.e) && this.f.equals(d9m0Var.f) && jl40.l(this.g, d9m0Var.g) && this.h.equals(d9m0Var.h);
    }

    public final int hashCode() {
        int d = xvz.d(this.f, xvz.d(this.e, xvz.d(this.d, this.c.hashCode() * 31, 31), 31), 31);
        String str = this.g;
        return this.h.hashCode() + ((d + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "Interest(id=" + this.c + ", title=" + this.d + ", titleBalance=" + this.e + ", subtitle=" + this.f + ", action=" + this.g + ", details=" + this.h + Extension.C_BRAKE;
    }
}
