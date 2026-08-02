package xsna;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import xsna.p6y0;
import xsna.s120;
import xsna.ze9;

/* compiled from: Camera2CameraInfoImpl.java */
/* loaded from: classes11.dex */
public final class ze9 implements ui9 {
    public final String a;
    public final tg9 b;

    @Nullable
    public re9 d;

    @NonNull
    public final sse0 g;
    public final Object c = new Object();

    @Nullable
    public a<e7y0> e = null;

    @Nullable
    public ArrayList f = null;

    /* compiled from: Camera2CameraInfoImpl.java */
    public static class a<T> extends s120<T> {
        public androidx.lifecycle.n<T> m;
        public vm5 n;

        @Override // androidx.lifecycle.n
        public final T d() {
            androidx.lifecycle.n<T> nVar = this.m;
            return nVar == null ? (T) this.n : nVar.d();
        }

        @Override // xsna.s120
        public final <S> void l(@NonNull androidx.lifecycle.n<S> nVar, @NonNull fr70<? super S> fr70Var) {
            throw null;
        }

        public final void m(@NonNull ug50 ug50Var) {
            s120.a<?> b;
            androidx.lifecycle.n<T> nVar = this.m;
            if (nVar != null && (b = this.l.b(nVar)) != null) {
                b.b.j(b);
            }
            this.m = ug50Var;
            super.l(ug50Var, new fr70() { // from class: xsna.ye9
                @Override // xsna.fr70
                public final void a(Object obj) {
                    ze9.a.this.k(obj);
                }
            });
        }
    }

    public ze9(@NonNull String str, @NonNull tg9 tg9Var) {
        str.getClass();
        this.a = str;
        this.b = tg9Var;
        this.g = a020.n(tg9Var);
    }

    @Override // xsna.ui9
    @NonNull
    public final String a() {
        return this.a;
    }

    @Override // xsna.ui9
    @Nullable
    public final Integer b() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.LENS_FACING);
        num.getClass();
        int intValue = num.intValue();
        if (intValue != 0) {
            return intValue != 1 ? null : 1;
        }
        return 0;
    }

    @Override // xsna.ui9
    public final void c(@NonNull mzm mzmVar, @NonNull r5d0 r5d0Var) {
        synchronized (this.c) {
            try {
                re9 re9Var = this.d;
                if (re9Var != null) {
                    re9Var.c.execute(new com.vk.debug.ui.dev.c(re9Var, mzmVar, r5d0Var, 1));
                    return;
                }
                if (this.f == null) {
                    this.f = new ArrayList();
                }
                this.f.add(new Pair(r5d0Var, mzmVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.ui9
    @NonNull
    public final sse0 d() {
        return this.g;
    }

    @Override // xsna.ti9
    @NonNull
    public final String e() {
        return h() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // xsna.ui9
    public final void f(@NonNull gg9 gg9Var) {
        synchronized (this.c) {
            try {
                re9 re9Var = this.d;
                if (re9Var != null) {
                    re9Var.c.execute(new yr2(1, re9Var, gg9Var));
                    return;
                }
                ArrayList arrayList = this.f;
                if (arrayList == null) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).first == gg9Var) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (1 == r1.intValue()) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(int i) {
        Integer num = (Integer) this.b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        int K = cdi.K(i);
        Integer b = b();
        boolean z = b != null;
        return cdi.D(K, num.intValue(), z);
    }

    public final int h() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue();
    }

    @NonNull
    public final ug50 i() {
        p6y0.b cikVar;
        CameraCharacteristics.Key key;
        synchronized (this.c) {
            try {
                re9 re9Var = this.d;
                if (re9Var != null) {
                    a<e7y0> aVar = this.e;
                    if (aVar != null) {
                        return aVar;
                    }
                    return re9Var.j.d;
                }
                if (this.e == null) {
                    tg9 tg9Var = this.b;
                    if (Build.VERSION.SDK_INT >= 30) {
                        key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
                        if (tg9Var.a(key) != null) {
                            cikVar = new yb2(tg9Var);
                            f7y0 f7y0Var = new f7y0(cikVar.c(), cikVar.b());
                            f7y0Var.e(1.0f);
                            vm5 e = spw.e(f7y0Var);
                            a<e7y0> aVar2 = new a<>();
                            aVar2.n = e;
                            this.e = aVar2;
                        }
                    }
                    cikVar = new cik(tg9Var);
                    f7y0 f7y0Var2 = new f7y0(cikVar.c(), cikVar.b());
                    f7y0Var2.e(1.0f);
                    vm5 e2 = spw.e(f7y0Var2);
                    a<e7y0> aVar22 = new a<>();
                    aVar22.n = e2;
                    this.e = aVar22;
                }
                return this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(@NonNull re9 re9Var) {
        synchronized (this.c) {
            try {
                this.d = re9Var;
                a<e7y0> aVar = this.e;
                if (aVar != null) {
                    aVar.m(re9Var.j.d);
                }
                ArrayList arrayList = this.f;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        re9 re9Var2 = this.d;
                        re9Var2.c.execute(new com.vk.debug.ui.dev.c(re9Var2, (Executor) pair.second, (gg9) pair.first, 1));
                    }
                    this.f = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int h = h();
        if (h == 0 || h == 1 || h == 2 || h == 3 || h == 4) {
            return;
        }
        new StringBuilder("Unknown value: ").append(h);
    }
}
