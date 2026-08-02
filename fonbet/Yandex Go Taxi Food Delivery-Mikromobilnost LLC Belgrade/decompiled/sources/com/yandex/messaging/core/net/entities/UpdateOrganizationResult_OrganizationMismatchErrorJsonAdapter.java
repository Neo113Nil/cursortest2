package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.UpdateOrganizationResult;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UpdateOrganizationResult_OrganizationMismatchErrorJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/UpdateOrganizationResult$OrganizationMismatchError;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableLongAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UpdateOrganizationResult_OrganizationMismatchErrorJsonAdapter extends JsonAdapter<UpdateOrganizationResult.OrganizationMismatchError> {
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(AuthSdkActivity.RESPONSE_TYPE_CODE, "main_organization");
    private final JsonAdapter<String> stringAdapter;

    public UpdateOrganizationResult_OrganizationMismatchErrorJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, com.google.android.gms.fido.u2f.api.common.ErrorResponseData.JSON_ERROR_CODE);
        this.nullableLongAdapter = moshi.adapter(Long.class, emptySet, "organization");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final UpdateOrganizationResult.OrganizationMismatchError fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Long l = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull(com.google.android.gms.fido.u2f.api.common.ErrorResponseData.JSON_ERROR_CODE, AuthSdkActivity.RESPONSE_TYPE_CODE, jsonReader);
                }
            } else if (selectName == 1) {
                l = this.nullableLongAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new UpdateOrganizationResult.OrganizationMismatchError(str, l);
        }
        throw Util.missingProperty(com.google.android.gms.fido.u2f.api.common.ErrorResponseData.JSON_ERROR_CODE, AuthSdkActivity.RESPONSE_TYPE_CODE, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, UpdateOrganizationResult.OrganizationMismatchError organizationMismatchError) {
        UpdateOrganizationResult.OrganizationMismatchError organizationMismatchError2 = organizationMismatchError;
        if (organizationMismatchError2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(AuthSdkActivity.RESPONSE_TYPE_CODE);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) organizationMismatchError2.getErrorCode());
        jsonWriter.name("main_organization");
        this.nullableLongAdapter.toJson(jsonWriter, (JsonWriter) organizationMismatchError2.getOrganization());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(72, "GeneratedJsonAdapter(UpdateOrganizationResult.OrganizationMismatchError)");
    }
}
