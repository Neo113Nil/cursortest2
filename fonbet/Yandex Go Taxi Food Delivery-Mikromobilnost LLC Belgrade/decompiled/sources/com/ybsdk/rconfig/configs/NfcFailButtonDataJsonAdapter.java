package com.ybsdk.rconfig.configs;

import com.adjust.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcFailButtonDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/NfcFailButtonData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/rconfig/configs/NfcFailAction;", "nfcFailActionAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "", "nullableBooleanAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NfcFailButtonDataJsonAdapter extends JsonAdapter<NfcFailButtonData> {
    private final JsonAdapter<NfcFailAction> nfcFailActionAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("action", "title", Constants.DEEPLINK, "deeplink_new", "wipe_data");

    public NfcFailButtonDataJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nfcFailActionAdapter = moshi.adapter(NfcFailAction.class, emptySet, "action");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "wipeData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NfcFailButtonData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        NfcFailAction nfcFailAction = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                nfcFailAction = this.nfcFailActionAdapter.fromJson(jsonReader);
                if (nfcFailAction == null) {
                    throw Util.unexpectedNull("action", "action", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (nfcFailAction != null) {
            return new NfcFailButtonData(nfcFailAction, str, str2, str3, bool);
        }
        throw Util.missingProperty("action", "action", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NfcFailButtonData nfcFailButtonData) {
        NfcFailButtonData nfcFailButtonData2 = nfcFailButtonData;
        if (nfcFailButtonData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("action");
        this.nfcFailActionAdapter.toJson(jsonWriter, (JsonWriter) nfcFailButtonData2.getAction());
        jsonWriter.name("title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) nfcFailButtonData2.getTitle());
        jsonWriter.name(Constants.DEEPLINK);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) nfcFailButtonData2.getDeeplinkOld());
        jsonWriter.name("deeplink_new");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) nfcFailButtonData2.getDeeplinkNew());
        jsonWriter.name("wipe_data");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) nfcFailButtonData2.getWipeData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(NfcFailButtonData)");
    }
}
