package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/rconfig/configs/TransfersDashboardFeatureShutterSizesConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/TransfersDashboardFeatureShutterSizesConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "doubleAdapter", "", "floatAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransfersDashboardFeatureShutterSizesConfigJsonAdapter extends JsonAdapter<TransfersDashboardFeatureShutterSizesConfig> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonAdapter<Float> floatAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("is_enabled", "collapsed_ratio", "half_ratio", "expanded_state_enabled", "collapsed_state_enabled");

    public TransfersDashboardFeatureShutterSizesConfigJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "isEnabled");
        this.doubleAdapter = moshi.adapter(Double.TYPE, emptySet, "collapsedRatio");
        this.floatAdapter = moshi.adapter(Float.TYPE, emptySet, "halfRatio");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransfersDashboardFeatureShutterSizesConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        Double d = null;
        Float f = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        while (true) {
            Boolean bool4 = bool;
            Double d2 = d;
            if (!jsonReader.hasNext()) {
                Float f2 = f;
                jsonReader.endObject();
                if (bool4 == null) {
                    throw Util.missingProperty("isEnabled", "is_enabled", jsonReader);
                }
                boolean booleanValue = bool4.booleanValue();
                if (d2 == null) {
                    throw Util.missingProperty("collapsedRatio", "collapsed_ratio", jsonReader);
                }
                double doubleValue = d2.doubleValue();
                if (f2 == null) {
                    throw Util.missingProperty("halfRatio", "half_ratio", jsonReader);
                }
                float floatValue = f2.floatValue();
                if (bool2 == null) {
                    throw Util.missingProperty("expandedStateEnabled", "expanded_state_enabled", jsonReader);
                }
                boolean booleanValue2 = bool2.booleanValue();
                if (bool3 != null) {
                    return new TransfersDashboardFeatureShutterSizesConfig(booleanValue, doubleValue, floatValue, booleanValue2, bool3.booleanValue());
                }
                throw Util.missingProperty("collapsedStateEnabled", "collapsed_state_enabled", jsonReader);
            }
            int selectName = jsonReader.selectName(this.options);
            Float f3 = f;
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("isEnabled", "is_enabled", jsonReader);
                }
                d = d2;
                f = f3;
            } else if (selectName == 1) {
                d = this.doubleAdapter.fromJson(jsonReader);
                if (d == null) {
                    throw Util.unexpectedNull("collapsedRatio", "collapsed_ratio", jsonReader);
                }
                bool = bool4;
                f = f3;
            } else if (selectName == 2) {
                f = this.floatAdapter.fromJson(jsonReader);
                if (f == null) {
                    throw Util.unexpectedNull("halfRatio", "half_ratio", jsonReader);
                }
                bool = bool4;
                d = d2;
            } else if (selectName == 3) {
                bool2 = this.booleanAdapter.fromJson(jsonReader);
                if (bool2 == null) {
                    throw Util.unexpectedNull("expandedStateEnabled", "expanded_state_enabled", jsonReader);
                }
            } else if (selectName == 4 && (bool3 = this.booleanAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("collapsedStateEnabled", "collapsed_state_enabled", jsonReader);
            }
            bool = bool4;
            d = d2;
            f = f3;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransfersDashboardFeatureShutterSizesConfig transfersDashboardFeatureShutterSizesConfig) {
        TransfersDashboardFeatureShutterSizesConfig transfersDashboardFeatureShutterSizesConfig2 = transfersDashboardFeatureShutterSizesConfig;
        if (transfersDashboardFeatureShutterSizesConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("is_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(transfersDashboardFeatureShutterSizesConfig2.isEnabled()));
        jsonWriter.name("collapsed_ratio");
        this.doubleAdapter.toJson(jsonWriter, (JsonWriter) Double.valueOf(transfersDashboardFeatureShutterSizesConfig2.getCollapsedRatio()));
        jsonWriter.name("half_ratio");
        this.floatAdapter.toJson(jsonWriter, (JsonWriter) Float.valueOf(transfersDashboardFeatureShutterSizesConfig2.getHalfRatio()));
        jsonWriter.name("expanded_state_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(transfersDashboardFeatureShutterSizesConfig2.getExpandedStateEnabled()));
        jsonWriter.name("collapsed_state_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(transfersDashboardFeatureShutterSizesConfig2.getCollapsedStateEnabled()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(65, "GeneratedJsonAdapter(TransfersDashboardFeatureShutterSizesConfig)");
    }
}
