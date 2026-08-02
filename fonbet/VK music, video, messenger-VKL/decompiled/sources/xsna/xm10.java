package xsna;

/* compiled from: MaterialTheme.kt */
/* loaded from: classes11.dex */
public final class xm10 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ xup0 b;
    public final /* synthetic */ jai c;

    public xm10(xup0 xup0Var, jai jaiVar) {
        this.b = xup0Var;
        this.c = jaiVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1750539308, intValue, -1, "androidx.compose.material3.MaterialTheme.<anonymous> (MaterialTheme.kt:106)");
            }
            cjo0.a(this.b.j, this.c, aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
