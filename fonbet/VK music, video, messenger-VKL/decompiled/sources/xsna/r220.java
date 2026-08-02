package xsna;

import android.content.Context;
import com.vk.log.L;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MemoryChecker.kt */
/* loaded from: classes.dex */
public final class r220 extends aw90 {
    public final bpn0 b = new bpn0(new y45(4));
    public final AtomicBoolean c;

    public r220(Context context) {
        this.c = new AtomicBoolean(false);
    }

    @Override // xsna.aw90
    public final void a() {
        if (this.c.getAndSet(true)) {
            return;
        }
        L.e("start memory checker");
        ((ScheduledExecutorService) this.b.getValue()).scheduleWithFixedDelay(new q220(), 45000L, 45000L, TimeUnit.MILLISECONDS);
    }

    @Override // xsna.aw90
    public final void b() {
    }
}
