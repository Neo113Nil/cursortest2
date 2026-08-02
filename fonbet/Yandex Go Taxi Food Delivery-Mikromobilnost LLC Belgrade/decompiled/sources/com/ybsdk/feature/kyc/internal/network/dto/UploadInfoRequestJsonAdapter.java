package com.ybsdk.feature.kyc.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/network/dto/UploadInfoRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/kyc/internal/network/dto/UploadInfoRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UploadInfoRequestJsonAdapter extends JsonAdapter<UploadInfoRequest> {
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("application_id", "application_type", "document_type", "file_format", "file_name", "content_length");
    private final JsonAdapter<String> stringAdapter;

    public UploadInfoRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "applicationId");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "contentLength");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final UploadInfoRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Long l = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (true) {
            Long l2 = l;
            String str6 = str;
            String str7 = str2;
            String str8 = str3;
            if (!jsonReader.hasNext()) {
                String str9 = str4;
                jsonReader.endObject();
                if (str6 == null) {
                    throw Util.missingProperty("applicationId", "application_id", jsonReader);
                }
                if (str7 == null) {
                    throw Util.missingProperty("applicationType", "application_type", jsonReader);
                }
                if (str8 == null) {
                    throw Util.missingProperty("documentType", "document_type", jsonReader);
                }
                if (str9 == null) {
                    throw Util.missingProperty("fileFormat", "file_format", jsonReader);
                }
                if (str5 == null) {
                    throw Util.missingProperty("fileName", "file_name", jsonReader);
                }
                if (l2 != null) {
                    return new UploadInfoRequest(str6, str7, str8, str9, str5, l2.longValue());
                }
                throw Util.missingProperty("contentLength", "content_length", jsonReader);
            }
            String str10 = str4;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    l = l2;
                    str4 = str10;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("applicationId", "application_id", jsonReader);
                    }
                    l = l2;
                    str4 = str10;
                    str2 = str7;
                    str3 = str8;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("applicationType", "application_type", jsonReader);
                    }
                    l = l2;
                    str4 = str10;
                    str = str6;
                    str3 = str8;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("documentType", "document_type", jsonReader);
                    }
                    l = l2;
                    str4 = str10;
                    str = str6;
                    str2 = str7;
                case 3:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("fileFormat", "file_format", jsonReader);
                    }
                    l = l2;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                case 4:
                    str5 = this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("fileName", "file_name", jsonReader);
                    }
                    l = l2;
                    str4 = str10;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                case 5:
                    l = this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        throw Util.unexpectedNull("contentLength", "content_length", jsonReader);
                    }
                    str4 = str10;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                default:
                    l = l2;
                    str4 = str10;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, UploadInfoRequest uploadInfoRequest) {
        UploadInfoRequest uploadInfoRequest2 = uploadInfoRequest;
        if (uploadInfoRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("application_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) uploadInfoRequest2.getApplicationId());
        jsonWriter.name("application_type");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) uploadInfoRequest2.getApplicationType());
        jsonWriter.name("document_type");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) uploadInfoRequest2.getDocumentType());
        jsonWriter.name("file_format");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) uploadInfoRequest2.getFileFormat());
        jsonWriter.name("file_name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) uploadInfoRequest2.getFileName());
        jsonWriter.name("content_length");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(uploadInfoRequest2.getContentLength()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(UploadInfoRequest)");
    }
}
