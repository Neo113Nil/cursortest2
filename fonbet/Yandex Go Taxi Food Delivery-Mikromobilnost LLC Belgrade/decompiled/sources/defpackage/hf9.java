package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.taxi.requirements.interactor.ChangeRequirementCounterInteractor$RequirementChangeType;

/* loaded from: classes6.dex */
public final class hf9 implements ff9 {
    public final dqe0 a;
    public final w3r0 b;
    public final wiq0 c;

    public hf9(dqe0 dqe0Var, w3r0 w3r0Var, wiq0 wiq0Var) {
        this.a = dqe0Var;
        this.b = w3r0Var;
        this.c = wiq0Var;
    }

    public final void a(String str, String str2, ChangeRequirementCounterInteractor$RequirementChangeType changeRequirementCounterInteractor$RequirementChangeType) {
        Object obj;
        jmw0 jmw0Var;
        ejj0 p;
        int i;
        pex0 m = ((k) this.c).m();
        b580 b580Var = null;
        if (m != null) {
            Iterator it = m.f().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (jl40.l(((lmw0) obj).getName(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            lmw0 lmw0Var = (lmw0) obj;
            if (lmw0Var != null && (lmw0Var instanceof jmw0) && (p = (jmw0Var = (jmw0) lmw0Var).p(str2)) != null) {
                kf70 kf70Var = p.l;
                if (kf70Var instanceof if70) {
                    int i2 = gf9.a[changeRequirementCounterInteractor$RequirementChangeType.ordinal()];
                    if (i2 == 1) {
                        i = ((if70) kf70Var).a + 1;
                    } else {
                        if (i2 != 2) {
                            w511.b();
                            return;
                        }
                        i = ((if70) kf70Var).a - 1;
                    }
                    ejj0 q = jmw0Var.q(new if70(i));
                    if (q != null) {
                        b580Var = q5z.u(jmw0Var, Collections.singletonList(q));
                    }
                }
            }
        }
        if (b580Var == null) {
            return;
        }
        List list = this.a.a.x;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!jl40.l(((b580) obj2).a, str)) {
                arrayList.add(obj2);
            }
        }
        w3r0.b(this.b, a.o0(arrayList, b580Var), null, null, null, 14);
    }
}
