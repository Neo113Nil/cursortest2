package com.ybsdk.feature.main.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/SbpAccountsYbsSuccessDataDto;", "", "ybs", "", "Lcom/ybsdk/feature/main/internal/data/network/dto/SbpYbsDto;", "bindAccountSheet", "Lcom/ybsdk/feature/main/internal/data/network/dto/BindAccountSheetDto;", "<init>", "(Ljava/util/List;Lcom/ybsdk/feature/main/internal/data/network/dto/BindAccountSheetDto;)V", "getYbs", "()Ljava/util/List;", "getBindAccountSheet", "()Lcom/ybsdk/feature/main/internal/data/network/dto/BindAccountSheetDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SbpAccountsYbsSuccessDataDto {
    private final BindAccountSheetDto bindAccountSheet;
    private final List<SbpYbsDto> ybs;

    public SbpAccountsYbsSuccessDataDto(@Json(name = "JSON_FIELD_MEMBERS") List<SbpYbsDto> list, @Json(name = "bind_account_sheet") BindAccountSheetDto bindAccountSheetDto) {
        this.ybs = list;
        this.bindAccountSheet = bindAccountSheetDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SbpAccountsYbsSuccessDataDto copy$default(SbpAccountsYbsSuccessDataDto sbpAccountsYbsSuccessDataDto, List list, BindAccountSheetDto bindAccountSheetDto, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sbpAccountsYbsSuccessDataDto.ybs;
        }
        if ((i & 2) != 0) {
            bindAccountSheetDto = sbpAccountsYbsSuccessDataDto.bindAccountSheet;
        }
        return sbpAccountsYbsSuccessDataDto.copy(list, bindAccountSheetDto);
    }

    public final List<SbpYbsDto> component1() {
        return this.ybs;
    }

    /* renamed from: component2, reason: from getter */
    public final BindAccountSheetDto getBindAccountSheet() {
        return this.bindAccountSheet;
    }

    public final SbpAccountsYbsSuccessDataDto copy(@Json(name = "JSON_FIELD_MEMBERS") List<SbpYbsDto> ybs, @Json(name = "bind_account_sheet") BindAccountSheetDto bindAccountSheet) {
        return new SbpAccountsYbsSuccessDataDto(ybs, bindAccountSheet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SbpAccountsYbsSuccessDataDto)) {
            return false;
        }
        SbpAccountsYbsSuccessDataDto sbpAccountsYbsSuccessDataDto = (SbpAccountsYbsSuccessDataDto) other;
        return jl40.l(this.ybs, sbpAccountsYbsSuccessDataDto.ybs) && jl40.l(this.bindAccountSheet, sbpAccountsYbsSuccessDataDto.bindAccountSheet);
    }

    public final BindAccountSheetDto getBindAccountSheet() {
        return this.bindAccountSheet;
    }

    public final List<SbpYbsDto> getYbs() {
        return this.ybs;
    }

    public int hashCode() {
        return this.bindAccountSheet.hashCode() + (this.ybs.hashCode() * 31);
    }

    public String toString() {
        return "SbpAccountsYbsSuccessDataDto(ybs=" + this.ybs + ", bindAccountSheet=" + this.bindAccountSheet + Extension.C_BRAKE;
    }
}
