package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import defpackage.jcb0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001e"}, d2 = {"com/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmNodeText$SingleText", "Ljcb0;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmNodeTextContentType;", "contentType", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmText;", "text", "<init>", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmNodeTextContentType;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmText;)V", "component1", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmNodeTextContentType;", "component2", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmText;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmNodeText$SingleText;", "copy", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmNodeTextContentType;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmText;)Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmNodeText$SingleText;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmNodeTextContentType;", "getContentType", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmText;", "getText", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PfmResponse$PfmNodeText$SingleText implements jcb0 {
    private final PfmResponse.PfmNodeTextContentType contentType;
    private final PfmResponse.PfmText text;

    public PfmResponse$PfmNodeText$SingleText(@Json(name = "content_type") PfmResponse.PfmNodeTextContentType pfmNodeTextContentType, @Json(name = "text") PfmResponse.PfmText pfmText) {
        this.contentType = pfmNodeTextContentType;
        this.text = pfmText;
    }

    public static /* synthetic */ PfmResponse$PfmNodeText$SingleText copy$default(PfmResponse$PfmNodeText$SingleText pfmResponse$PfmNodeText$SingleText, PfmResponse.PfmNodeTextContentType pfmNodeTextContentType, PfmResponse.PfmText pfmText, int i, Object obj) {
        if ((i & 1) != 0) {
            pfmNodeTextContentType = pfmResponse$PfmNodeText$SingleText.contentType;
        }
        if ((i & 2) != 0) {
            pfmText = pfmResponse$PfmNodeText$SingleText.text;
        }
        return pfmResponse$PfmNodeText$SingleText.copy(pfmNodeTextContentType, pfmText);
    }

    /* renamed from: component1, reason: from getter */
    public final PfmResponse.PfmNodeTextContentType getContentType() {
        return this.contentType;
    }

    /* renamed from: component2, reason: from getter */
    public final PfmResponse.PfmText getText() {
        return this.text;
    }

    public final PfmResponse$PfmNodeText$SingleText copy(@Json(name = "content_type") PfmResponse.PfmNodeTextContentType contentType, @Json(name = "text") PfmResponse.PfmText text) {
        return new PfmResponse$PfmNodeText$SingleText(contentType, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PfmResponse$PfmNodeText$SingleText)) {
            return false;
        }
        PfmResponse$PfmNodeText$SingleText pfmResponse$PfmNodeText$SingleText = (PfmResponse$PfmNodeText$SingleText) other;
        return this.contentType == pfmResponse$PfmNodeText$SingleText.contentType && jl40.l(this.text, pfmResponse$PfmNodeText$SingleText.text);
    }

    public final PfmResponse.PfmNodeTextContentType getContentType() {
        return this.contentType;
    }

    public final PfmResponse.PfmText getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.contentType.hashCode() * 31);
    }

    public String toString() {
        return "SingleText(contentType=" + this.contentType + ", text=" + this.text + Extension.C_BRAKE;
    }
}
