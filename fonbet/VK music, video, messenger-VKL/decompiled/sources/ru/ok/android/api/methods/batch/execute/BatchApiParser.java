package ru.ok.android.api.methods.batch.execute;

import com.ironsource.X3;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiExecutableRequestKt;
import ru.ok.android.api.core.ApiUris;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonReader;
import ru.ok.android.api.json.KotlinxSerializationUtilsKt;
import xsna.zcl;

/* compiled from: BatchApiParser.kt */
/* loaded from: classes9.dex */
public final class BatchApiParser implements JsonParser<BatchApiResult> {
    public static final Companion Companion = new Companion(null);
    private final ApiRequestRecord<?>[] requestRecords;

    /* compiled from: BatchApiParser.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private final <T> ApiResultRecord<T> parseRecord(JsonReader jsonReader, ApiRequestRecord<T> apiRequestRecord) {
            ApiResultRecord<T> ok;
            jsonReader.beginObject();
            String name = jsonReader.name();
            int hashCode = name.hashCode();
            if (hashCode != 3548) {
                if (hashCode == 3135262 && name.equals(X3.g.e)) {
                    ok = ApiResultRecord.Companion.fail(apiRequestRecord, apiRequestRecord.request.getFailParser().parse(jsonReader));
                }
                jsonReader.skipValue();
                ok = ApiResultRecord.Companion.ok(apiRequestRecord, null);
            } else {
                if (name.equals(ApiUris.SCHEME_OK)) {
                    JsonReader createChildReader = jsonReader.createChildReader();
                    ApiExecutableRequest<T> apiExecutableRequest = apiRequestRecord.request;
                    ok = ApiResultRecord.Companion.ok(apiRequestRecord, apiExecutableRequest instanceof ApiExecutableRequestKt ? KotlinxSerializationUtilsKt.DefaultJson().a(((ApiExecutableRequestKt) apiRequestRecord.request).getSerializer(), createChildReader.jsonValue()) : apiExecutableRequest.getOkParser().parse(createChildReader));
                }
                jsonReader.skipValue();
                ok = ApiResultRecord.Companion.ok(apiRequestRecord, null);
            }
            jsonReader.endObject();
            return ok;
        }

        public final ApiResultRecord<?>[] parseRecords$odnoklassniki_android_api_release(JsonReader jsonReader, ApiRequestRecord<?>[] apiRequestRecordArr) {
            ApiResultRecord<?>[] apiResultRecordArr = new ApiResultRecord[apiRequestRecordArr.length];
            jsonReader.beginArray();
            int length = apiRequestRecordArr.length;
            for (int i = 0; i < length; i++) {
                apiResultRecordArr[i] = parseRecord(jsonReader, apiRequestRecordArr[i]);
            }
            jsonReader.endArray();
            return apiResultRecordArr;
        }

        private Companion() {
        }
    }

    public BatchApiParser(ApiRequestRecord<?>[] apiRequestRecordArr) {
        this.requestRecords = apiRequestRecordArr;
    }

    @Override // ru.ok.android.api.json.JsonParser
    public BatchApiResult parse(JsonReader jsonReader) {
        return new BatchApiResult(Companion.parseRecords$odnoklassniki_android_api_release(jsonReader, this.requestRecords));
    }
}
