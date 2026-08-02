package com.yandex.messaging.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonWriter;
import com.yandex.messaging.ThreadChatRequest;
import com.yandex.messaging.internal.entities.ChatId;
import defpackage.jl40;
import defpackage.k8b;
import defpackage.l8b;
import defpackage.m8b;
import defpackage.n8b;
import defpackage.oyr;
import defpackage.p1b;
import defpackage.z83;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0007J\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0007J#\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0013\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0013\u0010\u0017J\u0017\u0010\u0013\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0013\u0010\u001aJ\u0017\u0010\u0013\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u0013\u0010\u001dJ\u001d\u0010!\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0016¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0016¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0007J\u001a\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0007J\u0010\u0010)\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b)\u0010$J\u001a\u0010,\u001a\u00020\u00192\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0007¨\u00060"}, d2 = {"Lcom/yandex/messaging/internal/ThreadChat;", "Lcom/yandex/messaging/ThreadChatRequest;", "", "threadId", "<init>", "(Ljava/lang/String;)V", "parentChatId", "()Ljava/lang/String;", "", "parentMessageTimestamp", "()J", "Lcom/yandex/messaging/internal/ExistingChat;", "parent", "()Lcom/yandex/messaging/internal/ExistingChat;", "id", "uniqueRequestId", "T", "Lk8b;", "handler", "handle", "(Lk8b;)Ljava/lang/Object;", "Ln8b;", "", "(Ln8b;)I", "Ll8b;", "", "(Ll8b;)Z", "Lm8b;", "Lzy11;", "(Lm8b;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "copy", "(Ljava/lang/String;)Lcom/yandex/messaging/internal/ThreadChat;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getThreadId", "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ThreadChat implements ThreadChatRequest {
    public static final Parcelable.Creator<ThreadChat> CREATOR = new Creator();
    private final String threadId;

    public ThreadChat(String str) {
        this.threadId = str;
        ChatId a = ChatId.Companion.a(getThreadId());
        if (a instanceof ChatId.ThreadId) {
            int i = (((ChatId.ThreadId) a).d > 0L ? 1 : (((ChatId.ThreadId) a).d == 0L ? 0 : -1));
        }
        z83.i();
    }

    public static /* synthetic */ ThreadChat copy$default(ThreadChat threadChat, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = threadChat.threadId;
        }
        return threadChat.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getThreadId() {
        return this.threadId;
    }

    public final ThreadChat copy(String threadId) {
        return new ThreadChat(threadId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ThreadChat) && jl40.l(this.threadId, ((ThreadChat) other).threadId);
    }

    @Override // com.yandex.messaging.ThreadChatRequest
    public String getThreadId() {
        return this.threadId;
    }

    @Override // com.yandex.messaging.ThreadChatRequest, com.yandex.messaging.ExistingChatRequest, com.yandex.messaging.ChatRequest
    public void handle(m8b handler) {
        ((JsonWriter) ((p1b) handler).a).name("thread").value(getThreadId());
    }

    public int hashCode() {
        return this.threadId.hashCode();
    }

    @Override // com.yandex.messaging.ThreadChatRequest, com.yandex.messaging.ExistingChatRequest
    public String id() {
        return getThreadId();
    }

    @Override // com.yandex.messaging.ThreadChatRequest
    public ExistingChat parent() {
        return new ExistingChat(parentChatId());
    }

    @Override // com.yandex.messaging.ThreadChatRequest
    public String parentChatId() {
        return new ChatId.ThreadId(getThreadId()).c().a;
    }

    @Override // com.yandex.messaging.ThreadChatRequest
    public long parentMessageTimestamp() {
        return new ChatId.ThreadId(getThreadId()).d;
    }

    @Override // com.yandex.messaging.ThreadChatRequest
    public /* bridge */ /* synthetic */ ServerMessageRef parentServerMessageRef() {
        return super.parentServerMessageRef();
    }

    public String toString() {
        return oyr.p("ThreadChat(threadId=", this.threadId, Extension.C_BRAKE);
    }

    @Override // com.yandex.messaging.ThreadChatRequest, com.yandex.messaging.ExistingChatRequest, com.yandex.messaging.ChatRequest
    public String uniqueRequestId() {
        return getThreadId();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.threadId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ThreadChat> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ThreadChat createFromParcel(Parcel parcel) {
            return new ThreadChat(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ThreadChat[] newArray(int i) {
            return new ThreadChat[i];
        }
    }

    @Override // com.yandex.messaging.ThreadChatRequest, com.yandex.messaging.ExistingChatRequest, com.yandex.messaging.ChatRequest
    public int handle(n8b handler) {
        return ((Number) handler.t(this)).intValue();
    }

    @Override // com.yandex.messaging.ThreadChatRequest, com.yandex.messaging.ExistingChatRequest, com.yandex.messaging.ChatRequest
    public boolean handle(l8b handler) {
        return Boolean.TRUE.booleanValue();
    }

    @Override // com.yandex.messaging.ThreadChatRequest, com.yandex.messaging.ExistingChatRequest, com.yandex.messaging.ChatRequest
    public <T> T handle(k8b handler) {
        return (T) handler.t(this);
    }
}
