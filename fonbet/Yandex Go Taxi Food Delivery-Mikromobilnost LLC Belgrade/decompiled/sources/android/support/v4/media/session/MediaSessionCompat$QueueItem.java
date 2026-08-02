package android.support.v4.media.session;

import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import defpackage.ff10;
import defpackage.ny61;
import defpackage.oyr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new Parcelable.Creator<MediaSessionCompat$QueueItem>() { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaSessionCompat$QueueItem createFromParcel(Parcel parcel) {
            return new MediaSessionCompat$QueueItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaSessionCompat$QueueItem[] newArray(int i) {
            return new MediaSessionCompat$QueueItem[i];
        }
    };
    public static final int UNKNOWN_ID = -1;
    private final MediaDescriptionCompat mDescription;
    private final long mId;
    private MediaSession.QueueItem mItemFwk;

    private MediaSessionCompat$QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
        if (mediaDescriptionCompat == null) {
            ny61.g("Description cannot be null");
            throw null;
        }
        if (j == -1) {
            ny61.g("Id cannot be QueueItem.UNKNOWN_ID");
            throw null;
        }
        this.mDescription = mediaDescriptionCompat;
        this.mId = j;
        this.mItemFwk = queueItem;
    }

    public static MediaSessionCompat$QueueItem fromQueueItem(Object obj) {
        if (obj == null) {
            return null;
        }
        MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
        return new MediaSessionCompat$QueueItem(queueItem, MediaDescriptionCompat.fromMediaDescription(ff10.b(queueItem)), ff10.c(queueItem));
    }

    public static List<MediaSessionCompat$QueueItem> fromQueueItemList(List<?> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(fromQueueItem(it.next()));
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

    public long getQueueId() {
        return this.mId;
    }

    public Object getQueueItem() {
        MediaSession.QueueItem queueItem = this.mItemFwk;
        if (queueItem != null) {
            return queueItem;
        }
        MediaSession.QueueItem a = ff10.a((MediaDescription) this.mDescription.getMediaDescription(), this.mId);
        this.mItemFwk = a;
        return a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
        sb.append(this.mDescription);
        sb.append(", Id=");
        return oyr.n(this.mId, " }", sb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.mDescription.writeToParcel(parcel, i);
        parcel.writeLong(this.mId);
    }

    public MediaSessionCompat$QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
        this(null, mediaDescriptionCompat, j);
    }

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.mId = parcel.readLong();
    }
}
