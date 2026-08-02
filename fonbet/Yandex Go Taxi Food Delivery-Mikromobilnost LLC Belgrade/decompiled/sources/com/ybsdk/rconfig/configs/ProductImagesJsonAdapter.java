package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/rconfig/configs/ProductImagesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/ProductImages;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/rconfig/configs/CardImages;", "nullableCardImagesAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ProductImagesJsonAdapter extends JsonAdapter<ProductImages> {
    private volatile Constructor<ProductImages> constructorRef;
    private final JsonAdapter<CardImages> nullableCardImagesAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("PRO", "WALLET", "CREDIT_LIMIT", "CORP_CARD");

    public ProductImagesJsonAdapter(Moshi moshi) {
        this.nullableCardImagesAdapter = moshi.adapter(CardImages.class, EmptySet.a, "pro");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ProductImages fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        CardImages cardImages = null;
        CardImages cardImages2 = null;
        CardImages cardImages3 = null;
        CardImages cardImages4 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                cardImages = this.nullableCardImagesAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (selectName == 1) {
                cardImages2 = this.nullableCardImagesAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (selectName == 2) {
                cardImages3 = this.nullableCardImagesAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (selectName == 3) {
                cardImages4 = this.nullableCardImagesAdapter.fromJson(jsonReader);
                i &= -9;
            }
        }
        jsonReader.endObject();
        if (i == -16) {
            return new ProductImages(cardImages, cardImages2, cardImages3, cardImages4);
        }
        Constructor<ProductImages> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ProductImages.class.getDeclaredConstructor(CardImages.class, CardImages.class, CardImages.class, CardImages.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(cardImages, cardImages2, cardImages3, cardImages4, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ProductImages productImages) {
        ProductImages productImages2 = productImages;
        if (productImages2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("PRO");
        this.nullableCardImagesAdapter.toJson(jsonWriter, (JsonWriter) productImages2.getPro());
        jsonWriter.name("WALLET");
        this.nullableCardImagesAdapter.toJson(jsonWriter, (JsonWriter) productImages2.getWallet());
        jsonWriter.name("CREDIT_LIMIT");
        this.nullableCardImagesAdapter.toJson(jsonWriter, (JsonWriter) productImages2.getCreditLimit());
        jsonWriter.name("CORP_CARD");
        this.nullableCardImagesAdapter.toJson(jsonWriter, (JsonWriter) productImages2.getCorpCard());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(ProductImages)");
    }
}
