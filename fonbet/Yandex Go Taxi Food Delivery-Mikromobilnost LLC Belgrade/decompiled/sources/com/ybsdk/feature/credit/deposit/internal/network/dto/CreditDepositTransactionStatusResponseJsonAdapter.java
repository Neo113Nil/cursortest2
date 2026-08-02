package com.ybsdk.feature.credit.deposit.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.credit.deposit.internal.network.dto.CreditDepositTransactionStatusResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditDepositTransactionStatusResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditDepositTransactionStatusResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditDepositTransactionStatusResponse$Status;", "statusAdapter", "nullableStringAdapter", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreditDepositTransactionStatusResponseJsonAdapter extends JsonAdapter<CreditDepositTransactionStatusResponse> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("transaction_id", "agreement_id", ACSPConstants.STATUS, "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "url_3ds", "button_text", "button_action", "secondary_button_text", "secondary_button_action", "close_action");
    private final JsonAdapter<CreditDepositTransactionStatusResponse.Status> statusAdapter;
    private final JsonAdapter<String> stringAdapter;

    public CreditDepositTransactionStatusResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "transactionId");
        this.statusAdapter = moshi.adapter(CreditDepositTransactionStatusResponse.Status.class, emptySet, ACSPConstants.STATUS);
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CreditDepositTransactionStatusResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        CreditDepositTransactionStatusResponse.Status status = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        while (true) {
            String str11 = str;
            String str12 = str2;
            CreditDepositTransactionStatusResponse.Status status2 = status;
            if (!jsonReader.hasNext()) {
                String str13 = str3;
                jsonReader.endObject();
                if (str11 == null) {
                    throw Util.missingProperty("transactionId", "transaction_id", jsonReader);
                }
                if (str12 == null) {
                    throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
                }
                if (status2 == null) {
                    throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
                if (str13 != null) {
                    return new CreditDepositTransactionStatusResponse(str11, str12, status2, str13, str4, str5, str6, str7, str8, str9, str10);
                }
                throw Util.missingProperty("title", "title", jsonReader);
            }
            String str14 = str3;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                    status = status2;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("transactionId", "transaction_id", jsonReader);
                    }
                    str3 = str14;
                    str2 = str12;
                    status = status2;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("agreementId", "agreement_id", jsonReader);
                    }
                    str3 = str14;
                    str = str11;
                    status = status2;
                case 2:
                    status = this.statusAdapter.fromJson(jsonReader);
                    if (status == null) {
                        throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                    }
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                case 3:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    str = str11;
                    str2 = str12;
                    status = status2;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                    status = status2;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                    status = status2;
                case 6:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                    status = status2;
                case 7:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                    status = status2;
                case 8:
                    str8 = this.nullableStringAdapter.fromJson(jsonReader);
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                    status = status2;
                case 9:
                    str9 = this.nullableStringAdapter.fromJson(jsonReader);
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                    status = status2;
                case 10:
                    str10 = this.nullableStringAdapter.fromJson(jsonReader);
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                    status = status2;
                default:
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                    status = status2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CreditDepositTransactionStatusResponse creditDepositTransactionStatusResponse) {
        CreditDepositTransactionStatusResponse creditDepositTransactionStatusResponse2 = creditDepositTransactionStatusResponse;
        if (creditDepositTransactionStatusResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("transaction_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositTransactionStatusResponse2.getTransactionId());
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositTransactionStatusResponse2.getAgreementId());
        jsonWriter.name(ACSPConstants.STATUS);
        this.statusAdapter.toJson(jsonWriter, (JsonWriter) creditDepositTransactionStatusResponse2.getStatus());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositTransactionStatusResponse2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositTransactionStatusResponse2.getDescription());
        jsonWriter.name("url_3ds");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositTransactionStatusResponse2.getUrl3ds());
        jsonWriter.name("button_text");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositTransactionStatusResponse2.getButtonText());
        jsonWriter.name("button_action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositTransactionStatusResponse2.getButtonAction());
        jsonWriter.name("secondary_button_text");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositTransactionStatusResponse2.getSecondaryButtonText());
        jsonWriter.name("secondary_button_action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositTransactionStatusResponse2.getSecondaryButtonAction());
        jsonWriter.name("close_action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositTransactionStatusResponse2.getCloseAction());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(60, "GeneratedJsonAdapter(CreditDepositTransactionStatusResponse)");
    }
}
