package com.ybsdk.feature.autotopup.internal.domain.entities;

import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.PaymentMethodInfoDto;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.RegularAutotopupStatusEntity;
import defpackage.giq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/domain/entities/RegularAutotopupEntity;", "", "Lcom/ybsdk/feature/autotopup/internal/domain/entities/regular/RegularAutotopupStatusEntity;", ACSPConstants.STATUS, "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;", "paymentMethod", "Lgiq0;", "selectedOption", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/domain/entities/regular/RegularAutotopupStatusEntity;Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;Lgiq0;)V", "component1", "()Lcom/ybsdk/feature/autotopup/internal/domain/entities/regular/RegularAutotopupStatusEntity;", "component2", "()Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;", "component3", "()Lgiq0;", "copy", "(Lcom/ybsdk/feature/autotopup/internal/domain/entities/regular/RegularAutotopupStatusEntity;Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;Lgiq0;)Lcom/ybsdk/feature/autotopup/internal/domain/entities/RegularAutotopupEntity;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/autotopup/internal/domain/entities/regular/RegularAutotopupStatusEntity;", "getStatus", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;", "getPaymentMethod", "Lgiq0;", "getSelectedOption", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RegularAutotopupEntity {
    private final PaymentMethodInfoDto paymentMethod;
    private final giq0 selectedOption;
    private final RegularAutotopupStatusEntity status;

    public RegularAutotopupEntity(RegularAutotopupStatusEntity regularAutotopupStatusEntity, PaymentMethodInfoDto paymentMethodInfoDto, giq0 giq0Var) {
        this.status = regularAutotopupStatusEntity;
        this.paymentMethod = paymentMethodInfoDto;
        this.selectedOption = giq0Var;
    }

    public static /* synthetic */ RegularAutotopupEntity copy$default(RegularAutotopupEntity regularAutotopupEntity, RegularAutotopupStatusEntity regularAutotopupStatusEntity, PaymentMethodInfoDto paymentMethodInfoDto, giq0 giq0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            regularAutotopupStatusEntity = regularAutotopupEntity.status;
        }
        if ((i & 2) != 0) {
            paymentMethodInfoDto = regularAutotopupEntity.paymentMethod;
        }
        if ((i & 4) != 0) {
            giq0Var = regularAutotopupEntity.selectedOption;
        }
        return regularAutotopupEntity.copy(regularAutotopupStatusEntity, paymentMethodInfoDto, giq0Var);
    }

    /* renamed from: component1, reason: from getter */
    public final RegularAutotopupStatusEntity getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final PaymentMethodInfoDto getPaymentMethod() {
        return this.paymentMethod;
    }

    /* renamed from: component3, reason: from getter */
    public final giq0 getSelectedOption() {
        return this.selectedOption;
    }

    public final RegularAutotopupEntity copy(RegularAutotopupStatusEntity status, PaymentMethodInfoDto paymentMethod, giq0 selectedOption) {
        return new RegularAutotopupEntity(status, paymentMethod, selectedOption);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegularAutotopupEntity)) {
            return false;
        }
        RegularAutotopupEntity regularAutotopupEntity = (RegularAutotopupEntity) other;
        return this.status == regularAutotopupEntity.status && jl40.l(this.paymentMethod, regularAutotopupEntity.paymentMethod) && jl40.l(this.selectedOption, regularAutotopupEntity.selectedOption);
    }

    public final PaymentMethodInfoDto getPaymentMethod() {
        return this.paymentMethod;
    }

    public final giq0 getSelectedOption() {
        return this.selectedOption;
    }

    public final RegularAutotopupStatusEntity getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.selectedOption.hashCode() + ((this.paymentMethod.hashCode() + (this.status.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "RegularAutotopupEntity(status=" + this.status + ", paymentMethod=" + this.paymentMethod + ", selectedOption=" + this.selectedOption + Extension.C_BRAKE;
    }
}
