package com.yandex.go.ypay.impl;

import android.content.Intent;
import android.net.Uri;
import com.yandex.fintechsdk.entities.theme.Theme;
import com.yandex.fintechsdk.flows.payment.kit.api.model.AdditionalSettings;
import com.yandex.fintechsdk.flows.payment.kit.api.model.ConsoleLoggingMode;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Merchant;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Payer;
import com.yandex.fintechsdk.flows.payment.kit.api.model.PaymentKitEnvironment;
import com.yandex.go.payments.paymentlist.data.c;
import defpackage.b0a0;
import defpackage.hbr;
import defpackage.hxx;
import defpackage.ibr;
import defpackage.jbr;
import defpackage.kbr;
import defpackage.kj;
import defpackage.m950;
import defpackage.p370;
import defpackage.pep0;
import defpackage.w511;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes8.dex */
public final class a {
    public final g a;
    public final ibr b;
    public final jbr c;

    public a(g gVar, ibr ibrVar, jbr jbrVar) {
        this.a = gVar;
        this.b = ibrVar;
        this.c = jbrVar;
    }

    public final Boolean a(Uri uri) {
        kj Ig;
        Theme theme;
        if ((FintechSdkDeeplinkHandlerImpl$FintechScheme.FINTECH_SDK.a(uri) || FintechSdkDeeplinkHandlerImpl$FintechScheme.FINTECHSDK.a(uri)) && (Ig = this.a.a.Ig()) != null) {
            ibr ibrVar = this.b;
            String str = ((c) ibrVar.d).g.b.g().p;
            if (str == null) {
                str = "";
            }
            ibrVar.b.getClass();
            PaymentKitEnvironment paymentKitEnvironment = PaymentKitEnvironment.PRODUCTION;
            b0a0 b0a0Var = new b0a0();
            b0a0Var.c(ibrVar.a);
            b0a0Var.d(paymentKitEnvironment);
            b0a0Var.b(ConsoleLoggingMode.AUTOMATIC);
            p370 a = b0a0Var.a();
            Payer payer = new Payer(Ig.g, Ig.e, Ig.f, null, ((h) ibrVar.c).Og(), String.valueOf(Ig.a));
            int i = hbr.a[ibrVar.e.getThemeType().ordinal()];
            if (i == 1) {
                theme = Theme.DAY;
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                theme = Theme.NIGHT;
            }
            AdditionalSettings.a aVar = new AdditionalSettings.a();
            aVar.b(theme);
            Intent b = a.h(aVar.a(), new Merchant(str), payer).b(uri.toString());
            if (b == null) {
                return Boolean.FALSE;
            }
            jbr jbrVar = this.c;
            ((pep0) jbrVar.a).f((m950) jbrVar.b.get(), new kbr(b), hxx.a);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
