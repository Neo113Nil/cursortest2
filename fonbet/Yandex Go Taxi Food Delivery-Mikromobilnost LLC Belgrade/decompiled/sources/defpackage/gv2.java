package defpackage;

import com.yandex.mobile.ads.common.analytics.AdAnalyticsStartupListener;
import com.yandex.mobile.ads.common.analytics.model.AdAnalyticsStartup;
import com.yandex.mobile.ads.common.analytics.model.AdAnalyticsStartupError;
import io.appmetrica.analytics.IParamsCallback;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.StartupParamsItem;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import yads.rf;

/* loaded from: classes7.dex */
public final class gv2 implements StartupParamsCallback {
    public final /* synthetic */ List a;
    public final /* synthetic */ AdAnalyticsStartupListener b;

    public gv2(List list, AdAnalyticsStartupListener adAnalyticsStartupListener) {
        this.a = list;
        this.b = adAnalyticsStartupListener;
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
        AdAnalyticsStartup adAnalyticsStartup = new AdAnalyticsStartup(linkedHashMap);
        i971 i971Var = (i971) this.b;
        i971Var.getClass();
        Map<String, String> parameters = adAnalyticsStartup.getParameters();
        bp5 bp5Var = (bp5) ((aj31) i971Var.b).b;
        bc81 bc81Var = new bc81(parameters.get("appmetrica_uuid"), parameters.get("appmetrica_device_id"), parameters.get(IParamsCallback.YANDEX_MOBILE_METRICA_GET_AD_URL));
        j18 j18Var = bp5Var.a;
        if (j18Var.t() instanceof mf60) {
            j18Var.resumeWith(new Result(bc81Var));
        }
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(StartupParamsCallback.Reason reason, StartupParamsCallback.Result result) {
        rf rfVar;
        AdAnalyticsStartupError adAnalyticsStartupError = jl40.l(reason, StartupParamsCallback.Reason.NETWORK) ? AdAnalyticsStartupError.NETWORK : jl40.l(reason, StartupParamsCallback.Reason.INVALID_RESPONSE) ? AdAnalyticsStartupError.INVALID_RESPONSE : AdAnalyticsStartupError.UNKNOWN;
        i971 i971Var = (i971) this.b;
        i971Var.getClass();
        int i = ln71.a[adAnalyticsStartupError.ordinal()];
        if (i == 1) {
            rfVar = rf.b;
        } else if (i == 2) {
            rfVar = rf.c;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            rfVar = rf.d;
        }
        ((aj31) i971Var.b).v(rfVar);
    }
}
