package com.ybsdk.rconfig;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/rconfig/DashboardSkinSelectionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/DashboardSkinSelection;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "listOfStringAdapter", "", "booleanAdapter", "", "intAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DashboardSkinSelectionJsonAdapter extends JsonAdapter<DashboardSkinSelection> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("action", "products", "is_enabled", "visits_between_onboarding_animation");
    private final JsonAdapter<String> stringAdapter;

    public DashboardSkinSelectionJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "action");
        this.listOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "products");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, BackendConfig.Restrictions.ENABLED);
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "visitsBetweenOnboardingAnimation");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DashboardSkinSelection fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        List<String> list = null;
        Boolean bool = null;
        Integer num = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("action", "action", jsonReader);
                }
            } else if (selectName == 1) {
                list = this.listOfStringAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("products", "products", jsonReader);
                }
            } else if (selectName == 2) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull(BackendConfig.Restrictions.ENABLED, "is_enabled", jsonReader);
                }
            } else if (selectName == 3 && (num = this.intAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("visitsBetweenOnboardingAnimation", "visits_between_onboarding_animation", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("action", "action", jsonReader);
        }
        if (list == null) {
            throw Util.missingProperty("products", "products", jsonReader);
        }
        if (bool == null) {
            throw Util.missingProperty(BackendConfig.Restrictions.ENABLED, "is_enabled", jsonReader);
        }
        boolean booleanValue = bool.booleanValue();
        if (num != null) {
            return new DashboardSkinSelection(str, list, booleanValue, num.intValue());
        }
        throw Util.missingProperty("visitsBetweenOnboardingAnimation", "visits_between_onboarding_animation", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DashboardSkinSelection dashboardSkinSelection) {
        DashboardSkinSelection dashboardSkinSelection2 = dashboardSkinSelection;
        if (dashboardSkinSelection2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("action");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) dashboardSkinSelection2.getAction());
        jsonWriter.name("products");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) dashboardSkinSelection2.getProducts());
        jsonWriter.name("is_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(dashboardSkinSelection2.getEnabled()));
        jsonWriter.name("visits_between_onboarding_animation");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(dashboardSkinSelection2.getVisitsBetweenOnboardingAnimation()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(DashboardSkinSelection)");
    }
}
