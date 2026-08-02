package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.HmacDto;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/FundTopupInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/FundTopupInfoDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "hmacDtoAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FundTopupInfoDtoJsonAdapter extends JsonAdapter<FundTopupInfoDto> {
    private final JsonAdapter<HmacDto> hmacDtoAdapter;
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("money", "source_agreement_id", "hmac");
    private final JsonAdapter<String> stringAdapter;

    public FundTopupInfoDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "money");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "sourceAgreementId");
        this.hmacDtoAdapter = moshi.adapter(HmacDto.class, emptySet, "hmac");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FundTopupInfoDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Money money = null;
        String str = null;
        HmacDto hmacDto = null;
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
                    throw Util.unexpectedNull("sourceAgreementId", "source_agreement_id", jsonReader);
                }
            } else if (selectName == 2 && (hmacDto = this.hmacDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("hmac", "hmac", jsonReader);
            }
        }
        jsonReader.endObject();
        if (money == null) {
            throw Util.missingProperty("money", "money", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("sourceAgreementId", "source_agreement_id", jsonReader);
        }
        if (hmacDto != null) {
            return new FundTopupInfoDto(money, str, hmacDto);
        }
        throw Util.missingProperty("hmac", "hmac", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FundTopupInfoDto fundTopupInfoDto) {
        FundTopupInfoDto fundTopupInfoDto2 = fundTopupInfoDto;
        if (fundTopupInfoDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("money");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) fundTopupInfoDto2.getMoney());
        jsonWriter.name("source_agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fundTopupInfoDto2.getSourceAgreementId());
        jsonWriter.name("hmac");
        this.hmacDtoAdapter.toJson(jsonWriter, (JsonWriter) fundTopupInfoDto2.getHmac());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(FundTopupInfoDto)");
    }
}
