package defpackage;

import android.os.Looper;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class m0b implements qb7 {
    public final zq60 a = new zq60();
    public final Looper b;
    public final ymu c;
    public final c8b w;

    public m0b(Looper looper, sb7 sb7Var, ymu ymuVar, c8b c8bVar) {
        this.b = looper;
        this.c = ymuVar;
        this.w = c8bVar;
        sb7Var.a(this);
    }

    @Override // defpackage.qb7
    public final void k() {
        boolean z;
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
                ((x6f0) ((h4t) arrayList.get(i)).a).d(this.c.o());
                i = i3;
            }
        }
    }
}
