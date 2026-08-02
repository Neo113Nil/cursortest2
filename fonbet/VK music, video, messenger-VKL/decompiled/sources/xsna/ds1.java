package xsna;

/* compiled from: AlertDialog.kt */
/* loaded from: classes11.dex */
public final class ds1 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> b;
    public final /* synthetic */ r5j0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ float e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> i;
    public final /* synthetic */ jai j;

    public ds1(wzs wzsVar, r5j0 r5j0Var, long j, float f, long j2, long j3, long j4, wzs wzsVar2, jai jaiVar) {
        this.b = wzsVar;
        this.c = r5j0Var;
        this.d = j;
        this.e = f;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = wzsVar2;
        this.j = jaiVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(527420759, intValue, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous> (AlertDialog.kt:266)");
            }
            es1.a(kai.c(1367541877, new cs1(this.i, this.j), aVar2), null, this.b, this.c, this.d, this.e, u7g.c(zlm.a, aVar2), this.f, this.g, this.h, aVar2, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
