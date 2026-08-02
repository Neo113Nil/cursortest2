package defpackage;

import android.content.Context;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class g5a0 implements h5a0 {
    public final Text.Constant a;
    public final String b;
    public final String c;
    public final String d;
    public final ThemedImageUrlEntity e;
    public final String f;
    public final ThemedImageUrlEntity g;
    public final String h;
    public final String i;
    public final MoneyEntity j;
    public final String k;

    public g5a0(MoneyEntity moneyEntity, ThemedImageUrlEntity themedImageUrlEntity, ThemedImageUrlEntity themedImageUrlEntity2, Text.Constant constant, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = constant;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = themedImageUrlEntity;
        this.f = str4;
        this.g = themedImageUrlEntity2;
        this.h = str5;
        this.i = str6;
        this.j = moneyEntity;
        this.k = str5;
    }

    @Override // defpackage.h5a0
    public final rbv a(Context context) {
        return qa91.c(this);
    }

    @Override // defpackage.h5a0
    public final String b() {
        return this.b;
    }

    @Override // defpackage.h5a0
    public final ThemedImageUrlEntity c() {
        return this.e;
    }

    @Override // defpackage.h5a0
    public final ThemedImageUrlEntity d() {
        return qa91.d(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5a0)) {
            return false;
        }
        g5a0 g5a0Var = (g5a0) obj;
        return this.a.equals(g5a0Var.a) && jl40.l(this.b, g5a0Var.b) && jl40.l(this.c, g5a0Var.c) && jl40.l(this.d, g5a0Var.d) && jl40.l(this.e, g5a0Var.e) && jl40.l(this.f, g5a0Var.f) && this.g.equals(g5a0Var.g) && jl40.l(this.h, g5a0Var.h) && jl40.l(this.i, g5a0Var.i) && jl40.l(this.j, g5a0Var.j);
    }

    @Override // defpackage.h5a0
    public final String getAction() {
        return this.f;
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
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.e;
        int hashCode5 = (hashCode4 + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode())) * 31;
        String str4 = this.f;
        int b = unr0.b(xvz.c(this.g, (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31, this.h);
        String str5 = this.i;
        int hashCode6 = (b + (str5 == null ? 0 : str5.hashCode())) * 31;
        MoneyEntity moneyEntity = this.j;
        return hashCode6 + (moneyEntity != null ? moneyEntity.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YandexAccount(title=");
        sb.append(this.a);
        sb.append(", legalText=");
        sb.append(this.b);
        sb.append(", description=");
        g8e.D(sb, this.c, ", ybSuggestId=", this.d, ", subLogo=");
        sb.append(this.e);
        sb.append(", action=");
        sb.append(this.f);
        sb.append(", logo=");
        sb.append(this.g);
        sb.append(", agreementId=");
        sb.append(this.h);
        sb.append(", selectedMethodDescription=");
        sb.append(this.i);
        sb.append(", amount=");
        sb.append(this.j);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
