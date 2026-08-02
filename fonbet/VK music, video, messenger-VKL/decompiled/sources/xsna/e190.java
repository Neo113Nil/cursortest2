package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: OutlinedTextField.kt */
/* loaded from: classes11.dex */
public final class e190 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ sg50 d;
    public final /* synthetic */ mfo0 e;
    public final /* synthetic */ r5j0 f;

    public e190(boolean z, boolean z2, sg50 sg50Var, mfo0 mfo0Var, r5j0 r5j0Var) {
        this.b = z;
        this.c = z2;
        this.d = sg50Var;
        this.e = mfo0Var;
        this.f = r5j0Var;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1409265477, intValue, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:623)");
            }
            a190.a.a(this.b, this.c, this.d, null, this.e, this.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 100663296, 200);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
