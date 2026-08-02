package com.yandex.go.network_metrics;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.yandex.div.state.db.StateEntry;
import defpackage.gw00;
import defpackage.j73;
import defpackage.k4o;
import defpackage.tcc;
import defpackage.xs50;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.common.clid.ClidProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u001d\b\u0080\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#¨\u0006$"}, d2 = {"Lcom/yandex/go/network_metrics/NetworkEventParam;", "", "", "key", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "", "excludedFromRegularEvents", "Ljava/util/Set;", "Companion", "xs50", "DURATION", "URL", "ROUTE", "HOST", "IP", "PATH", "KIND", "ERROR_DOMAIN", "ERROR_DESCRIPTION", "HTTP_CODE", "RETRY_NUMBER", "TRACE_ID", "NETWORK_TYPE", "IS_VPN", "MOB_CONFIG_ID", "MOB_PROXY_ID", "LOCAL_ID", "TIMESTAMP", "TOTAL_DURATION", "LOCAL_QUEUE_DURATION", "REQUEST_DURATION", "RESPONSE_SIZE", "REQUEST_SIZE", "PARSING_DURATION", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NetworkEventParam {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NetworkEventParam[] $VALUES;
    public static final xs50 Companion;
    public static final NetworkEventParam DURATION;
    public static final NetworkEventParam ERROR_DESCRIPTION;
    public static final NetworkEventParam ERROR_DOMAIN;
    public static final NetworkEventParam HOST;
    public static final NetworkEventParam HTTP_CODE;
    public static final NetworkEventParam IP;
    public static final NetworkEventParam IS_VPN;
    public static final NetworkEventParam KIND;
    public static final NetworkEventParam LOCAL_ID;
    public static final NetworkEventParam LOCAL_QUEUE_DURATION;
    public static final NetworkEventParam MOB_CONFIG_ID;
    public static final NetworkEventParam MOB_PROXY_ID;
    public static final NetworkEventParam NETWORK_TYPE;
    public static final NetworkEventParam PARSING_DURATION;
    public static final NetworkEventParam PATH;
    public static final NetworkEventParam REQUEST_DURATION;
    public static final NetworkEventParam REQUEST_SIZE;
    public static final NetworkEventParam RESPONSE_SIZE;
    public static final NetworkEventParam RETRY_NUMBER;
    public static final NetworkEventParam ROUTE;
    public static final NetworkEventParam TIMESTAMP;
    public static final NetworkEventParam TOTAL_DURATION;
    public static final NetworkEventParam TRACE_ID;
    public static final NetworkEventParam URL;
    private static final Map<String, NetworkEventParam> paramsByKey;
    private final Set<String> excludedFromRegularEvents;
    private final String key;

    static {
        NetworkEventParam networkEventParam = new NetworkEventParam("DURATION", 0, "duration");
        DURATION = networkEventParam;
        NetworkEventParam networkEventParam2 = new NetworkEventParam("URL", 1, "url");
        URL = networkEventParam2;
        NetworkEventParam networkEventParam3 = new NetworkEventParam("ROUTE", 2, "route");
        ROUTE = networkEventParam3;
        NetworkEventParam networkEventParam4 = new NetworkEventParam("HOST", 3, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST);
        HOST = networkEventParam4;
        NetworkEventParam networkEventParam5 = new NetworkEventParam("IP", 4, "ip");
        IP = networkEventParam5;
        NetworkEventParam networkEventParam6 = new NetworkEventParam("PATH", 5, StateEntry.COLUMN_PATH);
        PATH = networkEventParam6;
        NetworkEventParam networkEventParam7 = new NetworkEventParam("KIND", 6, "kind");
        KIND = networkEventParam7;
        NetworkEventParam networkEventParam8 = new NetworkEventParam("ERROR_DOMAIN", 7, "errorDomain");
        ERROR_DOMAIN = networkEventParam8;
        NetworkEventParam networkEventParam9 = new NetworkEventParam("ERROR_DESCRIPTION", 8, "errorDescription");
        ERROR_DESCRIPTION = networkEventParam9;
        NetworkEventParam networkEventParam10 = new NetworkEventParam("HTTP_CODE", 9, "httpCode");
        HTTP_CODE = networkEventParam10;
        NetworkEventParam networkEventParam11 = new NetworkEventParam("RETRY_NUMBER", 10, "retryNumber");
        RETRY_NUMBER = networkEventParam11;
        NetworkEventParam networkEventParam12 = new NetworkEventParam("TRACE_ID", 11, "traceId");
        TRACE_ID = networkEventParam12;
        NetworkEventParam networkEventParam13 = new NetworkEventParam("NETWORK_TYPE", 12, "networkType");
        NETWORK_TYPE = networkEventParam13;
        NetworkEventParam networkEventParam14 = new NetworkEventParam("IS_VPN", 13, "isVpn");
        IS_VPN = networkEventParam14;
        NetworkEventParam networkEventParam15 = new NetworkEventParam("MOB_CONFIG_ID", 14, "mobConfigId");
        MOB_CONFIG_ID = networkEventParam15;
        NetworkEventParam networkEventParam16 = new NetworkEventParam("MOB_PROXY_ID", 15, "mobProxyId");
        MOB_PROXY_ID = networkEventParam16;
        NetworkEventParam networkEventParam17 = new NetworkEventParam("LOCAL_ID", 16, "localId", j73.f0(new String[]{"Network.Success", "Network.Failure"}));
        LOCAL_ID = networkEventParam17;
        NetworkEventParam networkEventParam18 = new NetworkEventParam("TIMESTAMP", 17, ClidProvider.TIMESTAMP, j73.f0(new String[]{"Network.Success", "Network.Failure"}));
        TIMESTAMP = networkEventParam18;
        NetworkEventParam networkEventParam19 = new NetworkEventParam("TOTAL_DURATION", 18, "totalDuration", j73.f0(new String[]{"Network.Success", "Network.Failure"}));
        TOTAL_DURATION = networkEventParam19;
        NetworkEventParam networkEventParam20 = new NetworkEventParam("LOCAL_QUEUE_DURATION", 19, "localQueueDuration", j73.f0(new String[]{"Network.Success", "Network.Failure"}));
        LOCAL_QUEUE_DURATION = networkEventParam20;
        NetworkEventParam networkEventParam21 = new NetworkEventParam("REQUEST_DURATION", 20, "requestDuration", Collections.singleton("Network.Success"));
        REQUEST_DURATION = networkEventParam21;
        NetworkEventParam networkEventParam22 = new NetworkEventParam("RESPONSE_SIZE", 21, "responseSize", j73.f0(new String[]{"Network.Success", "Network.Failure"}));
        RESPONSE_SIZE = networkEventParam22;
        NetworkEventParam networkEventParam23 = new NetworkEventParam("REQUEST_SIZE", 22, "requestSize", j73.f0(new String[]{"Network.Success", "Network.Failure"}));
        REQUEST_SIZE = networkEventParam23;
        NetworkEventParam networkEventParam24 = new NetworkEventParam("PARSING_DURATION", 23, "parsingDuration", j73.f0(new String[]{"Network.Success", "Network.Failure"}));
        PARSING_DURATION = networkEventParam24;
        NetworkEventParam[] networkEventParamArr = {networkEventParam, networkEventParam2, networkEventParam3, networkEventParam4, networkEventParam5, networkEventParam6, networkEventParam7, networkEventParam8, networkEventParam9, networkEventParam10, networkEventParam11, networkEventParam12, networkEventParam13, networkEventParam14, networkEventParam15, networkEventParam16, networkEventParam17, networkEventParam18, networkEventParam19, networkEventParam20, networkEventParam21, networkEventParam22, networkEventParam23, networkEventParam24};
        $VALUES = networkEventParamArr;
        k4o a = kotlin.enums.a.a(networkEventParamArr);
        $ENTRIES = a;
        Companion = new xs50();
        int d = gw00.d(tcc.n(a, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
        for (Object obj : a) {
            linkedHashMap.put(((NetworkEventParam) obj).key, obj);
        }
        paramsByKey = linkedHashMap;
    }

    public NetworkEventParam(String str, int i, String str2, Set set) {
        this.key = str2;
        this.excludedFromRegularEvents = set;
    }

    public static NetworkEventParam valueOf(String str) {
        return (NetworkEventParam) Enum.valueOf(NetworkEventParam.class, str);
    }

    public static NetworkEventParam[] values() {
        return (NetworkEventParam[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    public final boolean c(String str) {
        return !this.excludedFromRegularEvents.contains(str);
    }

    public /* synthetic */ NetworkEventParam(String str, int i, String str2) {
        this(str, i, str2, EmptySet.a);
    }
}
