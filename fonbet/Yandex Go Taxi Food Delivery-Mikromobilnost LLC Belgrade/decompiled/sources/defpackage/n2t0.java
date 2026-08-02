package defpackage;

/* loaded from: classes.dex */
public final class n2t0 {
    public o2t0 a = new fis0();

    public final Object a(ci9 ci9Var, sls slsVar) {
        fis0 fis0Var;
        ioq0 ioq0Var;
        if (this.a == null) {
            khe0.b("Called runAndWatch on a manager that has been disposed of");
        }
        o2t0 o2t0Var = this.a;
        if ((o2t0Var instanceof fis0) && (ioq0Var = (fis0Var = (fis0) o2t0Var).f) != null && !ioq0Var.equals(ci9Var)) {
            xm40 xm40Var = new xm40();
            ioq0 ioq0Var2 = fis0Var.f;
            if (ioq0Var2 == null) {
                khe0.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            iz40 iz40Var = fis0Var.d;
            if (iz40Var == null) {
                xm40Var.e(ioq0Var2, fis0Var.b);
            } else {
                Object[] objArr = iz40Var.b;
                long[] jArr = iz40Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    xm40Var.e(ioq0Var2, objArr[(i << 3) + i3]);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
            }
            xm40Var.b();
            fis0Var.c();
            this.a = xm40Var;
        }
        o2t0 o2t0Var2 = this.a;
        i2t0 u = q2t0.j().u(o2t0Var2.d(ci9Var));
        o2t0Var2.a(ci9Var);
        try {
            i2t0 j2 = u.j();
            try {
                Object invoke = slsVar.invoke();
                u.c();
                o2t0Var2.b();
                return invoke;
            } finally {
                i2t0.q(j2);
            }
        } catch (Throwable th) {
            u.c();
            throw th;
        }
    }
}
