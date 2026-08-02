package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import defpackage.jcb0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\f¨\u0006!"}, d2 = {"com/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmNodeText$MultipleText", "Ljcb0;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmNodeTextContentType;", "contentType", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmText;", "title", "subtitle", "<init>", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmNodeTextContentType;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmText;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmText;)V", "component1", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmNodeTextContentType;", "component2", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmText;", "component3", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmNodeText$MultipleText;", "copy", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmNodeTextContentType;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmText;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmText;)Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmNodeText$MultipleText;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmNodeTextContentType;", "getContentType", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmText;", "getTitle", "getSubtitle", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PfmResponse$PfmNodeText$MultipleText implements jcb0 {
    private final PfmResponse.PfmNodeTextContentType contentType;
    private final PfmResponse.PfmText subtitle;
    private final PfmResponse.PfmText title;

    public PfmResponse$PfmNodeText$MultipleText(@Json(name = "content_type") PfmResponse.PfmNodeTextContentType pfmNodeTextContentType, @Json(name = "title") PfmResponse.PfmText pfmText, @Json(name = "subtitle") PfmResponse.PfmText pfmText2) {
        this.contentType = pfmNodeTextContentType;
        this.title = pfmText;
        this.subtitle = pfmText2;
    }

    public static /* synthetic */ PfmResponse$PfmNodeText$MultipleText copy$default(PfmResponse$PfmNodeText$MultipleText pfmResponse$PfmNodeText$MultipleText, PfmResponse.PfmNodeTextContentType pfmNodeTextContentType, PfmResponse.PfmText pfmText, PfmResponse.PfmText pfmText2, int i, Object obj) {
        if ((i & 1) != 0) {
            pfmNodeTextContentType = pfmResponse$PfmNodeText$MultipleText.contentType;
        }
        if ((i & 2) != 0) {
            pfmText = pfmResponse$PfmNodeText$MultipleText.title;
        }
        if ((i & 4) != 0) {
            pfmText2 = pfmResponse$PfmNodeText$MultipleText.subtitle;
        }
        return pfmResponse$PfmNodeText$MultipleText.copy(pfmNodeTextContentType, pfmText, pfmText2);
    }

    /* renamed from: component1, reason: from getter */
    public final PfmResponse.PfmNodeTextContentType getContentType() {
        return this.contentType;
    }

    /* renamed from: component2, reason: from getter */
    public final PfmResponse.PfmText getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final PfmResponse.PfmText getSubtitle() {
        return this.subtitle;
    }

    public final PfmResponse$PfmNodeText$MultipleText copy(@Json(name = "content_type") PfmResponse.PfmNodeTextContentType contentType, @Json(name = "title") PfmResponse.PfmText title, @Json(name = "subtitle") PfmResponse.PfmText subtitle) {
        return new PfmResponse$PfmNodeText$MultipleText(contentType, title, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PfmResponse$PfmNodeText$MultipleText)) {
            return false;
        }
        PfmResponse$PfmNodeText$MultipleText pfmResponse$PfmNodeText$MultipleText = (PfmResponse$PfmNodeText$MultipleText) other;
        return this.contentType == pfmResponse$PfmNodeText$MultipleText.contentType && jl40.l(this.title, pfmResponse$PfmNodeText$MultipleText.title) && jl40.l(this.subtitle, pfmResponse$PfmNodeText$MultipleText.subtitle);
    }

    public final PfmResponse.PfmNodeTextContentType getContentType() {
        return this.contentType;
    }

    public final PfmResponse.PfmText getSubtitle() {
        return this.subtitle;
    }

    public final PfmResponse.PfmText getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.subtitle.hashCode() + ((this.title.hashCode() + (this.contentType.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "MultipleText(contentType=" + this.contentType + ", title=" + this.title + ", subtitle=" + this.subtitle + Extension.C_BRAKE;
    }
}
