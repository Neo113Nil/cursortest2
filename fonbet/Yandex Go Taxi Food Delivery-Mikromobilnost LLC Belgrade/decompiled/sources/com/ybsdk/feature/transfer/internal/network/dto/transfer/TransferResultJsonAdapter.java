package com.ybsdk.feature.transfer.internal.network.dto.transfer;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.transfer.internal.network.dto.transfer.TransferResult;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/TransferResultJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/TransferResult;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/TransferResult$Status;", "statusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferResultJsonAdapter extends JsonAdapter<TransferResult> {
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, Constants.KEY_MESSAGE, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
    private final JsonAdapter<TransferResult.Status> statusAdapter;
    private final JsonAdapter<String> stringAdapter;

    public TransferResultJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.statusAdapter = moshi.adapter(TransferResult.Status.class, emptySet, ACSPConstants.STATUS);
        this.stringAdapter = moshi.adapter(String.class, emptySet, Constants.KEY_MESSAGE);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransferResult fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        TransferResult.Status status = null;
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                status = this.statusAdapter.fromJson(jsonReader);
                if (status == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull(Constants.KEY_MESSAGE, Constants.KEY_MESSAGE, jsonReader);
                }
            } else if (selectName == 2 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
            }
        }
        jsonReader.endObject();
        if (status == null) {
            throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty(Constants.KEY_MESSAGE, Constants.KEY_MESSAGE, jsonReader);
        }
        if (str2 != null) {
            return new TransferResult(status, str, str2);
        }
        throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransferResult transferResult) {
        TransferResult transferResult2 = transferResult;
        if (transferResult2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.statusAdapter.toJson(jsonWriter, (JsonWriter) transferResult2.getStatus());
        jsonWriter.name(Constants.KEY_MESSAGE);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transferResult2.getMessage());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transferResult2.getDescription());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(36, "GeneratedJsonAdapter(TransferResult)");
    }
}
