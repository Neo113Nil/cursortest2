package xsna;

/* compiled from: Button.kt */
/* loaded from: classes11.dex */
public final class kq8 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ long b;
    public final /* synthetic */ s890 c;
    public final /* synthetic */ jai d;

    public kq8(long j, s890 s890Var, jai jaiVar) {
        this.b = j;
        this.c = s890Var;
        this.d = jaiVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-535639973, intValue, -1, "androidx.compose.material3.Button.<anonymous> (Button.kt:138)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-942794935, 6, -1, "androidx.compose.material3.MaterialTheme.<get-typography> (MaterialTheme.kt:129)");
            }
            xup0 xup0Var = (xup0) aVar2.r(evp0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            po40.d(this.b, xup0Var.m, kai.c(417635459, new jq8(this.c, this.d), aVar2), aVar2, 384);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
