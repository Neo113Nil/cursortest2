package com.yandex.messaging.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonWriter;
import com.yandex.messaging.ChatAliasRequest;
import defpackage.jl40;
import defpackage.k8b;
import defpackage.l8b;
import defpackage.m8b;
import defpackage.n8b;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.p1b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\nJ)\u0010\u000f\u001a\u00028\u0000\"\n\b\u0000\u0010\f*\u0004\u0018\u00010\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u000f\u0010\u0013J\u0017\u0010\u000f\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u000f\u0010\u0016J\u0017\u0010\u000f\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u000f\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\nJ\u001f\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\nJ\u0010\u0010#\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b#\u0010\u001fJ\u001a\u0010%\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'¨\u0006)"}, d2 = {"Lcom/yandex/messaging/internal/ChatAlias;", "Lcom/yandex/messaging/ChatAliasRequest;", "", "alias", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "component1", "()Ljava/lang/String;", "", "T", "Lk8b;", "handler", "handle", "(Lk8b;)Ljava/lang/Object;", "Ln8b;", "", "(Ln8b;)I", "Ll8b;", "", "(Ll8b;)Z", "Lm8b;", "Lzy11;", "(Lm8b;)V", "uniqueRequestId", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;)Lcom/yandex/messaging/internal/ChatAlias;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "CREATOR", "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ChatAlias implements ChatAliasRequest {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String alias;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChatAlias(Parcel parcel) {
        this(r1);
        String readString = parcel.readString();
        if (readString != null) {
        } else {
            ny61.g("Parcel does not contain chat alias string");
            throw null;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final String getAlias() {
        return this.alias;
    }

    public static /* synthetic */ ChatAlias copy$default(ChatAlias chatAlias, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatAlias.alias;
        }
        return chatAlias.copy(str);
    }

    @Override // com.yandex.messaging.ChatAliasRequest
    public String alias() {
        return this.alias;
    }

    public final ChatAlias copy(String alias) {
        return new ChatAlias(alias);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ChatAlias) && jl40.l(this.alias, ((ChatAlias) other).alias);
    }

    @Override // com.yandex.messaging.ChatAliasRequest, com.yandex.messaging.ChatRequest
    public void handle(m8b handler) {
        ((JsonWriter) ((p1b) handler).a).name("chat_alias").value(alias());
    }

    public int hashCode() {
        return this.alias.hashCode();
    }

    public String toString() {
        return oyr.p("ChatAlias(alias=", this.alias, Extension.C_BRAKE);
    }

    @Override // com.yandex.messaging.ChatAliasRequest, com.yandex.messaging.ChatRequest
    public String uniqueRequestId() {
        return this.alias;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.alias);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/messaging/internal/ChatAlias$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/yandex/messaging/internal/ChatAlias;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/yandex/messaging/internal/ChatAlias;", "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.yandex.messaging.internal.ChatAlias$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<ChatAlias> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ChatAlias createFromParcel(Parcel parcel) {
            return new ChatAlias(parcel);
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ChatAlias[] newArray(int size) {
            return new ChatAlias[size];
        }
    }

    public ChatAlias(String str) {
        this.alias = str;
    }

    @Override // com.yandex.messaging.ChatAliasRequest, com.yandex.messaging.ChatRequest
    public int handle(n8b handler) {
        return ((Number) handler.p(this)).intValue();
    }

    @Override // com.yandex.messaging.ChatAliasRequest, com.yandex.messaging.ChatRequest
    public boolean handle(l8b handler) {
        return Boolean.FALSE.booleanValue();
    }

    @Override // com.yandex.messaging.ChatAliasRequest, com.yandex.messaging.ChatRequest
    public <T> T handle(k8b handler) {
        return (T) handler.p(this);
    }
}
