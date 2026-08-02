package com.yandex.go.payments.addmethod.navigation;

import android.content.Intent;
import android.net.Uri;
import defpackage.a60;
import defpackage.evu0;
import defpackage.kk0;
import defpackage.uh0;
import java.util.List;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes13.dex */
public final class a implements kk0 {
    public final /* synthetic */ c a;

    public a(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.kk0
    public final void a(String str) {
        c cVar = this.a;
        com.yandex.go.coroutines.b.g(cVar.o(), null, null, new AddFastshiftAccountBaseRouter$openAgreementUrl$1(cVar, str, null), 3);
    }

    @Override // defpackage.kk0
    public final void b(String str) {
        c cVar = this.a;
        cVar.getClass();
        if (evu0.J(str)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(SelfTester_JCP.IMITA);
        if (intent.resolveActivity(cVar.D.getPackageManager()) != null) {
            ((a60) cVar.F).b(intent);
        }
    }

    @Override // defpackage.kk0
    public final void c(List list, uh0 uh0Var, com.yandex.go.payments.addmethod.ui.home.b bVar, com.yandex.go.payments.addmethod.ui.home.a aVar) {
        c.S(this.a, list, uh0Var, bVar, aVar);
    }
}
