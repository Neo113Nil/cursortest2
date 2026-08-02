package xsna;

import android.content.SharedPreferences;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import xsna.cda0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class gca implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gca(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                kca kcaVar = (kca) this.c;
                int i = kcaVar.b;
                m1q m1qVar = new m1q(i, 2);
                for (int i2 = 0; i2 < i; i2++) {
                    String string = ((SharedPreferences) kcaVar.a.getValue()).getString("rec" + i2, null);
                    if (string == null) {
                        return m1qVar;
                    }
                    m1qVar.add(string);
                }
                return m1qVar;
            case 1:
                km70 km70Var = (km70) this.c;
                Uri uri = km70Var.g().a;
                List<p2h0> b = km70Var.h.b(uri);
                ArrayList arrayList = new ArrayList(c5g.u(b, 10));
                int i3 = 0;
                for (Object obj : b) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        e43.t();
                        throw null;
                    }
                    p2h0 p2h0Var = (p2h0) obj;
                    km70Var.i.put(Integer.valueOf(i3), a3h0.a(p2h0Var.d, uri));
                    arrayList.add(new r06(i3, p2h0Var.b, p2h0Var.c));
                    i3 = i4;
                }
                return arrayList;
            case 2:
                Set set = (Set) this.c;
                return new cda0.a(cda0.d(set, false), cda0.d(set, true));
            default:
                com.vk.voip.ui.c.C((com.vk.voip.ui.c) ((plx0) this.c).i.getValue(), null, 500L, false, false, true, null, 205);
                return s3q0.a;
        }
    }

    public /* synthetic */ gca(cda0 cda0Var, Set set) {
        this.b = 2;
        this.c = set;
    }
}
