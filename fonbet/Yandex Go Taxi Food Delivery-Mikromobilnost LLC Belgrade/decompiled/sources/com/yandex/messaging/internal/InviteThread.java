package com.yandex.messaging.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonWriter;
import com.yandex.messaging.InviteChatRequest;
import com.yandex.messaging.InviteThreadChatRequest;
import defpackage.k8b;
import defpackage.l8b;
import defpackage.m8b;
import defpackage.n8b;
import defpackage.ny61;
import defpackage.p1b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 (2\u00020\u0001:\u0001(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ#\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0013\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0013\u0010\u0017J\u0017\u0010\u0013\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0013\u0010\u001aJ\u0017\u0010\u0013\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u0013\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0016H\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/yandex/messaging/internal/InviteThread;", "Lcom/yandex/messaging/InviteThreadChatRequest;", "", "inviteHash", "", "parentMessageTs", "<init>", "(Ljava/lang/String;J)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "Lcom/yandex/messaging/InviteChatRequest;", "parent", "()Lcom/yandex/messaging/InviteChatRequest;", "()Ljava/lang/String;", "uniqueRequestId", "T", "Lk8b;", "handler", "handle", "(Lk8b;)Ljava/lang/Object;", "Ln8b;", "", "(Ln8b;)I", "Ll8b;", "", "(Ll8b;)Z", "Lm8b;", "Lzy11;", "(Lm8b;)V", "describeContents", "()I", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getInviteHash", "J", "getParentMessageTs", "()J", "CREATOR", "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class InviteThread implements InviteThreadChatRequest {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String inviteHash;
    private final long parentMessageTs;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InviteThread(Parcel parcel) {
        this(r0, parcel.readLong());
        String readString = parcel.readString();
        if (readString != null) {
        } else {
            ny61.r("no inviteHash");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getInviteHash() {
        return this.inviteHash;
    }

    @Override // com.yandex.messaging.InviteThreadChatRequest
    public long getParentMessageTs() {
        return this.parentMessageTs;
    }

    @Override // com.yandex.messaging.InviteThreadChatRequest, com.yandex.messaging.InviteChatRequest, com.yandex.messaging.ChatRequest
    public void handle(m8b handler) {
        JsonWriter jsonWriter = (JsonWriter) ((p1b) handler).a;
        jsonWriter.name("invite_thread").beginObject();
        jsonWriter.name("invite_hash").value(inviteHash());
        jsonWriter.name("parent_message_ts").value(getParentMessageTs());
        jsonWriter.endObject();
    }

    @Override // com.yandex.messaging.InviteThreadChatRequest, com.yandex.messaging.InviteChatRequest
    public String inviteHash() {
        return this.inviteHash;
    }

    @Override // com.yandex.messaging.InviteThreadChatRequest
    public InviteChatRequest parent() {
        return new InviteChat(this.inviteHash);
    }

    @Override // com.yandex.messaging.InviteThreadChatRequest, com.yandex.messaging.InviteChatRequest, com.yandex.messaging.ChatRequest
    public String uniqueRequestId() {
        return this.inviteHash + "/" + getParentMessageTs();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.inviteHash);
        parcel.writeLong(getParentMessageTs());
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/messaging/internal/InviteThread$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/yandex/messaging/internal/InviteThread;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/yandex/messaging/internal/InviteThread;", "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.yandex.messaging.internal.InviteThread$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<InviteThread> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InviteThread createFromParcel(Parcel parcel) {
            return new InviteThread(parcel);
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InviteThread[] newArray(int size) {
            return new InviteThread[size];
        }
    }

    public InviteThread(String str, long j) {
        this.inviteHash = str;
        this.parentMessageTs = j;
    }

    @Override // com.yandex.messaging.InviteThreadChatRequest, com.yandex.messaging.InviteChatRequest, com.yandex.messaging.ChatRequest
    public int handle(n8b handler) {
        return ((Number) handler.k(this)).intValue();
    }

    @Override // com.yandex.messaging.InviteThreadChatRequest, com.yandex.messaging.InviteChatRequest, com.yandex.messaging.ChatRequest
    public boolean handle(l8b handler) {
        return Boolean.FALSE.booleanValue();
    }

    @Override // com.yandex.messaging.InviteThreadChatRequest, com.yandex.messaging.InviteChatRequest, com.yandex.messaging.ChatRequest
    public <T> T handle(k8b handler) {
        return (T) handler.k(this);
    }
}
