package com.ybsdk.feature.partnerpayments.internal.network.dto.save;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.partnerpayments.internal.network.dto.save.AutoPaymentSettingsDto;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentSettingsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentSettingsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentSettingsDto$AutoPaymentSettingsType;", "autoPaymentSettingsTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/UpToBalanceSettingsDto;", "nullableUpToBalanceSettingsDtoAdapter", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoFundSettingsDto;", "nullableAutoFundSettingsDtoAdapter", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/RoundingSettingsDto;", "nullableRoundingSettingsDtoAdapter", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/PeriodicPaymentSettingsDto;", "nullablePeriodicPaymentSettingsDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-partner-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoPaymentSettingsDtoJsonAdapter extends JsonAdapter<AutoPaymentSettingsDto> {
    private final JsonAdapter<AutoPaymentSettingsDto.AutoPaymentSettingsType> autoPaymentSettingsTypeAdapter;
    private volatile Constructor<AutoPaymentSettingsDto> constructorRef;
    private final JsonAdapter<AutoFundSettingsDto> nullableAutoFundSettingsDtoAdapter;
    private final JsonAdapter<PeriodicPaymentSettingsDto> nullablePeriodicPaymentSettingsDtoAdapter;
    private final JsonAdapter<RoundingSettingsDto> nullableRoundingSettingsDtoAdapter;
    private final JsonAdapter<UpToBalanceSettingsDto> nullableUpToBalanceSettingsDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("selected_auto_payment_setting", "up_to_balance", "autofund", "rounding", "periodic_payment");

    public AutoPaymentSettingsDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.autoPaymentSettingsTypeAdapter = moshi.adapter(AutoPaymentSettingsDto.AutoPaymentSettingsType.class, emptySet, "selectedAutoPaymentSetting");
        this.nullableUpToBalanceSettingsDtoAdapter = moshi.adapter(UpToBalanceSettingsDto.class, emptySet, "upToBalance");
        this.nullableAutoFundSettingsDtoAdapter = moshi.adapter(AutoFundSettingsDto.class, emptySet, "autofund");
        this.nullableRoundingSettingsDtoAdapter = moshi.adapter(RoundingSettingsDto.class, emptySet, "rounding");
        this.nullablePeriodicPaymentSettingsDtoAdapter = moshi.adapter(PeriodicPaymentSettingsDto.class, emptySet, "periodicPayment");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AutoPaymentSettingsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        AutoPaymentSettingsDto.AutoPaymentSettingsType autoPaymentSettingsType = null;
        UpToBalanceSettingsDto upToBalanceSettingsDto = null;
        AutoFundSettingsDto autoFundSettingsDto = null;
        RoundingSettingsDto roundingSettingsDto = null;
        PeriodicPaymentSettingsDto periodicPaymentSettingsDto = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                autoPaymentSettingsType = this.autoPaymentSettingsTypeAdapter.fromJson(jsonReader);
                if (autoPaymentSettingsType == null) {
                    throw Util.unexpectedNull("selectedAutoPaymentSetting", "selected_auto_payment_setting", jsonReader);
                }
            } else if (selectName == 1) {
                upToBalanceSettingsDto = this.nullableUpToBalanceSettingsDtoAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (selectName == 2) {
                autoFundSettingsDto = this.nullableAutoFundSettingsDtoAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (selectName == 3) {
                roundingSettingsDto = this.nullableRoundingSettingsDtoAdapter.fromJson(jsonReader);
                i &= -9;
            } else if (selectName == 4) {
                periodicPaymentSettingsDto = this.nullablePeriodicPaymentSettingsDtoAdapter.fromJson(jsonReader);
                i &= -17;
            }
        }
        jsonReader.endObject();
        if (i == -31) {
            PeriodicPaymentSettingsDto periodicPaymentSettingsDto2 = periodicPaymentSettingsDto;
            RoundingSettingsDto roundingSettingsDto2 = roundingSettingsDto;
            AutoFundSettingsDto autoFundSettingsDto2 = autoFundSettingsDto;
            UpToBalanceSettingsDto upToBalanceSettingsDto2 = upToBalanceSettingsDto;
            AutoPaymentSettingsDto.AutoPaymentSettingsType autoPaymentSettingsType2 = autoPaymentSettingsType;
            if (autoPaymentSettingsType2 != null) {
                return new AutoPaymentSettingsDto(autoPaymentSettingsType2, upToBalanceSettingsDto2, autoFundSettingsDto2, roundingSettingsDto2, periodicPaymentSettingsDto2);
            }
            throw Util.missingProperty("selectedAutoPaymentSetting", "selected_auto_payment_setting", jsonReader);
        }
        PeriodicPaymentSettingsDto periodicPaymentSettingsDto3 = periodicPaymentSettingsDto;
        RoundingSettingsDto roundingSettingsDto3 = roundingSettingsDto;
        AutoFundSettingsDto autoFundSettingsDto3 = autoFundSettingsDto;
        UpToBalanceSettingsDto upToBalanceSettingsDto3 = upToBalanceSettingsDto;
        AutoPaymentSettingsDto.AutoPaymentSettingsType autoPaymentSettingsType3 = autoPaymentSettingsType;
        Constructor<AutoPaymentSettingsDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AutoPaymentSettingsDto.class.getDeclaredConstructor(AutoPaymentSettingsDto.AutoPaymentSettingsType.class, UpToBalanceSettingsDto.class, AutoFundSettingsDto.class, RoundingSettingsDto.class, PeriodicPaymentSettingsDto.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (autoPaymentSettingsType3 != null) {
            return constructor.newInstance(autoPaymentSettingsType3, upToBalanceSettingsDto3, autoFundSettingsDto3, roundingSettingsDto3, periodicPaymentSettingsDto3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("selectedAutoPaymentSetting", "selected_auto_payment_setting", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AutoPaymentSettingsDto autoPaymentSettingsDto) {
        AutoPaymentSettingsDto autoPaymentSettingsDto2 = autoPaymentSettingsDto;
        if (autoPaymentSettingsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("selected_auto_payment_setting");
        this.autoPaymentSettingsTypeAdapter.toJson(jsonWriter, (JsonWriter) autoPaymentSettingsDto2.getSelectedAutoPaymentSetting());
        jsonWriter.name("up_to_balance");
        this.nullableUpToBalanceSettingsDtoAdapter.toJson(jsonWriter, (JsonWriter) autoPaymentSettingsDto2.getUpToBalance());
        jsonWriter.name("autofund");
        this.nullableAutoFundSettingsDtoAdapter.toJson(jsonWriter, (JsonWriter) autoPaymentSettingsDto2.getAutofund());
        jsonWriter.name("rounding");
        this.nullableRoundingSettingsDtoAdapter.toJson(jsonWriter, (JsonWriter) autoPaymentSettingsDto2.getRounding());
        jsonWriter.name("periodic_payment");
        this.nullablePeriodicPaymentSettingsDtoAdapter.toJson(jsonWriter, (JsonWriter) autoPaymentSettingsDto2.getPeriodicPayment());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(AutoPaymentSettingsDto)");
    }
}
