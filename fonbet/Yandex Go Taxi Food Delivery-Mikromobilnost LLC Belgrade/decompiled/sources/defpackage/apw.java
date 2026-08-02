package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.i0;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.dashboard.IntercityDashboardResponseDto;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes14.dex */
public final class apw {
    public final dqe0 a;
    public final viw b;

    public apw(dqe0 dqe0Var, viw viwVar) {
        this.a = dqe0Var;
        this.b = viwVar;
    }

    public final Integer a(IntercityDashboardResponseDto intercityDashboardResponseDto, String str) {
        Object obj;
        Map f;
        IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity.SeatsSelectorTariffRule seatsSelectorTariffRule;
        Object obj2;
        int i;
        List list = this.a.a.x;
        Iterator it = intercityDashboardResponseDto.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((i0) obj) instanceof IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity) {
                break;
            }
        }
        IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity intercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity = obj instanceof IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity ? (IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity) obj : null;
        if (intercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity == null || (f = intercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity.b) == null) {
            f = b.f();
        }
        viw viwVar = this.b;
        List list2 = list;
        Collection<IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity.SeatsSelectorTariffRule> values = f.values();
        ((wiw) viwVar).getClass();
        Integer num = null;
        for (IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity.SeatsSelectorTariffRule seatsSelectorTariffRule2 : values) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (jl40.l(((b580) obj2).a, seatsSelectorTariffRule2.a)) {
                    break;
                }
            }
            b580 b580Var = (b580) obj2;
            if (b580Var != null && (b580Var.b() instanceof of70) && (i = ((of70) b580Var.b()).a) <= seatsSelectorTariffRule2.c && i >= seatsSelectorTariffRule2.b) {
                num = Integer.valueOf(i);
            }
        }
        if (num != null) {
            return num;
        }
        if (str == null || (seatsSelectorTariffRule = (IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity.SeatsSelectorTariffRule) f.get(str)) == null) {
            return null;
        }
        Integer num2 = seatsSelectorTariffRule.d;
        return Integer.valueOf(num2 != null ? num2.intValue() : seatsSelectorTariffRule.b);
    }
}
