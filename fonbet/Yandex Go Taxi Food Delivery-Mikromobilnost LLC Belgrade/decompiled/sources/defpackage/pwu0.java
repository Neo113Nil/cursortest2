package defpackage;

import android.content.Context;
import android.content.Intent;
import android.widget.FrameLayout;
import com.ybsdk.feature.paymentsdk.api.PaymentSdkEnvironment;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class pwu0 implements ria0 {
    @Override // defpackage.ria0
    public final bja0 a(Context context, PaymentSdkEnvironment paymentSdkEnvironment, boolean z, String str, String str2, u290 u290Var, String str3, String str4, String str5, int i) {
        return new owu0();
    }

    @Override // defpackage.ria0
    public final Pair b(Context context, boolean z) {
        return new Pair(new FrameLayout(context), new nwu0());
    }

    @Override // defpackage.ria0
    public final String c(Intent intent) {
        return null;
    }
}
