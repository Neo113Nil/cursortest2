package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public abstract class mq81 implements ic81 {
    private final no71 a;
    private final tn81 b;
    private final ArrayList c;
    private final ly61 d;
    private final l291 e;
    private final ee71 f;
    private final Executor g;
    private final ArrayList h;
    private volatile boolean i;

    public mq81(op81 op81Var, tn81 tn81Var, ly61 ly61Var, Executor executor) {
        op81Var.b.getClass();
        d981 d981Var = op81Var.b;
        Uri uri = d981Var.a;
        Map map = Collections.EMPTY_MAP;
        cha1.b(uri, "The uri must be set.");
        this.a = new no71(uri, 0L, null, map, 0L, -1L, null, 1);
        this.b = tn81Var;
        this.c = new ArrayList(d981Var.b);
        this.d = ly61Var;
        this.g = executor;
        z171 z171Var = ly61Var.a;
        z171Var.getClass();
        this.e = z171Var;
        this.f = ee71.w5;
        this.h = new ArrayList();
    }

    public static void d(ArrayList arrayList, ee71 ee71Var) {
        HashMap hashMap = new HashMap();
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            yj81 yj81Var = (yj81) arrayList.get(i2);
            no71 no71Var = yj81Var.b;
            ((yx61) ee71Var).getClass();
            String str = no71Var.g;
            if (str == null) {
                str = no71Var.a.toString();
            }
            Integer num = (Integer) hashMap.get(str);
            yj81 yj81Var2 = num == null ? null : (yj81) arrayList.get(num.intValue());
            if (yj81Var2 != null) {
                long j = yj81Var2.a;
                no71 no71Var2 = yj81Var2.b;
                long j2 = no71Var2.f;
                if (yj81Var.a <= 20000000 + j && no71Var2.a.equals(no71Var.a) && j2 != -1 && no71Var2.e + j2 == no71Var.e && rf71.o(no71Var2.g, no71Var.g) && no71Var2.h == no71Var.h && no71Var2.d.equals(no71Var.d)) {
                    long j3 = no71Var.f;
                    no71 a = no71Var2.a(0L, j3 == -1 ? -1L : j2 + j3);
                    num.getClass();
                    arrayList.set(num.intValue(), new yj81(j, a));
                }
            }
            hashMap.put(str, Integer.valueOf(i));
            arrayList.set(i, yj81Var);
            i++;
        }
        int size = arrayList.size();
        int i3 = rf71.a;
        if (i < 0 || size > arrayList.size() || i > size) {
            w511.q();
        } else if (i != size) {
            arrayList.subList(i, size).clear();
        }
    }

    public abstract ArrayList a(n171 n171Var, dh81 dh81Var, boolean z);

    @Override // defpackage.ic81
    public final void a(zv71 zv71Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        n171 a;
        byte[] bArr;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        try {
            ly61 ly61Var = this.d;
            hn71 hn71Var = ly61Var.b;
            n171 a2 = ly61Var.a(hn71Var != null ? hn71Var.a() : null, 1);
            dh81 dh81Var = (dh81) a(new rd81(this, a2, this.a), false);
            if (!this.c.isEmpty()) {
                dh81Var = dh81Var.b(this.c);
            }
            ArrayList a3 = a(a2, dh81Var, false);
            Collections.sort(a3);
            d(a3, this.f);
            int size = a3.size();
            long j = 0;
            int i = 0;
            long j2 = 0;
            for (int size2 = a3.size() - 1; size2 >= 0; size2--) {
                no71 no71Var = ((yj81) a3.get(size2)).b;
                ((yx61) this.f).getClass();
                String str = no71Var.g;
                if (str == null) {
                    str = no71Var.a.toString();
                }
                long j3 = no71Var.f;
                if (j3 == -1) {
                    long a4 = j571.a(((z171) this.e).j(str));
                    if (a4 != -1) {
                        j3 = a4 - no71Var.e;
                    }
                }
                long j4 = j3;
                long a5 = ((z171) this.e).a(no71Var.e, j4, str);
                j += a5;
                if (j4 != -1) {
                    if (j4 == a5) {
                        i++;
                        a3.remove(size2);
                    }
                    if (j2 != -1) {
                        j2 += j4;
                    }
                } else {
                    j2 = -1;
                }
            }
            g8q0 g8q0Var = new g8q0(size, i, j2, j, zv71Var);
            arrayDeque.addAll(a3);
            while (!this.i && !arrayDeque.isEmpty()) {
                if (arrayDeque2.isEmpty()) {
                    ly61 ly61Var2 = this.d;
                    hn71 hn71Var2 = ly61Var2.b;
                    a = ly61Var2.a(hn71Var2 != null ? hn71Var2.a() : null, 1);
                    bArr = new byte[131072];
                } else {
                    en81 en81Var = (en81) arrayDeque2.removeFirst();
                    a = en81Var.a;
                    bArr = en81Var.x;
                }
                en81 en81Var2 = new en81((yj81) arrayDeque.removeFirst(), a, g8q0Var, bArr);
                c(en81Var2);
                this.g.execute(en81Var2);
                for (int size3 = this.h.size() - 1; size3 >= 0; size3--) {
                    en81 en81Var3 = (en81) this.h.get(size3);
                    if (arrayDeque.isEmpty() || en81Var3.isDone()) {
                        try {
                            en81Var3.c.a();
                            en81Var3.c();
                            b(size3);
                            arrayDeque2.addLast(en81Var3);
                        } catch (ExecutionException e) {
                            Throwable cause = e.getCause();
                            cause.getClass();
                            if (!(cause instanceof IOException)) {
                                throw cause;
                            }
                            throw ((IOException) cause);
                        }
                    }
                }
                en81Var2.b.b();
            }
            int i2 = 0;
            while (true) {
                int size4 = this.h.size();
                arrayList2 = this.h;
                if (i2 >= size4) {
                    break;
                }
                ((de71) arrayList2.get(i2)).cancel(true);
                i2++;
            }
            for (int size5 = arrayList2.size() - 1; size5 >= 0; size5--) {
                ((de71) this.h.get(size5)).c.b();
                b(size5);
            }
        } catch (Throwable th) {
            int i3 = 0;
            while (true) {
                int size6 = this.h.size();
                arrayList = this.h;
                if (i3 >= size6) {
                    break;
                }
                ((de71) arrayList.get(i3)).cancel(true);
                i3++;
            }
            for (int size7 = arrayList.size() - 1; size7 >= 0; size7--) {
                ((de71) this.h.get(size7)).c.b();
                b(size7);
            }
            throw th;
        }
    }

    public final void b(int i) {
        synchronized (this.h) {
            this.h.remove(i);
        }
    }

    public final void c(de71 de71Var) {
        synchronized (this.h) {
            try {
                if (this.i) {
                    throw new InterruptedException();
                }
                this.h.add(de71Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ic81
    public final void cancel() {
        synchronized (this.h) {
            try {
                this.i = true;
                for (int i = 0; i < this.h.size(); i++) {
                    ((de71) this.h.get(i)).cancel(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ic81
    public final void remove() {
        n171 a = this.d.a(null, 1);
        try {
            try {
                ArrayList a2 = a(a, (dh81) a(new rd81(this, a, this.a), true), true);
                for (int i = 0; i < a2.size(); i++) {
                    l291 l291Var = this.e;
                    ee71 ee71Var = this.f;
                    no71 no71Var = ((yj81) a2.get(i)).b;
                    ((yx61) ee71Var).getClass();
                    String str = no71Var.g;
                    if (str == null) {
                        str = no71Var.a.toString();
                    }
                    ((z171) l291Var).o(str);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                l291 l291Var2 = this.e;
                z171 z171Var = (z171) l291Var2;
                z171Var.o(((yx61) this.f).b(this.a));
                return;
            } catch (Exception unused2) {
            }
            l291 l291Var3 = this.e;
            z171 z171Var2 = (z171) l291Var3;
            z171Var2.o(((yx61) this.f).b(this.a));
        } catch (Throwable th) {
            l291 l291Var4 = this.e;
            z171 z171Var3 = (z171) l291Var4;
            z171Var3.o(((yx61) this.f).b(this.a));
            throw th;
        }
    }

    public final Object a(de71 de71Var, boolean z) {
        if (z) {
            de71Var.run();
            try {
                de71Var.c.a();
                return de71Var.c();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                int i = rf71.a;
                throw e;
            }
        }
        if (!this.i) {
            c(de71Var);
            this.g.execute(de71Var);
            try {
                try {
                    de71Var.c.a();
                    Object c = de71Var.c();
                    de71Var.c.b();
                    synchronized (this.h) {
                        this.h.remove(de71Var);
                    }
                    return c;
                } catch (ExecutionException e2) {
                    Throwable cause2 = e2.getCause();
                    cause2.getClass();
                    if (cause2 instanceof IOException) {
                        throw ((IOException) cause2);
                    }
                    int i2 = rf71.a;
                    throw e2;
                }
            } catch (Throwable th) {
                de71Var.c.b();
                synchronized (this.h) {
                    this.h.remove(de71Var);
                    throw th;
                }
            }
        }
        throw new InterruptedException();
    }
}
