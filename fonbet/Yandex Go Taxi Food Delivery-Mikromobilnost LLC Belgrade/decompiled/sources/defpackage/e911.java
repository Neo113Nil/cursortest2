package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.a;

/* loaded from: classes6.dex */
public final class e911 {
    public final Context a;
    public final tls b;
    public final i3y c;
    public w4e0 d;
    public final float e = 3.0f;
    public final float f = 2.0f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean i = true;
    public boolean j = true;

    public e911(xm00 xm00Var, Context context, tls tlsVar) {
        this.a = context;
        this.b = tlsVar;
        this.c = a.a(new dz1(xm00Var, 2));
    }

    public final void a() {
        ArrayList arrayList = this.g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f4c0 f4c0Var = (f4c0) it.next();
            f4c0Var.d();
            f4c0Var.g(null);
        }
        arrayList.clear();
        ArrayList arrayList2 = this.h;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            f4c0 f4c0Var2 = (f4c0) it2.next();
            f4c0Var2.d();
            f4c0Var2.g(null);
        }
        arrayList2.clear();
        this.d = null;
        ((xm00) this.c.getValue()).m();
    }
}
