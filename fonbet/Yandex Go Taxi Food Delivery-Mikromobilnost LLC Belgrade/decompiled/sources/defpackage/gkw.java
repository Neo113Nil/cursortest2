package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.i0;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.dashboard.IntercityDashboardResponseDto;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.i;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes14.dex */
public final class gkw implements fkw {
    public final i a;
    public final y1s b;
    public final axm c;
    public final dqe0 d;
    public final wiq0 e;
    public final w3r0 f;
    public final miw g;

    public gkw(i iVar, y1s y1sVar, axm axmVar, dqe0 dqe0Var, wiq0 wiq0Var, w3r0 w3r0Var, miw miwVar) {
        this.a = iVar;
        this.b = y1sVar;
        this.c = axmVar;
        this.d = dqe0Var;
        this.e = wiq0Var;
        this.f = w3r0Var;
        this.g = miwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v23, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.util.ArrayList] */
    public final void a() {
        Object obj;
        IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity intercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity;
        ?? r2;
        Object obj2;
        Object value;
        Collection values;
        lmw0 lmw0Var;
        Object obj3;
        pex0 m = ((k) this.e).m();
        List f = m != null ? m.f() : null;
        List list = this.d.a.x;
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : list) {
            b580 b580Var = (b580) obj4;
            if (f != null) {
                Iterator it = f.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj3 = it.next();
                        if (jl40.l(((lmw0) obj3).getName(), b580Var.a)) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                lmw0Var = (lmw0) obj3;
            } else {
                lmw0Var = null;
            }
            if (lmw0Var != null) {
                arrayList.add(obj4);
            }
        }
        boolean z = arrayList.size() != this.d.a.x.size();
        w3r0.b(this.f, arrayList, null, null, null, 14);
        if (z) {
            com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.i iVar = (com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.i) this.g;
            IntercityDashboardResponseDto intercityDashboardResponseDto = iVar.a.a().c;
            if (intercityDashboardResponseDto == null) {
                intercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity = null;
            } else {
                Iterator it2 = intercityDashboardResponseDto.d.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (((i0) obj) instanceof IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (!(obj instanceof IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity)) {
                    obj = null;
                }
                intercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity = (IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity) obj;
            }
            Map map = intercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity != null ? intercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity.b : null;
            if (map == null || (values = map.values()) == null) {
                r2 = 0;
            } else {
                Collection collection = values;
                r2 = new ArrayList(tcc.n(collection, 10));
                Iterator it3 = collection.iterator();
                while (it3.hasNext()) {
                    r2.add(((IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity.SeatsSelectorTariffRule) it3.next()).a);
                }
            }
            if (r2 == 0) {
                r2 = EmptyList.a;
            }
            Iterator it4 = iVar.e.a.x.iterator();
            while (true) {
                if (it4.hasNext()) {
                    obj2 = it4.next();
                    if (r2.contains(((b580) obj2).a)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            b580 b580Var2 = (b580) obj2;
            kf70 g0 = b580Var2 != null ? q5z.g0(b580Var2.b()) : null;
            if70 if70Var = g0 instanceof if70 ? (if70) g0 : null;
            Integer valueOf = if70Var != null ? Integer.valueOf(if70Var.a) : null;
            r0 r0Var = iVar.a.b;
            do {
                value = r0Var.getValue();
            } while (!r0Var.k(value, yfw.a((yfw) value, null, valueOf, null, null, null, null, HProv.PP_DELETE_KEYSET)));
        }
    }
}
