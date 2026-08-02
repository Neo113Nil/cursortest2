package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentInfo;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentStatus;", "settings", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentSettings;", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentStatus;Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentSettings;)V", "getStatus", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentStatus;", "getSettings", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentSettings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupPaymentInfo {
    private final AutoTopupPaymentSettings settings;
    private final AutoTopupPaymentStatus status;

    public AutoTopupPaymentInfo(@Json(name = "status") AutoTopupPaymentStatus autoTopupPaymentStatus, @Json(name = "settings") AutoTopupPaymentSettings autoTopupPaymentSettings) {
        this.status = autoTopupPaymentStatus;
        this.settings = autoTopupPaymentSettings;
    }

    public static /* synthetic */ AutoTopupPaymentInfo copy$default(AutoTopupPaymentInfo autoTopupPaymentInfo, AutoTopupPaymentStatus autoTopupPaymentStatus, AutoTopupPaymentSettings autoTopupPaymentSettings, int i, Object obj) {
        if ((i & 1) != 0) {
            autoTopupPaymentStatus = autoTopupPaymentInfo.status;
        }
        if ((i & 2) != 0) {
            autoTopupPaymentSettings = autoTopupPaymentInfo.settings;
        }
        return autoTopupPaymentInfo.copy(autoTopupPaymentStatus, autoTopupPaymentSettings);
    }

    /* renamed from: component1, reason: from getter */
    public final AutoTopupPaymentStatus getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final AutoTopupPaymentSettings getSettings() {
        return this.settings;
    }

    public final AutoTopupPaymentInfo copy(@Json(name = "status") AutoTopupPaymentStatus status, @Json(name = "settings") AutoTopupPaymentSettings settings) {
        return new AutoTopupPaymentInfo(status, settings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupPaymentInfo)) {
            return false;
        }
        AutoTopupPaymentInfo autoTopupPaymentInfo = (AutoTopupPaymentInfo) other;
        return this.status == autoTopupPaymentInfo.status && jl40.l(this.settings, autoTopupPaymentInfo.settings);
    }

    public final AutoTopupPaymentSettings getSettings() {
        return this.settings;
    }

    public final AutoTopupPaymentStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.settings.hashCode() + (this.status.hashCode() * 31);
    }

    public String toString() {
        return "AutoTopupPaymentInfo(status=" + this.status + ", settings=" + this.settings + Extension.C_BRAKE;
    }
}
