package com.yandex.plus.pay.ui.feature.tarifficator.mobile.api;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.PlusTarifficatorMobileResult;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.ffx;
import defpackage.x40;

/* loaded from: classes2.dex */
public final class a extends x40 {
    public final String a;

    public a(String str) {
        this.a = str;
    }

    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        return new Intent(context, (Class<?>) TarifficatorScenarioActivity.class).putExtra("INSTANCE_ID", this.a).putExtra("args", (PlusTarifficatorMobileArguments) obj);
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        PlusTarifficatorMobileResult plusTarifficatorMobileResult;
        return (intent == null || (plusTarifficatorMobileResult = (PlusTarifficatorMobileResult) ((Parcelable) ffx.P(intent, TarifficatorScenarioActivity.RESULT_KEY, PlusTarifficatorMobileResult.class))) == null) ? PlusTarifficatorMobileResult.PaymentCancel.INSTANCE : plusTarifficatorMobileResult;
    }
}
