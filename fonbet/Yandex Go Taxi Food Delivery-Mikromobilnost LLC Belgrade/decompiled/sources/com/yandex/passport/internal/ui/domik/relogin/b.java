package com.yandex.passport.internal.ui.domik.relogin;

import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.ui.domik.AuthTrack;
import defpackage.ds31;
import defpackage.k5c;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.uyj;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ b(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        c cVar = this.b;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                AuthTrack authTrack = (AuthTrack) obj;
                c cVar2 = this.b;
                cVar2.getClass();
                k5c a = ds31.a(cVar2);
                sjh sjhVar = uyj.a;
                tje.N(a, mdh.b, null, new ReloginViewModel$requestSms$1(cVar2, authTrack, null, true, null), 2);
                break;
            case 1:
                cVar.b.m((EventError) obj);
                break;
            default:
                cVar.W(((Boolean) obj).booleanValue());
                break;
        }
        return zy11Var;
    }
}
