package com.yandex.xplat.payment.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bd90;
import defpackage.hh90;
import defpackage.mbb1;
import defpackage.tyj0;
import defpackage.y3x;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 \u00182\u00060\u0001j\u0002`\u0002:\u0001\u0019B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0004\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/yandex/xplat/payment/sdk/PartnerInfo;", "Landroid/os/Parcelable;", "Lcom/yandex/xplat/common/Parcelable;", "", "isYBCard", "isYBCardOwner", "Lcom/yandex/xplat/payment/sdk/YBCardType;", "ybCardType", "<init>", "(ZZLcom/yandex/xplat/payment/sdk/YBCardType;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "()Z", "Lcom/yandex/xplat/payment/sdk/YBCardType;", "getYbCardType", "()Lcom/yandex/xplat/payment/sdk/YBCardType;", "Companion", "hh90", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class PartnerInfo implements Parcelable {
    private final boolean isYBCard;
    private final boolean isYBCardOwner;
    private final YBCardType ybCardType;
    public static final hh90 Companion = new hh90();
    public static final Parcelable.Creator<PartnerInfo> CREATOR = new Creator();

    public PartnerInfo(boolean z, boolean z2, YBCardType yBCardType) {
        this.isYBCard = z;
        this.isYBCardOwner = z2;
        this.ybCardType = yBCardType;
    }

    public static tyj0 fromJsonItem(y3x y3xVar) {
        Companion.getClass();
        return mbb1.d(y3xVar, new bd90(2));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final YBCardType getYbCardType() {
        return this.ybCardType;
    }

    /* renamed from: isYBCard, reason: from getter */
    public final boolean getIsYBCard() {
        return this.isYBCard;
    }

    /* renamed from: isYBCardOwner, reason: from getter */
    public final boolean getIsYBCardOwner() {
        return this.isYBCardOwner;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.isYBCard ? 1 : 0);
        dest.writeInt(this.isYBCardOwner ? 1 : 0);
        YBCardType yBCardType = this.ybCardType;
        if (yBCardType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(yBCardType.name());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PartnerInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PartnerInfo createFromParcel(Parcel parcel) {
            return new PartnerInfo(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : YBCardType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PartnerInfo[] newArray(int i) {
            return new PartnerInfo[i];
        }
    }

    public /* synthetic */ PartnerInfo(boolean z, boolean z2, YBCardType yBCardType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, (i & 4) != 0 ? null : yBCardType);
    }
}
