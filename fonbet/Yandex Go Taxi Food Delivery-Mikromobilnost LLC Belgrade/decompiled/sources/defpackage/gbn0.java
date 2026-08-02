package defpackage;

import com.yandex.go.coroutines.e;
import kotlin.time.DurationUnit;
import ru.yandex.taxi.scooters.utils.timers.d;

/* loaded from: classes6.dex */
public final class gbn0 extends z5p0 {
    public gbn0(tse tseVar) {
        super(tseVar);
    }

    @Override // defpackage.z5p0
    public final tpr a(long j) {
        o430 o430Var = e3n.b;
        return new d(e.a(1000L), e3n.e(kp50.V(j, DurationUnit.SECONDS)));
    }
}
