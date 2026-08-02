package com.yandex.plus.pay.internal.benchmark.tarifficator;

import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.plus.home.common.utils.b;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.bvf0;
import defpackage.gwk0;
import defpackage.i3y;
import defpackage.ike;
import defpackage.jse;
import defpackage.ll5;
import defpackage.mmm0;
import defpackage.mpx0;
import defpackage.ped0;
import defpackage.tje;
import defpackage.tls;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class a {
    public static final i3y g = kotlin.a.a(new mpx0(3));
    public final String a;
    public final PlusSdkBrandType b;
    public final mmm0 c;
    public final ped0 d;
    public final b e;
    public final ike f;

    public a(String str, PlusSdkBrandType plusSdkBrandType, mmm0 mmm0Var, tls tlsVar, ped0 ped0Var, jse jseVar) {
        this.a = str;
        this.b = plusSdkBrandType;
        this.c = mmm0Var;
        this.d = ped0Var;
        this.e = new b(gwk0.b(), new AtomicBoolean(false), tlsVar);
        this.f = bvf0.a(jseVar);
    }

    public final void a(ll5 ll5Var, PlusPayCompositeOffers.Offer offer) {
        tje.N(this.f, null, null, new TarifficatorBenchmarkReporter$reportBenchmark$1(ll5Var, this, offer, null), 3);
    }
}
