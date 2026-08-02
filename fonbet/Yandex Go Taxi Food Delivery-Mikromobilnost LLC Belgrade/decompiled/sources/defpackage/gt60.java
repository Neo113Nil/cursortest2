package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.communications.model.widgets.ActionType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lgt60;", "Lckz0;", "Companion", "et60", "ft60", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class gt60 extends ckz0 {
    public static final ft60 Companion = new ft60();
    public final String a;
    public final String b;

    public gt60(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
    }

    @Override // defpackage.ckz0
    public final ActionType a() {
        return ActionType.OFFER_SUBSTITUTION;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt60)) {
            return false;
        }
        gt60 gt60Var = (gt60) obj;
        return jl40.l(this.a, gt60Var.a) && jl40.l(this.b, gt60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("OfferSubstitution(tariffClass=", this.a, ", offerId=", this.b, Extension.C_BRAKE);
    }

    public gt60() {
        this.a = "";
        this.b = "";
    }
}
