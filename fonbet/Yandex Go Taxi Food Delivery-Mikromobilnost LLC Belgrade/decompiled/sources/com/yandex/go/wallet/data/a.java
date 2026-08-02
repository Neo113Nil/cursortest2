package com.yandex.go.wallet.data;

import android.content.Context;
import defpackage.ajr;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wnt;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class a {
    public final tt2 a;
    public final ajr b;
    public final Context c;
    public final wnt d;

    public a(tt2 tt2Var, ajr ajrVar, Context context, wnt wntVar) {
        this.a = tt2Var;
        this.b = ajrVar;
        this.c = context;
        this.d = wntVar;
    }

    public final Object a(Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new WalletDocumentQueryFactory$prepareDocumentQuery$2(this, "bdui/v1/wallet", null), continuation);
    }
}
