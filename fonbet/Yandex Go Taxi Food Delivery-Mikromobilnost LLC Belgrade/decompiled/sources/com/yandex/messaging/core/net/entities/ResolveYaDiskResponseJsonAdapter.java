package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ResolveYaDiskResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/ResolveYaDiskResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/yandex/messaging/core/net/entities/ResolvedYaDiskFile;", "nullableListOfResolvedYaDiskFileAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ResolveYaDiskResponseJsonAdapter extends JsonAdapter<ResolveYaDiskResponse> {
    private final JsonAdapter<List<ResolvedYaDiskFile>> nullableListOfResolvedYaDiskFileAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("files", AuthSdkActivity.RESPONSE_TYPE_CODE, Constants.KEY_MESSAGE);

    public ResolveYaDiskResponseJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, ResolvedYaDiskFile.class);
        EmptySet emptySet = EmptySet.a;
        this.nullableListOfResolvedYaDiskFileAdapter = moshi.adapter(newParameterizedType, emptySet, "files");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, AuthSdkActivity.RESPONSE_TYPE_CODE);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ResolveYaDiskResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<ResolvedYaDiskFile> list = null;
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.nullableListOfResolvedYaDiskFileAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new ResolveYaDiskResponse(list, str, str2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ResolveYaDiskResponse resolveYaDiskResponse) {
        ResolveYaDiskResponse resolveYaDiskResponse2 = resolveYaDiskResponse;
        if (resolveYaDiskResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("files");
        this.nullableListOfResolvedYaDiskFileAdapter.toJson(jsonWriter, (JsonWriter) resolveYaDiskResponse2.getFiles());
        jsonWriter.name(AuthSdkActivity.RESPONSE_TYPE_CODE);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) resolveYaDiskResponse2.getCode());
        jsonWriter.name(Constants.KEY_MESSAGE);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) resolveYaDiskResponse2.getMessage());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(ResolveYaDiskResponse)");
    }
}
