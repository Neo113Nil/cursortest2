package com.ybsdk.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.network.dto.ApplicationResponse;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR(\u0010\u0011\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/network/dto/ApplicationResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/ApplicationResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/ApplicationResponse$ApplicationStatus;", "applicationStatusAdapter", "", "", "nullableMapOfStringAnyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApplicationResponseJsonAdapter extends JsonAdapter<ApplicationResponse> {
    private final JsonAdapter<ApplicationResponse.ApplicationStatus> applicationStatusAdapter;
    private volatile Constructor<ApplicationResponse> constructorRef;
    private final JsonAdapter<Map<String, Object>> nullableMapOfStringAnyAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("application_id", ACSPConstants.STATUS, "agreement", "form");
    private final JsonAdapter<String> stringAdapter;

    public ApplicationResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "applicationId");
        this.applicationStatusAdapter = moshi.adapter(ApplicationResponse.ApplicationStatus.class, emptySet, ACSPConstants.STATUS);
        this.nullableMapOfStringAnyAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Object.class), emptySet, "form");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ApplicationResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        ApplicationResponse.ApplicationStatus applicationStatus = null;
        String str2 = null;
        Map<String, Object> map = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("applicationId", "application_id", jsonReader);
                }
            } else if (selectName == 1) {
                applicationStatus = this.applicationStatusAdapter.fromJson(jsonReader);
                if (applicationStatus == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 2) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("agreement", "agreement", jsonReader);
                }
                i = -5;
            } else if (selectName == 3) {
                map = this.nullableMapOfStringAnyAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -5) {
            if (str == null) {
                throw Util.missingProperty("applicationId", "application_id", jsonReader);
            }
            if (applicationStatus != null) {
                return new ApplicationResponse(str, applicationStatus, str2, map);
            }
            throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
        }
        Constructor<ApplicationResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ApplicationResponse.class.getDeclaredConstructor(String.class, ApplicationResponse.ApplicationStatus.class, String.class, Map.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str == null) {
            throw Util.missingProperty("applicationId", "application_id", jsonReader);
        }
        if (applicationStatus != null) {
            return constructor.newInstance(str, applicationStatus, str2, map, Integer.valueOf(i), null);
        }
        throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ApplicationResponse applicationResponse) {
        ApplicationResponse applicationResponse2 = applicationResponse;
        if (applicationResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("application_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) applicationResponse2.getApplicationId());
        jsonWriter.name(ACSPConstants.STATUS);
        this.applicationStatusAdapter.toJson(jsonWriter, (JsonWriter) applicationResponse2.getStatus());
        jsonWriter.name("agreement");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) applicationResponse2.getAgreement());
        jsonWriter.name("form");
        this.nullableMapOfStringAnyAdapter.toJson(jsonWriter, (JsonWriter) applicationResponse2.getForm());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(ApplicationResponse)");
    }
}
