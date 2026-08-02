package com.yandex.go.analytics.rythm;

import com.yandex.go.analytics.rythm.experiments.RythmEventGroupsExperiment;
import defpackage.bll0;
import defpackage.ell0;
import defpackage.fll0;
import defpackage.g8e;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.hst;
import defpackage.jst;
import defpackage.jtq0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.r8x;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w4j0;
import defpackage.xby;
import defpackage.xv21;
import defpackage.zy11;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.jobs.request.NetworkType;

/* loaded from: classes12.dex */
public final class a implements bll0 {
    public final ru.yandex.taxi.jobs.b a;
    public final jtq0 b;
    public final com.yandex.go.analytics.rythm.repository.a c;
    public final fll0 d;
    public final hit e;
    public final tt2 f;

    public a(ru.yandex.taxi.jobs.b bVar, jtq0 jtq0Var, com.yandex.go.analytics.rythm.repository.a aVar, fll0 fll0Var, hit hitVar, tt2 tt2Var) {
        this.a = bVar;
        this.b = jtq0Var;
        this.c = aVar;
        this.d = fll0Var;
        this.e = hitVar;
        this.f = tt2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f0, code lost:
    
        if (r2 == r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
    
        if (r2 == r5) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ell0 ell0Var, ContinuationImpl continuationImpl) {
        RythmAnalyticsImpl$reportRythmEvent$1 rythmAnalyticsImpl$reportRythmEvent$1;
        int i;
        RythmEventGroupsExperiment.Configuration configuration;
        ell0 ell0Var2;
        RythmEventGroupsExperiment.Configuration configuration2;
        int intValue;
        int i2;
        ell0 ell0Var3;
        ell0 ell0Var4 = ell0Var;
        com.yandex.go.analytics.rythm.repository.a aVar2 = aVar.c;
        if (continuationImpl instanceof RythmAnalyticsImpl$reportRythmEvent$1) {
            rythmAnalyticsImpl$reportRythmEvent$1 = (RythmAnalyticsImpl$reportRythmEvent$1) continuationImpl;
            int i3 = rythmAnalyticsImpl$reportRythmEvent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rythmAnalyticsImpl$reportRythmEvent$1.label = i3 - Integer.MIN_VALUE;
                Object obj = rythmAnalyticsImpl$reportRythmEvent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rythmAnalyticsImpl$reportRythmEvent$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    hst hstVar = jst.e;
                    String str = ell0Var4.a;
                    Objects.toString(ell0Var4.b);
                    hstVar.getClass();
                    fll0 fll0Var = aVar.d;
                    rythmAnalyticsImpl$reportRythmEvent$1.L$0 = ell0Var4;
                    rythmAnalyticsImpl$reportRythmEvent$1.label = 1;
                    obj = fll0Var.b.b(rythmAnalyticsImpl$reportRythmEvent$1);
                } else if (i == 1) {
                    ell0Var4 = (ell0) rythmAnalyticsImpl$reportRythmEvent$1.L$0;
                    kotlin.b.b(obj);
                } else if (i == 2) {
                    configuration2 = (RythmEventGroupsExperiment.Configuration) rythmAnalyticsImpl$reportRythmEvent$1.L$1;
                    ell0Var2 = (ell0) rythmAnalyticsImpl$reportRythmEvent$1.L$0;
                    kotlin.b.b(obj);
                    intValue = ((Number) obj).intValue();
                    if (intValue < configuration2.b) {
                        long j = configuration2.c * 1000;
                        rythmAnalyticsImpl$reportRythmEvent$1.L$0 = ell0Var2;
                        rythmAnalyticsImpl$reportRythmEvent$1.L$1 = null;
                        rythmAnalyticsImpl$reportRythmEvent$1.I$0 = intValue;
                        rythmAnalyticsImpl$reportRythmEvent$1.label = 3;
                        if (kotlinx.coroutines.a.i(j, rythmAnalyticsImpl$reportRythmEvent$1) != coroutineSingletons) {
                            i2 = intValue;
                            intValue = i2;
                        }
                        return coroutineSingletons;
                    }
                    ell0Var3 = ell0Var2;
                    String str2 = ell0Var3.a;
                    rythmAnalyticsImpl$reportRythmEvent$1.L$0 = ell0Var3;
                    rythmAnalyticsImpl$reportRythmEvent$1.L$1 = null;
                    rythmAnalyticsImpl$reportRythmEvent$1.I$0 = intValue;
                    rythmAnalyticsImpl$reportRythmEvent$1.label = 4;
                    obj = aVar2.e(str2, rythmAnalyticsImpl$reportRythmEvent$1);
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ell0Var3 = (ell0) rythmAnalyticsImpl$reportRythmEvent$1.L$0;
                        kotlin.b.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            ru.yandex.taxi.jobs.b bVar = aVar.a;
                            String str3 = ell0Var3.a;
                            r8x r8xVar = new r8x();
                            r8xVar.f("eventGroupKey", str3);
                            bVar.e(new w4j0("rythm_analytics", 0L, r8xVar, null, NetworkType.CONNECTED, false, false, true, 0L, false, g8e.o("rythm_analytics:", str3), true));
                        }
                        return zy11Var;
                    }
                    i2 = rythmAnalyticsImpl$reportRythmEvent$1.I$0;
                    ell0Var2 = (ell0) rythmAnalyticsImpl$reportRythmEvent$1.L$0;
                    kotlin.b.b(obj);
                    intValue = i2;
                    ell0Var3 = ell0Var2;
                    String str22 = ell0Var3.a;
                    rythmAnalyticsImpl$reportRythmEvent$1.L$0 = ell0Var3;
                    rythmAnalyticsImpl$reportRythmEvent$1.L$1 = null;
                    rythmAnalyticsImpl$reportRythmEvent$1.I$0 = intValue;
                    rythmAnalyticsImpl$reportRythmEvent$1.label = 4;
                    obj = aVar2.e(str22, rythmAnalyticsImpl$reportRythmEvent$1);
                }
                configuration = (RythmEventGroupsExperiment.Configuration) ((RythmEventGroupsExperiment) obj).c.get(ell0Var4.a);
                if (configuration != null) {
                    xby.l(jst.e, "RythmAnalyticsImpl", null, null, g8e.o("Can't find config: ", ell0Var4.a), 6);
                    return zy11Var;
                }
                rythmAnalyticsImpl$reportRythmEvent$1.L$0 = ell0Var4;
                rythmAnalyticsImpl$reportRythmEvent$1.L$1 = configuration;
                rythmAnalyticsImpl$reportRythmEvent$1.label = 2;
                Object c = aVar2.c(ell0Var4, rythmAnalyticsImpl$reportRythmEvent$1);
                if (c != coroutineSingletons) {
                    ell0Var2 = ell0Var4;
                    configuration2 = configuration;
                    obj = c;
                    intValue = ((Number) obj).intValue();
                    if (intValue < configuration2.b) {
                    }
                    ell0Var3 = ell0Var2;
                    String str222 = ell0Var3.a;
                    rythmAnalyticsImpl$reportRythmEvent$1.L$0 = ell0Var3;
                    rythmAnalyticsImpl$reportRythmEvent$1.L$1 = null;
                    rythmAnalyticsImpl$reportRythmEvent$1.I$0 = intValue;
                    rythmAnalyticsImpl$reportRythmEvent$1.label = 4;
                    obj = aVar2.e(str222, rythmAnalyticsImpl$reportRythmEvent$1);
                }
                return coroutineSingletons;
            }
        }
        rythmAnalyticsImpl$reportRythmEvent$1 = new RythmAnalyticsImpl$reportRythmEvent$1(aVar, continuationImpl);
        Object obj2 = rythmAnalyticsImpl$reportRythmEvent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rythmAnalyticsImpl$reportRythmEvent$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        configuration = (RythmEventGroupsExperiment.Configuration) ((RythmEventGroupsExperiment) obj2).c.get(ell0Var4.a);
        if (configuration != null) {
        }
    }

    public final void b(ell0 ell0Var) {
        String a = xv21.a(this.b.b(null).getTime());
        hbp0 hbp0Var = this.e.a;
        this.f.getClass();
        sjh sjhVar = uyj.a;
        tje.N(hbp0Var, mdh.b, null, new RythmAnalyticsImpl$report$1(ell0Var, a, this, null), 2);
    }
}
