package defpackage;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lfkp;", "", "Companion", "bkp", "ckp", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class fkp {
    public static final ckp Companion = new ckp();
    public final String a;
    public final jmp b;
    public final zlp c;

    public /* synthetic */ fkp(int i, String str, jmp jmpVar, zlp zlpVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = jmpVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = zlpVar;
        }
    }

    public static fkp a(fkp fkpVar, jmp jmpVar) {
        return new fkp(fkpVar.a, jmpVar, fkpVar.c);
    }

    public static final /* synthetic */ void e(fkp fkpVar, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || fkpVar.a != null) {
            yjdVar.g(serialDescriptor, 0, auu0.a, fkpVar.a);
        }
        if (yjdVar.F() || fkpVar.b != null) {
            yjdVar.g(serialDescriptor, 1, hmp.a, fkpVar.b);
        }
        if (!yjdVar.F() && fkpVar.c == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 2, xlp.a, fkpVar.c);
    }

    /* renamed from: b, reason: from getter */
    public final zlp getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: d, reason: from getter */
    public final jmp getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkp)) {
            return false;
        }
        fkp fkpVar = (fkp) obj;
        return jl40.l(this.a, fkpVar.a) && jl40.l(this.b, fkpVar.b) && jl40.l(this.c, fkpVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        jmp jmpVar = this.b;
        int hashCode2 = (hashCode + (jmpVar == null ? 0 : jmpVar.hashCode())) * 31;
        zlp zlpVar = this.c;
        return hashCode2 + (zlpVar != null ? zlpVar.hashCode() : 0);
    }

    public final String toString() {
        return "Feature(id=" + this.a + ", properties=" + this.b + ", geometry=" + this.c + Extension.C_BRAKE;
    }

    public fkp(String str, jmp jmpVar, zlp zlpVar) {
        this.a = str;
        this.b = jmpVar;
        this.c = zlpVar;
    }

    public fkp() {
        this(null, null, null);
    }
}
