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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2ExitBottomSheetJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2ExitBottomSheet;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Button;", "autoTopupSettingsV2ButtonAdapter", "nullableAutoTopupSettingsV2ButtonAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupSettingsV2ExitBottomSheetJsonAdapter extends JsonAdapter<AutoTopupSettingsV2ExitBottomSheet> {
    private final JsonAdapter<AutoTopupSettingsV2Button> autoTopupSettingsV2ButtonAdapter;
    private final JsonAdapter<AutoTopupSettingsV2Button> nullableAutoTopupSettingsV2ButtonAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "subtitle", "primary_button", "secondary_button");
    private final JsonAdapter<String> stringAdapter;

    public AutoTopupSettingsV2ExitBottomSheetJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "subtitle");
        this.autoTopupSettingsV2ButtonAdapter = moshi.adapter(AutoTopupSettingsV2Button.class, emptySet, "primaryButton");
        this.nullableAutoTopupSettingsV2ButtonAdapter = moshi.adapter(AutoTopupSettingsV2Button.class, emptySet, "secondaryButton");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AutoTopupSettingsV2ExitBottomSheet fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        AutoTopupSettingsV2Button autoTopupSettingsV2Button = null;
        AutoTopupSettingsV2Button autoTopupSettingsV2Button2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                autoTopupSettingsV2Button = this.autoTopupSettingsV2ButtonAdapter.fromJson(jsonReader);
                if (autoTopupSettingsV2Button == null) {
                    throw Util.unexpectedNull("primaryButton", "primary_button", jsonReader);
                }
            } else if (selectName == 3) {
                autoTopupSettingsV2Button2 = this.nullableAutoTopupSettingsV2ButtonAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (autoTopupSettingsV2Button != null) {
            return new AutoTopupSettingsV2ExitBottomSheet(str, str2, autoTopupSettingsV2Button, autoTopupSettingsV2Button2);
        }
        throw Util.missingProperty("primaryButton", "primary_button", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AutoTopupSettingsV2ExitBottomSheet autoTopupSettingsV2ExitBottomSheet) {
        AutoTopupSettingsV2ExitBottomSheet autoTopupSettingsV2ExitBottomSheet2 = autoTopupSettingsV2ExitBottomSheet;
        if (autoTopupSettingsV2ExitBottomSheet2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2ExitBottomSheet2.getTitle());
        jsonWriter.name("subtitle");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2ExitBottomSheet2.getSubtitle());
        jsonWriter.name("primary_button");
        this.autoTopupSettingsV2ButtonAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2ExitBottomSheet2.getPrimaryButton());
        jsonWriter.name("secondary_button");
        this.nullableAutoTopupSettingsV2ButtonAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2ExitBottomSheet2.getSecondaryButton());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(56, "GeneratedJsonAdapter(AutoTopupSettingsV2ExitBottomSheet)");
    }
}
