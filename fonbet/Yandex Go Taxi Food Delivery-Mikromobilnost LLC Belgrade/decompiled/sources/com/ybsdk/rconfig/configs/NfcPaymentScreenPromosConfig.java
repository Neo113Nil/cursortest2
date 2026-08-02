package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcPaymentScreenPromosConfig;", "", "Lcom/ybsdk/rconfig/configs/NfcPaymentScreenPromoConfig;", "wallet", "split", "corpcard", "pro", "<init>", "(Lcom/ybsdk/rconfig/configs/NfcPaymentScreenPromoConfig;Lcom/ybsdk/rconfig/configs/NfcPaymentScreenPromoConfig;Lcom/ybsdk/rconfig/configs/NfcPaymentScreenPromoConfig;Lcom/ybsdk/rconfig/configs/NfcPaymentScreenPromoConfig;)V", "component1", "()Lcom/ybsdk/rconfig/configs/NfcPaymentScreenPromoConfig;", "component2", "component3", "component4", "copy", "(Lcom/ybsdk/rconfig/configs/NfcPaymentScreenPromoConfig;Lcom/ybsdk/rconfig/configs/NfcPaymentScreenPromoConfig;Lcom/ybsdk/rconfig/configs/NfcPaymentScreenPromoConfig;Lcom/ybsdk/rconfig/configs/NfcPaymentScreenPromoConfig;)Lcom/ybsdk/rconfig/configs/NfcPaymentScreenPromosConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/rconfig/configs/NfcPaymentScreenPromoConfig;", "getWallet", "getSplit", "getCorpcard", "getPro", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NfcPaymentScreenPromosConfig {

    @Json(name = "corp_card")
    private final NfcPaymentScreenPromoConfig corpcard;

    @Json(name = "pro")
    private final NfcPaymentScreenPromoConfig pro;

    @Json(name = "split")
    private final NfcPaymentScreenPromoConfig split;

    @Json(name = "wallet")
    private final NfcPaymentScreenPromoConfig wallet;

    public NfcPaymentScreenPromosConfig(NfcPaymentScreenPromoConfig nfcPaymentScreenPromoConfig, NfcPaymentScreenPromoConfig nfcPaymentScreenPromoConfig2, NfcPaymentScreenPromoConfig nfcPaymentScreenPromoConfig3, NfcPaymentScreenPromoConfig nfcPaymentScreenPromoConfig4) {
        this.wallet = nfcPaymentScreenPromoConfig;
        this.split = nfcPaymentScreenPromoConfig2;
        this.corpcard = nfcPaymentScreenPromoConfig3;
        this.pro = nfcPaymentScreenPromoConfig4;
    }

    public static /* synthetic */ NfcPaymentScreenPromosConfig copy$default(NfcPaymentScreenPromosConfig nfcPaymentScreenPromosConfig, NfcPaymentScreenPromoConfig nfcPaymentScreenPromoConfig, NfcPaymentScreenPromoConfig nfcPaymentScreenPromoConfig2, NfcPaymentScreenPromoConfig nfcPaymentScreenPromoConfig3, NfcPaymentScreenPromoConfig nfcPaymentScreenPromoConfig4, int i, Object obj) {
        if ((i & 1) != 0) {
            nfcPaymentScreenPromoConfig = nfcPaymentScreenPromosConfig.wallet;
        }
        if ((i & 2) != 0) {
            nfcPaymentScreenPromoConfig2 = nfcPaymentScreenPromosConfig.split;
        }
        if ((i & 4) != 0) {
            nfcPaymentScreenPromoConfig3 = nfcPaymentScreenPromosConfig.corpcard;
        }
        if ((i & 8) != 0) {
            nfcPaymentScreenPromoConfig4 = nfcPaymentScreenPromosConfig.pro;
        }
        return nfcPaymentScreenPromosConfig.copy(nfcPaymentScreenPromoConfig, nfcPaymentScreenPromoConfig2, nfcPaymentScreenPromoConfig3, nfcPaymentScreenPromoConfig4);
    }

    /* renamed from: component1, reason: from getter */
    public final NfcPaymentScreenPromoConfig getWallet() {
        return this.wallet;
    }

    /* renamed from: component2, reason: from getter */
    public final NfcPaymentScreenPromoConfig getSplit() {
        return this.split;
    }

    /* renamed from: component3, reason: from getter */
    public final NfcPaymentScreenPromoConfig getCorpcard() {
        return this.corpcard;
    }

    /* renamed from: component4, reason: from getter */
    public final NfcPaymentScreenPromoConfig getPro() {
        return this.pro;
    }

    public final NfcPaymentScreenPromosConfig copy(NfcPaymentScreenPromoConfig wallet, NfcPaymentScreenPromoConfig split, NfcPaymentScreenPromoConfig corpcard, NfcPaymentScreenPromoConfig pro) {
        return new NfcPaymentScreenPromosConfig(wallet, split, corpcard, pro);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcPaymentScreenPromosConfig)) {
            return false;
        }
        NfcPaymentScreenPromosConfig nfcPaymentScreenPromosConfig = (NfcPaymentScreenPromosConfig) other;
        return jl40.l(this.wallet, nfcPaymentScreenPromosConfig.wallet) && jl40.l(this.split, nfcPaymentScreenPromosConfig.split) && jl40.l(this.corpcard, nfcPaymentScreenPromosConfig.corpcard) && jl40.l(this.pro, nfcPaymentScreenPromosConfig.pro);
    }

    public final NfcPaymentScreenPromoConfig getCorpcard() {
        return this.corpcard;
    }

    public final NfcPaymentScreenPromoConfig getPro() {
        return this.pro;
    }

    public final NfcPaymentScreenPromoConfig getSplit() {
        return this.split;
    }

    public final NfcPaymentScreenPromoConfig getWallet() {
        return this.wallet;
    }

    public int hashCode() {
        NfcPaymentScreenPromoConfig nfcPaymentScreenPromoConfig = this.wallet;
        int hashCode = (nfcPaymentScreenPromoConfig == null ? 0 : nfcPaymentScreenPromoConfig.hashCode()) * 31;
        NfcPaymentScreenPromoConfig nfcPaymentScreenPromoConfig2 = this.split;
        int hashCode2 = (hashCode + (nfcPaymentScreenPromoConfig2 == null ? 0 : nfcPaymentScreenPromoConfig2.hashCode())) * 31;
        NfcPaymentScreenPromoConfig nfcPaymentScreenPromoConfig3 = this.corpcard;
        int hashCode3 = (hashCode2 + (nfcPaymentScreenPromoConfig3 == null ? 0 : nfcPaymentScreenPromoConfig3.hashCode())) * 31;
        NfcPaymentScreenPromoConfig nfcPaymentScreenPromoConfig4 = this.pro;
        return hashCode3 + (nfcPaymentScreenPromoConfig4 != null ? nfcPaymentScreenPromoConfig4.hashCode() : 0);
    }

    public String toString() {
        return "NfcPaymentScreenPromosConfig(wallet=" + this.wallet + ", split=" + this.split + ", corpcard=" + this.corpcard + ", pro=" + this.pro + Extension.C_BRAKE;
    }
}
