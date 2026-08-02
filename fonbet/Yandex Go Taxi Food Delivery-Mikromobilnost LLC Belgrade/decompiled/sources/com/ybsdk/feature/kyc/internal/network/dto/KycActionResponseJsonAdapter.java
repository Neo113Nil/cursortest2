package com.ybsdk.feature.kyc.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.dac;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/network/dto/KycActionResponseJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/kyc/internal/network/dto/KycActionResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "", "Ljava/lang/reflect/Type;", "types", "<init>", "(Lcom/squareup/moshi/Moshi;[Ljava/lang/reflect/Type;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/kyc/internal/network/dto/SyncResponseStatus;", "syncResponseStatusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/kyc/internal/network/dto/ErrorWithAddons;", "nullableErrorWithAddonsAdapter", "nullableTNullableAnyAdapter", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KycActionResponseJsonAdapter<T> extends JsonAdapter<KycActionResponse<T>> {
    private final JsonAdapter<ErrorWithAddons> nullableErrorWithAddonsAdapter;
    private final JsonAdapter<T> nullableTNullableAnyAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<SyncResponseStatus> syncResponseStatusAdapter;

    public KycActionResponseJsonAdapter(Moshi moshi, Type[] typeArr) {
        if (typeArr.length != 1) {
            dac.e(typeArr.length, "TypeVariable mismatch: Expecting 1 type for generic type variables [T], but received ");
            throw null;
        }
        this.options = JsonReader.Options.of(ACSPConstants.STATUS, "error_data", "success_data");
        EmptySet emptySet = EmptySet.a;
        this.syncResponseStatusAdapter = moshi.adapter(SyncResponseStatus.class, emptySet, ACSPConstants.STATUS);
        this.nullableErrorWithAddonsAdapter = moshi.adapter(ErrorWithAddons.class, emptySet, "errorData");
        this.nullableTNullableAnyAdapter = moshi.adapter(typeArr[0], emptySet, "successData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        SyncResponseStatus syncResponseStatus = null;
        ErrorWithAddons errorWithAddons = null;
        T t = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                syncResponseStatus = this.syncResponseStatusAdapter.fromJson(jsonReader);
                if (syncResponseStatus == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 1) {
                errorWithAddons = this.nullableErrorWithAddonsAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                t = this.nullableTNullableAnyAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (syncResponseStatus != null) {
            return new KycActionResponse(syncResponseStatus, errorWithAddons, t);
        }
        throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        KycActionResponse kycActionResponse = (KycActionResponse) obj;
        if (kycActionResponse == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.syncResponseStatusAdapter.toJson(jsonWriter, (JsonWriter) kycActionResponse.getStatus());
        jsonWriter.name("error_data");
        this.nullableErrorWithAddonsAdapter.toJson(jsonWriter, (JsonWriter) kycActionResponse.getErrorData());
        jsonWriter.name("success_data");
        this.nullableTNullableAnyAdapter.toJson(jsonWriter, (JsonWriter) kycActionResponse.getSuccessData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(KycActionResponse)");
    }
}
