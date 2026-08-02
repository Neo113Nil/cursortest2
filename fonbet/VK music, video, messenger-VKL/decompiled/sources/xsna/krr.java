package xsna;

/* compiled from: FloatingActionButton.kt */
/* loaded from: classes11.dex */
public final class krr implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ long b;
    public final /* synthetic */ nmo0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ jai e;

    public krr(long j, nmo0 nmo0Var, float f, jai jaiVar) {
        float f2 = chq.a;
        this.b = j;
        this.c = nmo0Var;
        this.d = f;
        this.e = jaiVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1779603465, intValue, -1, "androidx.compose.material3.FloatingActionButton.<anonymous> (FloatingActionButton.kt:158)");
            }
            float f = chq.a;
            po40.d(this.b, this.c, kai.c(-1767363041, new jrr(this.d, this.e), aVar2), aVar2, 384);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
