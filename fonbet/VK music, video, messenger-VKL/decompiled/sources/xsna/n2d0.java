package xsna;

import androidx.compose.foundation.gestures.GestureCancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: TapGestureDetector.kt */
/* loaded from: classes11.dex */
public final class n2d0 implements j2d0, azl {
    public final /* synthetic */ azl b;
    public boolean c;
    public boolean d;
    public final wi50 e = new wi50(false);

    public n2d0(azl azlVar) {
        this.b = azlVar;
    }

    @Override // xsna.azl
    public final long E(long j) {
        return this.b.E(j);
    }

    @Override // xsna.azl
    public final long I(int i) {
        return this.b.I(i);
    }

    @Override // xsna.azl
    public final float I0(float f) {
        return this.b.I0(f);
    }

    @Override // xsna.azl
    public final long J(float f) {
        return this.b.J(f);
    }

    @Override // xsna.azl
    public final float O0(long j) {
        return this.b.O0(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.j2d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a1(ContinuationImpl continuationImpl) {
        k2d0 k2d0Var;
        Object obj;
        int i;
        if (continuationImpl instanceof k2d0) {
            k2d0Var = (k2d0) continuationImpl;
            int i2 = k2d0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k2d0Var.label = i2 - Integer.MIN_VALUE;
                obj = k2d0Var.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = k2d0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    k2d0Var.label = 1;
                    obj = h0(k2d0Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    throw new GestureCancellationException("The press gesture was canceled.");
                }
                return s3q0.a;
            }
        }
        k2d0Var = new k2d0(this, continuationImpl);
        obj = k2d0Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = k2d0Var.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final void c() {
        this.d = true;
        wi50 wi50Var = this.e;
        if (wi50Var.e()) {
            wi50Var.c(null);
        }
    }

    public final void e() {
        this.c = true;
        wi50 wi50Var = this.e;
        if (wi50Var.e()) {
            wi50Var.c(null);
        }
    }

    @Override // xsna.azl
    public final float getDensity() {
        return this.b.getDensity();
    }

    @Override // xsna.azl
    public final float getFontScale() {
        return this.b.getFontScale();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xsna.j2d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h0(ContinuationImpl continuationImpl) {
        m2d0 m2d0Var;
        int i;
        if (continuationImpl instanceof m2d0) {
            m2d0Var = (m2d0) continuationImpl;
            int i2 = m2d0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m2d0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = m2d0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = m2d0Var.label;
                wi50 wi50Var = this.e;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (!this.c && !this.d) {
                        m2d0Var.label = 1;
                        if (wi50Var.b(m2d0Var) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return Boolean.valueOf(this.c);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                wi50Var.c(null);
                return Boolean.valueOf(this.c);
            }
        }
        m2d0Var = new m2d0(this, continuationImpl);
        Object obj2 = m2d0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = m2d0Var.label;
        wi50 wi50Var2 = this.e;
        if (i != 0) {
        }
        wi50Var2.c(null);
        return Boolean.valueOf(this.c);
    }

    @Override // xsna.azl
    public final long i0(float f) {
        return this.b.i0(f);
    }

    @Override // xsna.azl
    public final float j1(int i) {
        return this.b.j1(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(ContinuationImpl continuationImpl) {
        l2d0 l2d0Var;
        int i;
        if (continuationImpl instanceof l2d0) {
            l2d0Var = (l2d0) continuationImpl;
            int i2 = l2d0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l2d0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = l2d0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = l2d0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    l2d0Var.label = 1;
                    if (this.e.b(l2d0Var) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                this.c = false;
                this.d = false;
                return s3q0.a;
            }
        }
        l2d0Var = new l2d0(this, continuationImpl);
        Object obj2 = l2d0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = l2d0Var.label;
        if (i != 0) {
        }
        this.c = false;
        this.d = false;
        return s3q0.a;
    }

    @Override // xsna.azl
    public final float k1(float f) {
        return this.b.k1(f);
    }

    @Override // xsna.azl
    public final long p1(long j) {
        return this.b.p1(j);
    }

    @Override // xsna.azl
    public final int r0(float f) {
        return this.b.r0(f);
    }

    @Override // xsna.azl
    public final float u0(long j) {
        return this.b.u0(j);
    }
}
