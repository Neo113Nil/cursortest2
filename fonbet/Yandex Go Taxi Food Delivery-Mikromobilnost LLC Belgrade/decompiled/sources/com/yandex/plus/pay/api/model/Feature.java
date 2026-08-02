package com.yandex.plus.pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import java.util.Date;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\nJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/yandex/plus/pay/api/model/Feature;", "Landroid/os/Parcelable;", "Ljava/util/Date;", "end", "", "feature", "<init>", "(Ljava/util/Date;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/Date;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/Date;Ljava/lang/String;)Lcom/yandex/plus/pay/api/model/Feature;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Date;", "getEnd", "Ljava/lang/String;", "getFeature", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Feature implements Parcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new Creator();
    private final Date end;
    private final String feature;

    public Feature(Date date, String str) {
        this.end = date;
        this.feature = str;
    }

    public static /* synthetic */ Feature copy$default(Feature feature, Date date, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            date = feature.end;
        }
        if ((i & 2) != 0) {
            str = feature.feature;
        }
        return feature.copy(date, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Date getEnd() {
        return this.end;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFeature() {
        return this.feature;
    }

    public final Feature copy(Date end, String feature) {
        return new Feature(end, feature);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) other;
        return jl40.l(this.end, feature.end) && jl40.l(this.feature, feature.feature);
    }

    public final Date getEnd() {
        return this.end;
    }

    public final String getFeature() {
        return this.feature;
    }

    public int hashCode() {
        return this.feature.hashCode() + (this.end.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Feature(end=");
        sb.append(this.end);
        sb.append(", feature=");
        return b64.p(sb, this.feature, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.end);
        dest.writeString(this.feature);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Feature> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Feature createFromParcel(Parcel parcel) {
            return new Feature((Date) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Feature[] newArray(int i) {
            return new Feature[i];
        }
    }
}
