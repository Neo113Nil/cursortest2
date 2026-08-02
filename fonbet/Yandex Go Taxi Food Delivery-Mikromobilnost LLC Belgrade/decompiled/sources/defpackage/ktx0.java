package defpackage;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.PaymentData;

/* loaded from: classes11.dex */
public final class ktx0 extends jtx0 {
    @Override // defpackage.jtx0, defpackage.x40
    /* renamed from: e */
    public final ko2 c(int i, Intent intent) {
        if (i != 1) {
            return super.c(i, intent);
        }
        Status a = kt3.a(intent);
        if (a == null) {
            a = Status.RESULT_INTERNAL_ERROR;
        }
        return new ko2(null, a);
    }

    @Override // defpackage.jtx0
    public final PaymentData f(Intent intent) {
        return PaymentData.getFromIntent(intent);
    }
}
