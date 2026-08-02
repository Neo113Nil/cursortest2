package xsna;

/* compiled from: DateInput.kt */
/* loaded from: classes11.dex */
public final class hxk implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wh50<String> b;

    public hxk(wh50<String> wh50Var) {
        this.b = wh50Var;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-357881838, intValue, -1, "androidx.compose.material3.DateInputTextField.<anonymous> (DateInput.kt:215)");
            }
            wh50<String> wh50Var = this.b;
            if (drm0.N(wh50Var.getValue())) {
                aVar2.K(-1548950640);
            } else {
                aVar2.K(-327061465);
                cjo0.c(wh50Var.getValue(), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, aVar2, 0, 0, 262142);
                aVar2 = aVar2;
            }
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
