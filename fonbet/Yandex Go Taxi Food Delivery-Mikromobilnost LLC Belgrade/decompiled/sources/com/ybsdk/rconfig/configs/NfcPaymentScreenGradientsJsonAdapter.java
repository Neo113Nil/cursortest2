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
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR&\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcPaymentScreenGradientsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/NfcPaymentScreenGradients;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "", "themedParameterOfListOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableThemedParameterOfListOfStringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NfcPaymentScreenGradientsJsonAdapter extends JsonAdapter<NfcPaymentScreenGradients> {
    private final JsonAdapter<ThemedParameter<List<String>>> nullableThemedParameterOfListOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("plus", "pro", "split", "corp_card");
    private final JsonAdapter<ThemedParameter<List<String>>> themedParameterOfListOfStringAdapter;

    public NfcPaymentScreenGradientsJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(ThemedParameter.class, Types.newParameterizedType(List.class, String.class));
        EmptySet emptySet = EmptySet.a;
        this.themedParameterOfListOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "plus");
        this.nullableThemedParameterOfListOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, Types.newParameterizedType(List.class, String.class)), emptySet, "corpcard");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NfcPaymentScreenGradients fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ThemedParameter<List<String>> themedParameter = null;
        ThemedParameter<List<String>> themedParameter2 = null;
        ThemedParameter<List<String>> themedParameter3 = null;
        ThemedParameter<List<String>> themedParameter4 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                themedParameter = this.themedParameterOfListOfStringAdapter.fromJson(jsonReader);
                if (themedParameter == null) {
                    throw Util.unexpectedNull("plus", "plus", jsonReader);
                }
            } else if (selectName == 1) {
                themedParameter2 = this.themedParameterOfListOfStringAdapter.fromJson(jsonReader);
                if (themedParameter2 == null) {
                    throw Util.unexpectedNull("pro", "pro", jsonReader);
                }
            } else if (selectName == 2) {
                themedParameter3 = this.themedParameterOfListOfStringAdapter.fromJson(jsonReader);
                if (themedParameter3 == null) {
                    throw Util.unexpectedNull("split", "split", jsonReader);
                }
            } else if (selectName == 3) {
                themedParameter4 = this.nullableThemedParameterOfListOfStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (themedParameter == null) {
            throw Util.missingProperty("plus", "plus", jsonReader);
        }
        if (themedParameter2 == null) {
            throw Util.missingProperty("pro", "pro", jsonReader);
        }
        if (themedParameter3 != null) {
            return new NfcPaymentScreenGradients(themedParameter, themedParameter2, themedParameter3, themedParameter4);
        }
        throw Util.missingProperty("split", "split", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NfcPaymentScreenGradients nfcPaymentScreenGradients) {
        NfcPaymentScreenGradients nfcPaymentScreenGradients2 = nfcPaymentScreenGradients;
        if (nfcPaymentScreenGradients2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("plus");
        this.themedParameterOfListOfStringAdapter.toJson(jsonWriter, (JsonWriter) nfcPaymentScreenGradients2.getPlus());
        jsonWriter.name("pro");
        this.themedParameterOfListOfStringAdapter.toJson(jsonWriter, (JsonWriter) nfcPaymentScreenGradients2.getPro());
        jsonWriter.name("split");
        this.themedParameterOfListOfStringAdapter.toJson(jsonWriter, (JsonWriter) nfcPaymentScreenGradients2.getSplit());
        jsonWriter.name("corp_card");
        this.nullableThemedParameterOfListOfStringAdapter.toJson(jsonWriter, (JsonWriter) nfcPaymentScreenGradients2.getCorpcard());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(NfcPaymentScreenGradients)");
    }
}
