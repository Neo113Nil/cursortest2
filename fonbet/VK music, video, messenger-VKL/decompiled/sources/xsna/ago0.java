package xsna;

/* compiled from: TextFieldImpl.kt */
/* loaded from: classes11.dex */
public final class ago0 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ yzs<lgo0, androidx.compose.runtime.a, Integer, s3q0> b;
    public final /* synthetic */ ego0 c;

    /* JADX WARN: Multi-variable type inference failed */
    public ago0(yzs<? super lgo0, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, ego0 ego0Var) {
        this.b = yzsVar;
        this.c = ego0Var;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1157484991, intValue, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:147)");
            }
            this.b.invoke(this.c, aVar2, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
