package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2ChangeSettingBottomSheetJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2ChangeSettingBottomSheet;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2ButtonsGroup;", "autoTopupSettingsV2ButtonsGroupAdapter", "", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2EditField;", "listOfAutoTopupSettingsV2EditFieldAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupSettingsV2ChangeSettingBottomSheetJsonAdapter extends JsonAdapter<AutoTopupSettingsV2ChangeSettingBottomSheet> {
    private final JsonAdapter<AutoTopupSettingsV2ButtonsGroup> autoTopupSettingsV2ButtonsGroupAdapter;
    private final JsonAdapter<List<AutoTopupSettingsV2EditField>> listOfAutoTopupSettingsV2EditFieldAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "subtitle", "buttons_group", "edit_fields");
    private final JsonAdapter<String> stringAdapter;

    public AutoTopupSettingsV2ChangeSettingBottomSheetJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.autoTopupSettingsV2ButtonsGroupAdapter = moshi.adapter(AutoTopupSettingsV2ButtonsGroup.class, emptySet, "buttonsGroup");
        this.listOfAutoTopupSettingsV2EditFieldAdapter = moshi.adapter(Types.newParameterizedType(List.class, AutoTopupSettingsV2EditField.class), emptySet, "editFields");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AutoTopupSettingsV2ChangeSettingBottomSheet fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        AutoTopupSettingsV2ButtonsGroup autoTopupSettingsV2ButtonsGroup = null;
        List<AutoTopupSettingsV2EditField> list = null;
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
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("subtitle", "subtitle", jsonReader);
                }
            } else if (selectName == 2) {
                autoTopupSettingsV2ButtonsGroup = this.autoTopupSettingsV2ButtonsGroupAdapter.fromJson(jsonReader);
                if (autoTopupSettingsV2ButtonsGroup == null) {
                    throw Util.unexpectedNull("buttonsGroup", "buttons_group", jsonReader);
                }
            } else if (selectName == 3 && (list = this.listOfAutoTopupSettingsV2EditFieldAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("editFields", "edit_fields", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("subtitle", "subtitle", jsonReader);
        }
        if (autoTopupSettingsV2ButtonsGroup == null) {
            throw Util.missingProperty("buttonsGroup", "buttons_group", jsonReader);
        }
        if (list != null) {
            return new AutoTopupSettingsV2ChangeSettingBottomSheet(str, str2, autoTopupSettingsV2ButtonsGroup, list);
        }
        throw Util.missingProperty("editFields", "edit_fields", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AutoTopupSettingsV2ChangeSettingBottomSheet autoTopupSettingsV2ChangeSettingBottomSheet) {
        AutoTopupSettingsV2ChangeSettingBottomSheet autoTopupSettingsV2ChangeSettingBottomSheet2 = autoTopupSettingsV2ChangeSettingBottomSheet;
        if (autoTopupSettingsV2ChangeSettingBottomSheet2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2ChangeSettingBottomSheet2.getTitle());
        jsonWriter.name("subtitle");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2ChangeSettingBottomSheet2.getSubtitle());
        jsonWriter.name("buttons_group");
        this.autoTopupSettingsV2ButtonsGroupAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2ChangeSettingBottomSheet2.getButtonsGroup());
        jsonWriter.name("edit_fields");
        this.listOfAutoTopupSettingsV2EditFieldAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2ChangeSettingBottomSheet2.getEditFields());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(65, "GeneratedJsonAdapter(AutoTopupSettingsV2ChangeSettingBottomSheet)");
    }
}
