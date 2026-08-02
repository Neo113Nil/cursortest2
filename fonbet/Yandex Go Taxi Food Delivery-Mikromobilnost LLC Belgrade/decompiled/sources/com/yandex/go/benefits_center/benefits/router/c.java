package com.yandex.go.benefits_center.benefits.router;

import android.content.Intent;
import android.net.Uri;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.drf0;
import defpackage.jj0;
import defpackage.m5u;
import defpackage.mn5;
import defpackage.n5u;
import defpackage.nn5;
import defpackage.on5;
import defpackage.tje;
import defpackage.vje;
import defpackage.zn5;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class c implements vje {
    public final /* synthetic */ d a;
    public final /* synthetic */ zn5 b;

    public c(d dVar, zn5 zn5Var) {
        this.a = dVar;
        this.b = zn5Var;
    }

    @Override // defpackage.vje
    public final Object a(Intent intent, Continuation continuation) {
        String str;
        d dVar = this.a;
        dVar.getClass();
        Uri data = intent.getData();
        boolean equalsIgnoreCase = "promocode".equalsIgnoreCase(data != null ? data.getAuthority() : null);
        zn5 zn5Var = this.b;
        if (equalsIgnoreCase) {
            if (data != null) {
                drf0 drf0Var = !"promocode".equalsIgnoreCase(data.getAuthority()) ? null : new drf0(data, data.getQueryParameter(AuthSdkActivity.RESPONSE_TYPE_CODE));
                if (drf0Var != null && (str = drf0Var.b) != null) {
                    tje.N(dVar.o(), null, null, new BenefitsCenterInnerRouter$handleReloadAction$1(dVar, new zn5(zn5Var.a, new on5(str), zn5Var.c), false, true, null), 3);
                    return new m5u(true, false);
                }
            }
            tje.N(dVar.o(), null, null, new BenefitsCenterInnerRouter$handleReloadAction$1(dVar, new zn5(zn5Var.a, new nn5(), zn5Var.c), false, true, null), 3);
            return new m5u(true, false);
        }
        if (!"addpromocode".equalsIgnoreCase(data != null ? data.getAuthority() : null)) {
            dVar.a0 = true;
            return n5u.a;
        }
        if (data != null) {
            jj0 jj0Var = !"addpromocode".equalsIgnoreCase(data.getAuthority()) ? null : new jj0(data, data.getQueryParameter(AuthSdkActivity.RESPONSE_TYPE_CODE));
            if (jj0Var != null) {
                tje.N(dVar.o(), null, null, new BenefitsCenterInnerRouter$handleReloadAction$1(dVar, new zn5(zn5Var.a, new mn5(jj0Var.b), zn5Var.c), false, true, null), 3);
            }
        }
        return new m5u(true, false);
    }
}
