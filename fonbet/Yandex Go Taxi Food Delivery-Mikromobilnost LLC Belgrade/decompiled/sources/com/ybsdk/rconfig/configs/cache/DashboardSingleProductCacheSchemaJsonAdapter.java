package com.ybsdk.rconfig.configs.cache;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/rconfig/configs/cache/DashboardSingleProductCacheSchemaJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/cache/DashboardSingleProductCacheSchema;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "", "listOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "", "longAdapter", "", "nullableBooleanAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DashboardSingleProductCacheSchemaJsonAdapter extends JsonAdapter<DashboardSingleProductCacheSchema> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("enabled_for_product_ids", "version", "slow_update_notice_delay_ms", "postpone_screen_animation_enabled");

    public DashboardSingleProductCacheSchemaJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "enabledFor");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "version");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "slowUpdateNoticeDelayMs");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "postponeScreenAnimationEnabled");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DashboardSingleProductCacheSchema fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        Long l = null;
        List<String> list = null;
        Boolean bool = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfStringAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("enabledFor", "enabled_for_product_ids", jsonReader);
                }
            } else if (selectName == 1) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("version", "version", jsonReader);
                }
            } else if (selectName == 2) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull("slowUpdateNoticeDelayMs", "slow_update_notice_delay_ms", jsonReader);
                }
            } else if (selectName == 3) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        Long l2 = l;
        if (list == null) {
            throw Util.missingProperty("enabledFor", "enabled_for_product_ids", jsonReader);
        }
        if (num == null) {
            throw Util.missingProperty("version", "version", jsonReader);
        }
        int intValue = num.intValue();
        if (l2 != null) {
            return new DashboardSingleProductCacheSchema(list, intValue, l2.longValue(), bool);
        }
        throw Util.missingProperty("slowUpdateNoticeDelayMs", "slow_update_notice_delay_ms", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DashboardSingleProductCacheSchema dashboardSingleProductCacheSchema) {
        DashboardSingleProductCacheSchema dashboardSingleProductCacheSchema2 = dashboardSingleProductCacheSchema;
        if (dashboardSingleProductCacheSchema2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("enabled_for_product_ids");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) dashboardSingleProductCacheSchema2.getEnabledFor());
        jsonWriter.name("version");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(dashboardSingleProductCacheSchema2.getVersion()));
        jsonWriter.name("slow_update_notice_delay_ms");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(dashboardSingleProductCacheSchema2.getSlowUpdateNoticeDelayMs()));
        jsonWriter.name("postpone_screen_animation_enabled");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) dashboardSingleProductCacheSchema2.getPostponeScreenAnimationEnabled());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(55, "GeneratedJsonAdapter(DashboardSingleProductCacheSchema)");
    }
}
