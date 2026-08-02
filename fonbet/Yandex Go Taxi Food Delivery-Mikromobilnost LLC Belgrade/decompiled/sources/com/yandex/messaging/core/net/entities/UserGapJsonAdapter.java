package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UserGapJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/UserGap;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UserGapJsonAdapter extends JsonAdapter<UserGap> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("workflow", "comment", "work_in_absence", "date_from", "date_to", "full_day");

    public UserGapJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "workflow");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "workInAbsence");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final UserGap fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Boolean bool = null;
        String str2 = null;
        String str3 = null;
        Boolean bool2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        String str4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    z = true;
                    break;
                case 1:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    z2 = true;
                    break;
                case 2:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("workInAbsence", "work_in_absence", jsonReader);
                    }
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    z3 = true;
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    z4 = true;
                    break;
                case 5:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("fullDay", "full_day", jsonReader);
                    }
                    break;
            }
        }
        jsonReader.endObject();
        UserGap userGap = new UserGap();
        if (z) {
            userGap.setWorkflow(str);
        }
        if (z2) {
            userGap.setComment(str4);
        }
        userGap.setWorkInAbsence(bool != null ? bool.booleanValue() : userGap.getWorkInAbsence());
        if (z3) {
            userGap.setDateFrom(str2);
        }
        if (z4) {
            userGap.setDateTo(str3);
        }
        userGap.setFullDay(bool2 != null ? bool2.booleanValue() : userGap.getFullDay());
        return userGap;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, UserGap userGap) {
        UserGap userGap2 = userGap;
        if (userGap2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("workflow");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) userGap2.getWorkflow());
        jsonWriter.name("comment");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) userGap2.getComment());
        jsonWriter.name("work_in_absence");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(userGap2.getWorkInAbsence()));
        jsonWriter.name("date_from");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) userGap2.getDateFrom());
        jsonWriter.name("date_to");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) userGap2.getDateTo());
        jsonWriter.name("full_day");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(userGap2.getFullDay()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(29, "GeneratedJsonAdapter(UserGap)");
    }
}
