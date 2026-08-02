package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcProductSkinsV3Config;", "", "Lcom/ybsdk/rconfig/configs/NfcProductSkinV3Config;", "wallet", "pro", "split", "corpcard", "<init>", "(Lcom/ybsdk/rconfig/configs/NfcProductSkinV3Config;Lcom/ybsdk/rconfig/configs/NfcProductSkinV3Config;Lcom/ybsdk/rconfig/configs/NfcProductSkinV3Config;Lcom/ybsdk/rconfig/configs/NfcProductSkinV3Config;)V", "component1", "()Lcom/ybsdk/rconfig/configs/NfcProductSkinV3Config;", "component2", "component3", "component4", "copy", "(Lcom/ybsdk/rconfig/configs/NfcProductSkinV3Config;Lcom/ybsdk/rconfig/configs/NfcProductSkinV3Config;Lcom/ybsdk/rconfig/configs/NfcProductSkinV3Config;Lcom/ybsdk/rconfig/configs/NfcProductSkinV3Config;)Lcom/ybsdk/rconfig/configs/NfcProductSkinsV3Config;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/rconfig/configs/NfcProductSkinV3Config;", "getWallet", "getPro", "getSplit", "getCorpcard", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NfcProductSkinsV3Config {

    @Json(name = "corp_card")
    private final NfcProductSkinV3Config corpcard;

    @Json(name = "pro")
    private final NfcProductSkinV3Config pro;

    @Json(name = "split")
    private final NfcProductSkinV3Config split;

    @Json(name = "wallet")
    private final NfcProductSkinV3Config wallet;

    public NfcProductSkinsV3Config(NfcProductSkinV3Config nfcProductSkinV3Config, NfcProductSkinV3Config nfcProductSkinV3Config2, NfcProductSkinV3Config nfcProductSkinV3Config3, NfcProductSkinV3Config nfcProductSkinV3Config4) {
        this.wallet = nfcProductSkinV3Config;
        this.pro = nfcProductSkinV3Config2;
        this.split = nfcProductSkinV3Config3;
        this.corpcard = nfcProductSkinV3Config4;
    }

    public static /* synthetic */ NfcProductSkinsV3Config copy$default(NfcProductSkinsV3Config nfcProductSkinsV3Config, NfcProductSkinV3Config nfcProductSkinV3Config, NfcProductSkinV3Config nfcProductSkinV3Config2, NfcProductSkinV3Config nfcProductSkinV3Config3, NfcProductSkinV3Config nfcProductSkinV3Config4, int i, Object obj) {
        if ((i & 1) != 0) {
            nfcProductSkinV3Config = nfcProductSkinsV3Config.wallet;
        }
        if ((i & 2) != 0) {
            nfcProductSkinV3Config2 = nfcProductSkinsV3Config.pro;
        }
        if ((i & 4) != 0) {
            nfcProductSkinV3Config3 = nfcProductSkinsV3Config.split;
        }
        if ((i & 8) != 0) {
            nfcProductSkinV3Config4 = nfcProductSkinsV3Config.corpcard;
        }
        return nfcProductSkinsV3Config.copy(nfcProductSkinV3Config, nfcProductSkinV3Config2, nfcProductSkinV3Config3, nfcProductSkinV3Config4);
    }

    /* renamed from: component1, reason: from getter */
    public final NfcProductSkinV3Config getWallet() {
        return this.wallet;
    }

    /* renamed from: component2, reason: from getter */
    public final NfcProductSkinV3Config getPro() {
        return this.pro;
    }

    /* renamed from: component3, reason: from getter */
    public final NfcProductSkinV3Config getSplit() {
        return this.split;
    }

    /* renamed from: component4, reason: from getter */
    public final NfcProductSkinV3Config getCorpcard() {
        return this.corpcard;
    }

    public final NfcProductSkinsV3Config copy(NfcProductSkinV3Config wallet, NfcProductSkinV3Config pro, NfcProductSkinV3Config split, NfcProductSkinV3Config corpcard) {
        return new NfcProductSkinsV3Config(wallet, pro, split, corpcard);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcProductSkinsV3Config)) {
            return false;
        }
        NfcProductSkinsV3Config nfcProductSkinsV3Config = (NfcProductSkinsV3Config) other;
        return jl40.l(this.wallet, nfcProductSkinsV3Config.wallet) && jl40.l(this.pro, nfcProductSkinsV3Config.pro) && jl40.l(this.split, nfcProductSkinsV3Config.split) && jl40.l(this.corpcard, nfcProductSkinsV3Config.corpcard);
    }

    public final NfcProductSkinV3Config getCorpcard() {
        return this.corpcard;
    }

    public final NfcProductSkinV3Config getPro() {
        return this.pro;
    }

    public final NfcProductSkinV3Config getSplit() {
        return this.split;
    }

    public final NfcProductSkinV3Config getWallet() {
        return this.wallet;
    }

    public int hashCode() {
        NfcProductSkinV3Config nfcProductSkinV3Config = this.wallet;
        int hashCode = (nfcProductSkinV3Config == null ? 0 : nfcProductSkinV3Config.hashCode()) * 31;
        NfcProductSkinV3Config nfcProductSkinV3Config2 = this.pro;
        int hashCode2 = (hashCode + (nfcProductSkinV3Config2 == null ? 0 : nfcProductSkinV3Config2.hashCode())) * 31;
        NfcProductSkinV3Config nfcProductSkinV3Config3 = this.split;
        int hashCode3 = (hashCode2 + (nfcProductSkinV3Config3 == null ? 0 : nfcProductSkinV3Config3.hashCode())) * 31;
        NfcProductSkinV3Config nfcProductSkinV3Config4 = this.corpcard;
        return hashCode3 + (nfcProductSkinV3Config4 != null ? nfcProductSkinV3Config4.hashCode() : 0);
    }

    public String toString() {
        return "NfcProductSkinsV3Config(wallet=" + this.wallet + ", pro=" + this.pro + ", split=" + this.split + ", corpcard=" + this.corpcard + Extension.C_BRAKE;
    }
}
