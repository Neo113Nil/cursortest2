package xsna;

import java.util.Iterator;
import java.util.List;
import xsna.lm50;

/* compiled from: CompositeMviMiddleware.kt */
/* loaded from: classes3.dex */
public final class xti<State extends lm50> implements rl50<State> {
    public final sl50<State, ?, ?, ?, ?, ?> b;
    public final List<rl50<State>> c;

    /* JADX WARN: Multi-variable type inference failed */
    public xti(sl50<State, ?, ?, ?, ?, ?> sl50Var, List<? extends rl50<State>> list) {
        this.b = sl50Var;
        this.c = list;
    }

    @Override // xsna.uic
    public final void clear() {
        Iterator<T> it = this.c.iterator();
        while (it.hasNext()) {
            ((rl50) it.next()).clear();
        }
    }

    @Override // xsna.rl50
    public final void init() {
        Iterator<T> it = this.c.iterator();
        while (it.hasNext()) {
            ((rl50) it.next()).init();
        }
    }
}
