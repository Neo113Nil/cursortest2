package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.q630;

/* compiled from: DatePickerDialog.android.kt */
/* loaded from: classes11.dex */
public final class jyk implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ r5j0 b;
    public final /* synthetic */ vxk c;
    public final /* synthetic */ float d;
    public final /* synthetic */ jai e;
    public final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> f;
    public final /* synthetic */ jai g;

    public jyk(r5j0 r5j0Var, vxk vxkVar, float f, jai jaiVar, wzs wzsVar, jai jaiVar2) {
        this.b = r5j0Var;
        this.c = vxkVar;
        this.d = f;
        this.e = jaiVar;
        this.f = wzsVar;
        this.g = jaiVar2;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1108953335, intValue, -1, "androidx.compose.material3.DatePickerDialog.<anonymous> (DatePickerDialog.android.kt:80)");
            }
            xjn0.a(txj0.j(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, zzk.b, 1, txj0.p(q630.a.a, zzk.d)), this.b, this.c.a, 0L, this.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(1782015378, new iyk(this.e, this.f, this.g), aVar2), aVar2, 12582918, 104);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
