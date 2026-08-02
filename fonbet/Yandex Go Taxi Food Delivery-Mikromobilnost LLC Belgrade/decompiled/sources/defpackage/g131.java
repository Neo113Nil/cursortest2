package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class g131 implements qrq0 {
    public final ArrayList a = new ArrayList();

    public final void b(String str, Object obj) {
        this.a.add(new f131(str, obj));
    }

    @Override // defpackage.qrq0
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
