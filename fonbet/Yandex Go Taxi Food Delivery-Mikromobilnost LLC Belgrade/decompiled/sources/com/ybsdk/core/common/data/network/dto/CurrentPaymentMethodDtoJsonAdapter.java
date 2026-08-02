package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Money;", "nullableMoneyAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "nullableThemesOfStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;", "paymentMethodInfoDtoAdapter", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CurrentPaymentMethodDtoJsonAdapter extends JsonAdapter<CurrentPaymentMethodDto> {
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "subtitle", "selected_method_description", "money", "logo", "second_logo", "info", "legal_text");
    private final JsonAdapter<PaymentMethodInfoDto> paymentMethodInfoDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public CurrentPaymentMethodDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "subtitle");
        this.nullableMoneyAdapter = moshi.adapter(Money.class, emptySet, "money");
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "logo");
        this.paymentMethodInfoDtoAdapter = moshi.adapter(PaymentMethodInfoDto.class, emptySet, "info");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CurrentPaymentMethodDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        Money money = null;
        Themes<String> themes = null;
        Themes<String> themes2 = null;
        PaymentMethodInfoDto paymentMethodInfoDto = null;
        String str4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    money = this.nullableMoneyAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    themes = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    themes2 = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    paymentMethodInfoDto = this.paymentMethodInfoDtoAdapter.fromJson(jsonReader);
                    if (paymentMethodInfoDto == null) {
                        throw Util.unexpectedNull("info", "info", jsonReader);
                    }
                    break;
                case 7:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (paymentMethodInfoDto != null) {
            return new CurrentPaymentMethodDto(str, str2, str3, money, themes, themes2, paymentMethodInfoDto, str4);
        }
        throw Util.missingProperty("info", "info", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CurrentPaymentMethodDto currentPaymentMethodDto) {
        CurrentPaymentMethodDto currentPaymentMethodDto2 = currentPaymentMethodDto;
        if (currentPaymentMethodDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) currentPaymentMethodDto2.getTitle());
        jsonWriter.name("subtitle");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) currentPaymentMethodDto2.getSubtitle());
        jsonWriter.name("selected_method_description");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) currentPaymentMethodDto2.getSelectedMethodDescription());
        jsonWriter.name("money");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) currentPaymentMethodDto2.getMoney());
        jsonWriter.name("logo");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) currentPaymentMethodDto2.getLogo());
        jsonWriter.name("second_logo");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) currentPaymentMethodDto2.getSecondLogo());
        jsonWriter.name("info");
        this.paymentMethodInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) currentPaymentMethodDto2.getInfo());
        jsonWriter.name("legal_text");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) currentPaymentMethodDto2.getLegalText());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(CurrentPaymentMethodDto)");
    }
}
