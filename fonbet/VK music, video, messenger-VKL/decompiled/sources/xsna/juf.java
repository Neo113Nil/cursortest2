package xsna;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: ClipsWrapperTooltipsHider.kt */
/* loaded from: classes17.dex */
public final class juf implements roc {
    public final czc b;

    public juf(czc czcVar) {
        this.b = czcVar;
    }

    @Override // xsna.roc
    public final void M7() {
        this.b.b.set(true);
    }

    @Override // xsna.roc
    public final void p5() {
        czc czcVar = this.b;
        czcVar.b.set(false);
        Map<add, Runnable> map = czcVar.a;
        List O0 = j5g.O0(map.values());
        map.clear();
        Iterator it = O0.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
