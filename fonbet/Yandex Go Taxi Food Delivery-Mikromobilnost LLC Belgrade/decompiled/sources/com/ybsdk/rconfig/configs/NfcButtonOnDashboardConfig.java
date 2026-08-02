package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\"\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b#\u0010\f¨\u0006$"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcButtonOnDashboardConfig;", "", "", "wallet", "split", "corpcard", "pro", "external", "yellow", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/ybsdk/rconfig/configs/NfcButtonOnDashboardConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getWallet", "getSplit", "getCorpcard", "getPro", "getExternal", "getYellow", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NfcButtonOnDashboardConfig {

    @Json(name = "corp_card")
    private final Boolean corpcard;

    @Json(name = "external")
    private final Boolean external;

    @Json(name = "pro")
    private final Boolean pro;

    @Json(name = "split")
    private final Boolean split;

    @Json(name = "wallet")
    private final Boolean wallet;

    @Json(name = "yellow")
    private final Boolean yellow;

    public NfcButtonOnDashboardConfig(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        this.wallet = bool;
        this.split = bool2;
        this.corpcard = bool3;
        this.pro = bool4;
        this.external = bool5;
        this.yellow = bool6;
    }

    public static /* synthetic */ NfcButtonOnDashboardConfig copy$default(NfcButtonOnDashboardConfig nfcButtonOnDashboardConfig, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = nfcButtonOnDashboardConfig.wallet;
        }
        if ((i & 2) != 0) {
            bool2 = nfcButtonOnDashboardConfig.split;
        }
        if ((i & 4) != 0) {
            bool3 = nfcButtonOnDashboardConfig.corpcard;
        }
        if ((i & 8) != 0) {
            bool4 = nfcButtonOnDashboardConfig.pro;
        }
        if ((i & 16) != 0) {
            bool5 = nfcButtonOnDashboardConfig.external;
        }
        if ((i & 32) != 0) {
            bool6 = nfcButtonOnDashboardConfig.yellow;
        }
        Boolean bool7 = bool5;
        Boolean bool8 = bool6;
        return nfcButtonOnDashboardConfig.copy(bool, bool2, bool3, bool4, bool7, bool8);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getWallet() {
        return this.wallet;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getSplit() {
        return this.split;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getCorpcard() {
        return this.corpcard;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getPro() {
        return this.pro;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getExternal() {
        return this.external;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getYellow() {
        return this.yellow;
    }

    public final NfcButtonOnDashboardConfig copy(Boolean wallet, Boolean split, Boolean corpcard, Boolean pro, Boolean external, Boolean yellow) {
        return new NfcButtonOnDashboardConfig(wallet, split, corpcard, pro, external, yellow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcButtonOnDashboardConfig)) {
            return false;
        }
        NfcButtonOnDashboardConfig nfcButtonOnDashboardConfig = (NfcButtonOnDashboardConfig) other;
        return jl40.l(this.wallet, nfcButtonOnDashboardConfig.wallet) && jl40.l(this.split, nfcButtonOnDashboardConfig.split) && jl40.l(this.corpcard, nfcButtonOnDashboardConfig.corpcard) && jl40.l(this.pro, nfcButtonOnDashboardConfig.pro) && jl40.l(this.external, nfcButtonOnDashboardConfig.external) && jl40.l(this.yellow, nfcButtonOnDashboardConfig.yellow);
    }

    public final Boolean getCorpcard() {
        return this.corpcard;
    }

    public final Boolean getExternal() {
        return this.external;
    }

    public final Boolean getPro() {
        return this.pro;
    }

    public final Boolean getSplit() {
        return this.split;
    }

    public final Boolean getWallet() {
        return this.wallet;
    }

    public final Boolean getYellow() {
        return this.yellow;
    }

    public int hashCode() {
        Boolean bool = this.wallet;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.split;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.corpcard;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.pro;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.external;
        int hashCode5 = (hashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.yellow;
        return hashCode5 + (bool6 != null ? bool6.hashCode() : 0);
    }

    public String toString() {
        return "NfcButtonOnDashboardConfig(wallet=" + this.wallet + ", split=" + this.split + ", corpcard=" + this.corpcard + ", pro=" + this.pro + ", external=" + this.external + ", yellow=" + this.yellow + Extension.C_BRAKE;
    }
}
