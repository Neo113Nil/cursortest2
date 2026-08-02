package com.ybsdk.feature.transfer.version2.internal.network.dto.mobilepayments;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.transfer.utils.domain.dto.PageHeaderDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.PaymentProviderDto;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/mobilepayments/GetAllMobileProvidersResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/mobilepayments/GetAllMobileProvidersResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PaymentProviderDto;", "nullablePaymentProviderDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "listOfPaymentProviderDtoAdapter", "Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;", "pageHeaderDtoAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetAllMobileProvidersResponseJsonAdapter extends JsonAdapter<GetAllMobileProvidersResponse> {
    private final JsonAdapter<List<PaymentProviderDto>> listOfPaymentProviderDtoAdapter;
    private final JsonAdapter<PaymentProviderDto> nullablePaymentProviderDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("suggested_provider", "providers", "header");
    private final JsonAdapter<PageHeaderDto> pageHeaderDtoAdapter;

    public GetAllMobileProvidersResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullablePaymentProviderDtoAdapter = moshi.adapter(PaymentProviderDto.class, emptySet, "suggestedProvider");
        this.listOfPaymentProviderDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, PaymentProviderDto.class), emptySet, "providers");
        this.pageHeaderDtoAdapter = moshi.adapter(PageHeaderDto.class, emptySet, "header");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetAllMobileProvidersResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PaymentProviderDto paymentProviderDto = null;
        List<PaymentProviderDto> list = null;
        PageHeaderDto pageHeaderDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                paymentProviderDto = this.nullablePaymentProviderDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                list = this.listOfPaymentProviderDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("providers", "providers", jsonReader);
                }
            } else if (selectName == 2 && (pageHeaderDto = this.pageHeaderDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("header_", "header", jsonReader);
            }
        }
        jsonReader.endObject();
        if (list == null) {
            throw Util.missingProperty("providers", "providers", jsonReader);
        }
        if (pageHeaderDto != null) {
            return new GetAllMobileProvidersResponse(paymentProviderDto, list, pageHeaderDto);
        }
        throw Util.missingProperty("header_", "header", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetAllMobileProvidersResponse getAllMobileProvidersResponse) {
        GetAllMobileProvidersResponse getAllMobileProvidersResponse2 = getAllMobileProvidersResponse;
        if (getAllMobileProvidersResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("suggested_provider");
        this.nullablePaymentProviderDtoAdapter.toJson(jsonWriter, (JsonWriter) getAllMobileProvidersResponse2.getSuggestedProvider());
        jsonWriter.name("providers");
        this.listOfPaymentProviderDtoAdapter.toJson(jsonWriter, (JsonWriter) getAllMobileProvidersResponse2.getProviders());
        jsonWriter.name("header");
        this.pageHeaderDtoAdapter.toJson(jsonWriter, (JsonWriter) getAllMobileProvidersResponse2.getHeader());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(51, "GeneratedJsonAdapter(GetAllMobileProvidersResponse)");
    }
}
