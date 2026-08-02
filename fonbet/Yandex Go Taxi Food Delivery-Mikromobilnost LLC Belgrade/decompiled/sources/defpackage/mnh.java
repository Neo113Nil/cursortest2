package defpackage;

import androidx.media3.common.a;
import androidx.media3.exoplayer.video.b;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class mnh {
    public final b a;
    public final y3c b;
    public final glt0 c;
    public final ArrayDeque d;
    public final a e;
    public long f;
    public final wly0 g;
    public final Executor h;
    public xl31 i;

    public mnh(b bVar, y3c y3cVar) {
        this.a = bVar;
        bVar.l = y3cVar;
        this.b = y3cVar;
        this.c = new glt0(new xjg(this), bVar);
        this.d = new ArrayDeque();
        this.e = new a(new f7s());
        this.f = -9223372036854775807L;
        this.g = wly0.c;
        this.h = new jnh(0);
        this.i = new knh();
    }

    public final void a(long j, long j2) {
        if (j != this.f) {
            glt0 glt0Var = this.c;
            w8z0 w8z0Var = (w8z0) glt0Var.g;
            long j3 = glt0Var.a;
            w8z0Var.a(j3 == -9223372036854775807L ? 0L : j3 + 1, Long.valueOf(j));
            this.f = j;
        }
    }
}
