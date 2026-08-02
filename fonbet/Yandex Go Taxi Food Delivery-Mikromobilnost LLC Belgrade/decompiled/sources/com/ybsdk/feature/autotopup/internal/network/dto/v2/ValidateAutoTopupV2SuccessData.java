package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/ValidateAutoTopupV2SuccessData;", "", "errors", "", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2MoneyType;", "snackbar", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/SnackbarDto;", "<init>", "(Ljava/util/List;Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/SnackbarDto;)V", "getErrors", "()Ljava/util/List;", "getSnackbar", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/SnackbarDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ValidateAutoTopupV2SuccessData {
    private final List<AutoTopupSettingsV2MoneyType> errors;
    private final SnackbarDto snackbar;

    /* JADX WARN: Multi-variable type inference failed */
    public ValidateAutoTopupV2SuccessData(@Json(name = "errors") List<? extends AutoTopupSettingsV2MoneyType> list, @Json(name = "snackbar") SnackbarDto snackbarDto) {
        this.errors = list;
        this.snackbar = snackbarDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ValidateAutoTopupV2SuccessData copy$default(ValidateAutoTopupV2SuccessData validateAutoTopupV2SuccessData, List list, SnackbarDto snackbarDto, int i, Object obj) {
        if ((i & 1) != 0) {
            list = validateAutoTopupV2SuccessData.errors;
        }
        if ((i & 2) != 0) {
            snackbarDto = validateAutoTopupV2SuccessData.snackbar;
        }
        return validateAutoTopupV2SuccessData.copy(list, snackbarDto);
    }

    public final List<AutoTopupSettingsV2MoneyType> component1() {
        return this.errors;
    }

    /* renamed from: component2, reason: from getter */
    public final SnackbarDto getSnackbar() {
        return this.snackbar;
    }

    public final ValidateAutoTopupV2SuccessData copy(@Json(name = "errors") List<? extends AutoTopupSettingsV2MoneyType> errors, @Json(name = "snackbar") SnackbarDto snackbar) {
        return new ValidateAutoTopupV2SuccessData(errors, snackbar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidateAutoTopupV2SuccessData)) {
            return false;
        }
        ValidateAutoTopupV2SuccessData validateAutoTopupV2SuccessData = (ValidateAutoTopupV2SuccessData) other;
        return jl40.l(this.errors, validateAutoTopupV2SuccessData.errors) && jl40.l(this.snackbar, validateAutoTopupV2SuccessData.snackbar);
    }

    public final List<AutoTopupSettingsV2MoneyType> getErrors() {
        return this.errors;
    }

    public final SnackbarDto getSnackbar() {
        return this.snackbar;
    }

    public int hashCode() {
        int hashCode = this.errors.hashCode() * 31;
        SnackbarDto snackbarDto = this.snackbar;
        return hashCode + (snackbarDto == null ? 0 : snackbarDto.hashCode());
    }

    public String toString() {
        return "ValidateAutoTopupV2SuccessData(errors=" + this.errors + ", snackbar=" + this.snackbar + Extension.C_BRAKE;
    }
}
