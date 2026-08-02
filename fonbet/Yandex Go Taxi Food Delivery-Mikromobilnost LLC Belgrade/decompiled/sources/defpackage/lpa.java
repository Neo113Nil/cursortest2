package defpackage;

import com.yandex.go.chargers.discounts.api.data.model.ChargersSelectedDiscountDto;
import java.util.Date;

/* loaded from: classes12.dex */
public final class lpa {
    public static ChargersSelectedDiscountDto a(ow9 ow9Var, Date date) {
        if (ow9Var == null) {
            return null;
        }
        return new ChargersSelectedDiscountDto(ow9Var.a, ow9Var.b, ow9Var.c, date);
    }
}
