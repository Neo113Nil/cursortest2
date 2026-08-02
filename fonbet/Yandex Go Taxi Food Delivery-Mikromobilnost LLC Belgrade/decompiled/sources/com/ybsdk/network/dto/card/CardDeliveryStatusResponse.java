package com.ybsdk.network.dto.card;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/network/dto/card/CardDeliveryStatusResponse;", "", "applicationInfo", "Lcom/ybsdk/network/dto/card/CardDeliveryStatusResponse$CardDeliveryInfo;", "<init>", "(Lcom/ybsdk/network/dto/card/CardDeliveryStatusResponse$CardDeliveryInfo;)V", "getApplicationInfo", "()Lcom/ybsdk/network/dto/card/CardDeliveryStatusResponse$CardDeliveryInfo;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "CardDeliveryInfo", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardDeliveryStatusResponse {
    private final CardDeliveryInfo applicationInfo;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/network/dto/card/CardDeliveryStatusResponse$CardDeliveryInfo;", "", "applicationStatus", "Lcom/ybsdk/network/dto/card/CardDeliveryStatusResponse$CardDeliveryInfo$CardDeliveryApplicationStatus;", "applicationProductType", "", "<init>", "(Lcom/ybsdk/network/dto/card/CardDeliveryStatusResponse$CardDeliveryInfo$CardDeliveryApplicationStatus;Ljava/lang/String;)V", "getApplicationStatus", "()Lcom/ybsdk/network/dto/card/CardDeliveryStatusResponse$CardDeliveryInfo$CardDeliveryApplicationStatus;", "getApplicationProductType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "CardDeliveryApplicationStatus", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CardDeliveryInfo {
        private final String applicationProductType;
        private final CardDeliveryApplicationStatus applicationStatus;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/network/dto/card/CardDeliveryStatusResponse$CardDeliveryInfo$CardDeliveryApplicationStatus;", "", "<init>", "(Ljava/lang/String;I)V", "CREATED", "LOGISTIC", "ACTIVATION", "NEED_DELIVERY_INFO", "WAITING_FOR_PICKUP", "CANCEL", "FAIL", "SUCCESS", "UNKNOWN", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes8.dex */
        public static final class CardDeliveryApplicationStatus {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ CardDeliveryApplicationStatus[] $VALUES;
            public static final CardDeliveryApplicationStatus CREATED = new CardDeliveryApplicationStatus("CREATED", 0);
            public static final CardDeliveryApplicationStatus LOGISTIC = new CardDeliveryApplicationStatus("LOGISTIC", 1);
            public static final CardDeliveryApplicationStatus ACTIVATION = new CardDeliveryApplicationStatus("ACTIVATION", 2);
            public static final CardDeliveryApplicationStatus NEED_DELIVERY_INFO = new CardDeliveryApplicationStatus("NEED_DELIVERY_INFO", 3);
            public static final CardDeliveryApplicationStatus WAITING_FOR_PICKUP = new CardDeliveryApplicationStatus("WAITING_FOR_PICKUP", 4);
            public static final CardDeliveryApplicationStatus CANCEL = new CardDeliveryApplicationStatus("CANCEL", 5);
            public static final CardDeliveryApplicationStatus FAIL = new CardDeliveryApplicationStatus("FAIL", 6);
            public static final CardDeliveryApplicationStatus SUCCESS = new CardDeliveryApplicationStatus("SUCCESS", 7);
            public static final CardDeliveryApplicationStatus UNKNOWN = new CardDeliveryApplicationStatus("UNKNOWN", 8);

            private static final /* synthetic */ CardDeliveryApplicationStatus[] $values() {
                return new CardDeliveryApplicationStatus[]{CREATED, LOGISTIC, ACTIVATION, NEED_DELIVERY_INFO, WAITING_FOR_PICKUP, CANCEL, FAIL, SUCCESS, UNKNOWN};
            }

            static {
                CardDeliveryApplicationStatus[] $values = $values();
                $VALUES = $values;
                $ENTRIES = a.a($values);
            }

            private CardDeliveryApplicationStatus(String str, int i) {
            }

            public static k4o getEntries() {
                return $ENTRIES;
            }

            public static CardDeliveryApplicationStatus valueOf(String str) {
                return (CardDeliveryApplicationStatus) Enum.valueOf(CardDeliveryApplicationStatus.class, str);
            }

            public static CardDeliveryApplicationStatus[] values() {
                return (CardDeliveryApplicationStatus[]) $VALUES.clone();
            }
        }

        public CardDeliveryInfo(@Json(name = "application_status") CardDeliveryApplicationStatus cardDeliveryApplicationStatus, @Json(name = "application_product_type") String str) {
            this.applicationStatus = cardDeliveryApplicationStatus;
            this.applicationProductType = str;
        }

        public static /* synthetic */ CardDeliveryInfo copy$default(CardDeliveryInfo cardDeliveryInfo, CardDeliveryApplicationStatus cardDeliveryApplicationStatus, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                cardDeliveryApplicationStatus = cardDeliveryInfo.applicationStatus;
            }
            if ((i & 2) != 0) {
                str = cardDeliveryInfo.applicationProductType;
            }
            return cardDeliveryInfo.copy(cardDeliveryApplicationStatus, str);
        }

        /* renamed from: component1, reason: from getter */
        public final CardDeliveryApplicationStatus getApplicationStatus() {
            return this.applicationStatus;
        }

        /* renamed from: component2, reason: from getter */
        public final String getApplicationProductType() {
            return this.applicationProductType;
        }

        public final CardDeliveryInfo copy(@Json(name = "application_status") CardDeliveryApplicationStatus applicationStatus, @Json(name = "application_product_type") String applicationProductType) {
            return new CardDeliveryInfo(applicationStatus, applicationProductType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardDeliveryInfo)) {
                return false;
            }
            CardDeliveryInfo cardDeliveryInfo = (CardDeliveryInfo) other;
            return this.applicationStatus == cardDeliveryInfo.applicationStatus && jl40.l(this.applicationProductType, cardDeliveryInfo.applicationProductType);
        }

        public final String getApplicationProductType() {
            return this.applicationProductType;
        }

        public final CardDeliveryApplicationStatus getApplicationStatus() {
            return this.applicationStatus;
        }

        public int hashCode() {
            return this.applicationProductType.hashCode() + (this.applicationStatus.hashCode() * 31);
        }

        public String toString() {
            return "CardDeliveryInfo(applicationStatus=" + this.applicationStatus + ", applicationProductType=" + this.applicationProductType + Extension.C_BRAKE;
        }
    }

    public CardDeliveryStatusResponse(@Json(name = "application_info") CardDeliveryInfo cardDeliveryInfo) {
        this.applicationInfo = cardDeliveryInfo;
    }

    public static /* synthetic */ CardDeliveryStatusResponse copy$default(CardDeliveryStatusResponse cardDeliveryStatusResponse, CardDeliveryInfo cardDeliveryInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            cardDeliveryInfo = cardDeliveryStatusResponse.applicationInfo;
        }
        return cardDeliveryStatusResponse.copy(cardDeliveryInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final CardDeliveryInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    public final CardDeliveryStatusResponse copy(@Json(name = "application_info") CardDeliveryInfo applicationInfo) {
        return new CardDeliveryStatusResponse(applicationInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CardDeliveryStatusResponse) && jl40.l(this.applicationInfo, ((CardDeliveryStatusResponse) other).applicationInfo);
    }

    public final CardDeliveryInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    public int hashCode() {
        CardDeliveryInfo cardDeliveryInfo = this.applicationInfo;
        if (cardDeliveryInfo == null) {
            return 0;
        }
        return cardDeliveryInfo.hashCode();
    }

    public String toString() {
        return "CardDeliveryStatusResponse(applicationInfo=" + this.applicationInfo + Extension.C_BRAKE;
    }
}
