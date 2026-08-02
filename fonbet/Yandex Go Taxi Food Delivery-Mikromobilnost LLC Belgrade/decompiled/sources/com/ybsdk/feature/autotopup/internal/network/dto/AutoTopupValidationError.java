package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupValidationError;", "", "title", "", Constants.KEY_MESSAGE, "field", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupSettingFieldTypeDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupSettingFieldTypeDto;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getField", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupSettingFieldTypeDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupValidationError {
    private final AutoTopupSettingFieldTypeDto field;
    private final String message;
    private final String title;

    public AutoTopupValidationError(@Json(name = "title") String str, @Json(name = "message") String str2, @Json(name = "field") AutoTopupSettingFieldTypeDto autoTopupSettingFieldTypeDto) {
        this.title = str;
        this.message = str2;
        this.field = autoTopupSettingFieldTypeDto;
    }

    public static /* synthetic */ AutoTopupValidationError copy$default(AutoTopupValidationError autoTopupValidationError, String str, String str2, AutoTopupSettingFieldTypeDto autoTopupSettingFieldTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autoTopupValidationError.title;
        }
        if ((i & 2) != 0) {
            str2 = autoTopupValidationError.message;
        }
        if ((i & 4) != 0) {
            autoTopupSettingFieldTypeDto = autoTopupValidationError.field;
        }
        return autoTopupValidationError.copy(str, str2, autoTopupSettingFieldTypeDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final AutoTopupSettingFieldTypeDto getField() {
        return this.field;
    }

    public final AutoTopupValidationError copy(@Json(name = "title") String title, @Json(name = "message") String message, @Json(name = "field") AutoTopupSettingFieldTypeDto field) {
        return new AutoTopupValidationError(title, message, field);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupValidationError)) {
            return false;
        }
        AutoTopupValidationError autoTopupValidationError = (AutoTopupValidationError) other;
        return jl40.l(this.title, autoTopupValidationError.title) && jl40.l(this.message, autoTopupValidationError.message) && this.field == autoTopupValidationError.field;
    }

    public final AutoTopupSettingFieldTypeDto getField() {
        return this.field;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        return this.field.hashCode() + unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.message);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.message;
        AutoTopupSettingFieldTypeDto autoTopupSettingFieldTypeDto = this.field;
        StringBuilder v = b64.v("AutoTopupValidationError(title=", str, ", message=", str2, ", field=");
        v.append(autoTopupSettingFieldTypeDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
