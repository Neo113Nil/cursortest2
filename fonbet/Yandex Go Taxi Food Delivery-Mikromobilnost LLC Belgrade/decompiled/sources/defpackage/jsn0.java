package defpackage;

import com.yandex.go.scooters.domain.model.ScootersNotificationType;
import ru.yandex.taxi.systemrequeirements.location.n;

/* loaded from: classes8.dex */
public final class jsn0 {
    public final c1n0 a;
    public final n b;
    public final m2o0 c;
    public final ugo0 d;

    public jsn0(c1n0 c1n0Var, n nVar, m2o0 m2o0Var, ugo0 ugo0Var) {
        this.a = c1n0Var;
        this.b = nVar;
        this.c = m2o0Var;
        this.d = ugo0Var;
    }

    public final boolean a() {
        ScootersNotificationType scootersNotificationType = ScootersNotificationType.SYSTEM;
        m2o0 m2o0Var = this.c;
        if (!((o2o0) m2o0Var).e(scootersNotificationType)) {
            return false;
        }
        if (((o2o0) m2o0Var).e(ScootersNotificationType.DEFAULT)) {
            return ((o2o0) m2o0Var).e(ScootersNotificationType.IMPORTANT);
        }
        return false;
    }
}
