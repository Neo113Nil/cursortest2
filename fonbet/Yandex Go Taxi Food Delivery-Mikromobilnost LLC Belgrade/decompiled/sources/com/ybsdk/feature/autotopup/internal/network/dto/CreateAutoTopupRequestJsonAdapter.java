package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.autotopup.api.dto.AutoTopupType;
import com.ybsdk.feature.autotopup.api.dto.PaymentMethodInfoDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/CreateAutoTopupRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/CreateAutoTopupRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupType;", "autoTopupTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Lcom/ybsdk/feature/autotopup/api/dto/PaymentMethodInfoDto;", "paymentMethodInfoDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/Money;", "nullableMoneyAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreateAutoTopupRequestJsonAdapter extends JsonAdapter<CreateAutoTopupRequest> {
    private final JsonAdapter<AutoTopupType> autoTopupTypeAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("type", "agreement_id", "payment_method_info", "money", "threshold");
    private final JsonAdapter<PaymentMethodInfoDto> paymentMethodInfoDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public CreateAutoTopupRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.autoTopupTypeAdapter = moshi.adapter(AutoTopupType.class, emptySet, "type");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
        this.paymentMethodInfoDtoAdapter = moshi.adapter(PaymentMethodInfoDto.class, emptySet, "paymentMethodInfo");
        this.nullableMoneyAdapter = moshi.adapter(Money.class, emptySet, "money");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CreateAutoTopupRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        AutoTopupType autoTopupType = null;
        String str = null;
        PaymentMethodInfoDto paymentMethodInfoDto = null;
        Money money = null;
        Money money2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                autoTopupType = this.autoTopupTypeAdapter.fromJson(jsonReader);
                if (autoTopupType == null) {
                    throw Util.unexpectedNull("type", "type", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("agreementId", "agreement_id", jsonReader);
                }
            } else if (selectName == 2) {
                paymentMethodInfoDto = this.paymentMethodInfoDtoAdapter.fromJson(jsonReader);
                if (paymentMethodInfoDto == null) {
                    throw Util.unexpectedNull("paymentMethodInfo", "payment_method_info", jsonReader);
                }
            } else if (selectName == 3) {
                money = this.nullableMoneyAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                money2 = this.nullableMoneyAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (autoTopupType == null) {
            throw Util.missingProperty("type", "type", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
        }
        if (paymentMethodInfoDto != null) {
            return new CreateAutoTopupRequest(autoTopupType, str, paymentMethodInfoDto, money, money2);
        }
        throw Util.missingProperty("paymentMethodInfo", "payment_method_info", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CreateAutoTopupRequest createAutoTopupRequest) {
        CreateAutoTopupRequest createAutoTopupRequest2 = createAutoTopupRequest;
        if (createAutoTopupRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.autoTopupTypeAdapter.toJson(jsonWriter, (JsonWriter) createAutoTopupRequest2.getType());
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) createAutoTopupRequest2.getAgreementId());
        jsonWriter.name("payment_method_info");
        this.paymentMethodInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) createAutoTopupRequest2.getPaymentMethodInfo());
        jsonWriter.name("money");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) createAutoTopupRequest2.getMoney());
        jsonWriter.name("threshold");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) createAutoTopupRequest2.getThreshold());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(CreateAutoTopupRequest)");
    }
}
