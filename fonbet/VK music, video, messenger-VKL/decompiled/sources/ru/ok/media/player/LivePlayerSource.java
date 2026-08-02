package ru.ok.media.player;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import xsna.bh10;

/* loaded from: classes9.dex */
public final class LivePlayerSource implements Parcelable {
    public static final Parcelable.Creator<LivePlayerSource> CREATOR = new Parcelable.Creator<LivePlayerSource>() { // from class: ru.ok.media.player.LivePlayerSource.1
        @Override // android.os.Parcelable.Creator
        public LivePlayerSource createFromParcel(Parcel parcel) {
            return new LivePlayerSource(0, parcel);
        }

        @Override // android.os.Parcelable.Creator
        public LivePlayerSource[] newArray(int i) {
            return new LivePlayerSource[i];
        }
    };
    public final long bitrate;
    public final boolean isTransparent;

    @Nullable
    public final String url;

    public /* synthetic */ LivePlayerSource(int i, Parcel parcel) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == LivePlayerSource.class) {
            LivePlayerSource livePlayerSource = (LivePlayerSource) obj;
            if (this.isTransparent == livePlayerSource.isTransparent && this.bitrate == livePlayerSource.bitrate && TextUtils.equals(this.url, livePlayerSource.url)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.url;
        return Boolean.hashCode(this.isTransparent) + bh10.a((str != null ? str.hashCode() : 0) * 31, 31, this.bitrate);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeLong(this.bitrate);
        parcel.writeInt(this.isTransparent ? 1 : 0);
    }

    public LivePlayerSource(String str, long j, boolean z) {
        this.url = str;
        this.bitrate = j;
        this.isTransparent = z;
    }

    private LivePlayerSource(Parcel parcel) {
        this.url = parcel.readString();
        this.bitrate = parcel.readLong();
        this.isTransparent = parcel.readInt() > 0;
    }
}
