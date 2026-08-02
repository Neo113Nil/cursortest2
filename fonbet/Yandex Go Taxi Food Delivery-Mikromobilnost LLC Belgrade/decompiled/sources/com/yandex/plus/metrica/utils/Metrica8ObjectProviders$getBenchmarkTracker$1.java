package com.yandex.plus.metrica.utils;

import android.content.Context;
import com.yandex.plus.core.config.Environment;
import com.yandex.pulse.histogram.ComponentHistograms;
import defpackage.d5z0;
import defpackage.h5z0;
import defpackage.oa20;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class Metrica8ObjectProviders$getBenchmarkTracker$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        Object obj;
        e eVar = (e) this.receiver;
        oa20 oa20Var = eVar.b;
        Context context = eVar.a;
        String str = eVar.c;
        String str2 = eVar.d;
        String str3 = eVar.e;
        Environment environment = eVar.f;
        boolean booleanValue = ((Boolean) eVar.h.getValue()).booleanValue();
        d5z0 d5z0Var = h5z0.a;
        d5z0Var.t("Metrica8Facade");
        int i = 0;
        d5z0Var.a("Get Pulse component histograms", new Object[0]);
        if (oa20Var.e(context, str, str2, str3, environment, booleanValue, true) == null || (obj = oa20Var.c(new c(str3, i, oa20Var), "ComponentHistograms")) == null) {
            d5z0Var.t("Metrica8Facade");
            d5z0Var.o("Can't get AppMetrica internal reporter so Pulse component histograms could not got either", new Object[0]);
            obj = null;
        }
        return (ComponentHistograms) obj;
    }
}
