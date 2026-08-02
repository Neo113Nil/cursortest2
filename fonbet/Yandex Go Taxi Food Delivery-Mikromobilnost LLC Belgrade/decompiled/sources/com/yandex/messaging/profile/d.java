package com.yandex.messaging.profile;

import defpackage.bvf0;
import defpackage.ike;
import defpackage.kgx;
import defpackage.mth;
import defpackage.qoi0;
import defpackage.rp3;
import defpackage.tje;
import defpackage.tls;
import defpackage.vse;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class d {
    public static final /* synthetic */ kgx[] d;
    public final ike a;
    public final rp3 b = new rp3();
    public final r0 c = bvf0.c(null);

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("newProfileJob", 0, "getNewProfileJob()Lkotlinx/coroutines/Job;", d.class);
        qoi0.a.getClass();
        d = new kgx[]{mutablePropertyReference1Impl};
    }

    public d(vse vseVar) {
        this.a = vseVar.c(true);
    }

    public final void a(tls tlsVar) {
        tje.N(this.a, null, null, new ProfileHolder$getProfile$2(tlsVar, this, null), 3);
    }

    public final mth b() {
        return new mth(this.c, 6);
    }
}
