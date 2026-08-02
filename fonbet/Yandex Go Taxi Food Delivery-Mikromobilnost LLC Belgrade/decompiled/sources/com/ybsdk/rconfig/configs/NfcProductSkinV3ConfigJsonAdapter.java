package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.rconfig.model.ThemedImage;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.impl.C0553n3;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR&\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcProductSkinV3ConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/NfcProductSkinV3Config;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "", "themedParameterOfListOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/rconfig/model/ThemedImage;", "nullableThemedImageAdapter", "nullableThemedParameterOfStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NfcProductSkinV3ConfigJsonAdapter extends JsonAdapter<NfcProductSkinV3Config> {
    private volatile Constructor<NfcProductSkinV3Config> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<ThemedImage> nullableThemedImageAdapter;
    private final JsonAdapter<ThemedParameter<String>> nullableThemedParameterOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("rays_gradient", "title", "icon", C0553n3.g, "title_color", "selection_color", "payment_gradient_color", "background_color", "balance_shimmer_color", "balance_skeleton_color");
    private final JsonAdapter<ThemedParameter<List<String>>> themedParameterOfListOfStringAdapter;

    public NfcProductSkinV3ConfigJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(ThemedParameter.class, Types.newParameterizedType(List.class, String.class));
        EmptySet emptySet = EmptySet.a;
        this.themedParameterOfListOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "raysGradient");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableThemedImageAdapter = moshi.adapter(ThemedImage.class, emptySet, "icon");
        this.nullableThemedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, "titleColor");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NfcProductSkinV3Config fromJson(JsonReader jsonReader) {
        int i;
        jsonReader.beginObject();
        int i2 = -1;
        ThemedParameter<List<String>> themedParameter = null;
        String str = null;
        ThemedImage themedImage = null;
        ThemedImage themedImage2 = null;
        ThemedParameter<String> themedParameter2 = null;
        ThemedParameter<String> themedParameter3 = null;
        ThemedParameter<String> themedParameter4 = null;
        ThemedParameter<String> themedParameter5 = null;
        ThemedParameter<String> themedParameter6 = null;
        ThemedParameter<String> themedParameter7 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    themedParameter = this.themedParameterOfListOfStringAdapter.fromJson(jsonReader);
                    if (themedParameter == null) {
                        throw Util.unexpectedNull("raysGradient", "rays_gradient", jsonReader);
                    }
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -3;
                    break;
                case 2:
                    themedImage = this.nullableThemedImageAdapter.fromJson(jsonReader);
                    i2 &= -5;
                    break;
                case 3:
                    themedImage2 = this.nullableThemedImageAdapter.fromJson(jsonReader);
                    i2 &= -9;
                    break;
                case 4:
                    themedParameter2 = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
                    i2 &= -17;
                    break;
                case 5:
                    themedParameter3 = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
                    i2 &= -33;
                    break;
                case 6:
                    themedParameter4 = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    themedParameter5 = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
                    i2 &= -129;
                    break;
                case 8:
                    themedParameter6 = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
                    i2 &= -257;
                    break;
                case 9:
                    themedParameter7 = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
                    i2 &= -513;
                    break;
            }
        }
        jsonReader.endObject();
        if (i2 == -959) {
            ThemedParameter<String> themedParameter8 = themedParameter6;
            ThemedParameter<String> themedParameter9 = themedParameter5;
            ThemedParameter<String> themedParameter10 = themedParameter4;
            ThemedParameter<String> themedParameter11 = themedParameter3;
            ThemedParameter<String> themedParameter12 = themedParameter2;
            ThemedImage themedImage3 = themedImage2;
            ThemedImage themedImage4 = themedImage;
            String str2 = str;
            ThemedParameter<List<String>> themedParameter13 = themedParameter;
            if (themedParameter13 != null) {
                return new NfcProductSkinV3Config(themedParameter13, str2, themedImage4, themedImage3, themedParameter12, themedParameter11, themedParameter10, themedParameter9, themedParameter8, themedParameter7);
            }
            throw Util.missingProperty("raysGradient", "rays_gradient", jsonReader);
        }
        ThemedParameter<String> themedParameter14 = themedParameter6;
        ThemedParameter<String> themedParameter15 = themedParameter5;
        ThemedParameter<String> themedParameter16 = themedParameter4;
        ThemedParameter<String> themedParameter17 = themedParameter3;
        ThemedParameter<String> themedParameter18 = themedParameter2;
        ThemedImage themedImage5 = themedImage2;
        ThemedImage themedImage6 = themedImage;
        String str3 = str;
        ThemedParameter<List<String>> themedParameter19 = themedParameter;
        Constructor<NfcProductSkinV3Config> constructor = this.constructorRef;
        if (constructor == null) {
            i = i2;
            constructor = NfcProductSkinV3Config.class.getDeclaredConstructor(ThemedParameter.class, String.class, ThemedImage.class, ThemedImage.class, ThemedParameter.class, ThemedParameter.class, ThemedParameter.class, ThemedParameter.class, ThemedParameter.class, ThemedParameter.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        } else {
            i = i2;
        }
        Constructor<NfcProductSkinV3Config> constructor2 = constructor;
        if (themedParameter19 == null) {
            throw Util.missingProperty("raysGradient", "rays_gradient", jsonReader);
        }
        return constructor2.newInstance(themedParameter19, str3, themedImage6, themedImage5, themedParameter18, themedParameter17, themedParameter16, themedParameter15, themedParameter14, themedParameter7, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NfcProductSkinV3Config nfcProductSkinV3Config) {
        NfcProductSkinV3Config nfcProductSkinV3Config2 = nfcProductSkinV3Config;
        if (nfcProductSkinV3Config2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("rays_gradient");
        this.themedParameterOfListOfStringAdapter.toJson(jsonWriter, (JsonWriter) nfcProductSkinV3Config2.getRaysGradient());
        jsonWriter.name("title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) nfcProductSkinV3Config2.getTitle());
        jsonWriter.name("icon");
        this.nullableThemedImageAdapter.toJson(jsonWriter, (JsonWriter) nfcProductSkinV3Config2.getIcon());
        jsonWriter.name(C0553n3.g);
        this.nullableThemedImageAdapter.toJson(jsonWriter, (JsonWriter) nfcProductSkinV3Config2.getBackground());
        jsonWriter.name("title_color");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) nfcProductSkinV3Config2.getTitleColor());
        jsonWriter.name("selection_color");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) nfcProductSkinV3Config2.getSelectionColor());
        jsonWriter.name("payment_gradient_color");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) nfcProductSkinV3Config2.getPaymentGradientColor());
        jsonWriter.name("background_color");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) nfcProductSkinV3Config2.getBackgroundColor());
        jsonWriter.name("balance_shimmer_color");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) nfcProductSkinV3Config2.getBalanceShimmerColor());
        jsonWriter.name("balance_skeleton_color");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) nfcProductSkinV3Config2.getBalanceSkeletonColor());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(NfcProductSkinV3Config)");
    }
}
