package com.ybsdk.feature.transfer.version2.internal.network.dto;

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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/B2cTransferRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/B2cTransferRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/B2cTransferReceiver;", "b2cTransferReceiverAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class B2cTransferRequestJsonAdapter extends JsonAdapter<B2cTransferRequest> {
    private final JsonAdapter<B2cTransferReceiver> b2cTransferReceiverAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("agreement_id", "version", "amount", "repayment_plan_token", "receiver");
    private final JsonAdapter<String> stringAdapter;

    public B2cTransferRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "version");
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "amount");
        this.b2cTransferReceiverAdapter = moshi.adapter(B2cTransferReceiver.class, emptySet, "receiver");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final B2cTransferRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        String str = null;
        Money money = null;
        String str2 = null;
        B2cTransferReceiver b2cTransferReceiver = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            Integer num2 = num;
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("agreementId", "agreement_id", jsonReader);
                }
            } else if (selectName == 1) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("version", "version", jsonReader);
                }
            } else if (selectName == 2) {
                money = this.moneyAdapter.fromJson(jsonReader);
                if (money == null) {
                    throw Util.unexpectedNull("amount", "amount", jsonReader);
                }
            } else if (selectName == 3) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("repaymentPlanToken", "repayment_plan_token", jsonReader);
                }
            } else if (selectName == 4 && (b2cTransferReceiver = this.b2cTransferReceiverAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("receiver_", "receiver", jsonReader);
            }
            num = num2;
        }
        Integer num3 = num;
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
        }
        if (num3 == null) {
            throw Util.missingProperty("version", "version", jsonReader);
        }
        int intValue = num3.intValue();
        if (money == null) {
            throw Util.missingProperty("amount", "amount", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("repaymentPlanToken", "repayment_plan_token", jsonReader);
        }
        if (b2cTransferReceiver != null) {
            return new B2cTransferRequest(str, intValue, money, str2, b2cTransferReceiver);
        }
        throw Util.missingProperty("receiver_", "receiver", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, B2cTransferRequest b2cTransferRequest) {
        B2cTransferRequest b2cTransferRequest2 = b2cTransferRequest;
        if (b2cTransferRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) b2cTransferRequest2.getAgreementId());
        jsonWriter.name("version");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(b2cTransferRequest2.getVersion()));
        jsonWriter.name("amount");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) b2cTransferRequest2.getAmount());
        jsonWriter.name("repayment_plan_token");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) b2cTransferRequest2.getRepaymentPlanToken());
        jsonWriter.name("receiver");
        this.b2cTransferReceiverAdapter.toJson(jsonWriter, (JsonWriter) b2cTransferRequest2.getReceiver());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(B2cTransferRequest)");
    }
}
