package xsna;

import android.content.Context;
import com.vk.log.L;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import xsna.pox;

/* compiled from: LocationTrackerDaemon.kt */
/* loaded from: classes7.dex */
public final class bzz {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public boolean e;
    public pox f;

    /* compiled from: LocationTrackerDaemon.kt */
    public final class a implements pox.a {
        public a() {
        }

        @Override // xsna.pox.a
        public final long a() {
            bzz bzzVar = bzz.this;
            try {
                Random random = txz.c;
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                txz.a(bzzVar.c, context);
                return bzzVar.a;
            } catch (Throwable th) {
                L.e(th);
                return bzzVar.b;
            }
        }
    }

    public bzz() {
        Random random = txz.c;
        this.a = txz.b;
        long millis = TimeUnit.SECONDS.toMillis(30L);
        this.b = millis;
        this.c = millis;
        this.d = "LocationTrackerDaemon";
    }
}
