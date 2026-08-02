package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b#\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcPaymentScreenBadgesConfig;", "", "Lcom/ybsdk/rconfig/configs/NfcPaymentScreenBadgeConfig;", "wallet", "split", "corpcard", "pro", "external", "yellow", "<init>", "(Lcom/ybsdk/rconfig/configs/NfcPaymentScreenBadgeConfig;Lcom/ybsdk/rconfig/configs/NfcPaymentScreenBadgeConfig;Lcom/ybsdk/rconfig/configs/NfcPaymentScreenBadgeConfig;Lcom/ybsdk/rconfig/configs/NfcPaymentScreenBadgeConfig;Lcom/ybsdk/rconfig/configs/NfcPaymentScreenBadgeConfig;Lcom/ybsdk/rconfig/configs/NfcPaymentScreenBadgeConfig;)V", "component1", "()Lcom/ybsdk/rconfig/configs/NfcPaymentScreenBadgeConfig;", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/ybsdk/rconfig/configs/NfcPaymentScreenBadgeConfig;Lcom/ybsdk/rconfig/configs/NfcPaymentScreenBadgeConfig;Lcom/ybsdk/rconfig/configs/NfcPaymentScreenBadgeConfig;Lcom/ybsdk/rconfig/configs/NfcPaymentScreenBadgeConfig;Lcom/ybsdk/rconfig/configs/NfcPaymentScreenBadgeConfig;Lcom/ybsdk/rconfig/configs/NfcPaymentScreenBadgeConfig;)Lcom/ybsdk/rconfig/configs/NfcPaymentScreenBadgesConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/rconfig/configs/NfcPaymentScreenBadgeConfig;", "getWallet", "getSplit", "getCorpcard", "getPro", "getExternal", "getYellow", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NfcPaymentScreenBadgesConfig {

    @Json(name = "corp_card")
    private final NfcPaymentScreenBadgeConfig corpcard;

    @Json(name = "external")
    private final NfcPaymentScreenBadgeConfig external;

    @Json(name = "pro")
    private final NfcPaymentScreenBadgeConfig pro;

    @Json(name = "split")
    private final NfcPaymentScreenBadgeConfig split;

    @Json(name = "wallet")
    private final NfcPaymentScreenBadgeConfig wallet;

    @Json(name = "yellow")
    private final NfcPaymentScreenBadgeConfig yellow;

    public NfcPaymentScreenBadgesConfig(NfcPaymentScreenBadgeConfig nfcPaymentScreenBadgeConfig, NfcPaymentScreenBadgeConfig nfcPaymentScreenBadgeConfig2, NfcPaymentScreenBadgeConfig nfcPaymentScreenBadgeConfig3, NfcPaymentScreenBadgeConfig nfcPaymentScreenBadgeConfig4, NfcPaymentScreenBadgeConfig nfcPaymentScreenBadgeConfig5, NfcPaymentScreenBadgeConfig nfcPaymentScreenBadgeConfig6) {
        this.wallet = nfcPaymentScreenBadgeConfig;
        this.split = nfcPaymentScreenBadgeConfig2;
        this.corpcard = nfcPaymentScreenBadgeConfig3;
        this.pro = nfcPaymentScreenBadgeConfig4;
        this.external = nfcPaymentScreenBadgeConfig5;
        this.yellow = nfcPaymentScreenBadgeConfig6;
    }

    public static /* synthetic */ NfcPaymentScreenBadgesConfig copy$default(NfcPaymentScreenBadgesConfig nfcPaymentScreenBadgesConfig, NfcPaymentScreenBadgeConfig nfcPaymentScreenBadgeConfig, NfcPaymentScreenBadgeConfig nfcPaymentScreenBadgeConfig2, NfcPaymentScreenBadgeConfig nfcPaymentScreenBadgeConfig3, NfcPaymentScreenBadgeConfig nfcPaymentScreenBadgeConfig4, NfcPaymentScreenBadgeConfig nfcPaymentScreenBadgeConfig5, NfcPaymentScreenBadgeConfig nfcPaymentScreenBadgeConfig6, int i, Object obj) {
        if ((i & 1) != 0) {
            nfcPaymentScreenBadgeConfig = nfcPaymentScreenBadgesConfig.wallet;
        }
        if ((i & 2) != 0) {
            nfcPaymentScreenBadgeConfig2 = nfcPaymentScreenBadgesConfig.split;
        }
        if ((i & 4) != 0) {
            nfcPaymentScreenBadgeConfig3 = nfcPaymentScreenBadgesConfig.corpcard;
        }
        if ((i & 8) != 0) {
            nfcPaymentScreenBadgeConfig4 = nfcPaymentScreenBadgesConfig.pro;
        }
        if ((i & 16) != 0) {
            nfcPaymentScreenBadgeConfig5 = nfcPaymentScreenBadgesConfig.external;
        }
        if ((i & 32) != 0) {
            nfcPaymentScreenBadgeConfig6 = nfcPaymentScreenBadgesConfig.yellow;
        }
        NfcPaymentScreenBadgeConfig nfcPaymentScreenBadgeConfig7 = nfcPaymentScreenBadgeConfig5;
        NfcPaymentScreenBadgeConfig nfcPaymentScreenBadgeConfig8 = nfcPaymentScreenBadgeConfig6;
        return nfcPaymentScreenBadgesConfig.copy(nfcPaymentScreenBadgeConfig, nfcPaymentScreenBadgeConfig2, nfcPaymentScreenBadgeConfig3, nfcPaymentScreenBadgeConfig4, nfcPaymentScreenBadgeConfig7, nfcPaymentScreenBadgeConfig8);
    }

    /* renamed from: component1, reason: from getter */
    public final NfcPaymentScreenBadgeConfig getWallet() {
        return this.wallet;
    }

    /* renamed from: component2, reason: from getter */
    public final NfcPaymentScreenBadgeConfig getSplit() {
        return this.split;
    }

    /* renamed from: component3, reason: from getter */
    public final NfcPaymentScreenBadgeConfig getCorpcard() {
        return this.corpcard;
    }

    /* renamed from: component4, reason: from getter */
    public final NfcPaymentScreenBadgeConfig getPro() {
        return this.pro;
    }

    /* renamed from: component5, reason: from getter */
    public final NfcPaymentScreenBadgeConfig getExternal() {
        return this.external;
    }

    /* renamed from: component6, reason: from getter */
    public final NfcPaymentScreenBadgeConfig getYellow() {
        return this.yellow;
    }

    public final NfcPaymentScreenBadgesConfig copy(NfcPaymentScreenBadgeConfig wallet, NfcPaymentScreenBadgeConfig split, NfcPaymentScreenBadgeConfig corpcard, NfcPaymentScreenBadgeConfig pro, NfcPaymentScreenBadgeConfig external, NfcPaymentScreenBadgeConfig yellow) {
        return new NfcPaymentScreenBadgesConfig(wallet, split, corpcard, pro, external, yellow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcPaymentScreenBadgesConfig)) {
            return false;
        }
        NfcPaymentScreenBadgesConfig nfcPaymentScreenBadgesConfig = (NfcPaymentScreenBadgesConfig) other;
        return jl40.l(this.wallet, nfcPaymentScreenBadgesConfig.wallet) && jl40.l(this.split, nfcPaymentScreenBadgesConfig.split) && jl40.l(this.corpcard, nfcPaymentScreenBadgesConfig.corpcard) && jl40.l(this.pro, nfcPaymentScreenBadgesConfig.pro) && jl40.l(this.external, nfcPaymentScreenBadgesConfig.external) && jl40.l(this.yellow, nfcPaymentScreenBadgesConfig.yellow);
    }

    public final NfcPaymentScreenBadgeConfig getCorpcard() {
        return this.corpcard;
    }

    public final NfcPaymentScreenBadgeConfig getExternal() {
        return this.external;
    }

    public final NfcPaymentScreenBadgeConfig getPro() {
        return this.pro;
    }

    public final NfcPaymentScreenBadgeConfig getSplit() {
        return this.split;
    }

    public final NfcPaymentScreenBadgeConfig getWallet() {
        return this.wallet;
    }

    public final NfcPaymentScreenBadgeConfig getYellow() {
        return this.yellow;
    }

    public int hashCode() {
        NfcPaymentScreenBadgeConfig nfcPaymentScreenBadgeConfig = this.wallet;
        int hashCode = (nfcPaymentScreenBadgeConfig == null ? 0 : nfcPaymentScreenBadgeConfig.hashCode()) * 31;
        NfcPaymentScreenBadgeConfig nfcPaymentScreenBadgeConfig2 = this.split;
        int hashCode2 = (hashCode + (nfcPaymentScreenBadgeConfig2 == null ? 0 : nfcPaymentScreenBadgeConfig2.hashCode())) * 31;
        NfcPaymentScreenBadgeConfig nfcPaymentScreenBadgeConfig3 = this.corpcard;
        int hashCode3 = (hashCode2 + (nfcPaymentScreenBadgeConfig3 == null ? 0 : nfcPaymentScreenBadgeConfig3.hashCode())) * 31;
        NfcPaymentScreenBadgeConfig nfcPaymentScreenBadgeConfig4 = this.pro;
        int hashCode4 = (hashCode3 + (nfcPaymentScreenBadgeConfig4 == null ? 0 : nfcPaymentScreenBadgeConfig4.hashCode())) * 31;
        NfcPaymentScreenBadgeConfig nfcPaymentScreenBadgeConfig5 = this.external;
        int hashCode5 = (hashCode4 + (nfcPaymentScreenBadgeConfig5 == null ? 0 : nfcPaymentScreenBadgeConfig5.hashCode())) * 31;
        NfcPaymentScreenBadgeConfig nfcPaymentScreenBadgeConfig6 = this.yellow;
        return hashCode5 + (nfcPaymentScreenBadgeConfig6 != null ? nfcPaymentScreenBadgeConfig6.hashCode() : 0);
    }

    public String toString() {
        return "NfcPaymentScreenBadgesConfig(wallet=" + this.wallet + ", split=" + this.split + ", corpcard=" + this.corpcard + ", pro=" + this.pro + ", external=" + this.external + ", yellow=" + this.yellow + Extension.C_BRAKE;
    }
}
