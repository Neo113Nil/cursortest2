package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class ho40 {
    public final long a;
    public final kkq0 b;
    public final kkq0 c;
    public dry0 e;
    public final ho40 d = this;
    public int f = -1;

    public ho40(long j, kkq0 kkq0Var, kkq0 kkq0Var2) {
        this.a = j;
        this.b = kkq0Var;
        this.c = kkq0Var2;
    }

    public final long a(ckq0 ckq0Var, boolean z) {
        dry0 dry0Var;
        bkq0 bkq0Var = ckq0Var.b;
        bkq0 bkq0Var2 = ckq0Var.a;
        long j = this.a;
        if (z && bkq0Var2.c != j) {
            return 9205357640488583168L;
        }
        if ((!z && bkq0Var.c != j) || c() == null || (dry0Var = (dry0) this.c.invoke()) == null) {
            return 9205357640488583168L;
        }
        return wnb1.c(dry0Var, y6i0.d(z ? bkq0Var2.b : bkq0Var.b, 0, b(dry0Var)), z, ckq0Var.c);
    }

    public final int b(dry0 dry0Var) {
        int i;
        int i2;
        synchronized (this.d) {
            try {
                if (this.e != dry0Var) {
                    if (dry0Var.d()) {
                        hm40 hm40Var = dry0Var.b;
                        if (!hm40Var.c) {
                            i2 = hm40Var.e((int) (dry0Var.c & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                            int i3 = dry0Var.b.f - 1;
                            if (i2 > i3) {
                                i2 = i3;
                            }
                            while (i2 >= 0 && dry0Var.b.f(i2) >= ((int) (dry0Var.c & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) {
                                i2--;
                            }
                            if (i2 < 0) {
                                i2 = 0;
                            }
                            this.f = dry0Var.b.c(i2, true);
                            this.e = dry0Var;
                        }
                    }
                    i2 = dry0Var.b.f - 1;
                    this.f = dry0Var.b.c(i2, true);
                    this.e = dry0Var;
                }
                i = this.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final rzx c() {
        rzx rzxVar = (rzx) this.b.invoke();
        if (rzxVar == null || !rzxVar.d()) {
            return null;
        }
        return rzxVar;
    }

    public final kk2 d() {
        dry0 dry0Var = (dry0) this.c.invoke();
        return dry0Var == null ? new kk2("") : dry0Var.a.a;
    }
}
