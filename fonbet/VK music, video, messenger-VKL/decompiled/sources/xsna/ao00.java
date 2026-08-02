package xsna;

import com.vk.log.L;
import com.vk.toggle.b;
import com.vk.toggle.features.CoreFeatures;
import java.util.concurrent.TimeUnit;
import xsna.pox;

/* compiled from: MarkUserAsOnlineDaemon.java */
/* loaded from: classes7.dex */
public final class ao00 {
    public static final long d = TimeUnit.MINUTES.toMillis(1);
    public static final long e = TimeUnit.SECONDS.toMillis(30);
    public boolean a;
    public pox b;
    public volatile boolean c;

    /* compiled from: MarkUserAsOnlineDaemon.java */
    public class a implements pox.a {
        public a() {
        }

        @Override // xsna.pox.a
        public final long a() {
            Integer b;
            try {
                c63 c63Var = c63.a;
                if (c63.f) {
                    L.e("MarkUserAsOnlineDaemon", "App is in foreground, sending online");
                    m0r0.b();
                    ao00.this.c = true;
                } else {
                    L.e("MarkUserAsOnlineDaemon", "App is in background, skipping sending online");
                }
                CoreFeatures coreFeatures = CoreFeatures.ONLINE_INTERVAL;
                coreFeatures.getClass();
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                if (!bVar.a(coreFeatures)) {
                    return ao00.d;
                }
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                b.d j = bVar.j(coreFeatures.getKey(), false);
                return TimeUnit.SECONDS.toMillis((j == null || (b = j.b()) == null) ? 60 : b.intValue());
            } catch (Throwable th) {
                L.e("MarkUserAsOnlineDaemon", th);
                return ao00.e;
            }
        }
    }
}
