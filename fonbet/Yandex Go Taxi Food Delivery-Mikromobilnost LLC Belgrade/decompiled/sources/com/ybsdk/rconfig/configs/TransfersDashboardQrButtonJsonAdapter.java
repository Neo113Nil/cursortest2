package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.rconfig.model.ThemedImage;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/rconfig/configs/TransfersDashboardQrButtonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/TransfersDashboardQrButton;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/rconfig/configs/TransfersDashboardTopButtonsType;", "nullableTransfersDashboardTopButtonsTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/model/ThemedImage;", "nullableThemedImageAdapter", "", "stringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransfersDashboardQrButtonJsonAdapter extends JsonAdapter<TransfersDashboardQrButton> {
    private final JsonAdapter<ThemedImage> nullableThemedImageAdapter;
    private final JsonAdapter<TransfersDashboardTopButtonsType> nullableTransfersDashboardTopButtonsTypeAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("type", "image", "text", "action");
    private final JsonAdapter<String> stringAdapter;

    public TransfersDashboardQrButtonJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableTransfersDashboardTopButtonsTypeAdapter = moshi.adapter(TransfersDashboardTopButtonsType.class, emptySet, "type");
        this.nullableThemedImageAdapter = moshi.adapter(ThemedImage.class, emptySet, "image");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "text");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransfersDashboardQrButton fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        TransfersDashboardTopButtonsType transfersDashboardTopButtonsType = null;
        ThemedImage themedImage = null;
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                transfersDashboardTopButtonsType = this.nullableTransfersDashboardTopButtonsTypeAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                themedImage = this.nullableThemedImageAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("text", "text", jsonReader);
                }
            } else if (selectName == 3 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("action", "action", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("text", "text", jsonReader);
        }
        if (str2 != null) {
            return new TransfersDashboardQrButton(transfersDashboardTopButtonsType, themedImage, str, str2);
        }
        throw Util.missingProperty("action", "action", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransfersDashboardQrButton transfersDashboardQrButton) {
        TransfersDashboardQrButton transfersDashboardQrButton2 = transfersDashboardQrButton;
        if (transfersDashboardQrButton2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.nullableTransfersDashboardTopButtonsTypeAdapter.toJson(jsonWriter, (JsonWriter) transfersDashboardQrButton2.getType());
        jsonWriter.name("image");
        this.nullableThemedImageAdapter.toJson(jsonWriter, (JsonWriter) transfersDashboardQrButton2.getImage());
        jsonWriter.name("text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transfersDashboardQrButton2.getText());
        jsonWriter.name("action");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transfersDashboardQrButton2.getAction());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(TransfersDashboardQrButton)");
    }
}
