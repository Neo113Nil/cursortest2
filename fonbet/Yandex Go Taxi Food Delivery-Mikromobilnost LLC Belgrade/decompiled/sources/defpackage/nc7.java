package defpackage;

import android.graphics.Bitmap;
import coil.network.a;
import coil.util.b;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class nc7 {
    public final d5j0 a;
    public final a b;
    public final Date c;
    public final String d;
    public final Date e;
    public final String f;
    public final Date g;
    public final long h;
    public final long i;
    public final String j;
    public final int k;

    public nc7(d5j0 d5j0Var, a aVar) {
        int i;
        this.a = d5j0Var;
        this.b = aVar;
        this.k = -1;
        if (aVar != null) {
            this.h = aVar.c;
            this.i = aVar.d;
            meu meuVar = aVar.f;
            int size = meuVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                String b = meuVar.b(i2);
                if (b.equalsIgnoreCase("Date")) {
                    String a = meuVar.a("Date");
                    this.c = a != null ? brg.a(a) : null;
                    this.d = meuVar.f(i2);
                } else if (b.equalsIgnoreCase("Expires")) {
                    String a2 = meuVar.a("Expires");
                    this.g = a2 != null ? brg.a(a2) : null;
                } else if (b.equalsIgnoreCase("Last-Modified")) {
                    String a3 = meuVar.a("Last-Modified");
                    this.e = a3 != null ? brg.a(a3) : null;
                    this.f = meuVar.f(i2);
                } else if (b.equalsIgnoreCase("ETag")) {
                    this.j = meuVar.f(i2);
                } else if (b.equalsIgnoreCase("Age")) {
                    String f = meuVar.f(i2);
                    Bitmap.Config[] configArr = m.a;
                    Long m = bvu0.m(10, f);
                    if (m != null) {
                        long longValue = m.longValue();
                        i = longValue > 2147483647L ? Integer.MAX_VALUE : longValue < 0 ? 0 : (int) longValue;
                    } else {
                        i = -1;
                    }
                    this.k = i;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c7, code lost:
    
        if (r2 > 0) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final rc7 a() {
        a aVar;
        long j;
        String sb;
        long j2;
        long j3;
        long j4;
        int i;
        d5j0 d5j0Var = this.a;
        meu meuVar = d5j0Var.c;
        kwu kwuVar = d5j0Var.a;
        a aVar2 = this.b;
        if (aVar2 == null) {
            return new rc7(d5j0Var, null);
        }
        i3y i3yVar = aVar2.a;
        if (kwuVar.f() && !aVar2.e) {
            return new rc7(d5j0Var, null);
        }
        za7 za7Var = (za7) i3yVar.getValue();
        if (d5j0Var.a().b || ((za7) i3yVar.getValue()).b || jl40.l(aVar2.f.a("Vary"), "*")) {
            return new rc7(d5j0Var, null);
        }
        za7 a = d5j0Var.a();
        if (!a.a) {
            String str = "If-Modified-Since";
            if (meuVar.a("If-Modified-Since") == null && meuVar.a("If-None-Match") == null) {
                long j5 = this.i;
                Date date = this.c;
                if (date != null) {
                    aVar = aVar2;
                    j = Math.max(0L, j5 - date.getTime());
                } else {
                    aVar = aVar2;
                    j = 0;
                }
                TimeUnit timeUnit = TimeUnit.SECONDS;
                int i2 = this.k;
                if (i2 != -1) {
                    j = Math.max(j, timeUnit.toMillis(i2));
                }
                long j6 = this.h;
                long a2 = j + (j5 - j6) + (b.a() - j5);
                int i3 = ((za7) i3yVar.getValue()).c;
                Date date2 = this.e;
                if (i3 != -1) {
                    j2 = timeUnit.toMillis(i3);
                } else {
                    Date date3 = this.g;
                    if (date3 != null) {
                        if (date != null) {
                            j5 = date.getTime();
                        }
                        j2 = date3.getTime() - j5;
                    } else {
                        if (date2 != null) {
                            List list = kwuVar.g;
                            if (list == null) {
                                sb = null;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sms.b(list, sb2);
                                sb = sb2.toString();
                            }
                            if (sb == null) {
                                if (date != null) {
                                    j6 = date.getTime();
                                }
                                long time = j6 - date2.getTime();
                                if (time > 0) {
                                    j2 = time / 10;
                                }
                            }
                        }
                        j2 = 0;
                    }
                }
                int i4 = a.c;
                if (i4 != -1) {
                    j2 = Math.min(j2, timeUnit.toMillis(i4));
                }
                int i5 = a.i;
                long millis = i5 != -1 ? timeUnit.toMillis(i5) : 0L;
                if (za7Var.g || (i = a.h) == -1) {
                    j3 = j2;
                    j4 = 0;
                } else {
                    j3 = j2;
                    j4 = timeUnit.toMillis(i);
                }
                if (!za7Var.a && a2 + millis < j3 + j4) {
                    return new rc7(null, aVar);
                }
                a aVar3 = aVar;
                String str2 = this.j;
                if (str2 != null) {
                    str = "If-None-Match";
                } else if (date2 != null) {
                    str2 = this.f;
                } else {
                    if (date == null) {
                        return new rc7(d5j0Var, null);
                    }
                    str2 = this.d;
                }
                t4j0 b = d5j0Var.b();
                b.c.a(str, str2);
                return new rc7(new d5j0(b), aVar3);
            }
        }
        return new rc7(d5j0Var, null);
    }
}
