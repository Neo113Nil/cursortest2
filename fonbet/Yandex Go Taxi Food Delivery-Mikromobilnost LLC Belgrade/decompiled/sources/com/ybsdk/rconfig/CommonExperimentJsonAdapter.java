package com.ybsdk.rconfig;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.dac;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/rconfig/CommonExperimentJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/CommonExperiment;", "Lcom/squareup/moshi/Moshi;", "moshi", "", "Ljava/lang/reflect/Type;", "types", "<init>", "(Lcom/squareup/moshi/Moshi;[Ljava/lang/reflect/Type;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "tNullableAnyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/ExperimentApplyType;", "experimentApplyTypeAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CommonExperimentJsonAdapter<T> extends JsonAdapter<CommonExperiment<? extends T>> {
    private final JsonAdapter<ExperimentApplyType> experimentApplyTypeAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<T> tNullableAnyAdapter;

    public CommonExperimentJsonAdapter(Moshi moshi, Type[] typeArr) {
        if (typeArr.length != 1) {
            dac.e(typeArr.length, "TypeVariable mismatch: Expecting 1 type for generic type variables [T], but received ");
            throw null;
        }
        this.options = JsonReader.Options.of(Constants.KEY_DATA, "type");
        Type type = typeArr[0];
        EmptySet emptySet = EmptySet.a;
        this.tNullableAnyAdapter = moshi.adapter(type, emptySet, Constants.KEY_DATA);
        this.experimentApplyTypeAdapter = moshi.adapter(ExperimentApplyType.class, emptySet, "applyType");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        T t = null;
        ExperimentApplyType experimentApplyType = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                t = this.tNullableAnyAdapter.fromJson(jsonReader);
                if (t == null) {
                    throw Util.unexpectedNull("data_", Constants.KEY_DATA, jsonReader);
                }
            } else if (selectName == 1 && (experimentApplyType = this.experimentApplyTypeAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("applyType", "type", jsonReader);
            }
        }
        jsonReader.endObject();
        if (t == null) {
            throw Util.missingProperty("data_", Constants.KEY_DATA, jsonReader);
        }
        if (experimentApplyType != null) {
            return new CommonExperiment(t, experimentApplyType);
        }
        throw Util.missingProperty("applyType", "type", jsonReader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        CommonExperiment commonExperiment = (CommonExperiment) obj;
        if (commonExperiment == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(Constants.KEY_DATA);
        this.tNullableAnyAdapter.toJson(jsonWriter, (JsonWriter) commonExperiment.getData());
        jsonWriter.name("type");
        this.experimentApplyTypeAdapter.toJson(jsonWriter, (JsonWriter) commonExperiment.getApplyType());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(CommonExperiment)");
    }
}
