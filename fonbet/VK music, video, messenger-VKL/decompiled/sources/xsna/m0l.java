package xsna;

/* compiled from: DateRangePicker.kt */
/* loaded from: classes11.dex */
public final class m0l implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ long b;

    public m0l(long j) {
        this.b = j;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-320655704, intValue, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline.<anonymous> (DateRangePicker.kt:423)");
            }
            cjo0.c("-", null, this.b, 0L, 0L, null, 0L, 0, false, 0, 0, null, aVar2, 6, 0, 262138);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
