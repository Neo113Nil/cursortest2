package defpackage;

import com.yandex.go.point_selection_settings.PointSelectionScreenSettingsExperiment;
import com.yandex.go.point_selection_settings.a;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.core.data.pay.PlusSelectPaymentMethodState;
import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$PaymentFlowErrorReason;
import com.yandex.plus.pay.api.model.PlusPayInAppReplacementParams;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.api.model.PlusPayPrice;
import com.yandex.plus.pay.internal.feature.offers.PlusPayOfferDetailsConfiguration;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffers;
import com.yandex.plus.pay.internal.model.PlusPayInvoice;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.internal.model.PlusPayUpsaleStep;
import com.yandex.plus.pay.internal.model.PlusPayUpsaleType;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.map_object.Trigger;

/* loaded from: classes2.dex */
public final /* synthetic */ class bbd0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ bbd0(dbd0 dbd0Var) {
        this.a = 1;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _init_$_anonymous_;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _init_$_anonymous_2;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _childSerializers$_anonymous_9;
        KSerializer _childSerializers$_anonymous_10;
        KSerializer _childSerializers$_anonymous_11;
        KSerializer _init_$_anonymous_3;
        KSerializer _init_$_anonymous_4;
        KSerializer _init_$_anonymous_5;
        KSerializer _init_$_anonymous_6;
        KSerializer _init_$_anonymous_7;
        KSerializer _init_$_anonymous_8;
        KSerializer _init_$_anonymous_9;
        KSerializer _childSerializers$_anonymous_12;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_ = PlusPayCounterOffers.CounterOffer._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 1:
                return null;
            case 2:
                _childSerializers$_anonymous_2 = PlusPayInAppReplacementParams._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 3:
                _init_$_anonymous_ = PlusPayInAppReplacementParams.Strategy._init_$_anonymous_();
                return _init_$_anonymous_;
            case 4:
                _childSerializers$_anonymous_3 = PlusPayInvoice._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 5:
                _childSerializers$_anonymous_4 = PlusPayInvoice.Payment._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 6:
                _childSerializers$_anonymous_5 = PlusPayLegalInfo._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 7:
                _init_$_anonymous_2 = PlusPayLegalInfo.Item._init_$_anonymous_();
                return _init_$_anonymous_2;
            case 8:
                _childSerializers$_anonymous_6 = PlusPayOfferDetailsConfiguration.AdditionalOffers._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 9:
                _childSerializers$_anonymous_$0 = PlusPayOfferDetailsConfiguration.AdditionalOffers._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 10:
                _childSerializers$_anonymous_7 = PlusPayOfferDetailsConfiguration.AdditionalOffers.Offer._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 11:
                _childSerializers$_anonymous_8 = PlusPayPrice._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 12:
                _childSerializers$_anonymous_9 = PlusPayRichText._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            case 13:
                _childSerializers$_anonymous_10 = PlusPayRichText.Item.TextColor._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_10;
            case 14:
                _childSerializers$_anonymous_11 = PlusPaySdkAdapter$PaymentFlowErrorReason.Backend._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_11;
            case 15:
                _init_$_anonymous_3 = PlusPaySdkAdapter$PaymentFlowErrorReason.Connection._init_$_anonymous_();
                return _init_$_anonymous_3;
            case 16:
                _init_$_anonymous_4 = PlusPaySdkAdapter$PaymentFlowErrorReason.Unauthorized._init_$_anonymous_();
                return _init_$_anonymous_4;
            case 17:
                _init_$_anonymous_5 = PlusPaySdkAdapter$PaymentFlowErrorReason.Unexpected._init_$_anonymous_();
                return _init_$_anonymous_5;
            case 18:
                _init_$_anonymous_6 = PlusPayUpsaleStep._init_$_anonymous_();
                return _init_$_anonymous_6;
            case 19:
                _init_$_anonymous_7 = PlusPayUpsaleType._init_$_anonymous_();
                return _init_$_anonymous_7;
            case 20:
                _init_$_anonymous_8 = PlusSelectPaymentMethodState.Cancel._init_$_anonymous_();
                return _init_$_anonymous_8;
            case 21:
                _init_$_anonymous_9 = PlusSelectPaymentMethodState.Started._init_$_anonymous_();
                return _init_$_anonymous_9;
            case 22:
                _childSerializers$_anonymous_12 = PlusSelectPaymentMethodState.Success._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_12;
            case 23:
                skd0.b(PlusLogTag.UI, "callback have not been opened");
                return zy11.a;
            case 24:
                wtd0 wtd0Var = xtd0.Companion;
                return new p53(ytd0.a, 0);
            case 25:
                wtd0 wtd0Var2 = xtd0.Companion;
                return new p53(eud0.a, 0);
            case 26:
                wtd0 wtd0Var3 = xtd0.Companion;
                return new p53(qke.n(ltd0.e), 0);
            case 27:
                tud0 tud0Var = uud0.Companion;
                return new p53(qke.n(zsd0.f), 0);
            case 28:
                tud0 tud0Var2 = uud0.Companion;
                return Trigger.Companion.serializer();
            default:
                a aVar = PointSelectionScreenSettingsExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
        }
    }

    public /* synthetic */ bbd0(int i) {
        this.a = i;
    }
}
