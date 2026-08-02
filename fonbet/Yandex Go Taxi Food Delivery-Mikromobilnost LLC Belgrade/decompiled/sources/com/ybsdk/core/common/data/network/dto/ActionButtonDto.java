package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "", "text", "", "subtitle", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getSubtitle", "getAction", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ActionButtonDto {
    private final String action;
    private final String subtitle;
    private final String text;

    public ActionButtonDto(@Json(name = "text") String str, @Json(name = "subtitle") String str2, @Json(name = "action") String str3) {
        this.text = str;
        this.subtitle = str2;
        this.action = str3;
    }

    public static /* synthetic */ ActionButtonDto copy$default(ActionButtonDto actionButtonDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionButtonDto.text;
        }
        if ((i & 2) != 0) {
            str2 = actionButtonDto.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = actionButtonDto.action;
        }
        return actionButtonDto.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final ActionButtonDto copy(@Json(name = "text") String text, @Json(name = "subtitle") String subtitle, @Json(name = "action") String action) {
        return new ActionButtonDto(text, subtitle, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionButtonDto)) {
            return false;
        }
        ActionButtonDto actionButtonDto = (ActionButtonDto) other;
        return jl40.l(this.text, actionButtonDto.text) && jl40.l(this.subtitle, actionButtonDto.subtitle) && jl40.l(this.action, actionButtonDto.action);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.action;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.text;
        String str2 = this.subtitle;
        return oyr.t(b64.v("ActionButtonDto(text=", str, ", subtitle=", str2, ", action="), this.action, Extension.C_BRAKE);
    }
}
