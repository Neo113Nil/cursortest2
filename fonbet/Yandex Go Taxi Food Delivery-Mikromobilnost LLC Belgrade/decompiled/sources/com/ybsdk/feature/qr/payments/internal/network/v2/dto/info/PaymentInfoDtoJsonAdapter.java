package com.ybsdk.feature.qr.payments.internal.network.v2.dto.info;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.qr.payments.internal.network.common.MerchantDto;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.common.PageImageHeaderDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/PaymentInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/PaymentInfoDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/common/PageImageHeaderDto;", "pageImageHeaderDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/payments/internal/network/common/MerchantDto;", "merchantDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "", "nullableStringAdapter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "divDataDtoAdapter", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/ScreenButtonsDto;", "screenButtonsDtoAdapter", "", "booleanAdapter", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentInfoDtoJsonAdapter extends JsonAdapter<PaymentInfoDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<DivDataDto> divDataDtoAdapter;
    private final JsonAdapter<MerchantDto> merchantDtoAdapter;
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("header", "merchant", "amount", "purpose", "agreements_data", "buttons", "is_amount_editable");
    private final JsonAdapter<PageImageHeaderDto> pageImageHeaderDtoAdapter;
    private final JsonAdapter<ScreenButtonsDto> screenButtonsDtoAdapter;

    public PaymentInfoDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.pageImageHeaderDtoAdapter = moshi.adapter(PageImageHeaderDto.class, emptySet, "header");
        this.merchantDtoAdapter = moshi.adapter(MerchantDto.class, emptySet, "merchant");
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "amount");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "purpose");
        this.divDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "agreementsData");
        this.screenButtonsDtoAdapter = moshi.adapter(ScreenButtonsDto.class, emptySet, "buttons");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isAmountEditable");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PaymentInfoDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        PageImageHeaderDto pageImageHeaderDto = null;
        MerchantDto merchantDto = null;
        Money money = null;
        String str = null;
        DivDataDto divDataDto = null;
        ScreenButtonsDto screenButtonsDto = null;
        while (true) {
            Boolean bool2 = bool;
            PageImageHeaderDto pageImageHeaderDto2 = pageImageHeaderDto;
            if (!jsonReader.hasNext()) {
                MerchantDto merchantDto2 = merchantDto;
                jsonReader.endObject();
                if (pageImageHeaderDto2 == null) {
                    throw Util.missingProperty("header_", "header", jsonReader);
                }
                if (merchantDto2 == null) {
                    throw Util.missingProperty("merchant", "merchant", jsonReader);
                }
                if (money == null) {
                    throw Util.missingProperty("amount", "amount", jsonReader);
                }
                if (divDataDto == null) {
                    throw Util.missingProperty("agreementsData", "agreements_data", jsonReader);
                }
                if (screenButtonsDto == null) {
                    throw Util.missingProperty("buttons", "buttons", jsonReader);
                }
                if (bool2 != null) {
                    return new PaymentInfoDto(pageImageHeaderDto2, merchantDto2, money, str, divDataDto, screenButtonsDto, bool2.booleanValue());
                }
                throw Util.missingProperty("isAmountEditable", "is_amount_editable", jsonReader);
            }
            MerchantDto merchantDto3 = merchantDto;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    bool = bool2;
                    merchantDto = merchantDto3;
                    pageImageHeaderDto = pageImageHeaderDto2;
                case 0:
                    pageImageHeaderDto = this.pageImageHeaderDtoAdapter.fromJson(jsonReader);
                    if (pageImageHeaderDto == null) {
                        throw Util.unexpectedNull("header_", "header", jsonReader);
                    }
                    bool = bool2;
                    merchantDto = merchantDto3;
                case 1:
                    merchantDto = this.merchantDtoAdapter.fromJson(jsonReader);
                    if (merchantDto == null) {
                        throw Util.unexpectedNull("merchant", "merchant", jsonReader);
                    }
                    bool = bool2;
                    pageImageHeaderDto = pageImageHeaderDto2;
                case 2:
                    money = this.moneyAdapter.fromJson(jsonReader);
                    if (money == null) {
                        throw Util.unexpectedNull("amount", "amount", jsonReader);
                    }
                    bool = bool2;
                    merchantDto = merchantDto3;
                    pageImageHeaderDto = pageImageHeaderDto2;
                case 3:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool2;
                    merchantDto = merchantDto3;
                    pageImageHeaderDto = pageImageHeaderDto2;
                case 4:
                    divDataDto = this.divDataDtoAdapter.fromJson(jsonReader);
                    if (divDataDto == null) {
                        throw Util.unexpectedNull("agreementsData", "agreements_data", jsonReader);
                    }
                    bool = bool2;
                    merchantDto = merchantDto3;
                    pageImageHeaderDto = pageImageHeaderDto2;
                case 5:
                    screenButtonsDto = this.screenButtonsDtoAdapter.fromJson(jsonReader);
                    if (screenButtonsDto == null) {
                        throw Util.unexpectedNull("buttons", "buttons", jsonReader);
                    }
                    bool = bool2;
                    merchantDto = merchantDto3;
                    pageImageHeaderDto = pageImageHeaderDto2;
                case 6:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("isAmountEditable", "is_amount_editable", jsonReader);
                    }
                    merchantDto = merchantDto3;
                    pageImageHeaderDto = pageImageHeaderDto2;
                default:
                    bool = bool2;
                    merchantDto = merchantDto3;
                    pageImageHeaderDto = pageImageHeaderDto2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PaymentInfoDto paymentInfoDto) {
        PaymentInfoDto paymentInfoDto2 = paymentInfoDto;
        if (paymentInfoDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("header");
        this.pageImageHeaderDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentInfoDto2.getHeader());
        jsonWriter.name("merchant");
        this.merchantDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentInfoDto2.getMerchant());
        jsonWriter.name("amount");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) paymentInfoDto2.getAmount());
        jsonWriter.name("purpose");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) paymentInfoDto2.getPurpose());
        jsonWriter.name("agreements_data");
        this.divDataDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentInfoDto2.getAgreementsData());
        jsonWriter.name("buttons");
        this.screenButtonsDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentInfoDto2.getButtons());
        jsonWriter.name("is_amount_editable");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(paymentInfoDto2.isAmountEditable()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(36, "GeneratedJsonAdapter(PaymentInfoDto)");
    }
}
