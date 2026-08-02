package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.transfer.version2.api.PhoneInputSource;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType;
import java.math.BigDecimal;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gjq0 implements wjq0 {
    public final eh01 a;
    public final fjq0 b;
    public final BigDecimal c;
    public final String d;
    public final BigDecimal e;
    public final String f;
    public final SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType g;
    public final ejq0 h;
    public final String i;
    public final String j;
    public final PhoneInputSource k;
    public final String l;
    public final ThemedImageUrlEntity m;
    public final boolean n;

    public gjq0(eh01 eh01Var, fjq0 fjq0Var, BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, String str2, SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType, ejq0 ejq0Var, String str3, String str4, PhoneInputSource phoneInputSource, String str5, ThemedImageUrlEntity themedImageUrlEntity) {
        this.a = eh01Var;
        this.b = fjq0Var;
        this.c = bigDecimal;
        this.d = str;
        this.e = bigDecimal2;
        this.f = str2;
        this.g = selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType;
        this.h = ejq0Var;
        this.i = str3;
        this.j = str4;
        this.k = phoneInputSource;
        this.l = str5;
        this.m = themedImageUrlEntity;
        this.n = true;
    }

    public static gjq0 c(gjq0 gjq0Var, fjq0 fjq0Var, BigDecimal bigDecimal, String str, SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType, ejq0 ejq0Var, String str2, String str3, int i) {
        eh01 eh01Var = gjq0Var.a;
        if ((i & 2) != 0) {
            fjq0Var = gjq0Var.b;
        }
        fjq0 fjq0Var2 = fjq0Var;
        BigDecimal bigDecimal2 = gjq0Var.c;
        String str4 = gjq0Var.d;
        String str5 = (i & 32) != 0 ? gjq0Var.f : str;
        SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType2 = (i & 64) != 0 ? gjq0Var.g : selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType;
        ejq0 ejq0Var2 = (i & 128) != 0 ? gjq0Var.h : ejq0Var;
        String str6 = (i & 256) != 0 ? gjq0Var.i : str2;
        String str7 = (i & 512) != 0 ? gjq0Var.j : str3;
        PhoneInputSource phoneInputSource = gjq0Var.k;
        String str8 = gjq0Var.l;
        ThemedImageUrlEntity themedImageUrlEntity = gjq0Var.m;
        gjq0Var.getClass();
        return new gjq0(eh01Var, fjq0Var2, bigDecimal2, str4, bigDecimal, str5, selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType2, ejq0Var2, str6, str7, phoneInputSource, str8, themedImageUrlEntity);
    }

    @Override // defpackage.wjq0
    public final boolean a() {
        return this.n;
    }

    @Override // defpackage.wjq0
    public final eh01 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjq0)) {
            return false;
        }
        gjq0 gjq0Var = (gjq0) obj;
        return jl40.l(this.a, gjq0Var.a) && jl40.l(this.b, gjq0Var.b) && jl40.l(this.c, gjq0Var.c) && jl40.l(this.d, gjq0Var.d) && jl40.l(this.e, gjq0Var.e) && jl40.l(this.f, gjq0Var.f) && this.g == gjq0Var.g && jl40.l(this.h, gjq0Var.h) && jl40.l(this.i, gjq0Var.i) && jl40.l(this.j, gjq0Var.j) && this.k == gjq0Var.k && jl40.l(this.l, gjq0Var.l) && jl40.l(this.m, gjq0Var.m);
    }

    public final int hashCode() {
        int hashCode = (this.g.hashCode() + unr0.b(smw0.f(this.e, unr0.b(smw0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d), 31), 31, this.f)) * 31;
        ejq0 ejq0Var = this.h;
        int hashCode2 = (hashCode + (ejq0Var == null ? 0 : ejq0Var.hashCode())) * 31;
        String str = this.i;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PhoneInputSource phoneInputSource = this.k;
        int hashCode5 = (hashCode4 + (phoneInputSource == null ? 0 : phoneInputSource.hashCode())) * 31;
        String str3 = this.l;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.m;
        return hashCode6 + (themedImageUrlEntity != null ? themedImageUrlEntity.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrossBorderByPhone(fromCircleButton=");
        sb.append(this.a);
        sb.append(", receiverInfo=");
        sb.append(this.b);
        sb.append(", debitAmount=");
        sb.append(this.c);
        sb.append(", debitCurrency=");
        sb.append(this.d);
        sb.append(", creditAmount=");
        sb.append(this.e);
        sb.append(", creditCurrency=");
        sb.append(this.f);
        sb.append(", priorityMoneyType=");
        sb.append(this.g);
        sb.append(", currencyRate=");
        sb.append(this.h);
        sb.append(", currencyRateUiText=");
        g8e.D(sb, this.i, ", convertationTemplate=", this.j, ", phoneInputSource=");
        sb.append(this.k);
        sb.append(", fee=");
        sb.append(this.l);
        sb.append(", partnerImage=");
        sb.append(this.m);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public /* synthetic */ gjq0(eh01 eh01Var, fjq0 fjq0Var, BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, String str2, SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType, ejq0 ejq0Var, String str3, PhoneInputSource phoneInputSource, String str4, ThemedImageUrlEntity themedImageUrlEntity, int i) {
        this(eh01Var, fjq0Var, bigDecimal, str, bigDecimal2, str2, selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType, ejq0Var, (String) null, (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? null : phoneInputSource, (i & 2048) != 0 ? null : str4, (i & 4096) != 0 ? null : themedImageUrlEntity);
    }
}
