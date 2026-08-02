package defpackage;

import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class i4b {
    public final zq60 a = new zq60();
    public final naz0 b;
    public final fxj0 c;
    public final k020 d;
    public final x22 e;
    public ixj0 f;

    public i4b(naz0 naz0Var, fxj0 fxj0Var, k020 k020Var, wff0 wff0Var, x22 x22Var) {
        this.b = naz0Var;
        this.c = fxj0Var;
        this.d = k020Var;
        this.e = x22Var;
        wff0Var.a(new fn3(1, this));
    }

    public final void a() {
        boolean z;
        this.f = null;
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
                zq60Var.clear();
                naz0 naz0Var = this.b;
                this.e.f("chat joined", "chat id", naz0Var.a.b, "chat type", naz0Var.c());
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
                ((Runnable) arrayList.get(i)).run();
                i++;
            }
        }
    }
}
