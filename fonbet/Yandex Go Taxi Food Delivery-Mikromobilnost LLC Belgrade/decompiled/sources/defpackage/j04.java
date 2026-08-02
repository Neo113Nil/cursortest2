package defpackage;

import com.ybsdk.feature.autotopup.api.AutoTopupShowOnly;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class j04 {
    public final u8j0 a;
    public final AutoTopupShowOnly b;
    public final boolean c;
    public final List d;
    public final List e;
    public final h5a0 f;
    public final String g;
    public final h031 h;
    public final txz0 i;
    public final ku3 j;
    public final Integer k;
    public final Boolean l;
    public final String m;
    public final Boolean n;
    public final vou0 o;
    public final trc p;
    public final String q;

    public j04(u8j0 u8j0Var, AutoTopupShowOnly autoTopupShowOnly, boolean z, List list, List list2, h5a0 h5a0Var, String str, h031 h031Var, txz0 txz0Var, ku3 ku3Var, Integer num, Boolean bool, String str2, Boolean bool2, vou0 vou0Var, trc trcVar, String str3) {
        this.a = u8j0Var;
        this.b = autoTopupShowOnly;
        this.c = z;
        this.d = list;
        this.e = list2;
        this.f = h5a0Var;
        this.g = str;
        this.h = h031Var;
        this.i = txz0Var;
        this.j = ku3Var;
        this.k = num;
        this.l = bool;
        this.m = str2;
        this.n = bool2;
        this.o = vou0Var;
        this.p = trcVar;
        this.q = str3;
    }

    public static j04 a(j04 j04Var, u8j0 u8j0Var, boolean z, List list, List list2, h5a0 h5a0Var, String str, h031 h031Var, txz0 txz0Var, ku3 ku3Var, Integer num, Boolean bool, String str2, Boolean bool2, vou0 vou0Var, trc trcVar, String str3, int i) {
        u8j0 u8j0Var2 = (i & 1) != 0 ? j04Var.a : u8j0Var;
        AutoTopupShowOnly autoTopupShowOnly = j04Var.b;
        boolean z2 = (i & 4) != 0 ? j04Var.c : z;
        List list3 = (i & 8) != 0 ? j04Var.d : list;
        List list4 = (i & 16) != 0 ? j04Var.e : list2;
        h5a0 h5a0Var2 = (i & 32) != 0 ? j04Var.f : h5a0Var;
        String str4 = (i & 64) != 0 ? j04Var.g : str;
        h031 h031Var2 = (i & 128) != 0 ? j04Var.h : h031Var;
        txz0 txz0Var2 = (i & 256) != 0 ? j04Var.i : txz0Var;
        ku3 ku3Var2 = (i & 512) != 0 ? j04Var.j : ku3Var;
        Integer num2 = (i & 1024) != 0 ? j04Var.k : num;
        Boolean bool3 = (i & 2048) != 0 ? j04Var.l : bool;
        String str5 = (i & 4096) != 0 ? j04Var.m : str2;
        Boolean bool4 = (i & 8192) != 0 ? j04Var.n : bool2;
        u8j0 u8j0Var3 = u8j0Var2;
        vou0 vou0Var2 = (i & 16384) != 0 ? j04Var.o : vou0Var;
        trc trcVar2 = (i & 32768) != 0 ? j04Var.p : trcVar;
        j04Var.getClass();
        trc trcVar3 = trcVar2;
        String str6 = (i & 131072) != 0 ? j04Var.q : str3;
        j04Var.getClass();
        return new j04(u8j0Var3, autoTopupShowOnly, z2, list3, list4, h5a0Var2, str4, h031Var2, txz0Var2, ku3Var2, num2, bool3, str5, bool4, vou0Var2, trcVar3, str6);
    }

    public final String b() {
        Integer num = this.k;
        return (String) this.e.get(num != null ? num.intValue() : 0);
    }

    public final String c() {
        Integer num = this.k;
        return (String) this.d.get(num != null ? num.intValue() : 0);
    }

    public final boolean d() {
        qz3 qz3Var = (qz3) this.a.a();
        return (qz3Var != null ? qz3Var.i : null) != null;
    }

    public final boolean e() {
        lz3 lz3Var;
        h5a0 h5a0Var;
        String str = null;
        h5a0 h5a0Var2 = this.f;
        String id = h5a0Var2 != null ? h5a0Var2.getId() : null;
        u8j0 u8j0Var = this.a;
        qz3 qz3Var = (qz3) u8j0Var.a();
        if (qz3Var != null && (h5a0Var = qz3Var.m) != null) {
            str = h5a0Var.getId();
        }
        boolean l = jl40.l(id, str);
        boolean z = ((qz3) u8j0Var.a()) != null ? !r2.j.a : true;
        qz3 qz3Var2 = (qz3) u8j0Var.a();
        boolean z2 = (qz3Var2 == null || (lz3Var = qz3Var2.k) == null) ? true : !lz3Var.a;
        boolean z3 = z && z2;
        Boolean bool = this.n;
        if (bool != null) {
            z = !bool.booleanValue();
        }
        Boolean bool2 = this.l;
        if (bool2 != null) {
            z2 = !bool2.booleanValue();
        }
        return (z && z2) || (l && !(z3 && (!z || !z2))) || (h5a0Var2 instanceof f5a0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j04)) {
            return false;
        }
        j04 j04Var = (j04) obj;
        return this.a.equals(j04Var.a) && this.b == j04Var.b && this.c == j04Var.c && jl40.l(this.d, j04Var.d) && jl40.l(this.e, j04Var.e) && jl40.l(this.f, j04Var.f) && jl40.l(this.g, j04Var.g) && jl40.l(this.h, j04Var.h) && jl40.l(this.i, j04Var.i) && jl40.l(this.j, j04Var.j) && jl40.l(this.k, j04Var.k) && jl40.l(this.l, j04Var.l) && this.m.equals(j04Var.m) && jl40.l(this.n, j04Var.n) && jl40.l(this.o, j04Var.o) && jl40.l(this.p, j04Var.p) && jl40.l(this.q, j04Var.q);
    }

    public final boolean f() {
        qz3 qz3Var = (qz3) this.a.a();
        nz3 nz3Var = qz3Var != null ? qz3Var.h : null;
        List list = nz3Var != null ? nz3Var.a : null;
        if (list == null) {
            return true;
        }
        List list2 = list;
        h5a0 h5a0Var = this.f;
        return a.G(list2, h5a0Var != null ? h5a0Var.getId() : null) || (h5a0Var instanceof f5a0);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        AutoTopupShowOnly autoTopupShowOnly = this.b;
        int c = unr0.c(unr0.c(unr0.e((hashCode + (autoTopupShowOnly == null ? 0 : autoTopupShowOnly.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        h5a0 h5a0Var = this.f;
        int hashCode2 = (c + (h5a0Var == null ? 0 : h5a0Var.hashCode())) * 31;
        String str = this.g;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        h031 h031Var = this.h;
        int hashCode4 = (hashCode3 + (h031Var == null ? 0 : h031Var.hashCode())) * 31;
        txz0 txz0Var = this.i;
        int hashCode5 = (hashCode4 + (txz0Var == null ? 0 : txz0Var.hashCode())) * 31;
        ku3 ku3Var = this.j;
        int hashCode6 = (hashCode5 + (ku3Var == null ? 0 : ku3Var.hashCode())) * 31;
        Integer num = this.k;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.l;
        int b = unr0.b((hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.m);
        Boolean bool2 = this.n;
        int hashCode8 = (b + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        vou0 vou0Var = this.o;
        int hashCode9 = (hashCode8 + (vou0Var == null ? 0 : vou0Var.hashCode())) * 31;
        trc trcVar = this.p;
        int hashCode10 = (hashCode9 + (trcVar == null ? 0 : trcVar.hashCode())) * 961;
        String str2 = this.q;
        return hashCode10 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoTopupSetupState(autoTopupRequest=");
        sb.append(this.a);
        sb.append(", autoTopupShowOnly=");
        sb.append(this.b);
        sb.append(", isProgressVisible=");
        sb.append(this.c);
        sb.append(", thresholdInput=");
        sb.append(this.d);
        sb.append(", amountInput=");
        sb.append(this.e);
        sb.append(", selectedPaymentMethod=");
        sb.append(this.f);
        sb.append(", operationId=");
        sb.append(this.g);
        sb.append(", validationEntity=");
        sb.append(this.h);
        sb.append(", focusedInputType=");
        sb.append(this.i);
        sb.append(", bottomSheetState=");
        sb.append(this.j);
        sb.append(", selectedAutoTopupIndex=");
        sb.append(this.k);
        sb.append(", autoFundEnabled=");
        sb.append(this.l);
        sb.append(", amountInputAutoFund=");
        tse0.A(sb, this.m, ", autoTopupEnabled=", this.n, ", instructionsState=");
        sb.append(this.o);
        sb.append(", customInsets=");
        sb.append(this.p);
        sb.append(", savingsNotice=null, autoFundInfo=");
        return oyr.t(sb, this.q, Extension.C_BRAKE);
    }
}
