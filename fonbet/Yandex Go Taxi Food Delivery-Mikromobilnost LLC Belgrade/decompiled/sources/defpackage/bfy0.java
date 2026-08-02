package defpackage;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lbfy0;", "", "Companion", "zey0", "afy0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class bfy0 {
    public static final afy0 Companion = new afy0();
    public final String a;
    public final String b;

    public /* synthetic */ bfy0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
    }

    public static final /* synthetic */ void c(bfy0 bfy0Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(bfy0Var.a, "")) {
            yjdVar.o(serialDescriptor, 0, bfy0Var.a);
        }
        if (!yjdVar.F() && jl40.l(bfy0Var.b, "")) {
            return;
        }
        yjdVar.o(serialDescriptor, 1, bfy0Var.b);
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfy0)) {
            return false;
        }
        bfy0 bfy0Var = (bfy0) obj;
        return jl40.l(this.a, bfy0Var.a) && jl40.l(this.b, bfy0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("TemplateDto(key=", this.a, ", value=", this.b, Extension.C_BRAKE);
    }

    public bfy0() {
        this.a = "";
        this.b = "";
    }
}
