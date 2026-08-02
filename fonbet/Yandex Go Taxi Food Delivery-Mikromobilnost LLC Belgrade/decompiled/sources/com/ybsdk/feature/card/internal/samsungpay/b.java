package com.ybsdk.feature.card.internal.samsungpay;

import android.os.Bundle;
import com.samsung.android.sdk.samsungpay.v2.card.Card;
import com.ybsdk.feature.card.internal.samsungpay.SamsungPayState;
import defpackage.j18;
import defpackage.mf60;
import defpackage.t90;

/* loaded from: classes3.dex */
public final class b implements t90 {
    public final /* synthetic */ d a;
    public final /* synthetic */ String b;
    public final /* synthetic */ j18 c;

    public b(d dVar, String str, j18 j18Var) {
        this.a = dVar;
        this.b = str;
        this.c = j18Var;
    }

    public final void a(int i, Bundle bundle) {
        SamsungPayState.AddCardResult addCardResult;
        j18 j18Var = this.c;
        if (!(j18Var.t() instanceof mf60)) {
            d.b(this.a, "Additional error while adding a card", Integer.valueOf(i), bundle, null, null, 24);
            return;
        }
        if (i == -7) {
            addCardResult = SamsungPayState.AddCardResult.CANCEL;
        } else {
            d.b(this.a, "Card wasn't added", Integer.valueOf(i), bundle, null, null, 24);
            addCardResult = SamsungPayState.AddCardResult.FAILED;
        }
        j18Var.resumeWith(addCardResult);
    }

    public final void b(int i, Card card) {
        this.a.d.a.a.edit().putBoolean("card_added_to_samsung_pay_".concat(this.b), true).apply();
        this.c.resumeWith(SamsungPayState.AddCardResult.SUCCESS);
    }
}
