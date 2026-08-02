package com.ybsdk.network.dto.simplifiedid;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdApplicationFormRequest;", "", "applicationId", "", "form", "Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdApplicationForm;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdApplicationForm;)V", "getApplicationId", "()Ljava/lang/String;", "getForm", "()Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdApplicationForm;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SimplifiedIdApplicationFormRequest {
    private final String applicationId;
    private final SimplifiedIdApplicationForm form;

    public SimplifiedIdApplicationFormRequest(@Json(name = "application_id") String str, @Json(name = "form") SimplifiedIdApplicationForm simplifiedIdApplicationForm) {
        this.applicationId = str;
        this.form = simplifiedIdApplicationForm;
    }

    public static /* synthetic */ SimplifiedIdApplicationFormRequest copy$default(SimplifiedIdApplicationFormRequest simplifiedIdApplicationFormRequest, String str, SimplifiedIdApplicationForm simplifiedIdApplicationForm, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simplifiedIdApplicationFormRequest.applicationId;
        }
        if ((i & 2) != 0) {
            simplifiedIdApplicationForm = simplifiedIdApplicationFormRequest.form;
        }
        return simplifiedIdApplicationFormRequest.copy(str, simplifiedIdApplicationForm);
    }

    /* renamed from: component1, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component2, reason: from getter */
    public final SimplifiedIdApplicationForm getForm() {
        return this.form;
    }

    public final SimplifiedIdApplicationFormRequest copy(@Json(name = "application_id") String applicationId, @Json(name = "form") SimplifiedIdApplicationForm form) {
        return new SimplifiedIdApplicationFormRequest(applicationId, form);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimplifiedIdApplicationFormRequest)) {
            return false;
        }
        SimplifiedIdApplicationFormRequest simplifiedIdApplicationFormRequest = (SimplifiedIdApplicationFormRequest) other;
        return jl40.l(this.applicationId, simplifiedIdApplicationFormRequest.applicationId) && jl40.l(this.form, simplifiedIdApplicationFormRequest.form);
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final SimplifiedIdApplicationForm getForm() {
        return this.form;
    }

    public int hashCode() {
        return this.form.hashCode() + (this.applicationId.hashCode() * 31);
    }

    public String toString() {
        return "SimplifiedIdApplicationFormRequest(applicationId=" + this.applicationId + ", form=" + this.form + Extension.C_BRAKE;
    }
}
