package com.yandex.go.chargers.passes.payment_settings;

import defpackage.iha;
import defpackage.oha;
import defpackage.sy60;
import defpackage.tje;

/* loaded from: classes12.dex */
public final class c implements sy60 {
    public final /* synthetic */ oha a;
    public final /* synthetic */ String b;
    public final /* synthetic */ iha c;

    public c(oha ohaVar, String str, iha ihaVar) {
        this.a = ohaVar;
        this.b = str;
        this.c = ihaVar;
    }

    @Override // defpackage.sy60
    public final void a() {
    }

    public final void n1() {
        oha ohaVar = this.a;
        tje.N(ohaVar.o(), null, null, new ChargersPassesPaymentSettingsRouter$InnerNavigator$showCancelConfirmation$1$onCancelConfirmed$1(ohaVar, this.b, this.c, null), 3);
    }
}
