package com.ybsdk.network.dto;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.MoneyCommonResponse;
import defpackage.b64;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001&BQ\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006'"}, d2 = {"Lcom/ybsdk/network/dto/PaymentInfoDetails;", "", "paymentId", "", "creationTimestamp", "money", "Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", "image", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "type", "Lcom/ybsdk/network/dto/PaymentInfoDetails$PaymentType;", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/network/dto/PaymentInfoDetails$PaymentType;Ljava/lang/String;)V", "getPaymentId", "()Ljava/lang/String;", "getCreationTimestamp", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", "getImage", "getDescription", "getType", "()Lcom/ybsdk/network/dto/PaymentInfoDetails$PaymentType;", "getName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentType", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentInfoDetails {
    private final String creationTimestamp;
    private final String description;
    private final String image;
    private final MoneyCommonResponse money;
    private final String name;
    private final String paymentId;
    private final PaymentType type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ybsdk/network/dto/PaymentInfoDetails$PaymentType;", "", "<init>", "(Ljava/lang/String;I)V", Card.CARD_TYPE_CREDIT, "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaymentType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PaymentType[] $VALUES;
        public static final PaymentType CREDIT = new PaymentType(Card.CARD_TYPE_CREDIT, 0);

        private static final /* synthetic */ PaymentType[] $values() {
            return new PaymentType[]{CREDIT};
        }

        static {
            PaymentType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private PaymentType(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static PaymentType valueOf(String str) {
            return (PaymentType) Enum.valueOf(PaymentType.class, str);
        }

        public static PaymentType[] values() {
            return (PaymentType[]) $VALUES.clone();
        }
    }

    public PaymentInfoDetails(@Json(name = "payment_id") String str, @Json(name = "creation_timestamp") String str2, @Json(name = "money") MoneyCommonResponse moneyCommonResponse, @Json(name = "image") String str3, @Json(name = "description") String str4, @Json(name = "type") PaymentType paymentType, @Json(name = "name") String str5) {
        this.paymentId = str;
        this.creationTimestamp = str2;
        this.money = moneyCommonResponse;
        this.image = str3;
        this.description = str4;
        this.type = paymentType;
        this.name = str5;
    }

    public static /* synthetic */ PaymentInfoDetails copy$default(PaymentInfoDetails paymentInfoDetails, String str, String str2, MoneyCommonResponse moneyCommonResponse, String str3, String str4, PaymentType paymentType, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentInfoDetails.paymentId;
        }
        if ((i & 2) != 0) {
            str2 = paymentInfoDetails.creationTimestamp;
        }
        if ((i & 4) != 0) {
            moneyCommonResponse = paymentInfoDetails.money;
        }
        if ((i & 8) != 0) {
            str3 = paymentInfoDetails.image;
        }
        if ((i & 16) != 0) {
            str4 = paymentInfoDetails.description;
        }
        if ((i & 32) != 0) {
            paymentType = paymentInfoDetails.type;
        }
        if ((i & 64) != 0) {
            str5 = paymentInfoDetails.name;
        }
        PaymentType paymentType2 = paymentType;
        String str6 = str5;
        String str7 = str4;
        MoneyCommonResponse moneyCommonResponse2 = moneyCommonResponse;
        return paymentInfoDetails.copy(str, str2, moneyCommonResponse2, str3, str7, paymentType2, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /* renamed from: component3, reason: from getter */
    public final MoneyCommonResponse getMoney() {
        return this.money;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final PaymentType getType() {
        return this.type;
    }

    /* renamed from: component7, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final PaymentInfoDetails copy(@Json(name = "payment_id") String paymentId, @Json(name = "creation_timestamp") String creationTimestamp, @Json(name = "money") MoneyCommonResponse money, @Json(name = "image") String image, @Json(name = "description") String description, @Json(name = "type") PaymentType type, @Json(name = "name") String name) {
        return new PaymentInfoDetails(paymentId, creationTimestamp, money, image, description, type, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentInfoDetails)) {
            return false;
        }
        PaymentInfoDetails paymentInfoDetails = (PaymentInfoDetails) other;
        return jl40.l(this.paymentId, paymentInfoDetails.paymentId) && jl40.l(this.creationTimestamp, paymentInfoDetails.creationTimestamp) && jl40.l(this.money, paymentInfoDetails.money) && jl40.l(this.image, paymentInfoDetails.image) && jl40.l(this.description, paymentInfoDetails.description) && this.type == paymentInfoDetails.type && jl40.l(this.name, paymentInfoDetails.name);
    }

    public final String getCreationTimestamp() {
        return this.creationTimestamp;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImage() {
        return this.image;
    }

    public final MoneyCommonResponse getMoney() {
        return this.money;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public final PaymentType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = (this.money.hashCode() + unr0.b(this.paymentId.hashCode() * 31, 31, this.creationTimestamp)) * 31;
        String str = this.image;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        return this.name.hashCode() + ((this.type.hashCode() + ((hashCode2 + hashCode3) * 31)) * 31);
    }

    public String toString() {
        String str = this.paymentId;
        String str2 = this.creationTimestamp;
        MoneyCommonResponse moneyCommonResponse = this.money;
        String str3 = this.image;
        String str4 = this.description;
        PaymentType paymentType = this.type;
        String str5 = this.name;
        StringBuilder v = b64.v("PaymentInfoDetails(paymentId=", str, ", creationTimestamp=", str2, ", money=");
        v.append(moneyCommonResponse);
        v.append(", image=");
        v.append(str3);
        v.append(", description=");
        v.append(str4);
        v.append(", type=");
        v.append(paymentType);
        v.append(", name=");
        return oyr.t(v, str5, Extension.C_BRAKE);
    }
}
