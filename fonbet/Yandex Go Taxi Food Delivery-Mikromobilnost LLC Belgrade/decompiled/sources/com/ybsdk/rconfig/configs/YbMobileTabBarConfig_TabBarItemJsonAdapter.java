package com.ybsdk.rconfig.configs;

import com.adjust.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.rconfig.configs.YbMobileTabBarConfig;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/rconfig/configs/YbMobileTabBarConfig_TabBarItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/YbMobileTabBarConfig$TabBarItem;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/utils/text/Text;", "textAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class YbMobileTabBarConfig_TabBarItemJsonAdapter extends JsonAdapter<YbMobileTabBarConfig.TabBarItem> {
    private volatile Constructor<YbMobileTabBarConfig.TabBarItem> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "title", "image_id", Constants.DEEPLINK);
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Text> textAdapter;

    public YbMobileTabBarConfig_TabBarItemJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.textAdapter = moshi.adapter(Text.class, emptySet, "title");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, Constants.DEEPLINK);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final YbMobileTabBarConfig.TabBarItem fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Text text = null;
        String str2 = null;
        String str3 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("id", "id", jsonReader);
                }
            } else if (selectName == 1) {
                text = this.textAdapter.fromJson(jsonReader);
                if (text == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 2) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("imageId", "image_id", jsonReader);
                }
            } else if (selectName == 3) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
                i = -9;
            }
        }
        jsonReader.endObject();
        if (i == -9) {
            if (str == null) {
                throw Util.missingProperty("id", "id", jsonReader);
            }
            if (text == null) {
                throw Util.missingProperty("title", "title", jsonReader);
            }
            if (str2 != null) {
                return new YbMobileTabBarConfig.TabBarItem(str, text, str2, str3);
            }
            throw Util.missingProperty("imageId", "image_id", jsonReader);
        }
        Constructor<YbMobileTabBarConfig.TabBarItem> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = YbMobileTabBarConfig.TabBarItem.class.getDeclaredConstructor(String.class, Text.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str == null) {
            throw Util.missingProperty("id", "id", jsonReader);
        }
        if (text == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (str2 != null) {
            return constructor.newInstance(str, text, str2, str3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("imageId", "image_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, YbMobileTabBarConfig.TabBarItem tabBarItem) {
        YbMobileTabBarConfig.TabBarItem tabBarItem2 = tabBarItem;
        if (tabBarItem2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) tabBarItem2.getId());
        jsonWriter.name("title");
        this.textAdapter.toJson(jsonWriter, (JsonWriter) tabBarItem2.getTitle());
        jsonWriter.name("image_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) tabBarItem2.getImageId());
        jsonWriter.name(Constants.DEEPLINK);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) tabBarItem2.getDeeplink());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(53, "GeneratedJsonAdapter(YbMobileTabBarConfig.TabBarItem)");
    }
}
