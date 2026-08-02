package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.core.net.entities.proto.TimestampRange;

/* loaded from: classes15.dex */
public final class aw10 implements e1k {
    public final TimestampRange a;
    public final cbi0 b;
    public final Long[] c;
    public final f5b w;
    public final /* synthetic */ fw10 x;

    public aw10(fw10 fw10Var, TimestampRange timestampRange, cbi0 cbi0Var, Long[] lArr, f5b f5bVar) {
        this.x = fw10Var;
        this.a = timestampRange;
        this.b = cbi0Var;
        this.c = lArr;
        this.w = f5bVar;
        fw10Var.l.b(this);
        fw10Var.b(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        fw10 fw10Var = this.x;
        Handler handler = fw10Var.k;
        z83.g(null, handler.getLooper(), Looper.myLooper());
        zq60 zq60Var = fw10Var.l;
        zq60Var.d(this);
        z83.g(null, handler.getLooper(), Looper.myLooper());
        if (zq60Var.isEmpty()) {
            handler.removeCallbacksAndMessages(fw10Var.j);
            x08 x08Var = fw10Var.p;
            if (x08Var != null) {
                x08Var.cancel();
            }
            fw10Var.p = null;
            w0j0 w0j0Var = fw10Var.o;
            if (w0j0Var != null) {
                w0j0Var.cancel();
            }
            fw10Var.o = null;
        }
    }
}
