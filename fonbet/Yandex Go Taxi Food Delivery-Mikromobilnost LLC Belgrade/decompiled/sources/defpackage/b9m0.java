package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class b9m0 extends e9m0 {
    public final String c;
    public final Text.Constant d;
    public final ArrayList e;
    public final a9m0 f;

    public b9m0(String str, Text.Constant constant, ArrayList arrayList, a9m0 a9m0Var) {
        super(str, 2);
        this.c = str;
        this.d = constant;
        this.e = arrayList;
        this.f = a9m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9m0)) {
            return false;
        }
        b9m0 b9m0Var = (b9m0) obj;
        return jl40.l(this.c, b9m0Var.c) && this.d.equals(b9m0Var.d) && this.e.equals(b9m0Var.e) && this.f.equals(b9m0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ly3.b(xvz.d(this.d, this.c.hashCode() * 31, 31), 31, this.e);
    }

    public final String toString() {
        return "Income(id=" + this.c + ", title=" + this.d + ", periods=" + this.e + ", progressAnimationDuration=" + this.f + Extension.C_BRAKE;
    }
}
