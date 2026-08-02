package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/rconfig/configs/ProductImages;", "", "pro", "Lcom/ybsdk/rconfig/configs/CardImages;", "wallet", "creditLimit", "corpCard", "<init>", "(Lcom/ybsdk/rconfig/configs/CardImages;Lcom/ybsdk/rconfig/configs/CardImages;Lcom/ybsdk/rconfig/configs/CardImages;Lcom/ybsdk/rconfig/configs/CardImages;)V", "getPro", "()Lcom/ybsdk/rconfig/configs/CardImages;", "getWallet", "getCreditLimit", "getCorpCard", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ProductImages {

    @Json(name = "CORP_CARD")
    private final CardImages corpCard;

    @Json(name = "CREDIT_LIMIT")
    private final CardImages creditLimit;

    @Json(name = "PRO")
    private final CardImages pro;

    @Json(name = "WALLET")
    private final CardImages wallet;

    public /* synthetic */ ProductImages(CardImages cardImages, CardImages cardImages2, CardImages cardImages3, CardImages cardImages4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cardImages, (i & 2) != 0 ? null : cardImages2, (i & 4) != 0 ? null : cardImages3, (i & 8) != 0 ? null : cardImages4);
    }

    public static /* synthetic */ ProductImages copy$default(ProductImages productImages, CardImages cardImages, CardImages cardImages2, CardImages cardImages3, CardImages cardImages4, int i, Object obj) {
        if ((i & 1) != 0) {
            cardImages = productImages.pro;
        }
        if ((i & 2) != 0) {
            cardImages2 = productImages.wallet;
        }
        if ((i & 4) != 0) {
            cardImages3 = productImages.creditLimit;
        }
        if ((i & 8) != 0) {
            cardImages4 = productImages.corpCard;
        }
        return productImages.copy(cardImages, cardImages2, cardImages3, cardImages4);
    }

    /* renamed from: component1, reason: from getter */
    public final CardImages getPro() {
        return this.pro;
    }

    /* renamed from: component2, reason: from getter */
    public final CardImages getWallet() {
        return this.wallet;
    }

    /* renamed from: component3, reason: from getter */
    public final CardImages getCreditLimit() {
        return this.creditLimit;
    }

    /* renamed from: component4, reason: from getter */
    public final CardImages getCorpCard() {
        return this.corpCard;
    }

    public final ProductImages copy(CardImages pro, CardImages wallet, CardImages creditLimit, CardImages corpCard) {
        return new ProductImages(pro, wallet, creditLimit, corpCard);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductImages)) {
            return false;
        }
        ProductImages productImages = (ProductImages) other;
        return jl40.l(this.pro, productImages.pro) && jl40.l(this.wallet, productImages.wallet) && jl40.l(this.creditLimit, productImages.creditLimit) && jl40.l(this.corpCard, productImages.corpCard);
    }

    public final CardImages getCorpCard() {
        return this.corpCard;
    }

    public final CardImages getCreditLimit() {
        return this.creditLimit;
    }

    public final CardImages getPro() {
        return this.pro;
    }

    public final CardImages getWallet() {
        return this.wallet;
    }

    public int hashCode() {
        CardImages cardImages = this.pro;
        int hashCode = (cardImages == null ? 0 : cardImages.hashCode()) * 31;
        CardImages cardImages2 = this.wallet;
        int hashCode2 = (hashCode + (cardImages2 == null ? 0 : cardImages2.hashCode())) * 31;
        CardImages cardImages3 = this.creditLimit;
        int hashCode3 = (hashCode2 + (cardImages3 == null ? 0 : cardImages3.hashCode())) * 31;
        CardImages cardImages4 = this.corpCard;
        return hashCode3 + (cardImages4 != null ? cardImages4.hashCode() : 0);
    }

    public String toString() {
        return "ProductImages(pro=" + this.pro + ", wallet=" + this.wallet + ", creditLimit=" + this.creditLimit + ", corpCard=" + this.corpCard + Extension.C_BRAKE;
    }

    public ProductImages(CardImages cardImages, CardImages cardImages2, CardImages cardImages3, CardImages cardImages4) {
        this.pro = cardImages;
        this.wallet = cardImages2;
        this.creditLimit = cardImages3;
        this.corpCard = cardImages4;
    }

    public ProductImages() {
        this(null, null, null, null, 15, null);
    }
}
