package com.ybsdk.feature.main.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/UnbindAccountSheetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/main/internal/data/network/dto/UnbindAccountSheetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/main/internal/data/network/dto/UnbindAccountSheetButtonDto;", "unbindAccountSheetButtonDtoAdapter", "Lcom/ybsdk/feature/main/internal/data/network/dto/UnbindAccountSnackbarDto;", "unbindAccountSnackbarDtoAdapter", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnbindAccountSheetDtoJsonAdapter extends JsonAdapter<UnbindAccountSheetDto> {
    private final JsonReader.Options options = JsonReader.Options.of("title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "primary_button", "secondary_button", "success_snackbar", "failure_snackbar");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<UnbindAccountSheetButtonDto> unbindAccountSheetButtonDtoAdapter;
    private final JsonAdapter<UnbindAccountSnackbarDto> unbindAccountSnackbarDtoAdapter;

    public UnbindAccountSheetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.unbindAccountSheetButtonDtoAdapter = moshi.adapter(UnbindAccountSheetButtonDto.class, emptySet, "primaryButton");
        this.unbindAccountSnackbarDtoAdapter = moshi.adapter(UnbindAccountSnackbarDto.class, emptySet, "successSnackbar");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final UnbindAccountSheetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        UnbindAccountSheetButtonDto unbindAccountSheetButtonDto = null;
        UnbindAccountSheetButtonDto unbindAccountSheetButtonDto2 = null;
        UnbindAccountSnackbarDto unbindAccountSnackbarDto = null;
        UnbindAccountSnackbarDto unbindAccountSnackbarDto2 = null;
        while (true) {
            String str3 = str;
            String str4 = str2;
            if (!jsonReader.hasNext()) {
                UnbindAccountSheetButtonDto unbindAccountSheetButtonDto3 = unbindAccountSheetButtonDto;
                jsonReader.endObject();
                if (str3 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (str4 == null) {
                    throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                }
                if (unbindAccountSheetButtonDto3 == null) {
                    throw Util.missingProperty("primaryButton", "primary_button", jsonReader);
                }
                if (unbindAccountSheetButtonDto2 == null) {
                    throw Util.missingProperty("secondaryButton", "secondary_button", jsonReader);
                }
                if (unbindAccountSnackbarDto == null) {
                    throw Util.missingProperty("successSnackbar", "success_snackbar", jsonReader);
                }
                if (unbindAccountSnackbarDto2 != null) {
                    return new UnbindAccountSheetDto(str3, str4, unbindAccountSheetButtonDto3, unbindAccountSheetButtonDto2, unbindAccountSnackbarDto, unbindAccountSnackbarDto2);
                }
                throw Util.missingProperty("failureSnackbar", "failure_snackbar", jsonReader);
            }
            UnbindAccountSheetButtonDto unbindAccountSheetButtonDto4 = unbindAccountSheetButtonDto;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    unbindAccountSheetButtonDto = unbindAccountSheetButtonDto4;
                    str = str3;
                    str2 = str4;
                case 0:
                    String fromJson = this.stringAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    str = fromJson;
                    unbindAccountSheetButtonDto = unbindAccountSheetButtonDto4;
                    str2 = str4;
                case 1:
                    String fromJson2 = this.stringAdapter.fromJson(jsonReader);
                    if (fromJson2 == null) {
                        throw Util.unexpectedNull(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                    }
                    str2 = fromJson2;
                    unbindAccountSheetButtonDto = unbindAccountSheetButtonDto4;
                    str = str3;
                case 2:
                    unbindAccountSheetButtonDto = this.unbindAccountSheetButtonDtoAdapter.fromJson(jsonReader);
                    if (unbindAccountSheetButtonDto == null) {
                        throw Util.unexpectedNull("primaryButton", "primary_button", jsonReader);
                    }
                    str = str3;
                    str2 = str4;
                case 3:
                    unbindAccountSheetButtonDto2 = this.unbindAccountSheetButtonDtoAdapter.fromJson(jsonReader);
                    if (unbindAccountSheetButtonDto2 == null) {
                        throw Util.unexpectedNull("secondaryButton", "secondary_button", jsonReader);
                    }
                    unbindAccountSheetButtonDto = unbindAccountSheetButtonDto4;
                    str = str3;
                    str2 = str4;
                case 4:
                    unbindAccountSnackbarDto = this.unbindAccountSnackbarDtoAdapter.fromJson(jsonReader);
                    if (unbindAccountSnackbarDto == null) {
                        throw Util.unexpectedNull("successSnackbar", "success_snackbar", jsonReader);
                    }
                    unbindAccountSheetButtonDto = unbindAccountSheetButtonDto4;
                    str = str3;
                    str2 = str4;
                case 5:
                    unbindAccountSnackbarDto2 = this.unbindAccountSnackbarDtoAdapter.fromJson(jsonReader);
                    if (unbindAccountSnackbarDto2 == null) {
                        throw Util.unexpectedNull("failureSnackbar", "failure_snackbar", jsonReader);
                    }
                    unbindAccountSheetButtonDto = unbindAccountSheetButtonDto4;
                    str = str3;
                    str2 = str4;
                default:
                    unbindAccountSheetButtonDto = unbindAccountSheetButtonDto4;
                    str = str3;
                    str2 = str4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, UnbindAccountSheetDto unbindAccountSheetDto) {
        UnbindAccountSheetDto unbindAccountSheetDto2 = unbindAccountSheetDto;
        if (unbindAccountSheetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) unbindAccountSheetDto2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) unbindAccountSheetDto2.getDescription());
        jsonWriter.name("primary_button");
        this.unbindAccountSheetButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) unbindAccountSheetDto2.getPrimaryButton());
        jsonWriter.name("secondary_button");
        this.unbindAccountSheetButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) unbindAccountSheetDto2.getSecondaryButton());
        jsonWriter.name("success_snackbar");
        this.unbindAccountSnackbarDtoAdapter.toJson(jsonWriter, (JsonWriter) unbindAccountSheetDto2.getSuccessSnackbar());
        jsonWriter.name("failure_snackbar");
        this.unbindAccountSnackbarDtoAdapter.toJson(jsonWriter, (JsonWriter) unbindAccountSheetDto2.getFailureSnackbar());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(UnbindAccountSheetDto)");
    }
}
