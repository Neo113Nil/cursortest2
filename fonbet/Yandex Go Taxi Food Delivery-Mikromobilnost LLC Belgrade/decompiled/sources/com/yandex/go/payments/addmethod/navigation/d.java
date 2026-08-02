package com.yandex.go.payments.addmethod.navigation;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import defpackage.a60;
import defpackage.evu0;
import defpackage.ik0;
import defpackage.kk0;
import defpackage.tje;
import defpackage.uh0;
import defpackage.y50;
import java.util.List;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes13.dex */
public final class d implements kk0 {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    @Override // defpackage.kk0
    public final void a(String str) {
        e eVar = this.a;
        com.yandex.go.coroutines.b.g(eVar.o(), null, null, new AddWalletBindingBaseRouter$openAgreementUrl$1(eVar, str, null), 3);
    }

    @Override // defpackage.kk0
    public final void b(String str) {
        ik0 ik0Var = this.a.D;
        if (evu0.J(str)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(SelfTester_JCP.IMITA);
        if (intent.resolveActivity(((Context) ik0Var.a).getPackageManager()) != null) {
            ((a60) ((y50) ik0Var.c)).b(intent);
        }
    }

    @Override // defpackage.kk0
    public final void c(List list, uh0 uh0Var, com.yandex.go.payments.addmethod.ui.home.b bVar, com.yandex.go.payments.addmethod.ui.home.a aVar) {
        e eVar = this.a;
        eVar.getClass();
        tje.N(eVar.o(), null, null, new AddWalletBindingBaseRouter$startBindPaymentMethod$1(new AddWalletBindingBaseRouter$startBindPaymentMethod$bindAction$1(eVar, list, bVar, uh0Var, aVar, null), eVar, aVar, null), 3);
    }
}
