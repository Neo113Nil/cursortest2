package defpackage;

import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.scooters.utils.timers.b;

/* loaded from: classes6.dex */
public final class fbn0 extends z5p0 {
    public fbn0(tse tseVar) {
        super(tseVar);
    }

    @Override // defpackage.z5p0
    public final tpr a(long j) {
        o430 o430Var = e3n.b;
        return new b(e.T(com.yandex.go.coroutines.e.a(1000L), ((int) j) + 1), e3n.e(kp50.V(j, DurationUnit.SECONDS)));
    }
}
