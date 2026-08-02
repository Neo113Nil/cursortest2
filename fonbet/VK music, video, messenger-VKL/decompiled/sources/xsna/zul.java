package xsna;

import com.vk.push.common.Logger;
import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import com.vk.push.core.utils.MessageIdUtilsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DeleteExpiredPushEvent.kt */
/* loaded from: classes5.dex */
public final class zul extends BaseAnalyticsEvent {
    public final String b;
    public final List<dje0> c;
    public final String d;

    public zul(String str, List list, String str2) {
        super("vkcm_sdk_master_delete_expired_push");
        this.b = str;
        this.c = list;
        this.d = str2;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        MapBuilder mapBuilder = new MapBuilder();
        Logger logger = v6g0.a;
        ExtensionsKt.setMasterPackageName(mapBuilder, v6g0.e().getPackageName());
        ExtensionsKt.setClientPackageName(mapBuilder, this.b);
        String str = this.d;
        mapBuilder.put("push_token", str);
        List<dje0> list = this.c;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (dje0 dje0Var : list) {
            arrayList.add(new JSONObject().put("ttl", dje0Var.f).put("actual_ttl", dje0Var.g).put("push_id", MessageIdUtilsKt.formPushId(str, MessageIdUtilsKt.formMessageId(dje0Var.b, dje0Var.c))));
        }
        mapBuilder.put("push_messages", new JSONArray((Collection) arrayList).toString());
        return mapBuilder.h();
    }
}
