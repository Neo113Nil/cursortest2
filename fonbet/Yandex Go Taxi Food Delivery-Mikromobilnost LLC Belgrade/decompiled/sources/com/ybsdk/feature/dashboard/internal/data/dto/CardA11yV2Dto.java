package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.cache.DataEntryDescriptorDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/CardA11yV2Dto;", "", "balance", "Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDescriptorDto;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDescriptorDto;)V", "getBalance", "()Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDescriptorDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardA11yV2Dto {
    private final DataEntryDescriptorDto balance;

    public CardA11yV2Dto(@Json(name = "balance") DataEntryDescriptorDto dataEntryDescriptorDto) {
        this.balance = dataEntryDescriptorDto;
    }

    public static /* synthetic */ CardA11yV2Dto copy$default(CardA11yV2Dto cardA11yV2Dto, DataEntryDescriptorDto dataEntryDescriptorDto, int i, Object obj) {
        if ((i & 1) != 0) {
            dataEntryDescriptorDto = cardA11yV2Dto.balance;
        }
        return cardA11yV2Dto.copy(dataEntryDescriptorDto);
    }

    /* renamed from: component1, reason: from getter */
    public final DataEntryDescriptorDto getBalance() {
        return this.balance;
    }

    public final CardA11yV2Dto copy(@Json(name = "balance") DataEntryDescriptorDto balance) {
        return new CardA11yV2Dto(balance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CardA11yV2Dto) && jl40.l(this.balance, ((CardA11yV2Dto) other).balance);
    }

    public final DataEntryDescriptorDto getBalance() {
        return this.balance;
    }

    public int hashCode() {
        DataEntryDescriptorDto dataEntryDescriptorDto = this.balance;
        if (dataEntryDescriptorDto == null) {
            return 0;
        }
        return dataEntryDescriptorDto.hashCode();
    }

    public String toString() {
        return "CardA11yV2Dto(balance=" + this.balance + Extension.C_BRAKE;
    }
}
