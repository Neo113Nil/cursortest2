package defpackage;

import com.yandex.go.scooters.domain.model.ScootersEmptyParkingException;
import com.yandex.go.scooters.offers.v2.domain.model.ScooterIsBusyButAnotherOnParkingException;
import com.yandex.go.scooters.offers.v2.domain.model.ScooterIsBusyException;
import java.util.concurrent.CancellationException;

/* loaded from: classes13.dex */
public final class bvn0 {
    public final q4o0 a;

    public bvn0(q4o0 q4o0Var) {
        this.a = q4o0Var;
    }

    public final Throwable a(Throwable th) {
        if (!(this.a.a() instanceof l4o0)) {
            return new ScooterIsBusyException(th);
        }
        try {
            return new ScooterIsBusyButAnotherOnParkingException(th);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th2) {
            return th2 instanceof ScootersEmptyParkingException ? new ScooterIsBusyException(th2) : th2;
        }
    }
}
