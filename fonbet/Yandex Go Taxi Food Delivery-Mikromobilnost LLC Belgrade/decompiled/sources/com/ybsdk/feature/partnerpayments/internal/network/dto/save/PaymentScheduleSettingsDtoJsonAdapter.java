package com.ybsdk.feature.partnerpayments.internal.network.dto.save;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.partnerpayments.internal.network.dto.save.PaymentScheduleSettingsDto;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/PaymentScheduleSettingsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/PaymentScheduleSettingsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/PaymentScheduleSettingsDto$PaymentScheduleType;", "paymentScheduleTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/WeeklyPaymentScheduleSettingsDto;", "nullableWeeklyPaymentScheduleSettingsDtoAdapter", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/MonthlyPaymentScheduleSettingsDto;", "nullableMonthlyPaymentScheduleSettingsDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-partner-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentScheduleSettingsDtoJsonAdapter extends JsonAdapter<PaymentScheduleSettingsDto> {
    private volatile Constructor<PaymentScheduleSettingsDto> constructorRef;
    private final JsonAdapter<MonthlyPaymentScheduleSettingsDto> nullableMonthlyPaymentScheduleSettingsDtoAdapter;
    private final JsonAdapter<WeeklyPaymentScheduleSettingsDto> nullableWeeklyPaymentScheduleSettingsDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("type", "weekly", "monthly");
    private final JsonAdapter<PaymentScheduleSettingsDto.PaymentScheduleType> paymentScheduleTypeAdapter;

    public PaymentScheduleSettingsDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.paymentScheduleTypeAdapter = moshi.adapter(PaymentScheduleSettingsDto.PaymentScheduleType.class, emptySet, "type");
        this.nullableWeeklyPaymentScheduleSettingsDtoAdapter = moshi.adapter(WeeklyPaymentScheduleSettingsDto.class, emptySet, "weekly");
        this.nullableMonthlyPaymentScheduleSettingsDtoAdapter = moshi.adapter(MonthlyPaymentScheduleSettingsDto.class, emptySet, "monthly");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PaymentScheduleSettingsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PaymentScheduleSettingsDto.PaymentScheduleType paymentScheduleType = null;
        WeeklyPaymentScheduleSettingsDto weeklyPaymentScheduleSettingsDto = null;
        MonthlyPaymentScheduleSettingsDto monthlyPaymentScheduleSettingsDto = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                paymentScheduleType = this.paymentScheduleTypeAdapter.fromJson(jsonReader);
                if (paymentScheduleType == null) {
                    throw Util.unexpectedNull("type", "type", jsonReader);
                }
            } else if (selectName == 1) {
                weeklyPaymentScheduleSettingsDto = this.nullableWeeklyPaymentScheduleSettingsDtoAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (selectName == 2) {
                monthlyPaymentScheduleSettingsDto = this.nullableMonthlyPaymentScheduleSettingsDtoAdapter.fromJson(jsonReader);
                i &= -5;
            }
        }
        jsonReader.endObject();
        if (i == -7) {
            if (paymentScheduleType != null) {
                return new PaymentScheduleSettingsDto(paymentScheduleType, weeklyPaymentScheduleSettingsDto, monthlyPaymentScheduleSettingsDto);
            }
            throw Util.missingProperty("type", "type", jsonReader);
        }
        Constructor<PaymentScheduleSettingsDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PaymentScheduleSettingsDto.class.getDeclaredConstructor(PaymentScheduleSettingsDto.PaymentScheduleType.class, WeeklyPaymentScheduleSettingsDto.class, MonthlyPaymentScheduleSettingsDto.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (paymentScheduleType != null) {
            return constructor.newInstance(paymentScheduleType, weeklyPaymentScheduleSettingsDto, monthlyPaymentScheduleSettingsDto, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("type", "type", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PaymentScheduleSettingsDto paymentScheduleSettingsDto) {
        PaymentScheduleSettingsDto paymentScheduleSettingsDto2 = paymentScheduleSettingsDto;
        if (paymentScheduleSettingsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.paymentScheduleTypeAdapter.toJson(jsonWriter, (JsonWriter) paymentScheduleSettingsDto2.getType());
        jsonWriter.name("weekly");
        this.nullableWeeklyPaymentScheduleSettingsDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentScheduleSettingsDto2.getWeekly());
        jsonWriter.name("monthly");
        this.nullableMonthlyPaymentScheduleSettingsDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentScheduleSettingsDto2.getMonthly());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(PaymentScheduleSettingsDto)");
    }
}
