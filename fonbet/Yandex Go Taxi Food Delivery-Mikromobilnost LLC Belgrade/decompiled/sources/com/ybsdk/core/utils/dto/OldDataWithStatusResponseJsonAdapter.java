package com.ybsdk.core.utils.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.utils.dto.OldDataWithStatusResponse;
import defpackage.dac;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/core/utils/dto/OldDataWithStatusResponseJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/utils/dto/OldDataWithStatusResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "", "Ljava/lang/reflect/Type;", "types", "<init>", "(Lcom/squareup/moshi/Moshi;[Ljava/lang/reflect/Type;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableTNullableAnyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/utils/dto/OldFailDataResponse;", "nullableOldFailDataResponseAdapter", "Lcom/ybsdk/core/utils/dto/OldDataWithStatusResponse$Status;", "statusAdapter", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OldDataWithStatusResponseJsonAdapter<T> extends JsonAdapter<OldDataWithStatusResponse<T>> {
    private final JsonAdapter<OldFailDataResponse> nullableOldFailDataResponseAdapter;
    private final JsonAdapter<T> nullableTNullableAnyAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<OldDataWithStatusResponse.Status> statusAdapter;

    public OldDataWithStatusResponseJsonAdapter(Moshi moshi, Type[] typeArr) {
        if (typeArr.length != 1) {
            dac.e(typeArr.length, "TypeVariable mismatch: Expecting 1 type for generic type variables [T], but received ");
            throw null;
        }
        this.options = JsonReader.Options.of("success_data", "fail_data", ACSPConstants.STATUS);
        Type type = typeArr[0];
        EmptySet emptySet = EmptySet.a;
        this.nullableTNullableAnyAdapter = moshi.adapter(type, emptySet, "successData");
        this.nullableOldFailDataResponseAdapter = moshi.adapter(OldFailDataResponse.class, emptySet, "failData");
        this.statusAdapter = moshi.adapter(OldDataWithStatusResponse.Status.class, emptySet, ACSPConstants.STATUS);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        T t = null;
        OldFailDataResponse oldFailDataResponse = null;
        OldDataWithStatusResponse.Status status = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                t = this.nullableTNullableAnyAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                oldFailDataResponse = this.nullableOldFailDataResponseAdapter.fromJson(jsonReader);
            } else if (selectName == 2 && (status = this.statusAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
            }
        }
        jsonReader.endObject();
        if (status != null) {
            return new OldDataWithStatusResponse(t, oldFailDataResponse, status);
        }
        throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        OldDataWithStatusResponse oldDataWithStatusResponse = (OldDataWithStatusResponse) obj;
        if (oldDataWithStatusResponse == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("success_data");
        this.nullableTNullableAnyAdapter.toJson(jsonWriter, (JsonWriter) oldDataWithStatusResponse.getSuccessData());
        jsonWriter.name("fail_data");
        this.nullableOldFailDataResponseAdapter.toJson(jsonWriter, (JsonWriter) oldDataWithStatusResponse.getFailData());
        jsonWriter.name(ACSPConstants.STATUS);
        this.statusAdapter.toJson(jsonWriter, (JsonWriter) oldDataWithStatusResponse.getStatus());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(OldDataWithStatusResponse)");
    }
}
