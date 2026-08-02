package defpackage;

import android.os.Bundle;
import com.samsung.android.sdk.samsungpay.v2.ErrorType;
import com.samsung.android.sdk.samsungpay.v2.PartnerRequest;
import com.samsung.android.sdk.samsungpay.v2.SamsungPayBase;

/* loaded from: classes11.dex */
public final /* synthetic */ class azl0 implements PartnerRequest.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ r8u0 b;

    public /* synthetic */ azl0(r8u0 r8u0Var, int i) {
        this.a = i;
        this.b = r8u0Var;
    }

    @Override // com.samsung.android.sdk.samsungpay.v2.PartnerRequest.b
    public final void d(ErrorType errorType, int i, Bundle bundle) {
        int i2 = this.a;
        r8u0 r8u0Var = this.b;
        switch (i2) {
            case 0:
                SamsungPayBase.x(r8u0Var, errorType, i, bundle);
                break;
            default:
                r8u0Var.onFail(i, bundle);
                break;
        }
    }
}
