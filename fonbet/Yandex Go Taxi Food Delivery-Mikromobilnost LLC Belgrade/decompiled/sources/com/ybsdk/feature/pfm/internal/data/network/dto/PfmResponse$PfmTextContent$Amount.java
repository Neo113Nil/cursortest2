package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import defpackage.jl40;
import defpackage.kcb0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u000f¨\u0006$"}, d2 = {"com/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Amount", "Lkcb0;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$TextType;", "contentType", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney;", "money", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$Spoiler;", "spoiler", "<init>", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$TextType;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$Spoiler;)V", "component1", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$TextType;", "component2", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney;", "component3", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$Spoiler;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Amount;", "copy", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$TextType;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$Spoiler;)Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Amount;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$TextType;", "getContentType", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney;", "getMoney", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$Spoiler;", "getSpoiler", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PfmResponse$PfmTextContent$Amount implements kcb0 {
    private final PfmResponse.TextType contentType;
    private final PfmResponse.PfmMoney money;
    private final PfmResponse.Spoiler spoiler;

    public PfmResponse$PfmTextContent$Amount(@Json(name = "content_type") PfmResponse.TextType textType, @Json(name = "money") PfmResponse.PfmMoney pfmMoney, @Json(name = "spoiler") PfmResponse.Spoiler spoiler) {
        this.contentType = textType;
        this.money = pfmMoney;
        this.spoiler = spoiler;
    }

    public static /* synthetic */ PfmResponse$PfmTextContent$Amount copy$default(PfmResponse$PfmTextContent$Amount pfmResponse$PfmTextContent$Amount, PfmResponse.TextType textType, PfmResponse.PfmMoney pfmMoney, PfmResponse.Spoiler spoiler, int i, Object obj) {
        if ((i & 1) != 0) {
            textType = pfmResponse$PfmTextContent$Amount.contentType;
        }
        if ((i & 2) != 0) {
            pfmMoney = pfmResponse$PfmTextContent$Amount.money;
        }
        if ((i & 4) != 0) {
            spoiler = pfmResponse$PfmTextContent$Amount.spoiler;
        }
        return pfmResponse$PfmTextContent$Amount.copy(textType, pfmMoney, spoiler);
    }

    /* renamed from: component1, reason: from getter */
    public final PfmResponse.TextType getContentType() {
        return this.contentType;
    }

    /* renamed from: component2, reason: from getter */
    public final PfmResponse.PfmMoney getMoney() {
        return this.money;
    }

    /* renamed from: component3, reason: from getter */
    public final PfmResponse.Spoiler getSpoiler() {
        return this.spoiler;
    }

    public final PfmResponse$PfmTextContent$Amount copy(@Json(name = "content_type") PfmResponse.TextType contentType, @Json(name = "money") PfmResponse.PfmMoney money, @Json(name = "spoiler") PfmResponse.Spoiler spoiler) {
        return new PfmResponse$PfmTextContent$Amount(contentType, money, spoiler);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PfmResponse$PfmTextContent$Amount)) {
            return false;
        }
        PfmResponse$PfmTextContent$Amount pfmResponse$PfmTextContent$Amount = (PfmResponse$PfmTextContent$Amount) other;
        return this.contentType == pfmResponse$PfmTextContent$Amount.contentType && jl40.l(this.money, pfmResponse$PfmTextContent$Amount.money) && jl40.l(this.spoiler, pfmResponse$PfmTextContent$Amount.spoiler);
    }

    public final PfmResponse.TextType getContentType() {
        return this.contentType;
    }

    public final PfmResponse.PfmMoney getMoney() {
        return this.money;
    }

    public final PfmResponse.Spoiler getSpoiler() {
        return this.spoiler;
    }

    public int hashCode() {
        return this.spoiler.hashCode() + ((this.money.hashCode() + (this.contentType.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "Amount(contentType=" + this.contentType + ", money=" + this.money + ", spoiler=" + this.spoiler + Extension.C_BRAKE;
    }
}
