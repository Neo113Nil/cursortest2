package com.ybsdk.rconfig.configs;

import com.adjust.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.rconfig.model.ThemedImage;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/rconfig/configs/WatchBannerJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/WatchBanner;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/model/ThemedImage;", "nullableThemedImageAdapter", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "themedParameterOfStringAdapter", "Lcom/ybsdk/rconfig/configs/WatchFeature;", "watchFeatureAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class WatchBannerJsonAdapter extends JsonAdapter<WatchBanner> {
    private volatile Constructor<WatchBanner> constructorRef;
    private final JsonAdapter<ThemedImage> nullableThemedImageAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "subtitle", "icon", "background_color", Constants.DEEPLINK, "require_feature");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<ThemedParameter<String>> themedParameterOfStringAdapter;
    private final JsonAdapter<WatchFeature> watchFeatureAdapter;

    public WatchBannerJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableThemedImageAdapter = moshi.adapter(ThemedImage.class, emptySet, "icon");
        this.themedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, UrbanAdsBottomSheetFragment.BACKGROUND_COLOR);
        this.watchFeatureAdapter = moshi.adapter(WatchFeature.class, emptySet, "requireFeature");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final WatchBanner fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        String str2 = null;
        ThemedImage themedImage = null;
        ThemedParameter<String> themedParameter = null;
        String str3 = null;
        WatchFeature watchFeature = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("subtitle", "subtitle", jsonReader);
                    }
                    break;
                case 2:
                    themedImage = this.nullableThemedImageAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    themedParameter = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                    if (themedParameter == null) {
                        throw Util.unexpectedNull(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
                    }
                    break;
                case 4:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull(Constants.DEEPLINK, Constants.DEEPLINK, jsonReader);
                    }
                    break;
                case 5:
                    watchFeature = this.watchFeatureAdapter.fromJson(jsonReader);
                    if (watchFeature == null) {
                        throw Util.unexpectedNull("requireFeature", "require_feature", jsonReader);
                    }
                    i = -33;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -33) {
            WatchFeature watchFeature2 = watchFeature;
            String str4 = str3;
            ThemedParameter<String> themedParameter2 = themedParameter;
            ThemedImage themedImage2 = themedImage;
            String str5 = str2;
            String str6 = str;
            if (str6 == null) {
                throw Util.missingProperty("title", "title", jsonReader);
            }
            if (str5 == null) {
                throw Util.missingProperty("subtitle", "subtitle", jsonReader);
            }
            if (themedParameter2 == null) {
                throw Util.missingProperty(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
            }
            if (str4 != null) {
                return new WatchBanner(str6, str5, themedImage2, themedParameter2, str4, watchFeature2);
            }
            throw Util.missingProperty(Constants.DEEPLINK, Constants.DEEPLINK, jsonReader);
        }
        WatchFeature watchFeature3 = watchFeature;
        String str7 = str3;
        ThemedParameter<String> themedParameter3 = themedParameter;
        ThemedImage themedImage3 = themedImage;
        String str8 = str2;
        String str9 = str;
        Constructor<WatchBanner> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = WatchBanner.class.getDeclaredConstructor(String.class, String.class, ThemedImage.class, ThemedParameter.class, String.class, WatchFeature.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str9 == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (str8 == null) {
            throw Util.missingProperty("subtitle", "subtitle", jsonReader);
        }
        if (themedParameter3 == null) {
            throw Util.missingProperty(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
        }
        if (str7 != null) {
            return constructor.newInstance(str9, str8, themedImage3, themedParameter3, str7, watchFeature3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty(Constants.DEEPLINK, Constants.DEEPLINK, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, WatchBanner watchBanner) {
        WatchBanner watchBanner2 = watchBanner;
        if (watchBanner2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) watchBanner2.getTitle());
        jsonWriter.name("subtitle");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) watchBanner2.getSubtitle());
        jsonWriter.name("icon");
        this.nullableThemedImageAdapter.toJson(jsonWriter, (JsonWriter) watchBanner2.getIcon());
        jsonWriter.name("background_color");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) watchBanner2.getBackgroundColor());
        jsonWriter.name(Constants.DEEPLINK);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) watchBanner2.getDeeplink());
        jsonWriter.name("require_feature");
        this.watchFeatureAdapter.toJson(jsonWriter, (JsonWriter) watchBanner2.getRequireFeature());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(33, "GeneratedJsonAdapter(WatchBanner)");
    }
}
