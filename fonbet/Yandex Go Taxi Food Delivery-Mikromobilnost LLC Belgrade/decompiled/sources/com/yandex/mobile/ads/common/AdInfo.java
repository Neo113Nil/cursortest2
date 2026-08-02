package com.yandex.mobile.ads.common;

import defpackage.b64;
import defpackage.jl40;
import defpackage.tse0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B3\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/yandex/mobile/ads/common/AdInfo;", "", "", "adUnitId", "extraData", "partnerText", "", "Lcom/yandex/mobile/ads/common/Creative;", "creatives", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getAdUnitId", "b", "getExtraData", "c", "getPartnerText", "d", "Ljava/util/List;", "getCreatives", "()Ljava/util/List;", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdInfo {

    /* renamed from: a, reason: from kotlin metadata */
    private final String adUnitId;

    /* renamed from: b, reason: from kotlin metadata */
    private final String extraData;

    /* renamed from: c, reason: from kotlin metadata */
    private final String partnerText;

    /* renamed from: d, reason: from kotlin metadata */
    private final List creatives;

    public AdInfo(String str, String str2, String str3, List<Creative> list) {
        this.adUnitId = str;
        this.extraData = str2;
        this.partnerText = str3;
        this.creatives = list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!AdInfo.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AdInfo adInfo = (AdInfo) other;
        return jl40.l(this.adUnitId, adInfo.adUnitId) && jl40.l(this.extraData, adInfo.extraData) && jl40.l(this.partnerText, adInfo.partnerText) && jl40.l(this.creatives, adInfo.creatives);
    }

    public int hashCode() {
        int hashCode = this.adUnitId.hashCode() * 31;
        String str = this.extraData;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.partnerText;
        return this.creatives.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.adUnitId;
        String str2 = this.extraData;
        return tse0.j(this.partnerText, ", creatives=", Extension.C_BRAKE, b64.v("AdInfo(adUnitId='", str, "', extraData=", str2, ", partnerText="), this.creatives);
    }
}
