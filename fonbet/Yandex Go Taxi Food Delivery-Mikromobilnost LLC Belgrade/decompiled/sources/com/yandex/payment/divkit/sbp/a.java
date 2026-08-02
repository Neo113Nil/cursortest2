package com.yandex.payment.divkit.sbp;

import android.content.Intent;
import android.content.SharedPreferences;
import com.yandex.payment.common.sbp.SbpOperation;
import com.yandex.payment.divkit.usecases.k;
import com.yandex.payment.divkit.usecases.t;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import defpackage.buf;
import defpackage.cza1;
import defpackage.ds31;
import defpackage.dy40;
import defpackage.eez0;
import defpackage.euf;
import defpackage.fq4;
import defpackage.fuf;
import defpackage.ghm0;
import defpackage.guf;
import defpackage.hrj0;
import defpackage.hyj0;
import defpackage.i3y;
import defpackage.juf;
import defpackage.kuf;
import defpackage.kyj0;
import defpackage.muf;
import defpackage.nm0;
import defpackage.o3a0;
import defpackage.pzt0;
import defpackage.qyj0;
import defpackage.rm0;
import defpackage.rsf;
import defpackage.rwo;
import defpackage.ryh0;
import defpackage.sm0;
import defpackage.tem0;
import defpackage.tje;
import defpackage.u2l;
import defpackage.w511;
import defpackage.yr31;
import defpackage.zry0;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class a extends yr31 {
    public final hrj0 A;
    public final rwo B;
    public final tem0 C;
    public String H;
    public guf I;
    public boolean J;
    public zry0 K;
    public u2l L;
    public ghm0 M;
    public pzt0 N;
    public final t b;
    public final k c;
    public final String w;
    public final SbpOperation x;
    public final SharedPreferences y;
    public final String z;
    public final dy40 D = new dy40();
    public List E = EmptyList.a;
    public final i3y F = kotlin.a.b(LazyThreadSafetyMode.NONE, new rsf(2));
    public boolean G = true;
    public boolean O = true;

    public a(rwo rwoVar, hrj0 hrj0Var, tem0 tem0Var, SharedPreferences sharedPreferences, SbpOperation sbpOperation, k kVar, t tVar, String str, String str2) {
        this.b = tVar;
        this.c = kVar;
        this.w = str;
        this.x = sbpOperation;
        this.y = sharedPreferences;
        this.z = str2;
        this.A = hrj0Var;
        this.B = rwoVar;
        this.C = tem0Var;
    }

    public static final void W(a aVar, qyj0 qyj0Var, fq4 fq4Var) {
        hrj0 hrj0Var = aVar.A;
        if (qyj0Var instanceof hyj0) {
            PaymentKitError paymentKitError = ((hyj0) qyj0Var).a;
            hrj0Var.getClass();
            aVar.b0(new euf(paymentKitError, ryh0.paymentsdk_sbp_something_went_wrong, ryh0.paymentsdk_sbp_something_went_wrong_description, false));
        } else if (qyj0Var instanceof kyj0) {
            aVar.Z((sm0) ((kyj0) qyj0Var).a, fq4Var);
        } else {
            w511.b();
        }
    }

    public static final void X(a aVar) {
        aVar.getClass();
        PaymentKitError.Companion.getClass();
        PaymentKitError paymentKitError = new PaymentKitError(PaymentKitError.Kind.sbpBanksNotFound, PaymentKitError.Trigger.nspk, null, null, "Bank applications not found", null);
        aVar.A.getClass();
        aVar.b0(new euf(paymentKitError, ryh0.paymentsdk_sbp_something_went_wrong, ryh0.paymentsdk_sbp_something_went_wrong_description, false));
    }

    @Override // defpackage.yr31
    public final void V() {
        ((eez0) this.F.getValue()).a();
    }

    public final void Y(String str) {
        Object obj;
        this.G = false;
        Iterator it = this.E.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((fq4) obj).c.equals(str)) {
                    break;
                }
            }
        }
        fq4 fq4Var = (fq4) obj;
        if (fq4Var == null) {
            return;
        }
        if (this.M != null) {
            o3a0.g.a(fq4Var.a);
        }
        this.A.getClass();
        b0(new fuf(ryh0.paymentsdk_sbp_open_bank_title, 6));
        d0();
        this.N = tje.N(ds31.a(this), null, null, new DKSbpViewModel$onPayClick$1(this, new muf(this), fq4Var, null), 3);
    }

    public final void Z(sm0 sm0Var, fq4 fq4Var) {
        int i;
        if (!(sm0Var instanceof nm0)) {
            if (sm0Var instanceof rm0) {
                String str = fq4Var.c;
                String str2 = fq4Var.f;
                this.H = str;
                rm0 rm0Var = (rm0) sm0Var;
                guf gufVar = new guf(new Intent("android.intent.action.VIEW", cza1.b(str2, rm0Var.b, rm0Var.a.getQuery())), str2, fq4Var.c);
                this.I = gufVar;
                b0(gufVar);
                return;
            }
            return;
        }
        if (fq4Var.e) {
            this.y.edit().putString("com.yandex.payment.LAST_USED_BANK_SCHEME", fq4Var.c).apply();
        }
        if (this.x instanceof SbpOperation.BindSbpToken) {
            zry0 zry0Var = this.K;
            if (zry0Var == null) {
                zry0Var = null;
            }
            i = zry0Var.c;
        } else {
            this.A.getClass();
            i = ryh0.paymentsdk_sbp_paid_success;
        }
        b0(new juf(i));
    }

    public final void a0() {
        this.A.getClass();
        b0(new fuf(ryh0.paymentsdk_sbp_open_bank_title, null, false));
        d0();
        guf gufVar = this.I;
        if (gufVar != null) {
            b0(gufVar);
        }
    }

    public final void b0(kuf kufVar) {
        if (!(kufVar instanceof guf)) {
            ((eez0) this.F.getValue()).b("INFO_TIMER_TAG");
        }
        this.D.m(kufVar);
    }

    public final void c0() {
        int i;
        boolean z = this.x instanceof SbpOperation.BindSbpToken;
        hrj0 hrj0Var = this.A;
        if (z) {
            hrj0Var.getClass();
            i = ryh0.paymentsdk_sbp_binding_waiting_title;
        } else {
            hrj0Var.getClass();
            i = ryh0.paymentsdk_sbp_payment_waiting_title;
        }
        ((eez0) this.F.getValue()).c(5L, new buf(this, i, 1));
    }

    public final void d0() {
        int i;
        boolean z = this.x instanceof SbpOperation.BindSbpToken;
        hrj0 hrj0Var = this.A;
        if (z) {
            hrj0Var.getClass();
            i = ryh0.paymentsdk_sbp_binding_waiting_title;
        } else {
            hrj0Var.getClass();
            i = ryh0.paymentsdk_sbp_payment_waiting_title;
        }
        ((eez0) this.F.getValue()).c(3L, new buf(this, i, 0));
    }
}
