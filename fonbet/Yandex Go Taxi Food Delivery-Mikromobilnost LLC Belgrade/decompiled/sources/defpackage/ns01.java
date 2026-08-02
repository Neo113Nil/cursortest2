package defpackage;

import com.ybsdk.core.transfer.utils.domain.entities.TransferStatus;
import com.ybsdk.core.transfer.utils.domain.entities.TransferType;
import com.ybsdk.core.utils.text.Text;
import java.math.BigDecimal;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ns01 {
    public final String a;
    public final rbv b;
    public final String c;
    public final String d;
    public final BigDecimal e;
    public final String f;
    public final TransferStatus g;
    public final String h;
    public final String i;
    public final String j;
    public final Text k;
    public final Text l;
    public final rbv m;
    public final TransferType n;
    public final mw3 o;
    public final boolean p;

    public ns01(String str, rbv rbvVar, String str2, String str3, BigDecimal bigDecimal, String str4, TransferStatus transferStatus, String str5, String str6, String str7, Text text, Text text2, rbv rbvVar2, TransferType transferType, mw3 mw3Var, boolean z) {
        this.a = str;
        this.b = rbvVar;
        this.c = str2;
        this.d = str3;
        this.e = bigDecimal;
        this.f = str4;
        this.g = transferStatus;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = text;
        this.l = text2;
        this.m = rbvVar2;
        this.n = transferType;
        this.o = mw3Var;
        this.p = z;
    }

    public static ns01 a(ns01 ns01Var, TransferStatus transferStatus, String str, String str2, mw3 mw3Var, boolean z, int i) {
        String str3 = ns01Var.a;
        rbv rbvVar = ns01Var.b;
        String str4 = ns01Var.c;
        String str5 = ns01Var.d;
        BigDecimal bigDecimal = ns01Var.e;
        String str6 = ns01Var.f;
        TransferStatus transferStatus2 = (i & 64) != 0 ? ns01Var.g : transferStatus;
        String str7 = (i & 128) != 0 ? ns01Var.h : str;
        String str8 = (i & 256) != 0 ? ns01Var.i : str2;
        String str9 = ns01Var.j;
        TransferStatus transferStatus3 = transferStatus2;
        String str10 = str7;
        String str11 = str8;
        Text text = ns01Var.k;
        Text text2 = ns01Var.l;
        rbv rbvVar2 = ns01Var.m;
        TransferType transferType = ns01Var.n;
        mw3 mw3Var2 = (i & 16384) != 0 ? ns01Var.o : mw3Var;
        boolean z2 = (i & 32768) != 0 ? ns01Var.p : z;
        ns01Var.getClass();
        return new ns01(str3, rbvVar, str4, str5, bigDecimal, str6, transferStatus3, str10, str11, str9, text, text2, rbvVar2, transferType, mw3Var2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns01)) {
            return false;
        }
        ns01 ns01Var = (ns01) obj;
        return jl40.l(this.a, ns01Var.a) && this.b.equals(ns01Var.b) && this.c.equals(ns01Var.c) && this.d.equals(ns01Var.d) && jl40.l(this.e, ns01Var.e) && jl40.l(this.f, ns01Var.f) && this.g == ns01Var.g && this.h.equals(ns01Var.h) && this.i.equals(ns01Var.i) && this.j.equals(ns01Var.j) && this.k.equals(ns01Var.k) && jl40.l(this.l, ns01Var.l) && jl40.l(this.m, ns01Var.m) && this.n == ns01Var.n && jl40.l(this.o, ns01Var.o) && this.p == ns01Var.p;
    }

    public final int hashCode() {
        int c = n.c(this.k, unr0.b(unr0.b(unr0.b((this.g.hashCode() + unr0.b(smw0.f(this.e, unr0.b(unr0.b(ly3.c(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31), 31, this.f)) * 31, 31, this.h), 31, this.i), 31, this.j), 31);
        Text text = this.l;
        int hashCode = (c + (text == null ? 0 : text.hashCode())) * 31;
        rbv rbvVar = this.m;
        int hashCode2 = (this.n.hashCode() + ((hashCode + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31)) * 31;
        mw3 mw3Var = this.o;
        return Boolean.hashCode(this.p) + ((hashCode2 + (mw3Var != null ? mw3Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransferResultState(ybTitle=");
        sb.append(this.a);
        sb.append(", ybIcon=");
        sb.append(this.b);
        sb.append(", recipientName=");
        g8e.D(sb, this.c, ", phoneNumber=", this.d, ", transferAmount=");
        sb.append(this.e);
        sb.append(", currency=");
        sb.append(this.f);
        sb.append(", status=");
        sb.append(this.g);
        sb.append(", message=");
        sb.append(this.h);
        sb.append(", description=");
        g8e.D(sb, this.i, ", comment=", this.j, ", toolbarTitle=");
        ly3.C(sb, this.k, ", toolbarSubtitle=", this.l, ", toolbarIcon=");
        sb.append(this.m);
        sb.append(", transferType=");
        sb.append(this.n);
        sb.append(", autoTopupOffer=");
        sb.append(this.o);
        sb.append(", isAutoTopupSwitching=");
        sb.append(this.p);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
