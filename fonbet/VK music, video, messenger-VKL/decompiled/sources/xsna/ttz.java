package xsna;

/* compiled from: LoadingTimeoutGuard.kt */
/* loaded from: classes17.dex */
public final class ttz {
    public final izs<Long, s3q0> a;
    public yok0 b;
    public long c;

    /* JADX WARN: Multi-variable type inference failed */
    public ttz(izs<? super Long, s3q0> izsVar) {
        this.a = izsVar;
    }

    public final void a(boolean z) {
        yok0 yok0Var = this.b;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        this.b = null;
        if (z) {
            this.c++;
        }
    }

    public final void b(long j) {
        a(false);
        long j2 = this.c + 1;
        this.c = j2;
        bdn bdnVar = bdn.a;
        this.b = myc0.h(zvj.a(ie00.a.U()), null, null, new stz(j, this, j2, null), 3);
    }
}
