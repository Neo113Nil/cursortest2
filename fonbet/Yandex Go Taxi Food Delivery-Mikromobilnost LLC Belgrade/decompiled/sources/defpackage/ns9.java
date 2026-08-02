package defpackage;

import com.yandex.go.chargers.discounts.data.models.ChargersDiscountStationsResponseDto;
import com.yandex.go.chargers.discounts.data.models.e;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ns9 implements os9 {
    public final ChargersDiscountStationsResponseDto a;
    public final String b;

    static {
        e eVar = ChargersDiscountStationsResponseDto.Companion;
    }

    public ns9(ChargersDiscountStationsResponseDto chargersDiscountStationsResponseDto, String str) {
        this.a = chargersDiscountStationsResponseDto;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ns9) {
            ns9 ns9Var = (ns9) obj;
            if (this.a == ns9Var.a && this.b.equals(ns9Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(discountStations=" + this.a + ", traceId=" + this.b + Extension.C_BRAKE;
    }
}
