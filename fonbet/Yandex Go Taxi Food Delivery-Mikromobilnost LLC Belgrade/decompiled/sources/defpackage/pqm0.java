package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.scooters.data.ScootersActiveOrdersLifecycleRepository$listenSessionDisappearance$$inlined$flatMapLatest$1;
import ru.yandex.taxi.scooters.data.g;

/* loaded from: classes9.dex */
public final class pqm0 {
    public final tt2 a;
    public final g b;

    public pqm0(tt2 tt2Var, g gVar) {
        this.a = tt2Var;
        this.b = gVar;
    }

    public static HashSet b(sqm0 sqm0Var) {
        List C = uh6.C(sqm0Var);
        HashSet hashSet = new HashSet(uh6.A(sqm0Var));
        Iterator it = C.iterator();
        while (it.hasNext()) {
            hashSet.add(((zuo0) it.next()).getSessionId());
        }
        return hashSet;
    }

    public final tpr a() {
        kotlinx.coroutines.flow.internal.g X = e.X(this.b.a, new ScootersActiveOrdersLifecycleRepository$listenSessionDisappearance$$inlined$flatMapLatest$1(null, this));
        this.a.getClass();
        return e.F(X, uyj.a);
    }
}
