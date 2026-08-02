package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.jl40;
import java.math.BigDecimal;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundDto;", "", BackendConfig.Restrictions.ENABLED, "", "fundAmountLimit", "Ljava/math/BigDecimal;", "<init>", "(ZLjava/math/BigDecimal;)V", "getEnabled", "()Z", "getFundAmountLimit", "()Ljava/math/BigDecimal;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoFundDto {
    private final boolean enabled;
    private final BigDecimal fundAmountLimit;

    public AutoFundDto(@Json(name = "enabled") boolean z, @Json(name = "fundAmountLimit") BigDecimal bigDecimal) {
        this.enabled = z;
        this.fundAmountLimit = bigDecimal;
    }

    public static /* synthetic */ AutoFundDto copy$default(AutoFundDto autoFundDto, boolean z, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            z = autoFundDto.enabled;
        }
        if ((i & 2) != 0) {
            bigDecimal = autoFundDto.fundAmountLimit;
        }
        return autoFundDto.copy(z, bigDecimal);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getFundAmountLimit() {
        return this.fundAmountLimit;
    }

    public final AutoFundDto copy(@Json(name = "enabled") boolean enabled, @Json(name = "fundAmountLimit") BigDecimal fundAmountLimit) {
        return new AutoFundDto(enabled, fundAmountLimit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoFundDto)) {
            return false;
        }
        AutoFundDto autoFundDto = (AutoFundDto) other;
        return this.enabled == autoFundDto.enabled && jl40.l(this.fundAmountLimit, autoFundDto.fundAmountLimit);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final BigDecimal getFundAmountLimit() {
        return this.fundAmountLimit;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.enabled) * 31;
        BigDecimal bigDecimal = this.fundAmountLimit;
        return hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }

    public String toString() {
        return "AutoFundDto(enabled=" + this.enabled + ", fundAmountLimit=" + this.fundAmountLimit + Extension.C_BRAKE;
    }
}
