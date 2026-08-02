package com.yandex.plus.home.api.alerts;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\tJ&\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\tJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/yandex/plus/home/api/alerts/PlusRedAlertsDigest;", "Landroid/os/Parcelable;", "Lcom/yandex/plus/home/api/alerts/PlusRedAlert;", "redAlert", "", "alertsCount", "<init>", "(Lcom/yandex/plus/home/api/alerts/PlusRedAlert;I)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/home/api/alerts/PlusRedAlert;", "component2", "copy", "(Lcom/yandex/plus/home/api/alerts/PlusRedAlert;I)Lcom/yandex/plus/home/api/alerts/PlusRedAlertsDigest;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/home/api/alerts/PlusRedAlert;", "getRedAlert", CA20Status.STATUS_USER_I, "getAlertsCount", "plus-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusRedAlertsDigest implements Parcelable {
    public static final Parcelable.Creator<PlusRedAlertsDigest> CREATOR = new Creator();
    private final int alertsCount;
    private final PlusRedAlert redAlert;

    public PlusRedAlertsDigest(PlusRedAlert plusRedAlert, int i) {
        this.redAlert = plusRedAlert;
        this.alertsCount = i;
    }

    public static /* synthetic */ PlusRedAlertsDigest copy$default(PlusRedAlertsDigest plusRedAlertsDigest, PlusRedAlert plusRedAlert, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            plusRedAlert = plusRedAlertsDigest.redAlert;
        }
        if ((i2 & 2) != 0) {
            i = plusRedAlertsDigest.alertsCount;
        }
        return plusRedAlertsDigest.copy(plusRedAlert, i);
    }

    /* renamed from: component1, reason: from getter */
    public final PlusRedAlert getRedAlert() {
        return this.redAlert;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAlertsCount() {
        return this.alertsCount;
    }

    public final PlusRedAlertsDigest copy(PlusRedAlert redAlert, int alertsCount) {
        return new PlusRedAlertsDigest(redAlert, alertsCount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusRedAlertsDigest)) {
            return false;
        }
        PlusRedAlertsDigest plusRedAlertsDigest = (PlusRedAlertsDigest) other;
        return jl40.l(this.redAlert, plusRedAlertsDigest.redAlert) && this.alertsCount == plusRedAlertsDigest.alertsCount;
    }

    public final int getAlertsCount() {
        return this.alertsCount;
    }

    public final PlusRedAlert getRedAlert() {
        return this.redAlert;
    }

    public int hashCode() {
        PlusRedAlert plusRedAlert = this.redAlert;
        return Integer.hashCode(this.alertsCount) + ((plusRedAlert == null ? 0 : plusRedAlert.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlusRedAlertsDigest(redAlert=");
        sb.append(this.redAlert);
        sb.append(", alertsCount=");
        return oyr.s(sb, this.alertsCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        PlusRedAlert plusRedAlert = this.redAlert;
        if (plusRedAlert == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            plusRedAlert.writeToParcel(dest, flags);
        }
        dest.writeInt(this.alertsCount);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusRedAlertsDigest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusRedAlertsDigest createFromParcel(Parcel parcel) {
            return new PlusRedAlertsDigest(parcel.readInt() == 0 ? null : PlusRedAlert.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusRedAlertsDigest[] newArray(int i) {
            return new PlusRedAlertsDigest[i];
        }
    }
}
