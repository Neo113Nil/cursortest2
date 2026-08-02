package com.monetization.ads.utils.logger.model;

import defpackage.auu0;
import defpackage.gsq0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.kd81;
import defpackage.psq0;
import defpackage.qje;
import defpackage.uj81;
import defpackage.yjd;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;
import yads.tt1;

@gsq0
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBW\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0018\b\u0001\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R0\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b0\u0010%\u001a\u0004\b/\u0010\u001a¨\u00064"}, d2 = {"Lcom/monetization/ads/utils/logger/model/MobileAdsNetworkResponseLog;", "", "", ClidProvider.TIMESTAMP, "", "statusCode", "", "", "headers", "body", "<init>", "(JLjava/lang/Integer;Ljava/util/Map;Ljava/lang/String;)V", "seen1", "Lpsq0;", "serializationConstructorMarker", "(IJLjava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$mobileads_internalRelease", "(Lcom/monetization/ads/utils/logger/model/MobileAdsNetworkResponseLog;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestamp", "()J", "getTimestamp$annotations", "()V", "Ljava/lang/Integer;", "getStatusCode", "()Ljava/lang/Integer;", "getStatusCode$annotations", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "getHeaders$annotations", "Ljava/lang/String;", "getBody", "getBody$annotations", "Companion", "yads/st1", "yads/ut1", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MobileAdsNetworkResponseLog {
    private final String body;
    private final Map<String, String> headers;
    private final Integer statusCode;
    private final long timestamp;
    public static final uj81 Companion = new uj81();
    private static final i3y[] $childSerializers = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, tt1.w), null};

    @jxi
    public MobileAdsNetworkResponseLog(int i, long j, Integer num, Map map, String str, psq0 psq0Var) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, kd81.b);
            throw null;
        }
        this.timestamp = j;
        this.statusCode = num;
        this.headers = map;
        this.body = str;
    }

    public static final /* synthetic */ void write$Self$mobileads_internalRelease(MobileAdsNetworkResponseLog self, yjd output, SerialDescriptor serialDesc) {
        i3y[] i3yVarArr = $childSerializers;
        output.s(serialDesc, 0, self.timestamp);
        output.g(serialDesc, 1, h6w.a, self.statusCode);
        output.g(serialDesc, 2, (KSerializer) i3yVarArr[2].getValue(), self.headers);
        output.g(serialDesc, 3, auu0.a, self.body);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileAdsNetworkResponseLog)) {
            return false;
        }
        MobileAdsNetworkResponseLog mobileAdsNetworkResponseLog = (MobileAdsNetworkResponseLog) other;
        return this.timestamp == mobileAdsNetworkResponseLog.timestamp && jl40.l(this.statusCode, mobileAdsNetworkResponseLog.statusCode) && jl40.l(this.headers, mobileAdsNetworkResponseLog.headers) && jl40.l(this.body, mobileAdsNetworkResponseLog.body);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.timestamp) * 31;
        Integer num = this.statusCode;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, String> map = this.headers;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.body;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "MobileAdsNetworkResponseLog(timestamp=" + this.timestamp + ", statusCode=" + this.statusCode + ", headers=" + this.headers + ", body=" + this.body + Extension.C_BRAKE;
    }

    public MobileAdsNetworkResponseLog(long j, Integer num, Map<String, String> map, String str) {
        this.timestamp = j;
        this.statusCode = num;
        this.headers = map;
        this.body = str;
    }
}
