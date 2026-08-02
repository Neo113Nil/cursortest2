package defpackage;

import com.yandex.go.eboks.objects.experiments.EboksObjectsParamsExperiment;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class bin {
    public final dhn a;
    public final EboksObjectsParamsExperiment b;

    public bin(dhn dhnVar, EboksObjectsParamsExperiment eboksObjectsParamsExperiment) {
        this.a = dhnVar;
        this.b = eboksObjectsParamsExperiment;
    }

    public final EboksObjectsParamsExperiment.Params a() {
        Object obj;
        Iterator it = this.b.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            EboksObjectsParamsExperiment.Params params = (EboksObjectsParamsExperiment.Params) obj;
            String str = params.b;
            dhn dhnVar = this.a;
            if (jl40.l(str, dhnVar.b) && jl40.l(params.a, dhnVar.a)) {
                break;
            }
        }
        EboksObjectsParamsExperiment.Params params2 = (EboksObjectsParamsExperiment.Params) obj;
        return params2 == null ? new EboksObjectsParamsExperiment.Params(0) : params2;
    }
}
