package com.ybsdk.feature.qr.payments.internal.network.dto.info;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.WidgetDto;
import com.ybsdk.feature.qr.payments.internal.network.common.MerchantDto;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/PaymentInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/PaymentInfoDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "nullableMoneyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "Lcom/ybsdk/feature/qr/payments/internal/network/common/MerchantDto;", "merchantDtoAdapter", "", "Lcom/ybsdk/core/common/data/network/dto/WidgetDto;", "listOfWidgetDtoAdapter", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/HeaderDto;", "headerDtoAdapter", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentInfoDtoJsonAdapter extends JsonAdapter<PaymentInfoDto> {
    private final JsonAdapter<HeaderDto> headerDtoAdapter;
    private final JsonAdapter<List<WidgetDto>> listOfWidgetDtoAdapter;
    private final JsonAdapter<MerchantDto> merchantDtoAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("money", Constants.KEY_MESSAGE, "merchant", "limit_widgets", "header");

    public PaymentInfoDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableMoneyAdapter = moshi.adapter(Money.class, emptySet, "money");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, Constants.KEY_MESSAGE);
        this.merchantDtoAdapter = moshi.adapter(MerchantDto.class, emptySet, "merchant");
        this.listOfWidgetDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, WidgetDto.class), emptySet, "widgets");
        this.headerDtoAdapter = moshi.adapter(HeaderDto.class, emptySet, "header");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PaymentInfoDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Money money = null;
        String str = null;
        MerchantDto merchantDto = null;
        List<WidgetDto> list = null;
        HeaderDto headerDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                money = this.nullableMoneyAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                merchantDto = this.merchantDtoAdapter.fromJson(jsonReader);
                if (merchantDto == null) {
                    throw Util.unexpectedNull("merchant", "merchant", jsonReader);
                }
            } else if (selectName == 3) {
                list = this.listOfWidgetDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("widgets", "limit_widgets", jsonReader);
                }
            } else if (selectName == 4 && (headerDto = this.headerDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("header_", "header", jsonReader);
            }
        }
        jsonReader.endObject();
        if (merchantDto == null) {
            throw Util.missingProperty("merchant", "merchant", jsonReader);
        }
        if (list == null) {
            throw Util.missingProperty("widgets", "limit_widgets", jsonReader);
        }
        if (headerDto != null) {
            return new PaymentInfoDto(money, str, merchantDto, list, headerDto);
        }
        throw Util.missingProperty("header_", "header", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PaymentInfoDto paymentInfoDto) {
        PaymentInfoDto paymentInfoDto2 = paymentInfoDto;
        if (paymentInfoDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("money");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) paymentInfoDto2.getMoney());
        jsonWriter.name(Constants.KEY_MESSAGE);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) paymentInfoDto2.getMessage());
        jsonWriter.name("merchant");
        this.merchantDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentInfoDto2.getMerchant());
        jsonWriter.name("limit_widgets");
        this.listOfWidgetDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentInfoDto2.getWidgets());
        jsonWriter.name("header");
        this.headerDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentInfoDto2.getHeader());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(36, "GeneratedJsonAdapter(PaymentInfoDto)");
    }
}
