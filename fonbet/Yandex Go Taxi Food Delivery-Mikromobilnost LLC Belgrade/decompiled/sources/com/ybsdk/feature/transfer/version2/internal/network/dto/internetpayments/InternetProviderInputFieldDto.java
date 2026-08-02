package com.ybsdk.feature.transfer.version2.internal.network.dto.internetpayments;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.transfer.version2.internal.data.dto.FormFieldValidationDto;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/internetpayments/InternetProviderInputFieldDto;", "", "label", "", "fieldValidation", "Lcom/ybsdk/feature/transfer/version2/internal/data/dto/FormFieldValidationDto;", "comment", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/data/dto/FormFieldValidationDto;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getFieldValidation", "()Lcom/ybsdk/feature/transfer/version2/internal/data/dto/FormFieldValidationDto;", "getComment", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InternetProviderInputFieldDto {
    private final String comment;
    private final FormFieldValidationDto fieldValidation;
    private final String label;

    public InternetProviderInputFieldDto(@Json(name = "label") String str, @Json(name = "field_validation") FormFieldValidationDto formFieldValidationDto, @Json(name = "comment") String str2) {
        this.label = str;
        this.fieldValidation = formFieldValidationDto;
        this.comment = str2;
    }

    public static /* synthetic */ InternetProviderInputFieldDto copy$default(InternetProviderInputFieldDto internetProviderInputFieldDto, String str, FormFieldValidationDto formFieldValidationDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = internetProviderInputFieldDto.label;
        }
        if ((i & 2) != 0) {
            formFieldValidationDto = internetProviderInputFieldDto.fieldValidation;
        }
        if ((i & 4) != 0) {
            str2 = internetProviderInputFieldDto.comment;
        }
        return internetProviderInputFieldDto.copy(str, formFieldValidationDto, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final FormFieldValidationDto getFieldValidation() {
        return this.fieldValidation;
    }

    /* renamed from: component3, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    public final InternetProviderInputFieldDto copy(@Json(name = "label") String label, @Json(name = "field_validation") FormFieldValidationDto fieldValidation, @Json(name = "comment") String comment) {
        return new InternetProviderInputFieldDto(label, fieldValidation, comment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternetProviderInputFieldDto)) {
            return false;
        }
        InternetProviderInputFieldDto internetProviderInputFieldDto = (InternetProviderInputFieldDto) other;
        return jl40.l(this.label, internetProviderInputFieldDto.label) && jl40.l(this.fieldValidation, internetProviderInputFieldDto.fieldValidation) && jl40.l(this.comment, internetProviderInputFieldDto.comment);
    }

    public final String getComment() {
        return this.comment;
    }

    public final FormFieldValidationDto getFieldValidation() {
        return this.fieldValidation;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        String str = this.label;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        FormFieldValidationDto formFieldValidationDto = this.fieldValidation;
        int hashCode2 = (hashCode + (formFieldValidationDto == null ? 0 : formFieldValidationDto.hashCode())) * 31;
        String str2 = this.comment;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.label;
        FormFieldValidationDto formFieldValidationDto = this.fieldValidation;
        String str2 = this.comment;
        StringBuilder sb = new StringBuilder("InternetProviderInputFieldDto(label=");
        sb.append(str);
        sb.append(", fieldValidation=");
        sb.append(formFieldValidationDto);
        sb.append(", comment=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
