package one.video.ad.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public class Advertisement implements Parcelable {
    public static final Parcelable.Creator<Advertisement> CREATOR = new a();
    public final int b;
    public final long c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final float[] h;
    public final int i;

    public class a implements Parcelable.Creator<Advertisement> {
        @Override // android.os.Parcelable.Creator
        public final Advertisement createFromParcel(Parcel parcel) {
            return new Advertisement(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Advertisement[] newArray(int i) {
            return new Advertisement[i];
        }
    }

    @Deprecated
    public Advertisement(int i, long j, int i2, String str, String str2, String str3, float[] fArr) {
        this.b = i;
        this.c = j;
        this.d = i2;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = fArr;
        this.i = -1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeLong(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeFloatArray(this.h);
        parcel.writeInt(this.i);
    }

    public Advertisement(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = parcel.readLong();
        this.d = parcel.readInt();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.createFloatArray();
        this.i = parcel.readInt();
    }
}
