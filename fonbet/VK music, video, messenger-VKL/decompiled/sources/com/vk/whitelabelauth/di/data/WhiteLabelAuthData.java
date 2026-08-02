package com.vk.whitelabelauth.di.data;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: WhiteLabelAuthData.kt */
/* loaded from: classes11.dex */
public final class WhiteLabelAuthData implements Parcelable {
    public static final Parcelable.Creator<WhiteLabelAuthData> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: WhiteLabelAuthData.kt */
    /* loaded from: classes7.dex */
    public static final class a implements Parcelable.Creator<WhiteLabelAuthData> {
        @Override // android.os.Parcelable.Creator
        public final WhiteLabelAuthData createFromParcel(Parcel parcel) {
            return new WhiteLabelAuthData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WhiteLabelAuthData[] newArray(int i) {
            return new WhiteLabelAuthData[i];
        }
    }

    public WhiteLabelAuthData(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WhiteLabelAuthData)) {
            return false;
        }
        WhiteLabelAuthData whiteLabelAuthData = (WhiteLabelAuthData) obj;
        return epx.f(this.b, whiteLabelAuthData.b) && epx.f(this.c, whiteLabelAuthData.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhiteLabelAuthData(phone=");
        sb.append(this.b);
        sb.append(", sat=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
