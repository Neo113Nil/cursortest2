package defpackage;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffers;
import com.yandex.plus.pay.internal.model.PlusPayClosingOffer;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffers;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final /* synthetic */ class cad0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ cad0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_$2;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_$12;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_$04;
        KSerializer _childSerializers$_anonymous_$13;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_$05;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _childSerializers$_anonymous_$06;
        KSerializer _childSerializers$_anonymous_$14;
        KSerializer _childSerializers$_anonymous_9;
        KSerializer _childSerializers$_anonymous_$07;
        KSerializer _childSerializers$_anonymous_$15;
        KSerializer _childSerializers$_anonymous_10;
        KSerializer _childSerializers$_anonymous_$08;
        KSerializer _childSerializers$_anonymous_$16;
        KSerializer _init_$_anonymous_;
        KSerializer _childSerializers$_anonymous_11;
        KSerializer _childSerializers$_anonymous_$09;
        KSerializer _childSerializers$_anonymous_$17;
        KSerializer _childSerializers$_anonymous_12;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_$0 = PlusPayAdditionalOffer.Assets._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 1:
                _childSerializers$_anonymous_ = PlusPayAdditionalOffers._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 2:
                _childSerializers$_anonymous_$02 = PlusPayAdditionalOffers._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 3:
                _childSerializers$_anonymous_2 = PlusPayClosingOffer._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 4:
                _childSerializers$_anonymous_3 = PlusPayCompositeOfferDetails._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 5:
                _childSerializers$_anonymous_$1 = PlusPayCompositeOfferDetails._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 6:
                _childSerializers$_anonymous_$2 = PlusPayCompositeOfferDetails._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            case 7:
                _childSerializers$_anonymous_4 = PlusPayCompositeOfferDetails.OptionOfferDetails._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 8:
                _childSerializers$_anonymous_$03 = PlusPayCompositeOfferDetails.OptionOfferDetails._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 9:
                _childSerializers$_anonymous_$12 = PlusPayCompositeOfferDetails.OptionOfferDetails._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$12;
            case 10:
                _childSerializers$_anonymous_5 = PlusPayCompositeOfferDetails.PaymentMethod._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 11:
                _childSerializers$_anonymous_$04 = PlusPayCompositeOfferDetails.PaymentMethod._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$04;
            case 12:
                _childSerializers$_anonymous_$13 = PlusPayCompositeOfferDetails.PaymentMethod._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$13;
            case 13:
                _childSerializers$_anonymous_6 = PlusPayCompositeOfferDetails.PaymentMethodsGroup._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 14:
                _childSerializers$_anonymous_$05 = PlusPayCompositeOfferDetails.PaymentMethodsGroup._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$05;
            case 15:
                _childSerializers$_anonymous_7 = PlusPayCompositeOfferDetails.PaymentPromo._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 16:
                _childSerializers$_anonymous_8 = PlusPayCompositeOfferDetails.TariffOfferDetails._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 17:
                _childSerializers$_anonymous_$06 = PlusPayCompositeOfferDetails.TariffOfferDetails._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$06;
            case 18:
                _childSerializers$_anonymous_$14 = PlusPayCompositeOfferDetails.TariffOfferDetails._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$14;
            case 19:
                _childSerializers$_anonymous_9 = PlusPayCompositeOffers.Offer._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            case 20:
                _childSerializers$_anonymous_$07 = PlusPayCompositeOffers.Offer._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$07;
            case 21:
                _childSerializers$_anonymous_$15 = PlusPayCompositeOffers.Offer._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$15;
            case 22:
                _childSerializers$_anonymous_10 = PlusPayCompositeOffers.Offer.Option._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_10;
            case 23:
                _childSerializers$_anonymous_$08 = PlusPayCompositeOffers.Offer.Option._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$08;
            case 24:
                _childSerializers$_anonymous_$16 = PlusPayCompositeOffers.Offer.Option._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$16;
            case 25:
                _init_$_anonymous_ = PlusPayCompositeOffers.Offer.Plan._init_$_anonymous_();
                return _init_$_anonymous_;
            case 26:
                _childSerializers$_anonymous_11 = PlusPayCompositeOffers.Offer.Tariff._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_11;
            case 27:
                _childSerializers$_anonymous_$09 = PlusPayCompositeOffers.Offer.Tariff._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$09;
            case 28:
                _childSerializers$_anonymous_$17 = PlusPayCompositeOffers.Offer.Tariff._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$17;
            default:
                _childSerializers$_anonymous_12 = PlusPayCounterOffers._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_12;
        }
    }
}
