package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/ValidateAutoTopupSuccessData;", "", "autotopupErrors", "", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupValidationError;", "autofundErrors", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutofundValidationError;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getAutotopupErrors", "()Ljava/util/List;", "getAutofundErrors", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ValidateAutoTopupSuccessData {
    private final List<AutofundValidationError> autofundErrors;
    private final List<AutoTopupValidationError> autotopupErrors;

    public ValidateAutoTopupSuccessData(@Json(name = "autotopup_errors") List<AutoTopupValidationError> list, @Json(name = "autofund_errors") List<AutofundValidationError> list2) {
        this.autotopupErrors = list;
        this.autofundErrors = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ValidateAutoTopupSuccessData copy$default(ValidateAutoTopupSuccessData validateAutoTopupSuccessData, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = validateAutoTopupSuccessData.autotopupErrors;
        }
        if ((i & 2) != 0) {
            list2 = validateAutoTopupSuccessData.autofundErrors;
        }
        return validateAutoTopupSuccessData.copy(list, list2);
    }

    public final List<AutoTopupValidationError> component1() {
        return this.autotopupErrors;
    }

    public final List<AutofundValidationError> component2() {
        return this.autofundErrors;
    }

    public final ValidateAutoTopupSuccessData copy(@Json(name = "autotopup_errors") List<AutoTopupValidationError> autotopupErrors, @Json(name = "autofund_errors") List<AutofundValidationError> autofundErrors) {
        return new ValidateAutoTopupSuccessData(autotopupErrors, autofundErrors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidateAutoTopupSuccessData)) {
            return false;
        }
        ValidateAutoTopupSuccessData validateAutoTopupSuccessData = (ValidateAutoTopupSuccessData) other;
        return jl40.l(this.autotopupErrors, validateAutoTopupSuccessData.autotopupErrors) && jl40.l(this.autofundErrors, validateAutoTopupSuccessData.autofundErrors);
    }

    public final List<AutofundValidationError> getAutofundErrors() {
        return this.autofundErrors;
    }

    public final List<AutoTopupValidationError> getAutotopupErrors() {
        return this.autotopupErrors;
    }

    public int hashCode() {
        return this.autofundErrors.hashCode() + (this.autotopupErrors.hashCode() * 31);
    }

    public String toString() {
        return xvz.l("ValidateAutoTopupSuccessData(autotopupErrors=", this.autotopupErrors, ", autofundErrors=", this.autofundErrors, Extension.C_BRAKE);
    }
}
