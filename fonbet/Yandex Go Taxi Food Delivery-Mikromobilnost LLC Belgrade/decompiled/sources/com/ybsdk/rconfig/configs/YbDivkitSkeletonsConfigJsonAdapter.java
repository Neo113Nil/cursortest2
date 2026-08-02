package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/rconfig/configs/YbDivkitSkeletonsConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/YbDivkitSkeletonsConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableBooleanAdapter", "", "nullableLongAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class YbDivkitSkeletonsConfigJsonAdapter extends JsonAdapter<YbDivkitSkeletonsConfig> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("is_enabled", "is_enabled_on_transfers_screen", "is_enabled_on_user_cards_screen", "is_enabled_on_card_rename_screen", "is_enabled_on_merchant_offers_screen", "is_enabled_on_transactions_feed_screen", "is_enabled_on_credit_dashboard_screen", "is_enabled_on_credit_account_dashboard_screen", "is_enabled_on_products_screen", "skeletons_cache_ttl_ms");

    public YbDivkitSkeletonsConfigJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "isEnabled");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "isEnabledOnTransfersScreen");
        this.nullableLongAdapter = moshi.adapter(Long.class, emptySet, "skeletonsCacheTtlMs");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final YbDivkitSkeletonsConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        Boolean bool9 = null;
        Long l = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("isEnabled", "is_enabled", jsonReader);
                    }
                    break;
                case 1:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    bool3 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    bool4 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    bool5 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    bool6 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    bool7 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    bool8 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    bool9 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    l = this.nullableLongAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (bool != null) {
            return new YbDivkitSkeletonsConfig(bool.booleanValue(), bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, l);
        }
        throw Util.missingProperty("isEnabled", "is_enabled", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, YbDivkitSkeletonsConfig ybDivkitSkeletonsConfig) {
        YbDivkitSkeletonsConfig ybDivkitSkeletonsConfig2 = ybDivkitSkeletonsConfig;
        if (ybDivkitSkeletonsConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("is_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(ybDivkitSkeletonsConfig2.isEnabled()));
        jsonWriter.name("is_enabled_on_transfers_screen");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) ybDivkitSkeletonsConfig2.isEnabledOnTransfersScreen());
        jsonWriter.name("is_enabled_on_user_cards_screen");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) ybDivkitSkeletonsConfig2.isEnabledOnUserCardsScreen());
        jsonWriter.name("is_enabled_on_card_rename_screen");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) ybDivkitSkeletonsConfig2.isEnabledOnCardRenameScreen());
        jsonWriter.name("is_enabled_on_merchant_offers_screen");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) ybDivkitSkeletonsConfig2.isEnabledOnMerchantOffersScreen());
        jsonWriter.name("is_enabled_on_transactions_feed_screen");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) ybDivkitSkeletonsConfig2.isEnabledOnTransactionsFeedScreen());
        jsonWriter.name("is_enabled_on_credit_dashboard_screen");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) ybDivkitSkeletonsConfig2.isEnabledOnCreditDashboardV1Screen());
        jsonWriter.name("is_enabled_on_credit_account_dashboard_screen");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) ybDivkitSkeletonsConfig2.isEnabledOnCreditAccountDashboardV1Screen());
        jsonWriter.name("is_enabled_on_products_screen");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) ybDivkitSkeletonsConfig2.isEnabledOnProductsScreen());
        jsonWriter.name("skeletons_cache_ttl_ms");
        this.nullableLongAdapter.toJson(jsonWriter, (JsonWriter) ybDivkitSkeletonsConfig2.getSkeletonsCacheTtlMs());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(YbDivkitSkeletonsConfig)");
    }
}
