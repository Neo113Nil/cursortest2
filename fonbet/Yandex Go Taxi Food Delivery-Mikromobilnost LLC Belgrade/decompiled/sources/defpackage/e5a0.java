package defpackage;

import android.content.Context;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class e5a0 implements h5a0 {
    public final Text a;
    public final String b;
    public final d5a0 c;
    public final d5a0 d;
    public final String e;
    public final String f;
    public final String g;
    public final ThemedImageUrlEntity h;
    public final String i;
    public final String j;
    public final MoneyEntity k;
    public final String l;

    public e5a0(Text text, String str, d5a0 d5a0Var, d5a0 d5a0Var2, String str2, String str3, String str4, ThemedImageUrlEntity themedImageUrlEntity, String str5, String str6, MoneyEntity moneyEntity) {
        this.a = text;
        this.b = str;
        this.c = d5a0Var;
        this.d = d5a0Var2;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = themedImageUrlEntity;
        this.i = str5;
        this.j = str6;
        this.k = moneyEntity;
        this.l = str3;
    }

    public static e5a0 e(e5a0 e5a0Var, Text.Formatted formatted) {
        return new e5a0(formatted, e5a0Var.b, e5a0Var.c, e5a0Var.d, e5a0Var.e, e5a0Var.f, e5a0Var.g, e5a0Var.h, e5a0Var.i, e5a0Var.j, e5a0Var.k);
    }

    @Override // defpackage.h5a0
    public final rbv a(Context context) {
        return qa91.c(this);
    }

    @Override // defpackage.h5a0
    public final String b() {
        return this.g;
    }

    @Override // defpackage.h5a0
    public final ThemedImageUrlEntity c() {
        return this.h;
    }

    @Override // defpackage.h5a0
    public final ThemedImageUrlEntity d() {
        return qa91.d(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5a0)) {
            return false;
        }
        e5a0 e5a0Var = (e5a0) obj;
        return jl40.l(this.a, e5a0Var.a) && jl40.l(this.b, e5a0Var.b) && this.c.equals(e5a0Var.c) && this.d.equals(e5a0Var.d) && jl40.l(this.e, e5a0Var.e) && jl40.l(this.f, e5a0Var.f) && jl40.l(this.g, e5a0Var.g) && jl40.l(this.h, e5a0Var.h) && jl40.l(this.i, e5a0Var.i) && jl40.l(this.j, e5a0Var.j) && jl40.l(this.k, e5a0Var.k);
    }

    @Override // defpackage.h5a0
    public final String getAction() {
        return this.i;
    }

    @Override // defpackage.h5a0
    public final MoneyEntity getAmount() {
        return this.k;
    }

    @Override // defpackage.h5a0
    public final String getDescription() {
        return this.b;
    }

    @Override // defpackage.h5a0
    public final String getId() {
        return this.l;
    }

    @Override // defpackage.h5a0
    public final Text getTitle() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.e;
        int b = unr0.b((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        String str3 = this.g;
        int hashCode3 = (b + (str3 == null ? 0 : str3.hashCode())) * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.h;
        int hashCode4 = (hashCode3 + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode())) * 31;
        String str4 = this.i;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        MoneyEntity moneyEntity = this.k;
        return hashCode6 + (moneyEntity != null ? moneyEntity.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Me2Me(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", logo=");
        sb.append(this.c);
        sb.append(", selectedLogo=");
        sb.append(this.d);
        sb.append(", ybSuggestId=");
        g8e.D(sb, this.e, ", partnerId=", this.f, ", legalText=");
        sb.append(this.g);
        sb.append(", subLogo=");
        sb.append(this.h);
        sb.append(", action=");
        g8e.D(sb, this.i, ", selectedMethodDescription=", this.j, ", amount=");
        sb.append(this.k);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
