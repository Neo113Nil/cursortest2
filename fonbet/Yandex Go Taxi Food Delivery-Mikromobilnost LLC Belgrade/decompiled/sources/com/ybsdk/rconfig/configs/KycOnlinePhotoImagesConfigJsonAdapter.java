package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.ybsdk.rconfig.model.ThemedImage;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/rconfig/configs/KycOnlinePhotoImagesConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/KycOnlinePhotoImagesConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/rconfig/model/ThemedImage;", "nullableThemedImageAdapter", "Lcom/squareup/moshi/JsonAdapter;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class KycOnlinePhotoImagesConfigJsonAdapter extends JsonAdapter<KycOnlinePhotoImagesConfig> {
    private final JsonAdapter<ThemedImage> nullableThemedImageAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("overlay_message_selfie_image", "mandatory_geo_deadend", "mandatory_geo_explanation", "guide_main_page_left", "guide_main_page_right", "guide_selfie");

    public KycOnlinePhotoImagesConfigJsonAdapter(Moshi moshi) {
        this.nullableThemedImageAdapter = moshi.adapter(ThemedImage.class, EmptySet.a, "selfieBottomSheetImage");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final KycOnlinePhotoImagesConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ThemedImage themedImage = null;
        ThemedImage themedImage2 = null;
        ThemedImage themedImage3 = null;
        ThemedImage themedImage4 = null;
        ThemedImage themedImage5 = null;
        ThemedImage themedImage6 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    themedImage = this.nullableThemedImageAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    themedImage2 = this.nullableThemedImageAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    themedImage3 = this.nullableThemedImageAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    themedImage4 = this.nullableThemedImageAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    themedImage5 = this.nullableThemedImageAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    themedImage6 = this.nullableThemedImageAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        return new KycOnlinePhotoImagesConfig(themedImage, themedImage2, themedImage3, themedImage4, themedImage5, themedImage6);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, KycOnlinePhotoImagesConfig kycOnlinePhotoImagesConfig) {
        KycOnlinePhotoImagesConfig kycOnlinePhotoImagesConfig2 = kycOnlinePhotoImagesConfig;
        if (kycOnlinePhotoImagesConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("overlay_message_selfie_image");
        this.nullableThemedImageAdapter.toJson(jsonWriter, (JsonWriter) kycOnlinePhotoImagesConfig2.getSelfieBottomSheetImage());
        jsonWriter.name("mandatory_geo_deadend");
        this.nullableThemedImageAdapter.toJson(jsonWriter, (JsonWriter) kycOnlinePhotoImagesConfig2.getMandatoryGeoDeadend());
        jsonWriter.name("mandatory_geo_explanation");
        this.nullableThemedImageAdapter.toJson(jsonWriter, (JsonWriter) kycOnlinePhotoImagesConfig2.getMandatoryGeoExplanation());
        jsonWriter.name("guide_main_page_left");
        this.nullableThemedImageAdapter.toJson(jsonWriter, (JsonWriter) kycOnlinePhotoImagesConfig2.getGuideMainPageLeft());
        jsonWriter.name("guide_main_page_right");
        this.nullableThemedImageAdapter.toJson(jsonWriter, (JsonWriter) kycOnlinePhotoImagesConfig2.getGuideMainPageRight());
        jsonWriter.name("guide_selfie");
        this.nullableThemedImageAdapter.toJson(jsonWriter, (JsonWriter) kycOnlinePhotoImagesConfig2.getGuideSelfie());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(KycOnlinePhotoImagesConfig)");
    }
}
