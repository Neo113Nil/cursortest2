package defpackage;

import kotlinx.serialization.KSerializer;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class kg5 {
    public final String a;
    public final jg5 b;
    public final KSerializer c;

    public kg5(String str, jg5 jg5Var, KSerializer kSerializer) {
        this.a = str;
        this.b = jg5Var;
        this.c = kSerializer;
    }

    public final jg5 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kg5)) {
            return false;
        }
        kg5 kg5Var = (kg5) obj;
        return this.a.equals(kg5Var.a) && jl40.l(this.b, kg5Var.b) && jl40.l(this.c, kg5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BduiActionInfo(type=" + this.a + ", handler=" + this.b + ", serializer=" + this.c + Extension.C_BRAKE;
    }
}
