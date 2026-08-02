package com.yandex.messaging.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonWriter;
import com.yandex.messaging.SavedMessagesRequest;
import defpackage.k8b;
import defpackage.l8b;
import defpackage.m8b;
import defpackage.n8b;
import defpackage.p1b;
import java.io.IOException;

/* loaded from: classes15.dex */
public class SavedMessages implements SavedMessagesRequest {
    public static final SavedMessages INSTANCE = new SavedMessages();
    public static final Parcelable.Creator<SavedMessages> CREATOR = new Parcelable.Creator<SavedMessages>() { // from class: com.yandex.messaging.internal.SavedMessages.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SavedMessages createFromParcel(Parcel parcel) {
            return SavedMessages.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SavedMessages[] newArray(int i) {
            return new SavedMessages[i];
        }
    };

    private SavedMessages() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.yandex.messaging.SavedMessagesRequest, com.yandex.messaging.ChatRequest
    public void handle(m8b m8bVar) throws IOException {
        ((JsonWriter) ((p1b) m8bVar).a).name("saved_messages").beginObject().endObject();
    }

    public String toString() {
        return "saved_messages";
    }

    @Override // com.yandex.messaging.SavedMessagesRequest, com.yandex.messaging.ChatRequest
    public String uniqueRequestId() {
        return "saved_messages";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    @Override // com.yandex.messaging.SavedMessagesRequest, com.yandex.messaging.ChatRequest
    public int handle(n8b n8bVar) {
        return ((Integer) n8bVar.v()).intValue();
    }

    @Override // com.yandex.messaging.SavedMessagesRequest, com.yandex.messaging.ChatRequest
    public boolean handle(l8b l8bVar) {
        l8bVar.getClass();
        return Boolean.TRUE.booleanValue();
    }

    @Override // com.yandex.messaging.SavedMessagesRequest, com.yandex.messaging.ChatRequest
    public <T> T handle(k8b k8bVar) {
        return (T) k8bVar.v();
    }
}
