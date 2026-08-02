package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import defpackage.gcb0;
import defpackage.hcb0;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse_FilterJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$Filter;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterMode;", "filterModeAdapter", "Lgcb0;", "filterContentAdapter", "Lhcb0;", "filterInnerContentAdapter", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmResponse_FilterJsonAdapter extends JsonAdapter<PfmResponse.Filter> {
    private final JsonAdapter<gcb0> filterContentAdapter;
    private final JsonAdapter<hcb0> filterInnerContentAdapter;
    private final JsonAdapter<PfmResponse.FilterMode> filterModeAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("log_id", "filter_mode", "filter_content", "inner_content");
    private final JsonAdapter<String> stringAdapter;

    public PfmResponse_FilterJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "logId");
        this.filterModeAdapter = moshi.adapter(PfmResponse.FilterMode.class, emptySet, "filterMode");
        this.filterContentAdapter = moshi.adapter(gcb0.class, emptySet, "filterContent");
        this.filterInnerContentAdapter = moshi.adapter(hcb0.class, emptySet, "innerContent");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PfmResponse.Filter fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        PfmResponse.FilterMode filterMode = null;
        gcb0 gcb0Var = null;
        hcb0 hcb0Var = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("logId", "log_id", jsonReader);
                }
            } else if (selectName == 1) {
                filterMode = this.filterModeAdapter.fromJson(jsonReader);
                if (filterMode == null) {
                    throw Util.unexpectedNull("filterMode", "filter_mode", jsonReader);
                }
            } else if (selectName == 2) {
                gcb0Var = this.filterContentAdapter.fromJson(jsonReader);
                if (gcb0Var == null) {
                    throw Util.unexpectedNull("filterContent", "filter_content", jsonReader);
                }
            } else if (selectName == 3 && (hcb0Var = this.filterInnerContentAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("innerContent", "inner_content", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("logId", "log_id", jsonReader);
        }
        if (filterMode == null) {
            throw Util.missingProperty("filterMode", "filter_mode", jsonReader);
        }
        if (gcb0Var == null) {
            throw Util.missingProperty("filterContent", "filter_content", jsonReader);
        }
        if (hcb0Var != null) {
            return new PfmResponse.Filter(str, filterMode, gcb0Var, hcb0Var);
        }
        throw Util.missingProperty("innerContent", "inner_content", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PfmResponse.Filter filter) {
        PfmResponse.Filter filter2 = filter;
        if (filter2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("log_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) filter2.getLogId());
        jsonWriter.name("filter_mode");
        this.filterModeAdapter.toJson(jsonWriter, (JsonWriter) filter2.getFilterMode());
        jsonWriter.name("filter_content");
        this.filterContentAdapter.toJson(jsonWriter, (JsonWriter) filter2.getFilterContent());
        jsonWriter.name("inner_content");
        this.filterInnerContentAdapter.toJson(jsonWriter, (JsonWriter) filter2.getInnerContent());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(PfmResponse.Filter)");
    }
}
