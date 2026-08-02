package com.yandex.messaging.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.rtq0;
import defpackage.x4e;
import defpackage.z83;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001&B\u001f\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0015R\u0011\u0010$\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/yandex/messaging/internal/ServerMessageRef;", "Landroid/os/Parcelable;", "", ClidProvider.TIMESTAMP, "", "chatId", "<init>", "(JLjava/lang/String;)V", "(Ljava/lang/String;J)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()J", "component2", "()Ljava/lang/String;", "copy", "(JLjava/lang/String;)Lcom/yandex/messaging/internal/ServerMessageRef;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestamp", "Ljava/lang/String;", "getChatId", "getRequiredChatId", "requiredChatId", "Companion", "rtq0", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ServerMessageRef implements Parcelable {
    public static final long OUTGOING_HISTORY_ID_OFFSET = 9007199254740991L;
    private final String chatId;
    private final long timestamp;
    public static final rtq0 Companion = new rtq0();
    public static final Parcelable.Creator<ServerMessageRef> CREATOR = new Creator();

    @jxi
    public ServerMessageRef(long j, String str) {
        this.timestamp = j;
        this.chatId = str;
        z83.h(null, j > 0);
        z83.h(null, j < OUTGOING_HISTORY_ID_OFFSET);
    }

    public static /* synthetic */ ServerMessageRef copy$default(ServerMessageRef serverMessageRef, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = serverMessageRef.timestamp;
        }
        if ((i & 2) != 0) {
            str = serverMessageRef.chatId;
        }
        return serverMessageRef.copy(j, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component2, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    public final ServerMessageRef copy(long timestamp, String chatId) {
        return new ServerMessageRef(timestamp, chatId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerMessageRef)) {
            return false;
        }
        ServerMessageRef serverMessageRef = (ServerMessageRef) other;
        return this.timestamp == serverMessageRef.timestamp && jl40.l(this.chatId, serverMessageRef.chatId);
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getRequiredChatId() {
        return this.chatId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.timestamp) * 31;
        String str = this.chatId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder k = x4e.k("ServerMessageRef(timestamp=", this.timestamp, ", chatId=", this.chatId);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.timestamp);
        dest.writeString(this.chatId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ServerMessageRef> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ServerMessageRef createFromParcel(Parcel parcel) {
            return new ServerMessageRef(parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ServerMessageRef[] newArray(int i) {
            return new ServerMessageRef[i];
        }
    }

    public /* synthetic */ ServerMessageRef(long j, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : str);
    }

    public ServerMessageRef(String str, long j) {
        this(j, str);
    }
}
