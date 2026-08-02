package com.ybsdk.feature.transfer.version2.internal.network.dto.fund;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fund/FundDocsNoticeRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fund/FundDocsNoticeRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FundDocsNoticeRequestJsonAdapter extends JsonAdapter<FundDocsNoticeRequest> {
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("money", "transfer_id", "target_agreement_id", "source_agreement_id");
    private final JsonAdapter<String> stringAdapter;

    public FundDocsNoticeRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "money");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "transferId");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FundDocsNoticeRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Money money = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                money = this.moneyAdapter.fromJson(jsonReader);
                if (money == null) {
                    throw Util.unexpectedNull("money", "money", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("transferId", "transfer_id", jsonReader);
                }
            } else if (selectName == 2) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("targetAgreementId", "target_agreement_id", jsonReader);
                }
            } else if (selectName == 3 && (str3 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("sourceAgreementId", "source_agreement_id", jsonReader);
            }
        }
        jsonReader.endObject();
        if (money == null) {
            throw Util.missingProperty("money", "money", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("transferId", "transfer_id", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("targetAgreementId", "target_agreement_id", jsonReader);
        }
        if (str3 != null) {
            return new FundDocsNoticeRequest(money, str, str2, str3);
        }
        throw Util.missingProperty("sourceAgreementId", "source_agreement_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FundDocsNoticeRequest fundDocsNoticeRequest) {
        FundDocsNoticeRequest fundDocsNoticeRequest2 = fundDocsNoticeRequest;
        if (fundDocsNoticeRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("money");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) fundDocsNoticeRequest2.getMoney());
        jsonWriter.name("transfer_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fundDocsNoticeRequest2.getTransferId());
        jsonWriter.name("target_agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fundDocsNoticeRequest2.getTargetAgreementId());
        jsonWriter.name("source_agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fundDocsNoticeRequest2.getSourceAgreementId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(FundDocsNoticeRequest)");
    }
}
