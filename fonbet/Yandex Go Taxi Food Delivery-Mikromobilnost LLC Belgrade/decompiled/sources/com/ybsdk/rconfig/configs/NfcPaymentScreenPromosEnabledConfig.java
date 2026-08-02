package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.qv10;
import defpackage.smw0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcPaymentScreenPromosEnabledConfig;", "", "", "wallet", "split", "corpcard", "pro", "<init>", "(ZZZZ)V", "component1", "()Z", "component2", "component3", "component4", "copy", "(ZZZZ)Lcom/ybsdk/rconfig/configs/NfcPaymentScreenPromosEnabledConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getWallet", "getSplit", "getCorpcard", "getPro", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NfcPaymentScreenPromosEnabledConfig {

    @Json(name = "corp_card")
    private final boolean corpcard;

    @Json(name = "pro")
    private final boolean pro;

    @Json(name = "split")
    private final boolean split;

    @Json(name = "wallet")
    private final boolean wallet;

    public NfcPaymentScreenPromosEnabledConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.wallet = z;
        this.split = z2;
        this.corpcard = z3;
        this.pro = z4;
    }

    public static /* synthetic */ NfcPaymentScreenPromosEnabledConfig copy$default(NfcPaymentScreenPromosEnabledConfig nfcPaymentScreenPromosEnabledConfig, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = nfcPaymentScreenPromosEnabledConfig.wallet;
        }
        if ((i & 2) != 0) {
            z2 = nfcPaymentScreenPromosEnabledConfig.split;
        }
        if ((i & 4) != 0) {
            z3 = nfcPaymentScreenPromosEnabledConfig.corpcard;
        }
        if ((i & 8) != 0) {
            z4 = nfcPaymentScreenPromosEnabledConfig.pro;
        }
        return nfcPaymentScreenPromosEnabledConfig.copy(z, z2, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getWallet() {
        return this.wallet;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSplit() {
        return this.split;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCorpcard() {
        return this.corpcard;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getPro() {
        return this.pro;
    }

    public final NfcPaymentScreenPromosEnabledConfig copy(boolean wallet, boolean split, boolean corpcard, boolean pro) {
        return new NfcPaymentScreenPromosEnabledConfig(wallet, split, corpcard, pro);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcPaymentScreenPromosEnabledConfig)) {
            return false;
        }
        NfcPaymentScreenPromosEnabledConfig nfcPaymentScreenPromosEnabledConfig = (NfcPaymentScreenPromosEnabledConfig) other;
        return this.wallet == nfcPaymentScreenPromosEnabledConfig.wallet && this.split == nfcPaymentScreenPromosEnabledConfig.split && this.corpcard == nfcPaymentScreenPromosEnabledConfig.corpcard && this.pro == nfcPaymentScreenPromosEnabledConfig.pro;
    }

    public final boolean getCorpcard() {
        return this.corpcard;
    }

    public final boolean getPro() {
        return this.pro;
    }

    public final boolean getSplit() {
        return this.split;
    }

    public final boolean getWallet() {
        return this.wallet;
    }

    public int hashCode() {
        return Boolean.hashCode(this.pro) + unr0.e(unr0.e(Boolean.hashCode(this.wallet) * 31, 31, this.split), 31, this.corpcard);
    }

    public String toString() {
        boolean z = this.wallet;
        boolean z2 = this.split;
        return smw0.k(", pro=", Extension.C_BRAKE, qv10.u("NfcPaymentScreenPromosEnabledConfig(wallet=", ", split=", ", corpcard=", z, z2), this.corpcard, this.pro);
    }
}
