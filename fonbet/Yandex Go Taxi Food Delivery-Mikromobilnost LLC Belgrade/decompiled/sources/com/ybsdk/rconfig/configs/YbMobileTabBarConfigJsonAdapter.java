package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.rconfig.configs.YbMobileTabBarConfig;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/rconfig/configs/YbMobileTabBarConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/YbMobileTabBarConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/rconfig/configs/YbMobileTabBarConfig$TabBarItem;", "listOfTabBarItemAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/YbMobileTabBarConfig$TsarButtonConfig;", "nullableTsarButtonConfigAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class YbMobileTabBarConfigJsonAdapter extends JsonAdapter<YbMobileTabBarConfig> {
    private volatile Constructor<YbMobileTabBarConfig> constructorRef;
    private final JsonAdapter<List<YbMobileTabBarConfig.TabBarItem>> listOfTabBarItemAdapter;
    private final JsonAdapter<YbMobileTabBarConfig.TsarButtonConfig> nullableTsarButtonConfigAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("items", "tsar_button");

    public YbMobileTabBarConfigJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, YbMobileTabBarConfig.TabBarItem.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfTabBarItemAdapter = moshi.adapter(newParameterizedType, emptySet, "items");
        this.nullableTsarButtonConfigAdapter = moshi.adapter(YbMobileTabBarConfig.TsarButtonConfig.class, emptySet, "tsarButton");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final YbMobileTabBarConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<YbMobileTabBarConfig.TabBarItem> list = null;
        YbMobileTabBarConfig.TsarButtonConfig tsarButtonConfig = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfTabBarItemAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("items", "items", jsonReader);
                }
            } else if (selectName == 1) {
                tsarButtonConfig = this.nullableTsarButtonConfigAdapter.fromJson(jsonReader);
                i = -3;
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (list != null) {
                return new YbMobileTabBarConfig(list, tsarButtonConfig);
            }
            throw Util.missingProperty("items", "items", jsonReader);
        }
        Constructor<YbMobileTabBarConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = YbMobileTabBarConfig.class.getDeclaredConstructor(List.class, YbMobileTabBarConfig.TsarButtonConfig.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (list != null) {
            return constructor.newInstance(list, tsarButtonConfig, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("items", "items", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, YbMobileTabBarConfig ybMobileTabBarConfig) {
        YbMobileTabBarConfig ybMobileTabBarConfig2 = ybMobileTabBarConfig;
        if (ybMobileTabBarConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("items");
        this.listOfTabBarItemAdapter.toJson(jsonWriter, (JsonWriter) ybMobileTabBarConfig2.getItems());
        jsonWriter.name("tsar_button");
        this.nullableTsarButtonConfigAdapter.toJson(jsonWriter, (JsonWriter) ybMobileTabBarConfig2.getTsarButton());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(YbMobileTabBarConfig)");
    }
}
