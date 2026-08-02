package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class o39 {
    public final Text.Constant a;
    public final Text.Constant b;
    public final rbv c;
    public final MoneyEntity d;
    public final g30 e;
    public final dbv0 f;

    public o39(Text.Constant constant, Text.Constant constant2, rbv rbvVar, MoneyEntity moneyEntity, g30 g30Var, dbv0 dbv0Var) {
        this.a = constant;
        this.b = constant2;
        this.c = rbvVar;
        this.d = moneyEntity;
        this.e = g30Var;
        this.f = dbv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o39)) {
            return false;
        }
        o39 o39Var = (o39) obj;
        return this.a.equals(o39Var.a) && this.b.equals(o39Var.b) && this.c.equals(o39Var.c) && this.d.equals(o39Var.d) && jl40.l(this.e, o39Var.e) && jl40.l(this.f, o39Var.f);
    }

    public final int hashCode() {
        int d = ly3.d(this.d, ly3.c(this.c, xvz.d(this.b, this.a.hashCode() * 31, 31), 31), 31);
        g30 g30Var = this.e;
        int hashCode = (d + (g30Var == null ? 0 : g30Var.hashCode())) * 31;
        dbv0 dbv0Var = this.f;
        return hashCode + (dbv0Var != null ? dbv0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = ly3.u("CashbackEntity(title=", this.a, ", subtitle=", this.b, ", image=");
        u.append(this.c);
        u.append(", money=");
        u.append(this.d);
        u.append(", activePromoEntity=");
        u.append(this.e);
        u.append(", suggestedPromo=");
        u.append(this.f);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
