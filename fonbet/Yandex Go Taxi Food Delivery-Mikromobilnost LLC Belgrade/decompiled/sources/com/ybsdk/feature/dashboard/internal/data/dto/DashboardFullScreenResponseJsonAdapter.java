package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.kju0;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardFullScreenResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardFullScreenResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DashboardFullScreenResponseJsonAdapter extends JsonAdapter<DashboardFullScreenResponse> {
    private volatile Constructor<DashboardFullScreenResponse> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(kju0.f, "event_id", "url", "name", "drop_sessions_without_fullscreens_on_show");
    private final JsonAdapter<String> stringAdapter;

    public DashboardFullScreenResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "layoutId");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "eventId");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "dropSessionsWithoutFullscreensOnShow");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DashboardFullScreenResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                i = -2;
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("eventId", "event_id", jsonReader);
                }
            } else if (selectName == 2) {
                str3 = this.stringAdapter.fromJson(jsonReader);
                if (str3 == null) {
                    throw Util.unexpectedNull("url", "url", jsonReader);
                }
            } else if (selectName == 3) {
                str4 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -2) {
            Boolean bool2 = bool;
            String str5 = str4;
            String str6 = str3;
            String str7 = str2;
            String str8 = str;
            if (str7 == null) {
                throw Util.missingProperty("eventId", "event_id", jsonReader);
            }
            if (str6 != null) {
                return new DashboardFullScreenResponse(str8, str7, str6, str5, bool2);
            }
            throw Util.missingProperty("url", "url", jsonReader);
        }
        Boolean bool3 = bool;
        String str9 = str4;
        String str10 = str3;
        String str11 = str2;
        String str12 = str;
        Constructor<DashboardFullScreenResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = DashboardFullScreenResponse.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Boolean.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str11 == null) {
            throw Util.missingProperty("eventId", "event_id", jsonReader);
        }
        if (str10 != null) {
            return constructor.newInstance(str12, str11, str10, str9, bool3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("url", "url", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DashboardFullScreenResponse dashboardFullScreenResponse) {
        DashboardFullScreenResponse dashboardFullScreenResponse2 = dashboardFullScreenResponse;
        if (dashboardFullScreenResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(kju0.f);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) dashboardFullScreenResponse2.getLayoutId());
        jsonWriter.name("event_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) dashboardFullScreenResponse2.getEventId());
        jsonWriter.name("url");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) dashboardFullScreenResponse2.getUrl());
        jsonWriter.name("name");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) dashboardFullScreenResponse2.getName());
        jsonWriter.name("drop_sessions_without_fullscreens_on_show");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) dashboardFullScreenResponse2.getDropSessionsWithoutFullscreensOnShow());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(DashboardFullScreenResponse)");
    }
}
