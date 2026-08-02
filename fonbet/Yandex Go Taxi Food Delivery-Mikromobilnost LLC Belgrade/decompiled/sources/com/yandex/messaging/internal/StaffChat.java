package com.yandex.messaging.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonWriter;
import com.yandex.messaging.StaffChatRequest;
import defpackage.k8b;
import defpackage.l8b;
import defpackage.m8b;
import defpackage.n8b;
import defpackage.p1b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\tJ#\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0014\u0010\u0017J\u0017\u0010\u0014\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0014\u0010\u001aJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u0014\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\t¨\u0006\""}, d2 = {"Lcom/yandex/messaging/internal/StaffChat;", "Lcom/yandex/messaging/StaffChatRequest;", "", "nickname", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "()Ljava/lang/String;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "uniqueRequestId", "T", "Lk8b;", "handler", "handle", "(Lk8b;)Ljava/lang/Object;", "Ln8b;", "(Ln8b;)I", "Ll8b;", "", "(Ll8b;)Z", "Lm8b;", "(Lm8b;)V", "describeContents", "()I", "Ljava/lang/String;", "getNickname", "CREATOR", "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StaffChat implements StaffChatRequest {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String nickname;

    private StaffChat(Parcel parcel) {
        this(parcel.readString());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getNickname() {
        return this.nickname;
    }

    @Override // com.yandex.messaging.StaffChatRequest, com.yandex.messaging.ChatRequest
    public void handle(m8b handler) {
        ((JsonWriter) ((p1b) handler).a).name("nickname").value(nickname());
    }

    @Override // com.yandex.messaging.StaffChatRequest
    public String nickname() {
        return this.nickname;
    }

    @Override // com.yandex.messaging.StaffChatRequest, com.yandex.messaging.ChatRequest
    public String uniqueRequestId() {
        return this.nickname;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nickname);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/messaging/internal/StaffChat$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/yandex/messaging/internal/StaffChat;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/yandex/messaging/internal/StaffChat;", "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.yandex.messaging.internal.StaffChat$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<StaffChat> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StaffChat createFromParcel(Parcel parcel) {
            return new StaffChat(parcel, null);
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StaffChat[] newArray(int size) {
            return new StaffChat[size];
        }
    }

    public StaffChat(String str) {
        this.nickname = str;
    }

    public /* synthetic */ StaffChat(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    @Override // com.yandex.messaging.StaffChatRequest, com.yandex.messaging.ChatRequest
    public int handle(n8b handler) {
        return ((Number) handler.n(this)).intValue();
    }

    @Override // com.yandex.messaging.StaffChatRequest, com.yandex.messaging.ChatRequest
    public boolean handle(l8b handler) {
        return Boolean.TRUE.booleanValue();
    }

    @Override // com.yandex.messaging.StaffChatRequest, com.yandex.messaging.ChatRequest
    public <T> T handle(k8b handler) {
        return (T) handler.n(this);
    }
}
