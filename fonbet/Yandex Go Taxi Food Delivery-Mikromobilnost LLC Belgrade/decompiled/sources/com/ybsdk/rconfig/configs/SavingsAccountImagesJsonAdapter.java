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
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/rconfig/configs/SavingsAccountImagesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/SavingsAccountImages;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "themedParameterOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SavingsAccountImagesJsonAdapter extends JsonAdapter<SavingsAccountImages> {
    private final JsonReader.Options options = JsonReader.Options.of("saver_closing", "spending_lock", "spending_unlock", "opening_timeout");
    private final JsonAdapter<ThemedParameter<String>> themedParameterOfStringAdapter;

    public SavingsAccountImagesJsonAdapter(Moshi moshi) {
        this.themedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), EmptySet.a, "saverClosing");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SavingsAccountImages fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ThemedParameter<String> themedParameter = null;
        ThemedParameter<String> themedParameter2 = null;
        ThemedParameter<String> themedParameter3 = null;
        ThemedParameter<String> themedParameter4 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                themedParameter = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                if (themedParameter == null) {
                    throw Util.unexpectedNull("saverClosing", "saver_closing", jsonReader);
                }
            } else if (selectName == 1) {
                themedParameter2 = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                if (themedParameter2 == null) {
                    throw Util.unexpectedNull("spendingLock", "spending_lock", jsonReader);
                }
            } else if (selectName == 2) {
                themedParameter3 = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                if (themedParameter3 == null) {
                    throw Util.unexpectedNull("spendingUnlock", "spending_unlock", jsonReader);
                }
            } else if (selectName == 3 && (themedParameter4 = this.themedParameterOfStringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("openingTimeout", "opening_timeout", jsonReader);
            }
        }
        jsonReader.endObject();
        if (themedParameter == null) {
            throw Util.missingProperty("saverClosing", "saver_closing", jsonReader);
        }
        if (themedParameter2 == null) {
            throw Util.missingProperty("spendingLock", "spending_lock", jsonReader);
        }
        if (themedParameter3 == null) {
            throw Util.missingProperty("spendingUnlock", "spending_unlock", jsonReader);
        }
        if (themedParameter4 != null) {
            return new SavingsAccountImages(themedParameter, themedParameter2, themedParameter3, themedParameter4);
        }
        throw Util.missingProperty("openingTimeout", "opening_timeout", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SavingsAccountImages savingsAccountImages) {
        SavingsAccountImages savingsAccountImages2 = savingsAccountImages;
        if (savingsAccountImages2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("saver_closing");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountImages2.getSaverClosing());
        jsonWriter.name("spending_lock");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountImages2.getSpendingLock());
        jsonWriter.name("spending_unlock");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountImages2.getSpendingUnlock());
        jsonWriter.name("opening_timeout");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) savingsAccountImages2.getOpeningTimeout());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(SavingsAccountImages)");
    }
}
