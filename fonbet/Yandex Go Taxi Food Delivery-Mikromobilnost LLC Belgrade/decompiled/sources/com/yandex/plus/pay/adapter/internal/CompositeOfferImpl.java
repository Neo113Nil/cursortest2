package com.yandex.plus.pay.adapter.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer;
import com.yandex.plus.pay.adapter.internal.CompositeOfferImpl;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import defpackage.gqd;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.psq0;
import defpackage.qje;
import defpackage.sls;
import defpackage.tcc;
import defpackage.vpd;
import defpackage.w511;
import defpackage.wpd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0081\b\u0018\u0000 ^2\u00020\u0001:\u0002_`B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010'\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0014R#\u00101\u001a\u0004\u0018\u00010*8VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R'\u00108\u001a\b\u0012\u0004\u0012\u000203028VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\b4\u0010,\u0012\u0004\b7\u00100\u001a\u0004\b5\u00106R#\u0010>\u001a\u0004\u0018\u0001098VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\b:\u0010,\u0012\u0004\b=\u00100\u001a\u0004\b;\u0010<R'\u0010C\u001a\b\u0012\u0004\u0012\u00020?028VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\b@\u0010,\u0012\u0004\bB\u00100\u001a\u0004\bA\u00106R#\u0010I\u001a\u0004\u0018\u00010D8VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\bE\u0010,\u0012\u0004\bH\u00100\u001a\u0004\bF\u0010GR!\u0010O\u001a\u00020J8VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\bK\u0010,\u0012\u0004\bN\u00100\u001a\u0004\bL\u0010MR\u001a\u0010R\u001a\u00020\u00178VX\u0096\u0004¢\u0006\f\u0012\u0004\bQ\u00100\u001a\u0004\bP\u0010\u0019R\u001a\u0010W\u001a\u00020S8VX\u0096\u0004¢\u0006\f\u0012\u0004\bV\u00100\u001a\u0004\bT\u0010UR\u001c\u0010Z\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\f\u0012\u0004\bY\u00100\u001a\u0004\bX\u0010\u0019R\u001a\u0010[\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\f\u0012\u0004\b]\u00100\u001a\u0004\b[\u0010\\¨\u0006a"}, d2 = {"Lcom/yandex/plus/pay/adapter/internal/CompositeOfferImpl;", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "actualOffer", "<init>", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;Lpsq0;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "copy", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;)Lcom/yandex/plus/pay/adapter/internal/CompositeOfferImpl;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$plus_sdk_pay_sdk_adapter_impl_release", "(Lcom/yandex/plus/pay/adapter/internal/CompositeOfferImpl;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "getActualOffer", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Tariff;", "tariffOffer$delegate", "Li3y;", "getTariffOffer", "()Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Tariff;", "getTariffOffer$annotations", "()V", "tariffOffer", "", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Option;", "optionOffers$delegate", "getOptionOffers", "()Ljava/util/List;", "getOptionOffers$annotations", "optionOffers", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$LegalInfo;", "legalInfo$delegate", "getLegalInfo", "()Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$LegalInfo;", "getLegalInfo$annotations", "legalInfo", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Invoice;", "invoices$delegate", "getInvoices", "getInvoices$annotations", "invoices", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Assets;", "assets$delegate", "getAssets", "()Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Assets;", "getAssets$annotations", "assets", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Meta;", "meta$delegate", "getMeta", "()Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Meta;", "getMeta$annotations", Constants.REFERRER_API_META, "getPositionId", "getPositionId$annotations", "positionId", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$StructureType;", "getStructureType", "()Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$StructureType;", "getStructureType$annotations", "structureType", "getActiveTariffId", "getActiveTariffId$annotations", "activeTariffId", "isUpsale", "()Z", "isUpsale$annotations", "Companion", "vpd", "wpd", "plus-sdk-pay-sdk-adapter-impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CompositeOfferImpl implements PlusPaySdkAdapter$CompositeOffer {
    private final PlusPayCompositeOffers.Offer actualOffer;

    /* renamed from: assets$delegate, reason: from kotlin metadata */
    private final i3y assets;

    /* renamed from: invoices$delegate, reason: from kotlin metadata */
    private final i3y invoices;

    /* renamed from: legalInfo$delegate, reason: from kotlin metadata */
    private final i3y legalInfo;

    /* renamed from: meta$delegate, reason: from kotlin metadata */
    private final i3y meta;

    /* renamed from: optionOffers$delegate, reason: from kotlin metadata */
    private final i3y optionOffers;

    /* renamed from: tariffOffer$delegate, reason: from kotlin metadata */
    private final i3y tariffOffer;
    public static final wpd Companion = new wpd();
    public static final Parcelable.Creator<CompositeOfferImpl> CREATOR = new Creator();

    public /* synthetic */ CompositeOfferImpl(int i, PlusPayCompositeOffers.Offer offer, psq0 psq0Var) {
        final int i2 = 1;
        if (1 != (i & 1)) {
            qje.Z(i, 1, vpd.a.getDescriptor());
            throw null;
        }
        this.actualOffer = offer;
        final int i3 = 8;
        this.tariffOffer = kotlin.a.a(new sls(this) { // from class: upd
            public final /* synthetic */ CompositeOfferImpl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                PlusPaySdkAdapter$CompositeOffer.Tariff tariffOffer_delegate$lambda$0;
                PlusPaySdkAdapter$CompositeOffer.Assets _init_$lambda$14;
                PlusPaySdkAdapter$CompositeOffer.Meta _init_$lambda$15;
                List optionOffers_delegate$lambda$2;
                PlusPaySdkAdapter$CompositeOffer.LegalInfo legalInfo_delegate$lambda$3;
                List invoices_delegate$lambda$5;
                PlusPaySdkAdapter$CompositeOffer.Assets assets_delegate$lambda$6;
                PlusPaySdkAdapter$CompositeOffer.Meta meta_delegate$lambda$7;
                PlusPaySdkAdapter$CompositeOffer.Tariff _init_$lambda$8;
                List _init_$lambda$10;
                PlusPaySdkAdapter$CompositeOffer.LegalInfo _init_$lambda$11;
                List _init_$lambda$13;
                int i4 = i3;
                CompositeOfferImpl compositeOfferImpl = this.b;
                switch (i4) {
                    case 0:
                        tariffOffer_delegate$lambda$0 = CompositeOfferImpl.tariffOffer_delegate$lambda$0(compositeOfferImpl);
                        return tariffOffer_delegate$lambda$0;
                    case 1:
                        _init_$lambda$14 = CompositeOfferImpl._init_$lambda$14(compositeOfferImpl);
                        return _init_$lambda$14;
                    case 2:
                        _init_$lambda$15 = CompositeOfferImpl._init_$lambda$15(compositeOfferImpl);
                        return _init_$lambda$15;
                    case 3:
                        optionOffers_delegate$lambda$2 = CompositeOfferImpl.optionOffers_delegate$lambda$2(compositeOfferImpl);
                        return optionOffers_delegate$lambda$2;
                    case 4:
                        legalInfo_delegate$lambda$3 = CompositeOfferImpl.legalInfo_delegate$lambda$3(compositeOfferImpl);
                        return legalInfo_delegate$lambda$3;
                    case 5:
                        invoices_delegate$lambda$5 = CompositeOfferImpl.invoices_delegate$lambda$5(compositeOfferImpl);
                        return invoices_delegate$lambda$5;
                    case 6:
                        assets_delegate$lambda$6 = CompositeOfferImpl.assets_delegate$lambda$6(compositeOfferImpl);
                        return assets_delegate$lambda$6;
                    case 7:
                        meta_delegate$lambda$7 = CompositeOfferImpl.meta_delegate$lambda$7(compositeOfferImpl);
                        return meta_delegate$lambda$7;
                    case 8:
                        _init_$lambda$8 = CompositeOfferImpl._init_$lambda$8(compositeOfferImpl);
                        return _init_$lambda$8;
                    case 9:
                        _init_$lambda$10 = CompositeOfferImpl._init_$lambda$10(compositeOfferImpl);
                        return _init_$lambda$10;
                    case 10:
                        _init_$lambda$11 = CompositeOfferImpl._init_$lambda$11(compositeOfferImpl);
                        return _init_$lambda$11;
                    default:
                        _init_$lambda$13 = CompositeOfferImpl._init_$lambda$13(compositeOfferImpl);
                        return _init_$lambda$13;
                }
            }
        });
        final int i4 = 9;
        this.optionOffers = kotlin.a.a(new sls(this) { // from class: upd
            public final /* synthetic */ CompositeOfferImpl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                PlusPaySdkAdapter$CompositeOffer.Tariff tariffOffer_delegate$lambda$0;
                PlusPaySdkAdapter$CompositeOffer.Assets _init_$lambda$14;
                PlusPaySdkAdapter$CompositeOffer.Meta _init_$lambda$15;
                List optionOffers_delegate$lambda$2;
                PlusPaySdkAdapter$CompositeOffer.LegalInfo legalInfo_delegate$lambda$3;
                List invoices_delegate$lambda$5;
                PlusPaySdkAdapter$CompositeOffer.Assets assets_delegate$lambda$6;
                PlusPaySdkAdapter$CompositeOffer.Meta meta_delegate$lambda$7;
                PlusPaySdkAdapter$CompositeOffer.Tariff _init_$lambda$8;
                List _init_$lambda$10;
                PlusPaySdkAdapter$CompositeOffer.LegalInfo _init_$lambda$11;
                List _init_$lambda$13;
                int i42 = i4;
                CompositeOfferImpl compositeOfferImpl = this.b;
                switch (i42) {
                    case 0:
                        tariffOffer_delegate$lambda$0 = CompositeOfferImpl.tariffOffer_delegate$lambda$0(compositeOfferImpl);
                        return tariffOffer_delegate$lambda$0;
                    case 1:
                        _init_$lambda$14 = CompositeOfferImpl._init_$lambda$14(compositeOfferImpl);
                        return _init_$lambda$14;
                    case 2:
                        _init_$lambda$15 = CompositeOfferImpl._init_$lambda$15(compositeOfferImpl);
                        return _init_$lambda$15;
                    case 3:
                        optionOffers_delegate$lambda$2 = CompositeOfferImpl.optionOffers_delegate$lambda$2(compositeOfferImpl);
                        return optionOffers_delegate$lambda$2;
                    case 4:
                        legalInfo_delegate$lambda$3 = CompositeOfferImpl.legalInfo_delegate$lambda$3(compositeOfferImpl);
                        return legalInfo_delegate$lambda$3;
                    case 5:
                        invoices_delegate$lambda$5 = CompositeOfferImpl.invoices_delegate$lambda$5(compositeOfferImpl);
                        return invoices_delegate$lambda$5;
                    case 6:
                        assets_delegate$lambda$6 = CompositeOfferImpl.assets_delegate$lambda$6(compositeOfferImpl);
                        return assets_delegate$lambda$6;
                    case 7:
                        meta_delegate$lambda$7 = CompositeOfferImpl.meta_delegate$lambda$7(compositeOfferImpl);
                        return meta_delegate$lambda$7;
                    case 8:
                        _init_$lambda$8 = CompositeOfferImpl._init_$lambda$8(compositeOfferImpl);
                        return _init_$lambda$8;
                    case 9:
                        _init_$lambda$10 = CompositeOfferImpl._init_$lambda$10(compositeOfferImpl);
                        return _init_$lambda$10;
                    case 10:
                        _init_$lambda$11 = CompositeOfferImpl._init_$lambda$11(compositeOfferImpl);
                        return _init_$lambda$11;
                    default:
                        _init_$lambda$13 = CompositeOfferImpl._init_$lambda$13(compositeOfferImpl);
                        return _init_$lambda$13;
                }
            }
        });
        final int i5 = 10;
        this.legalInfo = kotlin.a.a(new sls(this) { // from class: upd
            public final /* synthetic */ CompositeOfferImpl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                PlusPaySdkAdapter$CompositeOffer.Tariff tariffOffer_delegate$lambda$0;
                PlusPaySdkAdapter$CompositeOffer.Assets _init_$lambda$14;
                PlusPaySdkAdapter$CompositeOffer.Meta _init_$lambda$15;
                List optionOffers_delegate$lambda$2;
                PlusPaySdkAdapter$CompositeOffer.LegalInfo legalInfo_delegate$lambda$3;
                List invoices_delegate$lambda$5;
                PlusPaySdkAdapter$CompositeOffer.Assets assets_delegate$lambda$6;
                PlusPaySdkAdapter$CompositeOffer.Meta meta_delegate$lambda$7;
                PlusPaySdkAdapter$CompositeOffer.Tariff _init_$lambda$8;
                List _init_$lambda$10;
                PlusPaySdkAdapter$CompositeOffer.LegalInfo _init_$lambda$11;
                List _init_$lambda$13;
                int i42 = i5;
                CompositeOfferImpl compositeOfferImpl = this.b;
                switch (i42) {
                    case 0:
                        tariffOffer_delegate$lambda$0 = CompositeOfferImpl.tariffOffer_delegate$lambda$0(compositeOfferImpl);
                        return tariffOffer_delegate$lambda$0;
                    case 1:
                        _init_$lambda$14 = CompositeOfferImpl._init_$lambda$14(compositeOfferImpl);
                        return _init_$lambda$14;
                    case 2:
                        _init_$lambda$15 = CompositeOfferImpl._init_$lambda$15(compositeOfferImpl);
                        return _init_$lambda$15;
                    case 3:
                        optionOffers_delegate$lambda$2 = CompositeOfferImpl.optionOffers_delegate$lambda$2(compositeOfferImpl);
                        return optionOffers_delegate$lambda$2;
                    case 4:
                        legalInfo_delegate$lambda$3 = CompositeOfferImpl.legalInfo_delegate$lambda$3(compositeOfferImpl);
                        return legalInfo_delegate$lambda$3;
                    case 5:
                        invoices_delegate$lambda$5 = CompositeOfferImpl.invoices_delegate$lambda$5(compositeOfferImpl);
                        return invoices_delegate$lambda$5;
                    case 6:
                        assets_delegate$lambda$6 = CompositeOfferImpl.assets_delegate$lambda$6(compositeOfferImpl);
                        return assets_delegate$lambda$6;
                    case 7:
                        meta_delegate$lambda$7 = CompositeOfferImpl.meta_delegate$lambda$7(compositeOfferImpl);
                        return meta_delegate$lambda$7;
                    case 8:
                        _init_$lambda$8 = CompositeOfferImpl._init_$lambda$8(compositeOfferImpl);
                        return _init_$lambda$8;
                    case 9:
                        _init_$lambda$10 = CompositeOfferImpl._init_$lambda$10(compositeOfferImpl);
                        return _init_$lambda$10;
                    case 10:
                        _init_$lambda$11 = CompositeOfferImpl._init_$lambda$11(compositeOfferImpl);
                        return _init_$lambda$11;
                    default:
                        _init_$lambda$13 = CompositeOfferImpl._init_$lambda$13(compositeOfferImpl);
                        return _init_$lambda$13;
                }
            }
        });
        final int i6 = 11;
        this.invoices = kotlin.a.a(new sls(this) { // from class: upd
            public final /* synthetic */ CompositeOfferImpl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                PlusPaySdkAdapter$CompositeOffer.Tariff tariffOffer_delegate$lambda$0;
                PlusPaySdkAdapter$CompositeOffer.Assets _init_$lambda$14;
                PlusPaySdkAdapter$CompositeOffer.Meta _init_$lambda$15;
                List optionOffers_delegate$lambda$2;
                PlusPaySdkAdapter$CompositeOffer.LegalInfo legalInfo_delegate$lambda$3;
                List invoices_delegate$lambda$5;
                PlusPaySdkAdapter$CompositeOffer.Assets assets_delegate$lambda$6;
                PlusPaySdkAdapter$CompositeOffer.Meta meta_delegate$lambda$7;
                PlusPaySdkAdapter$CompositeOffer.Tariff _init_$lambda$8;
                List _init_$lambda$10;
                PlusPaySdkAdapter$CompositeOffer.LegalInfo _init_$lambda$11;
                List _init_$lambda$13;
                int i42 = i6;
                CompositeOfferImpl compositeOfferImpl = this.b;
                switch (i42) {
                    case 0:
                        tariffOffer_delegate$lambda$0 = CompositeOfferImpl.tariffOffer_delegate$lambda$0(compositeOfferImpl);
                        return tariffOffer_delegate$lambda$0;
                    case 1:
                        _init_$lambda$14 = CompositeOfferImpl._init_$lambda$14(compositeOfferImpl);
                        return _init_$lambda$14;
                    case 2:
                        _init_$lambda$15 = CompositeOfferImpl._init_$lambda$15(compositeOfferImpl);
                        return _init_$lambda$15;
                    case 3:
                        optionOffers_delegate$lambda$2 = CompositeOfferImpl.optionOffers_delegate$lambda$2(compositeOfferImpl);
                        return optionOffers_delegate$lambda$2;
                    case 4:
                        legalInfo_delegate$lambda$3 = CompositeOfferImpl.legalInfo_delegate$lambda$3(compositeOfferImpl);
                        return legalInfo_delegate$lambda$3;
                    case 5:
                        invoices_delegate$lambda$5 = CompositeOfferImpl.invoices_delegate$lambda$5(compositeOfferImpl);
                        return invoices_delegate$lambda$5;
                    case 6:
                        assets_delegate$lambda$6 = CompositeOfferImpl.assets_delegate$lambda$6(compositeOfferImpl);
                        return assets_delegate$lambda$6;
                    case 7:
                        meta_delegate$lambda$7 = CompositeOfferImpl.meta_delegate$lambda$7(compositeOfferImpl);
                        return meta_delegate$lambda$7;
                    case 8:
                        _init_$lambda$8 = CompositeOfferImpl._init_$lambda$8(compositeOfferImpl);
                        return _init_$lambda$8;
                    case 9:
                        _init_$lambda$10 = CompositeOfferImpl._init_$lambda$10(compositeOfferImpl);
                        return _init_$lambda$10;
                    case 10:
                        _init_$lambda$11 = CompositeOfferImpl._init_$lambda$11(compositeOfferImpl);
                        return _init_$lambda$11;
                    default:
                        _init_$lambda$13 = CompositeOfferImpl._init_$lambda$13(compositeOfferImpl);
                        return _init_$lambda$13;
                }
            }
        });
        this.assets = kotlin.a.a(new sls(this) { // from class: upd
            public final /* synthetic */ CompositeOfferImpl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                PlusPaySdkAdapter$CompositeOffer.Tariff tariffOffer_delegate$lambda$0;
                PlusPaySdkAdapter$CompositeOffer.Assets _init_$lambda$14;
                PlusPaySdkAdapter$CompositeOffer.Meta _init_$lambda$15;
                List optionOffers_delegate$lambda$2;
                PlusPaySdkAdapter$CompositeOffer.LegalInfo legalInfo_delegate$lambda$3;
                List invoices_delegate$lambda$5;
                PlusPaySdkAdapter$CompositeOffer.Assets assets_delegate$lambda$6;
                PlusPaySdkAdapter$CompositeOffer.Meta meta_delegate$lambda$7;
                PlusPaySdkAdapter$CompositeOffer.Tariff _init_$lambda$8;
                List _init_$lambda$10;
                PlusPaySdkAdapter$CompositeOffer.LegalInfo _init_$lambda$11;
                List _init_$lambda$13;
                int i42 = i2;
                CompositeOfferImpl compositeOfferImpl = this.b;
                switch (i42) {
                    case 0:
                        tariffOffer_delegate$lambda$0 = CompositeOfferImpl.tariffOffer_delegate$lambda$0(compositeOfferImpl);
                        return tariffOffer_delegate$lambda$0;
                    case 1:
                        _init_$lambda$14 = CompositeOfferImpl._init_$lambda$14(compositeOfferImpl);
                        return _init_$lambda$14;
                    case 2:
                        _init_$lambda$15 = CompositeOfferImpl._init_$lambda$15(compositeOfferImpl);
                        return _init_$lambda$15;
                    case 3:
                        optionOffers_delegate$lambda$2 = CompositeOfferImpl.optionOffers_delegate$lambda$2(compositeOfferImpl);
                        return optionOffers_delegate$lambda$2;
                    case 4:
                        legalInfo_delegate$lambda$3 = CompositeOfferImpl.legalInfo_delegate$lambda$3(compositeOfferImpl);
                        return legalInfo_delegate$lambda$3;
                    case 5:
                        invoices_delegate$lambda$5 = CompositeOfferImpl.invoices_delegate$lambda$5(compositeOfferImpl);
                        return invoices_delegate$lambda$5;
                    case 6:
                        assets_delegate$lambda$6 = CompositeOfferImpl.assets_delegate$lambda$6(compositeOfferImpl);
                        return assets_delegate$lambda$6;
                    case 7:
                        meta_delegate$lambda$7 = CompositeOfferImpl.meta_delegate$lambda$7(compositeOfferImpl);
                        return meta_delegate$lambda$7;
                    case 8:
                        _init_$lambda$8 = CompositeOfferImpl._init_$lambda$8(compositeOfferImpl);
                        return _init_$lambda$8;
                    case 9:
                        _init_$lambda$10 = CompositeOfferImpl._init_$lambda$10(compositeOfferImpl);
                        return _init_$lambda$10;
                    case 10:
                        _init_$lambda$11 = CompositeOfferImpl._init_$lambda$11(compositeOfferImpl);
                        return _init_$lambda$11;
                    default:
                        _init_$lambda$13 = CompositeOfferImpl._init_$lambda$13(compositeOfferImpl);
                        return _init_$lambda$13;
                }
            }
        });
        final int i7 = 2;
        this.meta = kotlin.a.a(new sls(this) { // from class: upd
            public final /* synthetic */ CompositeOfferImpl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                PlusPaySdkAdapter$CompositeOffer.Tariff tariffOffer_delegate$lambda$0;
                PlusPaySdkAdapter$CompositeOffer.Assets _init_$lambda$14;
                PlusPaySdkAdapter$CompositeOffer.Meta _init_$lambda$15;
                List optionOffers_delegate$lambda$2;
                PlusPaySdkAdapter$CompositeOffer.LegalInfo legalInfo_delegate$lambda$3;
                List invoices_delegate$lambda$5;
                PlusPaySdkAdapter$CompositeOffer.Assets assets_delegate$lambda$6;
                PlusPaySdkAdapter$CompositeOffer.Meta meta_delegate$lambda$7;
                PlusPaySdkAdapter$CompositeOffer.Tariff _init_$lambda$8;
                List _init_$lambda$10;
                PlusPaySdkAdapter$CompositeOffer.LegalInfo _init_$lambda$11;
                List _init_$lambda$13;
                int i42 = i7;
                CompositeOfferImpl compositeOfferImpl = this.b;
                switch (i42) {
                    case 0:
                        tariffOffer_delegate$lambda$0 = CompositeOfferImpl.tariffOffer_delegate$lambda$0(compositeOfferImpl);
                        return tariffOffer_delegate$lambda$0;
                    case 1:
                        _init_$lambda$14 = CompositeOfferImpl._init_$lambda$14(compositeOfferImpl);
                        return _init_$lambda$14;
                    case 2:
                        _init_$lambda$15 = CompositeOfferImpl._init_$lambda$15(compositeOfferImpl);
                        return _init_$lambda$15;
                    case 3:
                        optionOffers_delegate$lambda$2 = CompositeOfferImpl.optionOffers_delegate$lambda$2(compositeOfferImpl);
                        return optionOffers_delegate$lambda$2;
                    case 4:
                        legalInfo_delegate$lambda$3 = CompositeOfferImpl.legalInfo_delegate$lambda$3(compositeOfferImpl);
                        return legalInfo_delegate$lambda$3;
                    case 5:
                        invoices_delegate$lambda$5 = CompositeOfferImpl.invoices_delegate$lambda$5(compositeOfferImpl);
                        return invoices_delegate$lambda$5;
                    case 6:
                        assets_delegate$lambda$6 = CompositeOfferImpl.assets_delegate$lambda$6(compositeOfferImpl);
                        return assets_delegate$lambda$6;
                    case 7:
                        meta_delegate$lambda$7 = CompositeOfferImpl.meta_delegate$lambda$7(compositeOfferImpl);
                        return meta_delegate$lambda$7;
                    case 8:
                        _init_$lambda$8 = CompositeOfferImpl._init_$lambda$8(compositeOfferImpl);
                        return _init_$lambda$8;
                    case 9:
                        _init_$lambda$10 = CompositeOfferImpl._init_$lambda$10(compositeOfferImpl);
                        return _init_$lambda$10;
                    case 10:
                        _init_$lambda$11 = CompositeOfferImpl._init_$lambda$11(compositeOfferImpl);
                        return _init_$lambda$11;
                    default:
                        _init_$lambda$13 = CompositeOfferImpl._init_$lambda$13(compositeOfferImpl);
                        return _init_$lambda$13;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List _init_$lambda$10(CompositeOfferImpl compositeOfferImpl) {
        List<PlusPayCompositeOffers.Offer.Option> optionOffers = compositeOfferImpl.actualOffer.getOptionOffers();
        ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
        Iterator<T> it = optionOffers.iterator();
        while (it.hasNext()) {
            arrayList.add(new OptionImpl((PlusPayCompositeOffers.Offer.Option) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlusPaySdkAdapter$CompositeOffer.LegalInfo _init_$lambda$11(CompositeOfferImpl compositeOfferImpl) {
        PlusPayLegalInfo legalInfo = compositeOfferImpl.actualOffer.getLegalInfo();
        if (legalInfo != null) {
            return new LegalInfoImpl(legalInfo);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List _init_$lambda$13(CompositeOfferImpl compositeOfferImpl) {
        List<PlusPayCompositeOffers.Offer.Invoice> invoices = compositeOfferImpl.actualOffer.getInvoices();
        ArrayList arrayList = new ArrayList(tcc.n(invoices, 10));
        Iterator<T> it = invoices.iterator();
        while (it.hasNext()) {
            arrayList.add(new InvoiceImpl((PlusPayCompositeOffers.Offer.Invoice) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlusPaySdkAdapter$CompositeOffer.Assets _init_$lambda$14(CompositeOfferImpl compositeOfferImpl) {
        PlusPayCompositeOffers.Offer.Assets assets = compositeOfferImpl.actualOffer.getAssets();
        if (assets != null) {
            return new AssetsImpl(assets);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlusPaySdkAdapter$CompositeOffer.Meta _init_$lambda$15(CompositeOfferImpl compositeOfferImpl) {
        return new MetaImpl(compositeOfferImpl.actualOffer.getMeta());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlusPaySdkAdapter$CompositeOffer.Tariff _init_$lambda$8(CompositeOfferImpl compositeOfferImpl) {
        PlusPayCompositeOffers.Offer.Tariff tariffOffer = compositeOfferImpl.actualOffer.getTariffOffer();
        if (tariffOffer != null) {
            return new TariffImpl(tariffOffer);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlusPaySdkAdapter$CompositeOffer.Assets assets_delegate$lambda$6(CompositeOfferImpl compositeOfferImpl) {
        PlusPayCompositeOffers.Offer.Assets assets = compositeOfferImpl.actualOffer.getAssets();
        if (assets != null) {
            return new AssetsImpl(assets);
        }
        return null;
    }

    public static /* synthetic */ CompositeOfferImpl copy$default(CompositeOfferImpl compositeOfferImpl, PlusPayCompositeOffers.Offer offer, int i, Object obj) {
        if ((i & 1) != 0) {
            offer = compositeOfferImpl.actualOffer;
        }
        return compositeOfferImpl.copy(offer);
    }

    public static /* synthetic */ void getActiveTariffId$annotations() {
    }

    public static /* synthetic */ void getAssets$annotations() {
    }

    public static /* synthetic */ void getInvoices$annotations() {
    }

    public static /* synthetic */ void getLegalInfo$annotations() {
    }

    public static /* synthetic */ void getMeta$annotations() {
    }

    public static /* synthetic */ void getOptionOffers$annotations() {
    }

    public static /* synthetic */ void getPositionId$annotations() {
    }

    public static /* synthetic */ void getStructureType$annotations() {
    }

    public static /* synthetic */ void getTariffOffer$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invoices_delegate$lambda$5(CompositeOfferImpl compositeOfferImpl) {
        List<PlusPayCompositeOffers.Offer.Invoice> invoices = compositeOfferImpl.actualOffer.getInvoices();
        ArrayList arrayList = new ArrayList(tcc.n(invoices, 10));
        Iterator<T> it = invoices.iterator();
        while (it.hasNext()) {
            arrayList.add(new InvoiceImpl((PlusPayCompositeOffers.Offer.Invoice) it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ void isUpsale$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlusPaySdkAdapter$CompositeOffer.LegalInfo legalInfo_delegate$lambda$3(CompositeOfferImpl compositeOfferImpl) {
        PlusPayLegalInfo legalInfo = compositeOfferImpl.actualOffer.getLegalInfo();
        if (legalInfo != null) {
            return new LegalInfoImpl(legalInfo);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlusPaySdkAdapter$CompositeOffer.Meta meta_delegate$lambda$7(CompositeOfferImpl compositeOfferImpl) {
        return new MetaImpl(compositeOfferImpl.actualOffer.getMeta());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List optionOffers_delegate$lambda$2(CompositeOfferImpl compositeOfferImpl) {
        List<PlusPayCompositeOffers.Offer.Option> optionOffers = compositeOfferImpl.actualOffer.getOptionOffers();
        ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
        Iterator<T> it = optionOffers.iterator();
        while (it.hasNext()) {
            arrayList.add(new OptionImpl((PlusPayCompositeOffers.Offer.Option) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlusPaySdkAdapter$CompositeOffer.Tariff tariffOffer_delegate$lambda$0(CompositeOfferImpl compositeOfferImpl) {
        PlusPayCompositeOffers.Offer.Tariff tariffOffer = compositeOfferImpl.actualOffer.getTariffOffer();
        if (tariffOffer != null) {
            return new TariffImpl(tariffOffer);
        }
        return null;
    }

    /* renamed from: component1, reason: from getter */
    public final PlusPayCompositeOffers.Offer getActualOffer() {
        return this.actualOffer;
    }

    public final CompositeOfferImpl copy(PlusPayCompositeOffers.Offer actualOffer) {
        return new CompositeOfferImpl(actualOffer);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CompositeOfferImpl) && jl40.l(this.actualOffer, ((CompositeOfferImpl) other).actualOffer);
    }

    @Override // com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer
    public String getActiveTariffId() {
        return this.actualOffer.getActiveTariffId();
    }

    public final PlusPayCompositeOffers.Offer getActualOffer() {
        return this.actualOffer;
    }

    @Override // com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer
    public PlusPaySdkAdapter$CompositeOffer.Assets getAssets() {
        return (PlusPaySdkAdapter$CompositeOffer.Assets) this.assets.getValue();
    }

    @Override // com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer
    public List<PlusPaySdkAdapter$CompositeOffer.Invoice> getInvoices() {
        return (List) this.invoices.getValue();
    }

    @Override // com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer
    public PlusPaySdkAdapter$CompositeOffer.LegalInfo getLegalInfo() {
        return (PlusPaySdkAdapter$CompositeOffer.LegalInfo) this.legalInfo.getValue();
    }

    @Override // com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer
    public PlusPaySdkAdapter$CompositeOffer.Meta getMeta() {
        return (PlusPaySdkAdapter$CompositeOffer.Meta) this.meta.getValue();
    }

    @Override // com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer
    public List<PlusPaySdkAdapter$CompositeOffer.Option> getOptionOffers() {
        return (List) this.optionOffers.getValue();
    }

    @Override // com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer
    public String getPositionId() {
        return this.actualOffer.getPositionId();
    }

    @Override // com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer
    public PlusPaySdkAdapter$CompositeOffer.StructureType getStructureType() {
        int i = gqd.a[this.actualOffer.getStructureType().ordinal()];
        if (i == 1) {
            return PlusPaySdkAdapter$CompositeOffer.StructureType.TARIFF;
        }
        if (i == 2) {
            return PlusPaySdkAdapter$CompositeOffer.StructureType.OPTION;
        }
        if (i == 3) {
            return PlusPaySdkAdapter$CompositeOffer.StructureType.COMPOSITE;
        }
        w511.b();
        return null;
    }

    @Override // com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer
    public PlusPaySdkAdapter$CompositeOffer.Tariff getTariffOffer() {
        return (PlusPaySdkAdapter$CompositeOffer.Tariff) this.tariffOffer.getValue();
    }

    public int hashCode() {
        return this.actualOffer.hashCode();
    }

    @Override // com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer
    public boolean isUpsale() {
        return this.actualOffer.isUpsale();
    }

    public String toString() {
        return "CompositeOfferImpl(actualOffer=" + this.actualOffer + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.actualOffer, flags);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CompositeOfferImpl> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CompositeOfferImpl createFromParcel(Parcel parcel) {
            return new CompositeOfferImpl((PlusPayCompositeOffers.Offer) parcel.readParcelable(CompositeOfferImpl.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CompositeOfferImpl[] newArray(int i) {
            return new CompositeOfferImpl[i];
        }
    }

    public CompositeOfferImpl(PlusPayCompositeOffers.Offer offer) {
        this.actualOffer = offer;
        final int i = 0;
        this.tariffOffer = kotlin.a.a(new sls(this) { // from class: upd
            public final /* synthetic */ CompositeOfferImpl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                PlusPaySdkAdapter$CompositeOffer.Tariff tariffOffer_delegate$lambda$0;
                PlusPaySdkAdapter$CompositeOffer.Assets _init_$lambda$14;
                PlusPaySdkAdapter$CompositeOffer.Meta _init_$lambda$15;
                List optionOffers_delegate$lambda$2;
                PlusPaySdkAdapter$CompositeOffer.LegalInfo legalInfo_delegate$lambda$3;
                List invoices_delegate$lambda$5;
                PlusPaySdkAdapter$CompositeOffer.Assets assets_delegate$lambda$6;
                PlusPaySdkAdapter$CompositeOffer.Meta meta_delegate$lambda$7;
                PlusPaySdkAdapter$CompositeOffer.Tariff _init_$lambda$8;
                List _init_$lambda$10;
                PlusPaySdkAdapter$CompositeOffer.LegalInfo _init_$lambda$11;
                List _init_$lambda$13;
                int i42 = i;
                CompositeOfferImpl compositeOfferImpl = this.b;
                switch (i42) {
                    case 0:
                        tariffOffer_delegate$lambda$0 = CompositeOfferImpl.tariffOffer_delegate$lambda$0(compositeOfferImpl);
                        return tariffOffer_delegate$lambda$0;
                    case 1:
                        _init_$lambda$14 = CompositeOfferImpl._init_$lambda$14(compositeOfferImpl);
                        return _init_$lambda$14;
                    case 2:
                        _init_$lambda$15 = CompositeOfferImpl._init_$lambda$15(compositeOfferImpl);
                        return _init_$lambda$15;
                    case 3:
                        optionOffers_delegate$lambda$2 = CompositeOfferImpl.optionOffers_delegate$lambda$2(compositeOfferImpl);
                        return optionOffers_delegate$lambda$2;
                    case 4:
                        legalInfo_delegate$lambda$3 = CompositeOfferImpl.legalInfo_delegate$lambda$3(compositeOfferImpl);
                        return legalInfo_delegate$lambda$3;
                    case 5:
                        invoices_delegate$lambda$5 = CompositeOfferImpl.invoices_delegate$lambda$5(compositeOfferImpl);
                        return invoices_delegate$lambda$5;
                    case 6:
                        assets_delegate$lambda$6 = CompositeOfferImpl.assets_delegate$lambda$6(compositeOfferImpl);
                        return assets_delegate$lambda$6;
                    case 7:
                        meta_delegate$lambda$7 = CompositeOfferImpl.meta_delegate$lambda$7(compositeOfferImpl);
                        return meta_delegate$lambda$7;
                    case 8:
                        _init_$lambda$8 = CompositeOfferImpl._init_$lambda$8(compositeOfferImpl);
                        return _init_$lambda$8;
                    case 9:
                        _init_$lambda$10 = CompositeOfferImpl._init_$lambda$10(compositeOfferImpl);
                        return _init_$lambda$10;
                    case 10:
                        _init_$lambda$11 = CompositeOfferImpl._init_$lambda$11(compositeOfferImpl);
                        return _init_$lambda$11;
                    default:
                        _init_$lambda$13 = CompositeOfferImpl._init_$lambda$13(compositeOfferImpl);
                        return _init_$lambda$13;
                }
            }
        });
        final int i2 = 3;
        this.optionOffers = kotlin.a.a(new sls(this) { // from class: upd
            public final /* synthetic */ CompositeOfferImpl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                PlusPaySdkAdapter$CompositeOffer.Tariff tariffOffer_delegate$lambda$0;
                PlusPaySdkAdapter$CompositeOffer.Assets _init_$lambda$14;
                PlusPaySdkAdapter$CompositeOffer.Meta _init_$lambda$15;
                List optionOffers_delegate$lambda$2;
                PlusPaySdkAdapter$CompositeOffer.LegalInfo legalInfo_delegate$lambda$3;
                List invoices_delegate$lambda$5;
                PlusPaySdkAdapter$CompositeOffer.Assets assets_delegate$lambda$6;
                PlusPaySdkAdapter$CompositeOffer.Meta meta_delegate$lambda$7;
                PlusPaySdkAdapter$CompositeOffer.Tariff _init_$lambda$8;
                List _init_$lambda$10;
                PlusPaySdkAdapter$CompositeOffer.LegalInfo _init_$lambda$11;
                List _init_$lambda$13;
                int i42 = i2;
                CompositeOfferImpl compositeOfferImpl = this.b;
                switch (i42) {
                    case 0:
                        tariffOffer_delegate$lambda$0 = CompositeOfferImpl.tariffOffer_delegate$lambda$0(compositeOfferImpl);
                        return tariffOffer_delegate$lambda$0;
                    case 1:
                        _init_$lambda$14 = CompositeOfferImpl._init_$lambda$14(compositeOfferImpl);
                        return _init_$lambda$14;
                    case 2:
                        _init_$lambda$15 = CompositeOfferImpl._init_$lambda$15(compositeOfferImpl);
                        return _init_$lambda$15;
                    case 3:
                        optionOffers_delegate$lambda$2 = CompositeOfferImpl.optionOffers_delegate$lambda$2(compositeOfferImpl);
                        return optionOffers_delegate$lambda$2;
                    case 4:
                        legalInfo_delegate$lambda$3 = CompositeOfferImpl.legalInfo_delegate$lambda$3(compositeOfferImpl);
                        return legalInfo_delegate$lambda$3;
                    case 5:
                        invoices_delegate$lambda$5 = CompositeOfferImpl.invoices_delegate$lambda$5(compositeOfferImpl);
                        return invoices_delegate$lambda$5;
                    case 6:
                        assets_delegate$lambda$6 = CompositeOfferImpl.assets_delegate$lambda$6(compositeOfferImpl);
                        return assets_delegate$lambda$6;
                    case 7:
                        meta_delegate$lambda$7 = CompositeOfferImpl.meta_delegate$lambda$7(compositeOfferImpl);
                        return meta_delegate$lambda$7;
                    case 8:
                        _init_$lambda$8 = CompositeOfferImpl._init_$lambda$8(compositeOfferImpl);
                        return _init_$lambda$8;
                    case 9:
                        _init_$lambda$10 = CompositeOfferImpl._init_$lambda$10(compositeOfferImpl);
                        return _init_$lambda$10;
                    case 10:
                        _init_$lambda$11 = CompositeOfferImpl._init_$lambda$11(compositeOfferImpl);
                        return _init_$lambda$11;
                    default:
                        _init_$lambda$13 = CompositeOfferImpl._init_$lambda$13(compositeOfferImpl);
                        return _init_$lambda$13;
                }
            }
        });
        final int i3 = 4;
        this.legalInfo = kotlin.a.a(new sls(this) { // from class: upd
            public final /* synthetic */ CompositeOfferImpl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                PlusPaySdkAdapter$CompositeOffer.Tariff tariffOffer_delegate$lambda$0;
                PlusPaySdkAdapter$CompositeOffer.Assets _init_$lambda$14;
                PlusPaySdkAdapter$CompositeOffer.Meta _init_$lambda$15;
                List optionOffers_delegate$lambda$2;
                PlusPaySdkAdapter$CompositeOffer.LegalInfo legalInfo_delegate$lambda$3;
                List invoices_delegate$lambda$5;
                PlusPaySdkAdapter$CompositeOffer.Assets assets_delegate$lambda$6;
                PlusPaySdkAdapter$CompositeOffer.Meta meta_delegate$lambda$7;
                PlusPaySdkAdapter$CompositeOffer.Tariff _init_$lambda$8;
                List _init_$lambda$10;
                PlusPaySdkAdapter$CompositeOffer.LegalInfo _init_$lambda$11;
                List _init_$lambda$13;
                int i42 = i3;
                CompositeOfferImpl compositeOfferImpl = this.b;
                switch (i42) {
                    case 0:
                        tariffOffer_delegate$lambda$0 = CompositeOfferImpl.tariffOffer_delegate$lambda$0(compositeOfferImpl);
                        return tariffOffer_delegate$lambda$0;
                    case 1:
                        _init_$lambda$14 = CompositeOfferImpl._init_$lambda$14(compositeOfferImpl);
                        return _init_$lambda$14;
                    case 2:
                        _init_$lambda$15 = CompositeOfferImpl._init_$lambda$15(compositeOfferImpl);
                        return _init_$lambda$15;
                    case 3:
                        optionOffers_delegate$lambda$2 = CompositeOfferImpl.optionOffers_delegate$lambda$2(compositeOfferImpl);
                        return optionOffers_delegate$lambda$2;
                    case 4:
                        legalInfo_delegate$lambda$3 = CompositeOfferImpl.legalInfo_delegate$lambda$3(compositeOfferImpl);
                        return legalInfo_delegate$lambda$3;
                    case 5:
                        invoices_delegate$lambda$5 = CompositeOfferImpl.invoices_delegate$lambda$5(compositeOfferImpl);
                        return invoices_delegate$lambda$5;
                    case 6:
                        assets_delegate$lambda$6 = CompositeOfferImpl.assets_delegate$lambda$6(compositeOfferImpl);
                        return assets_delegate$lambda$6;
                    case 7:
                        meta_delegate$lambda$7 = CompositeOfferImpl.meta_delegate$lambda$7(compositeOfferImpl);
                        return meta_delegate$lambda$7;
                    case 8:
                        _init_$lambda$8 = CompositeOfferImpl._init_$lambda$8(compositeOfferImpl);
                        return _init_$lambda$8;
                    case 9:
                        _init_$lambda$10 = CompositeOfferImpl._init_$lambda$10(compositeOfferImpl);
                        return _init_$lambda$10;
                    case 10:
                        _init_$lambda$11 = CompositeOfferImpl._init_$lambda$11(compositeOfferImpl);
                        return _init_$lambda$11;
                    default:
                        _init_$lambda$13 = CompositeOfferImpl._init_$lambda$13(compositeOfferImpl);
                        return _init_$lambda$13;
                }
            }
        });
        final int i4 = 5;
        this.invoices = kotlin.a.a(new sls(this) { // from class: upd
            public final /* synthetic */ CompositeOfferImpl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                PlusPaySdkAdapter$CompositeOffer.Tariff tariffOffer_delegate$lambda$0;
                PlusPaySdkAdapter$CompositeOffer.Assets _init_$lambda$14;
                PlusPaySdkAdapter$CompositeOffer.Meta _init_$lambda$15;
                List optionOffers_delegate$lambda$2;
                PlusPaySdkAdapter$CompositeOffer.LegalInfo legalInfo_delegate$lambda$3;
                List invoices_delegate$lambda$5;
                PlusPaySdkAdapter$CompositeOffer.Assets assets_delegate$lambda$6;
                PlusPaySdkAdapter$CompositeOffer.Meta meta_delegate$lambda$7;
                PlusPaySdkAdapter$CompositeOffer.Tariff _init_$lambda$8;
                List _init_$lambda$10;
                PlusPaySdkAdapter$CompositeOffer.LegalInfo _init_$lambda$11;
                List _init_$lambda$13;
                int i42 = i4;
                CompositeOfferImpl compositeOfferImpl = this.b;
                switch (i42) {
                    case 0:
                        tariffOffer_delegate$lambda$0 = CompositeOfferImpl.tariffOffer_delegate$lambda$0(compositeOfferImpl);
                        return tariffOffer_delegate$lambda$0;
                    case 1:
                        _init_$lambda$14 = CompositeOfferImpl._init_$lambda$14(compositeOfferImpl);
                        return _init_$lambda$14;
                    case 2:
                        _init_$lambda$15 = CompositeOfferImpl._init_$lambda$15(compositeOfferImpl);
                        return _init_$lambda$15;
                    case 3:
                        optionOffers_delegate$lambda$2 = CompositeOfferImpl.optionOffers_delegate$lambda$2(compositeOfferImpl);
                        return optionOffers_delegate$lambda$2;
                    case 4:
                        legalInfo_delegate$lambda$3 = CompositeOfferImpl.legalInfo_delegate$lambda$3(compositeOfferImpl);
                        return legalInfo_delegate$lambda$3;
                    case 5:
                        invoices_delegate$lambda$5 = CompositeOfferImpl.invoices_delegate$lambda$5(compositeOfferImpl);
                        return invoices_delegate$lambda$5;
                    case 6:
                        assets_delegate$lambda$6 = CompositeOfferImpl.assets_delegate$lambda$6(compositeOfferImpl);
                        return assets_delegate$lambda$6;
                    case 7:
                        meta_delegate$lambda$7 = CompositeOfferImpl.meta_delegate$lambda$7(compositeOfferImpl);
                        return meta_delegate$lambda$7;
                    case 8:
                        _init_$lambda$8 = CompositeOfferImpl._init_$lambda$8(compositeOfferImpl);
                        return _init_$lambda$8;
                    case 9:
                        _init_$lambda$10 = CompositeOfferImpl._init_$lambda$10(compositeOfferImpl);
                        return _init_$lambda$10;
                    case 10:
                        _init_$lambda$11 = CompositeOfferImpl._init_$lambda$11(compositeOfferImpl);
                        return _init_$lambda$11;
                    default:
                        _init_$lambda$13 = CompositeOfferImpl._init_$lambda$13(compositeOfferImpl);
                        return _init_$lambda$13;
                }
            }
        });
        final int i5 = 6;
        this.assets = kotlin.a.a(new sls(this) { // from class: upd
            public final /* synthetic */ CompositeOfferImpl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                PlusPaySdkAdapter$CompositeOffer.Tariff tariffOffer_delegate$lambda$0;
                PlusPaySdkAdapter$CompositeOffer.Assets _init_$lambda$14;
                PlusPaySdkAdapter$CompositeOffer.Meta _init_$lambda$15;
                List optionOffers_delegate$lambda$2;
                PlusPaySdkAdapter$CompositeOffer.LegalInfo legalInfo_delegate$lambda$3;
                List invoices_delegate$lambda$5;
                PlusPaySdkAdapter$CompositeOffer.Assets assets_delegate$lambda$6;
                PlusPaySdkAdapter$CompositeOffer.Meta meta_delegate$lambda$7;
                PlusPaySdkAdapter$CompositeOffer.Tariff _init_$lambda$8;
                List _init_$lambda$10;
                PlusPaySdkAdapter$CompositeOffer.LegalInfo _init_$lambda$11;
                List _init_$lambda$13;
                int i42 = i5;
                CompositeOfferImpl compositeOfferImpl = this.b;
                switch (i42) {
                    case 0:
                        tariffOffer_delegate$lambda$0 = CompositeOfferImpl.tariffOffer_delegate$lambda$0(compositeOfferImpl);
                        return tariffOffer_delegate$lambda$0;
                    case 1:
                        _init_$lambda$14 = CompositeOfferImpl._init_$lambda$14(compositeOfferImpl);
                        return _init_$lambda$14;
                    case 2:
                        _init_$lambda$15 = CompositeOfferImpl._init_$lambda$15(compositeOfferImpl);
                        return _init_$lambda$15;
                    case 3:
                        optionOffers_delegate$lambda$2 = CompositeOfferImpl.optionOffers_delegate$lambda$2(compositeOfferImpl);
                        return optionOffers_delegate$lambda$2;
                    case 4:
                        legalInfo_delegate$lambda$3 = CompositeOfferImpl.legalInfo_delegate$lambda$3(compositeOfferImpl);
                        return legalInfo_delegate$lambda$3;
                    case 5:
                        invoices_delegate$lambda$5 = CompositeOfferImpl.invoices_delegate$lambda$5(compositeOfferImpl);
                        return invoices_delegate$lambda$5;
                    case 6:
                        assets_delegate$lambda$6 = CompositeOfferImpl.assets_delegate$lambda$6(compositeOfferImpl);
                        return assets_delegate$lambda$6;
                    case 7:
                        meta_delegate$lambda$7 = CompositeOfferImpl.meta_delegate$lambda$7(compositeOfferImpl);
                        return meta_delegate$lambda$7;
                    case 8:
                        _init_$lambda$8 = CompositeOfferImpl._init_$lambda$8(compositeOfferImpl);
                        return _init_$lambda$8;
                    case 9:
                        _init_$lambda$10 = CompositeOfferImpl._init_$lambda$10(compositeOfferImpl);
                        return _init_$lambda$10;
                    case 10:
                        _init_$lambda$11 = CompositeOfferImpl._init_$lambda$11(compositeOfferImpl);
                        return _init_$lambda$11;
                    default:
                        _init_$lambda$13 = CompositeOfferImpl._init_$lambda$13(compositeOfferImpl);
                        return _init_$lambda$13;
                }
            }
        });
        final int i6 = 7;
        this.meta = kotlin.a.a(new sls(this) { // from class: upd
            public final /* synthetic */ CompositeOfferImpl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                PlusPaySdkAdapter$CompositeOffer.Tariff tariffOffer_delegate$lambda$0;
                PlusPaySdkAdapter$CompositeOffer.Assets _init_$lambda$14;
                PlusPaySdkAdapter$CompositeOffer.Meta _init_$lambda$15;
                List optionOffers_delegate$lambda$2;
                PlusPaySdkAdapter$CompositeOffer.LegalInfo legalInfo_delegate$lambda$3;
                List invoices_delegate$lambda$5;
                PlusPaySdkAdapter$CompositeOffer.Assets assets_delegate$lambda$6;
                PlusPaySdkAdapter$CompositeOffer.Meta meta_delegate$lambda$7;
                PlusPaySdkAdapter$CompositeOffer.Tariff _init_$lambda$8;
                List _init_$lambda$10;
                PlusPaySdkAdapter$CompositeOffer.LegalInfo _init_$lambda$11;
                List _init_$lambda$13;
                int i42 = i6;
                CompositeOfferImpl compositeOfferImpl = this.b;
                switch (i42) {
                    case 0:
                        tariffOffer_delegate$lambda$0 = CompositeOfferImpl.tariffOffer_delegate$lambda$0(compositeOfferImpl);
                        return tariffOffer_delegate$lambda$0;
                    case 1:
                        _init_$lambda$14 = CompositeOfferImpl._init_$lambda$14(compositeOfferImpl);
                        return _init_$lambda$14;
                    case 2:
                        _init_$lambda$15 = CompositeOfferImpl._init_$lambda$15(compositeOfferImpl);
                        return _init_$lambda$15;
                    case 3:
                        optionOffers_delegate$lambda$2 = CompositeOfferImpl.optionOffers_delegate$lambda$2(compositeOfferImpl);
                        return optionOffers_delegate$lambda$2;
                    case 4:
                        legalInfo_delegate$lambda$3 = CompositeOfferImpl.legalInfo_delegate$lambda$3(compositeOfferImpl);
                        return legalInfo_delegate$lambda$3;
                    case 5:
                        invoices_delegate$lambda$5 = CompositeOfferImpl.invoices_delegate$lambda$5(compositeOfferImpl);
                        return invoices_delegate$lambda$5;
                    case 6:
                        assets_delegate$lambda$6 = CompositeOfferImpl.assets_delegate$lambda$6(compositeOfferImpl);
                        return assets_delegate$lambda$6;
                    case 7:
                        meta_delegate$lambda$7 = CompositeOfferImpl.meta_delegate$lambda$7(compositeOfferImpl);
                        return meta_delegate$lambda$7;
                    case 8:
                        _init_$lambda$8 = CompositeOfferImpl._init_$lambda$8(compositeOfferImpl);
                        return _init_$lambda$8;
                    case 9:
                        _init_$lambda$10 = CompositeOfferImpl._init_$lambda$10(compositeOfferImpl);
                        return _init_$lambda$10;
                    case 10:
                        _init_$lambda$11 = CompositeOfferImpl._init_$lambda$11(compositeOfferImpl);
                        return _init_$lambda$11;
                    default:
                        _init_$lambda$13 = CompositeOfferImpl._init_$lambda$13(compositeOfferImpl);
                        return _init_$lambda$13;
                }
            }
        });
    }
}
