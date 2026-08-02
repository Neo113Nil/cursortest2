package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentSettingsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentSettings;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentSettingsType;", "autoTopupPaymentSettingsTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/UpToBalanceSettings;", "nullableUpToBalanceSettingsAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoFundSettings;", "nullableAutoFundSettingsAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupPaymentSettingsJsonAdapter extends JsonAdapter<AutoTopupPaymentSettings> {
    private final JsonAdapter<AutoTopupPaymentSettingsType> autoTopupPaymentSettingsTypeAdapter;
    private final JsonAdapter<AutoFundSettings> nullableAutoFundSettingsAdapter;
    private final JsonAdapter<UpToBalanceSettings> nullableUpToBalanceSettingsAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("payment_setting_type", "up_to_balance", "autofund");

    public AutoTopupPaymentSettingsJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.autoTopupPaymentSettingsTypeAdapter = moshi.adapter(AutoTopupPaymentSettingsType.class, emptySet, "paymentSettingType");
        this.nullableUpToBalanceSettingsAdapter = moshi.adapter(UpToBalanceSettings.class, emptySet, "upToBalance");
        this.nullableAutoFundSettingsAdapter = moshi.adapter(AutoFundSettings.class, emptySet, "autofund");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AutoTopupPaymentSettings fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        AutoTopupPaymentSettingsType autoTopupPaymentSettingsType = null;
        UpToBalanceSettings upToBalanceSettings = null;
        AutoFundSettings autoFundSettings = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                autoTopupPaymentSettingsType = this.autoTopupPaymentSettingsTypeAdapter.fromJson(jsonReader);
                if (autoTopupPaymentSettingsType == null) {
                    throw Util.unexpectedNull("paymentSettingType", "payment_setting_type", jsonReader);
                }
            } else if (selectName == 1) {
                upToBalanceSettings = this.nullableUpToBalanceSettingsAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                autoFundSettings = this.nullableAutoFundSettingsAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (autoTopupPaymentSettingsType != null) {
            return new AutoTopupPaymentSettings(autoTopupPaymentSettingsType, upToBalanceSettings, autoFundSettings);
        }
        throw Util.missingProperty("paymentSettingType", "payment_setting_type", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AutoTopupPaymentSettings autoTopupPaymentSettings) {
        AutoTopupPaymentSettings autoTopupPaymentSettings2 = autoTopupPaymentSettings;
        if (autoTopupPaymentSettings2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("payment_setting_type");
        this.autoTopupPaymentSettingsTypeAdapter.toJson(jsonWriter, (JsonWriter) autoTopupPaymentSettings2.getPaymentSettingType());
        jsonWriter.name("up_to_balance");
        this.nullableUpToBalanceSettingsAdapter.toJson(jsonWriter, (JsonWriter) autoTopupPaymentSettings2.getUpToBalance());
        jsonWriter.name("autofund");
        this.nullableAutoFundSettingsAdapter.toJson(jsonWriter, (JsonWriter) autoTopupPaymentSettings2.getAutofund());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(AutoTopupPaymentSettings)");
    }
}
