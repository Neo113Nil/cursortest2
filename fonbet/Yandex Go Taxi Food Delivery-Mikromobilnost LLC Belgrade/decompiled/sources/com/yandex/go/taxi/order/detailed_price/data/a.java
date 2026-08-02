package com.yandex.go.taxi.order.detailed_price.data;

import defpackage.i3y;
import defpackage.ky2;
import defpackage.mdh;
import defpackage.on2;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zn1;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class a {
    public final ky2 a;
    public final tt2 b;
    public final i3y c;

    public a(ky2 ky2Var, tt2 tt2Var, on2 on2Var) {
        this.a = ky2Var;
        this.b = tt2Var;
        this.c = kotlin.a.a(new zn1(on2Var, 15));
    }

    public final Object a(String str, Continuation continuation) {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new DetailedPriceRepository$getDetailedPrice$2(str, this, null), continuation);
    }
}
