package xsna;

/* compiled from: Scaffold.kt */
/* loaded from: classes11.dex */
public final class r3h0 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ int b;
    public final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> c;
    public final /* synthetic */ jai d;
    public final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> e;
    public final /* synthetic */ jai f;
    public final /* synthetic */ hi50 g;
    public final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> h;

    public r3h0(int i, wzs wzsVar, jai jaiVar, wzs wzsVar2, jai jaiVar2, hi50 hi50Var, wzs wzsVar3) {
        this.b = i;
        this.c = wzsVar;
        this.d = jaiVar;
        this.e = wzsVar2;
        this.f = jaiVar2;
        this.g = hi50Var;
        this.h = wzsVar3;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(848889571, intValue, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:104)");
            }
            z3h0.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
