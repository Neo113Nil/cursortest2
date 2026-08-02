package com.ybsdk.feature.pdf.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.smw0;
import defpackage.unr0;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001#BA\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0015JH\u0010\u001c\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\n\u0010\u0015¨\u0006$"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftCreateRequest;", "", "items", "", "Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftCreateRequest$Item;", "totalAmount", "Ljava/math/BigDecimal;", "planConstructor", "", "merchantID", "isPrepayment", "", "<init>", "(Ljava/util/List;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getItems", "()Ljava/util/List;", "getTotalAmount", "()Ljava/math/BigDecimal;", "getPlanConstructor", "()Ljava/lang/String;", "getMerchantID", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftCreateRequest;", "equals", "other", "hashCode", "", "toString", "Item", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SplitContractDraftCreateRequest {
    private final Boolean isPrepayment;
    private final List<Item> items;
    private final String merchantID;
    private final String planConstructor;
    private final BigDecimal totalAmount;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftCreateRequest$Item;", "", "title", "", "count", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;)V", "getTitle", "()Ljava/lang/String;", "getCount", "()Ljava/math/BigDecimal;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {
        private final BigDecimal count;
        private final String title;

        public Item(@Json(name = "title") String str, @Json(name = "count") BigDecimal bigDecimal) {
            this.title = str;
            this.count = bigDecimal;
        }

        public static /* synthetic */ Item copy$default(Item item, String str, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                str = item.title;
            }
            if ((i & 2) != 0) {
                bigDecimal = item.count;
            }
            return item.copy(str, bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getCount() {
            return this.count;
        }

        public final Item copy(@Json(name = "title") String title, @Json(name = "count") BigDecimal count) {
            return new Item(title, count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return jl40.l(this.title, item.title) && jl40.l(this.count, item.count);
        }

        public final BigDecimal getCount() {
            return this.count;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.count.hashCode() + (this.title.hashCode() * 31);
        }

        public String toString() {
            return "Item(title=" + this.title + ", count=" + this.count + Extension.C_BRAKE;
        }
    }

    public SplitContractDraftCreateRequest(@Json(name = "items") List<Item> list, @Json(name = "total_amount") BigDecimal bigDecimal, @Json(name = "plan_constructor") String str, @Json(name = "merchant_id") String str2, @Json(name = "is_prepayment") Boolean bool) {
        this.items = list;
        this.totalAmount = bigDecimal;
        this.planConstructor = str;
        this.merchantID = str2;
        this.isPrepayment = bool;
    }

    public static /* synthetic */ SplitContractDraftCreateRequest copy$default(SplitContractDraftCreateRequest splitContractDraftCreateRequest, List list, BigDecimal bigDecimal, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = splitContractDraftCreateRequest.items;
        }
        if ((i & 2) != 0) {
            bigDecimal = splitContractDraftCreateRequest.totalAmount;
        }
        if ((i & 4) != 0) {
            str = splitContractDraftCreateRequest.planConstructor;
        }
        if ((i & 8) != 0) {
            str2 = splitContractDraftCreateRequest.merchantID;
        }
        if ((i & 16) != 0) {
            bool = splitContractDraftCreateRequest.isPrepayment;
        }
        Boolean bool2 = bool;
        String str3 = str;
        return splitContractDraftCreateRequest.copy(list, bigDecimal, str3, str2, bool2);
    }

    public final List<Item> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPlanConstructor() {
        return this.planConstructor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMerchantID() {
        return this.merchantID;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getIsPrepayment() {
        return this.isPrepayment;
    }

    public final SplitContractDraftCreateRequest copy(@Json(name = "items") List<Item> items, @Json(name = "total_amount") BigDecimal totalAmount, @Json(name = "plan_constructor") String planConstructor, @Json(name = "merchant_id") String merchantID, @Json(name = "is_prepayment") Boolean isPrepayment) {
        return new SplitContractDraftCreateRequest(items, totalAmount, planConstructor, merchantID, isPrepayment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitContractDraftCreateRequest)) {
            return false;
        }
        SplitContractDraftCreateRequest splitContractDraftCreateRequest = (SplitContractDraftCreateRequest) other;
        return jl40.l(this.items, splitContractDraftCreateRequest.items) && jl40.l(this.totalAmount, splitContractDraftCreateRequest.totalAmount) && jl40.l(this.planConstructor, splitContractDraftCreateRequest.planConstructor) && jl40.l(this.merchantID, splitContractDraftCreateRequest.merchantID) && jl40.l(this.isPrepayment, splitContractDraftCreateRequest.isPrepayment);
    }

    public final List<Item> getItems() {
        return this.items;
    }

    public final String getMerchantID() {
        return this.merchantID;
    }

    public final String getPlanConstructor() {
        return this.planConstructor;
    }

    public final BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(smw0.f(this.totalAmount, this.items.hashCode() * 31, 31), 31, this.planConstructor), 31, this.merchantID);
        Boolean bool = this.isPrepayment;
        return b + (bool == null ? 0 : bool.hashCode());
    }

    public final Boolean isPrepayment() {
        return this.isPrepayment;
    }

    public String toString() {
        List<Item> list = this.items;
        BigDecimal bigDecimal = this.totalAmount;
        String str = this.planConstructor;
        String str2 = this.merchantID;
        Boolean bool = this.isPrepayment;
        StringBuilder sb = new StringBuilder("SplitContractDraftCreateRequest(items=");
        sb.append(list);
        sb.append(", totalAmount=");
        sb.append(bigDecimal);
        sb.append(", planConstructor=");
        g8e.D(sb, str, ", merchantID=", str2, ", isPrepayment=");
        return nzs.d(sb, bool, Extension.C_BRAKE);
    }
}
