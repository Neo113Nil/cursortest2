package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2EditField;", "", "fieldType", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2MoneyType;", "text", "", "hint", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2MoneyType;Ljava/lang/String;Ljava/lang/String;)V", "getFieldType", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2MoneyType;", "getText", "()Ljava/lang/String;", "getHint", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupSettingsV2EditField {
    private final AutoTopupSettingsV2MoneyType fieldType;
    private final String hint;
    private final String text;

    public AutoTopupSettingsV2EditField(@Json(name = "field_type") AutoTopupSettingsV2MoneyType autoTopupSettingsV2MoneyType, @Json(name = "text") String str, @Json(name = "hint") String str2) {
        this.fieldType = autoTopupSettingsV2MoneyType;
        this.text = str;
        this.hint = str2;
    }

    public static /* synthetic */ AutoTopupSettingsV2EditField copy$default(AutoTopupSettingsV2EditField autoTopupSettingsV2EditField, AutoTopupSettingsV2MoneyType autoTopupSettingsV2MoneyType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            autoTopupSettingsV2MoneyType = autoTopupSettingsV2EditField.fieldType;
        }
        if ((i & 2) != 0) {
            str = autoTopupSettingsV2EditField.text;
        }
        if ((i & 4) != 0) {
            str2 = autoTopupSettingsV2EditField.hint;
        }
        return autoTopupSettingsV2EditField.copy(autoTopupSettingsV2MoneyType, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final AutoTopupSettingsV2MoneyType getFieldType() {
        return this.fieldType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    public final AutoTopupSettingsV2EditField copy(@Json(name = "field_type") AutoTopupSettingsV2MoneyType fieldType, @Json(name = "text") String text, @Json(name = "hint") String hint) {
        return new AutoTopupSettingsV2EditField(fieldType, text, hint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupSettingsV2EditField)) {
            return false;
        }
        AutoTopupSettingsV2EditField autoTopupSettingsV2EditField = (AutoTopupSettingsV2EditField) other;
        return this.fieldType == autoTopupSettingsV2EditField.fieldType && jl40.l(this.text, autoTopupSettingsV2EditField.text) && jl40.l(this.hint, autoTopupSettingsV2EditField.hint);
    }

    public final AutoTopupSettingsV2MoneyType getFieldType() {
        return this.fieldType;
    }

    public final String getHint() {
        return this.hint;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int b = unr0.b(this.fieldType.hashCode() * 31, 31, this.text);
        String str = this.hint;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        AutoTopupSettingsV2MoneyType autoTopupSettingsV2MoneyType = this.fieldType;
        String str = this.text;
        String str2 = this.hint;
        StringBuilder sb = new StringBuilder("AutoTopupSettingsV2EditField(fieldType=");
        sb.append(autoTopupSettingsV2MoneyType);
        sb.append(", text=");
        sb.append(str);
        sb.append(", hint=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
