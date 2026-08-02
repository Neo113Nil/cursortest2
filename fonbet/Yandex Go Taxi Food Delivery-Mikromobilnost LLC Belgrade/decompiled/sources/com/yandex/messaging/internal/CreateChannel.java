package com.yandex.messaging.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonWriter;
import com.yandex.messaging.CreateChannelRequest;
import com.yandex.messaging.files.ImageFileInfo;
import defpackage.k8b;
import defpackage.l8b;
import defpackage.m8b;
import defpackage.n8b;
import defpackage.p1b;
import java.io.IOException;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes15.dex */
public class CreateChannel implements CreateChannelRequest {
    public static final Parcelable.Creator<CreateChannel> CREATOR = new Parcelable.Creator<CreateChannel>() { // from class: com.yandex.messaging.internal.CreateChannel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CreateChannel createFromParcel(Parcel parcel) {
            return new CreateChannel(parcel.readString(), parcel.readString(), parcel.readString(), (ImageFileInfo) parcel.readParcelable(ImageFileInfo.class.getClassLoader()), parcel.readInt(), parcel.createStringArray());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CreateChannel[] newArray(int i) {
            return new CreateChannel[i];
        }
    };
    private final ImageFileInfo mAvatarInfo;
    private final boolean mChannelPublicity;
    private final String mDescription;
    private final String mId;
    private final String[] mMembers;
    private final String mName;

    public CreateChannel(String str, String str2, String str3, ImageFileInfo imageFileInfo, int i, String[] strArr) {
        this.mId = str;
        this.mName = str2;
        this.mDescription = str3;
        this.mAvatarInfo = imageFileInfo;
        this.mChannelPublicity = i == 1;
        this.mMembers = strArr;
    }

    @Override // com.yandex.messaging.CreateChannelRequest
    public ImageFileInfo avatar() {
        return this.mAvatarInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.yandex.messaging.CreateChannelRequest
    public String description() {
        return this.mDescription;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.mId.equals(((CreateChannel) obj).mId);
    }

    @Override // com.yandex.messaging.CreateChannelRequest
    public boolean getChannelPublicity() {
        return this.mChannelPublicity;
    }

    @Override // com.yandex.messaging.CreateChannelRequest, com.yandex.messaging.ChatRequest
    public void handle(m8b m8bVar) throws IOException {
        JsonAdapter jsonAdapter;
        p1b p1bVar = (p1b) m8bVar;
        JsonWriter jsonWriter = (JsonWriter) p1bVar.a;
        jsonWriter.name("create_channel").beginObject();
        jsonWriter.name("request_id").value(requestId());
        jsonWriter.name("name").value(name());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION).value(description());
        jsonWriter.name("is_public").value(getChannelPublicity());
        if (avatar() != null) {
            jsonWriter.name("avatar_url").value(avatar().getUrl());
        }
        if (members().length > 0) {
            jsonWriter.name("members");
            jsonAdapter = ((ChatRequestJsonAdapter) p1bVar.b).mArrayAdapter;
            jsonAdapter.toJson(jsonWriter, (JsonWriter) members());
        }
        jsonWriter.endObject();
    }

    public int hashCode() {
        return this.mId.hashCode();
    }

    @Override // com.yandex.messaging.CreateChannelRequest
    public String[] members() {
        return this.mMembers;
    }

    @Override // com.yandex.messaging.CreateChannelRequest
    public String name() {
        return this.mName;
    }

    @Override // com.yandex.messaging.CreateChannelRequest
    public String requestId() {
        return this.mId;
    }

    @Override // com.yandex.messaging.CreateChannelRequest, com.yandex.messaging.ChatRequest
    public String uniqueRequestId() {
        return this.mId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeString(this.mName);
        parcel.writeString(this.mDescription);
        parcel.writeParcelable(this.mAvatarInfo, i);
        parcel.writeInt(this.mChannelPublicity ? 1 : 0);
        parcel.writeStringArray(this.mMembers);
    }

    @Override // com.yandex.messaging.CreateChannelRequest, com.yandex.messaging.ChatRequest
    public int handle(n8b n8bVar) {
        return ((Integer) n8bVar.j(this)).intValue();
    }

    @Override // com.yandex.messaging.CreateChannelRequest, com.yandex.messaging.ChatRequest
    public boolean handle(l8b l8bVar) {
        l8bVar.getClass();
        return Boolean.FALSE.booleanValue();
    }

    @Override // com.yandex.messaging.CreateChannelRequest, com.yandex.messaging.ChatRequest
    public <T> T handle(k8b k8bVar) {
        return (T) k8bVar.j(this);
    }
}
