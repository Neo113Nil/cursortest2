package defpackage;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lofb0;", "", "Companion", "mfb0", "nfb0", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ofb0 {
    public static final nfb0 Companion = new nfb0();
    public final String a;
    public final String b;

    public /* synthetic */ ofb0(int i, String str, String str2) {
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

    public static final /* synthetic */ void a(ofb0 ofb0Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(ofb0Var.a, "")) {
            yjdVar.o(serialDescriptor, 0, ofb0Var.a);
        }
        if (!yjdVar.F() && jl40.l(ofb0Var.b, "")) {
            return;
        }
        yjdVar.o(serialDescriptor, 1, ofb0Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofb0)) {
            return false;
        }
        ofb0 ofb0Var = (ofb0) obj;
        return jl40.l(this.a, ofb0Var.a) && jl40.l(this.b, ofb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("PhoneScreenDescriptionOverride(tariff=", this.a, ", description=", this.b, Extension.C_BRAKE);
    }

    public ofb0() {
        this.a = "";
        this.b = "";
    }
}
