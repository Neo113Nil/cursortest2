package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.UpdateOrganizationResult;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UpdateOrganizationResult_UserErrorJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/UpdateOrganizationResult$UserError;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "", "Lcom/yandex/messaging/core/net/entities/OutOrganizationUser;", "arrayOfOutOrganizationUserAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UpdateOrganizationResult_UserErrorJsonAdapter extends JsonAdapter<UpdateOrganizationResult.UserError> {
    private final JsonAdapter<OutOrganizationUser[]> arrayOfOutOrganizationUserAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(AuthSdkActivity.RESPONSE_TYPE_CODE, "user_count", CSPDirectoryConstants.SUBDIRECTORY_USERS);
    private final JsonAdapter<String> stringAdapter;

    public UpdateOrganizationResult_UserErrorJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, com.google.android.gms.fido.u2f.api.common.ErrorResponseData.JSON_ERROR_CODE);
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "userCount");
        this.arrayOfOutOrganizationUserAdapter = moshi.adapter(Types.arrayOf(OutOrganizationUser.class), emptySet, CSPDirectoryConstants.SUBDIRECTORY_USERS);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final UpdateOrganizationResult.UserError fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Integer num = null;
        OutOrganizationUser[] outOrganizationUserArr = null;
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
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("userCount", "user_count", jsonReader);
                }
            } else if (selectName == 2 && (outOrganizationUserArr = this.arrayOfOutOrganizationUserAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull(CSPDirectoryConstants.SUBDIRECTORY_USERS, CSPDirectoryConstants.SUBDIRECTORY_USERS, jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty(com.google.android.gms.fido.u2f.api.common.ErrorResponseData.JSON_ERROR_CODE, AuthSdkActivity.RESPONSE_TYPE_CODE, jsonReader);
        }
        if (num == null) {
            throw Util.missingProperty("userCount", "user_count", jsonReader);
        }
        int intValue = num.intValue();
        if (outOrganizationUserArr != null) {
            return new UpdateOrganizationResult.UserError(str, intValue, outOrganizationUserArr);
        }
        throw Util.missingProperty(CSPDirectoryConstants.SUBDIRECTORY_USERS, CSPDirectoryConstants.SUBDIRECTORY_USERS, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, UpdateOrganizationResult.UserError userError) {
        UpdateOrganizationResult.UserError userError2 = userError;
        if (userError2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(AuthSdkActivity.RESPONSE_TYPE_CODE);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) userError2.getErrorCode());
        jsonWriter.name("user_count");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(userError2.getUserCount()));
        jsonWriter.name(CSPDirectoryConstants.SUBDIRECTORY_USERS);
        this.arrayOfOutOrganizationUserAdapter.toJson(jsonWriter, (JsonWriter) userError2.getUsers());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(56, "GeneratedJsonAdapter(UpdateOrganizationResult.UserError)");
    }
}
