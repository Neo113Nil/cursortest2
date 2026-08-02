package com.yandex.messaging.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonWriter;
import com.yandex.messaging.InviteChatRequest;
import defpackage.k8b;
import defpackage.l8b;
import defpackage.m8b;
import defpackage.n8b;
import defpackage.p1b;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes15.dex */
public class InviteChat implements InviteChatRequest {
    public static final Parcelable.Creator<InviteChat> CREATOR = new Parcelable.Creator<InviteChat>() { // from class: com.yandex.messaging.internal.InviteChat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InviteChat createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            Objects.requireNonNull(readString);
            return new InviteChat(readString);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InviteChat[] newArray(int i) {
            return new InviteChat[i];
        }
    };
    private final String mInviteHash;

    public InviteChat(String str) {
        this.mInviteHash = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InviteChat) {
            return this.mInviteHash.equals(((InviteChat) obj).mInviteHash);
        }
        return false;
    }

    @Override // com.yandex.messaging.InviteChatRequest, com.yandex.messaging.ChatRequest
    public void handle(m8b m8bVar) throws IOException {
        JsonWriter jsonWriter = (JsonWriter) ((p1b) m8bVar).a;
        jsonWriter.name("invite_chat").beginObject();
        jsonWriter.name("invite_hash").value(inviteHash());
        jsonWriter.endObject();
    }

    public int hashCode() {
        return this.mInviteHash.hashCode();
    }

    @Override // com.yandex.messaging.InviteChatRequest
    public String inviteHash() {
        return this.mInviteHash;
    }

    public String toString() {
        return "Invite hash: " + this.mInviteHash;
    }

    @Override // com.yandex.messaging.InviteChatRequest, com.yandex.messaging.ChatRequest
    public String uniqueRequestId() {
        return this.mInviteHash;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mInviteHash);
    }

    @Override // com.yandex.messaging.InviteChatRequest, com.yandex.messaging.ChatRequest
    public int handle(n8b n8bVar) {
        return ((Integer) n8bVar.m(this)).intValue();
    }

    @Override // com.yandex.messaging.InviteChatRequest, com.yandex.messaging.ChatRequest
    public boolean handle(l8b l8bVar) {
        l8bVar.getClass();
        return Boolean.TRUE.booleanValue();
    }

    @Override // com.yandex.messaging.InviteChatRequest, com.yandex.messaging.ChatRequest
    public <T> T handle(k8b k8bVar) {
        return (T) k8bVar.m(this);
    }
}
