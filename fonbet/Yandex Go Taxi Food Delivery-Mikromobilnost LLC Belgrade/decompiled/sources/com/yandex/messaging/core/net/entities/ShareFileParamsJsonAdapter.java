package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ShareFileParamsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/ShareFileParams;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "", "arrayOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ShareFileParamsJsonAdapter extends JsonAdapter<ShareFileParams> {
    private final JsonAdapter<String[]> arrayOfStringAdapter;
    private volatile Constructor<ShareFileParams> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("file_ids", "share_chat_id", "chat_id", "invite_hash");
    private final JsonAdapter<String> stringAdapter;

    public ShareFileParamsJsonAdapter(Moshi moshi) {
        GenericArrayType arrayOf = Types.arrayOf(String.class);
        EmptySet emptySet = EmptySet.a;
        this.arrayOfStringAdapter = moshi.adapter(arrayOf, emptySet, "fileIds");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "originalChatId");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "inviteHash");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ShareFileParams fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String[] strArr = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                strArr = this.arrayOfStringAdapter.fromJson(jsonReader);
                if (strArr == null) {
                    throw Util.unexpectedNull("fileIds", "file_ids", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("originalChatId", "share_chat_id", jsonReader);
                }
            } else if (selectName == 2) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("newChatId", "chat_id", jsonReader);
                }
            } else if (selectName == 3) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
                i = -9;
            }
        }
        jsonReader.endObject();
        if (i == -9) {
            if (strArr == null) {
                throw Util.missingProperty("fileIds", "file_ids", jsonReader);
            }
            if (str == null) {
                throw Util.missingProperty("originalChatId", "share_chat_id", jsonReader);
            }
            if (str2 != null) {
                return new ShareFileParams(strArr, str, str2, str3);
            }
            throw Util.missingProperty("newChatId", "chat_id", jsonReader);
        }
        Constructor<ShareFileParams> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ShareFileParams.class.getDeclaredConstructor(String[].class, String.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (strArr == null) {
            throw Util.missingProperty("fileIds", "file_ids", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("originalChatId", "share_chat_id", jsonReader);
        }
        if (str2 != null) {
            return constructor.newInstance(strArr, str, str2, str3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("newChatId", "chat_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ShareFileParams shareFileParams) {
        ShareFileParams shareFileParams2 = shareFileParams;
        if (shareFileParams2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("file_ids");
        this.arrayOfStringAdapter.toJson(jsonWriter, (JsonWriter) shareFileParams2.getFileIds());
        jsonWriter.name("share_chat_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) shareFileParams2.getOriginalChatId());
        jsonWriter.name("chat_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) shareFileParams2.getNewChatId());
        jsonWriter.name("invite_hash");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) shareFileParams2.getInviteHash());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(ShareFileParams)");
    }
}
