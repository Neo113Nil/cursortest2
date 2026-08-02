package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.a;
import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechApiCallAttemptResultResult;
import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechGetRemoteConfigAwaitUpdateResultResult;
import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechGetRemoteConfigBlockingResultTrigger;
import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechReadDeviceIdStashResultResult;
import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechSaveDeviceIdStashResultResult;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes8.dex */
public final class fcy0 {
    public final a a;

    public fcy0(a aVar) {
        this.a = aVar;
    }

    public static /* synthetic */ void b(fcy0 fcy0Var, String str, String str2, int i, TechEvents$TechApiCallAttemptResultResult techEvents$TechApiCallAttemptResultResult, Double d, String str3, String str4, int i2) {
        if ((i2 & 16) != 0) {
            d = null;
        }
        if ((i2 & 64) != 0) {
            str3 = null;
        }
        fcy0Var.a(str, str2, i, techEvents$TechApiCallAttemptResultResult, d, null, str3, str4);
    }

    public final void a(String str, String str2, int i, TechEvents$TechApiCallAttemptResultResult techEvents$TechApiCallAttemptResultResult, Double d, Boolean bool, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(8);
        if (str != null) {
            linkedHashMap.put("retry_id", str);
        }
        linkedHashMap.put("url", str2);
        linkedHashMap.put("attempt", Integer.valueOf(i));
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, techEvents$TechApiCallAttemptResultResult.getOriginalValue());
        if (d != null) {
            linkedHashMap.put("duration_ms", d);
        }
        if (bool != null) {
            linkedHashMap.put("retryable", bool);
        }
        if (str3 != null) {
            linkedHashMap.put("error", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("trace_id", str4);
        }
        this.a.a("tech.api_call.attempt.result", linkedHashMap);
    }

    public final void c(String str, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put("is_class_exists", Boolean.valueOf(z));
        linkedHashMap.put("class_name", str);
        this.a.a("tech.api_check.vendor", linkedHashMap);
    }

    public final void d(TechEvents$TechGetRemoteConfigAwaitUpdateResultResult techEvents$TechGetRemoteConfigAwaitUpdateResultResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, techEvents$TechGetRemoteConfigAwaitUpdateResultResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("tech.get_remote_config.await_update.result", linkedHashMap);
    }

    public final void e(TechEvents$TechGetRemoteConfigBlockingResultTrigger techEvents$TechGetRemoteConfigBlockingResultTrigger, int i, int i2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put("trigger", techEvents$TechGetRemoteConfigBlockingResultTrigger.getOriginalValue());
        linkedHashMap.put("totalRequestTime", Integer.valueOf(i));
        linkedHashMap.put("waitTimeFromInputToRemoteConfigRetrieval", Integer.valueOf(i2));
        this.a.a("tech.get_remote_config.blocking.result", linkedHashMap);
    }

    public final void f(String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put("name", str);
        linkedHashMap.put("parameters", map);
        linkedHashMap.put("isHandled", Boolean.TRUE);
        this.a.a("tech.js_api.message", linkedHashMap);
    }

    public final void g(String str, String str2, TechEvents$TechReadDeviceIdStashResultResult techEvents$TechReadDeviceIdStashResultResult) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        if (str != null) {
            linkedHashMap.put(MetaDataField.DEVICE_ID_FIELD, str);
        }
        if (str2 != null) {
            linkedHashMap.put("app", str2);
        }
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, techEvents$TechReadDeviceIdStashResultResult.getOriginalValue());
        this.a.a("tech.read_device_id_stash_result", linkedHashMap);
    }

    public final void h(String str, TechEvents$TechSaveDeviceIdStashResultResult techEvents$TechSaveDeviceIdStashResultResult) {
        LinkedHashMap w = g8e.w(2, MetaDataField.DEVICE_ID_FIELD, str);
        w.put(TarifficatorScenarioActivity.RESULT_KEY, techEvents$TechSaveDeviceIdStashResultResult.getOriginalValue());
        this.a.a("tech.save_device_id_stash_result", w);
    }
}
