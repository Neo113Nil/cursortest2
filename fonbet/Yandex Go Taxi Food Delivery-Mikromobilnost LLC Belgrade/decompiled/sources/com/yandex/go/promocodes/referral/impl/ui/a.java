package com.yandex.go.promocodes.referral.impl.ui;

import android.view.View;
import defpackage.sls;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ a(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                sls slsVar = bVar.h;
                if (slsVar != null) {
                    ((ReferralGiftViewHolder$setOnClickListener$1$1) slsVar).invoke();
                }
                bVar.a.Kg();
                break;
            default:
                sls slsVar2 = bVar.h;
                if (slsVar2 != null) {
                    ((ReferralGiftViewHolder$setOnClickListener$1$1) slsVar2).invoke();
                }
                bVar.a.Kg();
                break;
        }
    }
}
