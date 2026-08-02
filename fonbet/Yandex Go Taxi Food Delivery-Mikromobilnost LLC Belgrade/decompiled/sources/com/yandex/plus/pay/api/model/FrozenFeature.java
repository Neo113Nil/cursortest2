package com.yandex.plus.pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import java.util.Date;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006%"}, d2 = {"Lcom/yandex/plus/pay/api/model/FrozenFeature;", "Landroid/os/Parcelable;", "Ljava/util/Date;", "freezeEnd", "frozenPeriod", "", "feature", "<init>", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/Date;", "component2", "component3", "()Ljava/lang/String;", "copy", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)Lcom/yandex/plus/pay/api/model/FrozenFeature;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Date;", "getFreezeEnd", "getFrozenPeriod", "Ljava/lang/String;", "getFeature", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FrozenFeature implements Parcelable {
    public static final Parcelable.Creator<FrozenFeature> CREATOR = new Creator();
    private final String feature;
    private final Date freezeEnd;
    private final Date frozenPeriod;

    public FrozenFeature(Date date, Date date2, String str) {
        this.freezeEnd = date;
        this.frozenPeriod = date2;
        this.feature = str;
    }

    public static /* synthetic */ FrozenFeature copy$default(FrozenFeature frozenFeature, Date date, Date date2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            date = frozenFeature.freezeEnd;
        }
        if ((i & 2) != 0) {
            date2 = frozenFeature.frozenPeriod;
        }
        if ((i & 4) != 0) {
            str = frozenFeature.feature;
        }
        return frozenFeature.copy(date, date2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Date getFreezeEnd() {
        return this.freezeEnd;
    }

    /* renamed from: component2, reason: from getter */
    public final Date getFrozenPeriod() {
        return this.frozenPeriod;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFeature() {
        return this.feature;
    }

    public final FrozenFeature copy(Date freezeEnd, Date frozenPeriod, String feature) {
        return new FrozenFeature(freezeEnd, frozenPeriod, feature);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrozenFeature)) {
            return false;
        }
        FrozenFeature frozenFeature = (FrozenFeature) other;
        return jl40.l(this.freezeEnd, frozenFeature.freezeEnd) && jl40.l(this.frozenPeriod, frozenFeature.frozenPeriod) && jl40.l(this.feature, frozenFeature.feature);
    }

    public final String getFeature() {
        return this.feature;
    }

    public final Date getFreezeEnd() {
        return this.freezeEnd;
    }

    public final Date getFrozenPeriod() {
        return this.frozenPeriod;
    }

    public int hashCode() {
        return this.feature.hashCode() + ((this.frozenPeriod.hashCode() + (this.freezeEnd.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FrozenFeature(freezeEnd=");
        sb.append(this.freezeEnd);
        sb.append(", frozenPeriod=");
        sb.append(this.frozenPeriod);
        sb.append(", feature=");
        return b64.p(sb, this.feature, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.freezeEnd);
        dest.writeSerializable(this.frozenPeriod);
        dest.writeString(this.feature);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FrozenFeature> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FrozenFeature createFromParcel(Parcel parcel) {
            return new FrozenFeature((Date) parcel.readSerializable(), (Date) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FrozenFeature[] newArray(int i) {
            return new FrozenFeature[i];
        }
    }
}
