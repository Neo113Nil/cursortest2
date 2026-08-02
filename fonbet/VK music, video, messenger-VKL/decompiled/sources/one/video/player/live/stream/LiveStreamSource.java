package one.video.player.live.stream;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public class LiveStreamSource implements Parcelable {
    public static final Parcelable.Creator<LiveStreamSource> CREATOR = new a();
    public final String b;
    public final long c;
    public final boolean d;

    public class a implements Parcelable.Creator<LiveStreamSource> {
        @Override // android.os.Parcelable.Creator
        public final LiveStreamSource createFromParcel(Parcel parcel) {
            return new LiveStreamSource(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final LiveStreamSource[] newArray(int i) {
            return new LiveStreamSource[i];
        }
    }

    public LiveStreamSource(String str, long j, boolean z) {
        this.b = str;
        this.c = j;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }

    public LiveStreamSource(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readLong();
        this.d = parcel.readInt() > 0;
    }
}
