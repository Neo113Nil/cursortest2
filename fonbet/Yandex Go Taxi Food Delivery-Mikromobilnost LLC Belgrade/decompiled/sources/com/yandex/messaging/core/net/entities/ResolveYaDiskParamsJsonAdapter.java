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
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ResolveYaDiskParamsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/ResolveYaDiskParams;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/yandex/messaging/core/net/entities/ResolveYaDiskParam;", "listOfResolveYaDiskParamAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ResolveYaDiskParamsJsonAdapter extends JsonAdapter<ResolveYaDiskParams> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ResolveYaDiskParams> constructorRef;
    private final JsonAdapter<List<ResolveYaDiskParam>> listOfResolveYaDiskParamAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("files", "use_readable_error_codes");

    public ResolveYaDiskParamsJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, ResolveYaDiskParam.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfResolveYaDiskParamAdapter = moshi.adapter(newParameterizedType, emptySet, "files");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "useReadableErrorCodes");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ResolveYaDiskParams fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        List<ResolveYaDiskParam> list = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfResolveYaDiskParamAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("files", "files", jsonReader);
                }
            } else if (selectName == 1) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("useReadableErrorCodes", "use_readable_error_codes", jsonReader);
                }
                i = -3;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (list != null) {
                return new ResolveYaDiskParams(list, bool.booleanValue());
            }
            throw Util.missingProperty("files", "files", jsonReader);
        }
        Constructor<ResolveYaDiskParams> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ResolveYaDiskParams.class.getDeclaredConstructor(List.class, Boolean.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (list != null) {
            return constructor.newInstance(list, bool, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("files", "files", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ResolveYaDiskParams resolveYaDiskParams) {
        ResolveYaDiskParams resolveYaDiskParams2 = resolveYaDiskParams;
        if (resolveYaDiskParams2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("files");
        this.listOfResolveYaDiskParamAdapter.toJson(jsonWriter, (JsonWriter) resolveYaDiskParams2.getFiles());
        jsonWriter.name("use_readable_error_codes");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(resolveYaDiskParams2.getUseReadableErrorCodes()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(ResolveYaDiskParams)");
    }
}
