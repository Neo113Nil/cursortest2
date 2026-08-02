package com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.feature.transfer.version2.internal.data.dto.FormFieldValidationDto;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetUinSearchFieldDto;", "", "header", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetHeaderDto;", "hint", "", "placeholder", "validation", "Lcom/ybsdk/feature/transfer/version2/internal/data/dto/FormFieldValidationDto;", "button", "Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "<init>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetHeaderDto;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/data/dto/FormFieldValidationDto;Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;)V", "getHeader", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/BudgetHeaderDto;", "getHint", "()Ljava/lang/String;", "getPlaceholder", "getValidation", "()Lcom/ybsdk/feature/transfer/version2/internal/data/dto/FormFieldValidationDto;", "getButton", "()Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BudgetUinSearchFieldDto {
    private final ActionButtonDto button;
    private final BudgetHeaderDto header;
    private final String hint;
    private final String placeholder;
    private final FormFieldValidationDto validation;

    public BudgetUinSearchFieldDto(@Json(name = "screen_header") BudgetHeaderDto budgetHeaderDto, @Json(name = "hint") String str, @Json(name = "placeholder") String str2, @Json(name = "validation") FormFieldValidationDto formFieldValidationDto, @Json(name = "button") ActionButtonDto actionButtonDto) {
        this.header = budgetHeaderDto;
        this.hint = str;
        this.placeholder = str2;
        this.validation = formFieldValidationDto;
        this.button = actionButtonDto;
    }

    public static /* synthetic */ BudgetUinSearchFieldDto copy$default(BudgetUinSearchFieldDto budgetUinSearchFieldDto, BudgetHeaderDto budgetHeaderDto, String str, String str2, FormFieldValidationDto formFieldValidationDto, ActionButtonDto actionButtonDto, int i, Object obj) {
        if ((i & 1) != 0) {
            budgetHeaderDto = budgetUinSearchFieldDto.header;
        }
        if ((i & 2) != 0) {
            str = budgetUinSearchFieldDto.hint;
        }
        if ((i & 4) != 0) {
            str2 = budgetUinSearchFieldDto.placeholder;
        }
        if ((i & 8) != 0) {
            formFieldValidationDto = budgetUinSearchFieldDto.validation;
        }
        if ((i & 16) != 0) {
            actionButtonDto = budgetUinSearchFieldDto.button;
        }
        ActionButtonDto actionButtonDto2 = actionButtonDto;
        String str3 = str2;
        return budgetUinSearchFieldDto.copy(budgetHeaderDto, str, str3, formFieldValidationDto, actionButtonDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final BudgetHeaderDto getHeader() {
        return this.header;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component4, reason: from getter */
    public final FormFieldValidationDto getValidation() {
        return this.validation;
    }

    /* renamed from: component5, reason: from getter */
    public final ActionButtonDto getButton() {
        return this.button;
    }

    public final BudgetUinSearchFieldDto copy(@Json(name = "screen_header") BudgetHeaderDto header, @Json(name = "hint") String hint, @Json(name = "placeholder") String placeholder, @Json(name = "validation") FormFieldValidationDto validation, @Json(name = "button") ActionButtonDto button) {
        return new BudgetUinSearchFieldDto(header, hint, placeholder, validation, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BudgetUinSearchFieldDto)) {
            return false;
        }
        BudgetUinSearchFieldDto budgetUinSearchFieldDto = (BudgetUinSearchFieldDto) other;
        return jl40.l(this.header, budgetUinSearchFieldDto.header) && jl40.l(this.hint, budgetUinSearchFieldDto.hint) && jl40.l(this.placeholder, budgetUinSearchFieldDto.placeholder) && jl40.l(this.validation, budgetUinSearchFieldDto.validation) && jl40.l(this.button, budgetUinSearchFieldDto.button);
    }

    public final ActionButtonDto getButton() {
        return this.button;
    }

    public final BudgetHeaderDto getHeader() {
        return this.header;
    }

    public final String getHint() {
        return this.hint;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final FormFieldValidationDto getValidation() {
        return this.validation;
    }

    public int hashCode() {
        return this.button.hashCode() + ((this.validation.hashCode() + unr0.b(unr0.b(this.header.hashCode() * 31, 31, this.hint), 31, this.placeholder)) * 31);
    }

    public String toString() {
        return "BudgetUinSearchFieldDto(header=" + this.header + ", hint=" + this.hint + ", placeholder=" + this.placeholder + ", validation=" + this.validation + ", button=" + this.button + Extension.C_BRAKE;
    }
}
