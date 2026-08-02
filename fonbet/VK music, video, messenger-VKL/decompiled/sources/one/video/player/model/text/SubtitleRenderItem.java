package one.video.player.model.text;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: SubtitleRenderItem.kt */
/* loaded from: classes8.dex */
public class SubtitleRenderItem implements Parcelable {
    public static final a CREATOR = new a();
    public final String b;

    /* compiled from: SubtitleRenderItem.kt */
    public static final class a implements Parcelable.Creator<SubtitleRenderItem> {
        @Override // android.os.Parcelable.Creator
        public final SubtitleRenderItem createFromParcel(Parcel parcel) {
            return new SubtitleRenderItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SubtitleRenderItem[] newArray(int i) {
            return new SubtitleRenderItem[i];
        }
    }

    public SubtitleRenderItem(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }

    public SubtitleRenderItem(Parcel parcel) {
        this(parcel.readString());
    }
}
