package com.yandex.plus.pay.api.model;

import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayGoogleBillingConfig;", "", "googleCountryCode", "", "isNativePaymentAllowed", "", "<init>", "(Ljava/lang/String;Z)V", "getGoogleCountryCode", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusPayGoogleBillingConfig {
    private final String googleCountryCode;
    private final boolean isNativePaymentAllowed;

    public PlusPayGoogleBillingConfig(String str, boolean z) {
        this.googleCountryCode = str;
        this.isNativePaymentAllowed = z;
    }

    public static /* synthetic */ PlusPayGoogleBillingConfig copy$default(PlusPayGoogleBillingConfig plusPayGoogleBillingConfig, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plusPayGoogleBillingConfig.googleCountryCode;
        }
        if ((i & 2) != 0) {
            z = plusPayGoogleBillingConfig.isNativePaymentAllowed;
        }
        return plusPayGoogleBillingConfig.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGoogleCountryCode() {
        return this.googleCountryCode;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsNativePaymentAllowed() {
        return this.isNativePaymentAllowed;
    }

    public final PlusPayGoogleBillingConfig copy(String googleCountryCode, boolean isNativePaymentAllowed) {
        return new PlusPayGoogleBillingConfig(googleCountryCode, isNativePaymentAllowed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusPayGoogleBillingConfig)) {
            return false;
        }
        PlusPayGoogleBillingConfig plusPayGoogleBillingConfig = (PlusPayGoogleBillingConfig) other;
        return jl40.l(this.googleCountryCode, plusPayGoogleBillingConfig.googleCountryCode) && this.isNativePaymentAllowed == plusPayGoogleBillingConfig.isNativePaymentAllowed;
    }

    public final String getGoogleCountryCode() {
        return this.googleCountryCode;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isNativePaymentAllowed) + (this.googleCountryCode.hashCode() * 31);
    }

    public final boolean isNativePaymentAllowed() {
        return this.isNativePaymentAllowed;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlusPayGoogleBillingConfig(googleCountryCode=");
        sb.append(this.googleCountryCode);
        sb.append(", isNativePaymentAllowed=");
        return unr0.u(sb, this.isNativePaymentAllowed, ')');
    }
}
