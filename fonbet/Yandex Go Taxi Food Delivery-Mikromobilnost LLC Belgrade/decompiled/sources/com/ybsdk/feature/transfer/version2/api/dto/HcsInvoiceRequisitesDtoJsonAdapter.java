package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/HcsInvoiceRequisitesDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/api/dto/HcsInvoiceRequisitesDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HcsInvoiceRequisitesDtoJsonAdapter extends JsonAdapter<HcsInvoiceRequisitesDto> {
    private final JsonReader.Options options = JsonReader.Options.of("invoice_id", "source_invoice_id", "purpose_of_payment", "document_type", "document_number", "recipient_inn", "recipient_id", "recipient_name");
    private final JsonAdapter<String> stringAdapter;

    public HcsInvoiceRequisitesDtoJsonAdapter(Moshi moshi) {
        this.stringAdapter = moshi.adapter(String.class, EmptySet.a, "invoiceId");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final HcsInvoiceRequisitesDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (true) {
            String str9 = str;
            String str10 = str2;
            String str11 = str3;
            String str12 = str4;
            String str13 = str5;
            String str14 = str6;
            String str15 = str7;
            String str16 = str8;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (str9 == null) {
                    throw Util.missingProperty("invoiceId", "invoice_id", jsonReader);
                }
                if (str10 == null) {
                    throw Util.missingProperty("sourceInvoiceId", "source_invoice_id", jsonReader);
                }
                if (str11 == null) {
                    throw Util.missingProperty("purposeOfPayment", "purpose_of_payment", jsonReader);
                }
                if (str12 == null) {
                    throw Util.missingProperty("documentType", "document_type", jsonReader);
                }
                if (str13 == null) {
                    throw Util.missingProperty("documentNumber", "document_number", jsonReader);
                }
                if (str14 == null) {
                    throw Util.missingProperty("recipientInn", "recipient_inn", jsonReader);
                }
                if (str15 == null) {
                    throw Util.missingProperty("recipientId", "recipient_id", jsonReader);
                }
                if (str16 != null) {
                    return new HcsInvoiceRequisitesDto(str9, str10, str11, str12, str13, str14, str15, str16);
                }
                throw Util.missingProperty("recipientName", "recipient_name", jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    str8 = str16;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("invoiceId", "invoice_id", jsonReader);
                    }
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    str8 = str16;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("sourceInvoiceId", "source_invoice_id", jsonReader);
                    }
                    str = str9;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    str8 = str16;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("purposeOfPayment", "purpose_of_payment", jsonReader);
                    }
                    str = str9;
                    str2 = str10;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    str8 = str16;
                case 3:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("documentType", "document_type", jsonReader);
                    }
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    str8 = str16;
                case 4:
                    str5 = this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("documentNumber", "document_number", jsonReader);
                    }
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str6 = str14;
                    str7 = str15;
                    str8 = str16;
                case 5:
                    String fromJson = this.stringAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("recipientInn", "recipient_inn", jsonReader);
                    }
                    str6 = fromJson;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str7 = str15;
                    str8 = str16;
                case 6:
                    String fromJson2 = this.stringAdapter.fromJson(jsonReader);
                    if (fromJson2 == null) {
                        throw Util.unexpectedNull("recipientId", "recipient_id", jsonReader);
                    }
                    str7 = fromJson2;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str8 = str16;
                case 7:
                    str8 = this.stringAdapter.fromJson(jsonReader);
                    if (str8 == null) {
                        throw Util.unexpectedNull("recipientName", "recipient_name", jsonReader);
                    }
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                default:
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                    str7 = str15;
                    str8 = str16;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, HcsInvoiceRequisitesDto hcsInvoiceRequisitesDto) {
        HcsInvoiceRequisitesDto hcsInvoiceRequisitesDto2 = hcsInvoiceRequisitesDto;
        if (hcsInvoiceRequisitesDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("invoice_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) hcsInvoiceRequisitesDto2.getInvoiceId());
        jsonWriter.name("source_invoice_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) hcsInvoiceRequisitesDto2.getSourceInvoiceId());
        jsonWriter.name("purpose_of_payment");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) hcsInvoiceRequisitesDto2.getPurposeOfPayment());
        jsonWriter.name("document_type");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) hcsInvoiceRequisitesDto2.getDocumentType());
        jsonWriter.name("document_number");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) hcsInvoiceRequisitesDto2.getDocumentNumber());
        jsonWriter.name("recipient_inn");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) hcsInvoiceRequisitesDto2.getRecipientInn());
        jsonWriter.name("recipient_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) hcsInvoiceRequisitesDto2.getRecipientId());
        jsonWriter.name("recipient_name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) hcsInvoiceRequisitesDto2.getRecipientName());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(HcsInvoiceRequisitesDto)");
    }
}
