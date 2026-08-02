package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.proto.TimestampRange;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.MessageReactions;

/* loaded from: classes15.dex */
public final class hai0 implements e1k, cbi0 {
    public final ServerMessageRef a;
    public final g070 b;
    public aw10 c;
    public x08 w;
    public long x;
    public long y;
    public final /* synthetic */ kdd0 z;

    public hai0(kdd0 kdd0Var, ServerMessageRef serverMessageRef, g070 g070Var) {
        this.z = kdd0Var;
        this.a = serverMessageRef;
        this.b = g070Var;
        fw10 fw10Var = (fw10) kdd0Var.c;
        long timestamp = serverMessageRef.getTimestamp();
        TimestampRange timestampRange = new TimestampRange();
        timestampRange.min = timestamp;
        timestampRange.max = timestamp;
        this.c = fw10Var.c(timestampRange, this, null, null);
        this.y = -1L;
        a();
    }

    public final void a() {
        kdd0 kdd0Var = this.z;
        z83.g(null, (Looper) kdd0Var.d, Looper.myLooper());
        if (this.w == null && this.y != this.x) {
            this.w = ((n5t0) kdd0Var.a).f(new gai0(kdd0Var, this));
        }
    }

    @Override // defpackage.cbi0
    public final void c(ServerMessageRef serverMessageRef, long j, MessageReactions messageReactions) {
        z83.g(null, (Looper) this.z.d, Looper.myLooper());
        z83.b(null, this.a, serverMessageRef);
        this.x = Math.max(j, this.x);
        a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        z83.g(null, (Looper) this.z.d, Looper.myLooper());
        x08 x08Var = this.w;
        if (x08Var != null) {
            x08Var.cancel();
        }
        this.w = null;
        aw10 aw10Var = this.c;
        if (aw10Var != null) {
            aw10Var.close();
        }
        this.c = null;
    }
}
