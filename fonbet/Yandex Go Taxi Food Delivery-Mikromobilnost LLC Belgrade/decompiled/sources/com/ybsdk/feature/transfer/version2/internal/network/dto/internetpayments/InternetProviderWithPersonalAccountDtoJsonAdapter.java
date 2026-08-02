package com.ybsdk.feature.transfer.version2.internal.network.dto.internetpayments;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.transfer.version2.internal.network.dto.PaymentProviderDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/internetpayments/InternetProviderWithPersonalAccountDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/internetpayments/InternetProviderWithPersonalAccountDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PaymentProviderDto;", "paymentProviderDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InternetProviderWithPersonalAccountDtoJsonAdapter extends JsonAdapter<InternetProviderWithPersonalAccountDto> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("provider", "personal_account");
    private final JsonAdapter<PaymentProviderDto> paymentProviderDtoAdapter;

    public InternetProviderWithPersonalAccountDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.paymentProviderDtoAdapter = moshi.adapter(PaymentProviderDto.class, emptySet, "provider");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "personalAccount");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final InternetProviderWithPersonalAccountDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PaymentProviderDto paymentProviderDto = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                paymentProviderDto = this.paymentProviderDtoAdapter.fromJson(jsonReader);
                if (paymentProviderDto == null) {
                    throw Util.unexpectedNull("provider", "provider", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (paymentProviderDto != null) {
            return new InternetProviderWithPersonalAccountDto(paymentProviderDto, str);
        }
        throw Util.missingProperty("provider", "provider", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, InternetProviderWithPersonalAccountDto internetProviderWithPersonalAccountDto) {
        InternetProviderWithPersonalAccountDto internetProviderWithPersonalAccountDto2 = internetProviderWithPersonalAccountDto;
        if (internetProviderWithPersonalAccountDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("provider");
        this.paymentProviderDtoAdapter.toJson(jsonWriter, (JsonWriter) internetProviderWithPersonalAccountDto2.getProvider());
        jsonWriter.name("personal_account");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) internetProviderWithPersonalAccountDto2.getPersonalAccount());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(60, "GeneratedJsonAdapter(InternetProviderWithPersonalAccountDto)");
    }
}
