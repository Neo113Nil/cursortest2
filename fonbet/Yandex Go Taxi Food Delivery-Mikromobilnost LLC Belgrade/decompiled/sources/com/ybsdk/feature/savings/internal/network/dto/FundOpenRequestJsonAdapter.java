package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/FundOpenRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/FundOpenRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/savings/internal/network/dto/FundTopupInfoDto;", "nullableFundTopupInfoDtoAdapter", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FundOpenRequestJsonAdapter extends JsonAdapter<FundOpenRequest> {
    private final JsonAdapter<FundTopupInfoDto> nullableFundTopupInfoDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("fund_id", "topup_info");
    private final JsonAdapter<String> stringAdapter;

    public FundOpenRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "fundId");
        this.nullableFundTopupInfoDtoAdapter = moshi.adapter(FundTopupInfoDto.class, emptySet, "topupInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FundOpenRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        FundTopupInfoDto fundTopupInfoDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("fundId", "fund_id", jsonReader);
                }
            } else if (selectName == 1) {
                fundTopupInfoDto = this.nullableFundTopupInfoDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new FundOpenRequest(str, fundTopupInfoDto);
        }
        throw Util.missingProperty("fundId", "fund_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FundOpenRequest fundOpenRequest) {
        FundOpenRequest fundOpenRequest2 = fundOpenRequest;
        if (fundOpenRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("fund_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fundOpenRequest2.getFundId());
        jsonWriter.name("topup_info");
        this.nullableFundTopupInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) fundOpenRequest2.getTopupInfo());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(FundOpenRequest)");
    }
}
