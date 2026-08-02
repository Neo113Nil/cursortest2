package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcOldUserPromoConfig;", "", "", "plusPromoItemTitle", "plusPromoItemSubtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/rconfig/configs/NfcOldUserPromoConfig;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlusPromoItemTitle", "getPlusPromoItemSubtitle", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NfcOldUserPromoConfig {

    @Json(name = "plus_points_promo_item_subtitle")
    private final String plusPromoItemSubtitle;

    @Json(name = "plus_points_promo_item_title")
    private final String plusPromoItemTitle;

    public NfcOldUserPromoConfig(String str, String str2) {
        this.plusPromoItemTitle = str;
        this.plusPromoItemSubtitle = str2;
    }

    public static /* synthetic */ NfcOldUserPromoConfig copy$default(NfcOldUserPromoConfig nfcOldUserPromoConfig, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nfcOldUserPromoConfig.plusPromoItemTitle;
        }
        if ((i & 2) != 0) {
            str2 = nfcOldUserPromoConfig.plusPromoItemSubtitle;
        }
        return nfcOldUserPromoConfig.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPlusPromoItemTitle() {
        return this.plusPromoItemTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPlusPromoItemSubtitle() {
        return this.plusPromoItemSubtitle;
    }

    public final NfcOldUserPromoConfig copy(String plusPromoItemTitle, String plusPromoItemSubtitle) {
        return new NfcOldUserPromoConfig(plusPromoItemTitle, plusPromoItemSubtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcOldUserPromoConfig)) {
            return false;
        }
        NfcOldUserPromoConfig nfcOldUserPromoConfig = (NfcOldUserPromoConfig) other;
        return jl40.l(this.plusPromoItemTitle, nfcOldUserPromoConfig.plusPromoItemTitle) && jl40.l(this.plusPromoItemSubtitle, nfcOldUserPromoConfig.plusPromoItemSubtitle);
    }

    public final String getPlusPromoItemSubtitle() {
        return this.plusPromoItemSubtitle;
    }

    public final String getPlusPromoItemTitle() {
        return this.plusPromoItemTitle;
    }

    public int hashCode() {
        String str = this.plusPromoItemTitle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.plusPromoItemSubtitle;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return unr0.p("NfcOldUserPromoConfig(plusPromoItemTitle=", this.plusPromoItemTitle, ", plusPromoItemSubtitle=", this.plusPromoItemSubtitle, Extension.C_BRAKE);
    }
}
