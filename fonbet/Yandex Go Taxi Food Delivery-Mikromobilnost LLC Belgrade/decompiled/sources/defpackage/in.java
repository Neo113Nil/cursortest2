package defpackage;

import com.yandex.plus.acquisition.adapter.api.PlusAcquisitionSdkPaymentAnalyticsParams;
import com.yandex.plus.experiments.impl.providers.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.b;

/* loaded from: classes2.dex */
public final class in {
    public final String a;
    public final a b;

    public in(String str, a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final PlusAcquisitionSdkPaymentAnalyticsParams a() {
        Object h = this.b.h();
        PlusAcquisitionSdkPaymentAnalyticsParams.Experiments experiments = null;
        if (h instanceof Result.Failure) {
            h = null;
        }
        k2d0 k2d0Var = (k2d0) h;
        if (k2d0Var != null) {
            List list = k2d0Var.c;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new PlusAcquisitionSdkPaymentAnalyticsParams.Experiments.TestId(((Number) it.next()).longValue(), 0L, 2, null));
            }
            experiments = new PlusAcquisitionSdkPaymentAnalyticsParams.Experiments(kotlin.collections.a.N0(arrayList), k2d0Var.d);
        }
        return new PlusAcquisitionSdkPaymentAnalyticsParams(experiments, this.a, b.f());
    }
}
