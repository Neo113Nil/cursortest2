package com.yandex.plus.pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/yandex/plus/pay/api/model/SimOperatorInfo;", "Landroid/os/Parcelable;", "", "mcc", "mnc", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/api/model/SimOperatorInfo;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMcc", "getMnc", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SimOperatorInfo implements Parcelable {
    public static final Parcelable.Creator<SimOperatorInfo> CREATOR = new Creator();
    private final String mcc;
    private final String mnc;

    public SimOperatorInfo(String str, String str2) {
        this.mcc = str;
        this.mnc = str2;
    }

    public static /* synthetic */ SimOperatorInfo copy$default(SimOperatorInfo simOperatorInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simOperatorInfo.mcc;
        }
        if ((i & 2) != 0) {
            str2 = simOperatorInfo.mnc;
        }
        return simOperatorInfo.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMcc() {
        return this.mcc;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMnc() {
        return this.mnc;
    }

    public final SimOperatorInfo copy(String mcc, String mnc) {
        return new SimOperatorInfo(mcc, mnc);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimOperatorInfo)) {
            return false;
        }
        SimOperatorInfo simOperatorInfo = (SimOperatorInfo) other;
        return jl40.l(this.mcc, simOperatorInfo.mcc) && jl40.l(this.mnc, simOperatorInfo.mnc);
    }

    public final String getMcc() {
        return this.mcc;
    }

    public final String getMnc() {
        return this.mnc;
    }

    public int hashCode() {
        return this.mnc.hashCode() + (this.mcc.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SimOperatorInfo(mcc=");
        sb.append(this.mcc);
        sb.append(", mnc=");
        return b64.p(sb, this.mnc, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mcc);
        dest.writeString(this.mnc);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SimOperatorInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimOperatorInfo createFromParcel(Parcel parcel) {
            return new SimOperatorInfo(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimOperatorInfo[] newArray(int i) {
            return new SimOperatorInfo[i];
        }
    }
}
