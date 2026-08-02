package xsna;

import android.os.Handler;
import androidx.media3.exoplayer.offline.c;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$LongRef;

/* compiled from: VideoCacheManager.kt */
/* loaded from: classes8.dex */
public final class w7s0 implements c.InterfaceC0061c {
    public final one.video.exo.offline.g b;
    public final /* synthetic */ v7s0 c;
    public final /* synthetic */ k7s0 d;

    public w7s0(v7s0 v7s0Var, k7s0 k7s0Var) {
        this.c = v7s0Var;
        this.d = k7s0Var;
        this.b = new one.video.exo.offline.g(new x7s0(v7s0Var, k7s0Var, new Ref$LongRef()));
    }

    @Override // androidx.media3.exoplayer.offline.c.InterfaceC0061c
    public final void a(o7o o7oVar) {
        k7s0 k7s0Var = this.d;
        k7s0Var.g = pn00.l(o7oVar.a.b, k7s0Var.g);
        g();
        v7s0.a(this.c, k7s0Var);
    }

    @Override // androidx.media3.exoplayer.offline.c.InterfaceC0061c
    public final void e(androidx.media3.exoplayer.offline.c cVar, o7o o7oVar, Exception exc) {
        k7s0 k7s0Var = this.d;
        k7s0Var.g = pn00.o(k7s0Var.g, new Pair(o7oVar.a.b, o7oVar));
        g();
        v7s0.a(this.c, k7s0Var);
    }

    public final void g() {
        Collection<o7o> values = this.d.g.values();
        boolean z = values instanceof Collection;
        one.video.exo.offline.g gVar = this.b;
        if (!z || !values.isEmpty()) {
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                if (((o7o) it.next()).b == 2) {
                    Handler handler = gVar.b;
                    handler.removeCallbacksAndMessages(null);
                    gVar.a.a();
                    mco mcoVar = gVar.c;
                    handler.removeCallbacks(mcoVar);
                    handler.postDelayed(mcoVar, 1000L);
                    return;
                }
            }
        }
        gVar.b.removeCallbacksAndMessages(null);
    }
}
