package com.yandex.messaging.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonWriter;
import com.yandex.messaging.CreateFamilyChatRequest;
import defpackage.k8b;
import defpackage.l8b;
import defpackage.m8b;
import defpackage.n8b;
import defpackage.p1b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 '2\u00020\u0001:\u0001'B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0017\u001a\u00028\u0000\"\n\b\u0000\u0010\u0014*\u0004\u0018\u00010\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u0017\u0010\u001aJ\u0017\u0010\u0017\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u0017\u0010\u001dJ\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u0017\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0012R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/yandex/messaging/internal/CreateFamilyChat;", "Lcom/yandex/messaging/CreateFamilyChatRequest;", "", "requestId", "", "members", "<init>", "(Ljava/lang/String;[Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "uniqueRequestId", "()Ljava/lang/String;", "", "T", "Lk8b;", "handler", "handle", "(Lk8b;)Ljava/lang/Object;", "Ln8b;", "(Ln8b;)I", "Ll8b;", "", "(Ll8b;)Z", "Lm8b;", "(Lm8b;)V", "describeContents", "()I", "Ljava/lang/String;", "getRequestId", "[Ljava/lang/String;", "getMembers", "()[Ljava/lang/String;", "CREATOR", "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CreateFamilyChat implements CreateFamilyChatRequest {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String[] members;
    private final String requestId;

    public CreateFamilyChat(Parcel parcel) {
        this(parcel.readString(), parcel.createStringArray());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.yandex.messaging.CreateFamilyChatRequest
    public String[] getMembers() {
        return this.members;
    }

    @Override // com.yandex.messaging.CreateFamilyChatRequest
    public String getRequestId() {
        return this.requestId;
    }

    @Override // com.yandex.messaging.CreateFamilyChatRequest, com.yandex.messaging.ChatRequest
    public void handle(m8b handler) {
        JsonAdapter jsonAdapter;
        p1b p1bVar = (p1b) handler;
        JsonWriter jsonWriter = (JsonWriter) p1bVar.a;
        jsonWriter.name("create_family_chat").beginObject();
        jsonWriter.name("request_id").value(getRequestId());
        if (getMembers().length > 0) {
            jsonWriter.name("members");
            jsonAdapter = ((ChatRequestJsonAdapter) p1bVar.b).mArrayAdapter;
            jsonAdapter.toJson(jsonWriter, (JsonWriter) getMembers());
        }
        jsonWriter.endObject();
    }

    @Override // com.yandex.messaging.CreateFamilyChatRequest, com.yandex.messaging.ChatRequest
    public String uniqueRequestId() {
        return getRequestId();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(getRequestId());
        dest.writeStringArray(getMembers());
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/messaging/internal/CreateFamilyChat$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/yandex/messaging/internal/CreateFamilyChat;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/yandex/messaging/internal/CreateFamilyChat;", "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.yandex.messaging.internal.CreateFamilyChat$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<CreateFamilyChat> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CreateFamilyChat createFromParcel(Parcel parcel) {
            return new CreateFamilyChat(parcel);
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CreateFamilyChat[] newArray(int size) {
            return new CreateFamilyChat[size];
        }
    }

    public CreateFamilyChat(String str, String[] strArr) {
        this.requestId = str;
        this.members = strArr;
    }

    @Override // com.yandex.messaging.CreateFamilyChatRequest, com.yandex.messaging.ChatRequest
    public int handle(n8b handler) {
        return ((Number) handler.u(this)).intValue();
    }

    @Override // com.yandex.messaging.CreateFamilyChatRequest, com.yandex.messaging.ChatRequest
    public boolean handle(l8b handler) {
        return Boolean.FALSE.booleanValue();
    }

    @Override // com.yandex.messaging.CreateFamilyChatRequest, com.yandex.messaging.ChatRequest
    public <T> T handle(k8b handler) {
        return (T) handler.u(this);
    }
}
