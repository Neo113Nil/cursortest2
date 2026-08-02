package com.monetization.ads.utils.logger.model;

import defpackage.auu0;
import defpackage.gsq0;
import defpackage.i381;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.psq0;
import defpackage.qje;
import defpackage.unr0;
import defpackage.x4e;
import defpackage.x981;
import defpackage.yjd;
import defpackage.z2a1;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;
import yads.qt1;

@gsq0
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bBc\b\u0011\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0018\b\u0001\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u001bR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b+\u0010&\u001a\u0004\b*\u0010\u001bR0\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010,\u0012\u0004\b/\u0010&\u001a\u0004\b-\u0010.R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010'\u0012\u0004\b1\u0010&\u001a\u0004\b0\u0010\u001b¨\u00065"}, d2 = {"Lcom/monetization/ads/utils/logger/model/MobileAdsNetworkRequestLog;", "", "", ClidProvider.TIMESTAMP, "", "method", "url", "", "headers", "body", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "", "seen1", "Lpsq0;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$mobileads_internalRelease", "(Lcom/monetization/ads/utils/logger/model/MobileAdsNetworkRequestLog;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestamp", "()J", "getTimestamp$annotations", "()V", "Ljava/lang/String;", "getMethod", "getMethod$annotations", "getUrl", "getUrl$annotations", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "getHeaders$annotations", "getBody", "getBody$annotations", "Companion", "yads/pt1", "yads/rt1", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MobileAdsNetworkRequestLog {
    private final String body;
    private final Map<String, String> headers;
    private final String method;
    private final long timestamp;
    private final String url;
    public static final x981 Companion = new x981();
    private static final i3y[] $childSerializers = {null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, qt1.w), null};

    @jxi
    public MobileAdsNetworkRequestLog(int i, long j, String str, String str2, Map map, String str3, psq0 psq0Var) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, i381.b);
            throw null;
        }
        this.timestamp = j;
        this.method = str;
        this.url = str2;
        this.headers = map;
        this.body = str3;
    }

    public static final /* synthetic */ void write$Self$mobileads_internalRelease(MobileAdsNetworkRequestLog self, yjd output, SerialDescriptor serialDesc) {
        i3y[] i3yVarArr = $childSerializers;
        output.s(serialDesc, 0, self.timestamp);
        output.o(serialDesc, 1, self.method);
        output.o(serialDesc, 2, self.url);
        output.g(serialDesc, 3, (KSerializer) i3yVarArr[3].getValue(), self.headers);
        output.g(serialDesc, 4, auu0.a, self.body);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileAdsNetworkRequestLog)) {
            return false;
        }
        MobileAdsNetworkRequestLog mobileAdsNetworkRequestLog = (MobileAdsNetworkRequestLog) other;
        return this.timestamp == mobileAdsNetworkRequestLog.timestamp && jl40.l(this.method, mobileAdsNetworkRequestLog.method) && jl40.l(this.url, mobileAdsNetworkRequestLog.url) && jl40.l(this.headers, mobileAdsNetworkRequestLog.headers) && jl40.l(this.body, mobileAdsNetworkRequestLog.body);
    }

    public int hashCode() {
        int a = z2a1.a(z2a1.a(Long.hashCode(this.timestamp) * 31, this.method), this.url);
        Map<String, String> map = this.headers;
        int hashCode = (a + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.body;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        long j = this.timestamp;
        String str = this.method;
        String str2 = this.url;
        Map<String, String> map = this.headers;
        String str3 = this.body;
        StringBuilder k = x4e.k("MobileAdsNetworkRequestLog(timestamp=", j, ", method=", str);
        k.append(", url=");
        k.append(str2);
        k.append(", headers=");
        k.append(map);
        return unr0.r(k, ", body=", str3, Extension.C_BRAKE);
    }

    public MobileAdsNetworkRequestLog(long j, String str, String str2, Map<String, String> map, String str3) {
        this.timestamp = j;
        this.method = str;
        this.url = str2;
        this.headers = map;
        this.body = str3;
    }
}
