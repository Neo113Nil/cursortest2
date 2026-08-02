package xsna;

/* compiled from: DatePickerDialog.android.kt */
/* loaded from: classes11.dex */
public final class gyk implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> b;
    public final /* synthetic */ jai c;

    public gyk(wzs wzsVar, jai jaiVar) {
        this.b = wzsVar;
        this.c = jaiVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1980163584, intValue, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:105)");
            }
            wzs<androidx.compose.runtime.a, Integer, s3q0> wzsVar = this.b;
            if (wzsVar == null) {
                aVar2.K(322524505);
            } else {
                aVar2.K(-266690648);
                wzsVar.invoke(aVar2, 0);
            }
            aVar2.j();
            this.c.invoke(aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
