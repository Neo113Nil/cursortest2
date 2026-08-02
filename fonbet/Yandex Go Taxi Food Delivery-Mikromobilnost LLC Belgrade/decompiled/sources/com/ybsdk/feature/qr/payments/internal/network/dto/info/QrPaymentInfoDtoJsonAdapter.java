package com.ybsdk.feature.qr.payments.internal.network.dto.info;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.transfer.utils.domain.dto.PageHeaderDto;
import com.ybsdk.feature.qr.payments.internal.network.common.AgreementDto;
import com.ybsdk.feature.qr.payments.internal.network.common.MerchantDto;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/QrPaymentInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/QrPaymentInfoDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "nullableMoneyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "Lcom/ybsdk/feature/qr/payments/internal/network/common/MerchantDto;", "merchantDtoAdapter", "", "Lcom/ybsdk/feature/qr/payments/internal/network/common/AgreementDto;", "listOfAgreementDtoAdapter", "stringAdapter", "Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;", "pageHeaderDtoAdapter", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QrPaymentInfoDtoJsonAdapter extends JsonAdapter<QrPaymentInfoDto> {
    private final JsonAdapter<List<AgreementDto>> listOfAgreementDtoAdapter;
    private final JsonAdapter<MerchantDto> merchantDtoAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("money", Constants.KEY_MESSAGE, "merchant", "agreements", "agreements_sheet_title", "header");
    private final JsonAdapter<PageHeaderDto> pageHeaderDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public QrPaymentInfoDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableMoneyAdapter = moshi.adapter(Money.class, emptySet, "money");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, Constants.KEY_MESSAGE);
        this.merchantDtoAdapter = moshi.adapter(MerchantDto.class, emptySet, "merchant");
        this.listOfAgreementDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, AgreementDto.class), emptySet, "agreements");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "agreementsSheetTitle");
        this.pageHeaderDtoAdapter = moshi.adapter(PageHeaderDto.class, emptySet, "header");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final QrPaymentInfoDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Money money = null;
        String str = null;
        MerchantDto merchantDto = null;
        List<AgreementDto> list = null;
        String str2 = null;
        PageHeaderDto pageHeaderDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    money = this.nullableMoneyAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    merchantDto = this.merchantDtoAdapter.fromJson(jsonReader);
                    if (merchantDto == null) {
                        throw Util.unexpectedNull("merchant", "merchant", jsonReader);
                    }
                    break;
                case 3:
                    list = this.listOfAgreementDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("agreements", "agreements", jsonReader);
                    }
                    break;
                case 4:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("agreementsSheetTitle", "agreements_sheet_title", jsonReader);
                    }
                    break;
                case 5:
                    pageHeaderDto = this.pageHeaderDtoAdapter.fromJson(jsonReader);
                    if (pageHeaderDto == null) {
                        throw Util.unexpectedNull("header_", "header", jsonReader);
                    }
                    break;
            }
        }
        jsonReader.endObject();
        if (merchantDto == null) {
            throw Util.missingProperty("merchant", "merchant", jsonReader);
        }
        if (list == null) {
            throw Util.missingProperty("agreements", "agreements", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("agreementsSheetTitle", "agreements_sheet_title", jsonReader);
        }
        if (pageHeaderDto != null) {
            return new QrPaymentInfoDto(money, str, merchantDto, list, str2, pageHeaderDto);
        }
        throw Util.missingProperty("header_", "header", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, QrPaymentInfoDto qrPaymentInfoDto) {
        QrPaymentInfoDto qrPaymentInfoDto2 = qrPaymentInfoDto;
        if (qrPaymentInfoDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("money");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) qrPaymentInfoDto2.getMoney());
        jsonWriter.name(Constants.KEY_MESSAGE);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) qrPaymentInfoDto2.getMessage());
        jsonWriter.name("merchant");
        this.merchantDtoAdapter.toJson(jsonWriter, (JsonWriter) qrPaymentInfoDto2.getMerchant());
        jsonWriter.name("agreements");
        this.listOfAgreementDtoAdapter.toJson(jsonWriter, (JsonWriter) qrPaymentInfoDto2.getAgreements());
        jsonWriter.name("agreements_sheet_title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) qrPaymentInfoDto2.getAgreementsSheetTitle());
        jsonWriter.name("header");
        this.pageHeaderDtoAdapter.toJson(jsonWriter, (JsonWriter) qrPaymentInfoDto2.getHeader());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(QrPaymentInfoDto)");
    }
}
