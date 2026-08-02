package com.yandex.messaging.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonWriter;
import com.yandex.messaging.ExistingChatRequest;
import defpackage.k8b;
import defpackage.l8b;
import defpackage.m8b;
import defpackage.n8b;
import defpackage.p1b;
import java.io.IOException;

/* loaded from: classes15.dex */
public final class ExistingChat implements ExistingChatRequest {
    public static final Parcelable.Creator<ExistingChat> CREATOR = new Parcelable.Creator<ExistingChat>() { // from class: com.yandex.messaging.internal.ExistingChat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ExistingChat createFromParcel(Parcel parcel) {
            return new ExistingChat(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ExistingChat[] newArray(int i) {
            return new ExistingChat[i];
        }
    };
    private final String mChatId;

    public ExistingChat(String str) {
        this.mChatId = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExistingChat) {
            return this.mChatId.equals(((ExistingChat) obj).mChatId);
        }
        return false;
    }

    @Override // com.yandex.messaging.ExistingChatRequest, com.yandex.messaging.ChatRequest
    public void handle(m8b m8bVar) throws IOException {
        ((JsonWriter) ((p1b) m8bVar).a).name("existing").value(id());
    }

    public int hashCode() {
        return this.mChatId.hashCode();
    }

    @Override // com.yandex.messaging.ExistingChatRequest
    public String id() {
        return this.mChatId;
    }

    public String toString() {
        return "id:" + this.mChatId;
    }

    @Override // com.yandex.messaging.ExistingChatRequest, com.yandex.messaging.ChatRequest
    public String uniqueRequestId() {
        return this.mChatId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mChatId);
    }

    @Override // com.yandex.messaging.ExistingChatRequest, com.yandex.messaging.ChatRequest
    public int handle(n8b n8bVar) {
        return ((Integer) n8bVar.c(this)).intValue();
    }

    @Override // com.yandex.messaging.ExistingChatRequest, com.yandex.messaging.ChatRequest
    public boolean handle(l8b l8bVar) {
        l8bVar.getClass();
        return Boolean.TRUE.booleanValue();
    }

    @Override // com.yandex.messaging.ExistingChatRequest, com.yandex.messaging.ChatRequest
    public <T> T handle(k8b k8bVar) {
        return (T) k8bVar.c(this);
    }
}
