package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.core.net.entities.proto.MeetingUpdatedData;
import com.yandex.messaging.core.net.entities.proto.YouAddedToThreadData;
import com.yandex.messaging.core.net.entities.proto.YouRemovedFromThreadData;
import com.yandex.messaging.core.net.entities.proto.message.StateSync;
import com.yandex.messaging.core.net.entities.proto.telemost.MeetingInfoRegistryResponse;
import defpackage.ny61;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes15.dex */
public class SyncDataAdapter extends JsonAdapter<StateSync.SyncData> {
    public static final JsonAdapter.Factory b = new AnonymousClass1();
    public Moshi a;

    /* renamed from: com.yandex.messaging.core.net.entities.SyncDataAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements JsonAdapter.Factory {
        @Override // com.squareup.moshi.JsonAdapter.Factory
        public final JsonAdapter create(Type type, Set set, Moshi moshi) {
            if (!type.equals(StateSync.SyncData.class)) {
                return null;
            }
            SyncDataAdapter syncDataAdapter = new SyncDataAdapter();
            syncDataAdapter.a = moshi;
            return syncDataAdapter;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.squareup.moshi.JsonAdapter
    public final StateSync.SyncData fromJson(JsonReader jsonReader) {
        StateSyncDiff stateSyncDiff;
        Moshi moshi = this.a;
        jsonReader.beginObject();
        HashMap hashMap = new HashMap();
        while (jsonReader.hasNext()) {
            hashMap.put(jsonReader.nextName(), jsonReader.readJsonValue());
        }
        Object obj = hashMap.get(Constants.KEY_DATA);
        String str = (String) hashMap.get("type");
        if (obj != null && str != null) {
            switch (str) {
                case "miniapps":
                    stateSyncDiff = (StateSyncDiff) moshi.adapter(MiniappsBucket.class).fromJsonValue(obj);
                    break;
                case "user_bucket":
                    stateSyncDiff = (StateSyncDiff) moshi.adapter(Bucket.class).fromJsonValue(obj);
                    break;
                case "you_removed":
                    stateSyncDiff = (StateSyncDiff) moshi.adapter(SelfRemovedData.class).fromJsonValue(obj);
                    break;
                case "you_added":
                    stateSyncDiff = (StateSyncDiff) moshi.adapter(YouAddedData.class).fromJsonValue(obj);
                    break;
                case "user_reload":
                    stateSyncDiff = (StateSyncDiff) moshi.adapter(UserReloadData.class).fromJsonValue(obj);
                    break;
                case "you_added_to_thread":
                    stateSyncDiff = (StateSyncDiff) moshi.adapter(YouAddedToThreadData.class).fromJsonValue(obj);
                    break;
                case "you_removed_from_thread":
                    stateSyncDiff = (StateSyncDiff) moshi.adapter(YouRemovedFromThreadData.class).fromJsonValue(obj);
                    break;
                case "roles_changed":
                    stateSyncDiff = (StateSyncDiff) moshi.adapter(ChatRoleChangedData.class).fromJsonValue(obj);
                    break;
                case "meeting_updated":
                    MeetingInfoRegistryResponse meetingInfoRegistryResponse = (MeetingInfoRegistryResponse) moshi.adapter(MeetingInfoRegistryResponse.class).fromJsonValue(obj);
                    if (meetingInfoRegistryResponse != null) {
                        stateSyncDiff = new MeetingUpdatedData(meetingInfoRegistryResponse);
                        break;
                    }
                    stateSyncDiff = null;
                    break;
                case "chat_info_changed":
                case "members_changed_v2":
                    stateSyncDiff = (StateSyncDiff) moshi.adapter(ChatInfoChangedData.class).fromJsonValue(obj);
                    break;
                default:
                    stateSyncDiff = null;
                    break;
            }
            jsonReader.endObject();
            if (stateSyncDiff != null) {
                return new StateSync.SyncData(stateSyncDiff, str);
            }
        }
        return null;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, StateSync.SyncData syncData) {
        StateSyncDiff stateSyncDiff;
        StateSync.SyncData syncData2 = syncData;
        Moshi moshi = this.a;
        if (syncData2 == null) {
            jsonWriter.nullValue();
            return;
        }
        String str = syncData2.b;
        stateSyncDiff = syncData2.a;
        jsonWriter.beginObject();
        jsonWriter.name(Constants.KEY_DATA);
        switch (str) {
            case "miniapps":
                moshi.adapter(MiniappsBucket.class).toJson(jsonWriter, (JsonWriter) stateSyncDiff);
                break;
            case "user_bucket":
                moshi.adapter(Bucket.class).toJson(jsonWriter, (JsonWriter) stateSyncDiff);
                break;
            case "you_removed":
                moshi.adapter(SelfRemovedData.class).toJson(jsonWriter, (JsonWriter) stateSyncDiff);
                break;
            case "you_added":
                moshi.adapter(YouAddedData.class).toJson(jsonWriter, (JsonWriter) stateSyncDiff);
                break;
            case "user_reload":
                moshi.adapter(UserReloadData.class).toJson(jsonWriter, (JsonWriter) stateSyncDiff);
                break;
            case "you_added_to_thread":
                moshi.adapter(YouAddedToThreadData.class).toJson(jsonWriter, (JsonWriter) stateSyncDiff);
                break;
            case "you_removed_from_thread":
                moshi.adapter(YouRemovedFromThreadData.class).toJson(jsonWriter, (JsonWriter) stateSyncDiff);
                break;
            case "roles_changed":
                moshi.adapter(ChatRoleChangedData.class).toJson(jsonWriter, (JsonWriter) stateSyncDiff);
                break;
            case "meeting_updated":
                moshi.adapter(MeetingInfoRegistryResponse.class).toJson(jsonWriter, (JsonWriter) ((MeetingUpdatedData) stateSyncDiff).a);
                break;
            case "chat_info_changed":
            case "members_changed_v2":
                moshi.adapter(ChatInfoChangedData.class).toJson(jsonWriter, (JsonWriter) stateSyncDiff);
                break;
            default:
                ny61.r("Serialization is not supported");
                return;
        }
        jsonWriter.name("type").value(str);
        jsonWriter.endObject();
    }
}
