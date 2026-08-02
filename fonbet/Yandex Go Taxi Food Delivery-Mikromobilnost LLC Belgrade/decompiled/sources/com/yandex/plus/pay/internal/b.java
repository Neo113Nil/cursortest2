package com.yandex.plus.pay.internal;

import android.content.Context;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.plus.core.user.SubscriptionStatus;
import com.yandex.plus.home.common.utils.c;
import com.yandex.plus.metrica.utils.e;
import com.yandex.plus.pay.api.model.PlusPayUserStatus;
import com.yandex.plus.pay.internal.di.d;
import defpackage.add0;
import defpackage.asd;
import defpackage.dad0;
import defpackage.dbd0;
import defpackage.dcd0;
import defpackage.e5o;
import defpackage.ead0;
import defpackage.ecd0;
import defpackage.fad0;
import defpackage.fpd0;
import defpackage.gt90;
import defpackage.hhw;
import defpackage.i3y;
import defpackage.ibd0;
import defpackage.ike;
import defpackage.ku2;
import defpackage.l2z;
import defpackage.lcd0;
import defpackage.lx11;
import defpackage.lzs;
import defpackage.mdd0;
import defpackage.mlc0;
import defpackage.ndd0;
import defpackage.ol;
import defpackage.p5h;
import defpackage.p5z;
import defpackage.qc20;
import defpackage.qda0;
import defpackage.rqx0;
import defpackage.s400;
import defpackage.s59;
import defpackage.sls;
import defpackage.tje;
import defpackage.tne;
import defpackage.ums;
import defpackage.v7d0;
import defpackage.vbd0;
import defpackage.vlp;
import defpackage.vrd;
import defpackage.x75;
import defpackage.xyj;
import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final class b implements v7d0, add0 {
    public final i3y a = kotlin.a.a(new lcd0(this, 0));
    public final d b;
    public final i3y c;
    public final i3y d;
    public final i3y e;
    public final i3y f;
    public final i3y g;
    public final i3y h;
    public final i3y i;
    public final i3y j;
    public final i3y k;
    public final i3y l;
    public final i3y m;

    public b(String str, String str2, String str3, String str4, p5z p5zVar, e5o e5oVar, Context context, OkHttpClient.a aVar, qda0 qda0Var, p5h p5hVar, qc20 qc20Var, s400 s400Var, PlusSdkBrandType plusSdkBrandType, String str5, com.yandex.plus.metrica.api.a aVar2, x75 x75Var, e eVar, e eVar2, asd asdVar, com.yandex.plus.domain.auth.impl.a aVar3, ku2 ku2Var, sls slsVar, com.yandex.plus.core.benchmark.a aVar4, ike ikeVar, xyj xyjVar, long j) {
        i3y a = kotlin.a.a(new mlc0(10));
        vlp vlpVar = new vlp(new PlusPayImpl$payFlagsHolder$1(ecd0.b, dcd0.class, "DEFAULT", "getDEFAULT()Lcom/yandex/plus/pay/common/internal/featureflags/PlusPayFlags;", 0), new s59(this));
        PlusPayImpl$sdkComponent$1 plusPayImpl$sdkComponent$1 = new PlusPayImpl$sdkComponent$1(0, this, b.class, "getSubscriptionStatus", "getSubscriptionStatus()Lcom/yandex/plus/core/user/SubscriptionStatus;", 0);
        PlusPayImpl$sdkComponent$2 plusPayImpl$sdkComponent$2 = new PlusPayImpl$sdkComponent$2(this, b.class, "experimentsRepository", "getExperimentsRepository()Lcom/yandex/plus/experiments/api/providers/PlusExperimentsRepository;", 0);
        lzs lzsVar = (lzs) a.getValue();
        PlusPayImpl$sdkComponent$3 plusPayImpl$sdkComponent$3 = new PlusPayImpl$sdkComponent$3(0, vlpVar, vlp.class, "getActualFlags", "getActualFlags()Lcom/yandex/plus/core/featureflags/ResettableFlags;", 0);
        com.yandex.plus.pay.internal.di.b bVar = new com.yandex.plus.pay.internal.di.b(str, str2, str3, str4, plusSdkBrandType, str5, context, e5oVar, ikeVar, p5zVar, lzsVar, aVar, qda0Var, xyjVar, aVar2, x75Var, eVar, eVar2, asdVar, aVar3, ku2Var, slsVar, aVar4, j);
        fad0 fad0Var = new fad0(bVar, str3, str4, plusPayImpl$sdkComponent$1, plusPayImpl$sdkComponent$2, plusPayImpl$sdkComponent$3);
        dbd0 dbd0Var = new dbd0(bVar, fad0Var, p5hVar, qc20Var, s400Var, plusPayImpl$sdkComponent$3);
        hhw hhwVar = new hhw(bVar, fad0Var, plusPayImpl$sdkComponent$2);
        ibd0 ibd0Var = new ibd0(bVar, dbd0Var, fad0Var, hhwVar, plusPayImpl$sdkComponent$3);
        vbd0 vbd0Var = new vbd0();
        aVar4.b = new ead0(fad0Var, 14);
        this.b = new d(bVar, fad0Var, hhwVar, dbd0Var, ibd0Var, vbd0Var);
        int i = 6;
        lx11.a = new vrd(asdVar, i);
        c.d(aVar3.h, ikeVar, (ol) ibd0Var.g.getValue());
        c.d(((tne) dbd0Var.H.getValue()).a, ikeVar, new PlusPayImpl$2(this, null));
        tje.N(ikeVar, null, null, new PlusPayImpl$3(this, null), 3);
        this.c = kotlin.a.a(new lcd0(this, 10));
        this.d = kotlin.a.a(new lcd0(this, 1));
        this.e = kotlin.a.a(new l2z(20, this, aVar4));
        this.f = kotlin.a.a(new lcd0(this, 2));
        this.g = kotlin.a.a(new lcd0(this, 3));
        this.h = kotlin.a.a(new lcd0(this, 4));
        this.i = kotlin.a.a(new lcd0(this, 5));
        this.j = kotlin.a.a(new lcd0(this, i));
        this.k = kotlin.a.a(new lcd0(this, 7));
        this.l = kotlin.a.a(new lcd0(str2, this));
        this.m = kotlin.a.a(new lcd0(this, 9));
    }

    public final dad0 a() {
        return (dad0) this.b.b.l.getValue();
    }

    public final ndd0 b() {
        return this.b.b.e;
    }

    public final SubscriptionStatus c() {
        ums umsVar = gt90.b;
        mdd0.c(b(), umsVar, this + ".getSubscriptionStatus()");
        PlusPayUserStatus plusPayUserStatus = (PlusPayUserStatus) ((com.yandex.plus.pay.internal.feature.user.d) this.b.d.n.getValue()).g.getValue();
        SubscriptionStatus subscriptionStatus = plusPayUserStatus == null ? SubscriptionStatus.UNKNOWN : plusPayUserStatus.getFeatures().isEmpty() ? SubscriptionStatus.NO_SUBSCRIPTION : plusPayUserStatus.hasPlus() ? SubscriptionStatus.SUBSCRIPTION_PLUS : SubscriptionStatus.UNKNOWN;
        mdd0.c(b(), umsVar, this + ".getSubscriptionStatus() = " + subscriptionStatus);
        return subscriptionStatus;
    }

    public final rqx0 d() {
        return (rqx0) this.l.getValue();
    }

    public final fpd0 e() {
        return (fpd0) this.h.getValue();
    }
}
