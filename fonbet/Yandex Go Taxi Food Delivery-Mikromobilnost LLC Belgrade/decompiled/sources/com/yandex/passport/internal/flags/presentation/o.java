package com.yandex.passport.internal.flags.presentation;

import com.yandex.passport.internal.analytics.DomikScreenSuccessMessages$SmsCode;
import com.yandex.passport.internal.analytics.DomikStatefulReporter$Event;
import com.yandex.passport.internal.ui.domik.DomikResult;
import com.yandex.passport.internal.ui.domik.RegTrack;
import defpackage.f530;
import defpackage.fid;
import defpackage.gw00;
import defpackage.sls;
import defpackage.vng;
import defpackage.w53;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ o(com.yandex.passport.internal.analytics.c0 c0Var, com.yandex.passport.internal.ui.domik.sms.b bVar, com.yandex.passport.internal.ui.domik.q qVar) {
        this.a = 2;
        this.b = c0Var;
        this.w = bVar;
        this.c = qVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.c;
        Object obj4 = this.w;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                ((Integer) obj2).getClass();
                int O = vng.O(7);
                c1.l(O, fidVar, (f530) obj3, (String) obj5, (String) obj4);
                break;
            case 1:
                fid fidVar2 = (fid) obj;
                ((Integer) obj2).getClass();
                int O2 = vng.O(1);
                com.yandex.passport.internal.ui.challenge.logout.bottomsheet.d1.a(O2, fidVar2, (sls) obj4, (f530) obj3, (String) obj5);
                break;
            default:
                com.yandex.passport.internal.analytics.c0 c0Var = (com.yandex.passport.internal.analytics.c0) obj5;
                com.yandex.passport.internal.ui.domik.q qVar = (com.yandex.passport.internal.ui.domik.q) obj3;
                c0Var.getClass();
                w53 w53Var = new w53();
                w53Var.put(Constants.KEY_MESSAGE, "onSuccessPhonishAuth:start");
                com.yandex.passport.internal.analytics.t tVar = c0Var.a;
                com.yandex.passport.internal.analytics.k kVar = com.yandex.passport.internal.analytics.k.b;
                tVar.a(com.yandex.passport.internal.a0.H(), w53Var);
                ((com.yandex.passport.internal.ui.domik.sms.b) obj4).E.g(DomikScreenSuccessMessages$SmsCode.successPhonishAuth);
                com.yandex.passport.internal.analytics.b0 b0Var = qVar.d;
                b0Var.d(b0Var.x, DomikStatefulReporter$Event.AUTH_SUCCESS, gw00.e(new Pair("unsubscribe_from_maillists", ((RegTrack) obj).getUnsubscribeMailing().getAnalyticStatus())));
                qVar.a.E.m((DomikResult) obj2);
                w53 w53Var2 = new w53();
                w53Var2.put(Constants.KEY_MESSAGE, "onSuccessPhonishAuth:end");
                tVar.a(com.yandex.passport.internal.a0.H(), w53Var2);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ o(String str, Object obj, f530 f530Var, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.w = obj;
        this.c = f530Var;
    }
}
