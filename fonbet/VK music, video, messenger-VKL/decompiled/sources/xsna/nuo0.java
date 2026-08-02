package xsna;

/* compiled from: TimePicker.kt */
/* loaded from: classes11.dex */
public final class nuo0 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ yto0 b;
    public final /* synthetic */ a9x c;
    public final /* synthetic */ qw1 d;
    public final /* synthetic */ boolean e;

    public nuo0(yto0 yto0Var, a9x a9xVar, qw1 qw1Var, boolean z) {
        this.b = yto0Var;
        this.c = a9xVar;
        this.d = qw1Var;
        this.e = z;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-99063847, intValue, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1613)");
            }
            rvi.a(vcl0.b(this.b.f, zfj.a), kai.c(-596940007, new muo0(this.c, this.d, this.e), aVar2), aVar2, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
