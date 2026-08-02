package com.ybsdk.screens.registration.phoneconfirmation.presentation;

import android.content.Context;
import com.google.i18n.phonenumbers.NumberParseException;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.RegistrationEvents$RegistrationPhoneCheckLoadedResult;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.screens.registration.domain.RegistrationPhone;
import defpackage.ab1;
import defpackage.cgb0;
import defpackage.ds31;
import defpackage.dzh0;
import defpackage.geb0;
import defpackage.h791;
import defpackage.heb0;
import defpackage.hri0;
import defpackage.ieb0;
import defpackage.j3h;
import defpackage.jl40;
import defpackage.np41;
import defpackage.pz40;
import defpackage.t9b0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.unr0;
import defpackage.yqi0;
import defpackage.z94;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class a extends uc5 {
    public final PhoneConfirmationParams B;
    public final com.ybsdk.screens.registration.phoneconfirmation.domain.interactors.a C;
    public final com.ybsdk.screens.registration.domain.interactors.a D;
    public final cgb0 E;
    public final AppAnalyticsReporter F;
    public final hri0 G;
    public final Context H;
    public final tfl0 I;
    public final j3h J;
    public final np41 K;
    public final ab1 L;

    public a(PhoneConfirmationParams phoneConfirmationParams, com.ybsdk.screens.registration.phoneconfirmation.domain.interactors.a aVar, com.ybsdk.screens.registration.domain.interactors.a aVar2, cgb0 cgb0Var, AppAnalyticsReporter appAnalyticsReporter, hri0 hri0Var, Context context, tfl0 tfl0Var, j3h j3hVar, np41 np41Var, ieb0 ieb0Var, ab1 ab1Var) {
        super(new t9b0(4, phoneConfirmationParams), ieb0Var);
        this.B = phoneConfirmationParams;
        this.C = aVar;
        this.D = aVar2;
        this.E = cgb0Var;
        this.F = appAnalyticsReporter;
        this.G = hri0Var;
        this.H = context;
        this.I = tfl0Var;
        this.J = j3hVar;
        this.K = np41Var;
        this.L = ab1Var;
        appAnalyticsReporter.b0.a.a("registration.phone.shown", null);
    }

    public static String c0(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt) || charAt == '+') {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public final void b0() {
        if (((heb0) X()).a == null) {
            this.L.a("registration.inititated");
            tje.N(ds31.a(this), null, null, new PhoneConfirmationViewModel$startRegistrationProcess$1(this, null), 3);
        }
    }

    public final void d0(String str) {
        h791.f(this.J, str, ((com.ybsdk.feature.webview.internal.a) this.K).f(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e0(String str) {
        yqi0 yqi0Var;
        boolean z;
        r0 r0Var;
        Object value;
        String c0 = c0(str);
        u8j0 u8j0Var = ((heb0) X()).a;
        if (u8j0Var == null || (yqi0Var = (yqi0) u8j0Var.a()) == null) {
            return;
        }
        RegistrationPhone registrationPhone = yqi0Var.b;
        AppAnalyticsReporter appAnalyticsReporter = this.F;
        z94 z94Var = appAnalyticsReporter.b0;
        boolean z2 = false;
        if (!((heb0) X()).d) {
            if (!jl40.l(registrationPhone != null ? registrationPhone.getPhone() : null, c0)) {
                z = false;
                LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                linkedHashMap.put("used_suggested_number", Boolean.valueOf(z));
                z94Var.a.a("registration.phone.check.initiated", linkedHashMap);
                if (!((heb0) X()).d) {
                    String c02 = c0(c0);
                    this.E.getClass();
                    try {
                        com.google.i18n.phonenumbers.a d = com.google.i18n.phonenumbers.a.d();
                        z2 = d.k(d.p(c02, "RU"));
                    } catch (NumberParseException unused) {
                    }
                    if (!z2) {
                        int length = c0.length();
                        z94 z94Var2 = appAnalyticsReporter.b0;
                        if (length == 0) {
                            z94Var2.s(RegistrationEvents$RegistrationPhoneCheckLoadedResult.ERROR, "empty");
                        } else {
                            z94Var2.s(RegistrationEvents$RegistrationPhoneCheckLoadedResult.ERROR, "invalid format");
                        }
                        pz40 Y = Y();
                        do {
                            r0Var = (r0) Y;
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, heb0.a((heb0) value, null, null, unr0.h(Text.Companion, dzh0.ybsdk_authorization_number_error_title), false, null, false, 247)));
                        Z(geb0.a);
                        return;
                    }
                }
                if (((heb0) X()).d || registrationPhone == null) {
                    registrationPhone = new RegistrationPhone.UserCustomPhoneEntity(c0);
                }
                tje.N(ds31.a(this), null, null, new PhoneConfirmationViewModel$startConfirmation$1(this, yqi0Var.a, registrationPhone, null), 3);
            }
        }
        z = true;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
        linkedHashMap2.put("used_suggested_number", Boolean.valueOf(z));
        z94Var.a.a("registration.phone.check.initiated", linkedHashMap2);
        if (!((heb0) X()).d) {
        }
        if (((heb0) X()).d) {
        }
        registrationPhone = new RegistrationPhone.UserCustomPhoneEntity(c0);
        tje.N(ds31.a(this), null, null, new PhoneConfirmationViewModel$startConfirmation$1(this, yqi0Var.a, registrationPhone, null), 3);
    }

    public final void f0() {
        r0 r0Var;
        Object value;
        this.F.b0.a.a("registration.phone.change_number.click", null);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, heb0.a((heb0) value, null, null, null, false, null, false, 231)));
    }

    public final void g0() {
        tje.N(ds31.a(this), null, null, new PhoneConfirmationViewModel$startRegistrationProcess$1(this, null), 3);
    }
}
