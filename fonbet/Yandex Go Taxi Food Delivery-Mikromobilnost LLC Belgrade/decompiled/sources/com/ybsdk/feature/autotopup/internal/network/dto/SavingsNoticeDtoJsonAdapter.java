package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.PaymentMethodDto;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/SavingsNoticeDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/SavingsNoticeDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodDto;", "listOfPaymentMethodDtoAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsNoticeDtoJsonAdapter extends JsonAdapter<SavingsNoticeDto> {
    private final JsonAdapter<List<PaymentMethodDto>> listOfPaymentMethodDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "button_text", "payment_methods_list");
    private final JsonAdapter<String> stringAdapter;

    public SavingsNoticeDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.listOfPaymentMethodDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, PaymentMethodDto.class), emptySet, "paymentMethods");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SavingsNoticeDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        List<PaymentMethodDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("buttonText", "button_text", jsonReader);
                }
            } else if (selectName == 2 && (list = this.listOfPaymentMethodDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("paymentMethods", "payment_methods_list", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("buttonText", "button_text", jsonReader);
        }
        if (list != null) {
            return new SavingsNoticeDto(str, str2, list);
        }
        throw Util.missingProperty("paymentMethods", "payment_methods_list", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SavingsNoticeDto savingsNoticeDto) {
        SavingsNoticeDto savingsNoticeDto2 = savingsNoticeDto;
        if (savingsNoticeDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) savingsNoticeDto2.getTitle());
        jsonWriter.name("button_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) savingsNoticeDto2.getButtonText());
        jsonWriter.name("payment_methods_list");
        this.listOfPaymentMethodDtoAdapter.toJson(jsonWriter, (JsonWriter) savingsNoticeDto2.getPaymentMethods());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(SavingsNoticeDto)");
    }
}
