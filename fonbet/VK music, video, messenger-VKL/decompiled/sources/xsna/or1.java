package xsna;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import xsna.h7u0;

/* compiled from: AlertDialogBuilder.kt */
/* loaded from: classes17.dex */
public final class or1 {
    public final Context a;
    public final ArrayList b = new ArrayList();

    public or1(Context context) {
        this.a = context;
    }

    public final void a(int i, Runnable runnable) {
        b(runnable, this.a.getString(i));
    }

    public final void b(Runnable runnable, String str) {
        this.b.add(new Pair(str, runnable));
    }

    public final h7u0.a c() {
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((Pair) it.next()).i());
        }
        String[] strArr = (String[]) arrayList2.toArray(new String[0]);
        h7u0.a aVar = new h7u0.a(this.a);
        aVar.T(strArr, new nr1(this, 0));
        return aVar;
    }

    public final androidx.appcompat.app.d d() {
        return c().m();
    }
}
