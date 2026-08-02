package xsna;

import com.vk.log.L;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: BroadcastListenerProxyImpl.kt */
/* loaded from: classes11.dex */
public final class ch8 implements bh8 {
    public final CopyOnWriteArraySet<ah8> b = new CopyOnWriteArraySet<>();

    public final void a(ah8 ah8Var) {
        StringBuilder sb = new StringBuilder("broadcastListeners: ");
        CopyOnWriteArraySet<ah8> copyOnWriteArraySet = this.b;
        L.e("BroadcastListenerProxy", fw3.d(copyOnWriteArraySet, sb));
        copyOnWriteArraySet.add(ah8Var);
    }

    @Override // xsna.ah8
    public final void e(hd8 hd8Var) {
        i0q0.i(0L, new bi5(new j4(4, this, hd8Var), 1));
    }

    @Override // xsna.ah8
    public final void g(whr0 whr0Var) {
        i0q0.i(0L, new bi5(new s(5, this, whr0Var), 1));
    }
}
