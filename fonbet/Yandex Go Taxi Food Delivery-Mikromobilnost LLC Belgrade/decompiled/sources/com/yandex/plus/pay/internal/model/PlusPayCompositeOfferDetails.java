package com.yandex.plus.pay.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.plus.core.data.common.PlusThemedUrl;
import com.yandex.plus.pay.api.model.PlusPayInAppReplacementParams;
import com.yandex.plus.pay.api.model.PlusPayInAppReplacementParams$$serializer;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo$$serializer;
import com.yandex.plus.pay.api.model.PlusPayPrice;
import com.yandex.plus.pay.api.model.PlusPayPrice$$serializer;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.auu0;
import defpackage.b64;
import defpackage.cad0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.k8u;
import defpackage.nzs;
import defpackage.o4o;
import defpackage.oo31;
import defpackage.p53;
import defpackage.psq0;
import defpackage.qje;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.w511;
import defpackage.x4e;
import defpackage.xpd0;
import defpackage.xvz;
import defpackage.ycc;
import defpackage.yjd;
import defpackage.z96;
import defpackage.zpd0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@gsq0
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 h2\u00020\u0001:\nijklmnophqB\u008f\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cB¯\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001b\u0010!J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0004¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u0004¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\u001d¢\u0006\u0004\b&\u0010'J\u001d\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001d¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b0\u0010$J\u0012\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b7\u00108J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004HÆ\u0003¢\u0006\u0004\b9\u0010$J\u0012\u0010:\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b>\u0010=J\u0012\u0010?\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b?\u0010=J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004HÆ\u0003¢\u0006\u0004\b@\u0010$J\u0010\u0010A\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\bA\u0010BJ²\u0001\u0010C\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u0019HÆ\u0001¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\bE\u0010=J\u0010\u0010F\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\bF\u0010'J\u001a\u0010I\u001a\u00020\u00112\b\u0010H\u001a\u0004\u0018\u00010GHÖ\u0003¢\u0006\u0004\bI\u0010JJ'\u0010R\u001a\u00020+2\u0006\u0010K\u001a\u00020\u00002\u0006\u0010M\u001a\u00020L2\u0006\u0010O\u001a\u00020NH\u0001¢\u0006\u0004\bP\u0010QR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010S\u001a\u0004\bT\u0010/R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010U\u001a\u0004\bV\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010W\u001a\u0004\bX\u00102R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010Y\u001a\u0004\bZ\u00104R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010[\u001a\u0004\b\\\u00106R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010]\u001a\u0004\b^\u00108R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010U\u001a\u0004\b_\u0010$R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010`\u001a\u0004\b\u0012\u0010;R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010a\u001a\u0004\bb\u0010=R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010a\u001a\u0004\bc\u0010=R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0016\u0010a\u001a\u0004\bd\u0010=R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010U\u001a\u0004\be\u0010$R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010f\u001a\u0004\bg\u0010B¨\u0006r"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails;", "Landroid/os/Parcelable;", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$TariffOfferDetails;", "tariffDetails", "", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$OptionOfferDetails;", "optionOffersDetails", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;", "legalInfo", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "promoLegalInfo", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentText;", "paymentText", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$SuccessScreenDetails;", "successScreen", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$Invoice;", "invoicesDetails", "", "isSilentInvoiceAvailable", "", "mainPaymentMethod", "posId", "serviceToken", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethodsGroup;", "paymentMethodsGroups", "Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffers;", "additionalOffers", "<init>", "(Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$TariffOfferDetails;Ljava/util/List;Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentText;Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$SuccessScreenDetails;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffers;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$TariffOfferDetails;Ljava/util/List;Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentText;Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$SuccessScreenDetails;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffers;Lpsq0;)V", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod;", "getAllPaymentMethods", "()Ljava/util/List;", "getBoundPaymentMethods", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$TariffOfferDetails;", "component2", "component3", "()Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;", "component4", "()Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "component5", "()Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentText;", "component6", "()Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$SuccessScreenDetails;", "component7", "component8", "()Ljava/lang/Boolean;", "component9", "()Ljava/lang/String;", "component10", "component11", "component12", "component13", "()Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffers;", "copy", "(Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$TariffOfferDetails;Ljava/util/List;Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentText;Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$SuccessScreenDetails;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffers;)Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$TariffOfferDetails;", "getTariffDetails", "Ljava/util/List;", "getOptionOffersDetails", "Lcom/yandex/plus/pay/api/model/PlusPayLegalInfo;", "getLegalInfo", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "getPromoLegalInfo", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentText;", "getPaymentText", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$SuccessScreenDetails;", "getSuccessScreen", "getInvoicesDetails", "Ljava/lang/Boolean;", "Ljava/lang/String;", "getMainPaymentMethod", "getPosId", "getServiceToken", "getPaymentMethodsGroups", "Lcom/yandex/plus/pay/internal/model/PlusPayAdditionalOffers;", "getAdditionalOffers", "Companion", "TariffOfferDetails", "OptionOfferDetails", "PaymentText", "SuccessScreenDetails", "Invoice", "PaymentMethodsGroup", "PaymentMethod", "PaymentPromo", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusPayCompositeOfferDetails implements Parcelable {
    private static final i3y[] $childSerializers;

    @Deprecated
    public static final String DARK = "dark";

    @Deprecated
    public static final String LIGHT = "light";
    private final PlusPayAdditionalOffers additionalOffers;
    private final List<Invoice> invoicesDetails;
    private final Boolean isSilentInvoiceAvailable;
    private final PlusPayLegalInfo legalInfo;
    private final String mainPaymentMethod;
    private final List<OptionOfferDetails> optionOffersDetails;
    private final List<PaymentMethodsGroup> paymentMethodsGroups;
    private final PaymentText paymentText;
    private final String posId;
    private final PlusPayRichText promoLegalInfo;
    private final String serviceToken;
    private final SuccessScreenDetails successScreen;
    private final TariffOfferDetails tariffDetails;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PlusPayCompositeOfferDetails> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0004YZ[XBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u008b\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0016¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010'J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010'J\u0010\u0010,\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b0\u0010/J\u0012\u00101\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b5\u00106J\u0088\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b9\u0010'J\u0010\u0010:\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b:\u0010\u001fJ\u001a\u0010=\u001a\u00020\u001b2\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b=\u0010>J'\u0010F\u001a\u00020#2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BH\u0001¢\u0006\u0004\bD\u0010ER\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010G\u001a\u0004\bH\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010I\u001a\u0004\bJ\u0010)R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010G\u001a\u0004\bK\u0010'R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010G\u001a\u0004\bL\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010M\u001a\u0004\bN\u0010-R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010O\u001a\u0004\bP\u0010/R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\r\u0010O\u001a\u0004\bQ\u0010/R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010R\u001a\u0004\bS\u00102R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010T\u001a\u0004\bU\u00104R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010V\u001a\u0004\bW\u00106¨\u0006\\"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod;", "Landroid/os/Parcelable;", "", "id", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod$Type;", "type", "bankName", "title", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "icon", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "Lcom/yandex/plus/core/data/common/PlusColor;", "textColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod$ButtonAsset;", "buttonAsset", "Lcom/yandex/plus/core/data/common/PlusThemedUrl;", "widgetUrls", "Lcom/yandex/plus/pay/internal/model/PlusPayWebPaymentWidgetTimeoutParams;", "timeoutParams", "<init>", "(Ljava/lang/String;Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod$Type;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod$ButtonAsset;Lcom/yandex/plus/core/data/common/PlusThemedUrl;Lcom/yandex/plus/pay/internal/model/PlusPayWebPaymentWidgetTimeoutParams;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod$Type;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod$ButtonAsset;Lcom/yandex/plus/core/data/common/PlusThemedUrl;Lcom/yandex/plus/pay/internal/model/PlusPayWebPaymentWidgetTimeoutParams;Lpsq0;)V", "", "isBound", "()Z", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod$Type;", "component3", "component4", "component5", "()Lcom/yandex/plus/core/data/common/PlusThemedImage;", "component6", "()Lcom/yandex/plus/core/data/common/PlusThemedColor;", "component7", "component8", "()Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod$ButtonAsset;", "component9", "()Lcom/yandex/plus/core/data/common/PlusThemedUrl;", "component10", "()Lcom/yandex/plus/pay/internal/model/PlusPayWebPaymentWidgetTimeoutParams;", "copy", "(Ljava/lang/String;Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod$Type;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod$ButtonAsset;Lcom/yandex/plus/core/data/common/PlusThemedUrl;Lcom/yandex/plus/pay/internal/model/PlusPayWebPaymentWidgetTimeoutParams;)Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod$Type;", "getType", "getBankName", "getTitle", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "getIcon", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "getTextColor", "getBackgroundColor", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod$ButtonAsset;", "getButtonAsset", "Lcom/yandex/plus/core/data/common/PlusThemedUrl;", "getWidgetUrls", "Lcom/yandex/plus/pay/internal/model/PlusPayWebPaymentWidgetTimeoutParams;", "getTimeoutParams", "Companion", "Type", "ButtonAsset", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @gsq0
    public static final /* data */ class PaymentMethod implements Parcelable {
        private static final i3y[] $childSerializers;
        private final PlusThemedColor<PlusColor> backgroundColor;
        private final String bankName;
        private final ButtonAsset buttonAsset;
        private final PlusThemedImage icon;
        private final String id;
        private final PlusThemedColor<PlusColor> textColor;
        private final PlusPayWebPaymentWidgetTimeoutParams timeoutParams;
        private final String title;
        private final Type type;
        private final PlusThemedUrl widgetUrls;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<PaymentMethod> CREATOR = new Creator();

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod$Type;", "", "<init>", "(Ljava/lang/String;I)V", "NEW_CARD", "NEW_YB_CARD", "NEW_SBP", "CARD", "SBP", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Type {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type NEW_CARD = new Type("NEW_CARD", 0);
            public static final Type NEW_YB_CARD = new Type("NEW_YB_CARD", 1);
            public static final Type NEW_SBP = new Type("NEW_SBP", 2);
            public static final Type CARD = new Type("CARD", 3);
            public static final Type SBP = new Type("SBP", 4);

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{NEW_CARD, NEW_YB_CARD, NEW_SBP, CARD, SBP};
            }

            static {
                Type[] $values = $values();
                $VALUES = $values;
                $ENTRIES = a.a($values);
            }

            private Type(String str, int i) {
            }

            public static k4o getEntries() {
                return $ENTRIES;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Type.values().length];
                try {
                    iArr[Type.NEW_CARD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Type.NEW_YB_CARD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Type.NEW_SBP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Type.CARD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Type.SBP.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new cad0(10)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new cad0(11)), kotlin.a.b(lazyThreadSafetyMode, new cad0(12)), null, null, null};
        }

        public /* synthetic */ PaymentMethod(int i, String str, Type type, String str2, String str3, PlusThemedImage plusThemedImage, PlusThemedColor plusThemedColor, PlusThemedColor plusThemedColor2, ButtonAsset buttonAsset, PlusThemedUrl plusThemedUrl, PlusPayWebPaymentWidgetTimeoutParams plusPayWebPaymentWidgetTimeoutParams, psq0 psq0Var) {
            if (255 != (i & 255)) {
                qje.Z(i, 255, PlusPayCompositeOfferDetails$PaymentMethod$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = str;
            this.type = type;
            this.bankName = str2;
            this.title = str3;
            this.icon = plusThemedImage;
            this.textColor = plusThemedColor;
            this.backgroundColor = plusThemedColor2;
            this.buttonAsset = buttonAsset;
            if ((i & 256) == 0) {
                this.widgetUrls = null;
            } else {
                this.widgetUrls = plusThemedUrl;
            }
            if ((i & 512) == 0) {
                this.timeoutParams = null;
            } else {
                this.timeoutParams = plusPayWebPaymentWidgetTimeoutParams;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _childSerializers$_anonymous_() {
            return new o4o("com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails.PaymentMethod.Type", (Enum[]) Type.values());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return PlusThemedColor.Companion.serializer(PlusColor.Companion.serializer());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return PlusThemedColor.Companion.serializer(PlusColor.Companion.serializer());
        }

        public static /* synthetic */ PaymentMethod copy$default(PaymentMethod paymentMethod, String str, Type type, String str2, String str3, PlusThemedImage plusThemedImage, PlusThemedColor plusThemedColor, PlusThemedColor plusThemedColor2, ButtonAsset buttonAsset, PlusThemedUrl plusThemedUrl, PlusPayWebPaymentWidgetTimeoutParams plusPayWebPaymentWidgetTimeoutParams, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paymentMethod.id;
            }
            if ((i & 2) != 0) {
                type = paymentMethod.type;
            }
            if ((i & 4) != 0) {
                str2 = paymentMethod.bankName;
            }
            if ((i & 8) != 0) {
                str3 = paymentMethod.title;
            }
            if ((i & 16) != 0) {
                plusThemedImage = paymentMethod.icon;
            }
            if ((i & 32) != 0) {
                plusThemedColor = paymentMethod.textColor;
            }
            if ((i & 64) != 0) {
                plusThemedColor2 = paymentMethod.backgroundColor;
            }
            if ((i & 128) != 0) {
                buttonAsset = paymentMethod.buttonAsset;
            }
            if ((i & 256) != 0) {
                plusThemedUrl = paymentMethod.widgetUrls;
            }
            if ((i & 512) != 0) {
                plusPayWebPaymentWidgetTimeoutParams = paymentMethod.timeoutParams;
            }
            PlusThemedUrl plusThemedUrl2 = plusThemedUrl;
            PlusPayWebPaymentWidgetTimeoutParams plusPayWebPaymentWidgetTimeoutParams2 = plusPayWebPaymentWidgetTimeoutParams;
            PlusThemedColor plusThemedColor3 = plusThemedColor2;
            ButtonAsset buttonAsset2 = buttonAsset;
            PlusThemedImage plusThemedImage2 = plusThemedImage;
            PlusThemedColor plusThemedColor4 = plusThemedColor;
            return paymentMethod.copy(str, type, str2, str3, plusThemedImage2, plusThemedColor4, plusThemedColor3, buttonAsset2, plusThemedUrl2, plusPayWebPaymentWidgetTimeoutParams2);
        }

        public static final /* synthetic */ void write$Self$pay_sdk_release(PaymentMethod self, yjd output, SerialDescriptor serialDesc) {
            i3y[] i3yVarArr = $childSerializers;
            output.o(serialDesc, 0, self.id);
            output.e(serialDesc, 1, (KSerializer) i3yVarArr[1].getValue(), self.type);
            output.g(serialDesc, 2, auu0.a, self.bankName);
            output.o(serialDesc, 3, self.title);
            output.e(serialDesc, 4, xpd0.a, self.icon);
            output.e(serialDesc, 5, (KSerializer) i3yVarArr[5].getValue(), self.textColor);
            output.e(serialDesc, 6, (KSerializer) i3yVarArr[6].getValue(), self.backgroundColor);
            output.g(serialDesc, 7, PlusPayCompositeOfferDetails$PaymentMethod$ButtonAsset$$serializer.INSTANCE, self.buttonAsset);
            if (output.F() || self.widgetUrls != null) {
                output.g(serialDesc, 8, zpd0.a, self.widgetUrls);
            }
            if (!output.F() && self.timeoutParams == null) {
                return;
            }
            output.g(serialDesc, 9, PlusPayWebPaymentWidgetTimeoutParams$$serializer.INSTANCE, self.timeoutParams);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final PlusPayWebPaymentWidgetTimeoutParams getTimeoutParams() {
            return this.timeoutParams;
        }

        /* renamed from: component2, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBankName() {
            return this.bankName;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component5, reason: from getter */
        public final PlusThemedImage getIcon() {
            return this.icon;
        }

        public final PlusThemedColor<PlusColor> component6() {
            return this.textColor;
        }

        public final PlusThemedColor<PlusColor> component7() {
            return this.backgroundColor;
        }

        /* renamed from: component8, reason: from getter */
        public final ButtonAsset getButtonAsset() {
            return this.buttonAsset;
        }

        /* renamed from: component9, reason: from getter */
        public final PlusThemedUrl getWidgetUrls() {
            return this.widgetUrls;
        }

        public final PaymentMethod copy(String id, Type type, String bankName, String title, PlusThemedImage icon, PlusThemedColor<PlusColor> textColor, PlusThemedColor<PlusColor> backgroundColor, ButtonAsset buttonAsset, PlusThemedUrl widgetUrls, PlusPayWebPaymentWidgetTimeoutParams timeoutParams) {
            return new PaymentMethod(id, type, bankName, title, icon, textColor, backgroundColor, buttonAsset, widgetUrls, timeoutParams);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentMethod)) {
                return false;
            }
            PaymentMethod paymentMethod = (PaymentMethod) other;
            return jl40.l(this.id, paymentMethod.id) && this.type == paymentMethod.type && jl40.l(this.bankName, paymentMethod.bankName) && jl40.l(this.title, paymentMethod.title) && jl40.l(this.icon, paymentMethod.icon) && jl40.l(this.textColor, paymentMethod.textColor) && jl40.l(this.backgroundColor, paymentMethod.backgroundColor) && jl40.l(this.buttonAsset, paymentMethod.buttonAsset) && jl40.l(this.widgetUrls, paymentMethod.widgetUrls) && jl40.l(this.timeoutParams, paymentMethod.timeoutParams);
        }

        public final PlusThemedColor<PlusColor> getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getBankName() {
            return this.bankName;
        }

        public final ButtonAsset getButtonAsset() {
            return this.buttonAsset;
        }

        public final PlusThemedImage getIcon() {
            return this.icon;
        }

        public final String getId() {
            return this.id;
        }

        public final PlusThemedColor<PlusColor> getTextColor() {
            return this.textColor;
        }

        public final PlusPayWebPaymentWidgetTimeoutParams getTimeoutParams() {
            return this.timeoutParams;
        }

        public final String getTitle() {
            return this.title;
        }

        public final Type getType() {
            return this.type;
        }

        public final PlusThemedUrl getWidgetUrls() {
            return this.widgetUrls;
        }

        public int hashCode() {
            int hashCode = (this.type.hashCode() + (this.id.hashCode() * 31)) * 31;
            String str = this.bankName;
            int c = vfc.c(this.backgroundColor, vfc.c(this.textColor, (this.icon.hashCode() + unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title)) * 31, 31), 31);
            ButtonAsset buttonAsset = this.buttonAsset;
            int hashCode2 = (c + (buttonAsset == null ? 0 : buttonAsset.hashCode())) * 31;
            PlusThemedUrl plusThemedUrl = this.widgetUrls;
            int hashCode3 = (hashCode2 + (plusThemedUrl == null ? 0 : plusThemedUrl.hashCode())) * 31;
            PlusPayWebPaymentWidgetTimeoutParams plusPayWebPaymentWidgetTimeoutParams = this.timeoutParams;
            return hashCode3 + (plusPayWebPaymentWidgetTimeoutParams != null ? plusPayWebPaymentWidgetTimeoutParams.hashCode() : 0);
        }

        public final boolean isBound() {
            int i = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                return false;
            }
            if (i == 4 || i == 5) {
                return true;
            }
            w511.b();
            return false;
        }

        public String toString() {
            return "PaymentMethod(id=" + this.id + ", type=" + this.type + ", bankName=" + this.bankName + ", title=" + this.title + ", icon=" + this.icon + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", buttonAsset=" + this.buttonAsset + ", widgetUrls=" + this.widgetUrls + ", timeoutParams=" + this.timeoutParams + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.id);
            dest.writeString(this.type.name());
            dest.writeString(this.bankName);
            dest.writeString(this.title);
            dest.writeParcelable(this.icon, flags);
            dest.writeParcelable(this.textColor, flags);
            dest.writeParcelable(this.backgroundColor, flags);
            ButtonAsset buttonAsset = this.buttonAsset;
            if (buttonAsset == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonAsset.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.widgetUrls, flags);
            PlusPayWebPaymentWidgetTimeoutParams plusPayWebPaymentWidgetTimeoutParams = this.timeoutParams;
            if (plusPayWebPaymentWidgetTimeoutParams == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                plusPayWebPaymentWidgetTimeoutParams.writeToParcel(dest, flags);
            }
        }

        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ(\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001d¨\u0006/"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod$ButtonAsset;", "Landroid/os/Parcelable;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "badgeText", "subtitleText", "<init>", "(Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod$ButtonAsset;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "component2", "copy", "(Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;)Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod$ButtonAsset;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "getBadgeText", "getSubtitleText", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @gsq0
        public static final /* data */ class ButtonAsset implements Parcelable {
            private final PlusPayRichText badgeText;
            private final PlusPayRichText subtitleText;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<ButtonAsset> CREATOR = new Creator();

            public /* synthetic */ ButtonAsset(int i, PlusPayRichText plusPayRichText, PlusPayRichText plusPayRichText2, psq0 psq0Var) {
                if (3 != (i & 3)) {
                    qje.Z(i, 3, PlusPayCompositeOfferDetails$PaymentMethod$ButtonAsset$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.badgeText = plusPayRichText;
                this.subtitleText = plusPayRichText2;
            }

            public static /* synthetic */ ButtonAsset copy$default(ButtonAsset buttonAsset, PlusPayRichText plusPayRichText, PlusPayRichText plusPayRichText2, int i, Object obj) {
                if ((i & 1) != 0) {
                    plusPayRichText = buttonAsset.badgeText;
                }
                if ((i & 2) != 0) {
                    plusPayRichText2 = buttonAsset.subtitleText;
                }
                return buttonAsset.copy(plusPayRichText, plusPayRichText2);
            }

            public static final /* synthetic */ void write$Self$pay_sdk_release(ButtonAsset self, yjd output, SerialDescriptor serialDesc) {
                PlusPayRichText$$serializer plusPayRichText$$serializer = PlusPayRichText$$serializer.INSTANCE;
                output.g(serialDesc, 0, plusPayRichText$$serializer, self.badgeText);
                output.g(serialDesc, 1, plusPayRichText$$serializer, self.subtitleText);
            }

            /* renamed from: component1, reason: from getter */
            public final PlusPayRichText getBadgeText() {
                return this.badgeText;
            }

            /* renamed from: component2, reason: from getter */
            public final PlusPayRichText getSubtitleText() {
                return this.subtitleText;
            }

            public final ButtonAsset copy(PlusPayRichText badgeText, PlusPayRichText subtitleText) {
                return new ButtonAsset(badgeText, subtitleText);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ButtonAsset)) {
                    return false;
                }
                ButtonAsset buttonAsset = (ButtonAsset) other;
                return jl40.l(this.badgeText, buttonAsset.badgeText) && jl40.l(this.subtitleText, buttonAsset.subtitleText);
            }

            public final PlusPayRichText getBadgeText() {
                return this.badgeText;
            }

            public final PlusPayRichText getSubtitleText() {
                return this.subtitleText;
            }

            public int hashCode() {
                PlusPayRichText plusPayRichText = this.badgeText;
                int hashCode = (plusPayRichText == null ? 0 : plusPayRichText.hashCode()) * 31;
                PlusPayRichText plusPayRichText2 = this.subtitleText;
                return hashCode + (plusPayRichText2 != null ? plusPayRichText2.hashCode() : 0);
            }

            public String toString() {
                return "ButtonAsset(badgeText=" + this.badgeText + ", subtitleText=" + this.subtitleText + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                PlusPayRichText plusPayRichText = this.badgeText;
                if (plusPayRichText == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    plusPayRichText.writeToParcel(dest, flags);
                }
                PlusPayRichText plusPayRichText2 = this.subtitleText;
                if (plusPayRichText2 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    plusPayRichText2.writeToParcel(dest, flags);
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod$ButtonAsset$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod$ButtonAsset;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public final KSerializer serializer() {
                    return PlusPayCompositeOfferDetails$PaymentMethod$ButtonAsset$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ButtonAsset> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ButtonAsset createFromParcel(Parcel parcel) {
                    return new ButtonAsset(parcel.readInt() == 0 ? null : PlusPayRichText.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PlusPayRichText.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ButtonAsset[] newArray(int i) {
                    return new ButtonAsset[i];
                }
            }

            public ButtonAsset(PlusPayRichText plusPayRichText, PlusPayRichText plusPayRichText2) {
                this.badgeText = plusPayRichText;
                this.subtitleText = plusPayRichText2;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer serializer() {
                return PlusPayCompositeOfferDetails$PaymentMethod$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentMethod> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentMethod createFromParcel(Parcel parcel) {
                return new PaymentMethod(parcel.readString(), Type.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (PlusThemedImage) parcel.readParcelable(PaymentMethod.class.getClassLoader()), (PlusThemedColor) parcel.readParcelable(PaymentMethod.class.getClassLoader()), (PlusThemedColor) parcel.readParcelable(PaymentMethod.class.getClassLoader()), parcel.readInt() == 0 ? null : ButtonAsset.CREATOR.createFromParcel(parcel), (PlusThemedUrl) parcel.readParcelable(PaymentMethod.class.getClassLoader()), parcel.readInt() != 0 ? PlusPayWebPaymentWidgetTimeoutParams.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentMethod[] newArray(int i) {
                return new PaymentMethod[i];
            }
        }

        public PaymentMethod(String str, Type type, String str2, String str3, PlusThemedImage plusThemedImage, PlusThemedColor<PlusColor> plusThemedColor, PlusThemedColor<PlusColor> plusThemedColor2, ButtonAsset buttonAsset, PlusThemedUrl plusThemedUrl, PlusPayWebPaymentWidgetTimeoutParams plusPayWebPaymentWidgetTimeoutParams) {
            this.id = str;
            this.type = type;
            this.bankName = str2;
            this.title = str3;
            this.icon = plusThemedImage;
            this.textColor = plusThemedColor;
            this.backgroundColor = plusThemedColor2;
            this.buttonAsset = buttonAsset;
            this.widgetUrls = plusThemedUrl;
            this.timeoutParams = plusPayWebPaymentWidgetTimeoutParams;
        }

        public /* synthetic */ PaymentMethod(String str, Type type, String str2, String str3, PlusThemedImage plusThemedImage, PlusThemedColor plusThemedColor, PlusThemedColor plusThemedColor2, ButtonAsset buttonAsset, PlusThemedUrl plusThemedUrl, PlusPayWebPaymentWidgetTimeoutParams plusPayWebPaymentWidgetTimeoutParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, type, str2, str3, plusThemedImage, plusThemedColor, plusThemedColor2, buttonAsset, (i & 256) != 0 ? null : plusThemedUrl, (i & 512) != 0 ? null : plusPayWebPaymentWidgetTimeoutParams);
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        $childSerializers = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new cad0(4)), null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new cad0(5)), null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new cad0(6)), null};
    }

    public /* synthetic */ PlusPayCompositeOfferDetails(int i, TariffOfferDetails tariffOfferDetails, List list, PlusPayLegalInfo plusPayLegalInfo, PlusPayRichText plusPayRichText, PaymentText paymentText, SuccessScreenDetails successScreenDetails, List list2, Boolean bool, String str, String str2, String str3, List list3, PlusPayAdditionalOffers plusPayAdditionalOffers, psq0 psq0Var) {
        if (8191 != (i & 8191)) {
            qje.Z(i, 8191, PlusPayCompositeOfferDetails$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.tariffDetails = tariffOfferDetails;
        this.optionOffersDetails = list;
        this.legalInfo = plusPayLegalInfo;
        this.promoLegalInfo = plusPayRichText;
        this.paymentText = paymentText;
        this.successScreen = successScreenDetails;
        this.invoicesDetails = list2;
        this.isSilentInvoiceAvailable = bool;
        this.mainPaymentMethod = str;
        this.posId = str2;
        this.serviceToken = str3;
        this.paymentMethodsGroups = list3;
        this.additionalOffers = plusPayAdditionalOffers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new p53(PlusPayCompositeOfferDetails$OptionOfferDetails$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new p53(PlusPayCompositeOfferDetails$Invoice$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new p53(PlusPayCompositeOfferDetails$PaymentMethodsGroup$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ PlusPayCompositeOfferDetails copy$default(PlusPayCompositeOfferDetails plusPayCompositeOfferDetails, TariffOfferDetails tariffOfferDetails, List list, PlusPayLegalInfo plusPayLegalInfo, PlusPayRichText plusPayRichText, PaymentText paymentText, SuccessScreenDetails successScreenDetails, List list2, Boolean bool, String str, String str2, String str3, List list3, PlusPayAdditionalOffers plusPayAdditionalOffers, int i, Object obj) {
        if ((i & 1) != 0) {
            tariffOfferDetails = plusPayCompositeOfferDetails.tariffDetails;
        }
        return plusPayCompositeOfferDetails.copy(tariffOfferDetails, (i & 2) != 0 ? plusPayCompositeOfferDetails.optionOffersDetails : list, (i & 4) != 0 ? plusPayCompositeOfferDetails.legalInfo : plusPayLegalInfo, (i & 8) != 0 ? plusPayCompositeOfferDetails.promoLegalInfo : plusPayRichText, (i & 16) != 0 ? plusPayCompositeOfferDetails.paymentText : paymentText, (i & 32) != 0 ? plusPayCompositeOfferDetails.successScreen : successScreenDetails, (i & 64) != 0 ? plusPayCompositeOfferDetails.invoicesDetails : list2, (i & 128) != 0 ? plusPayCompositeOfferDetails.isSilentInvoiceAvailable : bool, (i & 256) != 0 ? plusPayCompositeOfferDetails.mainPaymentMethod : str, (i & 512) != 0 ? plusPayCompositeOfferDetails.posId : str2, (i & 1024) != 0 ? plusPayCompositeOfferDetails.serviceToken : str3, (i & 2048) != 0 ? plusPayCompositeOfferDetails.paymentMethodsGroups : list3, (i & 4096) != 0 ? plusPayCompositeOfferDetails.additionalOffers : plusPayAdditionalOffers);
    }

    public static final /* synthetic */ void write$Self$pay_sdk_release(PlusPayCompositeOfferDetails self, yjd output, SerialDescriptor serialDesc) {
        i3y[] i3yVarArr = $childSerializers;
        output.g(serialDesc, 0, PlusPayCompositeOfferDetails$TariffOfferDetails$$serializer.INSTANCE, self.tariffDetails);
        output.e(serialDesc, 1, (KSerializer) i3yVarArr[1].getValue(), self.optionOffersDetails);
        output.g(serialDesc, 2, PlusPayLegalInfo$$serializer.INSTANCE, self.legalInfo);
        output.g(serialDesc, 3, PlusPayRichText$$serializer.INSTANCE, self.promoLegalInfo);
        output.e(serialDesc, 4, PlusPayCompositeOfferDetails$PaymentText$$serializer.INSTANCE, self.paymentText);
        output.e(serialDesc, 5, PlusPayCompositeOfferDetails$SuccessScreenDetails$$serializer.INSTANCE, self.successScreen);
        output.e(serialDesc, 6, (KSerializer) i3yVarArr[6].getValue(), self.invoicesDetails);
        output.g(serialDesc, 7, z96.a, self.isSilentInvoiceAvailable);
        auu0 auu0Var = auu0.a;
        output.g(serialDesc, 8, auu0Var, self.mainPaymentMethod);
        output.g(serialDesc, 9, auu0Var, self.posId);
        output.g(serialDesc, 10, auu0Var, self.serviceToken);
        output.e(serialDesc, 11, (KSerializer) i3yVarArr[11].getValue(), self.paymentMethodsGroups);
        output.e(serialDesc, 12, PlusPayAdditionalOffers$$serializer.INSTANCE, self.additionalOffers);
    }

    /* renamed from: component1, reason: from getter */
    public final TariffOfferDetails getTariffDetails() {
        return this.tariffDetails;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPosId() {
        return this.posId;
    }

    /* renamed from: component11, reason: from getter */
    public final String getServiceToken() {
        return this.serviceToken;
    }

    public final List<PaymentMethodsGroup> component12() {
        return this.paymentMethodsGroups;
    }

    /* renamed from: component13, reason: from getter */
    public final PlusPayAdditionalOffers getAdditionalOffers() {
        return this.additionalOffers;
    }

    public final List<OptionOfferDetails> component2() {
        return this.optionOffersDetails;
    }

    /* renamed from: component3, reason: from getter */
    public final PlusPayLegalInfo getLegalInfo() {
        return this.legalInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final PlusPayRichText getPromoLegalInfo() {
        return this.promoLegalInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final PaymentText getPaymentText() {
        return this.paymentText;
    }

    /* renamed from: component6, reason: from getter */
    public final SuccessScreenDetails getSuccessScreen() {
        return this.successScreen;
    }

    public final List<Invoice> component7() {
        return this.invoicesDetails;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getIsSilentInvoiceAvailable() {
        return this.isSilentInvoiceAvailable;
    }

    /* renamed from: component9, reason: from getter */
    public final String getMainPaymentMethod() {
        return this.mainPaymentMethod;
    }

    public final PlusPayCompositeOfferDetails copy(TariffOfferDetails tariffDetails, List<OptionOfferDetails> optionOffersDetails, PlusPayLegalInfo legalInfo, PlusPayRichText promoLegalInfo, PaymentText paymentText, SuccessScreenDetails successScreen, List<Invoice> invoicesDetails, Boolean isSilentInvoiceAvailable, String mainPaymentMethod, String posId, String serviceToken, List<PaymentMethodsGroup> paymentMethodsGroups, PlusPayAdditionalOffers additionalOffers) {
        return new PlusPayCompositeOfferDetails(tariffDetails, optionOffersDetails, legalInfo, promoLegalInfo, paymentText, successScreen, invoicesDetails, isSilentInvoiceAvailable, mainPaymentMethod, posId, serviceToken, paymentMethodsGroups, additionalOffers);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusPayCompositeOfferDetails)) {
            return false;
        }
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails = (PlusPayCompositeOfferDetails) other;
        return jl40.l(this.tariffDetails, plusPayCompositeOfferDetails.tariffDetails) && jl40.l(this.optionOffersDetails, plusPayCompositeOfferDetails.optionOffersDetails) && jl40.l(this.legalInfo, plusPayCompositeOfferDetails.legalInfo) && jl40.l(this.promoLegalInfo, plusPayCompositeOfferDetails.promoLegalInfo) && jl40.l(this.paymentText, plusPayCompositeOfferDetails.paymentText) && jl40.l(this.successScreen, plusPayCompositeOfferDetails.successScreen) && jl40.l(this.invoicesDetails, plusPayCompositeOfferDetails.invoicesDetails) && jl40.l(this.isSilentInvoiceAvailable, plusPayCompositeOfferDetails.isSilentInvoiceAvailable) && jl40.l(this.mainPaymentMethod, plusPayCompositeOfferDetails.mainPaymentMethod) && jl40.l(this.posId, plusPayCompositeOfferDetails.posId) && jl40.l(this.serviceToken, plusPayCompositeOfferDetails.serviceToken) && jl40.l(this.paymentMethodsGroups, plusPayCompositeOfferDetails.paymentMethodsGroups) && jl40.l(this.additionalOffers, plusPayCompositeOfferDetails.additionalOffers);
    }

    public final PlusPayAdditionalOffers getAdditionalOffers() {
        return this.additionalOffers;
    }

    public final List<PaymentMethod> getAllPaymentMethods() {
        List<PaymentMethodsGroup> list = this.paymentMethodsGroups;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ycc.r(((PaymentMethodsGroup) it.next()).getPaymentMethods(), arrayList);
        }
        return arrayList;
    }

    public final List<PaymentMethod> getBoundPaymentMethods() {
        List<PaymentMethod> allPaymentMethods = getAllPaymentMethods();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allPaymentMethods) {
            if (((PaymentMethod) obj).isBound()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<Invoice> getInvoicesDetails() {
        return this.invoicesDetails;
    }

    public final PlusPayLegalInfo getLegalInfo() {
        return this.legalInfo;
    }

    public final String getMainPaymentMethod() {
        return this.mainPaymentMethod;
    }

    public final List<OptionOfferDetails> getOptionOffersDetails() {
        return this.optionOffersDetails;
    }

    public final List<PaymentMethodsGroup> getPaymentMethodsGroups() {
        return this.paymentMethodsGroups;
    }

    public final PaymentText getPaymentText() {
        return this.paymentText;
    }

    public final String getPosId() {
        return this.posId;
    }

    public final PlusPayRichText getPromoLegalInfo() {
        return this.promoLegalInfo;
    }

    public final String getServiceToken() {
        return this.serviceToken;
    }

    public final SuccessScreenDetails getSuccessScreen() {
        return this.successScreen;
    }

    public final TariffOfferDetails getTariffDetails() {
        return this.tariffDetails;
    }

    public int hashCode() {
        TariffOfferDetails tariffOfferDetails = this.tariffDetails;
        int c = unr0.c((tariffOfferDetails == null ? 0 : tariffOfferDetails.hashCode()) * 31, 31, this.optionOffersDetails);
        PlusPayLegalInfo plusPayLegalInfo = this.legalInfo;
        int hashCode = (c + (plusPayLegalInfo == null ? 0 : plusPayLegalInfo.hashCode())) * 31;
        PlusPayRichText plusPayRichText = this.promoLegalInfo;
        int c2 = unr0.c((this.successScreen.hashCode() + ((this.paymentText.hashCode() + ((hashCode + (plusPayRichText == null ? 0 : plusPayRichText.hashCode())) * 31)) * 31)) * 31, 31, this.invoicesDetails);
        Boolean bool = this.isSilentInvoiceAvailable;
        int hashCode2 = (c2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.mainPaymentMethod;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.posId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.serviceToken;
        return this.additionalOffers.hashCode() + unr0.c((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.paymentMethodsGroups);
    }

    public final Boolean isSilentInvoiceAvailable() {
        return this.isSilentInvoiceAvailable;
    }

    public String toString() {
        return "PlusPayCompositeOfferDetails(tariffDetails=" + this.tariffDetails + ", optionOffersDetails=" + this.optionOffersDetails + ", legalInfo=" + this.legalInfo + ", promoLegalInfo=" + this.promoLegalInfo + ", paymentText=" + this.paymentText + ", successScreen=" + this.successScreen + ", invoicesDetails=" + this.invoicesDetails + ", isSilentInvoiceAvailable=" + this.isSilentInvoiceAvailable + ", mainPaymentMethod=" + this.mainPaymentMethod + ", posId=" + this.posId + ", serviceToken=" + this.serviceToken + ", paymentMethodsGroups=" + this.paymentMethodsGroups + ", additionalOffers=" + this.additionalOffers + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        TariffOfferDetails tariffOfferDetails = this.tariffDetails;
        if (tariffOfferDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            tariffOfferDetails.writeToParcel(dest, flags);
        }
        Iterator t = vfc.t(dest, this.optionOffersDetails);
        while (t.hasNext()) {
            ((OptionOfferDetails) t.next()).writeToParcel(dest, flags);
        }
        PlusPayLegalInfo plusPayLegalInfo = this.legalInfo;
        if (plusPayLegalInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            plusPayLegalInfo.writeToParcel(dest, flags);
        }
        PlusPayRichText plusPayRichText = this.promoLegalInfo;
        if (plusPayRichText == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            plusPayRichText.writeToParcel(dest, flags);
        }
        this.paymentText.writeToParcel(dest, flags);
        this.successScreen.writeToParcel(dest, flags);
        Iterator t2 = vfc.t(dest, this.invoicesDetails);
        while (t2.hasNext()) {
            ((Invoice) t2.next()).writeToParcel(dest, flags);
        }
        Boolean bool = this.isSilentInvoiceAvailable;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool);
        }
        dest.writeString(this.mainPaymentMethod);
        dest.writeString(this.posId);
        dest.writeString(this.serviceToken);
        Iterator t3 = vfc.t(dest, this.paymentMethodsGroups);
        while (t3.hasNext()) {
            ((PaymentMethodsGroup) t3.next()).writeToParcel(dest, flags);
        }
        this.additionalOffers.writeToParcel(dest, flags);
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J0\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b(\u0010\u0018J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b2\u0010!¨\u00065"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$Invoice;", "Landroid/os/Parcelable;", "", ClidProvider.TIMESTAMP, "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "price", "maxPoints", "<init>", "(JLcom/yandex/plus/pay/api/model/PlusPayPrice;Lcom/yandex/plus/pay/api/model/PlusPayPrice;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(IJLcom/yandex/plus/pay/api/model/PlusPayPrice;Lcom/yandex/plus/pay/api/model/PlusPayPrice;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$Invoice;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()J", "component2", "()Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "component3", "copy", "(JLcom/yandex/plus/pay/api/model/PlusPayPrice;Lcom/yandex/plus/pay/api/model/PlusPayPrice;)Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$Invoice;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestamp", "Lcom/yandex/plus/pay/api/model/PlusPayPrice;", "getPrice", "getMaxPoints", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Invoice implements Parcelable {
        private final PlusPayPrice maxPoints;
        private final PlusPayPrice price;
        private final long timestamp;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Invoice> CREATOR = new Creator();

        public /* synthetic */ Invoice(int i, long j, PlusPayPrice plusPayPrice, PlusPayPrice plusPayPrice2, psq0 psq0Var) {
            if (7 != (i & 7)) {
                qje.Z(i, 7, PlusPayCompositeOfferDetails$Invoice$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.timestamp = j;
            this.price = plusPayPrice;
            this.maxPoints = plusPayPrice2;
        }

        public static /* synthetic */ Invoice copy$default(Invoice invoice, long j, PlusPayPrice plusPayPrice, PlusPayPrice plusPayPrice2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = invoice.timestamp;
            }
            if ((i & 2) != 0) {
                plusPayPrice = invoice.price;
            }
            if ((i & 4) != 0) {
                plusPayPrice2 = invoice.maxPoints;
            }
            return invoice.copy(j, plusPayPrice, plusPayPrice2);
        }

        public static final /* synthetic */ void write$Self$pay_sdk_release(Invoice self, yjd output, SerialDescriptor serialDesc) {
            output.s(serialDesc, 0, self.timestamp);
            PlusPayPrice$$serializer plusPayPrice$$serializer = PlusPayPrice$$serializer.INSTANCE;
            output.e(serialDesc, 1, plusPayPrice$$serializer, self.price);
            output.g(serialDesc, 2, plusPayPrice$$serializer, self.maxPoints);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component2, reason: from getter */
        public final PlusPayPrice getPrice() {
            return this.price;
        }

        /* renamed from: component3, reason: from getter */
        public final PlusPayPrice getMaxPoints() {
            return this.maxPoints;
        }

        public final Invoice copy(long timestamp, PlusPayPrice price, PlusPayPrice maxPoints) {
            return new Invoice(timestamp, price, maxPoints);
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
            return this.timestamp == invoice.timestamp && jl40.l(this.price, invoice.price) && jl40.l(this.maxPoints, invoice.maxPoints);
        }

        public final PlusPayPrice getMaxPoints() {
            return this.maxPoints;
        }

        public final PlusPayPrice getPrice() {
            return this.price;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            int hashCode = (this.price.hashCode() + (Long.hashCode(this.timestamp) * 31)) * 31;
            PlusPayPrice plusPayPrice = this.maxPoints;
            return hashCode + (plusPayPrice == null ? 0 : plusPayPrice.hashCode());
        }

        public String toString() {
            return "Invoice(timestamp=" + this.timestamp + ", price=" + this.price + ", maxPoints=" + this.maxPoints + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeLong(this.timestamp);
            dest.writeParcelable(this.price, flags);
            dest.writeParcelable(this.maxPoints, flags);
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$Invoice$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$Invoice;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer serializer() {
                return PlusPayCompositeOfferDetails$Invoice$$serializer.INSTANCE;
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
                return new Invoice(parcel.readLong(), (PlusPayPrice) parcel.readParcelable(Invoice.class.getClassLoader()), (PlusPayPrice) parcel.readParcelable(Invoice.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Invoice[] newArray(int i) {
                return new Invoice[i];
            }
        }

        public Invoice(long j, PlusPayPrice plusPayPrice, PlusPayPrice plusPayPrice2) {
            this.timestamp = j;
            this.price = plusPayPrice;
            this.maxPoints = plusPayPrice2;
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KJBq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB\u008d\u0001\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u001e\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u001c\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u008c\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001eJ\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010\u0016J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101J'\u00109\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b<\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b=\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b>\u0010\u001eR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\b@\u0010#R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\bA\u0010#R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\bB\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\bC\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bE\u0010(R\u0013\u0010G\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\bF\u0010\u001eR\u0013\u0010I\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\bH\u0010\u001e¨\u0006L"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$OptionOfferDetails;", "Landroid/os/Parcelable;", "", "title", "text", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "additionText", "", "payload", "images", "offerName", "optionName", "Lcom/yandex/plus/core/data/common/PlusColor;", "backgroundTv", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusColor;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusColor;Lpsq0;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/Map;", "component6", "component7", "component8", "component9", "()Lcom/yandex/plus/core/data/common/PlusColor;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusColor;)Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$OptionOfferDetails;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$OptionOfferDetails;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getText", "getDescription", "getAdditionText", "Ljava/util/Map;", "getPayload", "getImages", "getOfferName", "getOptionName", "Lcom/yandex/plus/core/data/common/PlusColor;", "getBackgroundTv", "getLightImageUrl", "lightImageUrl", "getDarkImageUrl", "darkImageUrl", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @gsq0
    public static final /* data */ class OptionOfferDetails implements Parcelable {
        private static final i3y[] $childSerializers;
        private final String additionText;
        private final PlusColor backgroundTv;
        private final String description;
        private final Map<String, String> images;
        private final String offerName;
        private final String optionName;
        private final Map<String, String> payload;
        private final String text;
        private final String title;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<OptionOfferDetails> CREATOR = new Creator();

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new i3y[]{null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new cad0(7)), kotlin.a.b(lazyThreadSafetyMode, new cad0(8)), null, null, kotlin.a.b(lazyThreadSafetyMode, new cad0(9))};
        }

        public /* synthetic */ OptionOfferDetails(int i, String str, String str2, String str3, String str4, Map map, Map map2, String str5, String str6, PlusColor plusColor, psq0 psq0Var) {
            if (511 != (i & 511)) {
                qje.Z(i, 511, PlusPayCompositeOfferDetails$OptionOfferDetails$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.title = str;
            this.text = str2;
            this.description = str3;
            this.additionText = str4;
            this.payload = map;
            this.images = map2;
            this.offerName = str5;
            this.optionName = str6;
            this.backgroundTv = plusColor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            auu0 auu0Var = auu0.a;
            return new k8u(auu0Var, auu0Var, 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            auu0 auu0Var = auu0.a;
            return new k8u(auu0Var, auu0Var, 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return PlusColor.Companion.serializer();
        }

        public static /* synthetic */ OptionOfferDetails copy$default(OptionOfferDetails optionOfferDetails, String str, String str2, String str3, String str4, Map map, Map map2, String str5, String str6, PlusColor plusColor, int i, Object obj) {
            if ((i & 1) != 0) {
                str = optionOfferDetails.title;
            }
            if ((i & 2) != 0) {
                str2 = optionOfferDetails.text;
            }
            if ((i & 4) != 0) {
                str3 = optionOfferDetails.description;
            }
            if ((i & 8) != 0) {
                str4 = optionOfferDetails.additionText;
            }
            if ((i & 16) != 0) {
                map = optionOfferDetails.payload;
            }
            if ((i & 32) != 0) {
                map2 = optionOfferDetails.images;
            }
            if ((i & 64) != 0) {
                str5 = optionOfferDetails.offerName;
            }
            if ((i & 128) != 0) {
                str6 = optionOfferDetails.optionName;
            }
            if ((i & 256) != 0) {
                plusColor = optionOfferDetails.backgroundTv;
            }
            String str7 = str6;
            PlusColor plusColor2 = plusColor;
            Map map3 = map2;
            String str8 = str5;
            Map map4 = map;
            String str9 = str3;
            return optionOfferDetails.copy(str, str2, str9, str4, map4, map3, str8, str7, plusColor2);
        }

        public static final /* synthetic */ void write$Self$pay_sdk_release(OptionOfferDetails self, yjd output, SerialDescriptor serialDesc) {
            i3y[] i3yVarArr = $childSerializers;
            output.o(serialDesc, 0, self.title);
            auu0 auu0Var = auu0.a;
            output.g(serialDesc, 1, auu0Var, self.text);
            output.g(serialDesc, 2, auu0Var, self.description);
            output.g(serialDesc, 3, auu0Var, self.additionText);
            output.g(serialDesc, 4, (KSerializer) i3yVarArr[4].getValue(), self.payload);
            output.e(serialDesc, 5, (KSerializer) i3yVarArr[5].getValue(), self.images);
            output.o(serialDesc, 6, self.offerName);
            output.o(serialDesc, 7, self.optionName);
            output.g(serialDesc, 8, (KSerializer) i3yVarArr[8].getValue(), self.backgroundTv);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAdditionText() {
            return this.additionText;
        }

        public final Map<String, String> component5() {
            return this.payload;
        }

        public final Map<String, String> component6() {
            return this.images;
        }

        /* renamed from: component7, reason: from getter */
        public final String getOfferName() {
            return this.offerName;
        }

        /* renamed from: component8, reason: from getter */
        public final String getOptionName() {
            return this.optionName;
        }

        /* renamed from: component9, reason: from getter */
        public final PlusColor getBackgroundTv() {
            return this.backgroundTv;
        }

        public final OptionOfferDetails copy(String title, String text, String description, String additionText, Map<String, String> payload, Map<String, String> images, String offerName, String optionName, PlusColor backgroundTv) {
            return new OptionOfferDetails(title, text, description, additionText, payload, images, offerName, optionName, backgroundTv);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptionOfferDetails)) {
                return false;
            }
            OptionOfferDetails optionOfferDetails = (OptionOfferDetails) other;
            return jl40.l(this.title, optionOfferDetails.title) && jl40.l(this.text, optionOfferDetails.text) && jl40.l(this.description, optionOfferDetails.description) && jl40.l(this.additionText, optionOfferDetails.additionText) && jl40.l(this.payload, optionOfferDetails.payload) && jl40.l(this.images, optionOfferDetails.images) && jl40.l(this.offerName, optionOfferDetails.offerName) && jl40.l(this.optionName, optionOfferDetails.optionName) && jl40.l(this.backgroundTv, optionOfferDetails.backgroundTv);
        }

        public final String getAdditionText() {
            return this.additionText;
        }

        public final PlusColor getBackgroundTv() {
            return this.backgroundTv;
        }

        public final String getDarkImageUrl() {
            return this.images.get("dark");
        }

        public final String getDescription() {
            return this.description;
        }

        public final Map<String, String> getImages() {
            return this.images;
        }

        public final String getLightImageUrl() {
            return this.images.get("light");
        }

        public final String getOfferName() {
            return this.offerName;
        }

        public final String getOptionName() {
            return this.optionName;
        }

        public final Map<String, String> getPayload() {
            return this.payload;
        }

        public final String getText() {
            return this.text;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.text;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.additionText;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Map<String, String> map = this.payload;
            int b = unr0.b(unr0.b(unr0.d((hashCode4 + (map == null ? 0 : map.hashCode())) * 31, 31, this.images), 31, this.offerName), 31, this.optionName);
            PlusColor plusColor = this.backgroundTv;
            return b + (plusColor != null ? plusColor.hashCode() : 0);
        }

        public String toString() {
            return "OptionOfferDetails(title=" + this.title + ", text=" + this.text + ", description=" + this.description + ", additionText=" + this.additionText + ", payload=" + this.payload + ", images=" + this.images + ", offerName=" + this.offerName + ", optionName=" + this.optionName + ", backgroundTv=" + this.backgroundTv + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.title);
            dest.writeString(this.text);
            dest.writeString(this.description);
            dest.writeString(this.additionText);
            Map<String, String> map = this.payload;
            if (map == null) {
                dest.writeInt(0);
            } else {
                Iterator s = x4e.s(dest, 1, map);
                while (s.hasNext()) {
                    Map.Entry entry = (Map.Entry) s.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeString((String) entry.getValue());
                }
            }
            Iterator x = qv10.x(this.images, dest);
            while (x.hasNext()) {
                Map.Entry entry2 = (Map.Entry) x.next();
                dest.writeString((String) entry2.getKey());
                dest.writeString((String) entry2.getValue());
            }
            dest.writeString(this.offerName);
            dest.writeString(this.optionName);
            dest.writeParcelable(this.backgroundTv, flags);
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$OptionOfferDetails$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$OptionOfferDetails;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer serializer() {
                return PlusPayCompositeOfferDetails$OptionOfferDetails$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OptionOfferDetails> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionOfferDetails createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                int i = 0;
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i2 = 0;
                    while (i2 != readInt) {
                        i2 = xvz.b(parcel, linkedHashMap2, parcel.readString(), i2, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt2);
                while (i != readInt2) {
                    i = xvz.b(parcel, linkedHashMap3, parcel.readString(), i, 1);
                }
                return new OptionOfferDetails(readString, readString2, readString3, readString4, linkedHashMap, linkedHashMap3, parcel.readString(), parcel.readString(), (PlusColor) parcel.readParcelable(OptionOfferDetails.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionOfferDetails[] newArray(int i) {
                return new OptionOfferDetails[i];
            }
        }

        public OptionOfferDetails(String str, String str2, String str3, String str4, Map<String, String> map, Map<String, String> map2, String str5, String str6, PlusColor plusColor) {
            this.title = str;
            this.text = str2;
            this.description = str3;
            this.additionText = str4;
            this.payload = map;
            this.images = map2;
            this.offerName = str5;
            this.optionName = str6;
            this.backgroundTv = plusColor;
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nBE\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b$\u0010#J:\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010!J\u0010\u0010(\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b(\u0010\u001aJ\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b2\u0010#¨\u00065"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethodsGroup;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod;", "paymentMethods", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentPromo;", "paymentPromos", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethodsGroup;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethodsGroup;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getPaymentMethods", "getPaymentPromos", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @gsq0
    public static final /* data */ class PaymentMethodsGroup implements Parcelable {
        private static final i3y[] $childSerializers;
        private final List<PaymentMethod> paymentMethods;
        private final List<PaymentPromo> paymentPromos;
        private final String title;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<PaymentMethodsGroup> CREATOR = new Creator();

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new cad0(13)), kotlin.a.b(lazyThreadSafetyMode, new cad0(14))};
        }

        public /* synthetic */ PaymentMethodsGroup(int i, String str, List list, List list2, psq0 psq0Var) {
            if (7 != (i & 7)) {
                qje.Z(i, 7, PlusPayCompositeOfferDetails$PaymentMethodsGroup$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.title = str;
            this.paymentMethods = list;
            this.paymentPromos = list2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new p53(PlusPayCompositeOfferDetails$PaymentMethod$$serializer.INSTANCE, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new p53(PlusPayCompositeOfferDetails$PaymentPromo$$serializer.INSTANCE, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodsGroup copy$default(PaymentMethodsGroup paymentMethodsGroup, String str, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paymentMethodsGroup.title;
            }
            if ((i & 2) != 0) {
                list = paymentMethodsGroup.paymentMethods;
            }
            if ((i & 4) != 0) {
                list2 = paymentMethodsGroup.paymentPromos;
            }
            return paymentMethodsGroup.copy(str, list, list2);
        }

        public static final /* synthetic */ void write$Self$pay_sdk_release(PaymentMethodsGroup self, yjd output, SerialDescriptor serialDesc) {
            i3y[] i3yVarArr = $childSerializers;
            output.o(serialDesc, 0, self.title);
            output.e(serialDesc, 1, (KSerializer) i3yVarArr[1].getValue(), self.paymentMethods);
            output.e(serialDesc, 2, (KSerializer) i3yVarArr[2].getValue(), self.paymentPromos);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<PaymentMethod> component2() {
            return this.paymentMethods;
        }

        public final List<PaymentPromo> component3() {
            return this.paymentPromos;
        }

        public final PaymentMethodsGroup copy(String title, List<PaymentMethod> paymentMethods, List<PaymentPromo> paymentPromos) {
            return new PaymentMethodsGroup(title, paymentMethods, paymentPromos);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentMethodsGroup)) {
                return false;
            }
            PaymentMethodsGroup paymentMethodsGroup = (PaymentMethodsGroup) other;
            return jl40.l(this.title, paymentMethodsGroup.title) && jl40.l(this.paymentMethods, paymentMethodsGroup.paymentMethods) && jl40.l(this.paymentPromos, paymentMethodsGroup.paymentPromos);
        }

        public final List<PaymentMethod> getPaymentMethods() {
            return this.paymentMethods;
        }

        public final List<PaymentPromo> getPaymentPromos() {
            return this.paymentPromos;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.paymentPromos.hashCode() + unr0.c(this.title.hashCode() * 31, 31, this.paymentMethods);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PaymentMethodsGroup(title=");
            sb.append(this.title);
            sb.append(", paymentMethods=");
            sb.append(this.paymentMethods);
            sb.append(", paymentPromos=");
            return unr0.t(sb, this.paymentPromos, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.title);
            Iterator t = vfc.t(dest, this.paymentMethods);
            while (t.hasNext()) {
                ((PaymentMethod) t.next()).writeToParcel(dest, flags);
            }
            Iterator t2 = vfc.t(dest, this.paymentPromos);
            while (t2.hasNext()) {
                ((PaymentPromo) t2.next()).writeToParcel(dest, flags);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethodsGroup$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethodsGroup;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer serializer() {
                return PlusPayCompositeOfferDetails$PaymentMethodsGroup$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentMethodsGroup> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentMethodsGroup createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = oo31.d(PaymentMethod.CREATOR, parcel, arrayList, i2, 1);
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = oo31.d(PaymentPromo.CREATOR, parcel, arrayList2, i, 1);
                }
                return new PaymentMethodsGroup(readString, arrayList, arrayList2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentMethodsGroup[] newArray(int i) {
                return new PaymentMethodsGroup[i];
            }
        }

        public PaymentMethodsGroup(String str, List<PaymentMethod> list, List<PaymentPromo> list2) {
            this.title = str;
            this.paymentMethods = list;
            this.paymentPromos = list2;
        }
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000e¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b*\u0010+JN\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b.\u0010+J\u0010\u0010/\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b/\u0010\u001dJ\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010$R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b9\u0010'R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010+¨\u0006@"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentPromo;", "Landroid/os/Parcelable;", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "benefitTitle", "additionalTitle", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "imageUrl", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "Lcom/yandex/plus/core/data/common/PlusColor;", "backGroundColor", "", "paymentMethodId", "<init>", "(Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedColor;Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedColor;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentPromo;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "component2", "component3", "()Lcom/yandex/plus/core/data/common/PlusThemedImage;", "component4", "()Lcom/yandex/plus/core/data/common/PlusThemedColor;", "component5", "()Ljava/lang/String;", "copy", "(Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/pay/internal/model/PlusPayRichText;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedColor;Ljava/lang/String;)Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentPromo;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/internal/model/PlusPayRichText;", "getBenefitTitle", "getAdditionalTitle", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "getImageUrl", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "getBackGroundColor", "Ljava/lang/String;", "getPaymentMethodId", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @gsq0
    public static final /* data */ class PaymentPromo implements Parcelable {
        private final PlusPayRichText additionalTitle;
        private final PlusThemedColor<PlusColor> backGroundColor;
        private final PlusPayRichText benefitTitle;
        private final PlusThemedImage imageUrl;
        private final String paymentMethodId;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<PaymentPromo> CREATOR = new Creator();
        private static final i3y[] $childSerializers = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new cad0(15)), null};

        public /* synthetic */ PaymentPromo(int i, PlusPayRichText plusPayRichText, PlusPayRichText plusPayRichText2, PlusThemedImage plusThemedImage, PlusThemedColor plusThemedColor, String str, psq0 psq0Var) {
            if (31 != (i & 31)) {
                qje.Z(i, 31, PlusPayCompositeOfferDetails$PaymentPromo$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.benefitTitle = plusPayRichText;
            this.additionalTitle = plusPayRichText2;
            this.imageUrl = plusThemedImage;
            this.backGroundColor = plusThemedColor;
            this.paymentMethodId = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return PlusThemedColor.Companion.serializer(PlusColor.Companion.serializer());
        }

        public static /* synthetic */ PaymentPromo copy$default(PaymentPromo paymentPromo, PlusPayRichText plusPayRichText, PlusPayRichText plusPayRichText2, PlusThemedImage plusThemedImage, PlusThemedColor plusThemedColor, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                plusPayRichText = paymentPromo.benefitTitle;
            }
            if ((i & 2) != 0) {
                plusPayRichText2 = paymentPromo.additionalTitle;
            }
            if ((i & 4) != 0) {
                plusThemedImage = paymentPromo.imageUrl;
            }
            if ((i & 8) != 0) {
                plusThemedColor = paymentPromo.backGroundColor;
            }
            if ((i & 16) != 0) {
                str = paymentPromo.paymentMethodId;
            }
            String str2 = str;
            PlusThemedImage plusThemedImage2 = plusThemedImage;
            return paymentPromo.copy(plusPayRichText, plusPayRichText2, plusThemedImage2, plusThemedColor, str2);
        }

        public static final /* synthetic */ void write$Self$pay_sdk_release(PaymentPromo self, yjd output, SerialDescriptor serialDesc) {
            i3y[] i3yVarArr = $childSerializers;
            PlusPayRichText$$serializer plusPayRichText$$serializer = PlusPayRichText$$serializer.INSTANCE;
            output.e(serialDesc, 0, plusPayRichText$$serializer, self.benefitTitle);
            output.g(serialDesc, 1, plusPayRichText$$serializer, self.additionalTitle);
            output.g(serialDesc, 2, xpd0.a, self.imageUrl);
            output.e(serialDesc, 3, (KSerializer) i3yVarArr[3].getValue(), self.backGroundColor);
            output.g(serialDesc, 4, auu0.a, self.paymentMethodId);
        }

        /* renamed from: component1, reason: from getter */
        public final PlusPayRichText getBenefitTitle() {
            return this.benefitTitle;
        }

        /* renamed from: component2, reason: from getter */
        public final PlusPayRichText getAdditionalTitle() {
            return this.additionalTitle;
        }

        /* renamed from: component3, reason: from getter */
        public final PlusThemedImage getImageUrl() {
            return this.imageUrl;
        }

        public final PlusThemedColor<PlusColor> component4() {
            return this.backGroundColor;
        }

        /* renamed from: component5, reason: from getter */
        public final String getPaymentMethodId() {
            return this.paymentMethodId;
        }

        public final PaymentPromo copy(PlusPayRichText benefitTitle, PlusPayRichText additionalTitle, PlusThemedImage imageUrl, PlusThemedColor<PlusColor> backGroundColor, String paymentMethodId) {
            return new PaymentPromo(benefitTitle, additionalTitle, imageUrl, backGroundColor, paymentMethodId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentPromo)) {
                return false;
            }
            PaymentPromo paymentPromo = (PaymentPromo) other;
            return jl40.l(this.benefitTitle, paymentPromo.benefitTitle) && jl40.l(this.additionalTitle, paymentPromo.additionalTitle) && jl40.l(this.imageUrl, paymentPromo.imageUrl) && jl40.l(this.backGroundColor, paymentPromo.backGroundColor) && jl40.l(this.paymentMethodId, paymentPromo.paymentMethodId);
        }

        public final PlusPayRichText getAdditionalTitle() {
            return this.additionalTitle;
        }

        public final PlusThemedColor<PlusColor> getBackGroundColor() {
            return this.backGroundColor;
        }

        public final PlusPayRichText getBenefitTitle() {
            return this.benefitTitle;
        }

        public final PlusThemedImage getImageUrl() {
            return this.imageUrl;
        }

        public final String getPaymentMethodId() {
            return this.paymentMethodId;
        }

        public int hashCode() {
            int hashCode = this.benefitTitle.hashCode() * 31;
            PlusPayRichText plusPayRichText = this.additionalTitle;
            int hashCode2 = (hashCode + (plusPayRichText == null ? 0 : plusPayRichText.hashCode())) * 31;
            PlusThemedImage plusThemedImage = this.imageUrl;
            int c = vfc.c(this.backGroundColor, (hashCode2 + (plusThemedImage == null ? 0 : plusThemedImage.hashCode())) * 31, 31);
            String str = this.paymentMethodId;
            return c + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PaymentPromo(benefitTitle=");
            sb.append(this.benefitTitle);
            sb.append(", additionalTitle=");
            sb.append(this.additionalTitle);
            sb.append(", imageUrl=");
            sb.append(this.imageUrl);
            sb.append(", backGroundColor=");
            sb.append(this.backGroundColor);
            sb.append(", paymentMethodId=");
            return b64.p(sb, this.paymentMethodId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            this.benefitTitle.writeToParcel(dest, flags);
            PlusPayRichText plusPayRichText = this.additionalTitle;
            if (plusPayRichText == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                plusPayRichText.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.imageUrl, flags);
            dest.writeParcelable(this.backGroundColor, flags);
            dest.writeString(this.paymentMethodId);
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentPromo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentPromo;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer serializer() {
                return PlusPayCompositeOfferDetails$PaymentPromo$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentPromo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentPromo createFromParcel(Parcel parcel) {
                Parcelable.Creator<PlusPayRichText> creator = PlusPayRichText.CREATOR;
                return new PaymentPromo(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), (PlusThemedImage) parcel.readParcelable(PaymentPromo.class.getClassLoader()), (PlusThemedColor) parcel.readParcelable(PaymentPromo.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentPromo[] newArray(int i) {
                return new PaymentPromo[i];
            }
        }

        public PaymentPromo(PlusPayRichText plusPayRichText, PlusPayRichText plusPayRichText2, PlusThemedImage plusThemedImage, PlusThemedColor<PlusColor> plusThemedColor, String str) {
            this.benefitTitle = plusPayRichText;
            this.additionalTitle = plusPayRichText2;
            this.imageUrl = plusThemedImage;
            this.backGroundColor = plusThemedColor;
            this.paymentMethodId = str;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ$\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010\u0016J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001d¨\u0006-"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentText;", "Landroid/os/Parcelable;", "", "firstPaymentText", "nextPaymentText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentText;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentText;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFirstPaymentText", "getNextPaymentText", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @gsq0
    public static final /* data */ class PaymentText implements Parcelable {
        private final String firstPaymentText;
        private final String nextPaymentText;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<PaymentText> CREATOR = new Creator();

        public /* synthetic */ PaymentText(int i, String str, String str2, psq0 psq0Var) {
            if (3 != (i & 3)) {
                qje.Z(i, 3, PlusPayCompositeOfferDetails$PaymentText$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.firstPaymentText = str;
            this.nextPaymentText = str2;
        }

        public static /* synthetic */ PaymentText copy$default(PaymentText paymentText, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paymentText.firstPaymentText;
            }
            if ((i & 2) != 0) {
                str2 = paymentText.nextPaymentText;
            }
            return paymentText.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$pay_sdk_release(PaymentText self, yjd output, SerialDescriptor serialDesc) {
            output.o(serialDesc, 0, self.firstPaymentText);
            output.o(serialDesc, 1, self.nextPaymentText);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFirstPaymentText() {
            return this.firstPaymentText;
        }

        /* renamed from: component2, reason: from getter */
        public final String getNextPaymentText() {
            return this.nextPaymentText;
        }

        public final PaymentText copy(String firstPaymentText, String nextPaymentText) {
            return new PaymentText(firstPaymentText, nextPaymentText);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentText)) {
                return false;
            }
            PaymentText paymentText = (PaymentText) other;
            return jl40.l(this.firstPaymentText, paymentText.firstPaymentText) && jl40.l(this.nextPaymentText, paymentText.nextPaymentText);
        }

        public final String getFirstPaymentText() {
            return this.firstPaymentText;
        }

        public final String getNextPaymentText() {
            return this.nextPaymentText;
        }

        public int hashCode() {
            return this.nextPaymentText.hashCode() + (this.firstPaymentText.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PaymentText(firstPaymentText=");
            sb.append(this.firstPaymentText);
            sb.append(", nextPaymentText=");
            return b64.p(sb, this.nextPaymentText, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.firstPaymentText);
            dest.writeString(this.nextPaymentText);
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentText$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentText;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer serializer() {
                return PlusPayCompositeOfferDetails$PaymentText$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentText> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentText createFromParcel(Parcel parcel) {
                return new PaymentText(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentText[] newArray(int i) {
                return new PaymentText[i];
            }
        }

        public PaymentText(String str, String str2) {
            this.firstPaymentText = str;
            this.nextPaymentText = str2;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ&\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010\u0016J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001d¨\u0006-"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$SuccessScreenDetails;", "Landroid/os/Parcelable;", "", "title", Constants.KEY_MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$SuccessScreenDetails;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$SuccessScreenDetails;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getMessage", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @gsq0
    public static final /* data */ class SuccessScreenDetails implements Parcelable {
        private final String message;
        private final String title;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<SuccessScreenDetails> CREATOR = new Creator();

        public /* synthetic */ SuccessScreenDetails(int i, String str, String str2, psq0 psq0Var) {
            if (3 != (i & 3)) {
                qje.Z(i, 3, PlusPayCompositeOfferDetails$SuccessScreenDetails$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.title = str;
            this.message = str2;
        }

        public static /* synthetic */ SuccessScreenDetails copy$default(SuccessScreenDetails successScreenDetails, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = successScreenDetails.title;
            }
            if ((i & 2) != 0) {
                str2 = successScreenDetails.message;
            }
            return successScreenDetails.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$pay_sdk_release(SuccessScreenDetails self, yjd output, SerialDescriptor serialDesc) {
            output.o(serialDesc, 0, self.title);
            output.g(serialDesc, 1, auu0.a, self.message);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final SuccessScreenDetails copy(String title, String message) {
            return new SuccessScreenDetails(title, message);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SuccessScreenDetails)) {
                return false;
            }
            SuccessScreenDetails successScreenDetails = (SuccessScreenDetails) other;
            return jl40.l(this.title, successScreenDetails.title) && jl40.l(this.message, successScreenDetails.message);
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.message;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SuccessScreenDetails(title=");
            sb.append(this.title);
            sb.append(", message=");
            return b64.p(sb, this.message, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.title);
            dest.writeString(this.message);
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$SuccessScreenDetails$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$SuccessScreenDetails;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer serializer() {
                return PlusPayCompositeOfferDetails$SuccessScreenDetails$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SuccessScreenDetails> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SuccessScreenDetails createFromParcel(Parcel parcel) {
                return new SuccessScreenDetails(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SuccessScreenDetails[] newArray(int i) {
                return new SuccessScreenDetails[i];
            }
        }

        public SuccessScreenDetails(String str, String str2) {
            this.title = str;
            this.message = str2;
        }
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 P2\u00020\u0001:\u0002QPB{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0097\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u001e\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u001c\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0012\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0098\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010 J\u0010\u00100\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b0\u0010\u0018J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105J'\u0010=\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\b@\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\bA\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\bB\u0010 R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bD\u0010%R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\bE\u0010%R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\bF\u0010 R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\bG\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010H\u001a\u0004\bI\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010J\u001a\u0004\bK\u0010,R\u0013\u0010M\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\bL\u0010 R\u0013\u0010O\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\bN\u0010 ¨\u0006R"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$TariffOfferDetails;", "Landroid/os/Parcelable;", "", "title", "text", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "additionText", "", "payload", "images", "offerName", "tariffName", "Lcom/yandex/plus/core/data/common/PlusColor;", "backgroundTv", "Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams;", "inAppReplacementParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusColor;Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusColor;Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams;Lpsq0;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/Map;", "component6", "component7", "component8", "component9", "()Lcom/yandex/plus/core/data/common/PlusColor;", "component10", "()Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusColor;Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams;)Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$TariffOfferDetails;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$TariffOfferDetails;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getText", "getDescription", "getAdditionText", "Ljava/util/Map;", "getPayload", "getImages", "getOfferName", "getTariffName", "Lcom/yandex/plus/core/data/common/PlusColor;", "getBackgroundTv", "Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams;", "getInAppReplacementParams", "getLightImageUrl", "lightImageUrl", "getDarkImageUrl", "darkImageUrl", "Companion", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @gsq0
    public static final /* data */ class TariffOfferDetails implements Parcelable {
        private static final i3y[] $childSerializers;
        private final String additionText;
        private final PlusColor backgroundTv;
        private final String description;
        private final Map<String, String> images;
        private final PlusPayInAppReplacementParams inAppReplacementParams;
        private final String offerName;
        private final Map<String, String> payload;
        private final String tariffName;
        private final String text;
        private final String title;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<TariffOfferDetails> CREATOR = new Creator();

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new i3y[]{null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new cad0(16)), kotlin.a.b(lazyThreadSafetyMode, new cad0(17)), null, null, kotlin.a.b(lazyThreadSafetyMode, new cad0(18)), null};
        }

        public /* synthetic */ TariffOfferDetails(int i, String str, String str2, String str3, String str4, Map map, Map map2, String str5, String str6, PlusColor plusColor, PlusPayInAppReplacementParams plusPayInAppReplacementParams, psq0 psq0Var) {
            if (1023 != (i & 1023)) {
                qje.Z(i, 1023, PlusPayCompositeOfferDetails$TariffOfferDetails$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.title = str;
            this.text = str2;
            this.description = str3;
            this.additionText = str4;
            this.payload = map;
            this.images = map2;
            this.offerName = str5;
            this.tariffName = str6;
            this.backgroundTv = plusColor;
            this.inAppReplacementParams = plusPayInAppReplacementParams;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            auu0 auu0Var = auu0.a;
            return new k8u(auu0Var, auu0Var, 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            auu0 auu0Var = auu0.a;
            return new k8u(auu0Var, auu0Var, 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return PlusColor.Companion.serializer();
        }

        public static /* synthetic */ TariffOfferDetails copy$default(TariffOfferDetails tariffOfferDetails, String str, String str2, String str3, String str4, Map map, Map map2, String str5, String str6, PlusColor plusColor, PlusPayInAppReplacementParams plusPayInAppReplacementParams, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tariffOfferDetails.title;
            }
            if ((i & 2) != 0) {
                str2 = tariffOfferDetails.text;
            }
            if ((i & 4) != 0) {
                str3 = tariffOfferDetails.description;
            }
            if ((i & 8) != 0) {
                str4 = tariffOfferDetails.additionText;
            }
            if ((i & 16) != 0) {
                map = tariffOfferDetails.payload;
            }
            if ((i & 32) != 0) {
                map2 = tariffOfferDetails.images;
            }
            if ((i & 64) != 0) {
                str5 = tariffOfferDetails.offerName;
            }
            if ((i & 128) != 0) {
                str6 = tariffOfferDetails.tariffName;
            }
            if ((i & 256) != 0) {
                plusColor = tariffOfferDetails.backgroundTv;
            }
            if ((i & 512) != 0) {
                plusPayInAppReplacementParams = tariffOfferDetails.inAppReplacementParams;
            }
            PlusColor plusColor2 = plusColor;
            PlusPayInAppReplacementParams plusPayInAppReplacementParams2 = plusPayInAppReplacementParams;
            String str7 = str5;
            String str8 = str6;
            Map map3 = map;
            Map map4 = map2;
            return tariffOfferDetails.copy(str, str2, str3, str4, map3, map4, str7, str8, plusColor2, plusPayInAppReplacementParams2);
        }

        public static final /* synthetic */ void write$Self$pay_sdk_release(TariffOfferDetails self, yjd output, SerialDescriptor serialDesc) {
            i3y[] i3yVarArr = $childSerializers;
            output.o(serialDesc, 0, self.title);
            auu0 auu0Var = auu0.a;
            output.g(serialDesc, 1, auu0Var, self.text);
            output.g(serialDesc, 2, auu0Var, self.description);
            output.g(serialDesc, 3, auu0Var, self.additionText);
            output.g(serialDesc, 4, (KSerializer) i3yVarArr[4].getValue(), self.payload);
            output.e(serialDesc, 5, (KSerializer) i3yVarArr[5].getValue(), self.images);
            output.o(serialDesc, 6, self.offerName);
            output.o(serialDesc, 7, self.tariffName);
            output.g(serialDesc, 8, (KSerializer) i3yVarArr[8].getValue(), self.backgroundTv);
            output.g(serialDesc, 9, PlusPayInAppReplacementParams$$serializer.INSTANCE, self.inAppReplacementParams);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component10, reason: from getter */
        public final PlusPayInAppReplacementParams getInAppReplacementParams() {
            return this.inAppReplacementParams;
        }

        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAdditionText() {
            return this.additionText;
        }

        public final Map<String, String> component5() {
            return this.payload;
        }

        public final Map<String, String> component6() {
            return this.images;
        }

        /* renamed from: component7, reason: from getter */
        public final String getOfferName() {
            return this.offerName;
        }

        /* renamed from: component8, reason: from getter */
        public final String getTariffName() {
            return this.tariffName;
        }

        /* renamed from: component9, reason: from getter */
        public final PlusColor getBackgroundTv() {
            return this.backgroundTv;
        }

        public final TariffOfferDetails copy(String title, String text, String description, String additionText, Map<String, String> payload, Map<String, String> images, String offerName, String tariffName, PlusColor backgroundTv, PlusPayInAppReplacementParams inAppReplacementParams) {
            return new TariffOfferDetails(title, text, description, additionText, payload, images, offerName, tariffName, backgroundTv, inAppReplacementParams);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TariffOfferDetails)) {
                return false;
            }
            TariffOfferDetails tariffOfferDetails = (TariffOfferDetails) other;
            return jl40.l(this.title, tariffOfferDetails.title) && jl40.l(this.text, tariffOfferDetails.text) && jl40.l(this.description, tariffOfferDetails.description) && jl40.l(this.additionText, tariffOfferDetails.additionText) && jl40.l(this.payload, tariffOfferDetails.payload) && jl40.l(this.images, tariffOfferDetails.images) && jl40.l(this.offerName, tariffOfferDetails.offerName) && jl40.l(this.tariffName, tariffOfferDetails.tariffName) && jl40.l(this.backgroundTv, tariffOfferDetails.backgroundTv) && jl40.l(this.inAppReplacementParams, tariffOfferDetails.inAppReplacementParams);
        }

        public final String getAdditionText() {
            return this.additionText;
        }

        public final PlusColor getBackgroundTv() {
            return this.backgroundTv;
        }

        public final String getDarkImageUrl() {
            return this.images.get("dark");
        }

        public final String getDescription() {
            return this.description;
        }

        public final Map<String, String> getImages() {
            return this.images;
        }

        public final PlusPayInAppReplacementParams getInAppReplacementParams() {
            return this.inAppReplacementParams;
        }

        public final String getLightImageUrl() {
            return this.images.get("light");
        }

        public final String getOfferName() {
            return this.offerName;
        }

        public final Map<String, String> getPayload() {
            return this.payload;
        }

        public final String getTariffName() {
            return this.tariffName;
        }

        public final String getText() {
            return this.text;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.text;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.additionText;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Map<String, String> map = this.payload;
            int b = unr0.b(unr0.b(unr0.d((hashCode4 + (map == null ? 0 : map.hashCode())) * 31, 31, this.images), 31, this.offerName), 31, this.tariffName);
            PlusColor plusColor = this.backgroundTv;
            int hashCode5 = (b + (plusColor == null ? 0 : plusColor.hashCode())) * 31;
            PlusPayInAppReplacementParams plusPayInAppReplacementParams = this.inAppReplacementParams;
            return hashCode5 + (plusPayInAppReplacementParams != null ? plusPayInAppReplacementParams.hashCode() : 0);
        }

        public String toString() {
            return "TariffOfferDetails(title=" + this.title + ", text=" + this.text + ", description=" + this.description + ", additionText=" + this.additionText + ", payload=" + this.payload + ", images=" + this.images + ", offerName=" + this.offerName + ", tariffName=" + this.tariffName + ", backgroundTv=" + this.backgroundTv + ", inAppReplacementParams=" + this.inAppReplacementParams + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.title);
            dest.writeString(this.text);
            dest.writeString(this.description);
            dest.writeString(this.additionText);
            Map<String, String> map = this.payload;
            if (map == null) {
                dest.writeInt(0);
            } else {
                Iterator s = x4e.s(dest, 1, map);
                while (s.hasNext()) {
                    Map.Entry entry = (Map.Entry) s.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeString((String) entry.getValue());
                }
            }
            Iterator x = qv10.x(this.images, dest);
            while (x.hasNext()) {
                Map.Entry entry2 = (Map.Entry) x.next();
                dest.writeString((String) entry2.getKey());
                dest.writeString((String) entry2.getValue());
            }
            dest.writeString(this.offerName);
            dest.writeString(this.tariffName);
            dest.writeParcelable(this.backgroundTv, flags);
            PlusPayInAppReplacementParams plusPayInAppReplacementParams = this.inAppReplacementParams;
            if (plusPayInAppReplacementParams == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                plusPayInAppReplacementParams.writeToParcel(dest, flags);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$TariffOfferDetails$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$TariffOfferDetails;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer serializer() {
                return PlusPayCompositeOfferDetails$TariffOfferDetails$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TariffOfferDetails> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TariffOfferDetails createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                int i = 0;
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt);
                    int i2 = 0;
                    while (i2 != readInt) {
                        i2 = xvz.b(parcel, linkedHashMap, parcel.readString(), i2, 1);
                    }
                }
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                while (i != readInt2) {
                    i = xvz.b(parcel, linkedHashMap2, parcel.readString(), i, 1);
                }
                return new TariffOfferDetails(readString, readString2, readString3, readString4, linkedHashMap, linkedHashMap2, parcel.readString(), parcel.readString(), (PlusColor) parcel.readParcelable(TariffOfferDetails.class.getClassLoader()), parcel.readInt() == 0 ? null : PlusPayInAppReplacementParams.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TariffOfferDetails[] newArray(int i) {
                return new TariffOfferDetails[i];
            }
        }

        public TariffOfferDetails(String str, String str2, String str3, String str4, Map<String, String> map, Map<String, String> map2, String str5, String str6, PlusColor plusColor, PlusPayInAppReplacementParams plusPayInAppReplacementParams) {
            this.title = str;
            this.text = str2;
            this.description = str3;
            this.additionText = str4;
            this.payload = map;
            this.images = map2;
            this.offerName = str5;
            this.tariffName = str6;
            this.backgroundTv = plusColor;
            this.inAppReplacementParams = plusPayInAppReplacementParams;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$Companion;", "", "<init>", "()V", "LIGHT", "", "DARK", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return PlusPayCompositeOfferDetails$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusPayCompositeOfferDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayCompositeOfferDetails createFromParcel(Parcel parcel) {
            Boolean bool = null;
            TariffOfferDetails createFromParcel = parcel.readInt() == 0 ? null : TariffOfferDetails.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = oo31.d(OptionOfferDetails.CREATOR, parcel, arrayList, i2, 1);
            }
            PlusPayLegalInfo createFromParcel2 = parcel.readInt() == 0 ? null : PlusPayLegalInfo.CREATOR.createFromParcel(parcel);
            PlusPayRichText createFromParcel3 = parcel.readInt() == 0 ? null : PlusPayRichText.CREATOR.createFromParcel(parcel);
            PaymentText createFromParcel4 = PaymentText.CREATOR.createFromParcel(parcel);
            SuccessScreenDetails createFromParcel5 = SuccessScreenDetails.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i3 = 0;
            while (i3 != readInt2) {
                i3 = oo31.d(Invoice.CREATOR, parcel, arrayList2, i3, 1);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            while (true) {
                PlusPayRichText plusPayRichText = createFromParcel3;
                if (i == readInt3) {
                    return new PlusPayCompositeOfferDetails(createFromParcel, arrayList, createFromParcel2, plusPayRichText, createFromParcel4, createFromParcel5, arrayList2, bool, readString, readString2, readString3, arrayList3, PlusPayAdditionalOffers.CREATOR.createFromParcel(parcel));
                }
                i = oo31.d(PaymentMethodsGroup.CREATOR, parcel, arrayList3, i, 1);
                createFromParcel3 = plusPayRichText;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayCompositeOfferDetails[] newArray(int i) {
            return new PlusPayCompositeOfferDetails[i];
        }
    }

    public PlusPayCompositeOfferDetails(TariffOfferDetails tariffOfferDetails, List<OptionOfferDetails> list, PlusPayLegalInfo plusPayLegalInfo, PlusPayRichText plusPayRichText, PaymentText paymentText, SuccessScreenDetails successScreenDetails, List<Invoice> list2, Boolean bool, String str, String str2, String str3, List<PaymentMethodsGroup> list3, PlusPayAdditionalOffers plusPayAdditionalOffers) {
        this.tariffDetails = tariffOfferDetails;
        this.optionOffersDetails = list;
        this.legalInfo = plusPayLegalInfo;
        this.promoLegalInfo = plusPayRichText;
        this.paymentText = paymentText;
        this.successScreen = successScreenDetails;
        this.invoicesDetails = list2;
        this.isSilentInvoiceAvailable = bool;
        this.mainPaymentMethod = str;
        this.posId = str2;
        this.serviceToken = str3;
        this.paymentMethodsGroups = list3;
        this.additionalOffers = plusPayAdditionalOffers;
    }
}
