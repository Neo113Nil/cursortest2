package xsna;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: AutoPlayPauseStrategyComposite.kt */
/* loaded from: classes2.dex */
public final class zh5 implements yh5 {
    public final List<yh5> a;

    /* JADX WARN: Multi-variable type inference failed */
    public zh5(List<? extends yh5> list) {
        this.a = list;
    }

    @Override // xsna.yh5
    public final boolean a(yg5 yg5Var) {
        List<yh5> list = this.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((yh5) it.next()).a(yg5Var)) {
                return false;
            }
        }
        return true;
    }
}
