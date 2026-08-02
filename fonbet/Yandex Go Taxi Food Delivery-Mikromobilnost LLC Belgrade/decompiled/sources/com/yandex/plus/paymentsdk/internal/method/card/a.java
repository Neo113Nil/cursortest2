package com.yandex.plus.paymentsdk.internal.method.card;

import android.content.Context;
import com.yandex.plus.core.data.pay.PlusSelectPaymentMethodState;
import defpackage.bvf0;
import defpackage.f3a0;
import defpackage.gci0;
import defpackage.hca0;
import defpackage.i3y;
import defpackage.ike;
import defpackage.jse;
import defpackage.l95;
import defpackage.ohd0;
import defpackage.old0;
import defpackage.tje;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class a implements old0 {
    public final f3a0 a;
    public final Context b;
    public final ohd0 c;
    public final String d;
    public final String e;
    public final String f;
    public final hca0 g;
    public final r0 h;
    public final gci0 i;
    public final i3y j;

    public a(f3a0 f3a0Var, Context context, ohd0 ohd0Var, String str, String str2, String str3, hca0 hca0Var, jse jseVar) {
        this.a = f3a0Var;
        this.b = context;
        this.c = ohd0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = hca0Var;
        ike a = bvf0.a(jseVar);
        PlusSelectPaymentMethodState.Started started = PlusSelectPaymentMethodState.Started.INSTANCE;
        r0 c = bvf0.c(started);
        this.h = c;
        this.i = e.d(c);
        this.j = kotlin.a.a(new l95(18, this));
        c.l(started);
        tje.N(a, null, null, new BindNewCardController$start$1(this, null), 3);
    }

    @Override // defpackage.old0
    public final gci0 getState() {
        return this.i;
    }
}
