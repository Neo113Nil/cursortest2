package defpackage;

import com.google.ar.core.ImageMetadata;
import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;
import com.ybsdk.core.utils.NumberFormatUtils$Currencies;
import com.ybsdk.feature.autotopup.api.AutoTopupType;
import com.ybsdk.feature.autotopup.internal.domain.entities.AutoFundInputType;
import com.ybsdk.feature.autotopup.internal.domain.entities.AutoTopupInputType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public abstract class k2b1 {
    public static final void a(f530 f530Var, wzu wzuVar, sls slsVar, sls slsVar2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1686041449);
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.k(wzuVar) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128) | (btsVar.e(slsVar2) ? 2048 : 1024);
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            hub1.b(f530Var, wzuVar.b, wzuVar.f, wzuVar.g, slsVar, wwg.S(-1074407712, true, new q0v(i3, wzuVar, slsVar2 == null ? slsVar : slsVar2), btsVar), btsVar, (i2 & 14) | ImageMetadata.EDGE_MODE | ((i2 << 6) & HProv.ALG_CLASS_ALL));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wzr(f530Var, (Object) wzuVar, (Object) slsVar, slsVar2, i, 2);
        }
    }

    public static final c22 b(c22 c22Var) {
        return c22Var == null ? new c22(AutoFundInputType.AUTOFUND_MONEY, null, null, BigDecimal.ZERO, NumberFormatUtils$Currencies.RUB.getSymbol()) : c22Var;
    }

    public static final c22 c(qz3 qz3Var, AutoTopupInputType autoTopupInputType) {
        ArrayList arrayList = qz3Var.j.d;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((cn11) it.next()).a) {
                break;
            }
            i++;
        }
        Integer valueOf = Integer.valueOf(i);
        if (i == -1) {
            valueOf = null;
        }
        return j2b1.b((cn11) arrayList.get(valueOf != null ? valueOf.intValue() : 0), autoTopupInputType);
    }

    public static final AutoTopupType d(qz3 qz3Var, Integer num) {
        int intValue;
        ArrayList arrayList = qz3Var.j.d;
        if (num != null) {
            intValue = num.intValue();
        } else {
            Iterator it = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((cn11) it.next()).a) {
                    break;
                }
                i++;
            }
            Integer valueOf = Integer.valueOf(i);
            if (i == -1) {
                valueOf = null;
            }
            intValue = valueOf != null ? valueOf.intValue() : 0;
        }
        return ((cn11) arrayList.get(intValue)).b;
    }

    public static final ScootersInsuranceType e(String str) {
        return jl40.l(str, "standart") ? ScootersInsuranceType.STANDART : jl40.l(str, "full") ? ScootersInsuranceType.FULL : ScootersInsuranceType.NO_INSURANCE;
    }
}
