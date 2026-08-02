package xsna;

/* compiled from: DatePickerDialog.android.kt */
/* loaded from: classes11.dex */
public final class hyk implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> b;
    public final /* synthetic */ jai c;

    public hyk(wzs wzsVar, jai jaiVar) {
        this.b = wzsVar;
        this.c = jaiVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1103927529, intValue, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:101)");
            }
            es1.b(kyk.b, kyk.c, kai.c(-1980163584, new gyk(this.b, this.c), aVar2), aVar2, 438);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
