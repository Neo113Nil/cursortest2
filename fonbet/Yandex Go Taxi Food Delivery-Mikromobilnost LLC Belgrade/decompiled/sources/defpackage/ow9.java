package defpackage;

import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountTypeDto;
import java.util.Date;

/* loaded from: classes12.dex */
public final class ow9 {
    public final ChargersDiscountTypeDto a;
    public final String b;
    public final Date c;

    public ow9(ChargersDiscountTypeDto chargersDiscountTypeDto, String str, Date date) {
        this.a = chargersDiscountTypeDto;
        this.b = str;
        this.c = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow9)) {
            return false;
        }
        ow9 ow9Var = (ow9) obj;
        return this.a == ow9Var.a && jl40.l(this.b, ow9Var.b) && jl40.l(this.c, ow9Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
    }

    public final String toString() {
        return "ChargersDiscountsUserSelection(type=" + this.a + ", id=" + this.b + ", selectedAt=" + this.c + ", paymentMethodSelectedAt=null)";
    }
}
