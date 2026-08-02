package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Prefill;", "", "autofund", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoFundPrefill;", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoFundPrefill;)V", "getAutofund", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoFundPrefill;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupSettingsV2Prefill {
    private final AutoFundPrefill autofund;

    public /* synthetic */ AutoTopupSettingsV2Prefill(AutoFundPrefill autoFundPrefill, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : autoFundPrefill);
    }

    public static /* synthetic */ AutoTopupSettingsV2Prefill copy$default(AutoTopupSettingsV2Prefill autoTopupSettingsV2Prefill, AutoFundPrefill autoFundPrefill, int i, Object obj) {
        if ((i & 1) != 0) {
            autoFundPrefill = autoTopupSettingsV2Prefill.autofund;
        }
        return autoTopupSettingsV2Prefill.copy(autoFundPrefill);
    }

    /* renamed from: component1, reason: from getter */
    public final AutoFundPrefill getAutofund() {
        return this.autofund;
    }

    public final AutoTopupSettingsV2Prefill copy(@Json(name = "autofund") AutoFundPrefill autofund) {
        return new AutoTopupSettingsV2Prefill(autofund);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AutoTopupSettingsV2Prefill) && jl40.l(this.autofund, ((AutoTopupSettingsV2Prefill) other).autofund);
    }

    public final AutoFundPrefill getAutofund() {
        return this.autofund;
    }

    public int hashCode() {
        AutoFundPrefill autoFundPrefill = this.autofund;
        if (autoFundPrefill == null) {
            return 0;
        }
        return autoFundPrefill.hashCode();
    }

    public String toString() {
        return "AutoTopupSettingsV2Prefill(autofund=" + this.autofund + Extension.C_BRAKE;
    }

    public AutoTopupSettingsV2Prefill(@Json(name = "autofund") AutoFundPrefill autoFundPrefill) {
        this.autofund = autoFundPrefill;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutoTopupSettingsV2Prefill() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
