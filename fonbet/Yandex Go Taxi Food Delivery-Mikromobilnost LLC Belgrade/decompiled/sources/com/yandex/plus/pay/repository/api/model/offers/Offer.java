package com.yandex.plus.pay.repository.api.model.offers;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.smw0;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.x4e;
import defpackage.xvz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001:\u0007FGHIJKLBa\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\tHÆ\u0003¢\u0006\u0004\b*\u0010'J\u0010\u0010+\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b-\u0010.J|\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010 J\u0010\u00102\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b2\u0010\u0018J\u001a\u00105\u001a\u00020\u00122\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b;\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b=\u0010%R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\b?\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010)R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\bB\u0010'R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010C\u001a\u0004\bD\u0010,R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\b\u0013\u0010.¨\u0006M"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/offers/Offer;", "Landroid/os/Parcelable;", "", "positionId", "Lcom/yandex/plus/pay/repository/api/model/offers/Offer$StructureType;", "structureType", "activeTariffId", "Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Tariff;", "tariffOffer", "", "Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Option;", "optionOffers", "Lcom/yandex/plus/pay/repository/api/model/offers/LegalInfo;", "legalInfo", "Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Invoice;", "invoices", "Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Assets;", "assets", "", "isSilentInvoiceAvailable", "<init>", "(Ljava/lang/String;Lcom/yandex/plus/pay/repository/api/model/offers/Offer$StructureType;Ljava/lang/String;Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Tariff;Ljava/util/List;Lcom/yandex/plus/pay/repository/api/model/offers/LegalInfo;Ljava/util/List;Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Assets;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/plus/pay/repository/api/model/offers/Offer$StructureType;", "component3", "component4", "()Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Tariff;", "component5", "()Ljava/util/List;", "component6", "()Lcom/yandex/plus/pay/repository/api/model/offers/LegalInfo;", "component7", "component8", "()Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Assets;", "component9", "()Z", "copy", "(Ljava/lang/String;Lcom/yandex/plus/pay/repository/api/model/offers/Offer$StructureType;Ljava/lang/String;Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Tariff;Ljava/util/List;Lcom/yandex/plus/pay/repository/api/model/offers/LegalInfo;Ljava/util/List;Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Assets;Z)Lcom/yandex/plus/pay/repository/api/model/offers/Offer;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPositionId", "Lcom/yandex/plus/pay/repository/api/model/offers/Offer$StructureType;", "getStructureType", "getActiveTariffId", "Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Tariff;", "getTariffOffer", "Ljava/util/List;", "getOptionOffers", "Lcom/yandex/plus/pay/repository/api/model/offers/LegalInfo;", "getLegalInfo", "getInvoices", "Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Assets;", "getAssets", "Z", "StructureType", "Tariff", "Option", "Invoice", "Plan", "Vendor", "Assets", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Offer implements Parcelable {
    public static final Parcelable.Creator<Offer> CREATOR = new Creator();
    private final String activeTariffId;
    private final Assets assets;
    private final List<Invoice> invoices;
    private final boolean isSilentInvoiceAvailable;
    private final LegalInfo legalInfo;
    private final List<Option> optionOffers;
    private final String positionId;
    private final StructureType structureType;
    private final Tariff tariffOffer;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/offers/Offer$StructureType;", "", "TARIFF", "OPTION", "COMPOSITE", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StructureType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ StructureType[] $VALUES;
        public static final StructureType COMPOSITE;
        public static final StructureType OPTION;
        public static final StructureType TARIFF;

        static {
            StructureType structureType = new StructureType("TARIFF", 0);
            TARIFF = structureType;
            StructureType structureType2 = new StructureType("OPTION", 1);
            OPTION = structureType2;
            StructureType structureType3 = new StructureType("COMPOSITE", 2);
            COMPOSITE = structureType3;
            StructureType[] structureTypeArr = {structureType, structureType2, structureType3};
            $VALUES = structureTypeArr;
            $ENTRIES = kotlin.enums.a.a(structureTypeArr);
        }

        public static StructureType valueOf(String str) {
            return (StructureType) Enum.valueOf(StructureType.class, str);
        }

        public static StructureType[] values() {
            return (StructureType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Vendor;", "", "APP_STORE", "GOOGLE_PLAY", "MICROSOFT_STORE", "NATIVE_YANDEX", "UNKNOWN", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Vendor {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Vendor[] $VALUES;
        public static final Vendor APP_STORE;
        public static final Vendor GOOGLE_PLAY;
        public static final Vendor MICROSOFT_STORE;
        public static final Vendor NATIVE_YANDEX;
        public static final Vendor UNKNOWN;

        static {
            Vendor vendor = new Vendor("APP_STORE", 0);
            APP_STORE = vendor;
            Vendor vendor2 = new Vendor("GOOGLE_PLAY", 1);
            GOOGLE_PLAY = vendor2;
            Vendor vendor3 = new Vendor("MICROSOFT_STORE", 2);
            MICROSOFT_STORE = vendor3;
            Vendor vendor4 = new Vendor("NATIVE_YANDEX", 3);
            NATIVE_YANDEX = vendor4;
            Vendor vendor5 = new Vendor("UNKNOWN", 4);
            UNKNOWN = vendor5;
            Vendor[] vendorArr = {vendor, vendor2, vendor3, vendor4, vendor5};
            $VALUES = vendorArr;
            $ENTRIES = kotlin.enums.a.a(vendorArr);
        }

        public static Vendor valueOf(String str) {
            return (Vendor) Enum.valueOf(Vendor.class, str);
        }

        public static Vendor[] values() {
            return (Vendor[]) $VALUES.clone();
        }
    }

    public Offer(String str, StructureType structureType, String str2, Tariff tariff, List<Option> list, LegalInfo legalInfo, List<Invoice> list2, Assets assets, boolean z) {
        this.positionId = str;
        this.structureType = structureType;
        this.activeTariffId = str2;
        this.tariffOffer = tariff;
        this.optionOffers = list;
        this.legalInfo = legalInfo;
        this.invoices = list2;
        this.assets = assets;
        this.isSilentInvoiceAvailable = z;
    }

    public static /* synthetic */ Offer copy$default(Offer offer, String str, StructureType structureType, String str2, Tariff tariff, List list, LegalInfo legalInfo, List list2, Assets assets, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = offer.positionId;
        }
        if ((i & 2) != 0) {
            structureType = offer.structureType;
        }
        if ((i & 4) != 0) {
            str2 = offer.activeTariffId;
        }
        if ((i & 8) != 0) {
            tariff = offer.tariffOffer;
        }
        if ((i & 16) != 0) {
            list = offer.optionOffers;
        }
        if ((i & 32) != 0) {
            legalInfo = offer.legalInfo;
        }
        if ((i & 64) != 0) {
            list2 = offer.invoices;
        }
        if ((i & 128) != 0) {
            assets = offer.assets;
        }
        if ((i & 256) != 0) {
            z = offer.isSilentInvoiceAvailable;
        }
        Assets assets2 = assets;
        boolean z2 = z;
        LegalInfo legalInfo2 = legalInfo;
        List list3 = list2;
        List list4 = list;
        String str3 = str2;
        return offer.copy(str, structureType, str3, tariff, list4, legalInfo2, list3, assets2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPositionId() {
        return this.positionId;
    }

    /* renamed from: component2, reason: from getter */
    public final StructureType getStructureType() {
        return this.structureType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getActiveTariffId() {
        return this.activeTariffId;
    }

    /* renamed from: component4, reason: from getter */
    public final Tariff getTariffOffer() {
        return this.tariffOffer;
    }

    public final List<Option> component5() {
        return this.optionOffers;
    }

    /* renamed from: component6, reason: from getter */
    public final LegalInfo getLegalInfo() {
        return this.legalInfo;
    }

    public final List<Invoice> component7() {
        return this.invoices;
    }

    /* renamed from: component8, reason: from getter */
    public final Assets getAssets() {
        return this.assets;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsSilentInvoiceAvailable() {
        return this.isSilentInvoiceAvailable;
    }

    public final Offer copy(String positionId, StructureType structureType, String activeTariffId, Tariff tariffOffer, List<Option> optionOffers, LegalInfo legalInfo, List<Invoice> invoices, Assets assets, boolean isSilentInvoiceAvailable) {
        return new Offer(positionId, structureType, activeTariffId, tariffOffer, optionOffers, legalInfo, invoices, assets, isSilentInvoiceAvailable);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Offer)) {
            return false;
        }
        Offer offer = (Offer) other;
        return jl40.l(this.positionId, offer.positionId) && this.structureType == offer.structureType && jl40.l(this.activeTariffId, offer.activeTariffId) && jl40.l(this.tariffOffer, offer.tariffOffer) && jl40.l(this.optionOffers, offer.optionOffers) && jl40.l(this.legalInfo, offer.legalInfo) && jl40.l(this.invoices, offer.invoices) && jl40.l(this.assets, offer.assets) && this.isSilentInvoiceAvailable == offer.isSilentInvoiceAvailable;
    }

    public final String getActiveTariffId() {
        return this.activeTariffId;
    }

    public final Assets getAssets() {
        return this.assets;
    }

    public final List<Invoice> getInvoices() {
        return this.invoices;
    }

    public final LegalInfo getLegalInfo() {
        return this.legalInfo;
    }

    public final List<Option> getOptionOffers() {
        return this.optionOffers;
    }

    public final String getPositionId() {
        return this.positionId;
    }

    public final StructureType getStructureType() {
        return this.structureType;
    }

    public final Tariff getTariffOffer() {
        return this.tariffOffer;
    }

    public int hashCode() {
        int hashCode = (this.structureType.hashCode() + (this.positionId.hashCode() * 31)) * 31;
        String str = this.activeTariffId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Tariff tariff = this.tariffOffer;
        int c = unr0.c((hashCode2 + (tariff == null ? 0 : tariff.hashCode())) * 31, 31, this.optionOffers);
        LegalInfo legalInfo = this.legalInfo;
        return Boolean.hashCode(this.isSilentInvoiceAvailable) + ((this.assets.hashCode() + unr0.c((c + (legalInfo != null ? legalInfo.hashCode() : 0)) * 31, 31, this.invoices)) * 31);
    }

    public final boolean isSilentInvoiceAvailable() {
        return this.isSilentInvoiceAvailable;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Offer(positionId=");
        sb.append(this.positionId);
        sb.append(", structureType=");
        sb.append(this.structureType);
        sb.append(", activeTariffId=");
        sb.append(this.activeTariffId);
        sb.append(", tariffOffer=");
        sb.append(this.tariffOffer);
        sb.append(", optionOffers=");
        sb.append(this.optionOffers);
        sb.append(", legalInfo=");
        sb.append(this.legalInfo);
        sb.append(", invoices=");
        sb.append(this.invoices);
        sb.append(", assets=");
        sb.append(this.assets);
        sb.append(", isSilentInvoiceAvailable=");
        return unr0.u(sb, this.isSilentInvoiceAvailable, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.positionId);
        dest.writeString(this.structureType.name());
        dest.writeString(this.activeTariffId);
        Tariff tariff = this.tariffOffer;
        if (tariff == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            tariff.writeToParcel(dest, flags);
        }
        Iterator t = vfc.t(dest, this.optionOffers);
        while (t.hasNext()) {
            ((Option) t.next()).writeToParcel(dest, flags);
        }
        LegalInfo legalInfo = this.legalInfo;
        if (legalInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            legalInfo.writeToParcel(dest, flags);
        }
        Iterator t2 = vfc.t(dest, this.invoices);
        while (t2.hasNext()) {
            ((Invoice) t2.next()).writeToParcel(dest, flags);
        }
        this.assets.writeToParcel(dest, flags);
        dest.writeInt(this.isSilentInvoiceAvailable ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Plan;", "Landroid/os/Parcelable;", "<init>", "()V", "Intro", "IntroUntil", "Trial", "TrialUntil", "Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Plan$Intro;", "Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Plan$IntroUntil;", "Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Plan$Trial;", "Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Plan$TrialUntil;", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Plan implements Parcelable {
        public /* synthetic */ Plan(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000bJ.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u000b¨\u0006&"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Plan$Intro;", "Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Plan;", "", "period", "Lcom/yandex/plus/pay/repository/api/model/offers/Price;", "price", "", "repetitionCount", "<init>", "(Ljava/lang/String;Lcom/yandex/plus/pay/repository/api/model/offers/Price;I)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/plus/pay/repository/api/model/offers/Price;", "component3", "copy", "(Ljava/lang/String;Lcom/yandex/plus/pay/repository/api/model/offers/Price;I)Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Plan$Intro;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPeriod", "Lcom/yandex/plus/pay/repository/api/model/offers/Price;", "getPrice", CA20Status.STATUS_USER_I, "getRepetitionCount", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Intro extends Plan {
            public static final Parcelable.Creator<Intro> CREATOR = new Creator();
            private final String period;
            private final Price price;
            private final int repetitionCount;

            public Intro(String str, Price price, int i) {
                super(null);
                this.period = str;
                this.price = price;
                this.repetitionCount = i;
            }

            public static /* synthetic */ Intro copy$default(Intro intro, String str, Price price, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = intro.period;
                }
                if ((i2 & 2) != 0) {
                    price = intro.price;
                }
                if ((i2 & 4) != 0) {
                    i = intro.repetitionCount;
                }
                return intro.copy(str, price, i);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPeriod() {
                return this.period;
            }

            /* renamed from: component2, reason: from getter */
            public final Price getPrice() {
                return this.price;
            }

            /* renamed from: component3, reason: from getter */
            public final int getRepetitionCount() {
                return this.repetitionCount;
            }

            public final Intro copy(String period, Price price, int repetitionCount) {
                return new Intro(period, price, repetitionCount);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Intro)) {
                    return false;
                }
                Intro intro = (Intro) other;
                return jl40.l(this.period, intro.period) && jl40.l(this.price, intro.price) && this.repetitionCount == intro.repetitionCount;
            }

            public final String getPeriod() {
                return this.period;
            }

            public final Price getPrice() {
                return this.price;
            }

            public final int getRepetitionCount() {
                return this.repetitionCount;
            }

            public int hashCode() {
                return Integer.hashCode(this.repetitionCount) + ((this.price.hashCode() + (this.period.hashCode() * 31)) * 31);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Intro(period=");
                sb.append(this.period);
                sb.append(", price=");
                sb.append(this.price);
                sb.append(", repetitionCount=");
                return oyr.s(sb, this.repetitionCount, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.period);
                this.price.writeToParcel(dest, flags);
                dest.writeInt(this.repetitionCount);
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Intro> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Intro createFromParcel(Parcel parcel) {
                    return new Intro(parcel.readString(), Price.CREATOR.createFromParcel(parcel), parcel.readInt());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Intro[] newArray(int i) {
                    return new Intro[i];
                }
            }
        }

        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\nJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Plan$IntroUntil;", "Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Plan;", "Lcom/yandex/plus/pay/repository/api/model/offers/Price;", "price", "", "until", "<init>", "(Lcom/yandex/plus/pay/repository/api/model/offers/Price;J)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/repository/api/model/offers/Price;", "component2", "()J", "copy", "(Lcom/yandex/plus/pay/repository/api/model/offers/Price;J)Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Plan$IntroUntil;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/repository/api/model/offers/Price;", "getPrice", "J", "getUntil", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class IntroUntil extends Plan {
            public static final Parcelable.Creator<IntroUntil> CREATOR = new Creator();
            private final Price price;
            private final long until;

            public IntroUntil(Price price, long j) {
                super(null);
                this.price = price;
                this.until = j;
            }

            public static /* synthetic */ IntroUntil copy$default(IntroUntil introUntil, Price price, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    price = introUntil.price;
                }
                if ((i & 2) != 0) {
                    j = introUntil.until;
                }
                return introUntil.copy(price, j);
            }

            /* renamed from: component1, reason: from getter */
            public final Price getPrice() {
                return this.price;
            }

            /* renamed from: component2, reason: from getter */
            public final long getUntil() {
                return this.until;
            }

            public final IntroUntil copy(Price price, long until) {
                return new IntroUntil(price, until);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof IntroUntil)) {
                    return false;
                }
                IntroUntil introUntil = (IntroUntil) other;
                return jl40.l(this.price, introUntil.price) && this.until == introUntil.until;
            }

            public final Price getPrice() {
                return this.price;
            }

            public final long getUntil() {
                return this.until;
            }

            public int hashCode() {
                return Long.hashCode(this.until) + (this.price.hashCode() * 31);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("IntroUntil(price=");
                sb.append(this.price);
                sb.append(", until=");
                return b64.o(sb, this.until, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                this.price.writeToParcel(dest, flags);
                dest.writeLong(this.until);
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<IntroUntil> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final IntroUntil createFromParcel(Parcel parcel) {
                    return new IntroUntil(Price.CREATOR.createFromParcel(parcel), parcel.readLong());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final IntroUntil[] newArray(int i) {
                    return new IntroUntil[i];
                }
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Plan$Trial;", "Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Plan;", "", "period", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Plan$Trial;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPeriod", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Trial extends Plan {
            public static final Parcelable.Creator<Trial> CREATOR = new Creator();
            private final String period;

            public Trial(String str) {
                super(null);
                this.period = str;
            }

            public static /* synthetic */ Trial copy$default(Trial trial, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = trial.period;
                }
                return trial.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPeriod() {
                return this.period;
            }

            public final Trial copy(String period) {
                return new Trial(period);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Trial) && jl40.l(this.period, ((Trial) other).period);
            }

            public final String getPeriod() {
                return this.period;
            }

            public int hashCode() {
                return this.period.hashCode();
            }

            public String toString() {
                return b64.p(new StringBuilder("Trial(period="), this.period, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.period);
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Trial> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Trial createFromParcel(Parcel parcel) {
                    return new Trial(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Trial[] newArray(int i) {
                    return new Trial[i];
                }
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Plan$TrialUntil;", "Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Plan;", "", "until", "<init>", "(J)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()J", "copy", "(J)Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Plan$TrialUntil;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getUntil", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TrialUntil extends Plan {
            public static final Parcelable.Creator<TrialUntil> CREATOR = new Creator();
            private final long until;

            public TrialUntil(long j) {
                super(null);
                this.until = j;
            }

            public static /* synthetic */ TrialUntil copy$default(TrialUntil trialUntil, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = trialUntil.until;
                }
                return trialUntil.copy(j);
            }

            /* renamed from: component1, reason: from getter */
            public final long getUntil() {
                return this.until;
            }

            public final TrialUntil copy(long until) {
                return new TrialUntil(until);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TrialUntil) && this.until == ((TrialUntil) other).until;
            }

            public final long getUntil() {
                return this.until;
            }

            public int hashCode() {
                return Long.hashCode(this.until);
            }

            public String toString() {
                return b64.o(new StringBuilder("TrialUntil(until="), this.until, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeLong(this.until);
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<TrialUntil> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TrialUntil createFromParcel(Parcel parcel) {
                    return new TrialUntil(parcel.readLong());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TrialUntil[] newArray(int i) {
                    return new TrialUntil[i];
                }
            }
        }

        private Plan() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\nJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0012¨\u0006\""}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Assets;", "Landroid/os/Parcelable;", "", "buttonText", "buttonTextWithDetails", "subscriptionName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Assets;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getButtonText", "getButtonTextWithDetails", "getSubscriptionName", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Assets implements Parcelable {
        public static final Parcelable.Creator<Assets> CREATOR = new Creator();
        private final String buttonText;
        private final String buttonTextWithDetails;
        private final String subscriptionName;

        public Assets(String str, String str2, String str3) {
            this.buttonText = str;
            this.buttonTextWithDetails = str2;
            this.subscriptionName = str3;
        }

        public static /* synthetic */ Assets copy$default(Assets assets, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = assets.buttonText;
            }
            if ((i & 2) != 0) {
                str2 = assets.buttonTextWithDetails;
            }
            if ((i & 4) != 0) {
                str3 = assets.subscriptionName;
            }
            return assets.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getButtonText() {
            return this.buttonText;
        }

        /* renamed from: component2, reason: from getter */
        public final String getButtonTextWithDetails() {
            return this.buttonTextWithDetails;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSubscriptionName() {
            return this.subscriptionName;
        }

        public final Assets copy(String buttonText, String buttonTextWithDetails, String subscriptionName) {
            return new Assets(buttonText, buttonTextWithDetails, subscriptionName);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Assets)) {
                return false;
            }
            Assets assets = (Assets) other;
            return jl40.l(this.buttonText, assets.buttonText) && jl40.l(this.buttonTextWithDetails, assets.buttonTextWithDetails) && jl40.l(this.subscriptionName, assets.subscriptionName);
        }

        public final String getButtonText() {
            return this.buttonText;
        }

        public final String getButtonTextWithDetails() {
            return this.buttonTextWithDetails;
        }

        public final String getSubscriptionName() {
            return this.subscriptionName;
        }

        public int hashCode() {
            return this.subscriptionName.hashCode() + unr0.b(this.buttonText.hashCode() * 31, 31, this.buttonTextWithDetails);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Assets(buttonText=");
            sb.append(this.buttonText);
            sb.append(", buttonTextWithDetails=");
            sb.append(this.buttonTextWithDetails);
            sb.append(", subscriptionName=");
            return b64.p(sb, this.subscriptionName, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.buttonText);
            dest.writeString(this.buttonTextWithDetails);
            dest.writeString(this.subscriptionName);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Assets> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Assets createFromParcel(Parcel parcel) {
                return new Assets(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Assets[] newArray(int i) {
                return new Assets[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\nJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Invoice;", "Landroid/os/Parcelable;", "", ClidProvider.TIMESTAMP, "Lcom/yandex/plus/pay/repository/api/model/offers/Price;", "price", "<init>", "(JLcom/yandex/plus/pay/repository/api/model/offers/Price;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()J", "component2", "()Lcom/yandex/plus/pay/repository/api/model/offers/Price;", "copy", "(JLcom/yandex/plus/pay/repository/api/model/offers/Price;)Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Invoice;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestamp", "Lcom/yandex/plus/pay/repository/api/model/offers/Price;", "getPrice", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Invoice implements Parcelable {
        public static final Parcelable.Creator<Invoice> CREATOR = new Creator();
        private final Price price;
        private final long timestamp;

        public Invoice(long j, Price price) {
            this.timestamp = j;
            this.price = price;
        }

        public static /* synthetic */ Invoice copy$default(Invoice invoice, long j, Price price, int i, Object obj) {
            if ((i & 1) != 0) {
                j = invoice.timestamp;
            }
            if ((i & 2) != 0) {
                price = invoice.price;
            }
            return invoice.copy(j, price);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component2, reason: from getter */
        public final Price getPrice() {
            return this.price;
        }

        public final Invoice copy(long timestamp, Price price) {
            return new Invoice(timestamp, price);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Invoice)) {
                return false;
            }
            Invoice invoice = (Invoice) other;
            return this.timestamp == invoice.timestamp && jl40.l(this.price, invoice.price);
        }

        public final Price getPrice() {
            return this.price;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.price.hashCode() + (Long.hashCode(this.timestamp) * 31);
        }

        public String toString() {
            return "Invoice(timestamp=" + this.timestamp + ", price=" + this.price + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeLong(this.timestamp);
            this.price.writeToParcel(dest, flags);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Invoice> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Invoice createFromParcel(Parcel parcel) {
                return new Invoice(parcel.readLong(), Price.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Invoice[] newArray(int i) {
                return new Invoice[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u001e\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0098\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u001fJ\u0010\u00101\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b1\u0010\u0017J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b9\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b:\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b;\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b<\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b=\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b?\u0010&R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b@\u0010\u001fR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010)R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\bD\u0010+R%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bF\u0010-¨\u0006G"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Option;", "Landroid/os/Parcelable;", "", "id", "name", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "text", "additionalText", "Lcom/yandex/plus/pay/repository/api/model/offers/Price;", "commonPrice", "commonPeriod", "", "Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Plan;", "plans", "Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Vendor;", DRMInfoProvider.MediaDRMKeys.VENDOR, "", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/repository/api/model/offers/Price;Ljava/lang/String;Ljava/util/List;Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Vendor;Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lcom/yandex/plus/pay/repository/api/model/offers/Price;", "component8", "component9", "()Ljava/util/List;", "component10", "()Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Vendor;", "component11", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/repository/api/model/offers/Price;Ljava/lang/String;Ljava/util/List;Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Vendor;Ljava/util/Map;)Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Option;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getTitle", "getDescription", "getText", "getAdditionalText", "Lcom/yandex/plus/pay/repository/api/model/offers/Price;", "getCommonPrice", "getCommonPeriod", "Ljava/util/List;", "getPlans", "Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Vendor;", "getVendor", "Ljava/util/Map;", "getPayload", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Option implements Parcelable {
        public static final Parcelable.Creator<Option> CREATOR = new Creator();
        private final String additionalText;
        private final String commonPeriod;
        private final Price commonPrice;
        private final String description;
        private final String id;
        private final String name;
        private final Map<String, String> payload;
        private final List<Plan> plans;
        private final String text;
        private final String title;
        private final Vendor vendor;

        /* JADX WARN: Multi-variable type inference failed */
        public Option(String str, String str2, String str3, String str4, String str5, String str6, Price price, String str7, List<? extends Plan> list, Vendor vendor, Map<String, String> map) {
            this.id = str;
            this.name = str2;
            this.title = str3;
            this.description = str4;
            this.text = str5;
            this.additionalText = str6;
            this.commonPrice = price;
            this.commonPeriod = str7;
            this.plans = list;
            this.vendor = vendor;
            this.payload = map;
        }

        public static /* synthetic */ Option copy$default(Option option, String str, String str2, String str3, String str4, String str5, String str6, Price price, String str7, List list, Vendor vendor, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = option.id;
            }
            if ((i & 2) != 0) {
                str2 = option.name;
            }
            if ((i & 4) != 0) {
                str3 = option.title;
            }
            if ((i & 8) != 0) {
                str4 = option.description;
            }
            if ((i & 16) != 0) {
                str5 = option.text;
            }
            if ((i & 32) != 0) {
                str6 = option.additionalText;
            }
            if ((i & 64) != 0) {
                price = option.commonPrice;
            }
            if ((i & 128) != 0) {
                str7 = option.commonPeriod;
            }
            if ((i & 256) != 0) {
                list = option.plans;
            }
            if ((i & 512) != 0) {
                vendor = option.vendor;
            }
            if ((i & 1024) != 0) {
                map = option.payload;
            }
            Vendor vendor2 = vendor;
            Map map2 = map;
            String str8 = str7;
            List list2 = list;
            String str9 = str6;
            Price price2 = price;
            String str10 = str5;
            String str11 = str3;
            return option.copy(str, str2, str11, str4, str10, str9, price2, str8, list2, vendor2, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final Vendor getVendor() {
            return this.vendor;
        }

        public final Map<String, String> component11() {
            return this.payload;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component5, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component6, reason: from getter */
        public final String getAdditionalText() {
            return this.additionalText;
        }

        /* renamed from: component7, reason: from getter */
        public final Price getCommonPrice() {
            return this.commonPrice;
        }

        /* renamed from: component8, reason: from getter */
        public final String getCommonPeriod() {
            return this.commonPeriod;
        }

        public final List<Plan> component9() {
            return this.plans;
        }

        public final Option copy(String id, String name, String title, String description, String text, String additionalText, Price commonPrice, String commonPeriod, List<? extends Plan> plans, Vendor vendor, Map<String, String> payload) {
            return new Option(id, name, title, description, text, additionalText, commonPrice, commonPeriod, plans, vendor, payload);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Option)) {
                return false;
            }
            Option option = (Option) other;
            return jl40.l(this.id, option.id) && jl40.l(this.name, option.name) && jl40.l(this.title, option.title) && jl40.l(this.description, option.description) && jl40.l(this.text, option.text) && jl40.l(this.additionalText, option.additionalText) && jl40.l(this.commonPrice, option.commonPrice) && jl40.l(this.commonPeriod, option.commonPeriod) && jl40.l(this.plans, option.plans) && this.vendor == option.vendor && jl40.l(this.payload, option.payload);
        }

        public final String getAdditionalText() {
            return this.additionalText;
        }

        public final String getCommonPeriod() {
            return this.commonPeriod;
        }

        public final Price getCommonPrice() {
            return this.commonPrice;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public final Map<String, String> getPayload() {
            return this.payload;
        }

        public final List<Plan> getPlans() {
            return this.plans;
        }

        public final String getText() {
            return this.text;
        }

        public final String getTitle() {
            return this.title;
        }

        public final Vendor getVendor() {
            return this.vendor;
        }

        public int hashCode() {
            int b = unr0.b(unr0.b(this.id.hashCode() * 31, 31, this.name), 31, this.title);
            String str = this.description;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.text;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.additionalText;
            int hashCode3 = (this.vendor.hashCode() + unr0.c(unr0.b((this.commonPrice.hashCode() + ((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31, this.commonPeriod), 31, this.plans)) * 31;
            Map<String, String> map = this.payload;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Option(id=");
            sb.append(this.id);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", description=");
            sb.append(this.description);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", additionalText=");
            sb.append(this.additionalText);
            sb.append(", commonPrice=");
            sb.append(this.commonPrice);
            sb.append(", commonPeriod=");
            sb.append(this.commonPeriod);
            sb.append(", plans=");
            sb.append(this.plans);
            sb.append(", vendor=");
            sb.append(this.vendor);
            sb.append(", payload=");
            return smw0.n(sb, this.payload, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.id);
            dest.writeString(this.name);
            dest.writeString(this.title);
            dest.writeString(this.description);
            dest.writeString(this.text);
            dest.writeString(this.additionalText);
            this.commonPrice.writeToParcel(dest, flags);
            dest.writeString(this.commonPeriod);
            Iterator t = vfc.t(dest, this.plans);
            while (t.hasNext()) {
                dest.writeParcelable((Parcelable) t.next(), flags);
            }
            dest.writeString(this.vendor.name());
            Map<String, String> map = this.payload;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator s = x4e.s(dest, 1, map);
            while (s.hasNext()) {
                Map.Entry entry = (Map.Entry) s.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Option> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Option createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                Price createFromParcel = Price.CREATOR.createFromParcel(parcel);
                String readString7 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = vfc.e(Option.class, parcel, arrayList, i2, 1);
                }
                Vendor valueOf = Vendor.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt2 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                    while (i != readInt2) {
                        i = xvz.b(parcel, linkedHashMap2, parcel.readString(), i, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new Option(readString, readString2, readString3, readString4, readString5, readString6, createFromParcel, readString7, arrayList, valueOf, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Option[] newArray(int i) {
                return new Option[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u001e\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0098\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u001fJ\u0010\u00101\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b1\u0010\u0017J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b9\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b:\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b;\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b<\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b=\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b?\u0010&R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b@\u0010\u001fR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010)R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\bD\u0010+R%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bF\u0010-¨\u0006G"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Tariff;", "Landroid/os/Parcelable;", "", "id", "name", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "text", "additionalText", "Lcom/yandex/plus/pay/repository/api/model/offers/Price;", "commonPrice", "commonPeriod", "", "Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Plan;", "plans", "Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Vendor;", DRMInfoProvider.MediaDRMKeys.VENDOR, "", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/repository/api/model/offers/Price;Ljava/lang/String;Ljava/util/List;Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Vendor;Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lcom/yandex/plus/pay/repository/api/model/offers/Price;", "component8", "component9", "()Ljava/util/List;", "component10", "()Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Vendor;", "component11", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/repository/api/model/offers/Price;Ljava/lang/String;Ljava/util/List;Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Vendor;Ljava/util/Map;)Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Tariff;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getTitle", "getDescription", "getText", "getAdditionalText", "Lcom/yandex/plus/pay/repository/api/model/offers/Price;", "getCommonPrice", "getCommonPeriod", "Ljava/util/List;", "getPlans", "Lcom/yandex/plus/pay/repository/api/model/offers/Offer$Vendor;", "getVendor", "Ljava/util/Map;", "getPayload", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Tariff implements Parcelable {
        public static final Parcelable.Creator<Tariff> CREATOR = new Creator();
        private final String additionalText;
        private final String commonPeriod;
        private final Price commonPrice;
        private final String description;
        private final String id;
        private final String name;
        private final Map<String, String> payload;
        private final List<Plan> plans;
        private final String text;
        private final String title;
        private final Vendor vendor;

        /* JADX WARN: Multi-variable type inference failed */
        public Tariff(String str, String str2, String str3, String str4, String str5, String str6, Price price, String str7, List<? extends Plan> list, Vendor vendor, Map<String, String> map) {
            this.id = str;
            this.name = str2;
            this.title = str3;
            this.description = str4;
            this.text = str5;
            this.additionalText = str6;
            this.commonPrice = price;
            this.commonPeriod = str7;
            this.plans = list;
            this.vendor = vendor;
            this.payload = map;
        }

        public static /* synthetic */ Tariff copy$default(Tariff tariff, String str, String str2, String str3, String str4, String str5, String str6, Price price, String str7, List list, Vendor vendor, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tariff.id;
            }
            if ((i & 2) != 0) {
                str2 = tariff.name;
            }
            if ((i & 4) != 0) {
                str3 = tariff.title;
            }
            if ((i & 8) != 0) {
                str4 = tariff.description;
            }
            if ((i & 16) != 0) {
                str5 = tariff.text;
            }
            if ((i & 32) != 0) {
                str6 = tariff.additionalText;
            }
            if ((i & 64) != 0) {
                price = tariff.commonPrice;
            }
            if ((i & 128) != 0) {
                str7 = tariff.commonPeriod;
            }
            if ((i & 256) != 0) {
                list = tariff.plans;
            }
            if ((i & 512) != 0) {
                vendor = tariff.vendor;
            }
            if ((i & 1024) != 0) {
                map = tariff.payload;
            }
            Vendor vendor2 = vendor;
            Map map2 = map;
            String str8 = str7;
            List list2 = list;
            String str9 = str6;
            Price price2 = price;
            String str10 = str5;
            String str11 = str3;
            return tariff.copy(str, str2, str11, str4, str10, str9, price2, str8, list2, vendor2, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final Vendor getVendor() {
            return this.vendor;
        }

        public final Map<String, String> component11() {
            return this.payload;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component5, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component6, reason: from getter */
        public final String getAdditionalText() {
            return this.additionalText;
        }

        /* renamed from: component7, reason: from getter */
        public final Price getCommonPrice() {
            return this.commonPrice;
        }

        /* renamed from: component8, reason: from getter */
        public final String getCommonPeriod() {
            return this.commonPeriod;
        }

        public final List<Plan> component9() {
            return this.plans;
        }

        public final Tariff copy(String id, String name, String title, String description, String text, String additionalText, Price commonPrice, String commonPeriod, List<? extends Plan> plans, Vendor vendor, Map<String, String> payload) {
            return new Tariff(id, name, title, description, text, additionalText, commonPrice, commonPeriod, plans, vendor, payload);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tariff)) {
                return false;
            }
            Tariff tariff = (Tariff) other;
            return jl40.l(this.id, tariff.id) && jl40.l(this.name, tariff.name) && jl40.l(this.title, tariff.title) && jl40.l(this.description, tariff.description) && jl40.l(this.text, tariff.text) && jl40.l(this.additionalText, tariff.additionalText) && jl40.l(this.commonPrice, tariff.commonPrice) && jl40.l(this.commonPeriod, tariff.commonPeriod) && jl40.l(this.plans, tariff.plans) && this.vendor == tariff.vendor && jl40.l(this.payload, tariff.payload);
        }

        public final String getAdditionalText() {
            return this.additionalText;
        }

        public final String getCommonPeriod() {
            return this.commonPeriod;
        }

        public final Price getCommonPrice() {
            return this.commonPrice;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public final Map<String, String> getPayload() {
            return this.payload;
        }

        public final List<Plan> getPlans() {
            return this.plans;
        }

        public final String getText() {
            return this.text;
        }

        public final String getTitle() {
            return this.title;
        }

        public final Vendor getVendor() {
            return this.vendor;
        }

        public int hashCode() {
            int b = unr0.b(unr0.b(this.id.hashCode() * 31, 31, this.name), 31, this.title);
            String str = this.description;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.text;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.additionalText;
            int hashCode3 = (this.vendor.hashCode() + unr0.c(unr0.b((this.commonPrice.hashCode() + ((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31, this.commonPeriod), 31, this.plans)) * 31;
            Map<String, String> map = this.payload;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Tariff(id=");
            sb.append(this.id);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", description=");
            sb.append(this.description);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", additionalText=");
            sb.append(this.additionalText);
            sb.append(", commonPrice=");
            sb.append(this.commonPrice);
            sb.append(", commonPeriod=");
            sb.append(this.commonPeriod);
            sb.append(", plans=");
            sb.append(this.plans);
            sb.append(", vendor=");
            sb.append(this.vendor);
            sb.append(", payload=");
            return smw0.n(sb, this.payload, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.id);
            dest.writeString(this.name);
            dest.writeString(this.title);
            dest.writeString(this.description);
            dest.writeString(this.text);
            dest.writeString(this.additionalText);
            this.commonPrice.writeToParcel(dest, flags);
            dest.writeString(this.commonPeriod);
            Iterator t = vfc.t(dest, this.plans);
            while (t.hasNext()) {
                dest.writeParcelable((Parcelable) t.next(), flags);
            }
            dest.writeString(this.vendor.name());
            Map<String, String> map = this.payload;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator s = x4e.s(dest, 1, map);
            while (s.hasNext()) {
                Map.Entry entry = (Map.Entry) s.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Tariff> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Tariff createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                Price createFromParcel = Price.CREATOR.createFromParcel(parcel);
                String readString7 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = vfc.e(Tariff.class, parcel, arrayList, i2, 1);
                }
                Vendor valueOf = Vendor.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt2 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                    while (i != readInt2) {
                        i = xvz.b(parcel, linkedHashMap2, parcel.readString(), i, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new Tariff(readString, readString2, readString3, readString4, readString5, readString6, createFromParcel, readString7, arrayList, valueOf, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Tariff[] newArray(int i) {
                return new Tariff[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Offer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Offer createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            StructureType valueOf = StructureType.valueOf(parcel.readString());
            String readString2 = parcel.readString();
            Tariff createFromParcel = parcel.readInt() == 0 ? null : Tariff.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = oo31.d(Option.CREATOR, parcel, arrayList, i, 1);
            }
            LegalInfo createFromParcel2 = parcel.readInt() != 0 ? LegalInfo.CREATOR.createFromParcel(parcel) : null;
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = oo31.d(Invoice.CREATOR, parcel, arrayList2, i2, 1);
            }
            return new Offer(readString, valueOf, readString2, createFromParcel, arrayList, createFromParcel2, arrayList2, Assets.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Offer[] newArray(int i) {
            return new Offer[i];
        }
    }
}
