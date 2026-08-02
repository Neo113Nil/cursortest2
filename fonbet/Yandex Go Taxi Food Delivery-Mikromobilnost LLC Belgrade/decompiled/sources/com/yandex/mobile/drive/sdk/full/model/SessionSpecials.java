package com.yandex.mobile.drive.sdk.full.model;

import defpackage.jl40;
import defpackage.ysq0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/mobile/drive/sdk/full/model/SessionSpecials;", "", "", "free_time", "total_price", "", "total_price_hr", "Lcom/yandex/mobile/drive/sdk/full/model/CurrentOffer;", "current_offer", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lcom/yandex/mobile/drive/sdk/full/model/CurrentOffer;)V", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "getTotal_price", "Ljava/lang/String;", "getTotal_price_hr", "()Ljava/lang/String;", "Lcom/yandex/mobile/drive/sdk/full/model/CurrentOffer;", "a", "()Lcom/yandex/mobile/drive/sdk/full/model/CurrentOffer;", "drive_sdk_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SessionSpecials {

    @ysq0("current_offer")
    private final CurrentOffer current_offer;

    @ysq0("free_time")
    private final Double free_time;

    @ysq0("total_price")
    private final Double total_price;

    @ysq0("total_price_hr")
    private final String total_price_hr;

    public SessionSpecials(Double d, Double d2, String str, CurrentOffer currentOffer) {
        this.free_time = d;
        this.total_price = d2;
        this.total_price_hr = str;
        this.current_offer = currentOffer;
    }

    /* renamed from: a, reason: from getter */
    public final CurrentOffer getCurrent_offer() {
        return this.current_offer;
    }

    /* renamed from: b, reason: from getter */
    public final Double getFree_time() {
        return this.free_time;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionSpecials)) {
            return false;
        }
        SessionSpecials sessionSpecials = (SessionSpecials) obj;
        return jl40.l(this.free_time, sessionSpecials.free_time) && jl40.l(this.total_price, sessionSpecials.total_price) && jl40.l(this.total_price_hr, sessionSpecials.total_price_hr) && jl40.l(this.current_offer, sessionSpecials.current_offer);
    }

    public final int hashCode() {
        Double d = this.free_time;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.total_price;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.total_price_hr;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        CurrentOffer currentOffer = this.current_offer;
        return hashCode3 + (currentOffer != null ? currentOffer.hashCode() : 0);
    }

    public final String toString() {
        return "SessionSpecials(free_time=" + this.free_time + ", total_price=" + this.total_price + ", total_price_hr=" + this.total_price_hr + ", current_offer=" + this.current_offer + Extension.C_BRAKE;
    }
}
