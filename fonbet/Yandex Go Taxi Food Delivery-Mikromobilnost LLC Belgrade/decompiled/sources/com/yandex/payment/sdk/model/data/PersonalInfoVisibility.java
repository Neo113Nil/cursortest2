package com.yandex.payment.sdk.model.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b5b0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\tJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\tJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/yandex/payment/sdk/model/data/PersonalInfoVisibility;", "Landroid/os/Parcelable;", "", "canShowPersonalInfo", "Lcom/yandex/payment/sdk/model/data/PersonalInfoConfig;", "personalInfoConfig", "<init>", "(ZLcom/yandex/payment/sdk/model/data/PersonalInfoConfig;)V", "shouldShowAnything", "()Z", "shouldShowName", "shouldShowPhone", "shouldShowEmail", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "Lcom/yandex/payment/sdk/model/data/PersonalInfoConfig;", "Companion", "b5b0", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PersonalInfoVisibility implements Parcelable {
    private final boolean canShowPersonalInfo;
    private final PersonalInfoConfig personalInfoConfig;
    public static final b5b0 Companion = new b5b0();
    public static final Parcelable.Creator<PersonalInfoVisibility> CREATOR = new Creator();

    public PersonalInfoVisibility(boolean z, PersonalInfoConfig personalInfoConfig) {
        this.canShowPersonalInfo = z;
        this.personalInfoConfig = personalInfoConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean shouldShowAnything() {
        return shouldShowName() || shouldShowPhone() || shouldShowEmail();
    }

    public final boolean shouldShowEmail() {
        return this.canShowPersonalInfo && this.personalInfoConfig.getShowEmail();
    }

    public final boolean shouldShowName() {
        return this.canShowPersonalInfo && this.personalInfoConfig.getShowName();
    }

    public final boolean shouldShowPhone() {
        return this.canShowPersonalInfo && this.personalInfoConfig.getShowPhone();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.canShowPersonalInfo ? 1 : 0);
        this.personalInfoConfig.writeToParcel(dest, flags);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PersonalInfoVisibility> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonalInfoVisibility createFromParcel(Parcel parcel) {
            return new PersonalInfoVisibility(parcel.readInt() != 0, PersonalInfoConfig.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonalInfoVisibility[] newArray(int i) {
            return new PersonalInfoVisibility[i];
        }
    }
}
