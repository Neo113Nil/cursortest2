package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.ny61;
import defpackage.sa10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new Parcelable.Creator<MediaBrowserCompat$MediaItem>() { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaBrowserCompat$MediaItem[] newArray(int i) {
            return new MediaBrowserCompat$MediaItem[i];
        }
    };
    public static final int FLAG_BROWSABLE = 1;
    public static final int FLAG_PLAYABLE = 2;
    private final MediaDescriptionCompat mDescription;
    private final int mFlags;

    public MediaBrowserCompat$MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        if (mediaDescriptionCompat == null) {
            ny61.g("description cannot be null");
            throw null;
        }
        if (TextUtils.isEmpty(mediaDescriptionCompat.getMediaId())) {
            ny61.g("description must have a non-empty media id");
            throw null;
        }
        this.mFlags = i;
        this.mDescription = mediaDescriptionCompat;
    }

    public static MediaBrowserCompat$MediaItem fromMediaItem(Object obj) {
        if (obj == null) {
            return null;
        }
        MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
        return new MediaBrowserCompat$MediaItem(MediaDescriptionCompat.fromMediaDescription(sa10.a(mediaItem)), sa10.b(mediaItem));
    }

    public static List<MediaBrowserCompat$MediaItem> fromMediaItemList(List<?> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(fromMediaItem(it.next()));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MediaDescriptionCompat getDescription() {
        return this.mDescription;
    }

    public int getFlags() {
        return this.mFlags;
    }

    public String getMediaId() {
        return this.mDescription.getMediaId();
    }

    public boolean isBrowsable() {
        return (this.mFlags & 1) != 0;
    }

    public boolean isPlayable() {
        return (this.mFlags & 2) != 0;
    }

    public String toString() {
        return "MediaItem{mFlags=" + this.mFlags + ", mDescription=" + this.mDescription + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mFlags);
        this.mDescription.writeToParcel(parcel, i);
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.mFlags = parcel.readInt();
        this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }
}
