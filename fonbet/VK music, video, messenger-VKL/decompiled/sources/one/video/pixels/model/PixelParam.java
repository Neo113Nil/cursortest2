package one.video.pixels.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public class PixelParam implements Parcelable {
    public static final Parcelable.Creator<PixelParam> CREATOR = new a();
    public final String b;
    public final String c;

    public class a implements Parcelable.Creator<PixelParam> {
        @Override // android.os.Parcelable.Creator
        public final PixelParam createFromParcel(Parcel parcel) {
            return new PixelParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PixelParam[] newArray(int i) {
            return new PixelParam[i];
        }
    }

    public PixelParam(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public PixelParam(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
