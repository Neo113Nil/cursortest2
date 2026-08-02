package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.FoldersConfig;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/messaging/core/net/entities/FoldersConfig_FilterJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/FoldersConfig$Filter;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "", "listOfIntAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FoldersConfig_FilterJsonAdapter extends JsonAdapter<FoldersConfig.Filter> {
    private volatile Constructor<FoldersConfig.Filter> constructorRef;
    private final JsonAdapter<List<Integer>> listOfIntAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("ns", "chat_type", "name", "i18n_key", "avatar_id");
    private final JsonAdapter<String> stringAdapter;

    public FoldersConfig_FilterJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, Integer.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfIntAdapter = moshi.adapter(newParameterizedType, emptySet, "namespaces");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "name");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FoldersConfig.Filter fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<Integer> list = null;
        List<Integer> list2 = null;
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
                list = this.listOfIntAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("namespaces", "ns", jsonReader);
                }
                i &= -2;
            } else if (selectName == 1) {
                list2 = this.listOfIntAdapter.fromJson(jsonReader);
                if (list2 == null) {
                    throw Util.unexpectedNull("chatTypeIds", "chat_type", jsonReader);
                }
                i &= -3;
            } else if (selectName == 2) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("name", "name", jsonReader);
                }
            } else if (selectName == 3) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("i18nKey", "i18n_key", jsonReader);
                }
            } else if (selectName == 4 && (str3 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("avatarUrl", "avatar_id", jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -4) {
            String str4 = str3;
            String str5 = str2;
            String str6 = str;
            List<Integer> list3 = list2;
            List<Integer> list4 = list;
            if (str6 == null) {
                throw Util.missingProperty("name", "name", jsonReader);
            }
            if (str5 == null) {
                throw Util.missingProperty("i18nKey", "i18n_key", jsonReader);
            }
            if (str4 != null) {
                return new FoldersConfig.Filter(list4, list3, str6, str5, str4);
            }
            throw Util.missingProperty("avatarUrl", "avatar_id", jsonReader);
        }
        String str7 = str3;
        String str8 = str2;
        String str9 = str;
        List<Integer> list5 = list2;
        List<Integer> list6 = list;
        Constructor<FoldersConfig.Filter> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = FoldersConfig.Filter.class.getDeclaredConstructor(List.class, List.class, String.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str9 == null) {
            throw Util.missingProperty("name", "name", jsonReader);
        }
        if (str8 == null) {
            throw Util.missingProperty("i18nKey", "i18n_key", jsonReader);
        }
        if (str7 != null) {
            return constructor.newInstance(list6, list5, str9, str8, str7, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("avatarUrl", "avatar_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FoldersConfig.Filter filter) {
        FoldersConfig.Filter filter2 = filter;
        if (filter2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("ns");
        this.listOfIntAdapter.toJson(jsonWriter, (JsonWriter) filter2.getNamespaces());
        jsonWriter.name("chat_type");
        this.listOfIntAdapter.toJson(jsonWriter, (JsonWriter) filter2.getChatTypeIds());
        jsonWriter.name("name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) filter2.getName());
        jsonWriter.name("i18n_key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) filter2.getI18nKey());
        jsonWriter.name("avatar_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) filter2.getAvatarUrl());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(FoldersConfig.Filter)");
    }
}
