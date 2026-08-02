package xsna;

/* compiled from: TextFieldImpl.kt */
/* loaded from: classes11.dex */
public final class dgo0 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ long b;
    public final /* synthetic */ nmo0 c;
    public final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> d;

    /* JADX WARN: Multi-variable type inference failed */
    public dgo0(long j, nmo0 nmo0Var, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar) {
        this.b = j;
        this.c = nmo0Var;
        this.d = wzsVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(837168720, intValue, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:218)");
            }
            fgo0.b(this.b, this.c, this.d, aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
