package xsna;

/* compiled from: DatePicker.kt */
/* loaded from: classes11.dex */
public final class tzk implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ imw b;
    public final /* synthetic */ String c;

    public tzk(imw imwVar, String str) {
        this.b = imwVar;
        this.c = str;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1301085432, intValue, -1, "androidx.compose.material3.IconButtonWithTooltip.<anonymous>.<anonymous> (DatePicker.kt:2287)");
            }
            uqv.a(this.b, this.c, null, 0L, aVar2, 0, 12);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
