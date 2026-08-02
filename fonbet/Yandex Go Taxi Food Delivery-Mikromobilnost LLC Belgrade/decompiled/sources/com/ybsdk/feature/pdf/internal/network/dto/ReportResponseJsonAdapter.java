package com.ybsdk.feature.pdf.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/ReportResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pdf/internal/network/dto/ReportResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pdf/internal/network/dto/ReportStatusTypeDto;", "reportStatusTypeDtoAdapter", "Lcom/ybsdk/feature/pdf/internal/network/dto/ReportFilesResponse;", "nullableReportFilesResponseAdapter", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReportResponseJsonAdapter extends JsonAdapter<ReportResponse> {
    private final JsonAdapter<ReportFilesResponse> nullableReportFilesResponseAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "type", ACSPConstants.STATUS, "files");
    private final JsonAdapter<ReportStatusTypeDto> reportStatusTypeDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public ReportResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.reportStatusTypeDtoAdapter = moshi.adapter(ReportStatusTypeDto.class, emptySet, ACSPConstants.STATUS);
        this.nullableReportFilesResponseAdapter = moshi.adapter(ReportFilesResponse.class, emptySet, "files");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ReportResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        ReportStatusTypeDto reportStatusTypeDto = null;
        ReportFilesResponse reportFilesResponse = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("id", "id", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("type", "type", jsonReader);
                }
            } else if (selectName == 2) {
                reportStatusTypeDto = this.reportStatusTypeDtoAdapter.fromJson(jsonReader);
                if (reportStatusTypeDto == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 3) {
                reportFilesResponse = this.nullableReportFilesResponseAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("id", "id", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("type", "type", jsonReader);
        }
        if (reportStatusTypeDto != null) {
            return new ReportResponse(str, str2, reportStatusTypeDto, reportFilesResponse);
        }
        throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ReportResponse reportResponse) {
        ReportResponse reportResponse2 = reportResponse;
        if (reportResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) reportResponse2.getId());
        jsonWriter.name("type");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) reportResponse2.getType());
        jsonWriter.name(ACSPConstants.STATUS);
        this.reportStatusTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) reportResponse2.getStatus());
        jsonWriter.name("files");
        this.nullableReportFilesResponseAdapter.toJson(jsonWriter, (JsonWriter) reportResponse2.getFiles());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(36, "GeneratedJsonAdapter(ReportResponse)");
    }
}
