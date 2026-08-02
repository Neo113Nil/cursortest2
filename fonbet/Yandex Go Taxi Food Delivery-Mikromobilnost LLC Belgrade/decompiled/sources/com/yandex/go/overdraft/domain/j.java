package com.yandex.go.overdraft.domain;

import com.yandex.go.payments.api.GooglePayInteractor$GooglePayTokenResult;
import defpackage.dz80;
import defpackage.hxx;
import defpackage.kda0;
import defpackage.m950;
import defpackage.mdh;
import defpackage.pep0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class j implements vpr {
    public final /* synthetic */ k a;

    public j(k kVar) {
        this.a = kVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = dz80.a[((GooglePayInteractor$GooglePayTokenResult) obj).ordinal()];
        k kVar = this.a;
        if (i == 1) {
            tse tseVar = kVar.a;
            sjh sjhVar = uyj.a;
            tje.N(tseVar, mdh.b, null, new OverdraftPayInteractor$observeSelectGooglePayResult$1$1$1(kVar, null), 2);
        } else if (i == 2) {
            ((pep0) kVar.k).f((m950) kVar.j.get(), kda0.a, hxx.a);
        } else if (i != 3) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
