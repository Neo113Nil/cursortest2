package xsna;

import android.os.SystemClock;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class jw70 implements izs {
    public final /* synthetic */ kw70 b;
    public final /* synthetic */ bgk0 c;
    public final /* synthetic */ ur4 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ jw70(kw70 kw70Var, bgk0 bgk0Var, ur4 ur4Var, float f, boolean z) {
        this.b = kw70Var;
        this.c = bgk0Var;
        this.d = ur4Var;
        this.e = f;
        this.f = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0026 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:19:0x0015, B:6:0x0026, B:7:0x002c), top: B:18:0x0015 }] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        kw70 kw70Var = this.b;
        bgk0 bgk0Var = this.c;
        ur4 ur4Var = this.d;
        float f = this.e;
        boolean z2 = this.f;
        tgp0 tgp0Var = (tgp0) obj;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (kw70Var.k) {
            if (!z2) {
                try {
                    if (elapsedRealtime - kw70Var.p < 100) {
                        z = false;
                        if (z) {
                            kw70Var.p = SystemClock.elapsedRealtime();
                        }
                        s3q0 s3q0Var = s3q0.a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z = true;
            if (z) {
            }
            s3q0 s3q0Var2 = s3q0.a;
        }
        if (z) {
            tgp0Var.i(bgk0Var, ur4Var, f);
        }
        return s3q0.a;
    }
}
