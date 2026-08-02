package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.rconfig.configs.TransfersContactsFuzzySearchConfig;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/rconfig/configs/TransfersContactsFuzzySearchConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/TransfersContactsFuzzySearchConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/TransfersContactsFuzzySearchConfig$Name;", "nameAdapter", "Lcom/ybsdk/rconfig/configs/TransfersContactsFuzzySearchConfig$Phone;", "phoneAdapter", "Lcom/ybsdk/rconfig/configs/TransfersContactsFuzzySearchConfig$Normalization;", "normalizationAdapter", "", "intAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransfersContactsFuzzySearchConfigJsonAdapter extends JsonAdapter<TransfersContactsFuzzySearchConfig> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<TransfersContactsFuzzySearchConfig.Name> nameAdapter;
    private final JsonAdapter<TransfersContactsFuzzySearchConfig.Normalization> normalizationAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("is_enabled", "name", "phone", "normalization", "swap_cost");
    private final JsonAdapter<TransfersContactsFuzzySearchConfig.Phone> phoneAdapter;

    public TransfersContactsFuzzySearchConfigJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "isEnabled");
        this.nameAdapter = moshi.adapter(TransfersContactsFuzzySearchConfig.Name.class, emptySet, "name");
        this.phoneAdapter = moshi.adapter(TransfersContactsFuzzySearchConfig.Phone.class, emptySet, "phone");
        this.normalizationAdapter = moshi.adapter(TransfersContactsFuzzySearchConfig.Normalization.class, emptySet, "normalization");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "swapCost");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransfersContactsFuzzySearchConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        Integer num = null;
        TransfersContactsFuzzySearchConfig.Name name = null;
        TransfersContactsFuzzySearchConfig.Phone phone = null;
        TransfersContactsFuzzySearchConfig.Normalization normalization = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("isEnabled", "is_enabled", jsonReader);
                }
            } else if (selectName == 1) {
                name = this.nameAdapter.fromJson(jsonReader);
                if (name == null) {
                    throw Util.unexpectedNull("name", "name", jsonReader);
                }
            } else if (selectName == 2) {
                phone = this.phoneAdapter.fromJson(jsonReader);
                if (phone == null) {
                    throw Util.unexpectedNull("phone", "phone", jsonReader);
                }
            } else if (selectName == 3) {
                normalization = this.normalizationAdapter.fromJson(jsonReader);
                if (normalization == null) {
                    throw Util.unexpectedNull("normalization", "normalization", jsonReader);
                }
            } else if (selectName == 4 && (num = this.intAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("swapCost", "swap_cost", jsonReader);
            }
        }
        jsonReader.endObject();
        Integer num2 = num;
        if (bool == null) {
            throw Util.missingProperty("isEnabled", "is_enabled", jsonReader);
        }
        boolean booleanValue = bool.booleanValue();
        if (name == null) {
            throw Util.missingProperty("name", "name", jsonReader);
        }
        if (phone == null) {
            throw Util.missingProperty("phone", "phone", jsonReader);
        }
        if (normalization == null) {
            throw Util.missingProperty("normalization", "normalization", jsonReader);
        }
        if (num2 != null) {
            return new TransfersContactsFuzzySearchConfig(booleanValue, name, phone, normalization, num2.intValue());
        }
        throw Util.missingProperty("swapCost", "swap_cost", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransfersContactsFuzzySearchConfig transfersContactsFuzzySearchConfig) {
        TransfersContactsFuzzySearchConfig transfersContactsFuzzySearchConfig2 = transfersContactsFuzzySearchConfig;
        if (transfersContactsFuzzySearchConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("is_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(transfersContactsFuzzySearchConfig2.isEnabled()));
        jsonWriter.name("name");
        this.nameAdapter.toJson(jsonWriter, (JsonWriter) transfersContactsFuzzySearchConfig2.getName());
        jsonWriter.name("phone");
        this.phoneAdapter.toJson(jsonWriter, (JsonWriter) transfersContactsFuzzySearchConfig2.getPhone());
        jsonWriter.name("normalization");
        this.normalizationAdapter.toJson(jsonWriter, (JsonWriter) transfersContactsFuzzySearchConfig2.getNormalization());
        jsonWriter.name("swap_cost");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(transfersContactsFuzzySearchConfig2.getSwapCost()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(56, "GeneratedJsonAdapter(TransfersContactsFuzzySearchConfig)");
    }
}
