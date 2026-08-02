package com.ybsdk.screens.upgrade.presentation.main;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.rconfig.YbCommonUrlsImpl;
import com.ybsdk.rconfig.b;
import com.ybsdk.screens.upgrade.domain.entities.SimpleIdFormFieldEntity;
import com.ybsdk.screens.upgrade.domain.interactors.c;
import defpackage.aes0;
import defpackage.des0;
import defpackage.ds31;
import defpackage.el11;
import defpackage.h791;
import defpackage.j3h;
import defpackage.jb21;
import defpackage.lb21;
import defpackage.np41;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.rfs0;
import defpackage.s8j0;
import defpackage.t8j0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uc5;
import defpackage.z121;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class a extends uc5 {
    public final c B;
    public final np41 C;
    public final des0 D;
    public final b E;
    public final AppAnalyticsReporter F;
    public final j3h G;
    public final tfl0 H;

    public a(c cVar, np41 np41Var, des0 des0Var, lb21 lb21Var, b bVar, AppAnalyticsReporter appAnalyticsReporter, j3h j3hVar, tfl0 tfl0Var) {
        super(new z121(14), new el11(4, lb21Var));
        this.B = cVar;
        this.C = np41Var;
        this.D = des0Var;
        this.E = bVar;
        this.F = appAnalyticsReporter;
        this.G = j3hVar;
        this.H = tfl0Var;
        appAnalyticsReporter.s0.a.a("upgrade.show", null);
        tje.N(ds31.a(this), null, null, new UpgradeViewModel$3(this, null), 3);
        e.H(ds31.a(this), new o(new m0(cVar.f, cVar.g, new UpgradeViewModel$4(this, null)), new UpgradeViewModel$5(3, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(a aVar, ContinuationImpl continuationImpl) {
        UpgradeViewModel$createApplication$1 upgradeViewModel$createApplication$1;
        int i;
        r0 r0Var;
        Object value;
        Object a;
        Throwable a2;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        aVar.getClass();
        if (continuationImpl instanceof UpgradeViewModel$createApplication$1) {
            upgradeViewModel$createApplication$1 = (UpgradeViewModel$createApplication$1) continuationImpl;
            int i2 = upgradeViewModel$createApplication$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upgradeViewModel$createApplication$1.label = i2 - Integer.MIN_VALUE;
                Object obj = upgradeViewModel$createApplication$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upgradeViewModel$createApplication$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pz40 Y = aVar.Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, jb21.a((jb21) value, new t8j0(), null, false, false, null, 30)));
                    c cVar = aVar.B;
                    upgradeViewModel$createApplication$1.label = 1;
                    a = cVar.a(upgradeViewModel$createApplication$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    rfs0 rfs0Var = (rfs0) a;
                    pz40 Y2 = aVar.Y();
                    do {
                        r0Var3 = (r0) Y2;
                        value3 = r0Var3.getValue();
                    } while (!r0Var3.k(value3, jb21.a((jb21) value3, new r8j0(rfs0Var, null, 14), null, false, false, null, 30)));
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    pz40 Y3 = aVar.Y();
                    do {
                        r0Var2 = (r0) Y3;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, jb21.a((jb21) value2, new s8j0(a2), null, false, false, null, 30)));
                }
                return zy11.a;
            }
        }
        upgradeViewModel$createApplication$1 = new UpgradeViewModel$createApplication$1(aVar, continuationImpl);
        Object obj2 = upgradeViewModel$createApplication$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upgradeViewModel$createApplication$1.label;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
        return zy11.a;
    }

    public final Map c0(SimpleIdFormFieldEntity simpleIdFormFieldEntity, String str) {
        return kotlin.collections.b.i(new Pair("is blank", Boolean.valueOf(str.length() == 0)), new Pair("is valid", Boolean.valueOf(this.D.e(simpleIdFormFieldEntity, str).equals(aes0.a))));
    }

    public final void d0() {
        this.F.s0.a.a("upgrade.check.initiated", null);
        tje.N(ds31.a(this), null, null, new UpgradeViewModel$onSubmit$1(this, null), 3);
    }

    public final void e0(String str) {
        b bVar = this.E;
        bVar.getClass();
        com.ybsdk.rconfig.a aVar = bVar.i;
        YbCommonUrlsImpl ybCommonUrlsImpl = (YbCommonUrlsImpl) bVar.d(aVar.e).getData();
        YbCommonUrlsImpl ybCommonUrlsImpl2 = (YbCommonUrlsImpl) aVar.e.c.getData();
        String taxServiceUrl = ybCommonUrlsImpl.getTaxServiceUrl();
        if (taxServiceUrl.length() == 0) {
            taxServiceUrl = ybCommonUrlsImpl2.getTaxServiceUrl();
        }
        h791.f(this.G, str, com.ybsdk.feature.webview.api.a.c(this.C, str, taxServiceUrl));
    }

    public final void f0() {
        List<SimpleIdFormFieldEntity> list;
        SimpleIdFormFieldEntity.Companion.getClass();
        list = SimpleIdFormFieldEntity.sorted;
        for (SimpleIdFormFieldEntity simpleIdFormFieldEntity : list) {
            this.B.c(simpleIdFormFieldEntity, this.D.a(simpleIdFormFieldEntity, ((jb21) X()).b.b(simpleIdFormFieldEntity)));
        }
        tje.N(ds31.a(this), null, null, new UpgradeViewModel$onViewCreated$1(this, null), 3);
    }
}
