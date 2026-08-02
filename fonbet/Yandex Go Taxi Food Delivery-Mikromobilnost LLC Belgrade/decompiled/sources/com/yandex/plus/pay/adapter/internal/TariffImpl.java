package com.yandex.plus.pay.adapter.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer;
import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$Price;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.fgx0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.psq0;
import defpackage.qje;
import defpackage.sls;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@gsq0
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\b\b\u0083\b\u0018\u0000 W2\u00020\u0001:\u0002XYB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010'\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R!\u00100\u001a\u00020)8VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-R'\u00107\u001a\b\u0012\u0004\u0012\u000202018VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\b3\u0010+\u0012\u0004\b6\u0010/\u001a\u0004\b4\u00105R\u001a\u0010:\u001a\u00020\u00158VX\u0096\u0004¢\u0006\f\u0012\u0004\b9\u0010/\u001a\u0004\b8\u0010\u0017R\u001a\u0010=\u001a\u00020\u00158VX\u0096\u0004¢\u0006\f\u0012\u0004\b<\u0010/\u001a\u0004\b;\u0010\u0017R\u001a\u0010@\u001a\u00020\u00158VX\u0096\u0004¢\u0006\f\u0012\u0004\b?\u0010/\u001a\u0004\b>\u0010\u0017R\u001c\u0010C\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\f\u0012\u0004\bB\u0010/\u001a\u0004\bA\u0010\u0017R\u001c\u0010F\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\f\u0012\u0004\bE\u0010/\u001a\u0004\bD\u0010\u0017R\u001c\u0010I\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\f\u0012\u0004\bH\u0010/\u001a\u0004\bG\u0010\u0017R\u001a\u0010L\u001a\u00020\u00158VX\u0096\u0004¢\u0006\f\u0012\u0004\bK\u0010/\u001a\u0004\bJ\u0010\u0017R\u001a\u0010Q\u001a\u00020M8VX\u0096\u0004¢\u0006\f\u0012\u0004\bP\u0010/\u001a\u0004\bN\u0010OR(\u0010V\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0018\u00010R8VX\u0096\u0004¢\u0006\f\u0012\u0004\bU\u0010/\u001a\u0004\bS\u0010T¨\u0006Z"}, d2 = {"Lcom/yandex/plus/pay/adapter/internal/TariffImpl;", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Tariff;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;", "actualTariff", "<init>", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;Lpsq0;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "copy", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;)Lcom/yandex/plus/pay/adapter/internal/TariffImpl;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "component1", "()Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$plus_sdk_pay_sdk_adapter_impl_release", "(Lcom/yandex/plus/pay/adapter/internal/TariffImpl;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$Price;", "commonPrice$delegate", "Li3y;", "getCommonPrice", "()Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$Price;", "getCommonPrice$annotations", "()V", "commonPrice", "", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Plan;", "plans$delegate", "getPlans", "()Ljava/util/List;", "getPlans$annotations", "plans", "getId", "getId$annotations", "id", "getName", "getName$annotations", "name", "getTitle", "getTitle$annotations", "title", "getDescription", "getDescription$annotations", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "getText", "getText$annotations", "text", "getAdditionalText", "getAdditionalText$annotations", "additionalText", "getCommonPeriod", "getCommonPeriod$annotations", "commonPeriod", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Vendor;", "getVendor", "()Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Vendor;", "getVendor$annotations", DRMInfoProvider.MediaDRMKeys.VENDOR, "", "getPayload", "()Ljava/util/Map;", "getPayload$annotations", "payload", "Companion", "com/yandex/plus/pay/adapter/internal/s", "fgx0", "plus-sdk-pay-sdk-adapter-impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class TariffImpl implements PlusPaySdkAdapter$CompositeOffer.Tariff {
    private final PlusPayCompositeOffers.Offer.Tariff actualTariff;

    /* renamed from: commonPrice$delegate, reason: from kotlin metadata */
    private final i3y commonPrice;

    /* renamed from: plans$delegate, reason: from kotlin metadata */
    private final i3y plans;
    public static final fgx0 Companion = new fgx0();
    public static final Parcelable.Creator<TariffImpl> CREATOR = new Creator();

    public /* synthetic */ TariffImpl(int i, PlusPayCompositeOffers.Offer.Tariff tariff, psq0 psq0Var) {
        final int i2 = 1;
        if (1 != (i & 1)) {
            qje.Z(i, 1, s.a.getDescriptor());
            throw null;
        }
        this.actualTariff = tariff;
        final int i3 = 0;
        this.commonPrice = kotlin.a.a(new sls(this) { // from class: com.yandex.plus.pay.adapter.internal.r
            public final /* synthetic */ TariffImpl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                PlusPaySdkAdapter$Price _init_$lambda$3;
                List _init_$lambda$5;
                PlusPaySdkAdapter$Price commonPrice_delegate$lambda$0;
                List plans_delegate$lambda$2;
                int i4 = i3;
                TariffImpl tariffImpl = this.b;
                switch (i4) {
                    case 0:
                        _init_$lambda$3 = TariffImpl._init_$lambda$3(tariffImpl);
                        return _init_$lambda$3;
                    case 1:
                        _init_$lambda$5 = TariffImpl._init_$lambda$5(tariffImpl);
                        return _init_$lambda$5;
                    case 2:
                        commonPrice_delegate$lambda$0 = TariffImpl.commonPrice_delegate$lambda$0(tariffImpl);
                        return commonPrice_delegate$lambda$0;
                    default:
                        plans_delegate$lambda$2 = TariffImpl.plans_delegate$lambda$2(tariffImpl);
                        return plans_delegate$lambda$2;
                }
            }
        });
        this.plans = kotlin.a.a(new sls(this) { // from class: com.yandex.plus.pay.adapter.internal.r
            public final /* synthetic */ TariffImpl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                PlusPaySdkAdapter$Price _init_$lambda$3;
                List _init_$lambda$5;
                PlusPaySdkAdapter$Price commonPrice_delegate$lambda$0;
                List plans_delegate$lambda$2;
                int i4 = i2;
                TariffImpl tariffImpl = this.b;
                switch (i4) {
                    case 0:
                        _init_$lambda$3 = TariffImpl._init_$lambda$3(tariffImpl);
                        return _init_$lambda$3;
                    case 1:
                        _init_$lambda$5 = TariffImpl._init_$lambda$5(tariffImpl);
                        return _init_$lambda$5;
                    case 2:
                        commonPrice_delegate$lambda$0 = TariffImpl.commonPrice_delegate$lambda$0(tariffImpl);
                        return commonPrice_delegate$lambda$0;
                    default:
                        plans_delegate$lambda$2 = TariffImpl.plans_delegate$lambda$2(tariffImpl);
                        return plans_delegate$lambda$2;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlusPaySdkAdapter$Price _init_$lambda$3(TariffImpl tariffImpl) {
        return new CompositeOfferPriceImpl(tariffImpl.actualTariff.getCommonPrice());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List _init_$lambda$5(TariffImpl tariffImpl) {
        List<PlusPayCompositeOffers.Offer.Plan> plans = tariffImpl.actualTariff.getPlans();
        ArrayList arrayList = new ArrayList(tcc.n(plans, 10));
        Iterator<T> it = plans.iterator();
        while (it.hasNext()) {
            arrayList.add(c.b((PlusPayCompositeOffers.Offer.Plan) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlusPaySdkAdapter$Price commonPrice_delegate$lambda$0(TariffImpl tariffImpl) {
        return new CompositeOfferPriceImpl(tariffImpl.actualTariff.getCommonPrice());
    }

    /* renamed from: component1, reason: from getter */
    private final PlusPayCompositeOffers.Offer.Tariff getActualTariff() {
        return this.actualTariff;
    }

    public static /* synthetic */ TariffImpl copy$default(TariffImpl tariffImpl, PlusPayCompositeOffers.Offer.Tariff tariff, int i, Object obj) {
        if ((i & 1) != 0) {
            tariff = tariffImpl.actualTariff;
        }
        return tariffImpl.copy(tariff);
    }

    public static /* synthetic */ void getAdditionalText$annotations() {
    }

    public static /* synthetic */ void getCommonPeriod$annotations() {
    }

    public static /* synthetic */ void getCommonPrice$annotations() {
    }

    public static /* synthetic */ void getDescription$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getPayload$annotations() {
    }

    public static /* synthetic */ void getPlans$annotations() {
    }

    public static /* synthetic */ void getText$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public static /* synthetic */ void getVendor$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List plans_delegate$lambda$2(TariffImpl tariffImpl) {
        List<PlusPayCompositeOffers.Offer.Plan> plans = tariffImpl.actualTariff.getPlans();
        ArrayList arrayList = new ArrayList(tcc.n(plans, 10));
        Iterator<T> it = plans.iterator();
        while (it.hasNext()) {
            arrayList.add(c.b((PlusPayCompositeOffers.Offer.Plan) it.next()));
        }
        return arrayList;
    }

    public final TariffImpl copy(PlusPayCompositeOffers.Offer.Tariff actualTariff) {
        return new TariffImpl(actualTariff);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TariffImpl) && jl40.l(this.actualTariff, ((TariffImpl) other).actualTariff);
    }

    @Override // com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer.Tariff
    public String getAdditionalText() {
        return this.actualTariff.getAdditionalText();
    }

    @Override // com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer.Tariff
    public String getCommonPeriod() {
        return this.actualTariff.getCommonPeriod();
    }

    @Override // com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer.Tariff
    public PlusPaySdkAdapter$Price getCommonPrice() {
        return (PlusPaySdkAdapter$Price) this.commonPrice.getValue();
    }

    @Override // com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer.Tariff
    public String getDescription() {
        return this.actualTariff.getDescription();
    }

    @Override // com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer.Tariff
    public String getId() {
        return this.actualTariff.getId();
    }

    @Override // com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer.Tariff
    public String getName() {
        return this.actualTariff.getName();
    }

    @Override // com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer.Tariff
    public Map<String, String> getPayload() {
        return this.actualTariff.getPayload();
    }

    @Override // com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer.Tariff
    public List<PlusPaySdkAdapter$CompositeOffer.Plan> getPlans() {
        return (List) this.plans.getValue();
    }

    @Override // com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer.Tariff
    public String getText() {
        return this.actualTariff.getText();
    }

    @Override // com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer.Tariff
    public String getTitle() {
        return this.actualTariff.getTitle();
    }

    @Override // com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer.Tariff
    public PlusPaySdkAdapter$CompositeOffer.Vendor getVendor() {
        return c.c(this.actualTariff.getVendor());
    }

    public int hashCode() {
        return this.actualTariff.hashCode();
    }

    public String toString() {
        return "TariffImpl(actualTariff=" + this.actualTariff + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.actualTariff, flags);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TariffImpl> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TariffImpl createFromParcel(Parcel parcel) {
            return new TariffImpl((PlusPayCompositeOffers.Offer.Tariff) parcel.readParcelable(TariffImpl.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TariffImpl[] newArray(int i) {
            return new TariffImpl[i];
        }
    }

    public TariffImpl(PlusPayCompositeOffers.Offer.Tariff tariff) {
        this.actualTariff = tariff;
        final int i = 2;
        this.commonPrice = kotlin.a.a(new sls(this) { // from class: com.yandex.plus.pay.adapter.internal.r
            public final /* synthetic */ TariffImpl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                PlusPaySdkAdapter$Price _init_$lambda$3;
                List _init_$lambda$5;
                PlusPaySdkAdapter$Price commonPrice_delegate$lambda$0;
                List plans_delegate$lambda$2;
                int i4 = i;
                TariffImpl tariffImpl = this.b;
                switch (i4) {
                    case 0:
                        _init_$lambda$3 = TariffImpl._init_$lambda$3(tariffImpl);
                        return _init_$lambda$3;
                    case 1:
                        _init_$lambda$5 = TariffImpl._init_$lambda$5(tariffImpl);
                        return _init_$lambda$5;
                    case 2:
                        commonPrice_delegate$lambda$0 = TariffImpl.commonPrice_delegate$lambda$0(tariffImpl);
                        return commonPrice_delegate$lambda$0;
                    default:
                        plans_delegate$lambda$2 = TariffImpl.plans_delegate$lambda$2(tariffImpl);
                        return plans_delegate$lambda$2;
                }
            }
        });
        final int i2 = 3;
        this.plans = kotlin.a.a(new sls(this) { // from class: com.yandex.plus.pay.adapter.internal.r
            public final /* synthetic */ TariffImpl b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                PlusPaySdkAdapter$Price _init_$lambda$3;
                List _init_$lambda$5;
                PlusPaySdkAdapter$Price commonPrice_delegate$lambda$0;
                List plans_delegate$lambda$2;
                int i4 = i2;
                TariffImpl tariffImpl = this.b;
                switch (i4) {
                    case 0:
                        _init_$lambda$3 = TariffImpl._init_$lambda$3(tariffImpl);
                        return _init_$lambda$3;
                    case 1:
                        _init_$lambda$5 = TariffImpl._init_$lambda$5(tariffImpl);
                        return _init_$lambda$5;
                    case 2:
                        commonPrice_delegate$lambda$0 = TariffImpl.commonPrice_delegate$lambda$0(tariffImpl);
                        return commonPrice_delegate$lambda$0;
                    default:
                        plans_delegate$lambda$2 = TariffImpl.plans_delegate$lambda$2(tariffImpl);
                        return plans_delegate$lambda$2;
                }
            }
        });
    }
}
