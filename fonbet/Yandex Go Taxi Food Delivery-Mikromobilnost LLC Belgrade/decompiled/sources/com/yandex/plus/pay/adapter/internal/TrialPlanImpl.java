package com.yandex.plus.pay.adapter.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.psq0;
import defpackage.qje;
import defpackage.zd11;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0083\b\u0018\u0000 -2\u00020\u0001:\u0002./B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u0017J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u001a\u0010,\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\f\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010!¨\u00060"}, d2 = {"Lcom/yandex/plus/pay/adapter/internal/TrialPlanImpl;", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$CompositeOffer$Plan$Trial;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Trial;", "actualPlan", "<init>", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Trial;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Trial;Lpsq0;)V", "component1", "()Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Trial;", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$plus_sdk_pay_sdk_adapter_impl_release", "(Lcom/yandex/plus/pay/adapter/internal/TrialPlanImpl;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "copy", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Trial;)Lcom/yandex/plus/pay/adapter/internal/TrialPlanImpl;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Plan$Trial;", "getPeriod", "getPeriod$annotations", "()V", "period", "Companion", "com/yandex/plus/pay/adapter/internal/t", "zd11", "plus-sdk-pay-sdk-adapter-impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class TrialPlanImpl implements PlusPaySdkAdapter$CompositeOffer.Plan.Trial {
    private final PlusPayCompositeOffers.Offer.Plan.Trial actualPlan;
    public static final zd11 Companion = new zd11();
    public static final Parcelable.Creator<TrialPlanImpl> CREATOR = new Creator();

    public /* synthetic */ TrialPlanImpl(int i, PlusPayCompositeOffers.Offer.Plan.Trial trial, psq0 psq0Var) {
        if (1 == (i & 1)) {
            this.actualPlan = trial;
        } else {
            qje.Z(i, 1, t.a.getDescriptor());
            throw null;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final PlusPayCompositeOffers.Offer.Plan.Trial getActualPlan() {
        return this.actualPlan;
    }

    public static /* synthetic */ TrialPlanImpl copy$default(TrialPlanImpl trialPlanImpl, PlusPayCompositeOffers.Offer.Plan.Trial trial, int i, Object obj) {
        if ((i & 1) != 0) {
            trial = trialPlanImpl.actualPlan;
        }
        return trialPlanImpl.copy(trial);
    }

    public static /* synthetic */ void getPeriod$annotations() {
    }

    public final TrialPlanImpl copy(PlusPayCompositeOffers.Offer.Plan.Trial actualPlan) {
        return new TrialPlanImpl(actualPlan);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TrialPlanImpl) && jl40.l(this.actualPlan, ((TrialPlanImpl) other).actualPlan);
    }

    @Override // com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter.CompositeOffer.Plan.Trial
    public String getPeriod() {
        return this.actualPlan.getPeriod();
    }

    public int hashCode() {
        return this.actualPlan.hashCode();
    }

    public String toString() {
        return "TrialPlanImpl(actualPlan=" + this.actualPlan + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.actualPlan, flags);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TrialPlanImpl> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrialPlanImpl createFromParcel(Parcel parcel) {
            return new TrialPlanImpl((PlusPayCompositeOffers.Offer.Plan.Trial) parcel.readParcelable(TrialPlanImpl.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrialPlanImpl[] newArray(int i) {
            return new TrialPlanImpl[i];
        }
    }

    public TrialPlanImpl(PlusPayCompositeOffers.Offer.Plan.Trial trial) {
        this.actualPlan = trial;
    }
}
