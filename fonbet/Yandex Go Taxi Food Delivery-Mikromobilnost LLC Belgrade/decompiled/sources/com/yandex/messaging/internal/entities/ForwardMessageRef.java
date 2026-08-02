package com.yandex.messaging.internal.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import defpackage.cex;
import java.util.Objects;

/* loaded from: classes15.dex */
public final class ForwardMessageRef implements Parcelable {
    public static final Parcelable.Creator<ForwardMessageRef> CREATOR = new Parcelable.Creator<ForwardMessageRef>() { // from class: com.yandex.messaging.internal.entities.ForwardMessageRef.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ForwardMessageRef createFromParcel(Parcel parcel) {
            ForwardMessageRef forwardMessageRef = new ForwardMessageRef();
            String readString = parcel.readString();
            Objects.requireNonNull(readString);
            forwardMessageRef.chatId = readString;
            forwardMessageRef.timestamp = parcel.readLong();
            return forwardMessageRef;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ForwardMessageRef[] newArray(int i) {
            return new ForwardMessageRef[i];
        }
    };

    @cex
    @Json(name = "chat_id")
    public String chatId;

    @Json(name = "message_timestamp")
    public long timestamp;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ForwardMessageRef)) {
            return this == obj;
        }
        ForwardMessageRef forwardMessageRef = (ForwardMessageRef) obj;
        return this.chatId.equals(forwardMessageRef.chatId) && forwardMessageRef.timestamp == this.timestamp;
    }

    public int hashCode() {
        int hashCode = this.chatId.hashCode();
        long j = this.timestamp;
        return ((int) (j ^ (j >>> 32))) ^ hashCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.chatId);
        parcel.writeLong(this.timestamp);
    }
}
