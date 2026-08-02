package com.monetization.ads.utils.logger.model;

import defpackage.gsq0;
import defpackage.i381;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.kd81;
import defpackage.psq0;
import defpackage.qje;
import defpackage.wz71;
import defpackage.xw71;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/monetization/ads/utils/logger/model/MobileAdsNetworkLog;", "", "Lcom/monetization/ads/utils/logger/model/MobileAdsNetworkRequestLog;", "request", "Lcom/monetization/ads/utils/logger/model/MobileAdsNetworkResponseLog;", "response", "<init>", "(Lcom/monetization/ads/utils/logger/model/MobileAdsNetworkRequestLog;Lcom/monetization/ads/utils/logger/model/MobileAdsNetworkResponseLog;)V", "", "seen1", "Lpsq0;", "serializationConstructorMarker", "(ILcom/monetization/ads/utils/logger/model/MobileAdsNetworkRequestLog;Lcom/monetization/ads/utils/logger/model/MobileAdsNetworkResponseLog;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$mobileads_internalRelease", "(Lcom/monetization/ads/utils/logger/model/MobileAdsNetworkLog;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/monetization/ads/utils/logger/model/MobileAdsNetworkRequestLog;", "getRequest", "()Lcom/monetization/ads/utils/logger/model/MobileAdsNetworkRequestLog;", "getRequest$annotations", "()V", "Lcom/monetization/ads/utils/logger/model/MobileAdsNetworkResponseLog;", "getResponse", "()Lcom/monetization/ads/utils/logger/model/MobileAdsNetworkResponseLog;", "getResponse$annotations", "Companion", "yads/nt1", "yads/ot1", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MobileAdsNetworkLog {
    public static final wz71 Companion = new wz71();
    private final MobileAdsNetworkRequestLog request;
    private final MobileAdsNetworkResponseLog response;

    @jxi
    public MobileAdsNetworkLog(int i, MobileAdsNetworkRequestLog mobileAdsNetworkRequestLog, MobileAdsNetworkResponseLog mobileAdsNetworkResponseLog, psq0 psq0Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, xw71.b);
            throw null;
        }
        this.request = mobileAdsNetworkRequestLog;
        this.response = mobileAdsNetworkResponseLog;
    }

    public static final /* synthetic */ void write$Self$mobileads_internalRelease(MobileAdsNetworkLog self, yjd output, SerialDescriptor serialDesc) {
        output.e(serialDesc, 0, i381.a, self.request);
        output.g(serialDesc, 1, kd81.a, self.response);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileAdsNetworkLog)) {
            return false;
        }
        MobileAdsNetworkLog mobileAdsNetworkLog = (MobileAdsNetworkLog) other;
        return jl40.l(this.request, mobileAdsNetworkLog.request) && jl40.l(this.response, mobileAdsNetworkLog.response);
    }

    public int hashCode() {
        int hashCode = this.request.hashCode() * 31;
        MobileAdsNetworkResponseLog mobileAdsNetworkResponseLog = this.response;
        return hashCode + (mobileAdsNetworkResponseLog == null ? 0 : mobileAdsNetworkResponseLog.hashCode());
    }

    public String toString() {
        return "MobileAdsNetworkLog(request=" + this.request + ", response=" + this.response + Extension.C_BRAKE;
    }

    public MobileAdsNetworkLog(MobileAdsNetworkRequestLog mobileAdsNetworkRequestLog, MobileAdsNetworkResponseLog mobileAdsNetworkResponseLog) {
        this.request = mobileAdsNetworkRequestLog;
        this.response = mobileAdsNetworkResponseLog;
    }
}
