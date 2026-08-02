package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmRequest;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmRequest_BaseFiltersJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmRequest$BaseFilters;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "", "nullableSetOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmRequest$PfmDate;", "nullablePfmDateAdapter", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmRequest_BaseFiltersJsonAdapter extends JsonAdapter<PfmRequest.BaseFilters> {
    private final JsonAdapter<PfmRequest.PfmDate> nullablePfmDateAdapter;
    private final JsonAdapter<Set<String>> nullableSetOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("filters", MetaDataField.DATE_FIELD);

    public PfmRequest_BaseFiltersJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(Set.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.nullableSetOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "filters");
        this.nullablePfmDateAdapter = moshi.adapter(PfmRequest.PfmDate.class, emptySet, MetaDataField.DATE_FIELD);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PfmRequest.BaseFilters fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Set<String> set = null;
        PfmRequest.PfmDate pfmDate = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                set = this.nullableSetOfStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                pfmDate = this.nullablePfmDateAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new PfmRequest.BaseFilters(set, pfmDate);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PfmRequest.BaseFilters baseFilters) {
        PfmRequest.BaseFilters baseFilters2 = baseFilters;
        if (baseFilters2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("filters");
        this.nullableSetOfStringAdapter.toJson(jsonWriter, (JsonWriter) baseFilters2.getFilters());
        jsonWriter.name(MetaDataField.DATE_FIELD);
        this.nullablePfmDateAdapter.toJson(jsonWriter, (JsonWriter) baseFilters2.getDate());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(PfmRequest.BaseFilters)");
    }
}
