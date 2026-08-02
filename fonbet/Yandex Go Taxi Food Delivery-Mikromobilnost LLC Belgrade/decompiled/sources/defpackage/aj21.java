package defpackage;

import androidx.camera.core.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class aj21 {
    public xt31 a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    static {
        Arrays.asList(1, 2, 4, 3, 7);
    }

    public final void a(j jVar) {
        this.b.add(jVar);
    }

    public final bj21 b() {
        ArrayList arrayList = this.b;
        d6z.m("UseCase must not be empty.", !arrayList.isEmpty());
        ArrayList arrayList2 = this.c;
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            throw unr0.i(it);
        }
        return new bj21(this.a, arrayList, arrayList2);
    }
}
