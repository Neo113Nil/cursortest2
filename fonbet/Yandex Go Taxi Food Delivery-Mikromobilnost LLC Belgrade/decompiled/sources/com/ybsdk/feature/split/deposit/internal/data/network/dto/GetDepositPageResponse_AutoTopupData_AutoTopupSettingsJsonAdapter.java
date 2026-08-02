package com.ybsdk.feature.split.deposit.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.split.deposit.internal.data.network.dto.GetDepositPageResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse_AutoTopupData_AutoTopupSettingsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData$AutoTopupSettings;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/AutoTopupStatus;", "autoTopupStatusAdapter", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetDepositPageResponse_AutoTopupData_AutoTopupSettingsJsonAdapter extends JsonAdapter<GetDepositPageResponse.AutoTopupData.AutoTopupSettings> {
    private final JsonAdapter<AutoTopupStatus> autoTopupStatusAdapter;
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("auto_fund_limit", "auto_topup_amount", "auto_topup_threshold", "auto_topup_status");

    public GetDepositPageResponse_AutoTopupData_AutoTopupSettingsJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "autoFundLimit");
        this.autoTopupStatusAdapter = moshi.adapter(AutoTopupStatus.class, emptySet, "autoTopupStatus");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetDepositPageResponse.AutoTopupData.AutoTopupSettings fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Money money = null;
        Money money2 = null;
        Money money3 = null;
        AutoTopupStatus autoTopupStatus = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                money = this.moneyAdapter.fromJson(jsonReader);
                if (money == null) {
                    throw Util.unexpectedNull("autoFundLimit", "auto_fund_limit", jsonReader);
                }
            } else if (selectName == 1) {
                money2 = this.moneyAdapter.fromJson(jsonReader);
                if (money2 == null) {
                    throw Util.unexpectedNull("autoTopupAmount", "auto_topup_amount", jsonReader);
                }
            } else if (selectName == 2) {
                money3 = this.moneyAdapter.fromJson(jsonReader);
                if (money3 == null) {
                    throw Util.unexpectedNull("autoTopupThreshold", "auto_topup_threshold", jsonReader);
                }
            } else if (selectName == 3 && (autoTopupStatus = this.autoTopupStatusAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("autoTopupStatus", "auto_topup_status", jsonReader);
            }
        }
        jsonReader.endObject();
        if (money == null) {
            throw Util.missingProperty("autoFundLimit", "auto_fund_limit", jsonReader);
        }
        if (money2 == null) {
            throw Util.missingProperty("autoTopupAmount", "auto_topup_amount", jsonReader);
        }
        if (money3 == null) {
            throw Util.missingProperty("autoTopupThreshold", "auto_topup_threshold", jsonReader);
        }
        if (autoTopupStatus != null) {
            return new GetDepositPageResponse.AutoTopupData.AutoTopupSettings(money, money2, money3, autoTopupStatus);
        }
        throw Util.missingProperty("autoTopupStatus", "auto_topup_status", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetDepositPageResponse.AutoTopupData.AutoTopupSettings autoTopupSettings) {
        GetDepositPageResponse.AutoTopupData.AutoTopupSettings autoTopupSettings2 = autoTopupSettings;
        if (autoTopupSettings2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("auto_fund_limit");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettings2.getAutoFundLimit());
        jsonWriter.name("auto_topup_amount");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettings2.getAutoTopupAmount());
        jsonWriter.name("auto_topup_threshold");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettings2.getAutoTopupThreshold());
        jsonWriter.name("auto_topup_status");
        this.autoTopupStatusAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettings2.getAutoTopupStatus());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(76, "GeneratedJsonAdapter(GetDepositPageResponse.AutoTopupData.AutoTopupSettings)");
    }
}
