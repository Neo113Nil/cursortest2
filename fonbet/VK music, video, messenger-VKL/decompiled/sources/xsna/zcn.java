package xsna;

import android.os.Handler;
import java.util.concurrent.TimeUnit;
import xsna.jwj0;

/* compiled from: Dispatchers.kt */
/* loaded from: classes9.dex */
public final class zcn implements pcn {
    public final /* synthetic */ Handler a;

    public zcn(Handler handler) {
        this.a = handler;
    }

    @Override // xsna.pcn
    public final hgn a(long j, TimeUnit timeUnit, jwj0.a.C3151a c3151a) {
        long millis = timeUnit.toMillis(j);
        this.a.postDelayed(new hv2(c3151a, 4), millis);
        return new iqj0();
    }

    @Override // xsna.pcn
    public final void b(gzs<s3q0> gzsVar) {
        this.a.post(new a72(gzsVar));
    }
}
