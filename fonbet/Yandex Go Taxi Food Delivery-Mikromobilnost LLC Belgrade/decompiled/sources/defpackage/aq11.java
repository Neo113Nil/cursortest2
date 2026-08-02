package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes15.dex */
public final class aq11 {
    public final zq60 a = new zq60();
    public final HashSet b = new HashSet();
    public final o1b0 c;
    public final Handler d;
    public final w3c e;

    public aq11(o1b0 o1b0Var, Handler handler, w3c w3cVar) {
        this.c = o1b0Var;
        this.d = handler;
        this.e = w3cVar;
    }

    public final void a() {
        boolean z;
        z83.g(null, this.d.getLooper(), Looper.myLooper());
        zq60 zq60Var = this.a;
        zq60Var.getClass();
        zq60Var.b++;
        ArrayList arrayList = zq60Var.a;
        int size = arrayList.size();
        int i = 0;
        boolean z2 = false;
        while (true) {
            int i2 = i;
            while (i2 < size && arrayList.get(i2) == null) {
                i2++;
            }
            if (i2 < size) {
                z = true;
            } else {
                if (!z2) {
                    zq60.a(zq60Var);
                    z2 = true;
                }
                z = false;
            }
            if (!z) {
                return;
            }
            while (i < size && arrayList.get(i) == null) {
                i++;
            }
            if (i >= size) {
                if (!z2) {
                    zq60.a(zq60Var);
                }
                ny61.p();
                return;
            } else {
                int i3 = i + 1;
                xp11 xp11Var = (xp11) arrayList.get(i);
                xp11Var.a.post(new hpo0(18, xp11Var, new ArrayList(this.b), this.c));
                i = i3;
            }
        }
    }
}
