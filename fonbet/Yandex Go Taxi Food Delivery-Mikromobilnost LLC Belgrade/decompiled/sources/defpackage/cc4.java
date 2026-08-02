package defpackage;

import androidx.compose.runtime.internal.AtomicInt;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes.dex */
public final class cc4 {
    public Throwable b;
    public final Object a = new Object();
    public final AtomicInt c = new AtomicInt(0);
    public xy40 d = new xy40((Object) null);
    public xy40 e = new xy40((Object) null);

    public static abstract class a {
        public abstract void a();

        public abstract void b(Throwable th);
    }

    public final t18 a(a aVar, sls slsVar) {
        int i;
        int i2;
        int i3;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = -1;
        synchronized (this.a) {
            Throwable th = this.b;
            if (th != null) {
                aVar.b(th);
                return h2b1.y;
            }
            AtomicInt atomicInt = this.c;
            do {
                i = atomicInt.get();
                i2 = i + 1;
            } while (!atomicInt.compareAndSet(i, i2));
            int i4 = 1;
            boolean z = (134217727 & i2) == 1;
            ref$IntRef.element = (i2 >>> 27) & 15;
            this.d.g(aVar);
            if (z && slsVar != null) {
                try {
                    slsVar.invoke();
                } catch (Throwable th2) {
                    synchronized (this.a) {
                        try {
                            if (this.b == null) {
                                this.b = th2;
                                xy40 xy40Var = this.d;
                                Object[] objArr = xy40Var.a;
                                int i5 = xy40Var.b;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    ((a) objArr[i6]).b(th2);
                                }
                                this.d.j();
                                AtomicInt atomicInt2 = this.c;
                                do {
                                    i3 = atomicInt2.get();
                                } while (!atomicInt2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new kjz(new in2(i4, aVar, this, ref$IntRef));
        }
    }

    public final void b(tls tlsVar) {
        int i;
        synchronized (this.a) {
            try {
                xy40 xy40Var = this.d;
                this.d = this.e;
                this.e = xy40Var;
                AtomicInt atomicInt = this.c;
                do {
                    i = atomicInt.get();
                } while (!atomicInt.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = xy40Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    tlsVar.invoke(xy40Var.b(i3));
                }
                xy40Var.j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
