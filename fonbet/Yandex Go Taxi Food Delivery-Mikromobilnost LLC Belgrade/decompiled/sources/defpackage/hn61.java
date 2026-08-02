package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.wq;

/* loaded from: classes7.dex */
public final class hn61 {
    public final l291 a;
    public no71 b;
    public long c;
    public File d;
    public k2k0 e;
    public long f;
    public long g;
    public k2k0 h;

    public hn61(z171 z171Var) {
        z171Var.getClass();
        this.a = z171Var;
    }

    public final void a() {
        k2k0 k2k0Var = this.e;
        if (k2k0Var == null) {
            return;
        }
        try {
            k2k0Var.flush();
            rf71.m(this.e);
            this.e = null;
            File file = this.d;
            this.d = null;
            l291 l291Var = this.a;
            long j = this.f;
            z171 z171Var = (z171) l291Var;
            synchronized (z171Var) {
                if (file.exists()) {
                    if (j == 0) {
                        file.delete();
                        return;
                    }
                    c871 a = c871.a(file, j, -9223372036854775807L, z171Var.c);
                    a.getClass();
                    vmn0 vmn0Var = z171Var.c;
                    hg81 hg81Var = (hg81) ((HashMap) vmn0Var.a).get(a.a);
                    hg81Var.getClass();
                    if (!hg81Var.c(a.b, a.c)) {
                        throw new IllegalStateException();
                    }
                    long a2 = j571.a(hg81Var.e);
                    if (a2 != -1 && a.b + a.c > a2) {
                        throw new IllegalStateException();
                    }
                    if (z171Var.d != null) {
                        try {
                            z171Var.d.g(a.c, a.y, file.getName());
                        } catch (IOException e) {
                            throw new wq(e);
                        }
                    }
                    z171Var.d(a);
                    try {
                        z171Var.c.f();
                        z171Var.notifyAll();
                    } finally {
                        wq wqVar = new wq(e);
                    }
                }
            }
        } catch (Throwable th) {
            rf71.m(this.e);
            this.e = null;
            File file2 = this.d;
            this.d = null;
            file2.delete();
            throw th;
        }
    }

    public final void b(no71 no71Var) {
        File file;
        long j = no71Var.f;
        long min = j == -1 ? -1L : Math.min(j - this.g, this.c);
        l291 l291Var = this.a;
        String str = no71Var.g;
        int i = rf71.a;
        long j2 = no71Var.e + this.g;
        z171 z171Var = (z171) l291Var;
        synchronized (z171Var) {
            try {
                z171Var.c();
                hg81 hg81Var = (hg81) ((HashMap) z171Var.c.a).get(str);
                hg81Var.getClass();
                if (!hg81Var.c(j2, min)) {
                    throw new IllegalStateException();
                }
                if (!z171Var.a.exists()) {
                    z171.e(z171Var.a);
                    z171Var.n();
                }
                r371 r371Var = z171Var.b;
                if (min != -1) {
                    r371Var.a(z171Var, min);
                } else {
                    r371Var.getClass();
                }
                File file2 = new File(z171Var.a, Integer.toString(z171Var.f.nextInt(10)));
                if (!file2.exists()) {
                    z171.e(file2);
                }
                long currentTimeMillis = System.currentTimeMillis();
                int i2 = hg81Var.a;
                Pattern pattern = c871.z;
                file = new File(file2, i2 + Extension.DOT_CHAR + j2 + Extension.DOT_CHAR + currentTimeMillis + ".v3.exo");
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d = file;
        FileOutputStream fileOutputStream = new FileOutputStream(this.d);
        k2k0 k2k0Var = this.h;
        if (k2k0Var == null) {
            this.h = new k2k0(fileOutputStream, 20480, 1);
        } else {
            k2k0Var.a(fileOutputStream);
        }
        this.e = this.h;
        this.f = 0L;
    }
}
