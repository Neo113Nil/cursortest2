package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b#\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcButtonBadgesConfig;", "", "Lcom/ybsdk/rconfig/configs/NfcButtonBadgeConfig;", "wallet", "split", "corpcard", "pro", "external", "yellow", "<init>", "(Lcom/ybsdk/rconfig/configs/NfcButtonBadgeConfig;Lcom/ybsdk/rconfig/configs/NfcButtonBadgeConfig;Lcom/ybsdk/rconfig/configs/NfcButtonBadgeConfig;Lcom/ybsdk/rconfig/configs/NfcButtonBadgeConfig;Lcom/ybsdk/rconfig/configs/NfcButtonBadgeConfig;Lcom/ybsdk/rconfig/configs/NfcButtonBadgeConfig;)V", "component1", "()Lcom/ybsdk/rconfig/configs/NfcButtonBadgeConfig;", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/ybsdk/rconfig/configs/NfcButtonBadgeConfig;Lcom/ybsdk/rconfig/configs/NfcButtonBadgeConfig;Lcom/ybsdk/rconfig/configs/NfcButtonBadgeConfig;Lcom/ybsdk/rconfig/configs/NfcButtonBadgeConfig;Lcom/ybsdk/rconfig/configs/NfcButtonBadgeConfig;Lcom/ybsdk/rconfig/configs/NfcButtonBadgeConfig;)Lcom/ybsdk/rconfig/configs/NfcButtonBadgesConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/rconfig/configs/NfcButtonBadgeConfig;", "getWallet", "getSplit", "getCorpcard", "getPro", "getExternal", "getYellow", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NfcButtonBadgesConfig {

    @Json(name = "corp_card")
    private final NfcButtonBadgeConfig corpcard;

    @Json(name = "external")
    private final NfcButtonBadgeConfig external;

    @Json(name = "pro")
    private final NfcButtonBadgeConfig pro;

    @Json(name = "split")
    private final NfcButtonBadgeConfig split;

    @Json(name = "wallet")
    private final NfcButtonBadgeConfig wallet;

    @Json(name = "yellow")
    private final NfcButtonBadgeConfig yellow;

    public NfcButtonBadgesConfig(NfcButtonBadgeConfig nfcButtonBadgeConfig, NfcButtonBadgeConfig nfcButtonBadgeConfig2, NfcButtonBadgeConfig nfcButtonBadgeConfig3, NfcButtonBadgeConfig nfcButtonBadgeConfig4, NfcButtonBadgeConfig nfcButtonBadgeConfig5, NfcButtonBadgeConfig nfcButtonBadgeConfig6) {
        this.wallet = nfcButtonBadgeConfig;
        this.split = nfcButtonBadgeConfig2;
        this.corpcard = nfcButtonBadgeConfig3;
        this.pro = nfcButtonBadgeConfig4;
        this.external = nfcButtonBadgeConfig5;
        this.yellow = nfcButtonBadgeConfig6;
    }

    public static /* synthetic */ NfcButtonBadgesConfig copy$default(NfcButtonBadgesConfig nfcButtonBadgesConfig, NfcButtonBadgeConfig nfcButtonBadgeConfig, NfcButtonBadgeConfig nfcButtonBadgeConfig2, NfcButtonBadgeConfig nfcButtonBadgeConfig3, NfcButtonBadgeConfig nfcButtonBadgeConfig4, NfcButtonBadgeConfig nfcButtonBadgeConfig5, NfcButtonBadgeConfig nfcButtonBadgeConfig6, int i, Object obj) {
        if ((i & 1) != 0) {
            nfcButtonBadgeConfig = nfcButtonBadgesConfig.wallet;
        }
        if ((i & 2) != 0) {
            nfcButtonBadgeConfig2 = nfcButtonBadgesConfig.split;
        }
        if ((i & 4) != 0) {
            nfcButtonBadgeConfig3 = nfcButtonBadgesConfig.corpcard;
        }
        if ((i & 8) != 0) {
            nfcButtonBadgeConfig4 = nfcButtonBadgesConfig.pro;
        }
        if ((i & 16) != 0) {
            nfcButtonBadgeConfig5 = nfcButtonBadgesConfig.external;
        }
        if ((i & 32) != 0) {
            nfcButtonBadgeConfig6 = nfcButtonBadgesConfig.yellow;
        }
        NfcButtonBadgeConfig nfcButtonBadgeConfig7 = nfcButtonBadgeConfig5;
        NfcButtonBadgeConfig nfcButtonBadgeConfig8 = nfcButtonBadgeConfig6;
        return nfcButtonBadgesConfig.copy(nfcButtonBadgeConfig, nfcButtonBadgeConfig2, nfcButtonBadgeConfig3, nfcButtonBadgeConfig4, nfcButtonBadgeConfig7, nfcButtonBadgeConfig8);
    }

    /* renamed from: component1, reason: from getter */
    public final NfcButtonBadgeConfig getWallet() {
        return this.wallet;
    }

    /* renamed from: component2, reason: from getter */
    public final NfcButtonBadgeConfig getSplit() {
        return this.split;
    }

    /* renamed from: component3, reason: from getter */
    public final NfcButtonBadgeConfig getCorpcard() {
        return this.corpcard;
    }

    /* renamed from: component4, reason: from getter */
    public final NfcButtonBadgeConfig getPro() {
        return this.pro;
    }

    /* renamed from: component5, reason: from getter */
    public final NfcButtonBadgeConfig getExternal() {
        return this.external;
    }

    /* renamed from: component6, reason: from getter */
    public final NfcButtonBadgeConfig getYellow() {
        return this.yellow;
    }

    public final NfcButtonBadgesConfig copy(NfcButtonBadgeConfig wallet, NfcButtonBadgeConfig split, NfcButtonBadgeConfig corpcard, NfcButtonBadgeConfig pro, NfcButtonBadgeConfig external, NfcButtonBadgeConfig yellow) {
        return new NfcButtonBadgesConfig(wallet, split, corpcard, pro, external, yellow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcButtonBadgesConfig)) {
            return false;
        }
        NfcButtonBadgesConfig nfcButtonBadgesConfig = (NfcButtonBadgesConfig) other;
        return jl40.l(this.wallet, nfcButtonBadgesConfig.wallet) && jl40.l(this.split, nfcButtonBadgesConfig.split) && jl40.l(this.corpcard, nfcButtonBadgesConfig.corpcard) && jl40.l(this.pro, nfcButtonBadgesConfig.pro) && jl40.l(this.external, nfcButtonBadgesConfig.external) && jl40.l(this.yellow, nfcButtonBadgesConfig.yellow);
    }

    public final NfcButtonBadgeConfig getCorpcard() {
        return this.corpcard;
    }

    public final NfcButtonBadgeConfig getExternal() {
        return this.external;
    }

    public final NfcButtonBadgeConfig getPro() {
        return this.pro;
    }

    public final NfcButtonBadgeConfig getSplit() {
        return this.split;
    }

    public final NfcButtonBadgeConfig getWallet() {
        return this.wallet;
    }

    public final NfcButtonBadgeConfig getYellow() {
        return this.yellow;
    }

    public int hashCode() {
        NfcButtonBadgeConfig nfcButtonBadgeConfig = this.wallet;
        int hashCode = (nfcButtonBadgeConfig == null ? 0 : nfcButtonBadgeConfig.hashCode()) * 31;
        NfcButtonBadgeConfig nfcButtonBadgeConfig2 = this.split;
        int hashCode2 = (hashCode + (nfcButtonBadgeConfig2 == null ? 0 : nfcButtonBadgeConfig2.hashCode())) * 31;
        NfcButtonBadgeConfig nfcButtonBadgeConfig3 = this.corpcard;
        int hashCode3 = (hashCode2 + (nfcButtonBadgeConfig3 == null ? 0 : nfcButtonBadgeConfig3.hashCode())) * 31;
        NfcButtonBadgeConfig nfcButtonBadgeConfig4 = this.pro;
        int hashCode4 = (hashCode3 + (nfcButtonBadgeConfig4 == null ? 0 : nfcButtonBadgeConfig4.hashCode())) * 31;
        NfcButtonBadgeConfig nfcButtonBadgeConfig5 = this.external;
        int hashCode5 = (hashCode4 + (nfcButtonBadgeConfig5 == null ? 0 : nfcButtonBadgeConfig5.hashCode())) * 31;
        NfcButtonBadgeConfig nfcButtonBadgeConfig6 = this.yellow;
        return hashCode5 + (nfcButtonBadgeConfig6 != null ? nfcButtonBadgeConfig6.hashCode() : 0);
    }

    public String toString() {
        return "NfcButtonBadgesConfig(wallet=" + this.wallet + ", split=" + this.split + ", corpcard=" + this.corpcard + ", pro=" + this.pro + ", external=" + this.external + ", yellow=" + this.yellow + Extension.C_BRAKE;
    }
}
