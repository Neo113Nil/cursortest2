package com.google.android.gms.wallet;

import defpackage.cvw;

/* loaded from: classes11.dex */
public final class d {
    public final /* synthetic */ PaymentMethodTokenizationParameters a;

    public /* synthetic */ d(PaymentMethodTokenizationParameters paymentMethodTokenizationParameters) {
        this.a = paymentMethodTokenizationParameters;
    }

    public final void a(String str, String str2) {
        cvw.j(str, "Tokenization parameter name must not be empty");
        cvw.j(str2, "Tokenization parameter value must not be empty");
        this.a.zzb.putString(str, str2);
    }

    public final PaymentMethodTokenizationParameters b() {
        return this.a;
    }

    public final void c(int i) {
        this.a.zza = i;
    }
}
