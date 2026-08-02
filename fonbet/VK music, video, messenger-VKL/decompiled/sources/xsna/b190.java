package xsna;

/* compiled from: TextFieldDefaults.kt */
/* loaded from: classes11.dex */
public final class b190 implements yzs<lgo0, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public b190(wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar) {
        this.b = wzsVar;
    }

    @Override // xsna.yzs
    public final s3q0 invoke(lgo0 lgo0Var, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1459717586, intValue, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous>.<anonymous> (TextFieldDefaults.kt:1182)");
            }
            this.b.invoke(aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
