package xsna;

/* compiled from: SheetDefaults.kt */
/* loaded from: classes11.dex */
public final class zcj0 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ String b;

    public zcj0(String str) {
        this.b = str;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-999924215, intValue, -1, "androidx.compose.material3.DragHandleWithTooltip.<anonymous>.<anonymous>.<anonymous> (SheetDefaults.kt:439)");
            }
            cjo0.c(this.b, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, aVar2, 0, 0, 262142);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
