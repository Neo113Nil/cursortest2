package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.impl.C0553n3;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/rconfig/configs/DashboardV3ProductJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/DashboardV3Product;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/TitleText;", "titleTextAdapter", "Lcom/ybsdk/rconfig/configs/Background;", "backgroundAdapter", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "themedParameterOfStringAdapter", "Lcom/ybsdk/rconfig/configs/Balance;", "balanceAdapter", "nullableThemedParameterOfStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DashboardV3ProductJsonAdapter extends JsonAdapter<DashboardV3Product> {
    private final JsonAdapter<Background> backgroundAdapter;
    private final JsonAdapter<Balance> balanceAdapter;
    private volatile Constructor<DashboardV3Product> constructorRef;
    private final JsonAdapter<ThemedParameter<String>> nullableThemedParameterOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("product_id", "title", C0553n3.g, "title_logo", "balance", "icon_after_title");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<ThemedParameter<String>> themedParameterOfStringAdapter;
    private final JsonAdapter<TitleText> titleTextAdapter;

    public DashboardV3ProductJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "productId");
        this.titleTextAdapter = moshi.adapter(TitleText.class, emptySet, "title");
        this.backgroundAdapter = moshi.adapter(Background.class, emptySet, C0553n3.g);
        this.themedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, "titleLogo");
        this.balanceAdapter = moshi.adapter(Balance.class, emptySet, "balance");
        this.nullableThemedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, "iconAfterTitle");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DashboardV3Product fromJson(JsonReader jsonReader) {
        int i;
        jsonReader.beginObject();
        int i2 = -1;
        String str = null;
        TitleText titleText = null;
        Background background = null;
        ThemedParameter<String> themedParameter = null;
        Balance balance = null;
        ThemedParameter<String> themedParameter2 = null;
        while (jsonReader.hasNext()) {
            String str2 = str;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("productId", "product_id", jsonReader);
                    }
                    continue;
                case 1:
                    titleText = this.titleTextAdapter.fromJson(jsonReader);
                    if (titleText == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 2:
                    background = this.backgroundAdapter.fromJson(jsonReader);
                    if (background == null) {
                        throw Util.unexpectedNull(C0553n3.g, C0553n3.g, jsonReader);
                    }
                    break;
                case 3:
                    themedParameter = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                    if (themedParameter == null) {
                        throw Util.unexpectedNull("titleLogo", "title_logo", jsonReader);
                    }
                    break;
                case 4:
                    balance = this.balanceAdapter.fromJson(jsonReader);
                    if (balance == null) {
                        throw Util.unexpectedNull("balance", "balance", jsonReader);
                    }
                    break;
                case 5:
                    themedParameter2 = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
                    str = str2;
                    i2 = -33;
                    continue;
            }
            str = str2;
        }
        String str3 = str;
        jsonReader.endObject();
        if (i2 == -33) {
            if (str3 == null) {
                throw Util.missingProperty("productId", "product_id", jsonReader);
            }
            if (titleText == null) {
                throw Util.missingProperty("title", "title", jsonReader);
            }
            if (background == null) {
                throw Util.missingProperty(C0553n3.g, C0553n3.g, jsonReader);
            }
            if (themedParameter == null) {
                throw Util.missingProperty("titleLogo", "title_logo", jsonReader);
            }
            if (balance == null) {
                throw Util.missingProperty("balance", "balance", jsonReader);
            }
            ThemedParameter<String> themedParameter3 = themedParameter2;
            Balance balance2 = balance;
            return new DashboardV3Product(str3, titleText, background, themedParameter, balance2, themedParameter3);
        }
        Constructor<DashboardV3Product> constructor = this.constructorRef;
        if (constructor == null) {
            i = i2;
            constructor = DashboardV3Product.class.getDeclaredConstructor(String.class, TitleText.class, Background.class, ThemedParameter.class, Balance.class, ThemedParameter.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        } else {
            i = i2;
        }
        Constructor<DashboardV3Product> constructor2 = constructor;
        if (str3 == null) {
            throw Util.missingProperty("productId", "product_id", jsonReader);
        }
        if (titleText == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (background == null) {
            throw Util.missingProperty(C0553n3.g, C0553n3.g, jsonReader);
        }
        if (themedParameter == null) {
            throw Util.missingProperty("titleLogo", "title_logo", jsonReader);
        }
        if (balance != null) {
            return constructor2.newInstance(str3, titleText, background, themedParameter, balance, themedParameter2, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("balance", "balance", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DashboardV3Product dashboardV3Product) {
        DashboardV3Product dashboardV3Product2 = dashboardV3Product;
        if (dashboardV3Product2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("product_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) dashboardV3Product2.getProductId());
        jsonWriter.name("title");
        this.titleTextAdapter.toJson(jsonWriter, (JsonWriter) dashboardV3Product2.getTitle());
        jsonWriter.name(C0553n3.g);
        this.backgroundAdapter.toJson(jsonWriter, (JsonWriter) dashboardV3Product2.getBackground());
        jsonWriter.name("title_logo");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) dashboardV3Product2.getTitleLogo());
        jsonWriter.name("balance");
        this.balanceAdapter.toJson(jsonWriter, (JsonWriter) dashboardV3Product2.getBalance());
        jsonWriter.name("icon_after_title");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) dashboardV3Product2.getIconAfterTitle());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(DashboardV3Product)");
    }
}
