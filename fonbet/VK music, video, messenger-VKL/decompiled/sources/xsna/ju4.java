package xsna;

import android.os.Handler;
import android.os.Looper;
import com.vk.media.pipeline.stat.ErrorStatBuilder;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* compiled from: AudioReactionsRepositoryImpl.kt */
/* loaded from: classes3.dex */
public final class ju4 {
    public final Object a;
    public final Object b;

    public ju4() {
        ejp0 ejp0Var = new ejp0();
        ErrorStatBuilder errorStatBuilder = new ErrorStatBuilder();
        this.a = ejp0Var;
        this.b = errorStatBuilder;
    }

    public Object a() {
        nk3 nk3Var = (nk3) this.a;
        int i = nk3Var.b;
        Object obj = null;
        if (i != 0) {
            Object[] objArr = (Object[]) nk3Var.c;
            int i2 = i - 1;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            nk3Var.b = i2;
            obj = obj2;
        }
        return obj == null ? ((Supplier) this.b).get() : obj;
    }

    public void b(long j) {
        Runnable runnable = (Runnable) this.b;
        Handler handler = (Handler) this.a;
        handler.removeCallbacks(runnable);
        if (j > 0) {
            handler.postDelayed(runnable, j);
        } else {
            handler.post(runnable);
        }
    }

    public io.reactivex.rxjava3.internal.operators.maybe.u c() {
        return new io.reactivex.rxjava3.internal.operators.maybe.u(((xt4) this.b).c(), new iu4(new g54(this, 2), 0));
    }

    public void d(Object obj) {
        nk3 nk3Var = (nk3) this.a;
        if (obj == null) {
            nk3Var.getClass();
            throw new NullPointerException("Null is not permitted as element in the stack");
        }
        int i = nk3Var.b;
        Object[] objArr = (Object[]) nk3Var.c;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            nk3Var.c = objArr2;
        }
        Object[] objArr3 = (Object[]) nk3Var.c;
        int i2 = nk3Var.b;
        nk3Var.b = i2 + 1;
        objArr3[i2] = obj;
    }

    public ju4(AtomicReference atomicReference, AtomicReference atomicReference2) {
        this.a = atomicReference;
        this.b = atomicReference2;
    }

    public ju4(Runnable runnable) {
        this.b = runnable;
        this.a = new Handler(Looper.getMainLooper());
    }

    public ju4(ix4 ix4Var, xt4 xt4Var, xo9 xo9Var) {
        this.a = ix4Var;
        this.b = xt4Var;
    }

    public ju4(Supplier supplier) {
        nk3 nk3Var = new nk3();
        nk3Var.c = new Object[10];
        nk3Var.b = 0;
        this.a = nk3Var;
        this.b = supplier;
    }
}
