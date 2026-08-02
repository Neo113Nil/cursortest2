package com.vkontakte.android.attachments;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import io.reactivex.rxjava3.subjects.b;
import xsna.vu5;

/* compiled from: DisclaimerData.kt */
/* loaded from: classes7.dex */
public final class DisclaimerData implements Serializer.StreamParcelable {
    public static final Serializer.c<DisclaimerData> CREATOR = new a();
    public final DisclaimerType b;
    public final float c;
    public final int d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DisclaimerData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DisclaimerData a(Serializer serializer) {
            return new DisclaimerData((DisclaimerType) serializer.C(), serializer.s(), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DisclaimerData[i];
        }
    }

    public DisclaimerData(DisclaimerType disclaimerType, float f, int i) {
        this.b = disclaimerType;
        this.c = f;
        this.d = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.g0(this.b);
        serializer.P(this.c);
        serializer.S(this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisclaimerData)) {
            return false;
        }
        DisclaimerData disclaimerData = (DisclaimerData) obj;
        return this.b == disclaimerData.b && Float.compare(this.c, disclaimerData.c) == 0 && this.d == disclaimerData.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + b.a(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisclaimerData(disclaimerType=");
        sb.append(this.b);
        sb.append(", imageRatio=");
        sb.append(this.c);
        sb.append(", minHeight=");
        return vu5.b(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
