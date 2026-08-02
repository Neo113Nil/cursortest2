package com.ybsdk.feature.kyc.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/network/dto/CameraPageContentDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/kyc/internal/network/dto/CameraPageContentDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "nullableThemedParameterOfStringAdapter", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CameraPageContentDtoJsonAdapter extends JsonAdapter<CameraPageContentDto> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<ThemedParameter<String>> nullableThemedParameterOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("document_type", "title", "tip_text", "upload_error_text", "camera_lens", "info_bottom_sheet_deeplink", "tip_image", "back_button_deeplink", "enter_page_deeplink");
    private final JsonAdapter<String> stringAdapter;

    public CameraPageContentDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "documentType");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "infoDeeplink");
        this.nullableThemedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, "tipImage");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CameraPageContentDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        ThemedParameter<String> themedParameter = null;
        String str7 = null;
        String str8 = null;
        while (true) {
            String str9 = str;
            String str10 = str2;
            String str11 = str3;
            String str12 = str4;
            String str13 = str5;
            String str14 = str6;
            if (!jsonReader.hasNext()) {
                ThemedParameter<String> themedParameter2 = themedParameter;
                jsonReader.endObject();
                if (str9 == null) {
                    throw Util.missingProperty("documentType", "document_type", jsonReader);
                }
                if (str10 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (str11 == null) {
                    throw Util.missingProperty("tipText", "tip_text", jsonReader);
                }
                if (str12 == null) {
                    throw Util.missingProperty("uploadErrorText", "upload_error_text", jsonReader);
                }
                if (str13 == null) {
                    throw Util.missingProperty("cameraLens", "camera_lens", jsonReader);
                }
                if (str7 != null) {
                    return new CameraPageContentDto(str9, str10, str11, str12, str13, str14, themedParameter2, str7, str8);
                }
                throw Util.missingProperty("backButtonDeeplink", "back_button_deeplink", jsonReader);
            }
            ThemedParameter<String> themedParameter3 = themedParameter;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    themedParameter = themedParameter3;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("documentType", "document_type", jsonReader);
                    }
                    themedParameter = themedParameter3;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    themedParameter = themedParameter3;
                    str = str9;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("tipText", "tip_text", jsonReader);
                    }
                    themedParameter = themedParameter3;
                    str = str9;
                    str2 = str10;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                case 3:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("uploadErrorText", "upload_error_text", jsonReader);
                    }
                    themedParameter = themedParameter3;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str5 = str13;
                    str6 = str14;
                case 4:
                    str5 = this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("cameraLens", "camera_lens", jsonReader);
                    }
                    themedParameter = themedParameter3;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str6 = str14;
                case 5:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    themedParameter = themedParameter3;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                case 6:
                    themedParameter = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                case 7:
                    str7 = this.stringAdapter.fromJson(jsonReader);
                    if (str7 == null) {
                        throw Util.unexpectedNull("backButtonDeeplink", "back_button_deeplink", jsonReader);
                    }
                    themedParameter = themedParameter3;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                case 8:
                    str8 = this.nullableStringAdapter.fromJson(jsonReader);
                    themedParameter = themedParameter3;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
                default:
                    themedParameter = themedParameter3;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                    str5 = str13;
                    str6 = str14;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CameraPageContentDto cameraPageContentDto) {
        CameraPageContentDto cameraPageContentDto2 = cameraPageContentDto;
        if (cameraPageContentDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("document_type");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) cameraPageContentDto2.getDocumentType());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) cameraPageContentDto2.getTitle());
        jsonWriter.name("tip_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) cameraPageContentDto2.getTipText());
        jsonWriter.name("upload_error_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) cameraPageContentDto2.getUploadErrorText());
        jsonWriter.name("camera_lens");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) cameraPageContentDto2.getCameraLens());
        jsonWriter.name("info_bottom_sheet_deeplink");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) cameraPageContentDto2.getInfoDeeplink());
        jsonWriter.name("tip_image");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) cameraPageContentDto2.getTipImage());
        jsonWriter.name("back_button_deeplink");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) cameraPageContentDto2.getBackButtonDeeplink());
        jsonWriter.name("enter_page_deeplink");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) cameraPageContentDto2.getEnterPageDeeplink());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(CameraPageContentDto)");
    }
}
