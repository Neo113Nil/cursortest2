package defpackage;

import android.content.Context;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class f5a0 implements h5a0 {
    public final String a;
    public final Text.Constant b;
    public final String c;
    public final ThemedImageUrlEntity d;
    public final String e;
    public final String f;
    public final ThemedImageUrlEntity g;
    public final String h;
    public final String i;
    public final MoneyEntity j;
    public final String k;

    public f5a0(MoneyEntity moneyEntity, ThemedImageUrlEntity themedImageUrlEntity, ThemedImageUrlEntity themedImageUrlEntity2, Text.Constant constant, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = constant;
        this.c = str2;
        this.d = themedImageUrlEntity;
        this.e = str3;
        this.f = str4;
        this.g = themedImageUrlEntity2;
        this.h = str5;
        this.i = str6;
        this.j = moneyEntity;
        this.k = str3;
    }

    @Override // defpackage.h5a0
    public final rbv a(Context context) {
        return qa91.c(this);
    }

    @Override // defpackage.h5a0
    public final String b() {
        return this.f;
    }

    @Override // defpackage.h5a0
    public final ThemedImageUrlEntity c() {
        return this.g;
    }

    @Override // defpackage.h5a0
    public final ThemedImageUrlEntity d() {
        return qa91.d(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5a0)) {
            return false;
        }
        f5a0 f5a0Var = (f5a0) obj;
        return jl40.l(this.a, f5a0Var.a) && this.b.equals(f5a0Var.b) && jl40.l(this.c, f5a0Var.c) && this.d.equals(f5a0Var.d) && jl40.l(this.e, f5a0Var.e) && jl40.l(this.f, f5a0Var.f) && jl40.l(this.g, f5a0Var.g) && jl40.l(this.h, f5a0Var.h) && jl40.l(this.i, f5a0Var.i) && jl40.l(this.j, f5a0Var.j);
    }

    @Override // defpackage.h5a0
    public final String getAction() {
        return this.h;
    }

    @Override // defpackage.h5a0
    public final MoneyEntity getAmount() {
        return this.j;
    }

    @Override // defpackage.h5a0
    public final String getDescription() {
        return this.c;
    }

    @Override // defpackage.h5a0
    public final String getId() {
        return this.k;
    }

    @Override // defpackage.h5a0
    public final Text getTitle() {
        return this.b;
    }

    public final int hashCode() {
        String str = this.a;
        int d = xvz.d(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.c;
        int b = unr0.b(xvz.c(this.d, (d + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.e);
        String str3 = this.f;
        int hashCode = (b + (str3 == null ? 0 : str3.hashCode())) * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.g;
        int hashCode2 = (hashCode + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode())) * 31;
        String str4 = this.h;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        MoneyEntity moneyEntity = this.j;
        return hashCode4 + (moneyEntity != null ? moneyEntity.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingsAccount(ybSuggestId=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", logo=");
        sb.append(this.d);
        sb.append(", agreementId=");
        g8e.D(sb, this.e, ", legalText=", this.f, ", subLogo=");
        sb.append(this.g);
        sb.append(", action=");
        sb.append(this.h);
        sb.append(", selectedMethodDescription=");
        sb.append(this.i);
        sb.append(", amount=");
        sb.append(this.j);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
