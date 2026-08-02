package xsna;

/* compiled from: DateRangePicker.kt */
/* loaded from: classes11.dex */
public final class k0l implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;

    public k0l(String str, long j) {
        this.b = str;
        this.c = j;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(850203865, intValue, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline.<anonymous> (DateRangePicker.kt:421)");
            }
            cjo0.c(this.b, null, this.c, 0L, 0L, null, 0L, 0, false, 0, 0, null, aVar2, 0, 0, 262138);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
