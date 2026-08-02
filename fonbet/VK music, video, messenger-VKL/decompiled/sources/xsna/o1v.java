package xsna;

import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import xsna.ly40;

/* compiled from: HeartbeatControllerImpl.kt */
/* loaded from: classes3.dex */
public final class o1v implements n1v {
    public final Object a = msy.a(LazyThreadSafetyMode.NONE, new l63(17));
    public final long b = TimeUnit.SECONDS.toMillis(30);
    public long c;

    @Override // xsna.n1v
    public final void a(long j) {
        this.c = j;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.n1v
    public final ly40.a b(long j, p4b0 p4b0Var, nw40 nw40Var) {
        if (j - this.c < this.b) {
            return (ly40.a) ly40.a.c.getValue();
        }
        ly40.a aVar = new ly40.a(p4b0Var, ((cx40) this.a.getValue()).g(new nw40(nw40Var.c, j, this.c, nw40Var.d)));
        this.c = j;
        return aVar;
    }
}
