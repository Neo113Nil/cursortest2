package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.cache.PinCacheMode;

/* loaded from: classes7.dex */
public final class exb0 {
    public final ArrayList a = new ArrayList();

    public final wub0 a(PinCacheMode pinCacheMode) {
        wub0 wub0Var = new wub0(pinCacheMode);
        this.a.add(wub0Var);
        return wub0Var;
    }

    public final void b(Collection collection) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            wub0 wub0Var = (wub0) it.next();
            if (wub0Var.a == PinCacheMode.PERMANENT) {
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    wub0Var.b.remove((mwb0) it2.next());
                }
            }
        }
    }
}
