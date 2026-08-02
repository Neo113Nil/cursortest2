package com.ybsdk.network.dto.simplifiedid;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.network.dto.simplifiedid.SimplifiedIdApplicationResponse;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR$\u0010\u0011\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdApplicationResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdApplicationResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdApplicationResponse$ApplicationStatus;", "applicationStatusAdapter", "", "Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdApplicationResponse$SecondDocument;", "nullableListOfNullableSecondDocumentAdapter", "nullableStringAdapter", "Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdApplicationForm;", "nullableSimplifiedIdApplicationFormAdapter", "Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdWidget;", "nullableListOfSimplifiedIdWidgetAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SimplifiedIdApplicationResponseJsonAdapter extends JsonAdapter<SimplifiedIdApplicationResponse> {
    private final JsonAdapter<SimplifiedIdApplicationResponse.ApplicationStatus> applicationStatusAdapter;
    private final JsonAdapter<List<SimplifiedIdApplicationResponse.SecondDocument>> nullableListOfNullableSecondDocumentAdapter;
    private final JsonAdapter<List<SimplifiedIdWidget>> nullableListOfSimplifiedIdWidgetAdapter;
    private final JsonAdapter<SimplifiedIdApplicationForm> nullableSimplifiedIdApplicationFormAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("application_id", ACSPConstants.STATUS, "second_documents", "agreement", "form", "widgets");
    private final JsonAdapter<String> stringAdapter;

    public SimplifiedIdApplicationResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "applicationId");
        this.applicationStatusAdapter = moshi.adapter(SimplifiedIdApplicationResponse.ApplicationStatus.class, emptySet, ACSPConstants.STATUS);
        this.nullableListOfNullableSecondDocumentAdapter = moshi.adapter(Types.newParameterizedType(List.class, SimplifiedIdApplicationResponse.SecondDocument.class), emptySet, "secondDocuments");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "agreement");
        this.nullableSimplifiedIdApplicationFormAdapter = moshi.adapter(SimplifiedIdApplicationForm.class, emptySet, "form");
        this.nullableListOfSimplifiedIdWidgetAdapter = moshi.adapter(Types.newParameterizedType(List.class, SimplifiedIdWidget.class), emptySet, "widgets");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SimplifiedIdApplicationResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        SimplifiedIdApplicationResponse.ApplicationStatus applicationStatus = null;
        List<SimplifiedIdApplicationResponse.SecondDocument> list = null;
        String str2 = null;
        SimplifiedIdApplicationForm simplifiedIdApplicationForm = null;
        List<SimplifiedIdWidget> list2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("applicationId", "application_id", jsonReader);
                    }
                    break;
                case 1:
                    applicationStatus = this.applicationStatusAdapter.fromJson(jsonReader);
                    if (applicationStatus == null) {
                        throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                    }
                    break;
                case 2:
                    list = this.nullableListOfNullableSecondDocumentAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    simplifiedIdApplicationForm = this.nullableSimplifiedIdApplicationFormAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    list2 = this.nullableListOfSimplifiedIdWidgetAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("applicationId", "application_id", jsonReader);
        }
        if (applicationStatus != null) {
            return new SimplifiedIdApplicationResponse(str, applicationStatus, list, str2, simplifiedIdApplicationForm, list2);
        }
        throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SimplifiedIdApplicationResponse simplifiedIdApplicationResponse) {
        SimplifiedIdApplicationResponse simplifiedIdApplicationResponse2 = simplifiedIdApplicationResponse;
        if (simplifiedIdApplicationResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("application_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) simplifiedIdApplicationResponse2.getApplicationId());
        jsonWriter.name(ACSPConstants.STATUS);
        this.applicationStatusAdapter.toJson(jsonWriter, (JsonWriter) simplifiedIdApplicationResponse2.getStatus());
        jsonWriter.name("second_documents");
        this.nullableListOfNullableSecondDocumentAdapter.toJson(jsonWriter, (JsonWriter) simplifiedIdApplicationResponse2.getSecondDocuments());
        jsonWriter.name("agreement");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) simplifiedIdApplicationResponse2.getAgreement());
        jsonWriter.name("form");
        this.nullableSimplifiedIdApplicationFormAdapter.toJson(jsonWriter, (JsonWriter) simplifiedIdApplicationResponse2.getForm());
        jsonWriter.name("widgets");
        this.nullableListOfSimplifiedIdWidgetAdapter.toJson(jsonWriter, (JsonWriter) simplifiedIdApplicationResponse2.getWidgets());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(53, "GeneratedJsonAdapter(SimplifiedIdApplicationResponse)");
    }
}
