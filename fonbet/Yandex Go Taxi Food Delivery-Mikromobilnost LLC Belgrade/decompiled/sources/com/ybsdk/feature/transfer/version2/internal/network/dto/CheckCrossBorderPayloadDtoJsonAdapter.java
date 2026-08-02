package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckCrossBorderPayloadDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckCrossBorderPayloadDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "nullableMoneyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckCrossBorderCurrencyRateDto;", "nullableCheckCrossBorderCurrencyRateDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckCrossBorderReceiverDto;", "nullableCheckCrossBorderReceiverDtoAdapter", "", "nullableStringAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckCrossBorderPayloadDtoJsonAdapter extends JsonAdapter<CheckCrossBorderPayloadDto> {
    private final JsonAdapter<CheckCrossBorderCurrencyRateDto> nullableCheckCrossBorderCurrencyRateDtoAdapter;
    private final JsonAdapter<CheckCrossBorderReceiverDto> nullableCheckCrossBorderReceiverDtoAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("credit_money", "currency_rate", "receiver", "priority_money_type");

    public CheckCrossBorderPayloadDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableMoneyAdapter = moshi.adapter(Money.class, emptySet, "creditMoney");
        this.nullableCheckCrossBorderCurrencyRateDtoAdapter = moshi.adapter(CheckCrossBorderCurrencyRateDto.class, emptySet, "currencyRate");
        this.nullableCheckCrossBorderReceiverDtoAdapter = moshi.adapter(CheckCrossBorderReceiverDto.class, emptySet, "receiver");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "priorityMoneyType");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CheckCrossBorderPayloadDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Money money = null;
        CheckCrossBorderCurrencyRateDto checkCrossBorderCurrencyRateDto = null;
        CheckCrossBorderReceiverDto checkCrossBorderReceiverDto = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                money = this.nullableMoneyAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                checkCrossBorderCurrencyRateDto = this.nullableCheckCrossBorderCurrencyRateDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                checkCrossBorderReceiverDto = this.nullableCheckCrossBorderReceiverDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new CheckCrossBorderPayloadDto(money, checkCrossBorderCurrencyRateDto, checkCrossBorderReceiverDto, str);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CheckCrossBorderPayloadDto checkCrossBorderPayloadDto) {
        CheckCrossBorderPayloadDto checkCrossBorderPayloadDto2 = checkCrossBorderPayloadDto;
        if (checkCrossBorderPayloadDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("credit_money");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) checkCrossBorderPayloadDto2.getCreditMoney());
        jsonWriter.name("currency_rate");
        this.nullableCheckCrossBorderCurrencyRateDtoAdapter.toJson(jsonWriter, (JsonWriter) checkCrossBorderPayloadDto2.getCurrencyRate());
        jsonWriter.name("receiver");
        this.nullableCheckCrossBorderReceiverDtoAdapter.toJson(jsonWriter, (JsonWriter) checkCrossBorderPayloadDto2.getReceiver());
        jsonWriter.name("priority_money_type");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) checkCrossBorderPayloadDto2.getPriorityMoneyType());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(CheckCrossBorderPayloadDto)");
    }
}
