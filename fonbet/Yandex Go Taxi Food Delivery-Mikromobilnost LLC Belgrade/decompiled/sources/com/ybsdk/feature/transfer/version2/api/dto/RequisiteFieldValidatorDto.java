package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;", "", "input", "", "Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorRegexDto;", "unfocus", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getInput", "()Ljava/util/List;", "getUnfocus", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequisiteFieldValidatorDto {
    private final List<RequisiteFieldValidatorRegexDto> input;
    private final List<RequisiteFieldValidatorRegexDto> unfocus;

    public RequisiteFieldValidatorDto(@Json(name = "input") List<RequisiteFieldValidatorRegexDto> list, @Json(name = "unfocus") List<RequisiteFieldValidatorRegexDto> list2) {
        this.input = list;
        this.unfocus = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RequisiteFieldValidatorDto copy$default(RequisiteFieldValidatorDto requisiteFieldValidatorDto, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = requisiteFieldValidatorDto.input;
        }
        if ((i & 2) != 0) {
            list2 = requisiteFieldValidatorDto.unfocus;
        }
        return requisiteFieldValidatorDto.copy(list, list2);
    }

    public final List<RequisiteFieldValidatorRegexDto> component1() {
        return this.input;
    }

    public final List<RequisiteFieldValidatorRegexDto> component2() {
        return this.unfocus;
    }

    public final RequisiteFieldValidatorDto copy(@Json(name = "input") List<RequisiteFieldValidatorRegexDto> input, @Json(name = "unfocus") List<RequisiteFieldValidatorRegexDto> unfocus) {
        return new RequisiteFieldValidatorDto(input, unfocus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequisiteFieldValidatorDto)) {
            return false;
        }
        RequisiteFieldValidatorDto requisiteFieldValidatorDto = (RequisiteFieldValidatorDto) other;
        return jl40.l(this.input, requisiteFieldValidatorDto.input) && jl40.l(this.unfocus, requisiteFieldValidatorDto.unfocus);
    }

    public final List<RequisiteFieldValidatorRegexDto> getInput() {
        return this.input;
    }

    public final List<RequisiteFieldValidatorRegexDto> getUnfocus() {
        return this.unfocus;
    }

    public int hashCode() {
        return this.unfocus.hashCode() + (this.input.hashCode() * 31);
    }

    public String toString() {
        return xvz.l("RequisiteFieldValidatorDto(input=", this.input, ", unfocus=", this.unfocus, Extension.C_BRAKE);
    }
}
