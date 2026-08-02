package xsna;

/* compiled from: OutlinedTextField.kt */
/* loaded from: classes11.dex */
public final class f190 implements yzs<wzs<? super androidx.compose.runtime.a, ? super Integer, ? extends s3q0>, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ tho0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ b6u0 e;
    public final /* synthetic */ sg50 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> h;
    public final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> i;
    public final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> j;
    public final /* synthetic */ mfo0 k;
    public final /* synthetic */ r5j0 l;

    public f190(tho0 tho0Var, boolean z, boolean z2, b6u0 b6u0Var, sg50 sg50Var, boolean z3, wzs wzsVar, wzs wzsVar2, wzs wzsVar3, mfo0 mfo0Var, r5j0 r5j0Var) {
        this.b = tho0Var;
        this.c = z;
        this.d = z2;
        this.e = b6u0Var;
        this.f = sg50Var;
        this.g = z3;
        this.h = wzsVar;
        this.i = wzsVar2;
        this.j = wzsVar3;
        this.k = mfo0Var;
        this.l = r5j0Var;
    }

    @Override // xsna.yzs
    public final s3q0 invoke(wzs<? super androidx.compose.runtime.a, ? super Integer, ? extends s3q0> wzsVar, androidx.compose.runtime.a aVar, Integer num) {
        wzs<? super androidx.compose.runtime.a, ? super Integer, ? extends s3q0> wzsVar2 = wzsVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if ((intValue & 6) == 0) {
            intValue |= aVar2.y(wzsVar2) ? 4 : 2;
        }
        if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(674541106, intValue, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:606)");
            }
            int i = intValue;
            a190 a190Var = a190.a;
            String str = this.b.a.c;
            r5j0 r5j0Var = this.l;
            boolean z = this.c;
            boolean z2 = this.g;
            sg50 sg50Var = this.f;
            mfo0 mfo0Var = this.k;
            a190Var.b(str, wzsVar2, z, this.d, this.e, sg50Var, z2, this.h, this.i, this.j, mfo0Var, null, kai.c(1409265477, new e190(z, z2, sg50Var, mfo0Var, r5j0Var), aVar2), aVar2, (i << 3) & 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
