package defpackage;

import io.appmetrica.analytics.IParamsCallback;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.StartupParamsItem;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import yads.rf;

/* loaded from: classes7.dex */
public final class ds71 implements StartupParamsCallback {
    public final /* synthetic */ List a;
    public final /* synthetic */ aj31 b;

    public ds71(List list, aj31 aj31Var) {
        this.a = list;
        this.b = aj31Var;
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onReceive(StartupParamsCallback.Result result) {
        Map<String, StartupParamsItem> map;
        StartupParamsItem startupParamsItem;
        List list = this.a;
        int d = gw00.d(tcc.n(list, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj : list) {
            linkedHashMap.put(obj, (result == null || (map = result.parameters) == null || (startupParamsItem = map.get((String) obj)) == null) ? null : startupParamsItem.getId());
        }
        j18 j18Var = ((bp5) this.b.b).a;
        bc81 bc81Var = new bc81((String) linkedHashMap.get("appmetrica_uuid"), (String) linkedHashMap.get("appmetrica_device_id"), (String) linkedHashMap.get(IParamsCallback.YANDEX_MOBILE_METRICA_GET_AD_URL));
        if (j18Var.t() instanceof mf60) {
            j18Var.resumeWith(new Result(bc81Var));
        }
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(StartupParamsCallback.Reason reason, StartupParamsCallback.Result result) {
        this.b.v(jl40.l(reason, StartupParamsCallback.Reason.NETWORK) ? rf.c : jl40.l(reason, StartupParamsCallback.Reason.INVALID_RESPONSE) ? rf.d : rf.b);
    }
}
