package xsna;

import androidx.compose.runtime.internal.AtomicInt;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.gu5.a;
import xsna.qq9;

/* compiled from: AwaiterQueue.kt */
/* loaded from: classes11.dex */
public final class gu5<A extends a> {
    public Throwable b;
    public final Object a = new Object();
    public final AtomicInt c = new AtomicInt(0);
    public fh50<A> d = new fh50<>((Object) null);
    public fh50<A> e = new fh50<>((Object) null);

    /* compiled from: AwaiterQueue.kt */
    public static abstract class a {
        public abstract void a();

        public abstract void b(Throwable th);
    }

    public final qq9 a(A a2, gzs<s3q0> gzsVar) {
        int i;
        int i2;
        int i3;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = -1;
        synchronized (this.a) {
            Throwable th = this.b;
            if (th != null) {
                a2.b(th);
                return qq9.a.a;
            }
            AtomicInt atomicInt = this.c;
            do {
                i = atomicInt.get();
                i2 = i + 1;
            } while (!atomicInt.compareAndSet(i, i2));
            int i4 = 0;
            boolean z = (134217727 & i2) == 1;
            ref$IntRef.element = (i2 >>> 27) & 15;
            this.d.j(a2);
            if (z && gzsVar != null) {
                try {
                    gzsVar.invoke();
                } catch (Throwable th2) {
                    synchronized (this.a) {
                        try {
                            if (this.b == null) {
                                this.b = th2;
                                fh50<A> fh50Var = this.d;
                                Object[] objArr = fh50Var.a;
                                int i5 = fh50Var.b;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    ((a) objArr[i6]).b(th2);
                                }
                                this.d.m();
                                AtomicInt atomicInt2 = this.c;
                                do {
                                    i3 = atomicInt2.get();
                                } while (!atomicInt2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                                s3q0 s3q0Var = s3q0.a;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new u98(new fu5(a2, this, ref$IntRef, i4));
        }
    }

    public final void b(izs<? super A, s3q0> izsVar) {
        int i;
        synchronized (this.a) {
            try {
                fh50<A> fh50Var = this.d;
                this.d = this.e;
                this.e = fh50Var;
                AtomicInt atomicInt = this.c;
                do {
                    i = atomicInt.get();
                } while (!atomicInt.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = fh50Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    izsVar.invoke(fh50Var.d(i3));
                }
                fh50Var.m();
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
