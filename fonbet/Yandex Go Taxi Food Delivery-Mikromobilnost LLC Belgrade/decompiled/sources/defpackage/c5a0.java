package defpackage;

import android.content.Context;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class c5a0 implements h5a0 {
    public final Text.Constant a;
    public final String b;
    public final rbv c;
    public final ThemedImageUrlEntity d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final ThemedImageUrlEntity j;
    public final String k;
    public final String l;
    public final String m;
    public final MoneyEntity n;

    public c5a0(Text.Constant constant, String str, rbv rbvVar, ThemedImageUrlEntity themedImageUrlEntity, String str2, String str3, String str4, String str5, String str6, ThemedImageUrlEntity themedImageUrlEntity2, String str7, String str8, String str9, MoneyEntity moneyEntity) {
        this.a = constant;
        this.b = str;
        this.c = rbvVar;
        this.d = themedImageUrlEntity;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = themedImageUrlEntity2;
        this.k = str7;
        this.l = str8;
        this.m = str9;
        this.n = moneyEntity;
    }

    @Override // defpackage.h5a0
    public final rbv a(Context context) {
        return qa91.c(this);
    }

    @Override // defpackage.h5a0
    public final String b() {
        return this.i;
    }

    @Override // defpackage.h5a0
    public final ThemedImageUrlEntity c() {
        return this.j;
    }

    @Override // defpackage.h5a0
    public final ThemedImageUrlEntity d() {
        return qa91.d(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5a0)) {
            return false;
        }
        c5a0 c5a0Var = (c5a0) obj;
        return this.a.equals(c5a0Var.a) && jl40.l(this.b, c5a0Var.b) && jl40.l(this.c, c5a0Var.c) && this.d.equals(c5a0Var.d) && jl40.l(this.e, c5a0Var.e) && jl40.l(this.f, c5a0Var.f) && jl40.l(this.g, c5a0Var.g) && jl40.l(this.h, c5a0Var.h) && jl40.l(this.i, c5a0Var.i) && jl40.l(this.j, c5a0Var.j) && jl40.l(this.k, c5a0Var.k) && jl40.l(this.l, c5a0Var.l) && jl40.l(this.m, c5a0Var.m) && jl40.l(this.n, c5a0Var.n);
    }

    @Override // defpackage.h5a0
    public final String getAction() {
        return this.k;
    }

    @Override // defpackage.h5a0
    public final MoneyEntity getAmount() {
        return this.n;
    }

    @Override // defpackage.h5a0
    public final String getDescription() {
        return this.b;
    }

    @Override // defpackage.h5a0
    public final String getId() {
        return this.f;
    }

    @Override // defpackage.h5a0
    public final Text getTitle() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        rbv rbvVar = this.c;
        int c = xvz.c(this.d, (hashCode2 + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31, 31);
        String str2 = this.e;
        int b = unr0.b(unr0.b(unr0.b((c + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h);
        String str3 = this.i;
        int hashCode3 = (b + (str3 == null ? 0 : str3.hashCode())) * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.j;
        int hashCode4 = (hashCode3 + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode())) * 31;
        String str4 = this.k;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.l;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.m;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        MoneyEntity moneyEntity = this.n;
        return hashCode7 + (moneyEntity != null ? moneyEntity.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Card(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", logo=");
        sb.append(this.c);
        sb.append(", themedLogo=");
        sb.append(this.d);
        sb.append(", ybSuggestId=");
        g8e.D(sb, this.e, ", id=", this.f, ", system=");
        g8e.D(sb, this.g, ", number=", this.h, ", legalText=");
        sb.append(this.i);
        sb.append(", subLogo=");
        sb.append(this.j);
        sb.append(", action=");
        g8e.D(sb, this.k, ", ybId=", this.l, ", selectedMethodDescription=");
        sb.append(this.m);
        sb.append(", amount=");
        sb.append(this.n);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
