package xsna;

/* compiled from: AlertDialog.kt */
/* loaded from: classes11.dex */
public final class bs1 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> b;
    public final /* synthetic */ jai c;

    public bs1(wzs wzsVar, jai jaiVar) {
        this.b = wzsVar;
        this.c = jaiVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-459506658, intValue, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:272)");
            }
            wzs<androidx.compose.runtime.a, Integer, s3q0> wzsVar = this.b;
            if (wzsVar == null) {
                aVar2.K(-1102039173);
            } else {
                aVar2.K(795734342);
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
