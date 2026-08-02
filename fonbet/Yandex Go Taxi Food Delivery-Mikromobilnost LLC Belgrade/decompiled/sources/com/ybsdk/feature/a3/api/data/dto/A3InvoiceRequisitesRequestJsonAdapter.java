package com.ybsdk.feature.a3.api.data.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.CommunicationsShownInfoDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/a3/api/data/dto/A3InvoiceRequisitesRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/a3/api/data/dto/A3InvoiceRequisitesRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoDto;", "nullableCommunicationsShownInfoDtoAdapter", "nullableStringAdapter", "", "intAdapter", "feature-a3-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class A3InvoiceRequisitesRequestJsonAdapter extends JsonAdapter<A3InvoiceRequisitesRequest> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<CommunicationsShownInfoDto> nullableCommunicationsShownInfoDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("invoice_id", "communications_shown_info", "initial_deeplink", "sessions_count_without_fullscreen");
    private final JsonAdapter<String> stringAdapter;

    public A3InvoiceRequisitesRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "invoiceId");
        this.nullableCommunicationsShownInfoDtoAdapter = moshi.adapter(CommunicationsShownInfoDto.class, emptySet, "communicationShownInfo");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "initialDeeplink");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "sessionsCountWithoutFullscreen");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final A3InvoiceRequisitesRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        CommunicationsShownInfoDto communicationsShownInfoDto = null;
        String str2 = null;
        Integer num = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("invoiceId", "invoice_id", jsonReader);
                }
            } else if (selectName == 1) {
                communicationsShownInfoDto = this.nullableCommunicationsShownInfoDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3 && (num = this.intAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("sessionsCountWithoutFullscreen", "sessions_count_without_fullscreen", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("invoiceId", "invoice_id", jsonReader);
        }
        if (num != null) {
            return new A3InvoiceRequisitesRequest(str, communicationsShownInfoDto, str2, num.intValue());
        }
        throw Util.missingProperty("sessionsCountWithoutFullscreen", "sessions_count_without_fullscreen", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, A3InvoiceRequisitesRequest a3InvoiceRequisitesRequest) {
        A3InvoiceRequisitesRequest a3InvoiceRequisitesRequest2 = a3InvoiceRequisitesRequest;
        if (a3InvoiceRequisitesRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("invoice_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) a3InvoiceRequisitesRequest2.getInvoiceId());
        jsonWriter.name("communications_shown_info");
        this.nullableCommunicationsShownInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) a3InvoiceRequisitesRequest2.getCommunicationShownInfo());
        jsonWriter.name("initial_deeplink");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) a3InvoiceRequisitesRequest2.getInitialDeeplink());
        jsonWriter.name("sessions_count_without_fullscreen");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(a3InvoiceRequisitesRequest2.getSessionsCountWithoutFullscreen()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(A3InvoiceRequisitesRequest)");
    }
}
