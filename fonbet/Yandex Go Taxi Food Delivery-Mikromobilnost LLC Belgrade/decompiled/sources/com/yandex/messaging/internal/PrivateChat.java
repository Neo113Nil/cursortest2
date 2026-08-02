package com.yandex.messaging.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonWriter;
import com.yandex.messaging.PrivateChatRequest;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k8b;
import defpackage.l8b;
import defpackage.m8b;
import defpackage.n8b;
import defpackage.ny61;
import defpackage.p1b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\b\u0018\u0000 *2\u00020\u0001:\u0001*B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u000bJ\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000bJ#\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0011\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0011\u0010\u0015J\u0017\u0010\u0011\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0011\u0010\u0018J\u0017\u0010\u0011\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u0011\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\u000bJ&\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b$\u0010 J\u001a\u0010'\u001a\u00020\u00172\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)¨\u0006+"}, d2 = {"Lcom/yandex/messaging/internal/PrivateChat;", "Lcom/yandex/messaging/PrivateChatRequest;", "", "addressee", "onetimeUserToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "component1", "()Ljava/lang/String;", "component2", "uniqueRequestId", "T", "Lk8b;", "handler", "handle", "(Lk8b;)Ljava/lang/Object;", "Ln8b;", "", "(Ln8b;)I", "Ll8b;", "", "(Ll8b;)Z", "Lm8b;", "Lzy11;", "(Lm8b;)V", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/messaging/internal/PrivateChat;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "CREATOR", "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PrivateChat implements PrivateChatRequest {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String addressee;
    private final String onetimeUserToken;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PrivateChat(Parcel parcel) {
        this(r0, parcel.readString());
        String readString = parcel.readString();
        if (readString != null) {
        } else {
            ny61.r("Parcel does not contain addressee string");
            throw null;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final String getAddressee() {
        return this.addressee;
    }

    /* renamed from: component2, reason: from getter */
    private final String getOnetimeUserToken() {
        return this.onetimeUserToken;
    }

    public static /* synthetic */ PrivateChat copy$default(PrivateChat privateChat, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = privateChat.addressee;
        }
        if ((i & 2) != 0) {
            str2 = privateChat.onetimeUserToken;
        }
        return privateChat.copy(str, str2);
    }

    @Override // com.yandex.messaging.PrivateChatRequest
    public String addressee() {
        return this.addressee;
    }

    public final PrivateChat copy(String addressee, String onetimeUserToken) {
        return new PrivateChat(addressee, onetimeUserToken);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivateChat)) {
            return false;
        }
        PrivateChat privateChat = (PrivateChat) other;
        return jl40.l(this.addressee, privateChat.addressee) && jl40.l(this.onetimeUserToken, privateChat.onetimeUserToken);
    }

    @Override // com.yandex.messaging.PrivateChatRequest, com.yandex.messaging.ChatRequest
    public void handle(m8b handler) {
        ((JsonWriter) ((p1b) handler).a).name("chat_with").value(addressee());
    }

    public int hashCode() {
        int hashCode = this.addressee.hashCode() * 31;
        String str = this.onetimeUserToken;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // com.yandex.messaging.PrivateChatRequest
    public String onetimeUserToken() {
        return this.onetimeUserToken;
    }

    public String toString() {
        return g8e.o("addressee:", this.addressee);
    }

    @Override // com.yandex.messaging.PrivateChatRequest, com.yandex.messaging.ChatRequest
    public String uniqueRequestId() {
        return this.addressee;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.addressee);
        parcel.writeString(this.onetimeUserToken);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/messaging/internal/PrivateChat$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/yandex/messaging/internal/PrivateChat;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/yandex/messaging/internal/PrivateChat;", "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.yandex.messaging.internal.PrivateChat$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<PrivateChat> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PrivateChat createFromParcel(Parcel parcel) {
            return new PrivateChat(parcel);
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PrivateChat[] newArray(int size) {
            return new PrivateChat[size];
        }
    }

    @Override // com.yandex.messaging.PrivateChatRequest, com.yandex.messaging.ChatRequest
    public int handle(n8b handler) {
        return ((Number) handler.z(this)).intValue();
    }

    public PrivateChat(String str, String str2) {
        this.addressee = str;
        this.onetimeUserToken = str2;
    }

    @Override // com.yandex.messaging.PrivateChatRequest, com.yandex.messaging.ChatRequest
    public boolean handle(l8b handler) {
        return Boolean.TRUE.booleanValue();
    }

    @Override // com.yandex.messaging.PrivateChatRequest, com.yandex.messaging.ChatRequest
    public <T> T handle(k8b handler) {
        return (T) handler.z(this);
    }

    public /* synthetic */ PrivateChat(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PrivateChat(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }
}
