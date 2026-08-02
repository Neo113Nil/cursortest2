package com.yandex.messaging.core.net.entities;

import android.text.TextUtils;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes15.dex */
public class BucketAdapter extends JsonAdapter<Bucket> {
    public static final JsonAdapter.Factory b = new AnonymousClass1();
    public final Moshi a;

    /* renamed from: com.yandex.messaging.core.net.entities.BucketAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements JsonAdapter.Factory {
        @Override // com.squareup.moshi.JsonAdapter.Factory
        public final JsonAdapter create(Type type, Set set, Moshi moshi) {
            if (Bucket.class.equals(type)) {
                return new BucketAdapter(moshi);
            }
            return null;
        }
    }

    public static class BucketName {

        @Json(name = "bucket_name")
        String name;
    }

    public BucketAdapter(Moshi moshi) {
        this.a = moshi;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Bucket fromJson(JsonReader jsonReader) {
        Object readJsonValue = jsonReader.readJsonValue();
        if (readJsonValue == null) {
            return null;
        }
        Moshi moshi = this.a;
        BucketName bucketName = (BucketName) moshi.adapter(BucketName.class).fromJsonValue(readJsonValue);
        if (bucketName == null || TextUtils.isEmpty(bucketName.name)) {
            return null;
        }
        String str = bucketName.name;
        str.getClass();
        switch (str) {
            case "custom_user_statuses":
                return (Bucket) moshi.adapter(UserStatusPresetBucket.class).fromJsonValue(readJsonValue);
            case "miniapps":
                return (Bucket) moshi.adapter(MiniappsBucket.class).fromJsonValue(readJsonValue);
            case "restrictions":
                return (Bucket) moshi.adapter(RestrictionsBucket.class).fromJsonValue(readJsonValue);
            case "folders":
                return (Bucket) moshi.adapter(FoldersBucket.class).fromJsonValue(readJsonValue);
            case "privacy":
                return (Bucket) moshi.adapter(PrivacyBucket.class).fromJsonValue(readJsonValue);
            case "chat_mutings":
                return (Bucket) moshi.adapter(ChatMutingsBucket.class).fromJsonValue(readJsonValue);
            case "sticker_packs":
                return (Bucket) moshi.adapter(StickerPacksBucket.class).fromJsonValue(readJsonValue);
            case "hidden_private_chats":
                return (Bucket) moshi.adapter(HiddenPrivateChatsBucket.class).fromJsonValue(readJsonValue);
            case "pinned_chats":
                return (Bucket) moshi.adapter(PinnedChatsBucket.class).fromJsonValue(readJsonValue);
            case "preferences":
                return (Bucket) moshi.adapter(PreferencesBucket.class).fromJsonValue(readJsonValue);
            default:
                return null;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Bucket bucket) {
        Bucket bucket2 = bucket;
        if (bucket2 == null) {
            jsonWriter.nullValue();
        } else {
            this.a.adapter((Type) bucket2.getClass()).toJson(jsonWriter, (JsonWriter) bucket2);
        }
    }
}
