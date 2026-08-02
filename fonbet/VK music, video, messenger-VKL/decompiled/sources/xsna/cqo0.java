package xsna;

import android.os.PowerManager$OnThermalStatusChangedListener;
import java.time.Duration;
import java.time.Instant;

/* compiled from: ThermalApiTask.kt */
/* loaded from: classes11.dex */
public final class cqo0 implements PowerManager$OnThermalStatusChangedListener {
    public final Instant a;
    public final int b;
    public Instant c;
    public Instant d;

    public cqo0() {
        Instant instant = Instant.MIN;
        this.a = instant;
        this.b = 30;
        this.c = instant;
        this.d = instant;
    }

    public final void onThermalStatusChanged(int i) {
        boolean z;
        Instant now = Instant.now();
        if (Duration.between(this.c, now).getSeconds() >= this.b) {
            if (epx.f(this.d, this.a)) {
                z = false;
            } else {
                c63 c63Var = c63.a;
                z = !c63.f;
            }
            new eqo0(i, z).q();
            this.c = this.d;
            this.d = now;
        }
    }
}
