package defpackage;

import com.yandex.go.chargers.discounts.api.ChargersDiscountsListEntryPoint;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountTypeDto;

/* loaded from: classes12.dex */
public final /* synthetic */ class fx9 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ir9 b;

    public /* synthetic */ fx9(ir9 ir9Var, int i) {
        this.a = i;
        this.b = ir9Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ChargersDiscountTypeDto chargersDiscountTypeDto;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ir9 ir9Var = this.b;
        switch (i) {
            case 0:
                apa apaVar = (apa) obj;
                apaVar.a.T(apaVar.b, ChargersDiscountsListEntryPoint.DISCOVERY, ir9Var);
                break;
            default:
                y4c0 y4c0Var = ((kz9) obj).a;
                y4c0Var.E((m950) ((yvf0) y4c0Var.E).get(), new o2a((ir9Var == null || (chargersDiscountTypeDto = ir9Var.a) == null) ? null : chargersDiscountTypeDto.name(), ir9Var != null ? ir9Var.b : null), new bb0(y4c0Var, 17), hxx.a);
                break;
        }
        return zy11Var;
    }
}
