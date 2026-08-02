package defpackage;

import com.yandex.go.shortcuts.dto.response.Layout;
import com.yandex.go.superapp.tracking.data.e;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes13.dex */
public final class gb80 implements f4s0 {
    public final zuj0 a;
    public final e b;

    public gb80(zuj0 zuj0Var, e eVar) {
        this.a = zuj0Var;
        this.b = eVar;
    }

    @Override // defpackage.f4s0
    public final d4s0 a() {
        Object obj;
        ListBuilder a = rcc.a();
        List list = (List) this.b.u.getValue();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            w201 w201Var = (w201) obj;
            if ((w201Var instanceof q6y0) && ((q6y0) w201Var).l == DriveState.SEARCH) {
                break;
            }
        }
        w201 w201Var2 = (w201) obj;
        if (w201Var2 != null) {
            list = Collections.singletonList(w201Var2);
        }
        Iterator it2 = list.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            zuj0 zuj0Var = this.a;
            if (!hasNext) {
                a.add(new t3s0(tje.u(12, ((avj0) zuj0Var).a), 0, 12, false));
                ListBuilder j = a.j();
                return new d4s0(Layout.e, d1z.a, EmptyList.a, j, zzs.f, null, null, null, null, false, 4064);
            }
            a.add((w201) it2.next());
            a.add(new t3s0(((avj0) zuj0Var).c(mrg0.go_design_s_space), 0, 12, false));
        }
    }
}
