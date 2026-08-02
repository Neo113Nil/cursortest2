package com.yandex.messaging.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonWriter;
import com.yandex.messaging.CreateGroupChatRequest;
import com.yandex.messaging.files.ImageFileInfo;
import defpackage.k8b;
import defpackage.l8b;
import defpackage.m8b;
import defpackage.n8b;
import defpackage.p1b;
import java.io.IOException;
import java.util.Objects;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes15.dex */
public final class CreateGroupChat implements CreateGroupChatRequest {
    public static final Parcelable.Creator<CreateGroupChat> CREATOR = new Parcelable.Creator<CreateGroupChat>() { // from class: com.yandex.messaging.internal.CreateGroupChat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CreateGroupChat createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            Objects.requireNonNull(readString);
            String readString2 = parcel.readString();
            Objects.requireNonNull(readString2);
            return new CreateGroupChat(readString, readString2, parcel.readString(), parcel.createStringArray(), (ImageFileInfo) parcel.readParcelable(ImageFileInfo.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CreateGroupChat[] newArray(int i) {
            return new CreateGroupChat[i];
        }
    };
    private final ImageFileInfo mAvatarInfo;
    private final String mDescription;
    private boolean mIsPublic;
    private final String[] mMembers;
    private final String mName;
    private final String mRequestId;

    public CreateGroupChat(String str, String str2, String str3, String[] strArr, ImageFileInfo imageFileInfo, boolean z) {
        this.mRequestId = str;
        this.mName = str2;
        this.mDescription = str3;
        this.mMembers = strArr;
        this.mAvatarInfo = imageFileInfo;
        this.mIsPublic = z;
    }

    @Override // com.yandex.messaging.CreateGroupChatRequest
    public ImageFileInfo avatar() {
        return this.mAvatarInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.yandex.messaging.CreateGroupChatRequest
    public String description() {
        return this.mDescription;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreateGroupChat) {
            return this.mRequestId.equals(((CreateGroupChat) obj).mRequestId);
        }
        return false;
    }

    @Override // com.yandex.messaging.CreateGroupChatRequest, com.yandex.messaging.ChatRequest
    public void handle(m8b m8bVar) throws IOException {
        JsonAdapter jsonAdapter;
        p1b p1bVar = (p1b) m8bVar;
        JsonWriter jsonWriter = (JsonWriter) p1bVar.a;
        jsonWriter.name("create_group_chat").beginObject();
        jsonWriter.name("request_id").value(requestId());
        jsonWriter.name("name").value(name());
        if (members().length > 0) {
            jsonWriter.name("members");
            jsonAdapter = ((ChatRequestJsonAdapter) p1bVar.b).mArrayAdapter;
            jsonAdapter.toJson(jsonWriter, (JsonWriter) members());
        }
        if (avatar() != null) {
            jsonWriter.name("avatar_url").value(avatar().getUrl());
        }
        jsonWriter.name("public").value(isPublic());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION).value(description());
        jsonWriter.endObject();
    }

    public int hashCode() {
        return this.mRequestId.hashCode();
    }

    @Override // com.yandex.messaging.CreateGroupChatRequest
    public boolean isPublic() {
        return this.mIsPublic;
    }

    @Override // com.yandex.messaging.CreateGroupChatRequest
    public String[] members() {
        return this.mMembers;
    }

    @Override // com.yandex.messaging.CreateGroupChatRequest
    public String name() {
        return this.mName;
    }

    @Override // com.yandex.messaging.CreateGroupChatRequest
    public String requestId() {
        return this.mRequestId;
    }

    public String toString() {
        return "new_group:" + this.mName;
    }

    @Override // com.yandex.messaging.CreateGroupChatRequest, com.yandex.messaging.ChatRequest
    public String uniqueRequestId() {
        return this.mRequestId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mRequestId);
        parcel.writeString(this.mName);
        parcel.writeString(this.mDescription);
        parcel.writeStringArray(this.mMembers);
        parcel.writeParcelable(this.mAvatarInfo, 0);
        parcel.writeInt(this.mIsPublic ? 1 : 0);
    }

    @Override // com.yandex.messaging.CreateGroupChatRequest, com.yandex.messaging.ChatRequest
    public int handle(n8b n8bVar) {
        return ((Integer) n8bVar.w(this)).intValue();
    }

    @Override // com.yandex.messaging.CreateGroupChatRequest, com.yandex.messaging.ChatRequest
    public boolean handle(l8b l8bVar) {
        l8bVar.getClass();
        return Boolean.FALSE.booleanValue();
    }

    @Override // com.yandex.messaging.CreateGroupChatRequest, com.yandex.messaging.ChatRequest
    public <T> T handle(k8b k8bVar) {
        return (T) k8bVar.w(this);
    }
}
