package com.yandex.go.analytics.realtime;

import com.yandex.go.analytics.realtime.experiments.InAppRealtimeAnalyticsExperiment;
import defpackage.e3n;
import defpackage.eei0;
import defpackage.kp50;
import defpackage.mf5;
import defpackage.o430;
import defpackage.sls;
import defpackage.wei0;
import io.appmetrica.analytics.ValidationException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.time.DurationUnit;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class RealtimeAnalyticsImpl$realtimeServices$2 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        eei0 eei0Var;
        wei0 wei0Var;
        a aVar = (a) this.receiver;
        InAppRealtimeAnalyticsExperiment.Configuration configuration = ((InAppRealtimeAnalyticsExperiment) aVar.c.getValue()).c;
        if (configuration != null) {
            boolean z = ((InAppRealtimeAnalyticsExperiment) aVar.c.getValue()).b;
            o430 o430Var = e3n.b;
            int i = configuration.c;
            DurationUnit durationUnit = DurationUnit.MILLISECONDS;
            eei0Var = new eei0(z, kp50.U(i, durationUnit), configuration.a, configuration.d, configuration.e, kp50.U(configuration.f, durationUnit), configuration.b);
        } else {
            eei0Var = null;
        }
        Set set = aVar.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            try {
                wei0Var = ((mf5) it.next()).a(eei0Var, aVar.e);
            } catch (ValidationException unused) {
                wei0Var = null;
            }
            if (wei0Var != null) {
                arrayList.add(wei0Var);
            }
        }
        return arrayList;
    }
}
