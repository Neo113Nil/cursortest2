package xsna;

import android.os.SystemClock;

/* compiled from: StaticAdsItemContentRenderDelegate.kt */
/* loaded from: classes17.dex */
public final class jvk0 {
    public final rwk0 a;
    public final l340 b;
    public ylj c;
    public final a d = new a();

    /* compiled from: StaticAdsItemContentRenderDelegate.kt */
    public static final class a implements tcr0 {
        public a() {
        }

        @Override // xsna.tcr0
        public final void B4(Throwable th) {
            jvk0.this.b.a(xwk0.b);
        }

        @Override // xsna.tcr0
        public final void onSuccess() {
            l340 l340Var = jvk0.this.b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ywk0 ywk0Var = new ywk0();
            ywk0Var.b = elapsedRealtime;
            l340Var.a(ywk0Var);
        }
    }

    public jvk0(rwk0 rwk0Var, l340 l340Var) {
        this.a = rwk0Var;
        this.b = l340Var;
    }
}
