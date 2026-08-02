package com.yandex.plus.pay.ui.core.tarifficator.api.data.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayInAppReplacementParams;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.ui.api.feature.payment.PlusPaymentFlowErrorReason;
import defpackage.b64;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0003@ABBE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b'\u0010(J\\\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b+\u0010 J\u0010\u0010,\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b,\u0010\u0014J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b?\u0010(¨\u0006C"}, d2 = {"Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase;", "Landroid/os/Parcelable;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "offer", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails;", "offerDetails", "", "paymentMethodId", "Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Status;", ACSPConstants.STATUS, "Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Source;", "source", "Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Type;", "type", "Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams;", "inAppReplacementParams", "<init>", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails;Ljava/lang/String;Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Status;Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Source;Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Type;Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "component2", "()Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Status;", "component5", "()Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Source;", "component6", "()Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Type;", "component7", "()Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams;", "copy", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails;Ljava/lang/String;Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Status;Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Source;Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Type;Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams;)Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "getOffer", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails;", "getOfferDetails", "Ljava/lang/String;", "getPaymentMethodId", "Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Status;", "getStatus", "Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Source;", "getSource", "Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Type;", "getType", "Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams;", "getInAppReplacementParams", "Status", "Source", "Type", "pay-sdk-ui-core-tarifficator_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusTarifficatorPurchase implements Parcelable {
    public static final Parcelable.Creator<PlusTarifficatorPurchase> CREATOR = new Creator();
    private final PlusPayInAppReplacementParams inAppReplacementParams;
    private final PlusPayCompositeOffers.Offer offer;
    private final PlusPayCompositeOfferDetails offerDetails;
    private final String paymentMethodId;
    private final Source source;
    private final Status status;
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Source;", "", "DEFAULT", "PRESALE", "CLOSING_OFFER", "COUNTER_OFFERS", "UPSALE", "pay-sdk-ui-core-tarifficator_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Source {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;
        public static final Source CLOSING_OFFER;
        public static final Source COUNTER_OFFERS;
        public static final Source DEFAULT;
        public static final Source PRESALE;
        public static final Source UPSALE;

        static {
            Source source = new Source("DEFAULT", 0);
            DEFAULT = source;
            Source source2 = new Source("PRESALE", 1);
            PRESALE = source2;
            Source source3 = new Source("CLOSING_OFFER", 2);
            CLOSING_OFFER = source3;
            Source source4 = new Source("COUNTER_OFFERS", 3);
            COUNTER_OFFERS = source4;
            Source source5 = new Source("UPSALE", 4);
            UPSALE = source5;
            Source[] sourceArr = {source, source2, source3, source4, source5};
            $VALUES = sourceArr;
            $ENTRIES = a.a(sourceArr);
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Type;", "", "DEFAULT", "SILENT", "pay-sdk-ui-core-tarifficator_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type DEFAULT;
        public static final Type SILENT;

        static {
            Type type = new Type("DEFAULT", 0);
            DEFAULT = type;
            Type type2 = new Type("SILENT", 1);
            SILENT = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = a.a(typeArr);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public PlusTarifficatorPurchase(PlusPayCompositeOffers.Offer offer, PlusPayCompositeOfferDetails plusPayCompositeOfferDetails, String str, Status status, Source source, Type type, PlusPayInAppReplacementParams plusPayInAppReplacementParams) {
        this.offer = offer;
        this.offerDetails = plusPayCompositeOfferDetails;
        this.paymentMethodId = str;
        this.status = status;
        this.source = source;
        this.type = type;
        this.inAppReplacementParams = plusPayInAppReplacementParams;
    }

    public static /* synthetic */ PlusTarifficatorPurchase copy$default(PlusTarifficatorPurchase plusTarifficatorPurchase, PlusPayCompositeOffers.Offer offer, PlusPayCompositeOfferDetails plusPayCompositeOfferDetails, String str, Status status, Source source, Type type, PlusPayInAppReplacementParams plusPayInAppReplacementParams, int i, Object obj) {
        if ((i & 1) != 0) {
            offer = plusTarifficatorPurchase.offer;
        }
        if ((i & 2) != 0) {
            plusPayCompositeOfferDetails = plusTarifficatorPurchase.offerDetails;
        }
        if ((i & 4) != 0) {
            str = plusTarifficatorPurchase.paymentMethodId;
        }
        if ((i & 8) != 0) {
            status = plusTarifficatorPurchase.status;
        }
        if ((i & 16) != 0) {
            source = plusTarifficatorPurchase.source;
        }
        if ((i & 32) != 0) {
            type = plusTarifficatorPurchase.type;
        }
        if ((i & 64) != 0) {
            plusPayInAppReplacementParams = plusTarifficatorPurchase.inAppReplacementParams;
        }
        Type type2 = type;
        PlusPayInAppReplacementParams plusPayInAppReplacementParams2 = plusPayInAppReplacementParams;
        Source source2 = source;
        String str2 = str;
        return plusTarifficatorPurchase.copy(offer, plusPayCompositeOfferDetails, str2, status, source2, type2, plusPayInAppReplacementParams2);
    }

    /* renamed from: component1, reason: from getter */
    public final PlusPayCompositeOffers.Offer getOffer() {
        return this.offer;
    }

    /* renamed from: component2, reason: from getter */
    public final PlusPayCompositeOfferDetails getOfferDetails() {
        return this.offerDetails;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /* renamed from: component4, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component5, reason: from getter */
    public final Source getSource() {
        return this.source;
    }

    /* renamed from: component6, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: component7, reason: from getter */
    public final PlusPayInAppReplacementParams getInAppReplacementParams() {
        return this.inAppReplacementParams;
    }

    public final PlusTarifficatorPurchase copy(PlusPayCompositeOffers.Offer offer, PlusPayCompositeOfferDetails offerDetails, String paymentMethodId, Status status, Source source, Type type, PlusPayInAppReplacementParams inAppReplacementParams) {
        return new PlusTarifficatorPurchase(offer, offerDetails, paymentMethodId, status, source, type, inAppReplacementParams);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusTarifficatorPurchase)) {
            return false;
        }
        PlusTarifficatorPurchase plusTarifficatorPurchase = (PlusTarifficatorPurchase) other;
        return jl40.l(this.offer, plusTarifficatorPurchase.offer) && jl40.l(this.offerDetails, plusTarifficatorPurchase.offerDetails) && jl40.l(this.paymentMethodId, plusTarifficatorPurchase.paymentMethodId) && jl40.l(this.status, plusTarifficatorPurchase.status) && this.source == plusTarifficatorPurchase.source && this.type == plusTarifficatorPurchase.type && jl40.l(this.inAppReplacementParams, plusTarifficatorPurchase.inAppReplacementParams);
    }

    public final PlusPayInAppReplacementParams getInAppReplacementParams() {
        return this.inAppReplacementParams;
    }

    public final PlusPayCompositeOffers.Offer getOffer() {
        return this.offer;
    }

    public final PlusPayCompositeOfferDetails getOfferDetails() {
        return this.offerDetails;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final Source getSource() {
        return this.source;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.offer.hashCode() * 31;
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails = this.offerDetails;
        int hashCode2 = (hashCode + (plusPayCompositeOfferDetails == null ? 0 : plusPayCompositeOfferDetails.hashCode())) * 31;
        String str = this.paymentMethodId;
        int hashCode3 = (this.type.hashCode() + ((this.source.hashCode() + ((this.status.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31;
        PlusPayInAppReplacementParams plusPayInAppReplacementParams = this.inAppReplacementParams;
        return hashCode3 + (plusPayInAppReplacementParams != null ? plusPayInAppReplacementParams.hashCode() : 0);
    }

    public String toString() {
        return "PlusTarifficatorPurchase(offer=" + this.offer + ", offerDetails=" + this.offerDetails + ", paymentMethodId=" + this.paymentMethodId + ", status=" + this.status + ", source=" + this.source + ", type=" + this.type + ", inAppReplacementParams=" + this.inAppReplacementParams + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.offer, flags);
        dest.writeParcelable(this.offerDetails, flags);
        dest.writeString(this.paymentMethodId);
        dest.writeParcelable(this.status, flags);
        dest.writeString(this.source.name());
        dest.writeString(this.type.name());
        dest.writeParcelable(this.inAppReplacementParams, flags);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Status;", "Landroid/os/Parcelable;", "NotFinished", "Success", "Error", "Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Status$Error;", "Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Status$NotFinished;", "Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Status$Success;", "pay-sdk-ui-core-tarifficator_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Status extends Parcelable {

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Status$Error;", "Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Status;", "Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason;", CRLReasonCodeExtension.REASON, "<init>", "(Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason;", "copy", "(Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason;)Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Status$Error;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/ui/api/feature/payment/PlusPaymentFlowErrorReason;", "getReason", "pay-sdk-ui-core-tarifficator_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements Status {
            public static final Parcelable.Creator<Error> CREATOR = new Creator();
            private final PlusPaymentFlowErrorReason reason;

            public Error(PlusPaymentFlowErrorReason plusPaymentFlowErrorReason) {
                this.reason = plusPaymentFlowErrorReason;
            }

            public static /* synthetic */ Error copy$default(Error error, PlusPaymentFlowErrorReason plusPaymentFlowErrorReason, int i, Object obj) {
                if ((i & 1) != 0) {
                    plusPaymentFlowErrorReason = error.reason;
                }
                return error.copy(plusPaymentFlowErrorReason);
            }

            /* renamed from: component1, reason: from getter */
            public final PlusPaymentFlowErrorReason getReason() {
                return this.reason;
            }

            public final Error copy(PlusPaymentFlowErrorReason reason) {
                return new Error(reason);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && jl40.l(this.reason, ((Error) other).reason);
            }

            public final PlusPaymentFlowErrorReason getReason() {
                return this.reason;
            }

            public int hashCode() {
                return this.reason.hashCode();
            }

            public String toString() {
                return "Error(reason=" + this.reason + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeParcelable(this.reason, flags);
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Error> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Error createFromParcel(Parcel parcel) {
                    return new Error((PlusPaymentFlowErrorReason) parcel.readParcelable(Error.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Error[] newArray(int i) {
                    return new Error[i];
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Status$NotFinished;", "Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Status;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "pay-sdk-ui-core-tarifficator_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NotFinished implements Status {
            public static final NotFinished INSTANCE = new NotFinished();
            public static final Parcelable.Creator<NotFinished> CREATOR = new Creator();

            private NotFinished() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NotFinished);
            }

            public int hashCode() {
                return 1696161850;
            }

            public String toString() {
                return "NotFinished";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(1);
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<NotFinished> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NotFinished createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return NotFinished.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NotFinished[] newArray(int i) {
                    return new NotFinished[i];
                }
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Status$Success;", "Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Status;", "", "invoiceId", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/yandex/plus/pay/ui/core/tarifficator/api/data/common/PlusTarifficatorPurchase$Status$Success;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInvoiceId", "pay-sdk-ui-core-tarifficator_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Success implements Status {
            public static final Parcelable.Creator<Success> CREATOR = new Creator();
            private final String invoiceId;

            public Success(String str) {
                this.invoiceId = str;
            }

            public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = success.invoiceId;
                }
                return success.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getInvoiceId() {
                return this.invoiceId;
            }

            public final Success copy(String invoiceId) {
                return new Success(invoiceId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && jl40.l(this.invoiceId, ((Success) other).invoiceId);
            }

            public final String getInvoiceId() {
                return this.invoiceId;
            }

            public int hashCode() {
                String str = this.invoiceId;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return b64.p(new StringBuilder("Success(invoiceId="), this.invoiceId, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.invoiceId);
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Success> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Success createFromParcel(Parcel parcel) {
                    return new Success(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Success[] newArray(int i) {
                    return new Success[i];
                }
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusTarifficatorPurchase> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusTarifficatorPurchase createFromParcel(Parcel parcel) {
            return new PlusTarifficatorPurchase((PlusPayCompositeOffers.Offer) parcel.readParcelable(PlusTarifficatorPurchase.class.getClassLoader()), (PlusPayCompositeOfferDetails) parcel.readParcelable(PlusTarifficatorPurchase.class.getClassLoader()), parcel.readString(), (Status) parcel.readParcelable(PlusTarifficatorPurchase.class.getClassLoader()), Source.valueOf(parcel.readString()), Type.valueOf(parcel.readString()), (PlusPayInAppReplacementParams) parcel.readParcelable(PlusTarifficatorPurchase.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusTarifficatorPurchase[] newArray(int i) {
            return new PlusTarifficatorPurchase[i];
        }
    }
}
