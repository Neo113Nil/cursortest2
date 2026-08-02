package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ilc {
    public qa50 a;
    public final ArrayList b = new ArrayList();
    public final Handler c = new Handler(Looper.getMainLooper());

    public final void a() {
        this.a = null;
    }

    public final void b(qa50 qa50Var) {
        this.a = qa50Var;
        ArrayList arrayList = this.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((hw2) qa50Var).b((dlc[]) it.next());
        }
        arrayList.clear();
    }
}
