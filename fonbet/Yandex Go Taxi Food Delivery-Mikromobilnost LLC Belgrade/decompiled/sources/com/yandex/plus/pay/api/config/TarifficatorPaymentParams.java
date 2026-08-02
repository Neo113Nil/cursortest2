package com.yandex.plus.pay.api.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.jl40;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\nJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Lcom/yandex/plus/pay/api/config/TarifficatorPaymentParams;", "Landroid/os/Parcelable;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "offer", "Ljava/util/UUID;", "sessionId", "<init>", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;Ljava/util/UUID;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "component2", "()Ljava/util/UUID;", "copy", "(Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;Ljava/util/UUID;)Lcom/yandex/plus/pay/api/config/TarifficatorPaymentParams;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer;", "getOffer", "Ljava/util/UUID;", "getSessionId", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TarifficatorPaymentParams implements Parcelable {
    public static final Parcelable.Creator<TarifficatorPaymentParams> CREATOR = new Creator();
    private final PlusPayCompositeOffers.Offer offer;
    private final UUID sessionId;

    public TarifficatorPaymentParams(PlusPayCompositeOffers.Offer offer, UUID uuid) {
        this.offer = offer;
        this.sessionId = uuid;
    }

    public static /* synthetic */ TarifficatorPaymentParams copy$default(TarifficatorPaymentParams tarifficatorPaymentParams, PlusPayCompositeOffers.Offer offer, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            offer = tarifficatorPaymentParams.offer;
        }
        if ((i & 2) != 0) {
            uuid = tarifficatorPaymentParams.sessionId;
        }
        return tarifficatorPaymentParams.copy(offer, uuid);
    }

    /* renamed from: component1, reason: from getter */
    public final PlusPayCompositeOffers.Offer getOffer() {
        return this.offer;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getSessionId() {
        return this.sessionId;
    }

    public final TarifficatorPaymentParams copy(PlusPayCompositeOffers.Offer offer, UUID sessionId) {
        return new TarifficatorPaymentParams(offer, sessionId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TarifficatorPaymentParams)) {
            return false;
        }
        TarifficatorPaymentParams tarifficatorPaymentParams = (TarifficatorPaymentParams) other;
        return jl40.l(this.offer, tarifficatorPaymentParams.offer) && jl40.l(this.sessionId, tarifficatorPaymentParams.sessionId);
    }

    public final PlusPayCompositeOffers.Offer getOffer() {
        return this.offer;
    }

    public final UUID getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return this.sessionId.hashCode() + (this.offer.hashCode() * 31);
    }

    public String toString() {
        return "TarifficatorPaymentParams(offer=" + this.offer + ", sessionId=" + this.sessionId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.offer.writeToParcel(dest, flags);
        dest.writeSerializable(this.sessionId);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TarifficatorPaymentParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TarifficatorPaymentParams createFromParcel(Parcel parcel) {
            return new TarifficatorPaymentParams(PlusPayCompositeOffers.Offer.CREATOR.createFromParcel(parcel), (UUID) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TarifficatorPaymentParams[] newArray(int i) {
            return new TarifficatorPaymentParams[i];
        }
    }
}
