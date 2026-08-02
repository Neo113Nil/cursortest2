package defpackage;

import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.domain.entities.UnconditionalLimitWidgetEntity;
import com.ybsdk.feature.transfer.version2.api.entities.TransferResultPageEntity;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class nfb {
    public final unq a;
    public final UnconditionalLimitWidgetEntity b;
    public final TransferResultPageEntity c;
    public final TransferResultPageEntity d;
    public final String e;
    public final String f;
    public final String g;
    public final ThemedImageUrlEntity h;
    public final boolean i;
    public final String j;
    public final String k;
    public final rr51 l;
    public final p39 m;
    public final List n;
    public final String o;
    public final Boolean p;
    public final ActionButtonEntity q;
    public final hfb r;

    public nfb(unq unqVar, UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, String str, String str2, String str3, ThemedImageUrlEntity themedImageUrlEntity, boolean z, String str4, String str5, rr51 rr51Var, p39 p39Var, List list, String str6, Boolean bool, ActionButtonEntity actionButtonEntity, hfb hfbVar) {
        this.a = unqVar;
        this.b = unconditionalLimitWidgetEntity;
        this.c = transferResultPageEntity;
        this.d = transferResultPageEntity2;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = themedImageUrlEntity;
        this.i = z;
        this.j = str4;
        this.k = str5;
        this.l = rr51Var;
        this.m = p39Var;
        this.n = list;
        this.o = str6;
        this.p = bool;
        this.q = actionButtonEntity;
        this.r = hfbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfb)) {
            return false;
        }
        nfb nfbVar = (nfb) obj;
        return jl40.l(this.a, nfbVar.a) && jl40.l(this.b, nfbVar.b) && jl40.l(this.c, nfbVar.c) && jl40.l(this.d, nfbVar.d) && jl40.l(this.e, nfbVar.e) && jl40.l(this.f, nfbVar.f) && jl40.l(this.g, nfbVar.g) && jl40.l(this.h, nfbVar.h) && this.i == nfbVar.i && jl40.l(this.j, nfbVar.j) && jl40.l(this.k, nfbVar.k) && jl40.l(this.l, nfbVar.l) && jl40.l(this.m, nfbVar.m) && this.n.equals(nfbVar.n) && jl40.l(this.o, nfbVar.o) && jl40.l(this.p, nfbVar.p) && jl40.l(this.q, nfbVar.q) && jl40.l(this.r, nfbVar.r);
    }

    public final int hashCode() {
        unq unqVar = this.a;
        int hashCode = (unqVar == null ? 0 : unqVar.hashCode()) * 31;
        UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity = this.b;
        int hashCode2 = (hashCode + (unconditionalLimitWidgetEntity == null ? 0 : unconditionalLimitWidgetEntity.hashCode())) * 31;
        TransferResultPageEntity transferResultPageEntity = this.c;
        int hashCode3 = (hashCode2 + (transferResultPageEntity == null ? 0 : transferResultPageEntity.hashCode())) * 31;
        TransferResultPageEntity transferResultPageEntity2 = this.d;
        int hashCode4 = (hashCode3 + (transferResultPageEntity2 == null ? 0 : transferResultPageEntity2.hashCode())) * 31;
        String str = this.e;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.h;
        int e = unr0.e((hashCode7 + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode())) * 31, 31, this.i);
        String str4 = this.j;
        int hashCode8 = (e + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.k;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        rr51 rr51Var = this.l;
        int hashCode10 = (hashCode9 + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31;
        p39 p39Var = this.m;
        int c = unr0.c((hashCode10 + (p39Var == null ? 0 : p39Var.hashCode())) * 31, 31, this.n);
        String str6 = this.o;
        int hashCode11 = (c + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.p;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        ActionButtonEntity actionButtonEntity = this.q;
        int hashCode13 = (hashCode12 + (actionButtonEntity == null ? 0 : actionButtonEntity.hashCode())) * 31;
        hfb hfbVar = this.r;
        return hashCode13 + (hfbVar != null ? hfbVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckEntity(fee=");
        sb.append(this.a);
        sb.append(", limitWidget=");
        sb.append(this.b);
        sb.append(", resultPage=");
        sb.append(this.c);
        sb.append(", timeoutResultPage=");
        sb.append(this.d);
        sb.append(", tooltip=");
        g8e.D(sb, this.e, ", tooltipAction=", this.f, ", tooltipActionText=");
        sb.append(this.g);
        sb.append(", tooltipActionImage=");
        sb.append(this.h);
        sb.append(", transferAllowed=");
        unr0.A(", checkId=", this.j, ", transferId=", sb, this.i);
        sb.append(this.k);
        sb.append(", feePayload=");
        sb.append(this.l);
        sb.append(", cashback=");
        sb.append(this.m);
        sb.append(", agreements=");
        sb.append(this.n);
        sb.append(", preConfirmAction=");
        tse0.A(sb, this.o, ", dropPreConfirmActionAfterUse=", this.p, ", primaryButton=");
        sb.append(this.q);
        sb.append(", crossBorderData=");
        sb.append(this.r);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
