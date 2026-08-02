package com.ybsdk.feature.autotopup.api.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.autotopup.api.dto.AutoTopupWidgetDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto_PayloadJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto$Payload;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupType;", "nullableAutoTopupTypeAdapter", "Lcom/ybsdk/feature/autotopup/api/dto/PaymentMethodInfoDto;", "nullablePaymentMethodInfoDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/Money;", "nullableMoneyAdapter", "feature-autotopup-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupWidgetDto_PayloadJsonAdapter extends JsonAdapter<AutoTopupWidgetDto.Payload> {
    private final JsonAdapter<AutoTopupType> nullableAutoTopupTypeAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<PaymentMethodInfoDto> nullablePaymentMethodInfoDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("autotopup_id", "type", "agreement_id", "payment_method_info", "money", "threshold");

    public AutoTopupWidgetDto_PayloadJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "autoTopupId");
        this.nullableAutoTopupTypeAdapter = moshi.adapter(AutoTopupType.class, emptySet, "type");
        this.nullablePaymentMethodInfoDtoAdapter = moshi.adapter(PaymentMethodInfoDto.class, emptySet, "paymentMethodInfo");
        this.nullableMoneyAdapter = moshi.adapter(Money.class, emptySet, "money");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AutoTopupWidgetDto.Payload fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        AutoTopupType autoTopupType = null;
        String str2 = null;
        PaymentMethodInfoDto paymentMethodInfoDto = null;
        Money money = null;
        Money money2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    autoTopupType = this.nullableAutoTopupTypeAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    paymentMethodInfoDto = this.nullablePaymentMethodInfoDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    money = this.nullableMoneyAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    money2 = this.nullableMoneyAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        return new AutoTopupWidgetDto.Payload(str, autoTopupType, str2, paymentMethodInfoDto, money, money2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AutoTopupWidgetDto.Payload payload) {
        AutoTopupWidgetDto.Payload payload2 = payload;
        if (payload2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("autotopup_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) payload2.getAutoTopupId());
        jsonWriter.name("type");
        this.nullableAutoTopupTypeAdapter.toJson(jsonWriter, (JsonWriter) payload2.getType());
        jsonWriter.name("agreement_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) payload2.getAgreementId());
        jsonWriter.name("payment_method_info");
        this.nullablePaymentMethodInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) payload2.getPaymentMethodInfo());
        jsonWriter.name("money");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) payload2.getMoney());
        jsonWriter.name("threshold");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) payload2.getThreshold());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(AutoTopupWidgetDto.Payload)");
    }
}
