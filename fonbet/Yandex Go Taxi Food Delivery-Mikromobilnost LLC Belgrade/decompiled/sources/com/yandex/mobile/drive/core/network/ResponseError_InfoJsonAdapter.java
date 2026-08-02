package com.yandex.mobile.drive.core.network;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.yandex.mobile.drive.core.network.ResponseError;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/yandex/mobile/drive/core/network/ResponseError_InfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/mobile/drive/core/network/ResponseError$Info;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "Lcom/yandex/mobile/drive/core/network/ResponseError$Info$Car;", "nullableCarAdapter", "Lcom/yandex/mobile/drive/core/network/ResponseError$Info$Model;", "nullableModelAdapter", "drive_native_features_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ResponseError_InfoJsonAdapter extends JsonAdapter<ResponseError.Info> {
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<ResponseError.Info.Car> nullableCarAdapter;
    private final JsonAdapter<ResponseError.Info.Model> nullableModelAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("error_code", "may_retry_with_force", "car", "model");

    public ResponseError_InfoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, ErrorResponseData.JSON_ERROR_CODE);
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "mayRetryWithForce");
        this.nullableCarAdapter = moshi.adapter(ResponseError.Info.Car.class, emptySet, "car");
        this.nullableModelAdapter = moshi.adapter(ResponseError.Info.Model.class, emptySet, "model");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ResponseError.Info fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        ResponseError.Info.Car car = null;
        ResponseError.Info.Model model = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        Boolean bool = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                z = true;
            } else if (selectName == 1) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                z2 = true;
            } else if (selectName == 2) {
                car = this.nullableCarAdapter.fromJson(jsonReader);
                z3 = true;
            } else if (selectName == 3) {
                model = this.nullableModelAdapter.fromJson(jsonReader);
                z4 = true;
            }
        }
        jsonReader.endObject();
        ResponseError.Info info = new ResponseError.Info();
        if (z) {
            info.setErrorCode(str);
        }
        if (z2) {
            info.setMayRetryWithForce(bool);
        }
        if (z3) {
            info.setCar(car);
        }
        if (z4) {
            info.setModel(model);
        }
        return info;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ResponseError.Info info) {
        ResponseError.Info info2 = info;
        if (info2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("error_code");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) info2.getErrorCode());
        jsonWriter.name("may_retry_with_force");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) info2.getMayRetryWithForce());
        jsonWriter.name("car");
        this.nullableCarAdapter.toJson(jsonWriter, (JsonWriter) info2.getCar());
        jsonWriter.name("model");
        this.nullableModelAdapter.toJson(jsonWriter, (JsonWriter) info2.getModel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(ResponseError.Info)");
    }
}
