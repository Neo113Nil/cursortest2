package com.yandex.plus.pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import defpackage.auu0;
import defpackage.b64;
import defpackage.cad0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.k8u;
import defpackage.lfx;
import defpackage.o4o;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.p53;
import defpackage.psq0;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.smw0;
import defpackage.ssp0;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.x4e;
import defpackage.xvz;
import defpackage.yjd;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J>\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\rJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0015R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b(\u0010\u0015¨\u0006*"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers;", "Landroid/os/Parcelable;", "", "sessionId", "offersBatchId", "", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "offers", "target", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSessionId", "getOffersBatchId", "Ljava/util/List;", "getOffers", "getTarget", "Offer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusPayCompositeOffers implements Parcelable {
    public static final Parcelable.Creator<PlusPayCompositeOffers> CREATOR = new Creator();
    private final List<Offer> offers;
    private final String offersBatchId;
    private final String sessionId;
    private final String target;

    @Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 [2\u00020\u0001:\n\\]^_`abcd[Bs\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u0091\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0019¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010'J\u0012\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b/\u00100J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\tHÆ\u0003¢\u0006\u0004\b1\u0010.J\u0010\u00102\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b6\u00103J\u0010\u00107\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b7\u00108J\u0090\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b;\u0010'J\u0010\u0010<\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b<\u0010\u001fJ\u001a\u0010?\u001a\u00020\u00102\b\u0010>\u001a\u0004\u0018\u00010=HÖ\u0003¢\u0006\u0004\b?\u0010@J'\u0010H\u001a\u00020#2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020DH\u0001¢\u0006\u0004\bF\u0010GR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010I\u001a\u0004\bJ\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010K\u001a\u0004\bL\u0010)R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010I\u001a\u0004\bM\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010N\u001a\u0004\bO\u0010,R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010P\u001a\u0004\bQ\u0010.R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010R\u001a\u0004\bS\u00100R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010P\u001a\u0004\bT\u0010.R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010U\u001a\u0004\b\u0011\u00103R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010V\u001a\u0004\bW\u00105R\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0014\u0010U\u001a\u0004\bX\u00103R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010Y\u001a\u0004\bZ\u00108¨\u0006e"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "Landroid/os/Parcelable;", "", "positionId", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$StructureType;", "structureType", "activeTariffId", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;", "tariffOffer", "", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Option;", "optionOffers", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;", "legalInfo", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Invoice;", "invoices", "", "isUpsale", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Assets;", "assets", "canAttemptSilentPurchase", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Meta;", Constants.REFERRER_API_META, "<init>", "(Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$StructureType;Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;Ljava/util/List;Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;Ljava/util/List;ZLcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Assets;ZLcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Meta;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$StructureType;Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;Ljava/util/List;Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;Ljava/util/List;ZLcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Assets;ZLcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Meta;Lpsq0;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$StructureType;", "component3", "component4", "()Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;", "component5", "()Ljava/util/List;", "component6", "()Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;", "component7", "component8", "()Z", "component9", "()Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Assets;", "component10", "component11", "()Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Meta;", "copy", "(Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$StructureType;Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;Ljava/util/List;Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;Ljava/util/List;ZLcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Assets;ZLcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Meta;)Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getPositionId", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$StructureType;", "getStructureType", "getActiveTariffId", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;", "getTariffOffer", "Ljava/util/List;", "getOptionOffers", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;", "getLegalInfo", "getInvoices", "Z", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Assets;", "getAssets", "getCanAttemptSilentPurchase", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Meta;", "getMeta", "Companion", "StructureType", "Tariff", "Option", "Invoice", "Plan", "Vendor", "Assets", "Meta", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Offer implements Parcelable {
        private static final i3y[] $childSerializers;
        private final String activeTariffId;
        private final Assets assets;
        private final boolean canAttemptSilentPurchase;
        private final List<Invoice> invoices;
        private final boolean isUpsale;
        private final PlusPayLegalInfo legalInfo;
        private final Meta meta;
        private final List<Option> optionOffers;
        private final String positionId;
        private final StructureType structureType;
        private final Tariff tariffOffer;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Offer> CREATOR = new Creator();

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0005\u0012\u0013\u0014\u0015\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan;", "Landroid/os/Parcelable;", "<init>", "()V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "Intro", "IntroUntil", "Trial", "TrialUntil", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Intro;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$IntroUntil;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Trial;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$TrialUntil;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @gsq0
        public static abstract class Plan implements Parcelable {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final i3y $cachedSerializer$delegate = a.b(LazyThreadSafetyMode.PUBLICATION, new cad0(25));

            public /* synthetic */ Plan(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new ssp0("com.yandex.plus.pay.api.model.PlusPayCompositeOffers.Offer.Plan", qoi0.a(Plan.class), new lfx[]{qoi0.a(Intro.class), qoi0.a(IntroUntil.class), qoi0.a(Trial.class), qoi0.a(TrialUntil.class)}, new KSerializer[]{PlusPayCompositeOffers$Offer$Plan$Intro$$serializer.INSTANCE, PlusPayCompositeOffers$Offer$Plan$IntroUntil$$serializer.INSTANCE, PlusPayCompositeOffers$Offer$Plan$Trial$$serializer.INSTANCE, PlusPayCompositeOffers$Offer$Plan$TrialUntil$$serializer.INSTANCE}, new Annotation[0]);
            }

            public static final /* synthetic */ void write$Self(Plan self, yjd output, SerialDescriptor serialDesc) {
            }

            @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010\u0018J.\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b&\u0010\u0018J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u0018¨\u00064"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Intro;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan;", "", "period", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "price", "", "repetitionCount", "<init>", "(Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayPrice;I)V", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayPrice;ILpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Intro;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "component3", "copy", "(Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayPrice;I)Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Intro;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPeriod", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "getPrice", CA20Status.STATUS_USER_I, "getRepetitionCount", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            @gsq0
            public static final /* data */ class Intro extends Plan {
                private final String period;
                private final PlusPayPrice price;
                private final int repetitionCount;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final Parcelable.Creator<Intro> CREATOR = new Creator();

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ Intro(int i, String str, PlusPayPrice plusPayPrice, int i2, psq0 psq0Var) {
                    super(i, psq0Var);
                    if (7 != (i & 7)) {
                        qje.Z(i, 7, PlusPayCompositeOffers$Offer$Plan$Intro$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.period = str;
                    this.price = plusPayPrice;
                    this.repetitionCount = i2;
                }

                public static /* synthetic */ Intro copy$default(Intro intro, String str, PlusPayPrice plusPayPrice, int i, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        str = intro.period;
                    }
                    if ((i2 & 2) != 0) {
                        plusPayPrice = intro.price;
                    }
                    if ((i2 & 4) != 0) {
                        i = intro.repetitionCount;
                    }
                    return intro.copy(str, plusPayPrice, i);
                }

                public static final /* synthetic */ void write$Self$pay_sdk_release(Intro self, yjd output, SerialDescriptor serialDesc) {
                    Plan.write$Self(self, output, serialDesc);
                    output.o(serialDesc, 0, self.period);
                    output.e(serialDesc, 1, PlusPayPrice$$serializer.INSTANCE, self.price);
                    output.A(2, self.repetitionCount, serialDesc);
                }

                /* renamed from: component1, reason: from getter */
                public final String getPeriod() {
                    return this.period;
                }

                /* renamed from: component2, reason: from getter */
                public final PlusPayPrice getPrice() {
                    return this.price;
                }

                /* renamed from: component3, reason: from getter */
                public final int getRepetitionCount() {
                    return this.repetitionCount;
                }

                public final Intro copy(String period, PlusPayPrice price, int repetitionCount) {
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

                public final PlusPayPrice getPrice() {
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
                    dest.writeParcelable(this.price, flags);
                    dest.writeInt(this.repetitionCount);
                }

                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Intro$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Intro;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public final KSerializer serializer() {
                        return PlusPayCompositeOffers$Offer$Plan$Intro$$serializer.INSTANCE;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }
                }

                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Intro> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Intro createFromParcel(Parcel parcel) {
                        return new Intro(parcel.readString(), (PlusPayPrice) parcel.readParcelable(Intro.class.getClassLoader()), parcel.readInt());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Intro[] newArray(int i) {
                        return new Intro[i];
                    }
                }

                public Intro(String str, PlusPayPrice plusPayPrice, int i) {
                    super(null);
                    this.period = str;
                    this.price = plusPayPrice;
                    this.repetitionCount = i;
                }
            }

            @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J$\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010 ¨\u00062"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$IntroUntil;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan;", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "price", "", "until", "<init>", "(Lcom/yandex/plus/pay/api/model/PlusPayPrice;J)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILcom/yandex/plus/pay/api/model/PlusPayPrice;JLpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$IntroUntil;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "component2", "()J", "copy", "(Lcom/yandex/plus/pay/api/model/PlusPayPrice;J)Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$IntroUntil;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "getPrice", "J", "getUntil", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            @gsq0
            public static final /* data */ class IntroUntil extends Plan {
                private final PlusPayPrice price;
                private final long until;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final Parcelable.Creator<IntroUntil> CREATOR = new Creator();

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ IntroUntil(int i, PlusPayPrice plusPayPrice, long j, psq0 psq0Var) {
                    super(i, psq0Var);
                    if (3 != (i & 3)) {
                        qje.Z(i, 3, PlusPayCompositeOffers$Offer$Plan$IntroUntil$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.price = plusPayPrice;
                    this.until = j;
                }

                public static /* synthetic */ IntroUntil copy$default(IntroUntil introUntil, PlusPayPrice plusPayPrice, long j, int i, Object obj) {
                    if ((i & 1) != 0) {
                        plusPayPrice = introUntil.price;
                    }
                    if ((i & 2) != 0) {
                        j = introUntil.until;
                    }
                    return introUntil.copy(plusPayPrice, j);
                }

                public static final /* synthetic */ void write$Self$pay_sdk_release(IntroUntil self, yjd output, SerialDescriptor serialDesc) {
                    Plan.write$Self(self, output, serialDesc);
                    output.e(serialDesc, 0, PlusPayPrice$$serializer.INSTANCE, self.price);
                    output.s(serialDesc, 1, self.until);
                }

                /* renamed from: component1, reason: from getter */
                public final PlusPayPrice getPrice() {
                    return this.price;
                }

                /* renamed from: component2, reason: from getter */
                public final long getUntil() {
                    return this.until;
                }

                public final IntroUntil copy(PlusPayPrice price, long until) {
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

                public final PlusPayPrice getPrice() {
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
                    dest.writeParcelable(this.price, flags);
                    dest.writeLong(this.until);
                }

                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$IntroUntil$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$IntroUntil;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public final KSerializer serializer() {
                        return PlusPayCompositeOffers$Offer$Plan$IntroUntil$$serializer.INSTANCE;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }
                }

                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<IntroUntil> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final IntroUntil createFromParcel(Parcel parcel) {
                        return new IntroUntil((PlusPayPrice) parcel.readParcelable(IntroUntil.class.getClassLoader()), parcel.readLong());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final IntroUntil[] newArray(int i) {
                        return new IntroUntil[i];
                    }
                }

                public IntroUntil(PlusPayPrice plusPayPrice, long j) {
                    super(null);
                    this.price = plusPayPrice;
                    this.until = j;
                }
            }

            @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u0015J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u001c¨\u0006*"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Trial;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan;", "", "period", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Trial;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Trial;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPeriod", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            @gsq0
            public static final /* data */ class Trial extends Plan {
                private final String period;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final Parcelable.Creator<Trial> CREATOR = new Creator();

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ Trial(int i, String str, psq0 psq0Var) {
                    super(i, psq0Var);
                    if (1 != (i & 1)) {
                        qje.Z(i, 1, PlusPayCompositeOffers$Offer$Plan$Trial$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.period = str;
                }

                public static /* synthetic */ Trial copy$default(Trial trial, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = trial.period;
                    }
                    return trial.copy(str);
                }

                public static final /* synthetic */ void write$Self$pay_sdk_release(Trial self, yjd output, SerialDescriptor serialDesc) {
                    Plan.write$Self(self, output, serialDesc);
                    output.o(serialDesc, 0, self.period);
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

                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Trial$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Trial;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public final KSerializer serializer() {
                        return PlusPayCompositeOffers$Offer$Plan$Trial$$serializer.INSTANCE;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }
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

                public Trial(String str) {
                    super(null);
                    this.period = str;
                }
            }

            @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001c¨\u0006,"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$TrialUntil;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan;", "", "until", "<init>", "(J)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(IJLpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$TrialUntil;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()J", "copy", "(J)Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$TrialUntil;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getUntil", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            @gsq0
            public static final /* data */ class TrialUntil extends Plan {
                private final long until;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final Parcelable.Creator<TrialUntil> CREATOR = new Creator();

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ TrialUntil(int i, long j, psq0 psq0Var) {
                    super(i, psq0Var);
                    if (1 != (i & 1)) {
                        qje.Z(i, 1, PlusPayCompositeOffers$Offer$Plan$TrialUntil$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.until = j;
                }

                public static /* synthetic */ TrialUntil copy$default(TrialUntil trialUntil, long j, int i, Object obj) {
                    if ((i & 1) != 0) {
                        j = trialUntil.until;
                    }
                    return trialUntil.copy(j);
                }

                public static final /* synthetic */ void write$Self$pay_sdk_release(TrialUntil self, yjd output, SerialDescriptor serialDesc) {
                    Plan.write$Self(self, output, serialDesc);
                    output.s(serialDesc, 0, self.until);
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

                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$TrialUntil$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$TrialUntil;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public final KSerializer serializer() {
                        return PlusPayCompositeOffers$Offer$Plan$TrialUntil$$serializer.INSTANCE;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }
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

                public TrialUntil(long j) {
                    super(null);
                    this.until = j;
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                private final /* synthetic */ KSerializer get$cachedSerializer() {
                    return (KSerializer) Plan.$cachedSerializer$delegate.getValue();
                }

                public final KSerializer serializer() {
                    return get$cachedSerializer();
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            private Plan() {
            }

            public /* synthetic */ Plan(int i, psq0 psq0Var) {
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new i3y[]{null, a.b(lazyThreadSafetyMode, new cad0(19)), null, null, a.b(lazyThreadSafetyMode, new cad0(20)), null, a.b(lazyThreadSafetyMode, new cad0(21)), null, null, null, null};
        }

        public /* synthetic */ Offer(int i, String str, StructureType structureType, String str2, Tariff tariff, List list, PlusPayLegalInfo plusPayLegalInfo, List list2, boolean z, Assets assets, boolean z2, Meta meta, psq0 psq0Var) {
            if (2047 != (i & 2047)) {
                qje.Z(i, 2047, PlusPayCompositeOffers$Offer$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.positionId = str;
            this.structureType = structureType;
            this.activeTariffId = str2;
            this.tariffOffer = tariff;
            this.optionOffers = list;
            this.legalInfo = plusPayLegalInfo;
            this.invoices = list2;
            this.isUpsale = z;
            this.assets = assets;
            this.canAttemptSilentPurchase = z2;
            this.meta = meta;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _childSerializers$_anonymous_() {
            return new o4o("com.yandex.plus.pay.api.model.PlusPayCompositeOffers.Offer.StructureType", (Enum[]) StructureType.values());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new p53(PlusPayCompositeOffers$Offer$Option$$serializer.INSTANCE, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new p53(PlusPayCompositeOffers$Offer$Invoice$$serializer.INSTANCE, 0);
        }

        public static /* synthetic */ Offer copy$default(Offer offer, String str, StructureType structureType, String str2, Tariff tariff, List list, PlusPayLegalInfo plusPayLegalInfo, List list2, boolean z, Assets assets, boolean z2, Meta meta, int i, Object obj) {
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
                plusPayLegalInfo = offer.legalInfo;
            }
            if ((i & 64) != 0) {
                list2 = offer.invoices;
            }
            if ((i & 128) != 0) {
                z = offer.isUpsale;
            }
            if ((i & 256) != 0) {
                assets = offer.assets;
            }
            if ((i & 512) != 0) {
                z2 = offer.canAttemptSilentPurchase;
            }
            if ((i & 1024) != 0) {
                meta = offer.meta;
            }
            boolean z3 = z2;
            Meta meta2 = meta;
            boolean z4 = z;
            Assets assets2 = assets;
            PlusPayLegalInfo plusPayLegalInfo2 = plusPayLegalInfo;
            List list3 = list2;
            List list4 = list;
            String str3 = str2;
            return offer.copy(str, structureType, str3, tariff, list4, plusPayLegalInfo2, list3, z4, assets2, z3, meta2);
        }

        public static final /* synthetic */ void write$Self$pay_sdk_release(Offer self, yjd output, SerialDescriptor serialDesc) {
            i3y[] i3yVarArr = $childSerializers;
            output.o(serialDesc, 0, self.positionId);
            output.e(serialDesc, 1, (KSerializer) i3yVarArr[1].getValue(), self.structureType);
            output.g(serialDesc, 2, auu0.a, self.activeTariffId);
            output.g(serialDesc, 3, PlusPayCompositeOffers$Offer$Tariff$$serializer.INSTANCE, self.tariffOffer);
            output.e(serialDesc, 4, (KSerializer) i3yVarArr[4].getValue(), self.optionOffers);
            output.g(serialDesc, 5, PlusPayLegalInfo$$serializer.INSTANCE, self.legalInfo);
            output.e(serialDesc, 6, (KSerializer) i3yVarArr[6].getValue(), self.invoices);
            output.n(serialDesc, 7, self.isUpsale);
            output.e(serialDesc, 8, PlusPayCompositeOffers$Offer$Assets$$serializer.INSTANCE, self.assets);
            output.n(serialDesc, 9, self.canAttemptSilentPurchase);
            output.e(serialDesc, 10, PlusPayCompositeOffers$Offer$Meta$$serializer.INSTANCE, self.meta);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPositionId() {
            return this.positionId;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getCanAttemptSilentPurchase() {
            return this.canAttemptSilentPurchase;
        }

        /* renamed from: component11, reason: from getter */
        public final Meta getMeta() {
            return this.meta;
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
        public final PlusPayLegalInfo getLegalInfo() {
            return this.legalInfo;
        }

        public final List<Invoice> component7() {
            return this.invoices;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsUpsale() {
            return this.isUpsale;
        }

        /* renamed from: component9, reason: from getter */
        public final Assets getAssets() {
            return this.assets;
        }

        public final Offer copy(String positionId, StructureType structureType, String activeTariffId, Tariff tariffOffer, List<Option> optionOffers, PlusPayLegalInfo legalInfo, List<Invoice> invoices, boolean isUpsale, Assets assets, boolean canAttemptSilentPurchase, Meta meta) {
            return new Offer(positionId, structureType, activeTariffId, tariffOffer, optionOffers, legalInfo, invoices, isUpsale, assets, canAttemptSilentPurchase, meta);
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
            return jl40.l(this.positionId, offer.positionId) && this.structureType == offer.structureType && jl40.l(this.activeTariffId, offer.activeTariffId) && jl40.l(this.tariffOffer, offer.tariffOffer) && jl40.l(this.optionOffers, offer.optionOffers) && jl40.l(this.legalInfo, offer.legalInfo) && jl40.l(this.invoices, offer.invoices) && this.isUpsale == offer.isUpsale && jl40.l(this.assets, offer.assets) && this.canAttemptSilentPurchase == offer.canAttemptSilentPurchase && jl40.l(this.meta, offer.meta);
        }

        public final String getActiveTariffId() {
            return this.activeTariffId;
        }

        public final Assets getAssets() {
            return this.assets;
        }

        public final boolean getCanAttemptSilentPurchase() {
            return this.canAttemptSilentPurchase;
        }

        public final List<Invoice> getInvoices() {
            return this.invoices;
        }

        public final PlusPayLegalInfo getLegalInfo() {
            return this.legalInfo;
        }

        public final Meta getMeta() {
            return this.meta;
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
            PlusPayLegalInfo plusPayLegalInfo = this.legalInfo;
            return this.meta.hashCode() + unr0.e((this.assets.hashCode() + unr0.e(unr0.c((c + (plusPayLegalInfo != null ? plusPayLegalInfo.hashCode() : 0)) * 31, 31, this.invoices), 31, this.isUpsale)) * 31, 31, this.canAttemptSilentPurchase);
        }

        public final boolean isUpsale() {
            return this.isUpsale;
        }

        public String toString() {
            return "Offer(positionId=" + this.positionId + ", structureType=" + this.structureType + ", activeTariffId=" + this.activeTariffId + ", tariffOffer=" + this.tariffOffer + ", optionOffers=" + this.optionOffers + ", legalInfo=" + this.legalInfo + ", invoices=" + this.invoices + ", isUpsale=" + this.isUpsale + ", assets=" + this.assets + ", canAttemptSilentPurchase=" + this.canAttemptSilentPurchase + ", meta=" + this.meta + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.positionId);
            this.structureType.writeToParcel(dest, flags);
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
            PlusPayLegalInfo plusPayLegalInfo = this.legalInfo;
            if (plusPayLegalInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                plusPayLegalInfo.writeToParcel(dest, flags);
            }
            Iterator t2 = vfc.t(dest, this.invoices);
            while (t2.hasNext()) {
                ((Invoice) t2.next()).writeToParcel(dest, flags);
            }
            dest.writeInt(this.isUpsale ? 1 : 0);
            this.assets.writeToParcel(dest, flags);
            dest.writeInt(this.canAttemptSilentPurchase ? 1 : 0);
            this.meta.writeToParcel(dest, flags);
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ.\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001e¨\u00060"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Assets;", "Landroid/os/Parcelable;", "", "buttonText", "buttonTextWithDetails", "subscriptionName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Assets;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Assets;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getButtonText", "getButtonTextWithDetails", "getSubscriptionName", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @gsq0
        public static final /* data */ class Assets implements Parcelable {
            private final String buttonText;
            private final String buttonTextWithDetails;
            private final String subscriptionName;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<Assets> CREATOR = new Creator();

            public /* synthetic */ Assets(int i, String str, String str2, String str3, psq0 psq0Var) {
                if (7 != (i & 7)) {
                    qje.Z(i, 7, PlusPayCompositeOffers$Offer$Assets$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
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

            public static final /* synthetic */ void write$Self$pay_sdk_release(Assets self, yjd output, SerialDescriptor serialDesc) {
                output.o(serialDesc, 0, self.buttonText);
                output.o(serialDesc, 1, self.buttonTextWithDetails);
                output.o(serialDesc, 2, self.subscriptionName);
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

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Assets$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Assets;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public final KSerializer serializer() {
                    return PlusPayCompositeOffers$Offer$Assets$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
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

            public Assets(String str, String str2, String str3) {
                this.buttonText = str;
                this.buttonTextWithDetails = str2;
                this.subscriptionName = str3;
            }
        }

        @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J$\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010 ¨\u00062"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Invoice;", "Landroid/os/Parcelable;", "", ClidProvider.TIMESTAMP, "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "price", "<init>", "(JLcom/yandex/plus/pay/api/model/PlusPayPrice;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(IJLcom/yandex/plus/pay/api/model/PlusPayPrice;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Invoice;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()J", "component2", "()Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "copy", "(JLcom/yandex/plus/pay/api/model/PlusPayPrice;)Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Invoice;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestamp", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "getPrice", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @gsq0
        public static final /* data */ class Invoice implements Parcelable {
            private final PlusPayPrice price;
            private final long timestamp;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<Invoice> CREATOR = new Creator();

            public /* synthetic */ Invoice(int i, long j, PlusPayPrice plusPayPrice, psq0 psq0Var) {
                if (3 != (i & 3)) {
                    qje.Z(i, 3, PlusPayCompositeOffers$Offer$Invoice$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.timestamp = j;
                this.price = plusPayPrice;
            }

            public static /* synthetic */ Invoice copy$default(Invoice invoice, long j, PlusPayPrice plusPayPrice, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = invoice.timestamp;
                }
                if ((i & 2) != 0) {
                    plusPayPrice = invoice.price;
                }
                return invoice.copy(j, plusPayPrice);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_release(Invoice self, yjd output, SerialDescriptor serialDesc) {
                output.s(serialDesc, 0, self.timestamp);
                output.e(serialDesc, 1, PlusPayPrice$$serializer.INSTANCE, self.price);
            }

            /* renamed from: component1, reason: from getter */
            public final long getTimestamp() {
                return this.timestamp;
            }

            /* renamed from: component2, reason: from getter */
            public final PlusPayPrice getPrice() {
                return this.price;
            }

            public final Invoice copy(long timestamp, PlusPayPrice price) {
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

            public final PlusPayPrice getPrice() {
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
                dest.writeParcelable(this.price, flags);
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Invoice$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Invoice;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public final KSerializer serializer() {
                    return PlusPayCompositeOffers$Offer$Invoice$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Invoice> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Invoice createFromParcel(Parcel parcel) {
                    return new Invoice(parcel.readLong(), (PlusPayPrice) parcel.readParcelable(Invoice.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Invoice[] newArray(int i) {
                    return new Invoice[i];
                }
            }

            public Invoice(long j, PlusPayPrice plusPayPrice) {
                this.timestamp = j;
                this.price = plusPayPrice;
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ.\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001e¨\u00060"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Meta;", "Landroid/os/Parcelable;", "", "sessionId", "productTarget", "offersBatchId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Meta;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Meta;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSessionId", "getProductTarget", "getOffersBatchId", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @gsq0
        public static final /* data */ class Meta implements Parcelable {
            private final String offersBatchId;
            private final String productTarget;
            private final String sessionId;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<Meta> CREATOR = new Creator();

            public /* synthetic */ Meta(int i, String str, String str2, String str3, psq0 psq0Var) {
                if (7 != (i & 7)) {
                    qje.Z(i, 7, PlusPayCompositeOffers$Offer$Meta$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.sessionId = str;
                this.productTarget = str2;
                this.offersBatchId = str3;
            }

            public static /* synthetic */ Meta copy$default(Meta meta, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = meta.sessionId;
                }
                if ((i & 2) != 0) {
                    str2 = meta.productTarget;
                }
                if ((i & 4) != 0) {
                    str3 = meta.offersBatchId;
                }
                return meta.copy(str, str2, str3);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_release(Meta self, yjd output, SerialDescriptor serialDesc) {
                output.o(serialDesc, 0, self.sessionId);
                output.o(serialDesc, 1, self.productTarget);
                output.o(serialDesc, 2, self.offersBatchId);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSessionId() {
                return this.sessionId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getProductTarget() {
                return this.productTarget;
            }

            /* renamed from: component3, reason: from getter */
            public final String getOffersBatchId() {
                return this.offersBatchId;
            }

            public final Meta copy(String sessionId, String productTarget, String offersBatchId) {
                return new Meta(sessionId, productTarget, offersBatchId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Meta)) {
                    return false;
                }
                Meta meta = (Meta) other;
                return jl40.l(this.sessionId, meta.sessionId) && jl40.l(this.productTarget, meta.productTarget) && jl40.l(this.offersBatchId, meta.offersBatchId);
            }

            public final String getOffersBatchId() {
                return this.offersBatchId;
            }

            public final String getProductTarget() {
                return this.productTarget;
            }

            public final String getSessionId() {
                return this.sessionId;
            }

            public int hashCode() {
                return this.offersBatchId.hashCode() + unr0.b(this.sessionId.hashCode() * 31, 31, this.productTarget);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Meta(sessionId=");
                sb.append(this.sessionId);
                sb.append(", productTarget=");
                sb.append(this.productTarget);
                sb.append(", offersBatchId=");
                return b64.p(sb, this.offersBatchId, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.sessionId);
                dest.writeString(this.productTarget);
                dest.writeString(this.offersBatchId);
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Meta$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Meta;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public final KSerializer serializer() {
                    return PlusPayCompositeOffers$Offer$Meta$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Meta> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Meta createFromParcel(Parcel parcel) {
                    return new Meta(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Meta[] newArray(int i) {
                    return new Meta[i];
                }
            }

            public Meta(String str, String str2, String str3) {
                this.sessionId = str;
                this.productTarget = str2;
                this.offersBatchId = str3;
            }
        }

        @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 S2\u00020\u0001:\u0002TSB{\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u009b\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0015¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010#J\u0010\u0010)\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010#J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u001e\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b0\u00101J\u0098\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b4\u0010#J\u0010\u00105\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b5\u0010\u001bJ\u001a\u00109\u001a\u0002082\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b9\u0010:J'\u0010B\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0001¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010C\u001a\u0004\bD\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010C\u001a\u0004\bE\u0010#R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bF\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010C\u001a\u0004\bG\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bH\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bI\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010J\u001a\u0004\bK\u0010*R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bL\u0010#R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010M\u001a\u0004\bN\u0010-R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\bP\u0010/R%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010Q\u001a\u0004\bR\u00101¨\u0006U"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Option;", "Landroid/os/Parcelable;", "", "id", "name", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "text", "additionalText", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "commonPrice", "commonPeriod", "", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan;", "plans", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Vendor;", DRMInfoProvider.MediaDRMKeys.VENDOR, "", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayPrice;Ljava/lang/String;Ljava/util/List;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Vendor;Ljava/util/Map;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayPrice;Ljava/lang/String;Ljava/util/List;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Vendor;Ljava/util/Map;Lpsq0;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "component8", "component9", "()Ljava/util/List;", "component10", "()Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Vendor;", "component11", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayPrice;Ljava/lang/String;Ljava/util/List;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Vendor;Ljava/util/Map;)Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Option;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Option;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "getName", "getTitle", "getDescription", "getText", "getAdditionalText", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "getCommonPrice", "getCommonPeriod", "Ljava/util/List;", "getPlans", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Vendor;", "getVendor", "Ljava/util/Map;", "getPayload", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @gsq0
        public static final /* data */ class Option implements Parcelable {
            private static final i3y[] $childSerializers;
            private final String additionalText;
            private final String commonPeriod;
            private final PlusPayPrice commonPrice;
            private final String description;
            private final String id;
            private final String name;
            private final Map<String, String> payload;
            private final List<Plan> plans;
            private final String text;
            private final String title;
            private final Vendor vendor;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<Option> CREATOR = new Creator();

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                $childSerializers = new i3y[]{null, null, null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new cad0(22)), a.b(lazyThreadSafetyMode, new cad0(23)), a.b(lazyThreadSafetyMode, new cad0(24))};
            }

            public /* synthetic */ Option(int i, String str, String str2, String str3, String str4, String str5, String str6, PlusPayPrice plusPayPrice, String str7, List list, Vendor vendor, Map map, psq0 psq0Var) {
                if (2047 != (i & 2047)) {
                    qje.Z(i, 2047, PlusPayCompositeOffers$Offer$Option$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.id = str;
                this.name = str2;
                this.title = str3;
                this.description = str4;
                this.text = str5;
                this.additionalText = str6;
                this.commonPrice = plusPayPrice;
                this.commonPeriod = str7;
                this.plans = list;
                this.vendor = vendor;
                this.payload = map;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new p53(Plan.INSTANCE.serializer(), 0);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final KSerializer _childSerializers$_anonymous_$0() {
                return new o4o("com.yandex.plus.pay.api.model.PlusPayCompositeOffers.Offer.Vendor", (Enum[]) Vendor.values());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            }

            public static /* synthetic */ Option copy$default(Option option, String str, String str2, String str3, String str4, String str5, String str6, PlusPayPrice plusPayPrice, String str7, List list, Vendor vendor, Map map, int i, Object obj) {
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
                    plusPayPrice = option.commonPrice;
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
                PlusPayPrice plusPayPrice2 = plusPayPrice;
                String str10 = str5;
                String str11 = str3;
                return option.copy(str, str2, str11, str4, str10, str9, plusPayPrice2, str8, list2, vendor2, map2);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_release(Option self, yjd output, SerialDescriptor serialDesc) {
                i3y[] i3yVarArr = $childSerializers;
                output.o(serialDesc, 0, self.id);
                output.o(serialDesc, 1, self.name);
                output.o(serialDesc, 2, self.title);
                auu0 auu0Var = auu0.a;
                output.g(serialDesc, 3, auu0Var, self.description);
                output.g(serialDesc, 4, auu0Var, self.text);
                output.g(serialDesc, 5, auu0Var, self.additionalText);
                output.e(serialDesc, 6, PlusPayPrice$$serializer.INSTANCE, self.commonPrice);
                output.o(serialDesc, 7, self.commonPeriod);
                output.e(serialDesc, 8, (KSerializer) i3yVarArr[8].getValue(), self.plans);
                output.e(serialDesc, 9, (KSerializer) i3yVarArr[9].getValue(), self.vendor);
                output.g(serialDesc, 10, (KSerializer) i3yVarArr[10].getValue(), self.payload);
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
            public final PlusPayPrice getCommonPrice() {
                return this.commonPrice;
            }

            /* renamed from: component8, reason: from getter */
            public final String getCommonPeriod() {
                return this.commonPeriod;
            }

            public final List<Plan> component9() {
                return this.plans;
            }

            public final Option copy(String id, String name, String title, String description, String text, String additionalText, PlusPayPrice commonPrice, String commonPeriod, List<? extends Plan> plans, Vendor vendor, Map<String, String> payload) {
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

            public final PlusPayPrice getCommonPrice() {
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
                dest.writeParcelable(this.commonPrice, flags);
                dest.writeString(this.commonPeriod);
                Iterator t = vfc.t(dest, this.plans);
                while (t.hasNext()) {
                    dest.writeParcelable((Parcelable) t.next(), flags);
                }
                this.vendor.writeToParcel(dest, flags);
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

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Option$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Option;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public final KSerializer serializer() {
                    return PlusPayCompositeOffers$Offer$Option$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
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
                    PlusPayPrice plusPayPrice = (PlusPayPrice) parcel.readParcelable(Option.class.getClassLoader());
                    String readString7 = parcel.readString();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    int i = 0;
                    int i2 = 0;
                    while (i2 != readInt) {
                        i2 = vfc.e(Option.class, parcel, arrayList, i2, 1);
                    }
                    Vendor createFromParcel = Vendor.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int readInt2 = parcel.readInt();
                        linkedHashMap = new LinkedHashMap(readInt2);
                        while (i != readInt2) {
                            i = xvz.b(parcel, linkedHashMap, parcel.readString(), i, 1);
                        }
                    }
                    return new Option(readString, readString2, readString3, readString4, readString5, readString6, plusPayPrice, readString7, arrayList, createFromParcel, linkedHashMap);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Option[] newArray(int i) {
                    return new Option[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Option(String str, String str2, String str3, String str4, String str5, String str6, PlusPayPrice plusPayPrice, String str7, List<? extends Plan> list, Vendor vendor, Map<String, String> map) {
                this.id = str;
                this.name = str2;
                this.title = str3;
                this.description = str4;
                this.text = str5;
                this.additionalText = str6;
                this.commonPrice = plusPayPrice;
                this.commonPeriod = str7;
                this.plans = list;
                this.vendor = vendor;
                this.payload = map;
            }
        }

        @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 S2\u00020\u0001:\u0002TSB{\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u009b\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0015¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010#J\u0010\u0010)\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010#J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u001e\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b0\u00101J\u0098\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b4\u0010#J\u0010\u00105\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b5\u0010\u001bJ\u001a\u00109\u001a\u0002082\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b9\u0010:J'\u0010B\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0001¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010C\u001a\u0004\bD\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010C\u001a\u0004\bE\u0010#R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bF\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010C\u001a\u0004\bG\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bH\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bI\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010J\u001a\u0004\bK\u0010*R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bL\u0010#R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010M\u001a\u0004\bN\u0010-R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\bP\u0010/R%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010Q\u001a\u0004\bR\u00101¨\u0006U"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;", "Landroid/os/Parcelable;", "", "id", "name", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "text", "additionalText", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "commonPrice", "commonPeriod", "", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan;", "plans", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Vendor;", DRMInfoProvider.MediaDRMKeys.VENDOR, "", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayPrice;Ljava/lang/String;Ljava/util/List;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Vendor;Ljava/util/Map;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayPrice;Ljava/lang/String;Ljava/util/List;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Vendor;Ljava/util/Map;Lpsq0;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "component8", "component9", "()Ljava/util/List;", "component10", "()Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Vendor;", "component11", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayPrice;Ljava/lang/String;Ljava/util/List;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Vendor;Ljava/util/Map;)Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "getName", "getTitle", "getDescription", "getText", "getAdditionalText", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "getCommonPrice", "getCommonPeriod", "Ljava/util/List;", "getPlans", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Vendor;", "getVendor", "Ljava/util/Map;", "getPayload", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @gsq0
        public static final /* data */ class Tariff implements Parcelable {
            private static final i3y[] $childSerializers;
            private final String additionalText;
            private final String commonPeriod;
            private final PlusPayPrice commonPrice;
            private final String description;
            private final String id;
            private final String name;
            private final Map<String, String> payload;
            private final List<Plan> plans;
            private final String text;
            private final String title;
            private final Vendor vendor;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<Tariff> CREATOR = new Creator();

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                $childSerializers = new i3y[]{null, null, null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new cad0(26)), a.b(lazyThreadSafetyMode, new cad0(27)), a.b(lazyThreadSafetyMode, new cad0(28))};
            }

            public /* synthetic */ Tariff(int i, String str, String str2, String str3, String str4, String str5, String str6, PlusPayPrice plusPayPrice, String str7, List list, Vendor vendor, Map map, psq0 psq0Var) {
                if (2047 != (i & 2047)) {
                    qje.Z(i, 2047, PlusPayCompositeOffers$Offer$Tariff$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.id = str;
                this.name = str2;
                this.title = str3;
                this.description = str4;
                this.text = str5;
                this.additionalText = str6;
                this.commonPrice = plusPayPrice;
                this.commonPeriod = str7;
                this.plans = list;
                this.vendor = vendor;
                this.payload = map;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new p53(Plan.INSTANCE.serializer(), 0);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final KSerializer _childSerializers$_anonymous_$0() {
                return new o4o("com.yandex.plus.pay.api.model.PlusPayCompositeOffers.Offer.Vendor", (Enum[]) Vendor.values());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            }

            public static /* synthetic */ Tariff copy$default(Tariff tariff, String str, String str2, String str3, String str4, String str5, String str6, PlusPayPrice plusPayPrice, String str7, List list, Vendor vendor, Map map, int i, Object obj) {
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
                    plusPayPrice = tariff.commonPrice;
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
                PlusPayPrice plusPayPrice2 = plusPayPrice;
                String str10 = str5;
                String str11 = str3;
                return tariff.copy(str, str2, str11, str4, str10, str9, plusPayPrice2, str8, list2, vendor2, map2);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_release(Tariff self, yjd output, SerialDescriptor serialDesc) {
                i3y[] i3yVarArr = $childSerializers;
                output.o(serialDesc, 0, self.id);
                output.o(serialDesc, 1, self.name);
                output.o(serialDesc, 2, self.title);
                auu0 auu0Var = auu0.a;
                output.g(serialDesc, 3, auu0Var, self.description);
                output.g(serialDesc, 4, auu0Var, self.text);
                output.g(serialDesc, 5, auu0Var, self.additionalText);
                output.e(serialDesc, 6, PlusPayPrice$$serializer.INSTANCE, self.commonPrice);
                output.o(serialDesc, 7, self.commonPeriod);
                output.e(serialDesc, 8, (KSerializer) i3yVarArr[8].getValue(), self.plans);
                output.e(serialDesc, 9, (KSerializer) i3yVarArr[9].getValue(), self.vendor);
                output.g(serialDesc, 10, (KSerializer) i3yVarArr[10].getValue(), self.payload);
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
            public final PlusPayPrice getCommonPrice() {
                return this.commonPrice;
            }

            /* renamed from: component8, reason: from getter */
            public final String getCommonPeriod() {
                return this.commonPeriod;
            }

            public final List<Plan> component9() {
                return this.plans;
            }

            public final Tariff copy(String id, String name, String title, String description, String text, String additionalText, PlusPayPrice commonPrice, String commonPeriod, List<? extends Plan> plans, Vendor vendor, Map<String, String> payload) {
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

            public final PlusPayPrice getCommonPrice() {
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
                dest.writeParcelable(this.commonPrice, flags);
                dest.writeString(this.commonPeriod);
                Iterator t = vfc.t(dest, this.plans);
                while (t.hasNext()) {
                    dest.writeParcelable((Parcelable) t.next(), flags);
                }
                this.vendor.writeToParcel(dest, flags);
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

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public final KSerializer serializer() {
                    return PlusPayCompositeOffers$Offer$Tariff$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
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
                    PlusPayPrice plusPayPrice = (PlusPayPrice) parcel.readParcelable(Tariff.class.getClassLoader());
                    String readString7 = parcel.readString();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    int i = 0;
                    int i2 = 0;
                    while (i2 != readInt) {
                        i2 = vfc.e(Tariff.class, parcel, arrayList, i2, 1);
                    }
                    Vendor createFromParcel = Vendor.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int readInt2 = parcel.readInt();
                        linkedHashMap = new LinkedHashMap(readInt2);
                        while (i != readInt2) {
                            i = xvz.b(parcel, linkedHashMap, parcel.readString(), i, 1);
                        }
                    }
                    return new Tariff(readString, readString2, readString3, readString4, readString5, readString6, plusPayPrice, readString7, arrayList, createFromParcel, linkedHashMap);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Tariff[] newArray(int i) {
                    return new Tariff[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Tariff(String str, String str2, String str3, String str4, String str5, String str6, PlusPayPrice plusPayPrice, String str7, List<? extends Plan> list, Vendor vendor, Map<String, String> map) {
                this.id = str;
                this.name = str2;
                this.title = str3;
                this.description = str4;
                this.text = str5;
                this.additionalText = str6;
                this.commonPrice = plusPayPrice;
                this.commonPeriod = str7;
                this.plans = list;
                this.vendor = vendor;
                this.payload = map;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer serializer() {
                return PlusPayCompositeOffers$Offer$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$StructureType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "TARIFF", "OPTION", "COMPOSITE", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class StructureType implements Parcelable {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ StructureType[] $VALUES;
            public static final Parcelable.Creator<StructureType> CREATOR;
            public static final StructureType TARIFF = new StructureType("TARIFF", 0);
            public static final StructureType OPTION = new StructureType("OPTION", 1);
            public static final StructureType COMPOSITE = new StructureType("COMPOSITE", 2);

            private static final /* synthetic */ StructureType[] $values() {
                return new StructureType[]{TARIFF, OPTION, COMPOSITE};
            }

            static {
                StructureType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.a.a($values);
                CREATOR = new Creator();
            }

            private StructureType(String str, int i) {
            }

            public static k4o getEntries() {
                return $ENTRIES;
            }

            public static StructureType valueOf(String str) {
                return (StructureType) Enum.valueOf(StructureType.class, str);
            }

            public static StructureType[] values() {
                return (StructureType[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeString(name());
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<StructureType> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StructureType createFromParcel(Parcel parcel) {
                    return StructureType.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StructureType[] newArray(int i) {
                    return new StructureType[i];
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Vendor;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "GOOGLE_PLAY", "NATIVE", "UNKNOWN", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Vendor implements Parcelable {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Vendor[] $VALUES;
            public static final Parcelable.Creator<Vendor> CREATOR;
            public static final Vendor GOOGLE_PLAY = new Vendor("GOOGLE_PLAY", 0);
            public static final Vendor NATIVE = new Vendor("NATIVE", 1);
            public static final Vendor UNKNOWN = new Vendor("UNKNOWN", 2);

            private static final /* synthetic */ Vendor[] $values() {
                return new Vendor[]{GOOGLE_PLAY, NATIVE, UNKNOWN};
            }

            static {
                Vendor[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.a.a($values);
                CREATOR = new Creator();
            }

            private Vendor(String str, int i) {
            }

            public static k4o getEntries() {
                return $ENTRIES;
            }

            public static Vendor valueOf(String str) {
                return (Vendor) Enum.valueOf(Vendor.class, str);
            }

            public static Vendor[] values() {
                return (Vendor[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeString(name());
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Vendor> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Vendor createFromParcel(Parcel parcel) {
                    return Vendor.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Vendor[] newArray(int i) {
                    return new Vendor[i];
                }
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Offer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Offer createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                String readString = parcel.readString();
                StructureType createFromParcel = StructureType.CREATOR.createFromParcel(parcel);
                String readString2 = parcel.readString();
                Tariff createFromParcel2 = parcel.readInt() == 0 ? null : Tariff.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (true) {
                    z = true;
                    if (i == readInt) {
                        break;
                    }
                    i = oo31.d(Option.CREATOR, parcel, arrayList, i, 1);
                }
                PlusPayLegalInfo createFromParcel3 = parcel.readInt() != 0 ? PlusPayLegalInfo.CREATOR.createFromParcel(parcel) : null;
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = oo31.d(Invoice.CREATOR, parcel, arrayList2, i2, 1);
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z = false;
                }
                return new Offer(readString, createFromParcel, readString2, createFromParcel2, arrayList, createFromParcel3, arrayList2, z, Assets.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? z2 : false, Meta.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Offer[] newArray(int i) {
                return new Offer[i];
            }
        }

        public Offer(String str, StructureType structureType, String str2, Tariff tariff, List<Option> list, PlusPayLegalInfo plusPayLegalInfo, List<Invoice> list2, boolean z, Assets assets, boolean z2, Meta meta) {
            this.positionId = str;
            this.structureType = structureType;
            this.activeTariffId = str2;
            this.tariffOffer = tariff;
            this.optionOffers = list;
            this.legalInfo = plusPayLegalInfo;
            this.invoices = list2;
            this.isUpsale = z;
            this.assets = assets;
            this.canAttemptSilentPurchase = z2;
            this.meta = meta;
        }
    }

    public PlusPayCompositeOffers(String str, String str2, List<Offer> list, String str3) {
        this.sessionId = str;
        this.offersBatchId = str2;
        this.offers = list;
        this.target = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlusPayCompositeOffers copy$default(PlusPayCompositeOffers plusPayCompositeOffers, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plusPayCompositeOffers.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = plusPayCompositeOffers.offersBatchId;
        }
        if ((i & 4) != 0) {
            list = plusPayCompositeOffers.offers;
        }
        if ((i & 8) != 0) {
            str3 = plusPayCompositeOffers.target;
        }
        return plusPayCompositeOffers.copy(str, str2, list, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOffersBatchId() {
        return this.offersBatchId;
    }

    public final List<Offer> component3() {
        return this.offers;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    public final PlusPayCompositeOffers copy(String sessionId, String offersBatchId, List<Offer> offers, String target) {
        return new PlusPayCompositeOffers(sessionId, offersBatchId, offers, target);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusPayCompositeOffers)) {
            return false;
        }
        PlusPayCompositeOffers plusPayCompositeOffers = (PlusPayCompositeOffers) other;
        return jl40.l(this.sessionId, plusPayCompositeOffers.sessionId) && jl40.l(this.offersBatchId, plusPayCompositeOffers.offersBatchId) && jl40.l(this.offers, plusPayCompositeOffers.offers) && jl40.l(this.target, plusPayCompositeOffers.target);
    }

    public final List<Offer> getOffers() {
        return this.offers;
    }

    public final String getOffersBatchId() {
        return this.offersBatchId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getTarget() {
        return this.target;
    }

    public int hashCode() {
        return this.target.hashCode() + unr0.c(unr0.b(this.sessionId.hashCode() * 31, 31, this.offersBatchId), 31, this.offers);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlusPayCompositeOffers(sessionId=");
        sb.append(this.sessionId);
        sb.append(", offersBatchId=");
        sb.append(this.offersBatchId);
        sb.append(", offers=");
        sb.append(this.offers);
        sb.append(", target=");
        return b64.p(sb, this.target, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.sessionId);
        dest.writeString(this.offersBatchId);
        Iterator t = vfc.t(dest, this.offers);
        while (t.hasNext()) {
            ((Offer) t.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.target);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusPayCompositeOffers> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayCompositeOffers createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = oo31.d(Offer.CREATOR, parcel, arrayList, i, 1);
            }
            return new PlusPayCompositeOffers(readString, readString2, arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayCompositeOffers[] newArray(int i) {
            return new PlusPayCompositeOffers[i];
        }
    }
}
