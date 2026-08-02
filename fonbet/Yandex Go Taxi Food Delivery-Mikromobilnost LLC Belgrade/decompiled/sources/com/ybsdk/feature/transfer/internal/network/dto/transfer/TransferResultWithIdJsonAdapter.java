package com.ybsdk.feature.transfer.internal.network.dto.transfer;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.autotopup.api.dto.AutoTopupWidgetDto;
import com.ybsdk.feature.transfer.internal.network.dto.transfer.TransferResultWithId;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/TransferResultWithIdJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/TransferResultWithId;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/TransferResultWithId$Status;", "statusAdapter", "", "Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto;", "nullableListOfAutoTopupWidgetDtoAdapter", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferResultWithIdJsonAdapter extends JsonAdapter<TransferResultWithId> {
    private final JsonAdapter<List<AutoTopupWidgetDto>> nullableListOfAutoTopupWidgetDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("transfer_id", ACSPConstants.STATUS, Constants.KEY_MESSAGE, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "widgets");
    private final JsonAdapter<TransferResultWithId.Status> statusAdapter;
    private final JsonAdapter<String> stringAdapter;

    public TransferResultWithIdJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "transferId");
        this.statusAdapter = moshi.adapter(TransferResultWithId.Status.class, emptySet, ACSPConstants.STATUS);
        this.nullableListOfAutoTopupWidgetDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, AutoTopupWidgetDto.class), emptySet, "widgets");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransferResultWithId fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        TransferResultWithId.Status status = null;
        String str2 = null;
        String str3 = null;
        List<AutoTopupWidgetDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("transferId", "transfer_id", jsonReader);
                }
            } else if (selectName == 1) {
                status = this.statusAdapter.fromJson(jsonReader);
                if (status == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 2) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull(Constants.KEY_MESSAGE, Constants.KEY_MESSAGE, jsonReader);
                }
            } else if (selectName == 3) {
                str3 = this.stringAdapter.fromJson(jsonReader);
                if (str3 == null) {
                    throw Util.unexpectedNull(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                }
            } else if (selectName == 4) {
                list = this.nullableListOfAutoTopupWidgetDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("transferId", "transfer_id", jsonReader);
        }
        if (status == null) {
            throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty(Constants.KEY_MESSAGE, Constants.KEY_MESSAGE, jsonReader);
        }
        if (str3 != null) {
            return new TransferResultWithId(str, status, str2, str3, list);
        }
        throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransferResultWithId transferResultWithId) {
        TransferResultWithId transferResultWithId2 = transferResultWithId;
        if (transferResultWithId2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("transfer_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transferResultWithId2.getTransferId());
        jsonWriter.name(ACSPConstants.STATUS);
        this.statusAdapter.toJson(jsonWriter, (JsonWriter) transferResultWithId2.getStatus());
        jsonWriter.name(Constants.KEY_MESSAGE);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transferResultWithId2.getMessage());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transferResultWithId2.getDescription());
        jsonWriter.name("widgets");
        this.nullableListOfAutoTopupWidgetDtoAdapter.toJson(jsonWriter, (JsonWriter) transferResultWithId2.getWidgets());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(TransferResultWithId)");
    }
}
