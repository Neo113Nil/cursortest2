package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/DocumentButtonDto;", "", "icon", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "title", "action", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getTitle", "()Ljava/lang/String;", "getAction", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DocumentButtonDto {
    private final String action;
    private final Themes<String> icon;
    private final String title;

    public DocumentButtonDto(@Json(name = "icon") Themes<String> themes, @Json(name = "title") String str, @Json(name = "action") String str2) {
        this.icon = themes;
        this.title = str;
        this.action = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocumentButtonDto copy$default(DocumentButtonDto documentButtonDto, Themes themes, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            themes = documentButtonDto.icon;
        }
        if ((i & 2) != 0) {
            str = documentButtonDto.title;
        }
        if ((i & 4) != 0) {
            str2 = documentButtonDto.action;
        }
        return documentButtonDto.copy(themes, str, str2);
    }

    public final Themes<String> component1() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final DocumentButtonDto copy(@Json(name = "icon") Themes<String> icon, @Json(name = "title") String title, @Json(name = "action") String action) {
        return new DocumentButtonDto(icon, title, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentButtonDto)) {
            return false;
        }
        DocumentButtonDto documentButtonDto = (DocumentButtonDto) other;
        return jl40.l(this.icon, documentButtonDto.icon) && jl40.l(this.title, documentButtonDto.title) && jl40.l(this.action, documentButtonDto.action);
    }

    public final String getAction() {
        return this.action;
    }

    public final Themes<String> getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.action.hashCode() + unr0.b(this.icon.hashCode() * 31, 31, this.title);
    }

    public String toString() {
        Themes<String> themes = this.icon;
        String str = this.title;
        String str2 = this.action;
        StringBuilder sb = new StringBuilder("DocumentButtonDto(icon=");
        sb.append(themes);
        sb.append(", title=");
        sb.append(str);
        sb.append(", action=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
