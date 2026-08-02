package defpackage;

import androidx.compose.runtime.f;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class n3t0 {
    public final tls a;
    public boolean c;
    public h2t0 h;
    public m3t0 i;
    public final AtomicReference b = new AtomicReference(null);
    public final jid d = new jid(8, this);
    public final ate0 e = new ate0(16, this);
    public final wz40 f = new wz40(new m3t0[16]);
    public final Object g = new Object();
    public long j = -1;

    public n3t0(tls tlsVar) {
        this.a = tlsVar;
    }

    public final void a() {
        synchronized (this.g) {
            wz40 wz40Var = this.f;
            Object[] objArr = wz40Var.a;
            int i = wz40Var.c;
            for (int i2 = 0; i2 < i; i2++) {
                m3t0 m3t0Var = (m3t0) objArr[i2];
                m3t0Var.e.h();
                m3t0Var.f.h();
                m3t0Var.l.h();
                m3t0Var.m.clear();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.g) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List list2 = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        lid.b("Unexpected notification");
                        ny61.A();
                        return false;
                    }
                    List list3 = (List) obj;
                    Set set3 = (Set) list3.get(0);
                    if (list3.size() == 2) {
                        list2 = list3.get(1);
                    } else if (list3.size() > 2) {
                        list2 = list3.subList(1, list3.size());
                    }
                    set2 = set3;
                    list = list2;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.g) {
                wz40 wz40Var = this.f;
                Object[] objArr = wz40Var.a;
                int i = wz40Var.c;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((m3t0) objArr[i2]).a(set) || z2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0215 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [wz40] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Object obj, tls tlsVar, sls slsVar) {
        ?? r6;
        Object obj2;
        m3t0 m3t0Var;
        boolean z;
        m3t0 m3t0Var2;
        long j;
        long j2;
        m3t0 m3t0Var3;
        i2t0 tz01Var;
        long j3;
        qy40 qy40Var;
        int i;
        long j4;
        qy40 qy40Var2;
        long i2 = qke.i();
        synchronized (this.g) {
            r6 = this.f;
            Object[] objArr = r6.a;
            int i3 = r6.c;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i4];
                if (((m3t0) obj2).a == tlsVar) {
                    break;
                } else {
                    i4++;
                }
            }
            m3t0Var = (m3t0) obj2;
            z = true;
            if (m3t0Var == null) {
                ym11.e(1, tlsVar);
                m3t0Var = new m3t0(tlsVar);
                r6.b(m3t0Var);
            }
            m3t0Var2 = this.i;
            j = this.j;
        }
        long j5 = r6;
        if (j != -1) {
            j5 = r6;
            if (j != i2) {
                StringBuilder w = unr0.w(j, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
                w.append(i2);
                w.append(", name=");
                w.append(Thread.currentThread().getName());
                w.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
                khe0.a(w.toString());
                j5 = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.";
            }
        }
        try {
            synchronized (this.g) {
                try {
                    this.i = m3t0Var;
                    this.j = i2;
                } catch (Throwable th) {
                    th = th;
                    j2 = j5;
                }
            }
            ate0 ate0Var = this.e;
            Object obj3 = m3t0Var.b;
            qy40 qy40Var3 = m3t0Var.c;
            int i5 = m3t0Var.d;
            m3t0Var.b = obj;
            m3t0Var.c = (qy40) m3t0Var.f.d(obj);
            if (m3t0Var.d == -1) {
                m3t0Var.d = Long.hashCode(q2t0.j().g());
            }
            ats atsVar = m3t0Var.i;
            wz40 c = f.c();
            try {
                c.b(atsVar);
                if (ate0Var == null) {
                    slsVar.invoke();
                    m3t0Var3 = m3t0Var;
                } else {
                    i2t0 i2t0Var = (i2t0) q2t0.b.a();
                    if (i2t0Var instanceof tz01) {
                        m3t0Var3 = m3t0Var;
                        if (((tz01) i2t0Var).t == qke.i()) {
                            tls tlsVar2 = ((tz01) i2t0Var).r;
                            tls tlsVar3 = ((tz01) i2t0Var).s;
                            try {
                                ((tz01) i2t0Var).r = q2t0.k(ate0Var, tlsVar2, true);
                                ((tz01) i2t0Var).s = tlsVar3;
                                slsVar.invoke();
                                ((tz01) i2t0Var).r = tlsVar2;
                                ((tz01) i2t0Var).s = tlsVar3;
                            } catch (Throwable th2) {
                                ((tz01) i2t0Var).r = tlsVar2;
                                ((tz01) i2t0Var).s = tlsVar3;
                                throw th2;
                            }
                        }
                    } else {
                        m3t0Var3 = m3t0Var;
                    }
                    if (i2t0Var == null || (i2t0Var instanceof mz40)) {
                        tz01Var = new tz01(i2t0Var instanceof mz40 ? (mz40) i2t0Var : null, ate0Var, null, true, false);
                    } else {
                        tz01Var = i2t0Var.u(ate0Var);
                    }
                    try {
                        i2t0 j6 = tz01Var.j();
                        try {
                            slsVar.invoke();
                            i2t0.q(j6);
                            tz01Var.c();
                        } catch (Throwable th3) {
                            try {
                                i2t0.q(j6);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    tz01Var.c();
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    c.k(c.c - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                c.k(c.c - 1);
                m3t0 m3t0Var4 = m3t0Var3;
                Object obj4 = m3t0Var4.b;
                int i6 = m3t0Var4.d;
                qy40 qy40Var4 = m3t0Var4.c;
                if (qy40Var4 != null) {
                    try {
                        long[] jArr = qy40Var4.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i7 = 0;
                            while (true) {
                                long j7 = jArr[i7];
                                boolean z2 = z;
                                qy40 qy40Var5 = qy40Var4;
                                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                                    int i9 = 0;
                                    while (i9 < i8) {
                                        if ((j7 & 255) < 128) {
                                            i = i9;
                                            int i10 = (i7 << 3) + i;
                                            j4 = j7;
                                            qy40Var2 = qy40Var5;
                                            Object obj5 = qy40Var2.b[i10];
                                            j3 = j;
                                            try {
                                                boolean z3 = qy40Var2.c[i10] != i6 ? z2 : false;
                                                if (z3) {
                                                    m3t0Var4.c(obj4, obj5);
                                                }
                                                if (z3) {
                                                    qy40Var2.f(i10);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                j2 = j3;
                                                synchronized (this.g) {
                                                    this.i = m3t0Var2;
                                                    this.j = j2;
                                                }
                                                throw th;
                                            }
                                        } else {
                                            i = i9;
                                            j4 = j7;
                                            qy40Var2 = qy40Var5;
                                            j3 = j;
                                        }
                                        i9 = i + 1;
                                        long j8 = j3;
                                        qy40Var5 = qy40Var2;
                                        j7 = j4 >> 8;
                                        j = j8;
                                    }
                                    qy40Var = qy40Var5;
                                    j3 = j;
                                    if (i8 != 8) {
                                        break;
                                    }
                                } else {
                                    qy40Var = qy40Var5;
                                    j3 = j;
                                }
                                if (i7 == length) {
                                    break;
                                }
                                i7++;
                                qy40Var4 = qy40Var;
                                z = z2;
                                j = j3;
                            }
                            m3t0Var4.b = obj3;
                            m3t0Var4.c = qy40Var3;
                            m3t0Var4.d = i5;
                            synchronized (this.g) {
                                this.i = m3t0Var2;
                                this.j = j3;
                            }
                            return;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j3 = j;
                        j2 = j3;
                        synchronized (this.g) {
                        }
                    }
                }
                j3 = j;
                m3t0Var4.b = obj3;
                m3t0Var4.c = qy40Var3;
                m3t0Var4.d = i5;
                synchronized (this.g) {
                }
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            th = th10;
            j2 = j;
        }
    }

    public final void d() {
        jid jidVar = this.d;
        q2t0.e(q2t0.a);
        synchronized (q2t0.c) {
            q2t0.h = a.o0(q2t0.h, jidVar);
        }
        this.h = new h2t0(jidVar);
    }
}
