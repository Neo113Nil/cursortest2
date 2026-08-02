package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.TransferDeeplink;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.ButtonTransferType;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesHcsTransferPayloadEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesLegalTransferPayloadEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesPersonTransferPayloadEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class eh01 {
    public final String a;
    public final String b;
    public final String c;
    public final ThemedImageUrlEntity d;
    public final boolean e;
    public final TransferDeeplink f;
    public final boolean g;
    public final hg6 h;
    public final r6q0 i;
    public final ymq0 j;
    public final xmq0 k;
    public final RequisitesPersonTransferPayloadEntity l;
    public final RequisitesLegalTransferPayloadEntity m;
    public final RequisitesHcsTransferPayloadEntity n;
    public final t910 o;
    public final yi1 p;
    public final ButtonTransferType q;

    public eh01(String str, String str2, String str3, ThemedImageUrlEntity themedImageUrlEntity, boolean z, TransferDeeplink transferDeeplink, boolean z2, hg6 hg6Var, r6q0 r6q0Var, ymq0 ymq0Var, xmq0 xmq0Var, RequisitesPersonTransferPayloadEntity requisitesPersonTransferPayloadEntity, RequisitesLegalTransferPayloadEntity requisitesLegalTransferPayloadEntity, RequisitesHcsTransferPayloadEntity requisitesHcsTransferPayloadEntity, t910 t910Var, yi1 yi1Var, ButtonTransferType buttonTransferType) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = themedImageUrlEntity;
        this.e = z;
        this.f = transferDeeplink;
        this.g = z2;
        this.h = hg6Var;
        this.i = r6q0Var;
        this.j = ymq0Var;
        this.k = xmq0Var;
        this.l = requisitesPersonTransferPayloadEntity;
        this.m = requisitesLegalTransferPayloadEntity;
        this.n = requisitesHcsTransferPayloadEntity;
        this.o = t910Var;
        this.p = yi1Var;
        this.q = buttonTransferType;
    }

    public static eh01 a(eh01 eh01Var, hg6 hg6Var, r6q0 r6q0Var, ymq0 ymq0Var, xmq0 xmq0Var, int i) {
        String str = eh01Var.a;
        String str2 = eh01Var.b;
        String str3 = eh01Var.c;
        ThemedImageUrlEntity themedImageUrlEntity = eh01Var.d;
        boolean z = eh01Var.e;
        TransferDeeplink transferDeeplink = eh01Var.f;
        boolean z2 = eh01Var.g;
        hg6 hg6Var2 = (i & 128) != 0 ? eh01Var.h : hg6Var;
        r6q0 r6q0Var2 = (i & 256) != 0 ? eh01Var.i : r6q0Var;
        ymq0 ymq0Var2 = (i & 512) != 0 ? eh01Var.j : ymq0Var;
        xmq0 xmq0Var2 = (i & 1024) != 0 ? eh01Var.k : xmq0Var;
        RequisitesPersonTransferPayloadEntity requisitesPersonTransferPayloadEntity = eh01Var.l;
        RequisitesLegalTransferPayloadEntity requisitesLegalTransferPayloadEntity = eh01Var.m;
        RequisitesHcsTransferPayloadEntity requisitesHcsTransferPayloadEntity = eh01Var.n;
        t910 t910Var = eh01Var.o;
        xmq0 xmq0Var3 = xmq0Var2;
        yi1 yi1Var = eh01Var.p;
        ButtonTransferType buttonTransferType = eh01Var.q;
        eh01Var.getClass();
        return new eh01(str, str2, str3, themedImageUrlEntity, z, transferDeeplink, z2, hg6Var2, r6q0Var2, ymq0Var2, xmq0Var3, requisitesPersonTransferPayloadEntity, requisitesLegalTransferPayloadEntity, requisitesHcsTransferPayloadEntity, t910Var, yi1Var, buttonTransferType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh01)) {
            return false;
        }
        eh01 eh01Var = (eh01) obj;
        return jl40.l(this.a, eh01Var.a) && jl40.l(this.b, eh01Var.b) && jl40.l(this.c, eh01Var.c) && jl40.l(this.d, eh01Var.d) && this.e == eh01Var.e && jl40.l(this.f, eh01Var.f) && this.g == eh01Var.g && jl40.l(this.h, eh01Var.h) && jl40.l(this.i, eh01Var.i) && jl40.l(this.j, eh01Var.j) && jl40.l(this.k, eh01Var.k) && jl40.l(this.l, eh01Var.l) && jl40.l(this.m, eh01Var.m) && jl40.l(this.n, eh01Var.n) && jl40.l(this.o, eh01Var.o) && jl40.l(this.p, eh01Var.p) && this.q == eh01Var.q;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int e = unr0.e(xvz.c(this.d, (b + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.e);
        TransferDeeplink transferDeeplink = this.f;
        int e2 = unr0.e((e + (transferDeeplink == null ? 0 : transferDeeplink.hashCode())) * 31, 31, this.g);
        hg6 hg6Var = this.h;
        int hashCode = (e2 + (hg6Var == null ? 0 : hg6Var.hashCode())) * 31;
        r6q0 r6q0Var = this.i;
        int hashCode2 = (hashCode + (r6q0Var == null ? 0 : r6q0Var.hashCode())) * 31;
        ymq0 ymq0Var = this.j;
        int hashCode3 = (hashCode2 + (ymq0Var == null ? 0 : ymq0Var.hashCode())) * 31;
        xmq0 xmq0Var = this.k;
        int hashCode4 = (hashCode3 + (xmq0Var == null ? 0 : xmq0Var.hashCode())) * 31;
        RequisitesPersonTransferPayloadEntity requisitesPersonTransferPayloadEntity = this.l;
        int hashCode5 = (hashCode4 + (requisitesPersonTransferPayloadEntity == null ? 0 : requisitesPersonTransferPayloadEntity.hashCode())) * 31;
        RequisitesLegalTransferPayloadEntity requisitesLegalTransferPayloadEntity = this.m;
        int hashCode6 = (hashCode5 + (requisitesLegalTransferPayloadEntity == null ? 0 : requisitesLegalTransferPayloadEntity.hashCode())) * 31;
        RequisitesHcsTransferPayloadEntity requisitesHcsTransferPayloadEntity = this.n;
        int hashCode7 = (hashCode6 + (requisitesHcsTransferPayloadEntity == null ? 0 : requisitesHcsTransferPayloadEntity.hashCode())) * 31;
        t910 t910Var = this.o;
        int hashCode8 = (hashCode7 + (t910Var == null ? 0 : t910Var.hashCode())) * 31;
        yi1 yi1Var = this.p;
        int hashCode9 = (hashCode8 + (yi1Var == null ? 0 : yi1Var.hashCode())) * 31;
        ButtonTransferType buttonTransferType = this.q;
        return hashCode9 + (buttonTransferType != null ? buttonTransferType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("TransferButtonEntity(id=", this.a, ", title=", this.b, ", hint=");
        v.append(this.c);
        v.append(", image=");
        v.append(this.d);
        v.append(", enabled=");
        v.append(this.e);
        v.append(", action=");
        v.append(this.f);
        v.append(", commentFieldEnabled=");
        v.append(this.g);
        v.append(", bottomSheetPayload=");
        v.append(this.h);
        v.append(", sectionsSheetPayload=");
        v.append(this.i);
        v.append(", selfTransferPayload=");
        v.append(this.j);
        v.append(", selfTopupPayload=");
        v.append(this.k);
        v.append(", requisitesPersonTransferPayload=");
        v.append(this.l);
        v.append(", requisitesLegalTransferPayload=");
        v.append(this.m);
        v.append(", requisitesHcsTransferPayload=");
        v.append(this.n);
        v.append(", me2meTopupPayload=");
        v.append(this.o);
        v.append(", aftTopupPayload=");
        v.append(this.p);
        v.append(", transferType=");
        v.append(this.q);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
