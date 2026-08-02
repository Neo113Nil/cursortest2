package com.yandex.go.inapp_calls.preload;

import com.yandex.go.inapp_calls.experiment.q;
import com.yandex.go.proxyprovision.j;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.gp50;
import defpackage.h3y;
import defpackage.i3y;
import defpackage.kgx;
import defpackage.lz60;
import defpackage.mdh;
import defpackage.njv;
import defpackage.ny61;
import defpackage.qme0;
import defpackage.qqo;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.experiments.d;

/* loaded from: classes.dex */
public final class a implements lz60 {
    public static final /* synthetic */ kgx[] j = {new MutablePropertyReference1Impl("isPreloaded", 0, "isPreloaded()Z", a.class)};
    public final q a;
    public final gp50 b;
    public final tt2 c;
    public final h3y d;
    public final njv e;
    public final j f;
    public final tse g;
    public final qme0 h;
    public final String i;

    public a(q qVar, gp50 gp50Var, tt2 tt2Var, h3y h3yVar, njv njvVar, j jVar, tse tseVar, dne0 dne0Var) {
        this.a = qVar;
        this.b = gp50Var;
        this.c = tt2Var;
        this.d = h3yVar;
        this.e = njvVar;
        this.f = jVar;
        this.g = tseVar;
        cne0 a = dne0Var.a("InAppCallsFeaturePreloader");
        this.h = new qme0(0, a, a, "is_preloaded");
        this.i = "InAppCallsFeaturePreloader";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(a aVar, ContinuationImpl continuationImpl) {
        InAppCallsFeaturePreloader$waitForPreloadCondition$1 inAppCallsFeaturePreloader$waitForPreloadCondition$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof InAppCallsFeaturePreloader$waitForPreloadCondition$1) {
            inAppCallsFeaturePreloader$waitForPreloadCondition$1 = (InAppCallsFeaturePreloader$waitForPreloadCondition$1) continuationImpl;
            int i2 = inAppCallsFeaturePreloader$waitForPreloadCondition$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inAppCallsFeaturePreloader$waitForPreloadCondition$1.label = i2 - Integer.MIN_VALUE;
                Object obj = inAppCallsFeaturePreloader$waitForPreloadCondition$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inAppCallsFeaturePreloader$waitForPreloadCondition$1.label;
                if (i != 0) {
                    b.b(obj);
                    m0 m0Var = new m0(d.b(aVar.a.d), ((qqo) ((i3y) aVar.b.b).getValue()).a(), new InAppCallsFeaturePreloader$waitForPreloadCondition$2());
                    InAppCallsFeaturePreloader$waitForPreloadCondition$3 inAppCallsFeaturePreloader$waitForPreloadCondition$3 = new InAppCallsFeaturePreloader$waitForPreloadCondition$3();
                    inAppCallsFeaturePreloader$waitForPreloadCondition$1.L$0 = null;
                    inAppCallsFeaturePreloader$waitForPreloadCondition$1.L$1 = null;
                    inAppCallsFeaturePreloader$waitForPreloadCondition$1.label = 1;
                    obj = e.z(m0Var, inAppCallsFeaturePreloader$waitForPreloadCondition$3, inAppCallsFeaturePreloader$waitForPreloadCondition$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return Boolean.valueOf(obj != null);
            }
        }
        inAppCallsFeaturePreloader$waitForPreloadCondition$1 = new InAppCallsFeaturePreloader$waitForPreloadCondition$1(aVar, continuationImpl);
        Object obj2 = inAppCallsFeaturePreloader$waitForPreloadCondition$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppCallsFeaturePreloader$waitForPreloadCondition$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(obj2 != null);
    }

    @Override // defpackage.lz60
    public final void g() {
        if (((Boolean) this.h.getValue(this, j[0])).booleanValue()) {
            return;
        }
        this.c.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.g, mdh.b, null, new InAppCallsFeaturePreloader$onLargestContentfulPaint$1(this, null), 2);
    }

    @Override // defpackage.s150
    public final String getName() {
        return this.i;
    }
}
