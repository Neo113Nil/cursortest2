package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.ybsdk.core.common.data.network.dto.Snackbar;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/SnackbarsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/Snackbars;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/Snackbar;", "nullableSnackbarAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SnackbarsJsonAdapter extends JsonAdapter<Snackbars> {
    private final JsonAdapter<Snackbar> nullableSnackbarAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("error_2fa");

    public SnackbarsJsonAdapter(Moshi moshi) {
        this.nullableSnackbarAdapter = moshi.adapter(Snackbar.class, EmptySet.a, "error2fa");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Snackbars fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Snackbar snackbar = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                snackbar = this.nullableSnackbarAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new Snackbars(snackbar);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Snackbars snackbars) {
        Snackbars snackbars2 = snackbars;
        if (snackbars2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("error_2fa");
        this.nullableSnackbarAdapter.toJson(jsonWriter, (JsonWriter) snackbars2.getError2fa());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(31, "GeneratedJsonAdapter(Snackbars)");
    }
}
