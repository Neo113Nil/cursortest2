package xsna;

import com.vk.push.common.Logger;
import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.common.messaging.RemoteMessage;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.builders.MapBuilder;

/* compiled from: PushToClientSendAnalyticsEvent.kt */
/* loaded from: classes5.dex */
public final class oke0 extends BaseAnalyticsEvent {
    public final String b;
    public final List<RemoteMessage> c;
    public final Object d;
    public final long e;
    public final String f;

    public oke0(long j, Object obj, String str, String str2, List list) {
        super("vkcm_sdk_master_send_push");
        this.b = str;
        this.c = list;
        this.d = obj;
        this.e = j;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oke0)) {
            return false;
        }
        oke0 oke0Var = (oke0) obj;
        return epx.f(this.b, oke0Var.b) && epx.f(this.c, oke0Var.c) && epx.f(this.d, oke0Var.d) && this.e == oke0Var.e && epx.f(this.f, oke0Var.f);
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        MapBuilder mapBuilder = new MapBuilder();
        List<RemoteMessage> list = this.c;
        RemoteMessage remoteMessage = (RemoteMessage) j5g.a0(list);
        String token = remoteMessage != null ? remoteMessage.getToken() : null;
        ExtensionsKt.setPushToken(mapBuilder, token);
        List<RemoteMessage> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((RemoteMessage) it.next()).getMessageId());
        }
        ExtensionsKt.setPushIds(mapBuilder, token, arrayList);
        ExtensionsKt.setClientPackageName(mapBuilder, this.b);
        Logger logger = v6g0.a;
        ExtensionsKt.setMasterPackageName(mapBuilder, v6g0.e().getPackageName());
        String str = this.f;
        if (str != null) {
            ExtensionsKt.setReceivedBy(mapBuilder, str);
        }
        ExtensionsKt.setIntervalMs(mapBuilder, this.e);
        ExtensionsKt.setResult$default(mapBuilder, this.d, null, null, 6, null);
        return mapBuilder.h();
    }

    public final int hashCode() {
        int a = bh10.a((Result.b(this.d) + fw3.a(this.b.hashCode() * 31, 31, this.c)) * 31, 31, this.e);
        String str = this.f;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushToClientSendAnalyticsEvent(clientPackageName=");
        sb.append(this.b);
        sb.append(", messages=");
        sb.append(this.c);
        sb.append(", result=");
        sb.append((Object) Result.c(this.d));
        sb.append(", intervalMs=");
        sb.append(this.e);
        sb.append(", receivedBy=");
        return ho8.a(sb, this.f, ')');
    }
}
