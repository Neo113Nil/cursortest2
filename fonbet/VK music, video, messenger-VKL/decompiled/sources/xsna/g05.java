package xsna;

import android.util.Log;
import java.util.HashMap;
import kotlin.random.XorWowRandom;
import xsna.a05;

/* compiled from: AudioWaveFromFileController.kt */
/* loaded from: classes18.dex */
public final class g05 implements zz4 {
    public final mwo0 a;
    public final HashMap<String, a> b = new HashMap<>();

    /* compiled from: AudioWaveFromFileController.kt */
    public interface a {
    }

    /* compiled from: AudioWaveFromFileController.kt */
    public static final class b implements a {
        public final b05 a;

        public b(b05 b05Var) {
            this.a = b05Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "StateComplete(wave=" + this.a + ')';
        }
    }

    /* compiled from: AudioWaveFromFileController.kt */
    public static final class c implements a {
        public final Throwable a;

        public c(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("StateError(error="), this.a, ')');
        }
    }

    /* compiled from: AudioWaveFromFileController.kt */
    public static final class d implements a {
        public final io.reactivex.rxjava3.disposables.c a;
        public final b05 b;

        public d(io.reactivex.rxjava3.disposables.c cVar, b05 b05Var) {
            this.a = cVar;
            this.b = b05Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "StateLoading(disposable=" + this.a + ", wave=" + this.b + ')';
        }
    }

    public g05(mwo0 mwo0Var) {
        this.a = mwo0Var;
    }

    @Override // xsna.zz4
    public final void b(oy4 oy4Var) {
        a aVar = (a) ttp0.c(this.b).remove(oy4Var.j);
        if (aVar instanceof d) {
            ((d) aVar).a.dispose();
        }
    }

    @Override // xsna.zz4
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final b05 a(oy4 oy4Var) {
        if (oy4Var.r) {
            Log.e("AudioWaveFromFileController", "", new IllegalStateException("AudioWaveFromFileControllertry to load wave for stub audio from file item=" + oy4Var));
        }
        String str = oy4Var.j;
        if (str == null) {
            return null;
        }
        HashMap<String, a> hashMap = this.b;
        a aVar = hashMap.get(str);
        if (aVar instanceof d) {
            return ((d) aVar).b;
        }
        if (aVar instanceof c) {
            return null;
        }
        if (aVar instanceof b) {
            return ((b) aVar).a;
        }
        float f = fz4.L;
        float f2 = fz4.K;
        long[] jArr = z4h0.f;
        float f3 = (1 / z4h0.h) * igs.m;
        float f4 = jfp0.u;
        float f5 = (f4 - (fz4.I * 2.0f)) - f;
        float f6 = fz4.J - f;
        i05 i05Var = new i05(f, f2, f3, f5, f6, f4, (long) (oy4Var.g * oy4Var.t), oy4Var.q);
        int ceil = (int) Math.ceil((((long) (r14 * r11)) * f3) / i05Var.i);
        b05 b05Var = new b05(i05Var, ceil, ceil * 4);
        XorWowRandom b2 = qz9.b(System.currentTimeMillis());
        int i = (int) (f5 - f6);
        int length = b05Var.b.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            b05Var.b[i3] = i05Var.e + b2.l(0, i);
        }
        String str2 = oy4Var.j;
        float[] fArr = b05Var.b;
        io.reactivex.rxjava3.internal.operators.observable.b0 C = new io.reactivex.rxjava3.internal.operators.observable.q(new e05(new a05.b(str2, fArr.length, i05Var.d, i05Var.e, fArr), i2)).r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).C(new c05(i2, this, str2));
        int i4 = 3;
        hashMap.put(str2, new d(C.subscribe(new t00(new u9(i4, this, str2), 2), new j22(new d05(i2, (Object) str2, (Object) this), i4)), b05Var));
        return b05Var;
    }
}
