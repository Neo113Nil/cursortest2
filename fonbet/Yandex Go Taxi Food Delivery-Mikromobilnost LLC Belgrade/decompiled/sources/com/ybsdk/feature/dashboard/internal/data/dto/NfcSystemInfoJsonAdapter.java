package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/NfcSystemInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/NfcSystemInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NfcSystemInfoJsonAdapter extends JsonAdapter<NfcSystemInfo> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("is_nfc_adapter_enabled", "is_biometry_enabled", "is_default_payment_app", "is_draw_overlay_enabled", "is_nfc_shortcut_added");

    public NfcSystemInfoJsonAdapter(Moshi moshi) {
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, EmptySet.a, "isNfcAdapterEnabled");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NfcSystemInfo fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        while (true) {
            Boolean bool6 = bool;
            Boolean bool7 = bool2;
            if (!jsonReader.hasNext()) {
                Boolean bool8 = bool3;
                jsonReader.endObject();
                if (bool6 == null) {
                    throw Util.missingProperty("isNfcAdapterEnabled", "is_nfc_adapter_enabled", jsonReader);
                }
                boolean booleanValue = bool6.booleanValue();
                if (bool7 == null) {
                    throw Util.missingProperty("isBiometryEnabled", "is_biometry_enabled", jsonReader);
                }
                boolean booleanValue2 = bool7.booleanValue();
                if (bool8 == null) {
                    throw Util.missingProperty("isDefaultPaymentApp", "is_default_payment_app", jsonReader);
                }
                boolean booleanValue3 = bool8.booleanValue();
                if (bool4 == null) {
                    throw Util.missingProperty("isDrawOverlayEnabled", "is_draw_overlay_enabled", jsonReader);
                }
                boolean booleanValue4 = bool4.booleanValue();
                if (bool5 != null) {
                    return new NfcSystemInfo(booleanValue, booleanValue2, booleanValue3, booleanValue4, bool5.booleanValue());
                }
                throw Util.missingProperty("isNfcShortcutAdded", "is_nfc_shortcut_added", jsonReader);
            }
            int selectName = jsonReader.selectName(this.options);
            Boolean bool9 = bool3;
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("isNfcAdapterEnabled", "is_nfc_adapter_enabled", jsonReader);
                }
                bool2 = bool7;
                bool3 = bool9;
            } else if (selectName == 1) {
                bool2 = this.booleanAdapter.fromJson(jsonReader);
                if (bool2 == null) {
                    throw Util.unexpectedNull("isBiometryEnabled", "is_biometry_enabled", jsonReader);
                }
                bool = bool6;
                bool3 = bool9;
            } else if (selectName == 2) {
                bool3 = this.booleanAdapter.fromJson(jsonReader);
                if (bool3 == null) {
                    throw Util.unexpectedNull("isDefaultPaymentApp", "is_default_payment_app", jsonReader);
                }
                bool = bool6;
                bool2 = bool7;
            } else if (selectName == 3) {
                bool4 = this.booleanAdapter.fromJson(jsonReader);
                if (bool4 == null) {
                    throw Util.unexpectedNull("isDrawOverlayEnabled", "is_draw_overlay_enabled", jsonReader);
                }
            } else if (selectName == 4 && (bool5 = this.booleanAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("isNfcShortcutAdded", "is_nfc_shortcut_added", jsonReader);
            }
            bool = bool6;
            bool2 = bool7;
            bool3 = bool9;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NfcSystemInfo nfcSystemInfo) {
        NfcSystemInfo nfcSystemInfo2 = nfcSystemInfo;
        if (nfcSystemInfo2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("is_nfc_adapter_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(nfcSystemInfo2.isNfcAdapterEnabled()));
        jsonWriter.name("is_biometry_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(nfcSystemInfo2.isBiometryEnabled()));
        jsonWriter.name("is_default_payment_app");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(nfcSystemInfo2.isDefaultPaymentApp()));
        jsonWriter.name("is_draw_overlay_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(nfcSystemInfo2.isDrawOverlayEnabled()));
        jsonWriter.name("is_nfc_shortcut_added");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(nfcSystemInfo2.isNfcShortcutAdded()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(NfcSystemInfo)");
    }
}
