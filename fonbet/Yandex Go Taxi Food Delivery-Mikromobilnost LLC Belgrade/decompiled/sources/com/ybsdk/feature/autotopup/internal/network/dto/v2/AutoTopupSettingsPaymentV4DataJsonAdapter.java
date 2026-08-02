package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.PaymentMethodsListDto;
import com.ybsdk.feature.autotopup.internal.network.dto.SavingsNoticeDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsPaymentV4DataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsPaymentV4Data;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;", "paymentMethodsListDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/SavingsNoticeDto;", "nullableSavingsNoticeDtoAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupSettingsPaymentV4DataJsonAdapter extends JsonAdapter<AutoTopupSettingsPaymentV4Data> {
    private final JsonAdapter<SavingsNoticeDto> nullableSavingsNoticeDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("payment_methods_list", "savings_notice");
    private final JsonAdapter<PaymentMethodsListDto> paymentMethodsListDtoAdapter;

    public AutoTopupSettingsPaymentV4DataJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.paymentMethodsListDtoAdapter = moshi.adapter(PaymentMethodsListDto.class, emptySet, "paymentMethodList");
        this.nullableSavingsNoticeDtoAdapter = moshi.adapter(SavingsNoticeDto.class, emptySet, "savingNotice");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AutoTopupSettingsPaymentV4Data fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PaymentMethodsListDto paymentMethodsListDto = null;
        SavingsNoticeDto savingsNoticeDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                paymentMethodsListDto = this.paymentMethodsListDtoAdapter.fromJson(jsonReader);
                if (paymentMethodsListDto == null) {
                    throw Util.unexpectedNull("paymentMethodList", "payment_methods_list", jsonReader);
                }
            } else if (selectName == 1) {
                savingsNoticeDto = this.nullableSavingsNoticeDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (paymentMethodsListDto != null) {
            return new AutoTopupSettingsPaymentV4Data(paymentMethodsListDto, savingsNoticeDto);
        }
        throw Util.missingProperty("paymentMethodList", "payment_methods_list", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AutoTopupSettingsPaymentV4Data autoTopupSettingsPaymentV4Data) {
        AutoTopupSettingsPaymentV4Data autoTopupSettingsPaymentV4Data2 = autoTopupSettingsPaymentV4Data;
        if (autoTopupSettingsPaymentV4Data2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("payment_methods_list");
        this.paymentMethodsListDtoAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsPaymentV4Data2.getPaymentMethodList());
        jsonWriter.name("savings_notice");
        this.nullableSavingsNoticeDtoAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsPaymentV4Data2.getSavingNotice());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(AutoTopupSettingsPaymentV4Data)");
    }
}
