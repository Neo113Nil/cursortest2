package com.yandex.messaging.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import defpackage.jl40;
import defpackage.t3z;
import defpackage.tmj;
import defpackage.x4e;
import defpackage.xvz;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0001-B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J>\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0012J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0019R\u0011\u0010+\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b*\u0010\u0014¨\u0006."}, d2 = {"Lcom/yandex/messaging/internal/LocalMessageRef;", "Landroid/os/Parcelable;", "", ClidProvider.TIMESTAMP, "", "messageId", "originalChatId", "serverTimestamp", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/lang/Long;", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/yandex/messaging/internal/LocalMessageRef;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestamp", "Ljava/lang/String;", "getMessageId", "getOriginalChatId", "Ljava/lang/Long;", "getServerTimestamp", "getTimestampMs", "timestampMs", "Companion", "t3z", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LocalMessageRef implements Parcelable {
    public static final int $stable = 0;
    private final String messageId;
    private final String originalChatId;
    private final Long serverTimestamp;
    private final long timestamp;
    public static final t3z Companion = new t3z();
    public static final Parcelable.Creator<LocalMessageRef> CREATOR = new Creator();
    private static final JsonAdapter.Factory JSON_ADAPTER_FACTORY = new tmj(2);

    public /* synthetic */ LocalMessageRef(long j, String str, String str2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, (i & 8) != 0 ? null : l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter JSON_ADAPTER_FACTORY$lambda$0(Type type, Set set, Moshi moshi) {
        if (LocalMessageRef.class.equals(type)) {
            return new LocalMessageRefJsonAdapter();
        }
        return null;
    }

    public static /* synthetic */ LocalMessageRef copy$default(LocalMessageRef localMessageRef, long j, String str, String str2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            j = localMessageRef.timestamp;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = localMessageRef.messageId;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = localMessageRef.originalChatId;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            l = localMessageRef.serverTimestamp;
        }
        return localMessageRef.copy(j2, str3, str4, l);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOriginalChatId() {
        return this.originalChatId;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getServerTimestamp() {
        return this.serverTimestamp;
    }

    public final LocalMessageRef copy(long timestamp, String messageId, String originalChatId, Long serverTimestamp) {
        return new LocalMessageRef(timestamp, messageId, originalChatId, serverTimestamp);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalMessageRef)) {
            return false;
        }
        LocalMessageRef localMessageRef = (LocalMessageRef) other;
        return this.timestamp == localMessageRef.timestamp && jl40.l(this.messageId, localMessageRef.messageId) && jl40.l(this.originalChatId, localMessageRef.originalChatId) && jl40.l(this.serverTimestamp, localMessageRef.serverTimestamp);
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getOriginalChatId() {
        return this.originalChatId;
    }

    public final Long getServerTimestamp() {
        return this.serverTimestamp;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final long getTimestampMs() {
        return this.timestamp / 1000;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.timestamp) * 31;
        String str = this.messageId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.originalChatId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.serverTimestamp;
        return hashCode3 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        long j = this.timestamp;
        String str = this.messageId;
        String str2 = this.originalChatId;
        Long l = this.serverTimestamp;
        StringBuilder k = x4e.k("LocalMessageRef(timestamp=", j, ", messageId=", str);
        k.append(", originalChatId=");
        k.append(str2);
        k.append(", serverTimestamp=");
        k.append(l);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.timestamp);
        dest.writeString(this.messageId);
        dest.writeString(this.originalChatId);
        Long l = this.serverTimestamp;
        if (l == null) {
            dest.writeInt(0);
        } else {
            xvz.z(dest, 1, l);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LocalMessageRef> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalMessageRef createFromParcel(Parcel parcel) {
            return new LocalMessageRef(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalMessageRef[] newArray(int i) {
            return new LocalMessageRef[i];
        }
    }

    public LocalMessageRef(long j, String str, String str2, Long l) {
        this.timestamp = j;
        this.messageId = str;
        this.originalChatId = str2;
        this.serverTimestamp = l;
    }
}
