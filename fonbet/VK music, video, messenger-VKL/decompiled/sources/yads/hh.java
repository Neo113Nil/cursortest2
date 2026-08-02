package yads;

import com.huawei.hms.hihealth.data.DeviceInfo;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.StartupParamsItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import xsna.epx;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class hh implements StartupParamsCallback {
    public final dh a;

    public hh(dh dhVar) {
        this.a = dhVar;
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onReceive(StartupParamsCallback.Result result) {
        ArrayList arrayList;
        Map<String, StartupParamsItem> map;
        StartupParamsItem startupParamsItem;
        Map<String, StartupParamsItem> map2;
        StartupParamsItem startupParamsItem2;
        Map<String, StartupParamsItem> map3;
        StartupParamsItem startupParamsItem3;
        dh dhVar = this.a;
        String str = null;
        String id = (result == null || (map3 = result.parameters) == null || (startupParamsItem3 = map3.get(StartupParamsCallback.APPMETRICA_UUID)) == null) ? null : startupParamsItem3.getId();
        String id2 = (result == null || (map2 = result.parameters) == null || (startupParamsItem2 = map2.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)) == null) ? null : startupParamsItem2.getId();
        if (result != null && (map = result.parameters) != null && (startupParamsItem = map.get("appmetrica_get_ad_url")) != null) {
            str = startupParamsItem.getId();
        }
        wg wgVar = (wg) dhVar;
        wgVar.getClass();
        wgVar.c();
        ug ugVar = wgVar.a;
        tg tgVar = new tg(str, id2, id);
        synchronized (ugVar.a) {
            arrayList = new ArrayList(ugVar.b);
            ugVar.b.clear();
            s3q0 s3q0Var = s3q0.a;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((e31) it.next()).a(tgVar);
        }
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(StartupParamsCallback.Reason reason, StartupParamsCallback.Result result) {
        dh dhVar = this.a;
        ch chVar = epx.f(reason, StartupParamsCallback.Reason.NETWORK) ? ch.c : epx.f(reason, StartupParamsCallback.Reason.INVALID_RESPONSE) ? ch.d : ch.b;
        wg wgVar = (wg) dhVar;
        wgVar.c();
        wgVar.d.a.getClass();
        String str = (String) sg.a.get(chVar);
        if (str == null) {
            str = DeviceInfo.STR_TYPE_UNKNOWN;
        }
        rg.a(str);
        wgVar.a();
    }
}
